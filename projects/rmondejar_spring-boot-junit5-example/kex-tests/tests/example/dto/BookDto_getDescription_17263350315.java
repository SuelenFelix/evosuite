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

public class BookDto_getDescription_17263350315 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term483;

    public BookDto_getDescription_17263350315() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term484 = new Long(4872422362414183754L);
        Long term540 = new Long(6811161968424632369L);
        term483 = newInstance(Class.forName("example.dto.BookDto"));
        Object term522 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term523 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term525 = (int[]) newIntArray(6);
        Object term539 = newInstance(Class.forName("example.dto.AuthorDto"));
        setField(term483, term483.getClass(), "id", term484);
        setField(term483, term483.getClass(), "title", "HyxfbSQYBe");
        setField(term483, term483.getClass(), "description", "pCTimMblYc");
        setField(term483, term483.getClass(), "genre", "hNxWaHcfhY");
        setIntField(term523, term523.getClass(), "signum", 1);
        setIntElement(term525, 0, 3726);
        setIntElement(term525, 1, 1561510548);
        setIntElement(term525, 2, 756973629);
        setIntElement(term525, 3, -1169068666);
        setIntElement(term525, 4, -1772498162);
        setIntElement(term525, 5, -1207241473);
        setField(term523, term523.getClass(), "mag", term525);
        setIntField(term523, term523.getClass(), "bitCountPlusOne", 0);
        setIntField(term523, term523.getClass(), "bitLengthPlusOne", 0);
        setIntField(term523, term523.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term523, term523.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term522, term522.getClass(), "intVal", term523);
        setIntField(term522, term522.getClass(), "scale", 52);
        setIntField(term522, term522.getClass(), "precision", 0);
        setField(term522, term522.getClass(), "stringCache", null);
        setLongField(term522, term522.getClass(), "intCompact", -9223372036854775808L);
        setField(term483, term483.getClass(), "price", term522);
        setField(term539, term539.getClass(), "id", term540);
        setField(term539, term539.getClass(), "firstName", "RkybSrpybU");
        setField(term539, term539.getClass(), "lastName", "xOEqzGAmDU");
        setField(term539, term539.getClass(), "email", "eZFUvlxvGV");
        setField(term483, term483.getClass(), "author", term539);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("example.dto.BookDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDescription", argTypes, term483, args);
    }

};


