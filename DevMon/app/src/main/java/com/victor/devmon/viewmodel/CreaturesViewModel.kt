package com.victor.devmon.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.victor.devmon.model.domain.Creature
import com.victor.devmon.model.repository.CreaturesRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class CreaturesViewModel @Inject constructor(
    creaturesRepository: CreaturesRepository
): ViewModel(){
    val creatures = MutableLiveData<List<Creature>>()

    init {
        creatures.value = creaturesRepository.creatures
    }
}