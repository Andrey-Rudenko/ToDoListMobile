package ru.andreyrudenko.todolist.screens.addNote

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import ru.andreyrudenko.todolist.REPOSITORY
import ru.andreyrudenko.todolist.model.NoteModel

class AddNoteViewModel : ViewModel() {
    fun insert(noteModel: NoteModel, onSuccess:() -> Unit) =
        viewModelScope.launch(Dispatchers.IO){
            REPOSITORY.insertNote(noteModel) {
                onSuccess()
            }
        }
}