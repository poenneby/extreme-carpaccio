# Extreme Carpaccio

## Operating instructions

### Start a game via main

`$ clj -m server.core`

### Start a game via REPL

```
$ clj

> (require '[server.core :as c])
> (c/start-game)
```

### Pause and resume game
```
> (c/pause-game)
```

### Change iteration interval (ms)
```
> (c/set-interval 1000)  
```


