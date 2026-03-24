package com.example.meetingefficiencytracker

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.meetingefficiencytracker.model.MeetingData

@Composable
fun MeetingScreen() {

    val popularList = listOf(
        MeetingData("Daily Standup", "Durasi 15 menit", "5 peserta", R.drawable.meeting1),
        MeetingData("Sprint Review", "Durasi 60 menit", "10 peserta", R.drawable.meeting2),
        MeetingData("Client Meeting", "Durasi 45 menit", "4 peserta", R.drawable.meeting3)
    )

    val meetingList = listOf(
        MeetingData("Daily Standup", "Durasi 15 menit", "5 peserta", R.drawable.meeting1),
        MeetingData("Sprint Review", "Durasi 60 menit", "10 peserta", R.drawable.meeting2),
        MeetingData("Strategy Planning", "Durasi 90 menit", "8 peserta", R.drawable.meeting3),
        MeetingData("Client Pitch", "Durasi 45 menit", "4 peserta", R.drawable.meeting4),
        MeetingData("Budget Meeting", "Durasi 120 menit", "6 peserta", R.drawable.meeting5)
    )

    LazyColumn {

        item {
            Text(
                text = "Meeting Populer",
                fontSize = 20.sp,
                modifier = Modifier.padding(16.dp)
            )
        }

        item {
            LazyRow(
                modifier = Modifier.padding(start = 16.dp)
            ) {
                items(popularList) { item ->
                    PopularItem(item)
                }
            }
        }

        item {
            Text(
                text = "Daftar Meeting",
                fontSize = 20.sp,
                modifier = Modifier.padding(16.dp)
            )
        }

        items(meetingList) { item ->
            MeetingItem(item)
        }
    }
}