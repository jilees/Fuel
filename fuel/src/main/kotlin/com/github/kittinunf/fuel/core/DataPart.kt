package com.github.kittinunf.fuel.core

import java.io.File
import java.io.InputStream

data class DataPart(
        val file: Pair<InputStream, String>,
        val name: String = file.second.split(".").getOrElse(0) { "" },
        val type: String = "")