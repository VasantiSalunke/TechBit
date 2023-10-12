package com.techbit.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.techbit.model.ArticleDetails
import com.techbit.repo.ArticleDetailsRepo
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class ArticleDetailsViewModel(
    private val articleDetailsRepo :ArticleDetailsRepo
) : ViewModel() {

    val articleDetailsLiveData = MutableLiveData<ArrayList<ArticleDetails>>()


  //  val articleDetailsLiveData = MutableLiveData<List<ArticleDetails>>()



    fun getArticleDetails() {

        CoroutineScope(Dispatchers.IO).launch {
            val articleDetails = articleDetailsRepo.getArticleDetails()

            withContext(Dispatchers.Main){
                articleDetailsLiveData.postValue(articleDetails)
            }
        }
    }

}
