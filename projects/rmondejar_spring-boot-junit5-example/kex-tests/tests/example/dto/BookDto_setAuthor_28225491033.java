package example.dto;

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
import static example.dto.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class BookDto_setAuthor_28225491033 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2911;

    public BookDto_setAuthor_28225491033() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2911 = newInstance(Class.forName("example.dto.BookDto"));
        setField(term2911, term2911.getClass(), "id", null);
        setField(term2911, term2911.getClass(), "title", null);
        setField(term2911, term2911.getClass(), "description", null);
        setField(term2911, term2911.getClass(), "genre", null);
        setField(term2911, term2911.getClass(), "price", null);
        setField(term2911, term2911.getClass(), "author", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("example.dto.BookDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("example.dto.AuthorDto");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setAuthor", argTypes, term2911, args);
    }

};


