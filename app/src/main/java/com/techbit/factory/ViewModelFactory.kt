package com.techbit.factory

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.techbit.repo.ArticleDetailsRepo
import com.techbit.repo.Repo
import com.techbit.viewmodel.ArticleDetailsViewModel

class ViewModelFactory(
   val  repo: Repo
) : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(ArticleDetailsViewModel::class.java) && repo is ArticleDetailsRepo){
            return ArticleDetailsViewModel(repo) as T
    }

    throw java.lang.Error("Unable to create view model")

    }

    }



