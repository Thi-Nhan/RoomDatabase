package com.example.myapplication

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.rounded.Person
import androidx.compose.material.icons.rounded.Search
import androidx.compose.material.icons.rounded.Settings
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FabPosition
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.IconButtonColors
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ContactListScreen(navController: NavHostController) {
    Scaffold (
        topBar = {
            TopAppBar(
                colors = TopAppBarDefaults.smallTopAppBarColors(
                    containerColor = Color.LightGray
                ),
                title = {
                    TextField(
                        value = "",
                        onValueChange = {},
                        modifier = androidx.compose.ui.Modifier.fillMaxWidth(),
                        placeholder = { Text(text = "Tìm kiếm") },
                        leadingIcon = {
                            IconButton(onClick = {}) {
                                Icon(
                                    imageVector = Icons.Rounded.Search,
                                    contentDescription = ""
                                )
                            }
                        },
                        trailingIcon = {
                            Row {
                                IconButton(onClick = {}) {
                                    Icon(
                                        Icons.Rounded.Person,
                                        contentDescription = null
                                    )
                                }
                                IconButton(onClick = {}) {
                                    Icon(
                                        Icons.Rounded.Settings,
                                        contentDescription = null
                                    )
                                }
                            }
                        },
                        colors = TextFieldDefaults.textFieldColors(
                            focusedIndicatorColor = Color.Transparent,
                            unfocusedIndicatorColor = Color.Transparent,
                            containerColor = Color.LightGray
                        )
                    )
                })
        },
        floatingActionButton = {
            IconButton(
                onClick = {},
                colors = IconButtonDefaults.iconButtonColors(
                    containerColor = Color.LightGray
                ),
                modifier = Modifier.clip(CircleShape)
            ) {
                Icon(
                    imageVector = Icons.Filled.Add,
                    contentDescription = "Them Danh Ba",
                )
            }
        },
        floatingActionButtonPosition = FabPosition.Center
    )
    {
        LazyColumn (
            contentPadding = it,
            modifier = androidx.compose.ui.Modifier.fillMaxSize().padding(10.dp),
            verticalArrangement = Arrangement.spacedBy(10.dp)
        ){
            item { 
                CardInfo(name = "Duc", phone = " 20000", {})
            }
            item {
                CardInfo(name = "lmao", phone = "22222222", {})
            }
        }
    }
}


