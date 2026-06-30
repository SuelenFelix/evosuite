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

public class Book_getGenre_16981139876 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5112;

    public Book_getGenre_16981139876() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term5113 = new Long(-143609946830350439L);
        Long term5169 = new Long(2018084438165711668L);
        Long term5210 = new Long(-8705953038984862378L);
        Object term5209 = newInstance(Class.forName("example.model.Book"));
        setField(term5209, term5209.getClass(), "id", term5210);
        setField(term5209, term5209.getClass(), "title", null);
        setField(term5209, term5209.getClass(), "description", null);
        setField(term5209, term5209.getClass(), "genre", null);
        setField(term5209, term5209.getClass(), "price", null);
        setField(term5209, term5209.getClass(), "author", null);
        Long term5213 = new Long(-354905832180781372L);
        Object term5212 = newInstance(Class.forName("example.model.Book"));
        setField(term5212, term5212.getClass(), "id", term5213);
        setField(term5212, term5212.getClass(), "title", null);
        setField(term5212, term5212.getClass(), "description", null);
        setField(term5212, term5212.getClass(), "genre", null);
        setField(term5212, term5212.getClass(), "price", null);
        setField(term5212, term5212.getClass(), "author", null);
        Object term5215 = newInstance(Class.forName("example.model.Book"));
        setField(term5215, term5215.getClass(), "id", null);
        setField(term5215, term5215.getClass(), "title", null);
        setField(term5215, term5215.getClass(), "description", null);
        setField(term5215, term5215.getClass(), "genre", null);
        setField(term5215, term5215.getClass(), "price", null);
        setField(term5215, term5215.getClass(), "author", null);
        ArrayList term5207 = new ArrayList();
        ((ArrayList) term5207).add(term5209);
        ((ArrayList) term5207).add(term5212);
        ((ArrayList) term5207).add(term5212);
        ((ArrayList) term5207).add(term5209);
        ((ArrayList) term5207).add(term5215);
        term5112 = newInstance(Class.forName("example.model.Book"));
        Object term5151 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term5152 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term5154 = (int[]) newIntArray(6);
        Object term5168 = newInstance(Class.forName("example.model.Author"));
        setField(term5112, term5112.getClass(), "id", term5113);
        setField(term5112, term5112.getClass(), "title", "LNHkTUfuHX");
        setField(term5112, term5112.getClass(), "description", "SVWcOAHiTp");
        setField(term5112, term5112.getClass(), "genre", "oShLCaneoQ");
        setIntField(term5152, term5152.getClass(), "signum", 1);
        setIntElement(term5154, 0, 2273);
        setIntElement(term5154, 1, -731865600);
        setIntElement(term5154, 2, -727320745);
        setIntElement(term5154, 3, -2130935672);
        setIntElement(term5154, 4, 1232985855);
        setIntElement(term5154, 5, 1760945701);
        setField(term5152, term5152.getClass(), "mag", term5154);
        setIntField(term5152, term5152.getClass(), "bitCountPlusOne", 0);
        setIntField(term5152, term5152.getClass(), "bitLengthPlusOne", 0);
        setIntField(term5152, term5152.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term5152, term5152.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term5151, term5151.getClass(), "intVal", term5152);
        setIntField(term5151, term5151.getClass(), "scale", 52);
        setIntField(term5151, term5151.getClass(), "precision", 0);
        setField(term5151, term5151.getClass(), "stringCache", null);
        setLongField(term5151, term5151.getClass(), "intCompact", -9223372036854775808L);
        setField(term5112, term5112.getClass(), "price", term5151);
        setField(term5168, term5168.getClass(), "id", term5169);
        setField(term5168, term5168.getClass(), "firstName", "nwKkzNpzyC");
        setField(term5168, term5168.getClass(), "lastName", "CwrsdYnHpH");
        setField(term5168, term5168.getClass(), "email", "jifjXNXluS");
        setField(term5168, term5168.getClass(), "books", term5207);
        setField(term5112, term5112.getClass(), "author", term5168);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("example.model.Book");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getGenre", argTypes, term5112, args);
    }

};


