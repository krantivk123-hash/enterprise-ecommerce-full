
package com.ecommerce.model;

import javax.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {
  @Id @GeneratedValue
  private Long id;
  private String name;
  private double price;
}
