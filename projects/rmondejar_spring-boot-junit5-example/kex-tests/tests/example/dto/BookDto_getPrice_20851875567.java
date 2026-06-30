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

public class BookDto_getPrice_20851875567 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term805;

    public BookDto_getPrice_20851875567() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term806 = new Long(-2813493605142626659L);
        Long term862 = new Long(-8885298608300233488L);
        term805 = newInstance(Class.forName("example.dto.BookDto"));
        Object term844 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term845 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term847 = (int[]) newIntArray(6);
        Object term861 = newInstance(Class.forName("example.dto.AuthorDto"));
        setField(term805, term805.getClass(), "id", term806);
        setField(term805, term805.getClass(), "title", "OWDIEULEFu");
        setField(term805, term805.getClass(), "description", "dWRymuLBtr");
        setField(term805, term805.getClass(), "genre", "AijpHYOFuy");
        setIntField(term845, term845.getClass(), "signum", 1);
        setIntElement(term847, 0, 27489);
        setIntElement(term847, 1, -274433180);
        setIntElement(term847, 2, 698548608);
        setIntElement(term847, 3, -1143703655);
        setIntElement(term847, 4, 1619765041);
        setIntElement(term847, 5, -418227111);
        setField(term845, term845.getClass(), "mag", term847);
        setIntField(term845, term845.getClass(), "bitCountPlusOne", 0);
        setIntField(term845, term845.getClass(), "bitLengthPlusOne", 0);
        setIntField(term845, term845.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term845, term845.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term844, term844.getClass(), "intVal", term845);
        setIntField(term844, term844.getClass(), "scale", 53);
        setIntField(term844, term844.getClass(), "precision", 0);
        setField(term844, term844.getClass(), "stringCache", null);
        setLongField(term844, term844.getClass(), "intCompact", -9223372036854775808L);
        setField(term805, term805.getClass(), "price", term844);
        setField(term861, term861.getClass(), "id", term862);
        setField(term861, term861.getClass(), "firstName", "SbAoxhfrkn");
        setField(term861, term861.getClass(), "lastName", "kuTXqwMtDB");
        setField(term861, term861.getClass(), "email", "Ghbwtircqb");
        setField(term805, term805.getClass(), "author", term861);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("example.dto.BookDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPrice", argTypes, term805, args);
    }

};


