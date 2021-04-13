package com.gmail.danylooliinyk.android.pullrequest.lowendquestion

import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

/**
 * lowEndDeviceQuestion
 */
@Composable
fun LowEndDeviceQuestion() {
    MaterialTheme {
        Column(
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth()
                .fillMaxHeight()
                .wrapContentSize(Alignment.Center)
        ) {
            Text(
                text = "Do you have a low-end device?"
            )

            Row(
                modifier = Modifier.padding(16.dp)
            ) {
                Button(onClick = { /*TODO*/ }) {
                    
                }
//                Button(
//                    onClick = { /*TODO*/ }
////                    ,
////                    colors = ButtonDefaults.textButtonColors(
////                        backgroundColor = Color.Green
////                    )
//                ) {
////                    Text(text = "My device is powerful!!!")
//                }

//                Button(
//                    onClick = { /*TODO*/ }
////                    ,
////                    colors = ButtonDefaults.textButtonColors(
////                        backgroundColor = Color.Red
////                    )
//                ) {
////                    Text(text = "Yes it\'s trash")
//                }
            }
        }
    }
}

@Preview
@Composable
fun PreviewLowEndDeviceQuestion() {
    LowEndDeviceQuestion()
}
