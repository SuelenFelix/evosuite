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

public class BookDto_getAuthor_19127848628 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term966;

    public BookDto_getAuthor_19127848628() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term967 = new Long(-4325723315152823407L);
        Long term1023 = new Long(2535595959091595249L);
        term966 = newInstance(Class.forName("example.dto.BookDto"));
        Object term1005 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term1006 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term1008 = (int[]) newIntArray(6);
        Object term1022 = newInstance(Class.forName("example.dto.AuthorDto"));
        setField(term966, term966.getClass(), "id", term967);
        setField(term966, term966.getClass(), "title", "xrwlQZdwCp");
        setField(term966, term966.getClass(), "description", "IDCWpPLRkE");
        setField(term966, term966.getClass(), "genre", "nyiiPDVjAc");
        setIntField(term1006, term1006.getClass(), "signum", 1);
        setIntElement(term1008, 0, 1807);
        setIntElement(term1008, 1, 1210968587);
        setIntElement(term1008, 2, -857410878);
        setIntElement(term1008, 3, 520383771);
        setIntElement(term1008, 4, 2106706510);
        setIntElement(term1008, 5, 1731185477);
        setField(term1006, term1006.getClass(), "mag", term1008);
        setIntField(term1006, term1006.getClass(), "bitCountPlusOne", 0);
        setIntField(term1006, term1006.getClass(), "bitLengthPlusOne", 0);
        setIntField(term1006, term1006.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term1006, term1006.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term1005, term1005.getClass(), "intVal", term1006);
        setIntField(term1005, term1005.getClass(), "scale", 52);
        setIntField(term1005, term1005.getClass(), "precision", 0);
        setField(term1005, term1005.getClass(), "stringCache", null);
        setLongField(term1005, term1005.getClass(), "intCompact", -9223372036854775808L);
        setField(term966, term966.getClass(), "price", term1005);
        setField(term1022, term1022.getClass(), "id", term1023);
        setField(term1022, term1022.getClass(), "firstName", "aKnKipADSo");
        setField(term1022, term1022.getClass(), "lastName", "wSQxaModmm");
        setField(term1022, term1022.getClass(), "email", "UlajhuVLaP");
        setField(term966, term966.getClass(), "author", term1022);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("example.dto.BookDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAuthor", argTypes, term966, args);
    }

};


