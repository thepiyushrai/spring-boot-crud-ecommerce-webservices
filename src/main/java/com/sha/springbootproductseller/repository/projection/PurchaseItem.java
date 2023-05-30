package com.sha.springbootproductseller.repository.projection;

import java.time.LocalDateTime;

/**
 * @author piyush
 * @date 08.02.2021

 */
public interface PurchaseItem
{
    String getName();
    Double getPrice();
    LocalDateTime getPurchaseTime();
}
