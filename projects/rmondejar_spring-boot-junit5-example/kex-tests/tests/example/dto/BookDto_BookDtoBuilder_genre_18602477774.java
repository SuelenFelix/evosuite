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
import java.lang.Long;
import java.lang.Object;

public class BookDto_BookDtoBuilder_genre_18602477774 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4912;

    public BookDto_BookDtoBuilder_genre_18602477774() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4913 = new Long(2062173786000223358L);
        Long term4969 = new Long(-8658027316505137504L);
        term4912 = newInstance(Class.forName("example.dto.BookDto$BookDtoBuilder"));
        Object term4951 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term4952 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term4954 = (int[]) newIntArray(6);
        Object term4968 = newInstance(Class.forName("example.dto.AuthorDto"));
        setField(term4912, term4912.getClass(), "id", term4913);
        setField(term4912, term4912.getClass(), "title", "sZdUNdggUW");
        setField(term4912, term4912.getClass(), "description", "OqbwYQfvAe");
        setField(term4912, term4912.getClass(), "genre", "tRxZafjqIx");
        setIntField(term4952, term4952.getClass(), "signum", 1);
        setIntElement(term4954, 0, 5883);
        setIntElement(term4954, 1, 833709085);
        setIntElement(term4954, 2, 749794735);
        setIntElement(term4954, 3, 825830368);
        setIntElement(term4954, 4, 935494074);
        setIntElement(term4954, 5, -2012885541);
        setField(term4952, term4952.getClass(), "mag", term4954);
        setIntField(term4952, term4952.getClass(), "bitCountPlusOne", 0);
        setIntField(term4952, term4952.getClass(), "bitLengthPlusOne", 0);
        setIntField(term4952, term4952.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term4952, term4952.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term4951, term4951.getClass(), "intVal", term4952);
        setIntField(term4951, term4951.getClass(), "scale", 52);
        setIntField(term4951, term4951.getClass(), "precision", 0);
        setField(term4951, term4951.getClass(), "stringCache", null);
        setLongField(term4951, term4951.getClass(), "intCompact", -9223372036854775808L);
        setField(term4912, term4912.getClass(), "price", term4951);
        setField(term4968, term4968.getClass(), "id", term4969);
        setField(term4968, term4968.getClass(), "firstName", "DhjNLmRMCu");
        setField(term4968, term4968.getClass(), "lastName", "PgPzMSEjjX");
        setField(term4968, term4968.getClass(), "email", "wzsPSPcRdj");
        setField(term4912, term4912.getClass(), "author", term4968);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("example.dto.BookDto$BookDtoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "kGMQdqJYyB";
        callMethod(klass, "genre", argTypes, term4912, args);
    }

};


