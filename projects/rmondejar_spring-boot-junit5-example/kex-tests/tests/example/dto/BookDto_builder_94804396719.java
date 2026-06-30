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

public class BookDto_builder_94804396719 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2899;

    public BookDto_builder_94804396719() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2899 = newInstance(Class.forName("example.dto.BookDto"));
        setField(term2899, term2899.getClass(), "id", null);
        setField(term2899, term2899.getClass(), "title", null);
        setField(term2899, term2899.getClass(), "description", null);
        setField(term2899, term2899.getClass(), "genre", null);
        setField(term2899, term2899.getClass(), "price", null);
        setField(term2899, term2899.getClass(), "author", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("example.dto.BookDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "builder", argTypes, term2899, args);
    }

};


