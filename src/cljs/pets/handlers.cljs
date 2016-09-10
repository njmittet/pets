(ns pets.handlers
    (:require [re-frame.core :as re-frame]
              [pets.db :as db]))

(re-frame/reg-event-db
 :initialize-db
 (fn  [_ _]
   db/default-db))
