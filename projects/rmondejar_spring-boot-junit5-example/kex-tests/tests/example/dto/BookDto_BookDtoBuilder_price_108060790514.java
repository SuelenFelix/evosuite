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

public class BookDto_BookDtoBuilder_price_108060790514 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5835;

    public BookDto_BookDtoBuilder_price_108060790514() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5835 = newInstance(Class.forName("example.dto.BookDto$BookDtoBuilder"));
        setField(term5835, term5835.getClass(), "id", null);
        setField(term5835, term5835.getClass(), "title", null);
        setField(term5835, term5835.getClass(), "description", null);
        setField(term5835, term5835.getClass(), "genre", null);
        setField(term5835, term5835.getClass(), "price", null);
        setField(term5835, term5835.getClass(), "author", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("example.dto.BookDto$BookDtoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.math.BigDecimal");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "price", argTypes, term5835, args);
    }

};


