package com.example.cp3406_assignment1_project.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.FitnessCenter
import androidx.compose.material.icons.outlined.Restaurant
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Bedtime
import androidx.compose.material.icons.outlined.PsychologyAlt
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.cp3406_assignment1_project.R

// For box icon
import androidx.compose.material.icons.filled.Star // 你可以更换图标
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color

import androidx.compose.ui.graphics.vector.ImageVector


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


@Composable
fun CustomBox(
    icon: ImageVector?, // ✅ 允许外部传入图标，如果传 null 就不显示图标
    iconPosition: IconPosition = IconPosition.LEFT, // 默认图标在左侧
    content: @Composable () -> Unit
) {
    Card(
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.surfaceVariant,
        ),
        modifier = Modifier
            .fillMaxWidth()
            .height(120.dp)
            .padding(8.dp)
    ) {
        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.CenterStart
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.fillMaxWidth().padding(16.dp)
            ) {
                if (icon != null && iconPosition == IconPosition.LEFT) { // ✅ 只有当 icon 不为空时才显示
                    Icon(
                        imageVector = icon,
                        contentDescription = "Icon",
                        tint = Color.Black,
                        modifier = Modifier.size(50.dp).padding(end = 8.dp)
                    )
                }

                content() // ✅ 渲染文本或其他内容

                if (icon != null && iconPosition == IconPosition.RIGHT) {
                    Spacer(modifier = Modifier.weight(1f))
                    Icon(
                        imageVector = icon,
                        contentDescription = "Icon",
                        tint = Color.Black,
                        modifier = Modifier.size(50.dp).padding(start = 8.dp)
                    )
                }
            }
        }
    }
}

// 创建一个枚举来决定图标位置
enum class IconPosition {
    LEFT, RIGHT
}