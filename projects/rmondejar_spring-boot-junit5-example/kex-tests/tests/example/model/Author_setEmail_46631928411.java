package example.model;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import static example.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.util.ArrayList;
import java.lang.Object;

public class Author_setEmail_46631928411 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2065;

    public Author_setEmail_46631928411() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2066 = new Long(2209808079059619773L);
        Long term2107 = new Long(8403492202041709902L);
        Long term2117 = new Long(-113028659747841511L);
        Object term2106 = newInstance(Class.forName("example.model.Book"));
        Object term2112 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term2116 = newInstance(Class.forName("example.model.Author"));
        setField(term2106, term2106.getClass(), "id", term2107);
        setField(term2106, term2106.getClass(), "title", "");
        setField(term2106, term2106.getClass(), "description", "");
        setField(term2106, term2106.getClass(), "genre", "");
        setField(term2112, term2112.getClass(), "intVal", null);
        setIntField(term2112, term2112.getClass(), "scale", 48);
        setIntField(term2112, term2112.getClass(), "precision", 0);
        setField(term2112, term2112.getClass(), "stringCache", null);
        setLongField(term2112, term2112.getClass(), "intCompact", -9223372036854775808L);
        setField(term2106, term2106.getClass(), "price", term2112);
        setField(term2116, term2116.getClass(), "id", term2117);
        setField(term2116, term2116.getClass(), "firstName", null);
        setField(term2116, term2116.getClass(), "lastName", null);
        setField(term2116, term2116.getClass(), "email", null);
        setField(term2116, term2116.getClass(), "books", null);
        setField(term2106, term2106.getClass(), "author", term2116);
        Long term2120 = new Long(-2951854704066477061L);
        Object term2119 = newInstance(Class.forName("example.model.Book"));
        Object term2125 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term2129 = newInstance(Class.forName("example.model.Author"));
        setField(term2119, term2119.getClass(), "id", term2120);
        setField(term2119, term2119.getClass(), "title", "");
        setField(term2119, term2119.getClass(), "description", "");
        setField(term2119, term2119.getClass(), "genre", "");
        setField(term2125, term2125.getClass(), "intVal", null);
        setIntField(term2125, term2125.getClass(), "scale", 53);
        setIntField(term2125, term2125.getClass(), "precision", 0);
        setField(term2125, term2125.getClass(), "stringCache", null);
        setLongField(term2125, term2125.getClass(), "intCompact", -9223372036854775808L);
        setField(term2119, term2119.getClass(), "price", term2125);
        setField(term2129, term2129.getClass(), "id", null);
        setField(term2129, term2129.getClass(), "firstName", null);
        setField(term2129, term2129.getClass(), "lastName", null);
        setField(term2129, term2129.getClass(), "email", null);
        setField(term2129, term2129.getClass(), "books", null);
        setField(term2119, term2119.getClass(), "author", term2129);
        Long term2131 = new Long(5315236285592892506L);
        Long term2141 = new Long(-6969704322644192945L);
        Object term2130 = newInstance(Class.forName("example.model.Book"));
        Object term2136 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term2140 = newInstance(Class.forName("example.model.Author"));
        setField(term2130, term2130.getClass(), "id", term2131);
        setField(term2130, term2130.getClass(), "title", "");
        setField(term2130, term2130.getClass(), "description", "");
        setField(term2130, term2130.getClass(), "genre", "");
        setField(term2136, term2136.getClass(), "intVal", null);
        setIntField(term2136, term2136.getClass(), "scale", 53);
        setIntField(term2136, term2136.getClass(), "precision", 0);
        setField(term2136, term2136.getClass(), "stringCache", null);
        setLongField(term2136, term2136.getClass(), "intCompact", -9223372036854775808L);
        setField(term2130, term2130.getClass(), "price", term2136);
        setField(term2140, term2140.getClass(), "id", term2141);
        setField(term2140, term2140.getClass(), "firstName", null);
        setField(term2140, term2140.getClass(), "lastName", null);
        setField(term2140, term2140.getClass(), "email", null);
        setField(term2140, term2140.getClass(), "books", null);
        setField(term2130, term2130.getClass(), "author", term2140);
        Long term2144 = new Long(-5460517064177800852L);
        Long term2154 = new Long(-5242567610844514867L);
        Object term2143 = newInstance(Class.forName("example.model.Book"));
        Object term2149 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term2153 = newInstance(Class.forName("example.model.Author"));
        setField(term2143, term2143.getClass(), "id", term2144);
        setField(term2143, term2143.getClass(), "title", "");
        setField(term2143, term2143.getClass(), "description", "");
        setField(term2143, term2143.getClass(), "genre", "");
        setField(term2149, term2149.getClass(), "intVal", null);
        setIntField(term2149, term2149.getClass(), "scale", 52);
        setIntField(term2149, term2149.getClass(), "precision", 0);
        setField(term2149, term2149.getClass(), "stringCache", null);
        setLongField(term2149, term2149.getClass(), "intCompact", -9223372036854775808L);
        setField(term2143, term2143.getClass(), "price", term2149);
        setField(term2153, term2153.getClass(), "id", term2154);
        setField(term2153, term2153.getClass(), "firstName", null);
        setField(term2153, term2153.getClass(), "lastName", null);
        setField(term2153, term2153.getClass(), "email", null);
        setField(term2153, term2153.getClass(), "books", null);
        setField(term2143, term2143.getClass(), "author", term2153);
        Long term2157 = new Long(3713624957161771816L);
        Object term2156 = newInstance(Class.forName("example.model.Book"));
        Object term2162 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term2166 = newInstance(Class.forName("example.model.Author"));
        setField(term2156, term2156.getClass(), "id", term2157);
        setField(term2156, term2156.getClass(), "title", "");
        setField(term2156, term2156.getClass(), "description", "");
        setField(term2156, term2156.getClass(), "genre", "");
        setField(term2162, term2162.getClass(), "intVal", null);
        setIntField(term2162, term2162.getClass(), "scale", 53);
        setIntField(term2162, term2162.getClass(), "precision", 0);
        setField(term2162, term2162.getClass(), "stringCache", null);
        setLongField(term2162, term2162.getClass(), "intCompact", -9223372036854775808L);
        setField(term2156, term2156.getClass(), "price", term2162);
        setField(term2166, term2166.getClass(), "id", null);
        setField(term2166, term2166.getClass(), "firstName", null);
        setField(term2166, term2166.getClass(), "lastName", null);
        setField(term2166, term2166.getClass(), "email", null);
        setField(term2166, term2166.getClass(), "books", null);
        setField(term2156, term2156.getClass(), "author", term2166);
        ArrayList term2104 = new ArrayList();
        ((ArrayList) term2104).add(term2106);
        ((ArrayList) term2104).add(term2119);
        ((ArrayList) term2104).add(term2130);
        ((ArrayList) term2104).add(term2143);
        ((ArrayList) term2104).add(term2156);
        term2065 = newInstance(Class.forName("example.model.Author"));
        setField(term2065, term2065.getClass(), "id", term2066);
        setField(term2065, term2065.getClass(), "firstName", "QiUprSEluR");
        setField(term2065, term2065.getClass(), "lastName", "cDOXXottZh");
        setField(term2065, term2065.getClass(), "email", "rfqJDkDppz");
        setField(term2065, term2065.getClass(), "books", term2104);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("example.model.Author");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "hSSCyNEhyH";
        callMethod(klass, "setEmail", argTypes, term2065, args);
    }

};


