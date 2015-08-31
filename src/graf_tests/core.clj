(ns graf-tests.core
  (:require [quil.core :as q]
            [quil.middleware :as m]
            [graf-tests.dynamic :as d]))

(q/defsketch graf-tests
  :title "Testing these awesome effects"
  :size [500 500]
  ; setup function called only once, during sketch initialization.
  :setup d/setup
  ; update-state is called on each iteration before draw-state.
  :update d/update-state
  :draw d/draw-state
  ; Event handlers
  :mouse-moved d/mouse-moved
  :mouse-pressed d/mouse-pressed
  :mouse-released d/mouse-released
  :mouse-clicked d/mouse-clicked
  :mouse-dragged d/mouse-dragged
  :mouse-wheel d/mouse-wheel
  :key-pressed d/key-pressed
  :key-released d/key-released
  :key-typed d/key-typed
  :features [:keep-on-top]
  ; This sketch uses functional-mode middleware.
  ; Check quil wiki for more info about middlewares and particularly
  ; fun-mode.
  :middleware [m/fun-mode])
