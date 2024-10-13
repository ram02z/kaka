package com.github.ram02z.kaka

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class KakaViewModel : ViewModel() {
    private val _count = MutableStateFlow(0)

    val count: StateFlow<Int>
        get() = _count

    fun increment() {
        _count.value++
    }
}
