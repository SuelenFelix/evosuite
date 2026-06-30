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

public class Book_getGenre_169811398725 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7570;

    public Book_getGenre_169811398725() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7570 = newInstance(Class.forName("example.model.Book"));
        setField(term7570, term7570.getClass(), "id", null);
        setField(term7570, term7570.getClass(), "title", null);
        setField(term7570, term7570.getClass(), "description", null);
        setField(term7570, term7570.getClass(), "genre", null);
        setField(term7570, term7570.getClass(), "price", null);
        setField(term7570, term7570.getClass(), "author", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("example.model.Book");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getGenre", argTypes, term7570, args);
    }

};


