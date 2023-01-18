package ru.andreyrudenko.todolist.screens.start

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import ru.andreyrudenko.todolist.REPOSITORY
import ru.andreyrudenko.todolist.db.NoteDatabase
import ru.andreyrudenko.todolist.db.repository.NoteRealisation
import ru.andreyrudenko.todolist.model.NoteModel

class StartViewModel(application: Application) : AndroidViewModel(application) {
    val context = application

    fun initDatabase() {
        val daoNote = NoteDatabase.getInstance(context).getNoteDao()
        REPOSITORY = NoteRealisation(daoNote)
    }
    fun getAllNotes(): LiveData<List<NoteModel>> {
        return REPOSITORY.allNotes
    }
}