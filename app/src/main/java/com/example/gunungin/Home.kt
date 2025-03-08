package com.example.gunungin

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.snapshotFlow
import androidx.compose.ui.Alignment.Companion.Center
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.layout.ContentScale.Companion.FillWidth
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPager
import com.google.accompanist.pager.HorizontalPagerIndicator
import com.google.accompanist.pager.rememberPagerState

@Preview
@Composable
fun HomeScreen() {
    LazyColumn(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = CenterHorizontally
    ) {
        item { SlidingBanner() }
        item { CategoryView() }
        item {  }
    }
}

@OptIn(ExperimentalFoundationApi::class, ExperimentalPagerApi::class)
@Composable
fun SlidingBanner() {
    val pagerState = rememberPagerState()

    LaunchedEffect(pagerState) {
        snapshotFlow { pagerState.currentPage }.collect { page ->
        }
    }

    HorizontalPager(
        count = 3,
        state = pagerState,
        itemSpacing = 20.dp
        ) { page ->
        Image(
            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp),
            bitmap = ImageBitmap.imageResource(id = R.drawable.ic_sale_banner),
            contentScale = FillWidth,
            contentDescription = "sliding_banner_image"
        )
    }

    HorizontalPagerIndicator(
        pagerState = pagerState,
        modifier = Modifier.padding(16.dp)
    )
}

@Composable
private fun CategoryView() {
    Row (
        verticalAlignment = CenterVertically,
        modifier = Modifier.padding(20.dp))
    {
        RoundedCornerIconButton(
            modifier = Modifier.weight(1f),
            R.drawable.ic_chinese_plum_flower
        )
        Spacer(
            modifier = Modifier.size(10.dp)
        )
        RoundedCornerIconButton(
            modifier = Modifier.weight(1f), 
            R.drawable.ic_flat_flower
        )
        Spacer(modifier = Modifier.size(10.dp))
        RoundedCornerIconButton(
            modifier = Modifier.weight(1f),
            R.drawable.ic_giftbox
        )
        Spacer(modifier = Modifier.size(10.dp))
        RoundedCornerIconButton(
            modifier = Modifier.weight(1f),
            R.drawable.ic_wedding_arch
        )
    }
}

@Composable
fun RoundedCornerIconButton(modifier: Modifier, icon: Int) {
    Box(modifier = modifier
        .background(
            color = White,
            shape = RoundedCornerShape(10.dp)
        )) {
        IconButton(
            onClick = { },
            modifier = Modifier
                .align(Center)
                .padding(14.dp)
        ) {
            Image(
                bitmap = ImageBitmap.imageResource(id = icon),
                contentDescription = "rounded_corner_icon_button"
            )
        }
    }
}

//@Composable
//private fun PopularFlowersList() {
//    LazyRow(modifier = Modifier.fillMaxWidth() ) {
//        items(FlowerState)
//    }
//}
