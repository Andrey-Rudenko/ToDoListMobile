package ru.andreyrudenko.todolist.screens.addNote

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import ru.andreyrudenko.todolist.APP
import ru.andreyrudenko.todolist.R
import ru.andreyrudenko.todolist.databinding.FragmentAddNoteBinding
import ru.andreyrudenko.todolist.model.NoteModel


class AddNoteFragment : Fragment() {
    lateinit var binding: FragmentAddNoteBinding

    override fun onCreateView(

        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        println(object : Any(){}.javaClass.enclosingMethod?.name  + " AddNoteFragment")
        binding = FragmentAddNoteBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        println(object : Any(){}.javaClass.enclosingMethod?.name  + " AddNoteFragment")
        super.onViewCreated(view, savedInstanceState)
        init()
    }
    private fun init() {
        val viewModel = ViewModelProvider(this).get(AddNoteViewModel::class.java)
        binding.btnAddNote.setOnClickListener {
            val title = binding.etAddTitle.text.toString()
            val description = binding.etAddDesc.text.toString()
            if (title.replace("\\s".toRegex(), "").isNotEmpty()) {
                viewModel.insert(NoteModel(title = title, description = description)){}
                APP.navController.navigate(R.id.action_addNoteFragment_to_startFragment)
            }
        }
        //переход на фрагмент startFragment
        binding.btnBack.setOnClickListener {
            APP.navController.navigate(R.id.action_addNoteFragment_to_startFragment)
        }

    }

    override fun onAttach(context: Context) {
        println(object : Any(){}.javaClass.enclosingMethod?.name  + " AddNoteFragment")
        super.onAttach(context)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        println(object : Any(){}.javaClass.enclosingMethod?.name  + " AddNoteFragment")
        super.onCreate(savedInstanceState)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        println(object : Any(){}.javaClass.enclosingMethod?.name  + " AddNoteFragment")
        super.onActivityCreated(savedInstanceState)
    }

    override fun onStart() {
        println(object : Any(){}.javaClass.enclosingMethod?.name  + " AddNoteFragment")
        super.onStart()
    }

    override fun onResume() {
        println(object : Any(){}.javaClass.enclosingMethod?.name  + " AddNoteFragment")
        super.onResume()
    }

    override fun onPause() {
        println(object : Any(){}.javaClass.enclosingMethod?.name  + " AddNoteFragment")
        super.onPause()
    }

    override fun onStop() {
        println(object : Any(){}.javaClass.enclosingMethod?.name  + " AddNoteFragment")
        super.onStop()
    }

    override fun onDestroyView() {
        println(object : Any(){}.javaClass.enclosingMethod?.name  + " AddNoteFragment")
        super.onDestroyView()
    }

    override fun onDestroy() {
        println(object : Any(){}.javaClass.enclosingMethod?.name  + " AddNoteFragment")
        super.onDestroy()
    }

    override fun onDetach() {
        println(object : Any(){}.javaClass.enclosingMethod?.name  + " AddNoteFragment")
        super.onDetach()
    }
}