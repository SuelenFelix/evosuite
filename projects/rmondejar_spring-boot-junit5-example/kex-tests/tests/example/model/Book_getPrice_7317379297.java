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

public class Book_getPrice_7317379297 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5284;

    public Book_getPrice_7317379297() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term5285 = new Long(7450734758126089960L);
        Long term5340 = new Long(1377567570761089535L);
        Long term5381 = new Long(-8531377551015443915L);
        Object term5380 = newInstance(Class.forName("example.model.Book"));
        setField(term5380, term5380.getClass(), "id", term5381);
        setField(term5380, term5380.getClass(), "title", null);
        setField(term5380, term5380.getClass(), "description", null);
        setField(term5380, term5380.getClass(), "genre", null);
        setField(term5380, term5380.getClass(), "price", null);
        setField(term5380, term5380.getClass(), "author", null);
        Long term5384 = new Long(3447455321955655601L);
        Object term5383 = newInstance(Class.forName("example.model.Book"));
        setField(term5383, term5383.getClass(), "id", term5384);
        setField(term5383, term5383.getClass(), "title", null);
        setField(term5383, term5383.getClass(), "description", null);
        setField(term5383, term5383.getClass(), "genre", null);
        setField(term5383, term5383.getClass(), "price", null);
        setField(term5383, term5383.getClass(), "author", null);
        Long term5387 = new Long(-7574091101944828886L);
        Object term5386 = newInstance(Class.forName("example.model.Book"));
        setField(term5386, term5386.getClass(), "id", term5387);
        setField(term5386, term5386.getClass(), "title", null);
        setField(term5386, term5386.getClass(), "description", null);
        setField(term5386, term5386.getClass(), "genre", null);
        setField(term5386, term5386.getClass(), "price", null);
        setField(term5386, term5386.getClass(), "author", null);
        Object term5389 = newInstance(Class.forName("example.model.Book"));
        setField(term5389, term5389.getClass(), "id", null);
        setField(term5389, term5389.getClass(), "title", null);
        setField(term5389, term5389.getClass(), "description", null);
        setField(term5389, term5389.getClass(), "genre", null);
        setField(term5389, term5389.getClass(), "price", null);
        setField(term5389, term5389.getClass(), "author", null);
        Long term5391 = new Long(-7155106718297861156L);
        Object term5390 = newInstance(Class.forName("example.model.Book"));
        setField(term5390, term5390.getClass(), "id", term5391);
        setField(term5390, term5390.getClass(), "title", null);
        setField(term5390, term5390.getClass(), "description", null);
        setField(term5390, term5390.getClass(), "genre", null);
        setField(term5390, term5390.getClass(), "price", null);
        setField(term5390, term5390.getClass(), "author", null);
        Object term5393 = newInstance(Class.forName("example.model.Book"));
        setField(term5393, term5393.getClass(), "id", null);
        setField(term5393, term5393.getClass(), "title", null);
        setField(term5393, term5393.getClass(), "description", null);
        setField(term5393, term5393.getClass(), "genre", null);
        setField(term5393, term5393.getClass(), "price", null);
        setField(term5393, term5393.getClass(), "author", null);
        ArrayList term5378 = new ArrayList();
        ((ArrayList) term5378).add(term5380);
        ((ArrayList) term5378).add(term5383);
        ((ArrayList) term5378).add(term5386);
        ((ArrayList) term5378).add(term5389);
        ((ArrayList) term5378).add(term5390);
        ((ArrayList) term5378).add(term5383);
        ((ArrayList) term5378).add(term5393);
        term5284 = newInstance(Class.forName("example.model.Book"));
        Object term5323 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term5324 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term5326 = (int[]) newIntArray(5);
        Object term5339 = newInstance(Class.forName("example.model.Author"));
        setField(term5284, term5284.getClass(), "id", term5285);
        setField(term5284, term5284.getClass(), "title", "WAZFhrxcSM");
        setField(term5284, term5284.getClass(), "description", "gCRUlTuVMX");
        setField(term5284, term5284.getClass(), "genre", "tYBgGQtkhi");
        setIntField(term5324, term5324.getClass(), "signum", 1);
        setIntElement(term5326, 0, 38341167);
        setIntElement(term5326, 1, -1750585868);
        setIntElement(term5326, 2, 710420477);
        setIntElement(term5326, 3, -2062929513);
        setIntElement(term5326, 4, 1112979815);
        setField(term5324, term5324.getClass(), "mag", term5326);
        setIntField(term5324, term5324.getClass(), "bitCountPlusOne", 0);
        setIntField(term5324, term5324.getClass(), "bitLengthPlusOne", 0);
        setIntField(term5324, term5324.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term5324, term5324.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term5323, term5323.getClass(), "intVal", term5324);
        setIntField(term5323, term5323.getClass(), "scale", 49);
        setIntField(term5323, term5323.getClass(), "precision", 0);
        setField(term5323, term5323.getClass(), "stringCache", null);
        setLongField(term5323, term5323.getClass(), "intCompact", -9223372036854775808L);
        setField(term5284, term5284.getClass(), "price", term5323);
        setField(term5339, term5339.getClass(), "id", term5340);
        setField(term5339, term5339.getClass(), "firstName", "PhGPFLIMKH");
        setField(term5339, term5339.getClass(), "lastName", "pWCYcLhoms");
        setField(term5339, term5339.getClass(), "email", "IWNJVfvTuw");
        setField(term5339, term5339.getClass(), "books", term5378);
        setField(term5284, term5284.getClass(), "author", term5339);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("example.model.Book");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPrice", argTypes, term5284, args);
    }

};


