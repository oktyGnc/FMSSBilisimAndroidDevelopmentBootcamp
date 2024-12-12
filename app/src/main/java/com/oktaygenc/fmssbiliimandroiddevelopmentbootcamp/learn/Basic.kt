package com.oktaygenc.fmssbiliimandroiddevelopmentbootcamp.learn

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.oktaygenc.fmssbiliimandroiddevelopmentbootcamp.R
import com.oktaygenc.fmssbiliimandroiddevelopmentbootcamp.ui.theme.FMSSBilişimAndroidDevelopmentBootcampTheme

//Column -> Dikey olarak yerleştirilecek bileşenleri içerir.
@Composable
fun ColumnExample() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Hello")
        Text("World")
        Text("FMSS")
    }
}

//Row -> Yatay olarak yerleştirilecek bileşenleri içerir.
@Composable
fun RowExample() {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text("Item 1")
        Text("Item 2")
        Text("Item 3")
    }
}

//Box -> Üst üste yerleştirilecek bileşenleri içerir.
@Composable
fun BoxExample() {
    Box(
        modifier = Modifier.size(200.dp), contentAlignment = Alignment.Center
    ) {
        Text("Center")
        Text("TopStart", modifier = Modifier.align(Alignment.TopStart))
    }
}

//LazyColumn -> Performanslı bir şekilde dikey kaydırılabilir liste oluşturur.
@Composable
fun LazyColumnExample() {
    LazyColumn {
        items(10) {
            Text("Item $it")
        }
    }
}

//LazyRow -> Performanslı bir şekilde yatay kaydırılabilir liste oluşturur.
@Composable
fun LazyRowExample() {
    LazyRow {
        items(100) {
            Text("Item $it")
        }
    }
}


//Card -> Kart görünümü oluşturur.
@Composable
fun CardExample() {
    Card(
        modifier = Modifier.padding(100.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 5.dp)
    ) {
        Text("This is a card")
    }
}

//Image -> Görsel nesneleri oluşturur.
@Composable
fun ImageExample() {
    Image(painter = painterResource(R.drawable.ic_launcher_foreground), null)
}

//Button -> Buton oluşturur.
@Composable
fun ButtonExample() {
    Button(onClick = {}) {
        Text("Button")
    }
}

//TextField -> Metin girişi alanını oluşturur.
@Composable
fun TextFieldExample() {
    var text by remember { mutableStateOf("") }
    TextField(value = text, onValueChange = { text = it }, label = { Text("Enter Text") })
}

//Scaffold -> Sayfa yapısını oluşturan temel bileşen.
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ScaffoldExample() {
    Scaffold(topBar = { TopAppBar(title = { Text("Scaffold Example") }) },
        content = { paddingValues ->
            Text("Content goes here", modifier = Modifier.padding(paddingValues))
        })
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    FMSSBilişimAndroidDevelopmentBootcampTheme {
        ScaffoldExample()
    }
}

