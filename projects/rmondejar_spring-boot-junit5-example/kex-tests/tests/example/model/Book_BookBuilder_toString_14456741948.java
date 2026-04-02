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
import java.lang.Object;
import java.util.ArrayList;

public class Book_BookBuilder_toString_14456741948 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4238;

    public Book_BookBuilder_toString_14456741948() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4239 = new Long(5304481534735378567L);
        Long term4295 = new Long(3423155413133381764L);
        Long term4336 = new Long(7711054832353934171L);
        Object term4335 = newInstance(Class.forName("example.model.Book"));
        setField(term4335, term4335.getClass(), "id", term4336);
        setField(term4335, term4335.getClass(), "title", null);
        setField(term4335, term4335.getClass(), "description", null);
        setField(term4335, term4335.getClass(), "genre", null);
        setField(term4335, term4335.getClass(), "price", null);
        setField(term4335, term4335.getClass(), "author", null);
        Long term4339 = new Long(-6108006981756732593L);
        Object term4338 = newInstance(Class.forName("example.model.Book"));
        setField(term4338, term4338.getClass(), "id", term4339);
        setField(term4338, term4338.getClass(), "title", null);
        setField(term4338, term4338.getClass(), "description", null);
        setField(term4338, term4338.getClass(), "genre", null);
        setField(term4338, term4338.getClass(), "price", null);
        setField(term4338, term4338.getClass(), "author", null);
        Object term4341 = newInstance(Class.forName("example.model.Book"));
        setField(term4341, term4341.getClass(), "id", null);
        setField(term4341, term4341.getClass(), "title", null);
        setField(term4341, term4341.getClass(), "description", null);
        setField(term4341, term4341.getClass(), "genre", null);
        setField(term4341, term4341.getClass(), "price", null);
        setField(term4341, term4341.getClass(), "author", null);
        Object term4342 = newInstance(Class.forName("example.model.Book"));
        setField(term4342, term4342.getClass(), "id", null);
        setField(term4342, term4342.getClass(), "title", null);
        setField(term4342, term4342.getClass(), "description", null);
        setField(term4342, term4342.getClass(), "genre", null);
        setField(term4342, term4342.getClass(), "price", null);
        setField(term4342, term4342.getClass(), "author", null);
        ArrayList term4333 = new ArrayList();
        ((ArrayList) term4333).add(term4335);
        ((ArrayList) term4333).add(term4338);
        ((ArrayList) term4333).add(term4338);
        ((ArrayList) term4333).add(term4341);
        ((ArrayList) term4333).add(term4342);
        term4238 = newInstance(Class.forName("example.model.Book$BookBuilder"));
        Object term4277 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term4278 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term4280 = (int[]) newIntArray(6);
        Object term4294 = newInstance(Class.forName("example.model.Author"));
        setField(term4238, term4238.getClass(), "id", term4239);
        setField(term4238, term4238.getClass(), "title", "NqQofgWsJd");
        setField(term4238, term4238.getClass(), "description", "ZlVRdHsBMO");
        setField(term4238, term4238.getClass(), "genre", "UMMXkhuqzw");
        setIntField(term4278, term4278.getClass(), "signum", 1);
        setIntElement(term4280, 0, 6902);
        setIntElement(term4280, 1, 223239890);
        setIntElement(term4280, 2, 1752174217);
        setIntElement(term4280, 3, 128008369);
        setIntElement(term4280, 4, -1600442410);
        setIntElement(term4280, 5, 2077988461);
        setField(term4278, term4278.getClass(), "mag", term4280);
        setIntField(term4278, term4278.getClass(), "bitCountPlusOne", 0);
        setIntField(term4278, term4278.getClass(), "bitLengthPlusOne", 0);
        setIntField(term4278, term4278.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term4278, term4278.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term4277, term4277.getClass(), "intVal", term4278);
        setIntField(term4277, term4277.getClass(), "scale", 53);
        setIntField(term4277, term4277.getClass(), "precision", 0);
        setField(term4277, term4277.getClass(), "stringCache", null);
        setLongField(term4277, term4277.getClass(), "intCompact", -9223372036854775808L);
        setField(term4238, term4238.getClass(), "price", term4277);
        setField(term4294, term4294.getClass(), "id", term4295);
        setField(term4294, term4294.getClass(), "firstName", "KyGXZcXJwq");
        setField(term4294, term4294.getClass(), "lastName", "TqiCjeuoWE");
        setField(term4294, term4294.getClass(), "email", "GWWfkXOYLP");
        setField(term4294, term4294.getClass(), "books", term4333);
        setField(term4238, term4238.getClass(), "author", term4294);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("example.model.Book$BookBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term4238, args);
    }

};


