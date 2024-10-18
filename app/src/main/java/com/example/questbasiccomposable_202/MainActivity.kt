package com.example.questbasiccomposable_202

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.questbasiccomposable_202.ui.theme.QuestBasicComposable_202Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            QuestBasicComposable_202Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    BasicComposable(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}
@Composable
fun BasicComposable(modifier: Modifier = Modifier) {
    Column(horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top,
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp)
    ) {
        Text("Login",  fontSize = 50.sp,
            fontWeight = FontWeight.Bold)
        Spacer(modifier = Modifier.padding(10.dp))
        Text("Ini Adalah Halaman Login",
            fontSize = 20.sp,
            fontStyle = FontStyle.Italic)
        Spacer(modifier = Modifier.padding(10.dp))
        Image(
            painter = painterResource (id = R.drawable.logo),
            contentDescription = "UMY",
            modifier = Modifier
                .clip(CircleShape)
                .size(200.dp)

        )
        Spacer(modifier = Modifier.padding(10.dp))
        Text("Nama :", fontSize = 20.sp,
            fontStyle = FontStyle.Italic)
        Spacer(modifier = Modifier.padding(5.dp))
        Text("Muhammad Agus Kurniawan",
            fontSize = 20.sp,
            fontStyle = FontStyle.Italic,
            color = Color.Blue)

    }

}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    QuestBasicComposable_202Theme {
      //  Greeting("Android")
    BasicComposable()
    }
}