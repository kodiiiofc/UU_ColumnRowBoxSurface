package com.kodiiiofc.urbanuniversity.jetpackcompose.columnrowboxsurface

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column(
                modifier = Modifier.fillMaxWidth().padding(8.dp),
                verticalArrangement = Arrangement.Top,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                TableTitle("Данные по персоналу")
                TableHeader("Имя", "Зарплата", "Телефон")
                Person.personList.forEach {
                    TableRow(it.name, it.salary, it.phone)
                }
            }
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun App() {
    Column(
        modifier = Modifier.fillMaxWidth().padding(8.dp),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        TableTitle("Данные по персоналу")
        TableHeader("Имя", "Зарплата", "Телефон")
        Person.personList.forEach {
            TableRow(it.name, it.salary, it.phone)
        }
    }
}

@Composable
fun TableTitle(text: String) {
    Surface(
        color = Color.DarkGray,
        border = BorderStroke(1.dp, Color.Black),
        modifier = Modifier.fillMaxWidth()
    ) { Text(
        text = text,
        color = Color.White,
        textAlign = TextAlign.Center,
        fontSize = 24.sp,
        modifier = Modifier.fillMaxWidth().padding(12.dp),
    ) }
}

@Composable
fun TableHeader(vararg headers: Any) {
    Surface(
        color = Color.LightGray,
        border = BorderStroke(1.dp, Color.Black)
    ) {
        Row(
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.fillMaxWidth().padding(4.dp)
        ) {
            for (header in headers) {
                Ceil(header.toString())
            }
        }
    }
}

@Composable
fun TableRow(vararg values: Any) {
    Surface(
        color = Color.White,
        border = BorderStroke(1.dp, Color.Black)
    ) {
        Row(
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.fillMaxWidth().padding(4.dp)
        ) {
            for (value in values) {
                Ceil(value.toString())
            }
        }
    }
}

@Composable
fun Ceil(text: String) {
    Text(text = text,
        fontSize = 18.sp,
        color = Color.Black)
}
