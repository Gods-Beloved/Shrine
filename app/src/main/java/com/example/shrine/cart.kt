package com.example.shrine

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.outlined.RemoveCircleOutline
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.shrine.ui.theme.ShrineTheme

@Composable
fun Cart(modifier: Modifier = Modifier) {

    Surface(
        color = MaterialTheme.colors.secondary
    ) {
        Column(modifier = modifier.fillMaxSize()) {

            Column() {

                CartHeading()




                Row(verticalAlignment = Alignment.CenterVertically) {

                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(
                            imageVector = Icons.Outlined.RemoveCircleOutline,
                            contentDescription = "RemoveItem"
                        )
                    }

                    Column() {
                        Divider(color = MaterialTheme.colors.onSecondary.copy(alpha = 0.3f))

                        Row(Modifier.padding(vertical = 16.dp)) {
                            Image(
                                painter = painterResource(id = R.drawable.img),
                                contentDescription = "Images",
                                modifier = Modifier
                                    .size(80.dp)
                                    .padding(top = 8.dp),
                                contentScale = ContentScale.FillBounds

                            )
                            Spacer(modifier = Modifier.width(24.dp))

                            Column(modifier = Modifier.padding(end = 16.dp)) {
                                Row(
                                    modifier = Modifier
                                        .fillMaxWidth(),
                                    horizontalArrangement = Arrangement.SpaceBetween
                                ) {
                                    Text(text = "$40", style = MaterialTheme.typography.body2)
                                    Text(text = "LMBRJK", style = MaterialTheme.typography.body2)

                                }

                                Text("Gatsby Hat", style = MaterialTheme.typography.subtitle2)
                                Row(
                                    Modifier
                                        .padding(vertical = 16.dp)
                                        .fillMaxWidth(),
                                    horizontalArrangement = Arrangement.SpaceBetween
                                ) {
                                    Divider(Modifier.width(80.dp))
                                    Divider(Modifier.width(80.dp))


                                }

                            }


                        }


                    }


                }

            }

            Button(
                onClick = { /*TODO*/ },
                modifier = modifier
                    .padding(horizontal = 16.dp, vertical = 24.dp)
                    .fillMaxWidth()
            ) {
                Text(text = stringResource(R.string.btn_proceed).uppercase())
            }


        }
    }


}

@Composable
private fun CartHeading() {
    Row(verticalAlignment = Alignment.CenterVertically) {
        IconButton(onClick = { /*TODO*/ }
        ) {

            Icon(
                imageVector = Icons.Default.KeyboardArrowDown,
                tint = MaterialTheme.colors.onSurface,
                contentDescription = "keyboard down"
            )

        }

        Text(
            text = "Cart".uppercase(),
            style = MaterialTheme.typography.subtitle1,
            fontWeight = FontWeight(500)
        )

        Spacer(modifier = Modifier.width(8.dp))

        Text(text = "2 items".uppercase(), style = MaterialTheme.typography.body1)

    }
}


@Preview
@Composable
fun CartPreview() {
    ShrineTheme {
        Cart()
    }
}