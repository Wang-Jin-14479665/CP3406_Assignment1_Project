package com.example.cp3406_assignment1_project.screens

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.FitnessCenter
import androidx.compose.material.icons.outlined.Restaurant
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Bedtime
import androidx.compose.material.icons.outlined.PsychologyAlt
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import com.example.cp3406_assignment1_project.R

@Composable
fun BottomNavigationBar(selectedTab: Int, onTabSelected: (Int) -> Unit) {
    NavigationBar {
        NavigationBarItem(
            selected = selectedTab == 0,
            onClick = { onTabSelected(0) },
            icon = { Icon(Icons.Outlined.FitnessCenter, contentDescription = "Fitness") },
            label = { Text(stringResource(id = R.string.nav_fitness)) }
        )
        NavigationBarItem(
            selected = selectedTab == 1,
            onClick = { onTabSelected(1) },
            icon = { Icon(Icons.Outlined.Restaurant, contentDescription = "Nutrition") },
            label = { Text(stringResource(id = R.string.nav_nutrition)) }
        )
        NavigationBarItem(
            selected = selectedTab == 2,
            onClick = { onTabSelected(2) },
            icon = { Icon(Icons.Outlined.Home, contentDescription = "Home") },
            label = { Text(stringResource(id = R.string.nav_home)) }
        )
        NavigationBarItem(
            selected = selectedTab == 3,
            onClick = { onTabSelected(3) },
            icon = { Icon(Icons.Outlined.Bedtime, contentDescription = "Sleep") },
            label = { Text(stringResource(id = R.string.nav_sleep)) }
        )
        NavigationBarItem(
            selected = selectedTab == 4,
            onClick = { onTabSelected(4) },
            icon = { Icon(Icons.Outlined.PsychologyAlt, contentDescription = "Mindfulness") },
            label = { Text(stringResource(id = R.string.nav_mental)) }
        )
    }
}
