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
import java.util.LinkedList;
import java.lang.Object;
import java.util.ArrayList;

public class Author_init_15029485682 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term865;
     Object term903;

    public Author_init_15029485682() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term865 = new Long(-1832940336320585644L);
        Long term907 = new Long(-8033714905181142681L);
        Long term956 = new Long(-9040825890007374809L);
        ArrayList term961 = new ArrayList();
        ((ArrayList) term961).add((Object)null);
        ((ArrayList) term961).add((Object)null);
        ((ArrayList) term961).add((Object)null);
        ((ArrayList) term961).add((Object)null);
        ((ArrayList) term961).add((Object)null);
        ((ArrayList) term961).add((Object)null);
        ((ArrayList) term961).add((Object)null);
        ((ArrayList) term961).add((Object)null);
        Object term906 = newInstance(Class.forName("example.model.Book"));
        Object term945 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term946 = newInstance(Class.forName("java.math.BigInteger"));
        Object term955 = newInstance(Class.forName("example.model.Author"));
        setField(term906, term906.getClass(), "id", term907);
        setField(term906, term906.getClass(), "title", "QSrDQfEsTR");
        setField(term906, term906.getClass(), "description", "PsqusYmejD");
        setField(term906, term906.getClass(), "genre", "NTWMiBEaDF");
        setIntField(term946, term946.getClass(), "signum", 1);
        setField(term946, term946.getClass(), "mag", null);
        setIntField(term946, term946.getClass(), "bitCountPlusOne", 0);
        setIntField(term946, term946.getClass(), "bitLengthPlusOne", 0);
        setIntField(term946, term946.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term946, term946.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term945, term945.getClass(), "intVal", term946);
        setIntField(term945, term945.getClass(), "scale", 53);
        setIntField(term945, term945.getClass(), "precision", 0);
        setField(term945, term945.getClass(), "stringCache", null);
        setLongField(term945, term945.getClass(), "intCompact", -9223372036854775808L);
        setField(term906, term906.getClass(), "price", term945);
        setField(term955, term955.getClass(), "id", term956);
        setField(term955, term955.getClass(), "firstName", "");
        setField(term955, term955.getClass(), "lastName", "");
        setField(term955, term955.getClass(), "email", "");
        setField(term955, term955.getClass(), "books", term961);
        setField(term906, term906.getClass(), "author", term955);
        Long term966 = new Long(-6342139649364011743L);
        Long term976 = new Long(-4924950707540628022L);
        Object term965 = newInstance(Class.forName("example.model.Book"));
        Object term971 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term975 = newInstance(Class.forName("example.model.Author"));
        setField(term965, term965.getClass(), "id", term966);
        setField(term965, term965.getClass(), "title", "");
        setField(term965, term965.getClass(), "description", "");
        setField(term965, term965.getClass(), "genre", "");
        setField(term971, term971.getClass(), "intVal", null);
        setIntField(term971, term971.getClass(), "scale", 53);
        setIntField(term971, term971.getClass(), "precision", 0);
        setField(term971, term971.getClass(), "stringCache", null);
        setLongField(term971, term971.getClass(), "intCompact", -9223372036854775808L);
        setField(term965, term965.getClass(), "price", term971);
        setField(term975, term975.getClass(), "id", term976);
        setField(term975, term975.getClass(), "firstName", null);
        setField(term975, term975.getClass(), "lastName", null);
        setField(term975, term975.getClass(), "email", null);
        setField(term975, term975.getClass(), "books", null);
        setField(term965, term965.getClass(), "author", term975);
        Long term980 = new Long(8313800941204938919L);
        Object term979 = newInstance(Class.forName("example.model.Book"));
        setField(term979, term979.getClass(), "id", term980);
        setField(term979, term979.getClass(), "title", null);
        setField(term979, term979.getClass(), "description", null);
        setField(term979, term979.getClass(), "genre", null);
        setField(term979, term979.getClass(), "price", null);
        setField(term979, term979.getClass(), "author", null);
        term903 = new LinkedList();
        ((LinkedList) term903).add(term906);
        ((LinkedList) term903).add(term965);
        ((LinkedList) term903).add(term979);
        ((LinkedList) term903).add((Object)null);
        ((LinkedList) term903).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("example.model.Author");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("java.lang.Long");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("java.lang.String");
        argTypes[4] = Class.forName("java.util.List");
        Object[] args = new Object[5];
        args[0] = term865;
        args[1] = "DzHVBMqWtE";
        args[2] = "THZSpzBRYP";
        args[3] = "ZfBIVGBQOE";
        args[4] = term903;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


