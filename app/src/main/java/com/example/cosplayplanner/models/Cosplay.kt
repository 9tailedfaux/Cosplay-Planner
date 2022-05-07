package com.example.cosplayplanner.models

import android.os.Parcelable
import io.realm.RealmObject
import io.realm.annotations.PrimaryKey
import io.realm.annotations.Required
import org.bson.types.ObjectId
import java.io.Serializable
import java.util.*

open class Cosplay(_ch: Character?, _iDate: Date?): RealmObject(), Serializable{
    constructor() : this(null, null)
    @PrimaryKey
    var _id: ObjectId = ObjectId()
    var character: Character? = _ch
    @Required
    var initialDate: Date? = _iDate
    var dueDate: Date? = null
    var budget: Int? = null
}