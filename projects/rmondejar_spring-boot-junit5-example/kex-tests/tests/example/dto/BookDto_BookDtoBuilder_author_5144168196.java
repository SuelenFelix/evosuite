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

public class BookDto_BookDtoBuilder_author_5144168196 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5279;
     Object term5374;

    public BookDto_BookDtoBuilder_author_5144168196() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term5280 = new Long(305759998609888272L);
        Long term5336 = new Long(-8654565919063661957L);
        term5279 = newInstance(Class.forName("example.dto.BookDto$BookDtoBuilder"));
        Object term5318 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term5319 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term5321 = (int[]) newIntArray(6);
        Object term5335 = newInstance(Class.forName("example.dto.AuthorDto"));
        setField(term5279, term5279.getClass(), "id", term5280);
        setField(term5279, term5279.getClass(), "title", "BjugTaMcxJ");
        setField(term5279, term5279.getClass(), "description", "vGiuZVPJNH");
        setField(term5279, term5279.getClass(), "genre", "tlzpzIjMib");
        setIntField(term5319, term5319.getClass(), "signum", 1);
        setIntElement(term5321, 0, 92);
        setIntElement(term5321, 1, 1034738575);
        setIntElement(term5321, 2, -1456630577);
        setIntElement(term5321, 3, -1449292938);
        setIntElement(term5321, 4, -1319116780);
        setIntElement(term5321, 5, 1851590535);
        setField(term5319, term5319.getClass(), "mag", term5321);
        setIntField(term5319, term5319.getClass(), "bitCountPlusOne", 0);
        setIntField(term5319, term5319.getClass(), "bitLengthPlusOne", 0);
        setIntField(term5319, term5319.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term5319, term5319.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term5318, term5318.getClass(), "intVal", term5319);
        setIntField(term5318, term5318.getClass(), "scale", 51);
        setIntField(term5318, term5318.getClass(), "precision", 0);
        setField(term5318, term5318.getClass(), "stringCache", null);
        setLongField(term5318, term5318.getClass(), "intCompact", -9223372036854775808L);
        setField(term5279, term5279.getClass(), "price", term5318);
        setField(term5335, term5335.getClass(), "id", term5336);
        setField(term5335, term5335.getClass(), "firstName", "AZdLeSugwv");
        setField(term5335, term5335.getClass(), "lastName", "RMsXuyzKJV");
        setField(term5335, term5335.getClass(), "email", "FwPbDZcHmB");
        setField(term5279, term5279.getClass(), "author", term5335);
        Long term5375 = new Long(-5248475803419977214L);
        term5374 = newInstance(Class.forName("example.dto.AuthorDto"));
        setField(term5374, term5374.getClass(), "id", term5375);
        setField(term5374, term5374.getClass(), "firstName", "hOncybyCAH");
        setField(term5374, term5374.getClass(), "lastName", "QduALnDSVo");
        setField(term5374, term5374.getClass(), "email", "izPpKDErnQ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("example.dto.BookDto$BookDtoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("example.dto.AuthorDto");
        Object[] args = new Object[1];
        args[0] = term5374;
        callMethod(klass, "author", argTypes, term5279, args);
    }

};


