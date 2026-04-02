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

public class BookDto_setTitle_187121564310 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1290;

    public BookDto_setTitle_187121564310() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1291 = new Long(5127676408959197577L);
        Long term1347 = new Long(-6573104506744284592L);
        term1290 = newInstance(Class.forName("example.dto.BookDto"));
        Object term1329 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term1330 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term1332 = (int[]) newIntArray(6);
        Object term1346 = newInstance(Class.forName("example.dto.AuthorDto"));
        setField(term1290, term1290.getClass(), "id", term1291);
        setField(term1290, term1290.getClass(), "title", "xLbjWUgOIL");
        setField(term1290, term1290.getClass(), "description", "jDtqGUpnZN");
        setField(term1290, term1290.getClass(), "genre", "nGKItKLYNC");
        setIntField(term1330, term1330.getClass(), "signum", 1);
        setIntElement(term1332, 0, 4157);
        setIntElement(term1332, 1, -1258399411);
        setIntElement(term1332, 2, -1445096589);
        setIntElement(term1332, 3, 1602721280);
        setIntElement(term1332, 4, 1738795194);
        setIntElement(term1332, 5, -481877419);
        setField(term1330, term1330.getClass(), "mag", term1332);
        setIntField(term1330, term1330.getClass(), "bitCountPlusOne", 0);
        setIntField(term1330, term1330.getClass(), "bitLengthPlusOne", 0);
        setIntField(term1330, term1330.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term1330, term1330.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term1329, term1329.getClass(), "intVal", term1330);
        setIntField(term1329, term1329.getClass(), "scale", 52);
        setIntField(term1329, term1329.getClass(), "precision", 0);
        setField(term1329, term1329.getClass(), "stringCache", null);
        setLongField(term1329, term1329.getClass(), "intCompact", -9223372036854775808L);
        setField(term1290, term1290.getClass(), "price", term1329);
        setField(term1346, term1346.getClass(), "id", term1347);
        setField(term1346, term1346.getClass(), "firstName", "UiUYnPrcCi");
        setField(term1346, term1346.getClass(), "lastName", "UoYtihxVaS");
        setField(term1346, term1346.getClass(), "email", "JDswTTCZHV");
        setField(term1290, term1290.getClass(), "author", term1346);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("example.dto.BookDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "onpbIeEKoi";
        callMethod(klass, "setTitle", argTypes, term1290, args);
    }

};


