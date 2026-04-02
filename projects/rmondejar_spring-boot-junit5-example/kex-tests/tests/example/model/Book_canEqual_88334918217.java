package example.model;

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
import static example.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;
import java.util.ArrayList;

public class Book_canEqual_88334918217 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7224;
     Object term7331;

    public Book_canEqual_88334918217() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term7225 = new Long(2243864141567980599L);
        Long term7281 = new Long(353705949229610067L);
        Long term7322 = new Long(3288572082902580031L);
        Object term7321 = newInstance(Class.forName("example.model.Book"));
        setField(term7321, term7321.getClass(), "id", term7322);
        setField(term7321, term7321.getClass(), "title", null);
        setField(term7321, term7321.getClass(), "description", null);
        setField(term7321, term7321.getClass(), "genre", null);
        setField(term7321, term7321.getClass(), "price", null);
        setField(term7321, term7321.getClass(), "author", null);
        Object term7324 = newInstance(Class.forName("example.model.Book"));
        setField(term7324, term7324.getClass(), "id", null);
        setField(term7324, term7324.getClass(), "title", null);
        setField(term7324, term7324.getClass(), "description", null);
        setField(term7324, term7324.getClass(), "genre", null);
        setField(term7324, term7324.getClass(), "price", null);
        setField(term7324, term7324.getClass(), "author", null);
        Object term7325 = newInstance(Class.forName("example.model.Book"));
        setField(term7325, term7325.getClass(), "id", null);
        setField(term7325, term7325.getClass(), "title", null);
        setField(term7325, term7325.getClass(), "description", null);
        setField(term7325, term7325.getClass(), "genre", null);
        setField(term7325, term7325.getClass(), "price", null);
        setField(term7325, term7325.getClass(), "author", null);
        Long term7327 = new Long(-1283563319051310751L);
        Object term7326 = newInstance(Class.forName("example.model.Book"));
        setField(term7326, term7326.getClass(), "id", term7327);
        setField(term7326, term7326.getClass(), "title", null);
        setField(term7326, term7326.getClass(), "description", null);
        setField(term7326, term7326.getClass(), "genre", null);
        setField(term7326, term7326.getClass(), "price", null);
        setField(term7326, term7326.getClass(), "author", null);
        ArrayList term7319 = new ArrayList();
        ((ArrayList) term7319).add(term7321);
        ((ArrayList) term7319).add(term7324);
        ((ArrayList) term7319).add(term7325);
        ((ArrayList) term7319).add(term7325);
        ((ArrayList) term7319).add(term7326);
        term7224 = newInstance(Class.forName("example.model.Book"));
        Object term7263 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term7264 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term7266 = (int[]) newIntArray(6);
        Object term7280 = newInstance(Class.forName("example.model.Author"));
        setField(term7224, term7224.getClass(), "id", term7225);
        setField(term7224, term7224.getClass(), "title", "zpCKXLOzse");
        setField(term7224, term7224.getClass(), "description", "qhlWSiHAHt");
        setField(term7224, term7224.getClass(), "genre", "XrKIhxpIJD");
        setIntField(term7264, term7264.getClass(), "signum", 1);
        setIntElement(term7266, 0, 16536);
        setIntElement(term7266, 1, -1012180596);
        setIntElement(term7266, 2, -837399896);
        setIntElement(term7266, 3, -502241831);
        setIntElement(term7266, 4, 289516973);
        setIntElement(term7266, 5, 1359703941);
        setField(term7264, term7264.getClass(), "mag", term7266);
        setIntField(term7264, term7264.getClass(), "bitCountPlusOne", 0);
        setIntField(term7264, term7264.getClass(), "bitLengthPlusOne", 0);
        setIntField(term7264, term7264.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term7264, term7264.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term7263, term7263.getClass(), "intVal", term7264);
        setIntField(term7263, term7263.getClass(), "scale", 53);
        setIntField(term7263, term7263.getClass(), "precision", 0);
        setField(term7263, term7263.getClass(), "stringCache", null);
        setLongField(term7263, term7263.getClass(), "intCompact", -9223372036854775808L);
        setField(term7224, term7224.getClass(), "price", term7263);
        setField(term7280, term7280.getClass(), "id", term7281);
        setField(term7280, term7280.getClass(), "firstName", "RSuRSjiLvm");
        setField(term7280, term7280.getClass(), "lastName", "aoeNWgMpNx");
        setField(term7280, term7280.getClass(), "email", "RQvXfSweVs");
        setField(term7280, term7280.getClass(), "books", term7319);
        setField(term7224, term7224.getClass(), "author", term7280);
        term7331 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("example.model.Book");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term7331;
        callMethod(klass, "canEqual", argTypes, term7224, args);
    }

};


