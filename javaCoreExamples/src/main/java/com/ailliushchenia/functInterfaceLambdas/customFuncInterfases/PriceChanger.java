package com.ailliushchenia.functInterfaceLambdas.customFuncInterfases;

public interface PriceChanger <P, DP> {
    P changePrice(P price, DP discountPercentage);
}
