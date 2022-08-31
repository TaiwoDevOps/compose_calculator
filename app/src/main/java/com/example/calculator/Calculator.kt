package com.example.calculator

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.example.calculator.ui.theme.LightGrey
import com.example.calculator.ui.theme.Orange

@Composable
fun Calculator(
    state: CalculatorState,
    buttonSpacing : Dp = 8.dp,
    modifier: Modifier = Modifier,
    onAction : (CalculatorAction) -> Unit
) {


    Box(modifier = modifier){
        Column(modifier = Modifier
            .fillMaxWidth()
            .align(Alignment.BottomCenter),
        verticalArrangement = Arrangement.spacedBy(buttonSpacing)) {
            
            
            Text(text = state.number1 + (state.operation?.symbol ?: "") + state.number2,

                textAlign = TextAlign.End,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 22.dp),
                fontWeight = FontWeight.Light,
                color = Color.White,
                maxLines = 2
                )

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
            ) {
ComposableButton(
    symbol = "AC",
    modififier = Modifier.background(LightGrey)
        .aspectRatio(2f)
        .weight(2f),
    onClick = {
        onAction(CalculatorAction.Clear)
    }

)

                ComposableButton(
                    symbol = "Del",
                    modififier = Modifier.background(LightGrey)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorAction.Delete)
                    }

                )
                ComposableButton(
                    symbol = "/",
                    modififier = Modifier.background(Orange)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorAction.Operation(CalculatorOperation.Divide))
                    }

                )
            }
            //second row
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
            ) {
                ComposableButton(
                    symbol = "7",
                    modififier = Modifier.background(Color.DarkGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorAction.Number(7))
                    }

                )

                ComposableButton(
                    symbol = "8",
                    modififier = Modifier.background(Color.DarkGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorAction.Number(8))
                    }

                )
                ComposableButton(
                    symbol = "9",
                    modififier = Modifier.background(Color.DarkGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorAction.Number(9))
                    }

                )
                ComposableButton(
                    symbol = "*",
                    modififier = Modifier.background(Orange)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorAction.Operation(CalculatorOperation.Multiply))
                    }

                )
            }

            //third row
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
            ) {
                ComposableButton(
                    symbol = "4",
                    modififier = Modifier.background(Color.DarkGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorAction.Number(4))
                    }

                )

                ComposableButton(
                    symbol = "5",
                    modififier = Modifier.background(Color.DarkGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorAction.Number(5))
                    }

                )
                ComposableButton(
                    symbol = "6",
                    modififier = Modifier.background(Color.DarkGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorAction.Number(6))
                    }

                )
                ComposableButton(
                    symbol = "-",
                    modififier = Modifier.background(Orange)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorAction.Operation(CalculatorOperation.Subtract))
                    }

                )
            }

            //fourth row
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
            ) {
                ComposableButton(
                    symbol = "1",
                    modififier = Modifier.background(Color.DarkGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorAction.Number(1))
                    }

                )

                ComposableButton(
                    symbol = "2",
                    modififier = Modifier.background(Color.DarkGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorAction.Number(2))
                    }

                )
                ComposableButton(
                    symbol = "3",
                    modififier = Modifier.background(Color.DarkGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorAction.Number(3))
                    }

                )
                ComposableButton(
                    symbol = "+",
                    modififier = Modifier.background(Orange)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorAction.Operation(CalculatorOperation.Add))
                    }

                )
            }

            //fifth row
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
            ) {
                ComposableButton(
                    symbol = "0",
                    modififier = Modifier.background(Color.DarkGray)
                        .aspectRatio(2f)
                        .weight(2f),
                    onClick = {
                        onAction(CalculatorAction.Number(0))
                    }

                )

                ComposableButton(
                    symbol = ".",
                    modififier = Modifier.background(Color.DarkGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorAction.Decimal)
                    }

                )
                ComposableButton(
                    symbol = "=",
                    modififier = Modifier.background(Orange)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorAction.Calculate)
                    }

                )
            }
        }
    }
}