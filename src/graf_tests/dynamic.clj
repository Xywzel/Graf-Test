(ns graf-tests.dynamic
  (:require [quil.core :as q]))

; Set startup values and return initial state
(defn setup []
  (q/frame-rate 60)
  (q/color-mode :rbg 1.0)
  (q/smooth)
  (q/background 0.9)
  {:mode 0
   :status (effect/init)})

; Check which mode we are in, use updates in that effect
(defn update-state [state]
  (case (:mode state)
    0 (effect/update state)
    1 (effect/update state)
    state))

(defn draw-state [state]
  ; Check the mode and call correct draw function
  (case (:mode state)
    0 (effect/draw state)
    1 (effect/draw state)
    state))

(defn mouse-pressed [state event]
  (case (:mode state)
    0 (effect/mouse-pressed state event)
    state))

(defn mouse-released [state event]
  (case (:mode state)
    0 (effect/mouse-released state event)
    state))

(defn mouse-clicked [state event]
  (case (:mode state)
    0 (effect/mouse-clicked state event)
    state))

(defn mouse-dragged [state event]
  (case (:mode state)
    0 (effect/mouse-dragged state event)
    state))

(defn mouse-wheel [state event]
  (case (:mode state)
    0 (effect/mouse-wheel state event)
    state))

(defn key-pressed [state event]
  (case (:mode state)
    0 (effect/key-pressed state event)
    state))

(defn key-released [state event]
  (case (:mode state)
    0 (effect/key-pressed state event)
    state))

(defn key-typed [state event]
  (case (:mode state)
    0 (effect/key-typed state event)
    state))

(defn mouse-moved [state event]
  (case (:mode state)
    0 (effect/mouse-moved state event)
    state))



