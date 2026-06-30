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

public class Author_toString_102888410213 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2310;

    public Author_toString_102888410213() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2311 = new Long(-5258945362776941718L);
        Long term2352 = new Long(24067105862153728L);
        Long term2362 = new Long(-8477368071089201577L);
        Object term2351 = newInstance(Class.forName("example.model.Book"));
        Object term2357 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term2361 = newInstance(Class.forName("example.model.Author"));
        setField(term2351, term2351.getClass(), "id", term2352);
        setField(term2351, term2351.getClass(), "title", "");
        setField(term2351, term2351.getClass(), "description", "");
        setField(term2351, term2351.getClass(), "genre", "");
        setField(term2357, term2357.getClass(), "intVal", null);
        setIntField(term2357, term2357.getClass(), "scale", 52);
        setIntField(term2357, term2357.getClass(), "precision", 0);
        setField(term2357, term2357.getClass(), "stringCache", null);
        setLongField(term2357, term2357.getClass(), "intCompact", -9223372036854775808L);
        setField(term2351, term2351.getClass(), "price", term2357);
        setField(term2361, term2361.getClass(), "id", term2362);
        setField(term2361, term2361.getClass(), "firstName", null);
        setField(term2361, term2361.getClass(), "lastName", null);
        setField(term2361, term2361.getClass(), "email", null);
        setField(term2361, term2361.getClass(), "books", null);
        setField(term2351, term2351.getClass(), "author", term2361);
        Long term2365 = new Long(7735460540091431012L);
        Object term2364 = newInstance(Class.forName("example.model.Book"));
        Object term2370 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term2374 = newInstance(Class.forName("example.model.Author"));
        setField(term2364, term2364.getClass(), "id", term2365);
        setField(term2364, term2364.getClass(), "title", "");
        setField(term2364, term2364.getClass(), "description", "");
        setField(term2364, term2364.getClass(), "genre", "");
        setField(term2370, term2370.getClass(), "intVal", null);
        setIntField(term2370, term2370.getClass(), "scale", 51);
        setIntField(term2370, term2370.getClass(), "precision", 0);
        setField(term2370, term2370.getClass(), "stringCache", null);
        setLongField(term2370, term2370.getClass(), "intCompact", -9223372036854775808L);
        setField(term2364, term2364.getClass(), "price", term2370);
        setField(term2374, term2374.getClass(), "id", null);
        setField(term2374, term2374.getClass(), "firstName", null);
        setField(term2374, term2374.getClass(), "lastName", null);
        setField(term2374, term2374.getClass(), "email", null);
        setField(term2374, term2374.getClass(), "books", null);
        setField(term2364, term2364.getClass(), "author", term2374);
        Long term2376 = new Long(-1526729287349763895L);
        Long term2386 = new Long(7017605765544766728L);
        Object term2375 = newInstance(Class.forName("example.model.Book"));
        Object term2381 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term2385 = newInstance(Class.forName("example.model.Author"));
        setField(term2375, term2375.getClass(), "id", term2376);
        setField(term2375, term2375.getClass(), "title", "");
        setField(term2375, term2375.getClass(), "description", "");
        setField(term2375, term2375.getClass(), "genre", "");
        setField(term2381, term2381.getClass(), "intVal", null);
        setIntField(term2381, term2381.getClass(), "scale", 53);
        setIntField(term2381, term2381.getClass(), "precision", 0);
        setField(term2381, term2381.getClass(), "stringCache", null);
        setLongField(term2381, term2381.getClass(), "intCompact", -9223372036854775808L);
        setField(term2375, term2375.getClass(), "price", term2381);
        setField(term2385, term2385.getClass(), "id", term2386);
        setField(term2385, term2385.getClass(), "firstName", null);
        setField(term2385, term2385.getClass(), "lastName", null);
        setField(term2385, term2385.getClass(), "email", null);
        setField(term2385, term2385.getClass(), "books", null);
        setField(term2375, term2375.getClass(), "author", term2385);
        Long term2389 = new Long(1463379874413441830L);
        Object term2388 = newInstance(Class.forName("example.model.Book"));
        Object term2394 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term2398 = newInstance(Class.forName("example.model.Author"));
        setField(term2388, term2388.getClass(), "id", term2389);
        setField(term2388, term2388.getClass(), "title", "");
        setField(term2388, term2388.getClass(), "description", "");
        setField(term2388, term2388.getClass(), "genre", "");
        setField(term2394, term2394.getClass(), "intVal", null);
        setIntField(term2394, term2394.getClass(), "scale", 53);
        setIntField(term2394, term2394.getClass(), "precision", 0);
        setField(term2394, term2394.getClass(), "stringCache", null);
        setLongField(term2394, term2394.getClass(), "intCompact", -9223372036854775808L);
        setField(term2388, term2388.getClass(), "price", term2394);
        setField(term2398, term2398.getClass(), "id", null);
        setField(term2398, term2398.getClass(), "firstName", null);
        setField(term2398, term2398.getClass(), "lastName", null);
        setField(term2398, term2398.getClass(), "email", null);
        setField(term2398, term2398.getClass(), "books", null);
        setField(term2388, term2388.getClass(), "author", term2398);
        Long term2400 = new Long(-7709317346333670618L);
        Object term2399 = newInstance(Class.forName("example.model.Book"));
        Object term2405 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term2409 = newInstance(Class.forName("example.model.Author"));
        setField(term2399, term2399.getClass(), "id", term2400);
        setField(term2399, term2399.getClass(), "title", "");
        setField(term2399, term2399.getClass(), "description", "");
        setField(term2399, term2399.getClass(), "genre", "");
        setField(term2405, term2405.getClass(), "intVal", null);
        setIntField(term2405, term2405.getClass(), "scale", 52);
        setIntField(term2405, term2405.getClass(), "precision", 0);
        setField(term2405, term2405.getClass(), "stringCache", null);
        setLongField(term2405, term2405.getClass(), "intCompact", -9223372036854775808L);
        setField(term2399, term2399.getClass(), "price", term2405);
        setField(term2409, term2409.getClass(), "id", null);
        setField(term2409, term2409.getClass(), "firstName", null);
        setField(term2409, term2409.getClass(), "lastName", null);
        setField(term2409, term2409.getClass(), "email", null);
        setField(term2409, term2409.getClass(), "books", null);
        setField(term2399, term2399.getClass(), "author", term2409);
        Long term2411 = new Long(-1964501434345816975L);
        Object term2410 = newInstance(Class.forName("example.model.Book"));
        Object term2416 = newInstance(Class.forName("java.math.BigDecimal"));
        setField(term2410, term2410.getClass(), "id", term2411);
        setField(term2410, term2410.getClass(), "title", "");
        setField(term2410, term2410.getClass(), "description", "");
        setField(term2410, term2410.getClass(), "genre", "");
        setField(term2416, term2416.getClass(), "intVal", null);
        setIntField(term2416, term2416.getClass(), "scale", 52);
        setIntField(term2416, term2416.getClass(), "precision", 0);
        setField(term2416, term2416.getClass(), "stringCache", null);
        setLongField(term2416, term2416.getClass(), "intCompact", -9223372036854775808L);
        setField(term2410, term2410.getClass(), "price", term2416);
        setField(term2410, term2410.getClass(), "author", term2398);
        Long term2421 = new Long(-6078481855513028760L);
        Long term2431 = new Long(-6985556670871089725L);
        Object term2420 = newInstance(Class.forName("example.model.Book"));
        Object term2426 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term2430 = newInstance(Class.forName("example.model.Author"));
        setField(term2420, term2420.getClass(), "id", term2421);
        setField(term2420, term2420.getClass(), "title", "");
        setField(term2420, term2420.getClass(), "description", "");
        setField(term2420, term2420.getClass(), "genre", "");
        setField(term2426, term2426.getClass(), "intVal", null);
        setIntField(term2426, term2426.getClass(), "scale", 53);
        setIntField(term2426, term2426.getClass(), "precision", 0);
        setField(term2426, term2426.getClass(), "stringCache", null);
        setLongField(term2426, term2426.getClass(), "intCompact", -9223372036854775808L);
        setField(term2420, term2420.getClass(), "price", term2426);
        setField(term2430, term2430.getClass(), "id", term2431);
        setField(term2430, term2430.getClass(), "firstName", null);
        setField(term2430, term2430.getClass(), "lastName", null);
        setField(term2430, term2430.getClass(), "email", null);
        setField(term2430, term2430.getClass(), "books", null);
        setField(term2420, term2420.getClass(), "author", term2430);
        ArrayList term2349 = new ArrayList();
        ((ArrayList) term2349).add(term2351);
        ((ArrayList) term2349).add(term2364);
        ((ArrayList) term2349).add(term2375);
        ((ArrayList) term2349).add(term2388);
        ((ArrayList) term2349).add(term2388);
        ((ArrayList) term2349).add(term2399);
        ((ArrayList) term2349).add(term2410);
        ((ArrayList) term2349).add(term2420);
        ((ArrayList) term2349).add(term2388);
        term2310 = newInstance(Class.forName("example.model.Author"));
        setField(term2310, term2310.getClass(), "id", term2311);
        setField(term2310, term2310.getClass(), "firstName", "jdQANIXSTq");
        setField(term2310, term2310.getClass(), "lastName", "stVcZLTNpu");
        setField(term2310, term2310.getClass(), "email", "LgXdqWrsLL");
        setField(term2310, term2310.getClass(), "books", term2349);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("example.model.Author");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term2310, args);
    }

};


