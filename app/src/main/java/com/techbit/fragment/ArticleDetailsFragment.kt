package com.techbit.fragment

import android.os.Bundle
import android.telephony.SignalThresholdInfo
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.LiveData
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.ViewModelFactoryDsl
import com.techbit.repo.ArticleDetailsRepo
import com.techbit.databinding.ArticleDetailsFragmentBinding
import com.techbit.factory.ViewModelFactory
import com.techbit.model.ArticleDetails
import com.techbit.network.ArticleDetailServices
import com.techbit.viewmodel.ArticleDetailsViewModel

class ArticleDetailsFragment : Fragment() {
    private lateinit var binding: ArticleDetailsFragmentBinding
   // private lateinit var articleDetailsFragmentBinding: ArticleDetailsFragmentBinding
    private val articleDetails = ArrayList<ArticleDetails>()
    private  lateinit var  articleDetailsViewModel: ArticleDetailsViewModel


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = ArticleDetailsFragmentBinding.inflate(inflater)


        initViewModel()
        initObserver()


        return binding.root
    }

    private fun initObserver() {
        articleDetailsViewModel = ViewModelProvider(this,).get(ArticleDetailsViewModel::class.java)
        articleDetailsViewModel.articleDetailsLiveData.observe(this, Observer{

        } )



    }


    //   LiveData<>
//        live.obs {
//            it
//            bind,
//        }


    private fun initViewModel(){
        articleDetailsViewModel = ViewModelProvider(this,
            ViewModelFactory(ArticleDetailsRepo())
        ).get(ArticleDetailsViewModel::class.java)
    }

}