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

public class Book_equals_7918655316 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7044;
     Object term7157;

    public Book_equals_7918655316() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term7045 = new Long(-8697239524885136781L);
        Long term7101 = new Long(6465539339431559532L);
        Long term7142 = new Long(-5304831679802174866L);
        Object term7141 = newInstance(Class.forName("example.model.Book"));
        setField(term7141, term7141.getClass(), "id", term7142);
        setField(term7141, term7141.getClass(), "title", null);
        setField(term7141, term7141.getClass(), "description", null);
        setField(term7141, term7141.getClass(), "genre", null);
        setField(term7141, term7141.getClass(), "price", null);
        setField(term7141, term7141.getClass(), "author", null);
        Long term7145 = new Long(-1211273460223868511L);
        Object term7144 = newInstance(Class.forName("example.model.Book"));
        setField(term7144, term7144.getClass(), "id", term7145);
        setField(term7144, term7144.getClass(), "title", null);
        setField(term7144, term7144.getClass(), "description", null);
        setField(term7144, term7144.getClass(), "genre", null);
        setField(term7144, term7144.getClass(), "price", null);
        setField(term7144, term7144.getClass(), "author", null);
        Object term7147 = newInstance(Class.forName("example.model.Book"));
        setField(term7147, term7147.getClass(), "id", null);
        setField(term7147, term7147.getClass(), "title", null);
        setField(term7147, term7147.getClass(), "description", null);
        setField(term7147, term7147.getClass(), "genre", null);
        setField(term7147, term7147.getClass(), "price", null);
        setField(term7147, term7147.getClass(), "author", null);
        Object term7148 = newInstance(Class.forName("example.model.Book"));
        setField(term7148, term7148.getClass(), "id", null);
        setField(term7148, term7148.getClass(), "title", null);
        setField(term7148, term7148.getClass(), "description", null);
        setField(term7148, term7148.getClass(), "genre", null);
        setField(term7148, term7148.getClass(), "price", null);
        setField(term7148, term7148.getClass(), "author", null);
        Long term7150 = new Long(-4561371668792438386L);
        Object term7149 = newInstance(Class.forName("example.model.Book"));
        setField(term7149, term7149.getClass(), "id", term7150);
        setField(term7149, term7149.getClass(), "title", null);
        setField(term7149, term7149.getClass(), "description", null);
        setField(term7149, term7149.getClass(), "genre", null);
        setField(term7149, term7149.getClass(), "price", null);
        setField(term7149, term7149.getClass(), "author", null);
        Long term7153 = new Long(8499930868919012909L);
        Object term7152 = newInstance(Class.forName("example.model.Book"));
        setField(term7152, term7152.getClass(), "id", term7153);
        setField(term7152, term7152.getClass(), "title", null);
        setField(term7152, term7152.getClass(), "description", null);
        setField(term7152, term7152.getClass(), "genre", null);
        setField(term7152, term7152.getClass(), "price", null);
        setField(term7152, term7152.getClass(), "author", null);
        ArrayList term7139 = new ArrayList();
        ((ArrayList) term7139).add(term7141);
        ((ArrayList) term7139).add(term7144);
        ((ArrayList) term7139).add(term7144);
        ((ArrayList) term7139).add(term7141);
        ((ArrayList) term7139).add(term7147);
        ((ArrayList) term7139).add(term7147);
        ((ArrayList) term7139).add(term7148);
        ((ArrayList) term7139).add(term7149);
        ((ArrayList) term7139).add(term7152);
        term7044 = newInstance(Class.forName("example.model.Book"));
        Object term7083 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term7084 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term7086 = (int[]) newIntArray(6);
        Object term7100 = newInstance(Class.forName("example.model.Author"));
        setField(term7044, term7044.getClass(), "id", term7045);
        setField(term7044, term7044.getClass(), "title", "SBTEFDmQVY");
        setField(term7044, term7044.getClass(), "description", "ohZpRiNDZM");
        setField(term7044, term7044.getClass(), "genre", "qEXIxhmUwz");
        setIntField(term7084, term7084.getClass(), "signum", 1);
        setIntElement(term7086, 0, 641);
        setIntElement(term7086, 1, 171441755);
        setIntElement(term7086, 2, -1520436389);
        setIntElement(term7086, 3, -589556909);
        setIntElement(term7086, 4, -1553883168);
        setIntElement(term7086, 5, 2025412197);
        setField(term7084, term7084.getClass(), "mag", term7086);
        setIntField(term7084, term7084.getClass(), "bitCountPlusOne", 0);
        setIntField(term7084, term7084.getClass(), "bitLengthPlusOne", 0);
        setIntField(term7084, term7084.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term7084, term7084.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term7083, term7083.getClass(), "intVal", term7084);
        setIntField(term7083, term7083.getClass(), "scale", 51);
        setIntField(term7083, term7083.getClass(), "precision", 0);
        setField(term7083, term7083.getClass(), "stringCache", null);
        setLongField(term7083, term7083.getClass(), "intCompact", -9223372036854775808L);
        setField(term7044, term7044.getClass(), "price", term7083);
        setField(term7100, term7100.getClass(), "id", term7101);
        setField(term7100, term7100.getClass(), "firstName", "RlyxtfCqKY");
        setField(term7100, term7100.getClass(), "lastName", "kyTUkLCRYm");
        setField(term7100, term7100.getClass(), "email", "oAotZgNUFH");
        setField(term7100, term7100.getClass(), "books", term7139);
        setField(term7044, term7044.getClass(), "author", term7100);
        term7157 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("example.model.Book");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term7157;
        callMethod(klass, "equals", argTypes, term7044, args);
    }

};


