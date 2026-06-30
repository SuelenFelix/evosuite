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

public class Book_BookBuilder_author_78511250215 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4416;

    public Book_BookBuilder_author_78511250215() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4416 = newInstance(Class.forName("example.model.Book$BookBuilder"));
        setField(term4416, term4416.getClass(), "id", null);
        setField(term4416, term4416.getClass(), "title", null);
        setField(term4416, term4416.getClass(), "description", null);
        setField(term4416, term4416.getClass(), "genre", null);
        setField(term4416, term4416.getClass(), "price", null);
        setField(term4416, term4416.getClass(), "author", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("example.model.Book$BookBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("example.model.Author");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "author", argTypes, term4416, args);
    }

};


