package ru.protey.shetenyukda

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import ru.protey.shetenyukda.ui.theme.ShetenyukDATheme
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.unit.dp
import ru.protey.shetenyukda.domain.Note


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

            val andr = Note("Андроид", "Операционная система, которая открыта для всех")
            val kot = Note("Why I love kotlin", "Lamdas and inline functions")
            val cod = Note("I love Coding", "programming is a hobby")

            setContent {
                ScreenPrint(andr, kot, cod)
            }

    }
}

@Composable
fun DataPrint(item: Note)
{
    Column() {
        Text(item.title, fontSize = 26.sp)
        Text(item.text)
    }
}

@Composable
fun ScreenPrint(andr: Note, kotl: Note, cod: Note)
{
    Column(modifier = Modifier.padding(start = 16.dp, top = 16.dp), verticalArrangement =  Arrangement.spacedBy(16.dp)) {
        DataPrint(andr)
        DataPrint(kotl)
        DataPrint(cod)
    }
}

