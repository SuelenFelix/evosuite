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

public class BookDto_BookDtoBuilder_description_12118509203 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4729;

    public BookDto_BookDtoBuilder_description_12118509203() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4730 = new Long(2443640364875054177L);
        Long term4786 = new Long(-1610676979013636850L);
        term4729 = newInstance(Class.forName("example.dto.BookDto$BookDtoBuilder"));
        Object term4768 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term4769 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term4771 = (int[]) newIntArray(6);
        Object term4785 = newInstance(Class.forName("example.dto.AuthorDto"));
        setField(term4729, term4729.getClass(), "id", term4730);
        setField(term4729, term4729.getClass(), "title", "RbVQXSpxXy");
        setField(term4729, term4729.getClass(), "description", "YpJbIgJWWv");
        setField(term4729, term4729.getClass(), "genre", "JppkknKVOw");
        setIntField(term4769, term4769.getClass(), "signum", 1);
        setIntElement(term4771, 0, 31263);
        setIntElement(term4771, 1, -1965314916);
        setIntElement(term4771, 2, -443046697);
        setIntElement(term4771, 3, -1268253260);
        setIntElement(term4771, 4, -877110081);
        setIntElement(term4771, 5, -1376525969);
        setField(term4769, term4769.getClass(), "mag", term4771);
        setIntField(term4769, term4769.getClass(), "bitCountPlusOne", 0);
        setIntField(term4769, term4769.getClass(), "bitLengthPlusOne", 0);
        setIntField(term4769, term4769.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term4769, term4769.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term4768, term4768.getClass(), "intVal", term4769);
        setIntField(term4768, term4768.getClass(), "scale", 53);
        setIntField(term4768, term4768.getClass(), "precision", 0);
        setField(term4768, term4768.getClass(), "stringCache", null);
        setLongField(term4768, term4768.getClass(), "intCompact", -9223372036854775808L);
        setField(term4729, term4729.getClass(), "price", term4768);
        setField(term4785, term4785.getClass(), "id", term4786);
        setField(term4785, term4785.getClass(), "firstName", "iljANwuEjk");
        setField(term4785, term4785.getClass(), "lastName", "kNqaJKIATy");
        setField(term4785, term4785.getClass(), "email", "vKQukfbJUd");
        setField(term4729, term4729.getClass(), "author", term4785);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("example.dto.BookDto$BookDtoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "lFRJFUMVbx";
        callMethod(klass, "description", argTypes, term4729, args);
    }

};


