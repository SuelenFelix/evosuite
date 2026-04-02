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

public class Book_toString_88025981215 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6869;

    public Book_toString_88025981215() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term6870 = new Long(8931772176819893873L);
        Long term6926 = new Long(-4370635295110591519L);
        Long term6967 = new Long(-1325109462577461208L);
        Object term6966 = newInstance(Class.forName("example.model.Book"));
        setField(term6966, term6966.getClass(), "id", term6967);
        setField(term6966, term6966.getClass(), "title", null);
        setField(term6966, term6966.getClass(), "description", null);
        setField(term6966, term6966.getClass(), "genre", null);
        setField(term6966, term6966.getClass(), "price", null);
        setField(term6966, term6966.getClass(), "author", null);
        Object term6969 = newInstance(Class.forName("example.model.Book"));
        setField(term6969, term6969.getClass(), "id", null);
        setField(term6969, term6969.getClass(), "title", null);
        setField(term6969, term6969.getClass(), "description", null);
        setField(term6969, term6969.getClass(), "genre", null);
        setField(term6969, term6969.getClass(), "price", null);
        setField(term6969, term6969.getClass(), "author", null);
        Long term6971 = new Long(3660520943100987842L);
        Object term6970 = newInstance(Class.forName("example.model.Book"));
        setField(term6970, term6970.getClass(), "id", term6971);
        setField(term6970, term6970.getClass(), "title", null);
        setField(term6970, term6970.getClass(), "description", null);
        setField(term6970, term6970.getClass(), "genre", null);
        setField(term6970, term6970.getClass(), "price", null);
        setField(term6970, term6970.getClass(), "author", null);
        Long term6974 = new Long(3535528164828723056L);
        Object term6973 = newInstance(Class.forName("example.model.Book"));
        setField(term6973, term6973.getClass(), "id", term6974);
        setField(term6973, term6973.getClass(), "title", null);
        setField(term6973, term6973.getClass(), "description", null);
        setField(term6973, term6973.getClass(), "genre", null);
        setField(term6973, term6973.getClass(), "price", null);
        setField(term6973, term6973.getClass(), "author", null);
        ArrayList term6964 = new ArrayList();
        ((ArrayList) term6964).add(term6966);
        ((ArrayList) term6964).add(term6969);
        ((ArrayList) term6964).add(term6970);
        ((ArrayList) term6964).add(term6973);
        term6869 = newInstance(Class.forName("example.model.Book"));
        Object term6908 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term6909 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term6911 = (int[]) newIntArray(6);
        Object term6925 = newInstance(Class.forName("example.model.Author"));
        setField(term6869, term6869.getClass(), "id", term6870);
        setField(term6869, term6869.getClass(), "title", "YaWdTQZkTw");
        setField(term6869, term6869.getClass(), "description", "QqsjlsXtmm");
        setField(term6869, term6869.getClass(), "genre", "FuWUjAYXxz");
        setIntField(term6909, term6909.getClass(), "signum", 1);
        setIntElement(term6911, 0, 60496);
        setIntElement(term6911, 1, -1723513621);
        setIntElement(term6911, 2, 1251058487);
        setIntElement(term6911, 3, -1677359642);
        setIntElement(term6911, 4, -1467539437);
        setIntElement(term6911, 5, -353210827);
        setField(term6909, term6909.getClass(), "mag", term6911);
        setIntField(term6909, term6909.getClass(), "bitCountPlusOne", 0);
        setIntField(term6909, term6909.getClass(), "bitLengthPlusOne", 0);
        setIntField(term6909, term6909.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term6909, term6909.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term6908, term6908.getClass(), "intVal", term6909);
        setIntField(term6908, term6908.getClass(), "scale", 53);
        setIntField(term6908, term6908.getClass(), "precision", 0);
        setField(term6908, term6908.getClass(), "stringCache", null);
        setLongField(term6908, term6908.getClass(), "intCompact", -9223372036854775808L);
        setField(term6869, term6869.getClass(), "price", term6908);
        setField(term6925, term6925.getClass(), "id", term6926);
        setField(term6925, term6925.getClass(), "firstName", "rKIvvYydou");
        setField(term6925, term6925.getClass(), "lastName", "KNgeIkQoef");
        setField(term6925, term6925.getClass(), "email", "MeMWAHyjMR");
        setField(term6925, term6925.getClass(), "books", term6964);
        setField(term6869, term6869.getClass(), "author", term6925);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("example.model.Book");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term6869, args);
    }

};


