package com.sk.testhilt

import android.os.Bundle
import androidx.annotation.LayoutRes
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import com.sk.testhilt.databinding.ActivityDetailBinding

/**
 * Created by jeongjaehwan on 2020/09/24
 **/

open class BaseActivity : AppCompatActivity() {

    protected inline fun <reified T : ViewDataBinding> binding(@LayoutRes resId: Int) : Lazy<T> =
        lazy { DataBindingUtil.setContentView<T>(this, resId) }
}


class DetailActivity : BaseActivity() {

    private val binding by binding<ActivityDetailBinding>(R.layout.activity_detail)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }
}