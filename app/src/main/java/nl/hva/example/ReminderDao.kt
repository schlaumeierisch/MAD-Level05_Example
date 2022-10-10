package nl.hva.example

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface ReminderDao {
    @Query("SELECT * FROM reminderTable")
    fun getAllReminders(): LiveData<List<Reminder>>

    @Insert
    suspend fun insertReminder(reminder: Reminder)

    @Delete
    suspend fun deleteReminder(reminder: Reminder)

    @Update
    suspend fun updateReminder(reminder: Reminder)
}