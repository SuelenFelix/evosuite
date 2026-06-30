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

public class BookDto_BookDtoBuilder_price_10806079055 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5095;
     Object term5190;

    public BookDto_BookDtoBuilder_price_10806079055() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term5096 = new Long(414749984815662075L);
        Long term5152 = new Long(463622836963501975L);
        term5095 = newInstance(Class.forName("example.dto.BookDto$BookDtoBuilder"));
        Object term5134 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term5135 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term5137 = (int[]) newIntArray(6);
        Object term5151 = newInstance(Class.forName("example.dto.AuthorDto"));
        setField(term5095, term5095.getClass(), "id", term5096);
        setField(term5095, term5095.getClass(), "title", "XJJNClzHRf");
        setField(term5095, term5095.getClass(), "description", "HDaezxQfQR");
        setField(term5095, term5095.getClass(), "genre", "iikZEapDlu");
        setIntField(term5135, term5135.getClass(), "signum", 1);
        setIntElement(term5137, 0, 29895);
        setIntElement(term5137, 1, 1752172477);
        setIntElement(term5137, 2, 1964732279);
        setIntElement(term5137, 3, 382594040);
        setIntElement(term5137, 4, 1485746598);
        setIntElement(term5137, 5, -1795307845);
        setField(term5135, term5135.getClass(), "mag", term5137);
        setIntField(term5135, term5135.getClass(), "bitCountPlusOne", 0);
        setIntField(term5135, term5135.getClass(), "bitLengthPlusOne", 0);
        setIntField(term5135, term5135.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term5135, term5135.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term5134, term5134.getClass(), "intVal", term5135);
        setIntField(term5134, term5134.getClass(), "scale", 53);
        setIntField(term5134, term5134.getClass(), "precision", 0);
        setField(term5134, term5134.getClass(), "stringCache", null);
        setLongField(term5134, term5134.getClass(), "intCompact", -9223372036854775808L);
        setField(term5095, term5095.getClass(), "price", term5134);
        setField(term5151, term5151.getClass(), "id", term5152);
        setField(term5151, term5151.getClass(), "firstName", "nhoHrZfnIN");
        setField(term5151, term5151.getClass(), "lastName", "ZkMALXpEAZ");
        setField(term5151, term5151.getClass(), "email", "tXfQjSqDzN");
        setField(term5095, term5095.getClass(), "author", term5151);
        term5190 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term5191 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term5193 = (int[]) newIntArray(6);
        setIntField(term5191, term5191.getClass(), "signum", 1);
        setIntElement(term5193, 0, 5222);
        setIntElement(term5193, 1, -454284340);
        setIntElement(term5193, 2, -1412298361);
        setIntElement(term5193, 3, -225970664);
        setIntElement(term5193, 4, -1354448185);
        setIntElement(term5193, 5, -1168679607);
        setField(term5191, term5191.getClass(), "mag", term5193);
        setIntField(term5191, term5191.getClass(), "bitCountPlusOne", 0);
        setIntField(term5191, term5191.getClass(), "bitLengthPlusOne", 0);
        setIntField(term5191, term5191.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term5191, term5191.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term5190, term5190.getClass(), "intVal", term5191);
        setIntField(term5190, term5190.getClass(), "scale", 52);
        setIntField(term5190, term5190.getClass(), "precision", 0);
        setField(term5190, term5190.getClass(), "stringCache", null);
        setLongField(term5190, term5190.getClass(), "intCompact", -9223372036854775808L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("example.dto.BookDto$BookDtoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.math.BigDecimal");
        Object[] args = new Object[1];
        args[0] = term5190;
        callMethod(klass, "price", argTypes, term5095, args);
    }

};


