package com.sufies.shopping.model;

import javax.persistence.*;
//import java.util.List;


//@Entity
@Table
public class CartInput {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long cartId;

      //@Column
     //private List<String> product;
    @Column
    private String status;
    //@Column
//    private  String users;

    public Long getCartId() {
          return cartId;
       }

      public void setCartId(Long cartId) {
          this.cartId = cartId;
       }


    public String getStatus() {
              return status;
    }

     public void setStatus(String status) {
             this.status = status;}

    //  public List<String> getProduct() {
    //       return product;
    //   }

    //    public void setProduct(List<String> product) {
    //      this.product = product;
    //   }

    //   public String getUsers() {
    //      return users;
    //  }

   // public void setUsers(String users) {
     //   this.users = users;
   // }
}
