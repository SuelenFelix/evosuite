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

public class Book_init_11934450732 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4419;
     Object term4457;
     Object term4474;

    public Book_init_11934450732() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4419 = new Long(-6837989212848250735L);
        term4457 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term4458 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term4460 = (int[]) newIntArray(6);
        setIntField(term4458, term4458.getClass(), "signum", 1);
        setIntElement(term4460, 0, 50937);
        setIntElement(term4460, 1, -1815840123);
        setIntElement(term4460, 2, -373108466);
        setIntElement(term4460, 3, -1576190009);
        setIntElement(term4460, 4, 1402501184);
        setIntElement(term4460, 5, -1641648957);
        setField(term4458, term4458.getClass(), "mag", term4460);
        setIntField(term4458, term4458.getClass(), "bitCountPlusOne", 0);
        setIntField(term4458, term4458.getClass(), "bitLengthPlusOne", 0);
        setIntField(term4458, term4458.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term4458, term4458.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term4457, term4457.getClass(), "intVal", term4458);
        setIntField(term4457, term4457.getClass(), "scale", 53);
        setIntField(term4457, term4457.getClass(), "precision", 0);
        setField(term4457, term4457.getClass(), "stringCache", null);
        setLongField(term4457, term4457.getClass(), "intCompact", -9223372036854775808L);
        Long term4475 = new Long(-4231979631084175364L);
        Long term4516 = new Long(1634166935474035772L);
        Long term4526 = new Long(-2614906266506360948L);
        Object term4515 = newInstance(Class.forName("example.model.Book"));
        Object term4521 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term4525 = newInstance(Class.forName("example.model.Author"));
        setField(term4515, term4515.getClass(), "id", term4516);
        setField(term4515, term4515.getClass(), "title", "");
        setField(term4515, term4515.getClass(), "description", "");
        setField(term4515, term4515.getClass(), "genre", "");
        setField(term4521, term4521.getClass(), "intVal", null);
        setIntField(term4521, term4521.getClass(), "scale", 52);
        setIntField(term4521, term4521.getClass(), "precision", 0);
        setField(term4521, term4521.getClass(), "stringCache", null);
        setLongField(term4521, term4521.getClass(), "intCompact", -9223372036854775808L);
        setField(term4515, term4515.getClass(), "price", term4521);
        setField(term4525, term4525.getClass(), "id", term4526);
        setField(term4525, term4525.getClass(), "firstName", null);
        setField(term4525, term4525.getClass(), "lastName", null);
        setField(term4525, term4525.getClass(), "email", null);
        setField(term4525, term4525.getClass(), "books", null);
        setField(term4515, term4515.getClass(), "author", term4525);
        ArrayList term4513 = new ArrayList();
        ((ArrayList) term4513).add(term4515);
        term4474 = newInstance(Class.forName("example.model.Author"));
        setField(term4474, term4474.getClass(), "id", term4475);
        setField(term4474, term4474.getClass(), "firstName", "AQTTebOiZR");
        setField(term4474, term4474.getClass(), "lastName", "mgeIhswNtk");
        setField(term4474, term4474.getClass(), "email", "QwKYpiVQlL");
        setField(term4474, term4474.getClass(), "books", term4513);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("example.model.Book");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = Class.forName("java.lang.Long");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("java.lang.String");
        argTypes[4] = Class.forName("java.math.BigDecimal");
        argTypes[5] = Class.forName("example.model.Author");
        Object[] args = new Object[6];
        args[0] = term4419;
        args[1] = "XzZbAcRADD";
        args[2] = "UqSNWSoTRy";
        args[3] = "VesRqDfjMa";
        args[4] = term4457;
        args[5] = term4474;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


