package com.techbit.repo

import com.techbit.model.ArticleDetails
import com.techbit.network.ArticleDetailServices

class ArticleDetailsRepo(
   // val articleDetailServices: ArticleDetailServices
) : Repo{
    suspend fun getArticleDetails() : ArrayList<ArticleDetails>{

        val articleDetails = ArrayList<ArticleDetails>()

        articleDetails.add(ArticleDetails("Hello all, I am persuing my android development course in Bitcode Technology. Hello all, I am persuing my android development course in Bitcode Technology Hello all, I am persuing my android development course in Bitcode Technology Hello all, I am persuing my android development course in Bitcode Technology","Technology", "Android"))
        articleDetails.add(ArticleDetails("Hello all, I am persuing my android development course in Bitcode Technology. Hello all, I am persuing my android development course in Bitcode Technology Hello all, I am persuing my android development course in Bitcode Technology Hello all, I am persuing my android development course in Bitcode Technology","Technology", "Android"))
        articleDetails.add(ArticleDetails("Hello all, I am persuing my android development course in Bitcode Technology. Hello all, I am persuing my android development course in Bitcode Technology Hello all, I am persuing my android development course in Bitcode Technology Hello all, I am persuing my android development course in Bitcode Technology","Technology", "Android"))
        articleDetails.add(ArticleDetails("Hello all, I am persuing my android development course in Bitcode Technology. Hello all, I am persuing my android development course in Bitcode Technology Hello all, I am persuing my android development course in Bitcode Technology Hello all, I am persuing my android development course in Bitcode Technology","Technology", "Android"))

        return articleDetails
    }
}