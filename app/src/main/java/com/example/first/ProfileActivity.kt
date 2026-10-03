package com.example.first

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.annotation.DrawableRes
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddBox
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.R


class ProfileActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ProfileBody()
        }
    }
}

@Composable
fun ProfileBody() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth().padding(8.dp),
            horizontalArrangement = Arrangement.SpaceAround,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                painter = painterResource(com.example.first.R.drawable.baseline_keyboard_arrow_left_24),
                contentDescription = null
            )
            Text("rashmi2026")
            Icon(
                painter = painterResource(com.example.first.R.drawable.baseline_more_horiz_24),
                contentDescription = null
            )

        }
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement =Arrangement.SpaceAround,
            verticalAlignment = Alignment.CenterVertically) {
            Image(
                painter = painterResource(com.example.first.R.drawable.dog),
                contentDescription = null,
                modifier = Modifier
                    .clip(shape = CircleShape).height(80.dp).width(80.dp,),
                contentScale = ContentScale.Crop
            )
            Column() {
                Text("714")
                Text("posts")
            }
            Column() {
                Text("1M")
                Text("following")
            }
            Column() {
                Text("1234567")
                Text("follower")
            }

        }
        Column(modifier = Modifier.padding(start = 20.dp, top = 8.dp, end = 20.dp)) {
            Text("Username", style = TextStyle(fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Black,
                fontStyle = FontStyle.Normal))
        }


        Column(modifier = Modifier.padding(start = 20.dp, top = 8.dp,end=20.dp)) {
            Text(
                "rashmi deep bhandari",
                fontSize = 14.sp,
                fontWeight = FontWeight.Normal
            )
            Text("Artist", fontWeight = FontWeight.Light)
            Text(
                buildAnnotatedString {
                    withStyle(style = SpanStyle(color = Color.Blue)) {
                        append("@queenstudio")
                    }
                    append("[STREAM MAD QUEEN")
                }
            )
            Text(
                buildAnnotatedString {
                    withStyle(SpanStyle(color = Color.Blue)) {
                        append("ffm.to/mad_queen_cruella")
                    }
                }
            )
            Spacer(Modifier.height(8.dp))
            Text(
                buildAnnotatedString {
                    append("Followed by ")
                    withStyle(SpanStyle(fontWeight = FontWeight.Bold)) {
                        append("ellamayoreally, smads_ ")
                    }
                    append("and ")
                    withStyle(SpanStyle(fontWeight = FontWeight.Bold)) {
                        append("1 other")
                    }
                }
            )
        }

//
//        ElevatedButton(
//            modifier = Modifier.fillMaxWidth(),
//            shape = RoundedCornerShape(12.dp),
//            colors = ButtonDefaults.buttonColors(
//                containerColor = Color.Blue,
//                contentColor = Color.White
//            ),
//            border = BorderStroke(
//                width = 1.dp,
//                color = Color.Gray
//            ),
//            onClick = {},
//        ) {
//            Text("follow")
//        }

        Row(
            modifier = Modifier.fillMaxWidth()
        ) {

            ElevatedButton(
                modifier = Modifier.weight(1f).padding(start = 6.dp, end = 6.dp),
                shape = RoundedCornerShape(8.dp),
                colors = ButtonDefaults.buttonColors(
                    contentColor = Color.White,
                    containerColor = Color.Blue
                ),
                onClick = {},
            ) {
                Text("follow")
            }
            ElevatedButton(
                modifier = Modifier.weight(1f).padding(end = 6.dp),
                shape = RoundedCornerShape(8.dp),
                colors = ButtonDefaults.buttonColors(
                    contentColor = Color.Black,
                    containerColor = Color.Transparent
                ),
                onClick = {},
            ) {
                Text("Message")
            }
            ElevatedButton(
                modifier = Modifier.weight(0.5f).padding(end=6.dp),
                shape = RoundedCornerShape(8.dp),
                onClick = {},
            ) {
                Icon(
                    painter = painterResource(com.example.first.R.drawable.baseline_arrow_drop_down_24),
                    contentDescription = null
                )
            }

        }





        Row(
            modifier = Modifier.fillMaxWidth()
                .padding(vertical = 20.dp, horizontal = 10.dp),
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically
        ) {

            StoryItem(com.example.first.R.drawable.pen, label = "story1")
            StoryItem(com.example.first.R.drawable.sss, label = "story2")
            StoryItem(com.example.first.R.drawable.dog, label = "story3")
            StoryItem(com.example.first.R.drawable.ted, label = "story4")

        }
    }
}

@Composable
private fun StoryItem(@DrawableRes image: Int, label: String) {
    Column(horizontalAlignment = Alignment.CenterHorizontally)  {
        Image(
            painter = painterResource(com.example.first.R.drawable.fin),
            contentDescription = null,
            modifier = Modifier
                .clip(shape = CircleShape).height(80.dp).width(80.dp,),
            contentScale = ContentScale.Crop
        )

    }
}





@Preview(showBackground = true)
@Composable
fun ProfileBodyPreview() {
    ProfileBody()
}