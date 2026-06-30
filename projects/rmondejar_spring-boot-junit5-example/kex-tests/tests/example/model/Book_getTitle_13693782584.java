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

public class Book_getTitle_13693782584 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4767;

    public Book_getTitle_13693782584() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4768 = new Long(-5903549884298836343L);
        Long term4824 = new Long(-3058119213533262883L);
        Long term4865 = new Long(1950957495500453461L);
        Object term4864 = newInstance(Class.forName("example.model.Book"));
        setField(term4864, term4864.getClass(), "id", term4865);
        setField(term4864, term4864.getClass(), "title", null);
        setField(term4864, term4864.getClass(), "description", null);
        setField(term4864, term4864.getClass(), "genre", null);
        setField(term4864, term4864.getClass(), "price", null);
        setField(term4864, term4864.getClass(), "author", null);
        Long term4868 = new Long(206360660645917003L);
        Object term4867 = newInstance(Class.forName("example.model.Book"));
        setField(term4867, term4867.getClass(), "id", term4868);
        setField(term4867, term4867.getClass(), "title", null);
        setField(term4867, term4867.getClass(), "description", null);
        setField(term4867, term4867.getClass(), "genre", null);
        setField(term4867, term4867.getClass(), "price", null);
        setField(term4867, term4867.getClass(), "author", null);
        Long term4871 = new Long(-6237686742902369498L);
        Object term4870 = newInstance(Class.forName("example.model.Book"));
        setField(term4870, term4870.getClass(), "id", term4871);
        setField(term4870, term4870.getClass(), "title", null);
        setField(term4870, term4870.getClass(), "description", null);
        setField(term4870, term4870.getClass(), "genre", null);
        setField(term4870, term4870.getClass(), "price", null);
        setField(term4870, term4870.getClass(), "author", null);
        ArrayList term4862 = new ArrayList();
        ((ArrayList) term4862).add(term4864);
        ((ArrayList) term4862).add(term4867);
        ((ArrayList) term4862).add(term4870);
        term4767 = newInstance(Class.forName("example.model.Book"));
        Object term4806 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term4807 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term4809 = (int[]) newIntArray(6);
        Object term4823 = newInstance(Class.forName("example.model.Author"));
        setField(term4767, term4767.getClass(), "id", term4768);
        setField(term4767, term4767.getClass(), "title", "PEUfeJaZTk");
        setField(term4767, term4767.getClass(), "description", "AIvyeIdskz");
        setField(term4767, term4767.getClass(), "genre", "iSQqMWMRlU");
        setIntField(term4807, term4807.getClass(), "signum", 1);
        setIntElement(term4809, 0, 26970);
        setIntElement(term4809, 1, 239139121);
        setIntElement(term4809, 2, -1315571115);
        setIntElement(term4809, 3, -1818010793);
        setIntElement(term4809, 4, -2087556840);
        setIntElement(term4809, 5, 129078839);
        setField(term4807, term4807.getClass(), "mag", term4809);
        setIntField(term4807, term4807.getClass(), "bitCountPlusOne", 0);
        setIntField(term4807, term4807.getClass(), "bitLengthPlusOne", 0);
        setIntField(term4807, term4807.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term4807, term4807.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term4806, term4806.getClass(), "intVal", term4807);
        setIntField(term4806, term4806.getClass(), "scale", 53);
        setIntField(term4806, term4806.getClass(), "precision", 0);
        setField(term4806, term4806.getClass(), "stringCache", null);
        setLongField(term4806, term4806.getClass(), "intCompact", -9223372036854775808L);
        setField(term4767, term4767.getClass(), "price", term4806);
        setField(term4823, term4823.getClass(), "id", term4824);
        setField(term4823, term4823.getClass(), "firstName", "djWEnlbOXu");
        setField(term4823, term4823.getClass(), "lastName", "MvDMzQBWME");
        setField(term4823, term4823.getClass(), "email", "sZyAwmdGVS");
        setField(term4823, term4823.getClass(), "books", term4862);
        setField(term4767, term4767.getClass(), "author", term4823);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("example.model.Book");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTitle", argTypes, term4767, args);
    }

};


