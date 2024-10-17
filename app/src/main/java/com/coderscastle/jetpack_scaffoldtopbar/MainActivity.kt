package com.coderscastle.jetpack_scaffoldtopbar

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import com.coderscastle.jetpack_scaffoldtopbar.ui.theme.JetpackScaffoldTopBarTheme

class MainActivity : ComponentActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            JetpackScaffoldTopBarTheme {

                MyTopAppBar()
            }
        }
    }
}


@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun MyTopAppBar() {


    val context = LocalContext.current

    Scaffold(
        modifier = Modifier
            .fillMaxSize(),

        topBar = {
            TopAppBar(
                title = {
                    Text("Top Bar")
                },
                modifier = Modifier,
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = Color.Yellow,
                    titleContentColor = Color.Black
                ),
                navigationIcon = {
                    Icon(
                        imageVector = Icons.Default.Menu,
                        contentDescription = "Menu",
                        modifier = Modifier
                            .clickable(onClick = { Toast.makeText(context, "Menu Clicked", Toast.LENGTH_SHORT).show() }))
                },
                actions = {
                    Icon(
                        imageVector = Icons.Default.Add,
                        contentDescription = "Add",
                        modifier = Modifier
                            .clickable(onClick = { Toast.makeText(context, "Add Clicked", Toast.LENGTH_SHORT).show() })

                    )
                    Icon(
                        imageVector = Icons.Default.MoreVert,
                        contentDescription = "MoreVert",
                        modifier = Modifier
                            .clickable(onClick = { Toast.makeText(context, "MoreVert Clicked", Toast.LENGTH_SHORT).show() })
                        )
                }
            )
        }
    )
    {

    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun MyTopAppBarPreview() {
    MyTopAppBar()
}