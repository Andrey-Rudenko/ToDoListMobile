package ru.andreyrudenko.todolist.db.repository

import androidx.lifecycle.LiveData
import ru.andreyrudenko.todolist.db.dao.NoteDao
import ru.andreyrudenko.todolist.model.NoteModel


class NoteRealisation(private val noteDao: NoteDao) : NoteRepository {
    override val allNotes: LiveData<List<NoteModel>> = noteDao.getAllNotes()

    override suspend fun insertNote(noteModel: NoteModel, onSuccess: () -> Unit) {
        noteDao.insert(noteModel)
        onSuccess()
    }

    override suspend fun deleteNote(noteModel: NoteModel, onSuccess: () -> Unit) {
        noteDao.delete(noteModel)
        onSuccess()
    }

}