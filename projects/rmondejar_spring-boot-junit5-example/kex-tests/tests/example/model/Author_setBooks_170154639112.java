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
import java.util.LinkedList;

public class Author_setBooks_170154639112 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2221;
     Object term2277;

    public Author_setBooks_170154639112() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2222 = new Long(-593735869267672817L);
        Long term2263 = new Long(6041374912351843923L);
        Long term2273 = new Long(2535970782317488741L);
        Object term2262 = newInstance(Class.forName("example.model.Book"));
        Object term2268 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term2272 = newInstance(Class.forName("example.model.Author"));
        setField(term2262, term2262.getClass(), "id", term2263);
        setField(term2262, term2262.getClass(), "title", "");
        setField(term2262, term2262.getClass(), "description", "");
        setField(term2262, term2262.getClass(), "genre", "");
        setField(term2268, term2268.getClass(), "intVal", null);
        setIntField(term2268, term2268.getClass(), "scale", 52);
        setIntField(term2268, term2268.getClass(), "precision", 0);
        setField(term2268, term2268.getClass(), "stringCache", null);
        setLongField(term2268, term2268.getClass(), "intCompact", -9223372036854775808L);
        setField(term2262, term2262.getClass(), "price", term2268);
        setField(term2272, term2272.getClass(), "id", term2273);
        setField(term2272, term2272.getClass(), "firstName", null);
        setField(term2272, term2272.getClass(), "lastName", null);
        setField(term2272, term2272.getClass(), "email", null);
        setField(term2272, term2272.getClass(), "books", null);
        setField(term2262, term2262.getClass(), "author", term2272);
        ArrayList term2260 = new ArrayList();
        ((ArrayList) term2260).add(term2262);
        term2221 = newInstance(Class.forName("example.model.Author"));
        setField(term2221, term2221.getClass(), "id", term2222);
        setField(term2221, term2221.getClass(), "firstName", "jDFNSuvZqm");
        setField(term2221, term2221.getClass(), "lastName", "pLvkKHqNYX");
        setField(term2221, term2221.getClass(), "email", "PwqnuJJwjR");
        setField(term2221, term2221.getClass(), "books", term2260);
        term2277 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("example.model.Author");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term2277;
        callMethod(klass, "setBooks", argTypes, term2221, args);
    }

};


