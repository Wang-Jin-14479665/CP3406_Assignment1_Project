package com.example.cp3406_assignment1_project.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Restaurant
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

//引用 strings.xml
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import com.example.cp3406_assignment1_project.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Nutrition() {
    var selectedTab by remember { mutableStateOf(1) } // 默认选中 Nutrition

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(text = stringResource(id = R.string.title_Nutrition)) },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primaryContainer
                )
            )
        },
        bottomBar = {
            BottomNavigationBar(selectedTab) { selectedTab = it } // 使用的是 NavigationBar.kt 里的 BottomNavigationBar
        }
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .padding(innerPadding)
                .fillMaxSize()
                .padding(16.dp)
        ) {
            Text(text = stringResource(id = R.string.welcome_message), modifier = Modifier.padding(8.dp))
            Text(text = stringResource(id = R.string.static_info), modifier = Modifier.padding(8.dp))

            Spacer(modifier = Modifier.height(16.dp)) // 添加间距，让 Card 和文本分开

            // Box 1
            CustomBox(icon = Icons.Filled.Restaurant, iconPosition = IconPosition.LEFT) {
                Text(
                    text = "Food Intake History",
                    textAlign = TextAlign.Center,
                    style = MaterialTheme.typography.bodyLarge
                )
            }

            // Box 2
            CustomBox(icon = Icons.Filled.Restaurant, iconPosition = IconPosition.LEFT) {
                Text(
                    text = "Calorie Intake Calculator",
                    textAlign = TextAlign.Center,
                    style = MaterialTheme.typography.bodyLarge
                )
            }

            // Box 3
            CustomBox(icon = Icons.Filled.Restaurant, iconPosition = IconPosition.LEFT) {
                Text(
                    text = "Recipe Recommendation",
                    textAlign = TextAlign.Center,
                    style = MaterialTheme.typography.bodyLarge
                )
            }

            // Box 4
            CustomBox(icon = Icons.Filled.Restaurant, iconPosition = IconPosition.LEFT) {
                Text(
                    text = "Food Delivery",
                    textAlign = TextAlign.Center,
                    style = MaterialTheme.typography.bodyLarge
                )
            }
        }
    }
}



@Preview(showBackground = true)
@Composable
fun PreviewNutrition() {
    Nutrition()
}
