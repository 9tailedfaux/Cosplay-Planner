package com.example.cosplayplanner.models

import io.realm.RealmObject
import io.realm.annotations.PrimaryKey
import io.realm.annotations.Required
import org.bson.types.ObjectId

class Character(_se: Series, _na: String): RealmObject() {
    @PrimaryKey
    var _id: ObjectId = ObjectId()
    @Required
    var series: Series = _se
    @Required
    var name: String = _na

}