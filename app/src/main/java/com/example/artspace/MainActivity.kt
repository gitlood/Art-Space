package com.example.artspace

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.artspace.ui.theme.ArtSpaceTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ArtSpaceTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {

                }
            }
        }
    }
}

@Composable
fun SpaceArtDisplay() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(30.dp)
    ) {
        Surface(
            modifier = Modifier
                .border(width = 2.dp, color = Color.DarkGray),
            elevation = 10.dp
        ) {
            Image(
                painter = painterResource(id = R.drawable.first),
                contentDescription = "James Web First Picture",
                modifier = Modifier
                    .padding(20.dp)
            )
        }
        Spacer(modifier = Modifier.height(20.dp))
        Surface(
            elevation = 10.dp
        ) {
            Column(
                modifier = Modifier
                    .padding(20.dp)
                    .fillMaxWidth()
            ) {
                Text(
                    text = stringResource(id = R.string.first_image),
                    fontSize = 20.sp
                )
                Text(
                    text = stringResource(id = R.string.author)
                        .plus("(")
                        .plus(
                            stringResource(id = R.string.year)
                                .plus(")")
                        ),
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Bold
                )
            }
        }
        Row(
            modifier = Modifier
                .align(
                    alignment = Alignment.CenterHorizontally
                )
                .padding(20.dp)
        ) {
            Button(onClick = { /*TODO*/ },
                modifier = Modifier.width(120.dp)) {
                Text(text = "Previous")
            }
            Spacer(modifier = Modifier.width(20.dp))
            Button(onClick = { /*TODO*/ }, modifier = Modifier.width(120.dp)) {
                Text(text = "Next")
            }
        }
    }
}

fun pictureSelector(){

}

@Preview(showBackground = true)
@Composable
fun SpaceArt() {
    ArtSpaceTheme {
        SpaceArtDisplay()
    }
}