package com.example.kotlinhomework.dataclass

import com.example.kotlinhomework.dataclass.Language

data class Teacher(
    val name: String,
    val age: Int,
    val progExperience: Int,
    val languages: List<Language>
)
