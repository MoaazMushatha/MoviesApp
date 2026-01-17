package com.example.moviesapp

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.moviesapp.Domain.FilmItemModel
import androidx.core.graphics.toColorInt
import coil.compose.AsyncImage
import androidx.compose.ui.text.TextStyle

@RequiresApi(Build.VERSION_CODES.O)
@Composable
fun FilmItem(item: FilmItemModel, onItemClick: (FilmItemModel) -> Unit) {
    Column(
        modifier = Modifier
            .padding(4.dp)
            .width(120.dp)
            .clickable { onItemClick(item) }
            .background(color = Color("#2f2f39".toColorInt()))
    ) {
        AsyncImage(
            model = item.Poster,
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(width = 120.dp, height = 180.dp)
                .background(Color.Gray)
        )

        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = item.Title,
            modifier = Modifier.padding(start = 4.dp),
            style = androidx.compose.ui.text.TextStyle(color = Color.White, fontSize = 11.sp),
            maxLines = 1
        )

        Spacer(modifier = Modifier.height(4.dp))

        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(start = 4.dp, bottom = 4.dp)
        ) {

            Icon(
                imageVector = Icons.Filled.Star,
                contentDescription = null,
                tint = Color(0xffffc107)
            )

            Spacer(modifier = Modifier.width(4.dp))

            Text(
                text = item.Imdb.toString(),
                style = TextStyle(color = Color.White, fontSize = 12.sp)
            )

        }
    }
}