package com.example.cosplayplanner.models

import io.realm.RealmObject
import io.realm.annotations.PrimaryKey
import org.bson.types.ObjectId

open class Series: RealmObject() {
    @PrimaryKey
    var _id: ObjectId = ObjectId()
}
