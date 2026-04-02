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

public class Book_setId_8743707389 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5637;
     Object term5736;

    public Book_setId_8743707389() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term5638 = new Long(-6656996002079682356L);
        Long term5694 = new Long(2166921473521388808L);
        ArrayList term5732 = new ArrayList();
        term5637 = newInstance(Class.forName("example.model.Book"));
        Object term5676 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term5677 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term5679 = (int[]) newIntArray(6);
        Object term5693 = newInstance(Class.forName("example.model.Author"));
        setField(term5637, term5637.getClass(), "id", term5638);
        setField(term5637, term5637.getClass(), "title", "VUVgiQvSYa");
        setField(term5637, term5637.getClass(), "description", "sEGgJJplmE");
        setField(term5637, term5637.getClass(), "genre", "jyexiarswN");
        setIntField(term5677, term5677.getClass(), "signum", 1);
        setIntElement(term5679, 0, 39827);
        setIntElement(term5679, 1, 1410850534);
        setIntElement(term5679, 2, -2124136650);
        setIntElement(term5679, 3, -921956271);
        setIntElement(term5679, 4, -1767307365);
        setIntElement(term5679, 5, 473475437);
        setField(term5677, term5677.getClass(), "mag", term5679);
        setIntField(term5677, term5677.getClass(), "bitCountPlusOne", 0);
        setIntField(term5677, term5677.getClass(), "bitLengthPlusOne", 0);
        setIntField(term5677, term5677.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term5677, term5677.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term5676, term5676.getClass(), "intVal", term5677);
        setIntField(term5676, term5676.getClass(), "scale", 53);
        setIntField(term5676, term5676.getClass(), "precision", 0);
        setField(term5676, term5676.getClass(), "stringCache", null);
        setLongField(term5676, term5676.getClass(), "intCompact", -9223372036854775808L);
        setField(term5637, term5637.getClass(), "price", term5676);
        setField(term5693, term5693.getClass(), "id", term5694);
        setField(term5693, term5693.getClass(), "firstName", "ZBLFNFVEHD");
        setField(term5693, term5693.getClass(), "lastName", "miNxpUfOyL");
        setField(term5693, term5693.getClass(), "email", "BAPTojeHRU");
        setField(term5693, term5693.getClass(), "books", term5732);
        setField(term5637, term5637.getClass(), "author", term5693);
        term5736 = new Long(1964822153944985001L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("example.model.Book");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term5736;
        callMethod(klass, "setId", argTypes, term5637, args);
    }

};


