package br.senai.sp.jandira.myage

import android.os.Bundle
import android.provider.CalendarContract.Colors
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.myage.ui.theme.MyAgeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyAgeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ){
                Column {
                    Minhatela()
                    Minhatela()
                    Minhatela()
                }

                }
            }
        }
    }
}

@Composable
fun Minhatela() {
    Column {
        Text(
            text = "Vai Corinthians",
            fontSize = 32.sp,
            color = Color.Red,
            fontWeight = FontWeight.Bold,

            )
        Text(text = "Vai Corinthians")
        Row {
            Button(onClick = { }) {

                Text(text = "Corinthians")


            }
            Button(
                onClick = { },
                colors = ButtonDefaults.buttonColors
                    (containerColor = Color.Black),

                ) {

                Column {
                    Text(text = "Vai Corinthians")
                    Text(text = "Corinthians")


                }



            }


        }

    }

}

