package com.example.golfcaddie

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.golfcaddie.ui.theme.GolfCaddieTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GolfCaddieTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background) {

                    GolfCaddieTiles()
                }
            }
        }
    }
}

@Composable
fun GolfCaddieTiles() {
    Column(
        Modifier
            .padding(20.dp)
            .fillMaxWidth()
            .verticalScroll(rememberScrollState(), enabled = true)

    ) {
        //GolfCaddieHeader()
        SectionTitle(sectionTitle = "Driver")
        GolfCards(golfClubNumber = "", golfClubName = "Driver", distance = "345", imageName = R.drawable.driver_image)
        Spacer(Modifier.size(16.dp))

        SectionTitle(sectionTitle = "Wood")
        GolfCards(golfClubNumber = "3" ,golfClubName = "Wood", distance = "123", imageName = R.drawable.wood_image)
        Spacer(Modifier.size(16.dp))
        GolfCards(golfClubNumber = "5", golfClubName = "Wood", distance = "234", imageName = R.drawable.wood_image)
        Spacer(Modifier.size(16.dp))
        GolfCards(golfClubNumber = "7", golfClubName = "Wood", distance = "222", imageName = R.drawable.wood_image)
        Spacer(Modifier.size(16.dp))

        SectionTitle(sectionTitle = "Hybrid")
        GolfCards(golfClubNumber = "2", golfClubName = "Hybrid", distance = "222", imageName = R.drawable.hybrid_image)
        Spacer(Modifier.size(16.dp))
        GolfCards(golfClubNumber = "3", golfClubName = "Hybrid", distance = "222", imageName = R.drawable.hybrid_image)
        Spacer(Modifier.size(16.dp))
        GolfCards(golfClubNumber = "4", golfClubName = "Hybrid", distance = "222", imageName = R.drawable.hybrid_image)
        Spacer(Modifier.size(16.dp))
        GolfCards(golfClubNumber = "5", golfClubName = "Hybrid", distance = "222", imageName = R.drawable.hybrid_image)
        Spacer(Modifier.size(16.dp))

        SectionTitle(sectionTitle = "Iron")
        GolfCards(golfClubNumber = "1", golfClubName = "Iron", distance = "134", imageName = R.drawable.iron_image)
        Spacer(Modifier.size(16.dp))
        GolfCards(golfClubNumber = "2", golfClubName = "Iron", distance = "145", imageName = R.drawable.iron_image)
        Spacer(Modifier.size(16.dp))
        GolfCards(golfClubNumber = "3", golfClubName = "Iron", distance = "189", imageName = R.drawable.iron_image)
        Spacer(Modifier.size(16.dp))
        GolfCards(golfClubNumber = "4", golfClubName = "Iron", distance = "197", imageName = R.drawable.iron_image)
        Spacer(Modifier.size(16.dp))
        GolfCards(golfClubNumber = "5", golfClubName = "Iron", distance = "154", imageName = R.drawable.iron_image)
        Spacer(Modifier.size(16.dp))
        GolfCards(golfClubNumber = "6", golfClubName = "Iron", distance = "132", imageName = R.drawable.iron_image)
        Spacer(Modifier.size(16.dp))
        GolfCards(golfClubNumber = "7", golfClubName = "Iron", distance = "111", imageName = R.drawable.iron_image)
        Spacer(Modifier.size(16.dp))
        GolfCards(golfClubNumber = "8", golfClubName = "Iron", distance = "109", imageName = R.drawable.iron_image)
        Spacer(Modifier.size(16.dp))
        GolfCards(golfClubNumber = "9", golfClubName = "Iron", distance = "178", imageName = R.drawable.iron_image)
    }
}

@Composable
fun GolfCards(golfClubNumber: String, golfClubName: String, distance: String, imageName: Int) {
    Card(
        elevation = 4.dp,
        shape = RoundedCornerShape(20.dp),
        modifier = Modifier
            .fillMaxWidth()
            .height(60.dp)
    ) {
        Row(
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painterResource(id = imageName),
                contentDescription = imageName.toString(),
                modifier = Modifier.size(50.dp)
            )
            Spacer(Modifier.size(16.dp))
            Text(
                text = golfClubNumber,
                fontSize = 30.sp
            )
            Text(
                text = golfClubName,
                textAlign = TextAlign.Center
            )
            Spacer(Modifier.size(16.dp))
            Text("$distance yards")

        }

    }
}

@Composable
fun GolfCaddieHeader(){
    Card(backgroundColor = Color.DarkGray, modifier = Modifier.width(1000.dp)) {
        Text(
            text = "Golf Caddie",
            textAlign = TextAlign.Center,
            fontSize = 40.sp,
            modifier = Modifier
                .fillMaxWidth(),
        )
    }

}

@Composable
fun SectionTitle(sectionTitle: String) {
    Text(sectionTitle, fontSize = 20.sp ,modifier =
    Modifier
        .fillMaxWidth()
        .height(40.dp)
    )

}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    GolfCaddieTheme {
        GolfCaddieTiles()
    }
}