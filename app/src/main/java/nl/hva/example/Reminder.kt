package nl.hva.example

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "reminderTable")
data class Reminder(
    @ColumnInfo(name = "reminder")
    var reminderText: String,

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    var id: Long? = null
)