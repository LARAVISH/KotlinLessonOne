package com.example.kotlinlesson.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.get
import com.example.kotlinlesson.R
import com.example.kotlinlesson.databinding.FragmentMainBinding
import com.example.kotlinlesson.model.MainViewModel


class MainFragment : Fragment() {


    var _binding: FragmentMainBinding? = null // промежуточный байндинг , который налл
    private val binding: FragmentMainBinding // нет значения , ссылка для этой ссылки прописан геттер и вернет она промежуточный байндинг может вернуть налл
        get() {
            return _binding!! //указали что не налл (!!)
        }
    private lateinit var viewModel : MainViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        //если к байндингу обратить здесь binding.tv null pointerExc
        _binding = FragmentMainBinding.inflate(inflater, container, false)

        return binding.root // обращаемся к нему без указания, что не налл , так как в геттер вернет не налл

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this).get(MainViewModel :: class.java)
        viewModel.getLiveData().observe(viewLifecycleOwner,Observer<Any>{
           renderData(it)
       viewModel.getWeatherFromServer()
        })
    }
    fun renderData(data: Any){
        Toast.makeText(requireContext(),"OK",Toast.LENGTH_LONG).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

    companion object {

        @JvmStatic
        fun newInstance() = MainFragment()
    }
}