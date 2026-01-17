package com.example.moviesapp

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.material3.Text // تأكد أنها material3 وليس material
import androidx.compose.material3.Icon // تأكد أنها material3 وليس material
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview
@Composable
fun SearchBar(hint: String = "") {
    Row(
        modifier = Modifier
            .padding(horizontal = 16.dp)
            .fillMaxWidth()
            .height(50.dp)
            .background(
                color = Color(0X20ffffff),
                shape = RoundedCornerShape(50.dp)
            )
            .padding(horizontal = 16.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            painter = painterResource(R.drawable.search),
            contentDescription = null,
            tint = Color.White,
            modifier = Modifier.size(24.dp)
        )

        Spacer(modifier = Modifier.width(8.dp))
        TextField(
            value = "", onValueChange = {},
            placeholder = {
                Text(hint, color = Color(0Xffdbdbdb))
            },
            colors = TextFieldDefaults.colors(
                cursorColor = Color.White,
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent,

                // استبدال containerColor بهذين السطرين:
                focusedContainerColor = Color.Transparent,
                unfocusedContainerColor = Color.Transparent,

                focusedPlaceholderColor = Color.White,
                focusedTextColor = Color.White,
                unfocusedTextColor = Color.White
            ),

            modifier = Modifier
                .weight(1f)
                .fillMaxHeight(),
            textStyle = TextStyle(color = Color.White, fontSize = 16.sp),
            shape = RoundedCornerShape(50.dp),
            singleLine = true
        )
        Spacer(modifier = Modifier.width(8.dp))
        Icon(
            painter = painterResource(R.drawable.microphone),
            contentDescription = null,
            tint = Color.White,
            modifier = Modifier.size(24.dp)
        )

    }
}