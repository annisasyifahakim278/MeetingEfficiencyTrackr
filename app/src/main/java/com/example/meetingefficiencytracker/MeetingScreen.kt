package com.example.meetingefficiencytracker

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.meetingefficiencytracker.model.MeetingData

@Composable
fun MeetingScreen() {

    val meetingList = listOf(

        MeetingData(
            "Daily Standup",
            "15 Menit",
            5,
            R.drawable.meeting1
        ),

        MeetingData(
            "Sprint Review",
            "60 Menit",
            10,
            R.drawable.meeting2
        ),

        MeetingData(
            "Strategy Planning",
            "90 Menit",
            8,
            R.drawable.meeting3
        ),

        MeetingData(
            "Client Pitch",
            "45 Menit",
            6,
            R.drawable.meeting4
        ),

        MeetingData(
            "Budget Discussion",
            "120 Menit",
            4,
            R.drawable.meeting5
        )
    )

    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
    ) {

        Text(
            text = "Meeting Efficiency Tracker",
            fontSize = 24.sp,
            modifier = Modifier.padding(16.dp)
        )

        meetingList.forEach { meeting ->
            MeetingItem(meeting)
        }

    }
}