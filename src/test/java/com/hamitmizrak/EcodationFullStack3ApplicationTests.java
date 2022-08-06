package com.hamitmizrak;

import org.junit.jupiter.api.*;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EcodationFullStack3ApplicationTests {

    private static String data="55";
    //Herşeyden önce
    @BeforeAll
    static void getBeforeAll(){
        data="44";
        System.out.println("Herşeyden önce ==> getBeforeAll"+data);
    }

    //Testten hemen önce
    @BeforeEach
  void getBeforeEach(){
        System.out.println("Her hangi birşeyden önce ==> BeforeEach");
    }

    // @AfterEach ile@BeforeEach arasındadır
    @Test
  void getTest(){
        System.out.println("@Test data: "+data);
    }

    @Test
    void getFail(){
        Assertions.fail("Fail sonuçu");
    }

    @Test
    @Disabled("disable")//calışmayacak test
    void getDisable(){
        System.out.println("@Disable data: "+data);
    }

    //Testten hemen sonra
    @AfterEach
      void getAfterEach(){
        System.out.println("Her hangi birşeyden sonra ==> AfterEach");
    }

    @AfterAll
  static void getAfterAll(){
        data=null;
        System.out.println("Herşeyden sonra ==> AfterAll"+data);
    }
}
