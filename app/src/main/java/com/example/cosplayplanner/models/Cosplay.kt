package com.example.cosplayplanner.models

import io.realm.RealmObject
import io.realm.annotations.PrimaryKey
import io.realm.annotations.Required
import org.bson.types.ObjectId
import java.util.*

class Cosplay(_ch: Character, _iDate: Date): RealmObject(){
    @PrimaryKey
    var _id: ObjectId = ObjectId()
    @Required
    var character: Character = _ch
    @Required
    var initialDate: Date = _iDate
    var dueDate: Date? = null
    var budget: Int? = null
}