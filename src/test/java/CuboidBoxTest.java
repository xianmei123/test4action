import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/** 
* CuboidBox Tester. 
* 
* @author <Authors name> 
* @since <pre>3ÔÂ 15, 2021</pre> 
* @version 1.0 
*/

public class CuboidBoxTest {
    CuboidBox cu = new CuboidBox(1, 2, 3);
@Before
public void before() throws Exception {
    System.out.println("-------Begin------");
    cu.setLength(3);
    cu.setWidth(2);
    cu.setHeight(1);
} 

@After
public void after() throws Exception {
    System.out.println("--------end-------");
} 

/** 
* 
* Method: getlength() 
* 
*/ 
@Test
public void testGetlength() throws Exception { 
//TODO: Test goes here...
    double l = cu.getLength();
    assertEquals(3, l, 0.1);
} 

/** 
* 
* Method: getwidth() 
* 
*/ 
@Test
public void testGetwidth() throws Exception { 
//TODO: Test goes here...
    double w = cu.getWidth();
    assertEquals(2, w, 0.1);
} 

/** 
* 
* Method: getheight() 
* 
*/ 
@Test
public void testGetheight() throws Exception { 
//TODO: Test goes here...
    double h = cu.getHeight();
    assertEquals(1, h, 0.1);
} 

/** 
* 
* Method: get_ttVolume() 
* 
*/ 
@Test
public void testGet_ttVolume() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: setlength(double length) 
* 
*/ 
@Test
public void testSetlength() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: setwidth(double width) 
* 
*/ 
@Test
public void testSetwidth() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: setheight(double height) 
* 
*/ 
@Test
public void testSetheight() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: set_ttVolume(double ttVolume) 
* 
*/ 
@Test
public void testSet_ttVolume() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: getVolume() 
* 
*/ 
@Test
public void testGetVolume() throws Exception { 
//TODO: Test goes here...
    double v = cu.getVolume();
    assertEquals(6, v, 0.1);
} 


} 
