package com.example.slicingvans.screen

import android.speech.tts.TextToSpeech
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.slicingvans.R
import com.example.slicingvans.component.ImageComponent
import com.example.slicingvans.component.TextComponent

@Composable
fun Sepatu(){
    Box(
        modifier = Modifier
            .fillMaxHeight()
            .fillMaxWidth()
    ){
        Image(painter = painterResource(id = R.drawable.background),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight())
    }
    Column (modifier = Modifier
        .padding(20.dp)
        .fillMaxWidth()
        .clip(RoundedCornerShape(10.dp))
        .size(250.dp),
//        .align(Alignment.BottomCenter)
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        ImageComponent(img = R.drawable.vans, modifier = Modifier.align(Alignment.CenterHorizontally))
        Spacer(modifier = Modifier.height(20.dp))
        TextComponent(text = stringResource(id = R.string.title),
            color = Color.Black,
            fontWeight = FontWeight.SemiBold,
            fontSize = 15.sp)
        Spacer(modifier = Modifier.height(15.dp))
        TextComponent(text = stringResource(id = R.string.olshopVans),
            color = Color.Gray,
            fontWeight = FontWeight.SemiBold,
            fontSize = 18.sp)

        Spacer(modifier = Modifier.height(15.dp))
        TextComponent(text = stringResource(id = R.string.size),
            color = Color.Black,
            fontWeight = FontWeight.W400,
            fontSize = 18.sp)
    }
}