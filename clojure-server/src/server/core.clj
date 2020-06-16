(ns server.core)

(defonce game-state (atom {
                           :running false
                           :iteration 0
                           :interval 5000
                           }))

(defn pause-game []
  (swap! game-state update-in [:running] not))

(defn increment-iteration []
  (swap! game-state update-in [:iteration] inc))

(defn set-interval [interval] 
  (swap! game-state assoc :interval interval))

(defn start-game []
  (swap! game-state assoc :running true)
  (.start (Thread. (fn [] (while true (while (:running @game-state) 
    (Thread/sleep (:interval @game-state))
    (println ">>> Shopping iteration" (:iteration (increment-iteration)))))))))

(defn -main [] 
  (start-game))

