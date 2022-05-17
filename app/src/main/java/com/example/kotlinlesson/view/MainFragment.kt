package com.example.kotlinlesson.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.kotlinlesson.R
import com.example.kotlinlesson.databinding.FragmentMainBinding


class MainFragment : Fragment() {

    var _binding: FragmentMainBinding? = null // промежуточный байндинг , который налл
    private val binding: FragmentMainBinding // нет значения , ссылка для этой ссылки прописан геттер и вернет она промежуточный байндинг может вернуть налл
        get() {
            return _binding!! //указали что не налл (!!)
        }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        //если к байндингу обратить здесь binding.tv null pointerExc
        _binding = FragmentMainBinding.inflate(inflater, container, false)

        return binding.root // обращаемся к нему без указания, что не налл , так как в геттер вернет не налл

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