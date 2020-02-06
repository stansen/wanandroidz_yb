//package com.onlion.wanandroid.data
//
//import kotlinx.coroutines.CoroutineDispatcher
//import kotlinx.coroutines.Dispatchers
//import kotlinx.coroutines.withContext
//
//abstract class CoroutineInteractor<P,R> (
//    private val dispatcher:CoroutineDispatcher= Dispatchers.IO
//){
//suspend fun excute(param:P):Result<R>{
//       return withContext(dispatcher){
//           action(param)
//       }
//    }
//
//    protected abstract suspend fun action(param: P):Result<R>
//}