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

public class Book_BookBuilder_description_4891091443 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3195;

    public Book_BookBuilder_description_4891091443() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3196 = new Long(-6001151456088965547L);
        Long term3252 = new Long(1740732617708040141L);
        Long term3293 = new Long(3472971833455746664L);
        Object term3292 = newInstance(Class.forName("example.model.Book"));
        setField(term3292, term3292.getClass(), "id", term3293);
        setField(term3292, term3292.getClass(), "title", null);
        setField(term3292, term3292.getClass(), "description", null);
        setField(term3292, term3292.getClass(), "genre", null);
        setField(term3292, term3292.getClass(), "price", null);
        setField(term3292, term3292.getClass(), "author", null);
        Long term3296 = new Long(9214973322210954344L);
        Object term3295 = newInstance(Class.forName("example.model.Book"));
        setField(term3295, term3295.getClass(), "id", term3296);
        setField(term3295, term3295.getClass(), "title", null);
        setField(term3295, term3295.getClass(), "description", null);
        setField(term3295, term3295.getClass(), "genre", null);
        setField(term3295, term3295.getClass(), "price", null);
        setField(term3295, term3295.getClass(), "author", null);
        ArrayList term3290 = new ArrayList();
        ((ArrayList) term3290).add(term3292);
        ((ArrayList) term3290).add(term3295);
        term3195 = newInstance(Class.forName("example.model.Book$BookBuilder"));
        Object term3234 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term3235 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term3237 = (int[]) newIntArray(6);
        Object term3251 = newInstance(Class.forName("example.model.Author"));
        setField(term3195, term3195.getClass(), "id", term3196);
        setField(term3195, term3195.getClass(), "title", "zhcWVVrrjs");
        setField(term3195, term3195.getClass(), "description", "EAMaFLdmaG");
        setField(term3195, term3195.getClass(), "genre", "DYZSJMwbhX");
        setIntField(term3235, term3235.getClass(), "signum", 1);
        setIntElement(term3237, 0, 1328);
        setIntElement(term3237, 1, 1121027273);
        setIntElement(term3237, 2, -590055713);
        setIntElement(term3237, 3, 819451733);
        setIntElement(term3237, 4, -1193875222);
        setIntElement(term3237, 5, -2054073857);
        setField(term3235, term3235.getClass(), "mag", term3237);
        setIntField(term3235, term3235.getClass(), "bitCountPlusOne", 0);
        setIntField(term3235, term3235.getClass(), "bitLengthPlusOne", 0);
        setIntField(term3235, term3235.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term3235, term3235.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term3234, term3234.getClass(), "intVal", term3235);
        setIntField(term3234, term3234.getClass(), "scale", 52);
        setIntField(term3234, term3234.getClass(), "precision", 0);
        setField(term3234, term3234.getClass(), "stringCache", null);
        setLongField(term3234, term3234.getClass(), "intCompact", -9223372036854775808L);
        setField(term3195, term3195.getClass(), "price", term3234);
        setField(term3251, term3251.getClass(), "id", term3252);
        setField(term3251, term3251.getClass(), "firstName", "QGcshsIIWo");
        setField(term3251, term3251.getClass(), "lastName", "dPHtrzKWgf");
        setField(term3251, term3251.getClass(), "email", "olmFxfIVeh");
        setField(term3251, term3251.getClass(), "books", term3290);
        setField(term3195, term3195.getClass(), "author", term3251);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("example.model.Book$BookBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "EWGMzlcOnW";
        callMethod(klass, "description", argTypes, term3195, args);
    }

};


