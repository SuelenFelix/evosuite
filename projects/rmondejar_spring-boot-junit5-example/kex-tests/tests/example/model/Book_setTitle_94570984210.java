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

public class Book_setTitle_94570984210 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5804;

    public Book_setTitle_94570984210() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term5805 = new Long(-955253666696787757L);
        Long term5861 = new Long(-99017747847004910L);
        Long term5902 = new Long(797798302378380033L);
        Object term5901 = newInstance(Class.forName("example.model.Book"));
        setField(term5901, term5901.getClass(), "id", term5902);
        setField(term5901, term5901.getClass(), "title", null);
        setField(term5901, term5901.getClass(), "description", null);
        setField(term5901, term5901.getClass(), "genre", null);
        setField(term5901, term5901.getClass(), "price", null);
        setField(term5901, term5901.getClass(), "author", null);
        Object term5904 = newInstance(Class.forName("example.model.Book"));
        setField(term5904, term5904.getClass(), "id", null);
        setField(term5904, term5904.getClass(), "title", null);
        setField(term5904, term5904.getClass(), "description", null);
        setField(term5904, term5904.getClass(), "genre", null);
        setField(term5904, term5904.getClass(), "price", null);
        setField(term5904, term5904.getClass(), "author", null);
        Object term5905 = newInstance(Class.forName("example.model.Book"));
        setField(term5905, term5905.getClass(), "id", null);
        setField(term5905, term5905.getClass(), "title", null);
        setField(term5905, term5905.getClass(), "description", null);
        setField(term5905, term5905.getClass(), "genre", null);
        setField(term5905, term5905.getClass(), "price", null);
        setField(term5905, term5905.getClass(), "author", null);
        ArrayList term5899 = new ArrayList();
        ((ArrayList) term5899).add(term5901);
        ((ArrayList) term5899).add(term5904);
        ((ArrayList) term5899).add(term5905);
        term5804 = newInstance(Class.forName("example.model.Book"));
        Object term5843 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term5844 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term5846 = (int[]) newIntArray(6);
        Object term5860 = newInstance(Class.forName("example.model.Author"));
        setField(term5804, term5804.getClass(), "id", term5805);
        setField(term5804, term5804.getClass(), "title", "uqDEIRoVVf");
        setField(term5804, term5804.getClass(), "description", "HnLeZhnLzz");
        setField(term5804, term5804.getClass(), "genre", "ziYEsRkZmD");
        setIntField(term5844, term5844.getClass(), "signum", 1);
        setIntElement(term5846, 0, 61136);
        setIntElement(term5846, 1, 154383819);
        setIntElement(term5846, 2, -1659739308);
        setIntElement(term5846, 3, 319184098);
        setIntElement(term5846, 4, 1417930290);
        setIntElement(term5846, 5, 733495999);
        setField(term5844, term5844.getClass(), "mag", term5846);
        setIntField(term5844, term5844.getClass(), "bitCountPlusOne", 0);
        setIntField(term5844, term5844.getClass(), "bitLengthPlusOne", 0);
        setIntField(term5844, term5844.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term5844, term5844.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term5843, term5843.getClass(), "intVal", term5844);
        setIntField(term5843, term5843.getClass(), "scale", 53);
        setIntField(term5843, term5843.getClass(), "precision", 0);
        setField(term5843, term5843.getClass(), "stringCache", null);
        setLongField(term5843, term5843.getClass(), "intCompact", -9223372036854775808L);
        setField(term5804, term5804.getClass(), "price", term5843);
        setField(term5860, term5860.getClass(), "id", term5861);
        setField(term5860, term5860.getClass(), "firstName", "RFbJNwiLtv");
        setField(term5860, term5860.getClass(), "lastName", "eCxWMOpomA");
        setField(term5860, term5860.getClass(), "email", "pkQawlBtEF");
        setField(term5860, term5860.getClass(), "books", term5899);
        setField(term5804, term5804.getClass(), "author", term5860);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("example.model.Book");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "hpTAdtnQku";
        callMethod(klass, "setTitle", argTypes, term5804, args);
    }

};


