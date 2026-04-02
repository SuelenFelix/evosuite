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

public class Book_getDescription_10905904545 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4941;

    public Book_getDescription_10905904545() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4942 = new Long(-4905558793519537969L);
        Long term4998 = new Long(4354242424632479389L);
        Long term5039 = new Long(-4146453776626172590L);
        Object term5038 = newInstance(Class.forName("example.model.Book"));
        setField(term5038, term5038.getClass(), "id", term5039);
        setField(term5038, term5038.getClass(), "title", null);
        setField(term5038, term5038.getClass(), "description", null);
        setField(term5038, term5038.getClass(), "genre", null);
        setField(term5038, term5038.getClass(), "price", null);
        setField(term5038, term5038.getClass(), "author", null);
        Long term5042 = new Long(8918129626022907229L);
        Object term5041 = newInstance(Class.forName("example.model.Book"));
        setField(term5041, term5041.getClass(), "id", term5042);
        setField(term5041, term5041.getClass(), "title", null);
        setField(term5041, term5041.getClass(), "description", null);
        setField(term5041, term5041.getClass(), "genre", null);
        setField(term5041, term5041.getClass(), "price", null);
        setField(term5041, term5041.getClass(), "author", null);
        ArrayList term5036 = new ArrayList();
        ((ArrayList) term5036).add(term5038);
        ((ArrayList) term5036).add(term5041);
        term4941 = newInstance(Class.forName("example.model.Book"));
        Object term4980 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term4981 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term4983 = (int[]) newIntArray(6);
        Object term4997 = newInstance(Class.forName("example.model.Author"));
        setField(term4941, term4941.getClass(), "id", term4942);
        setField(term4941, term4941.getClass(), "title", "NeTiWVoyjZ");
        setField(term4941, term4941.getClass(), "description", "CGeclMyIOP");
        setField(term4941, term4941.getClass(), "genre", "yyWOYvIBsp");
        setIntField(term4981, term4981.getClass(), "signum", 1);
        setIntElement(term4983, 0, 48168);
        setIntElement(term4983, 1, -1749295857);
        setIntElement(term4983, 2, 1015367755);
        setIntElement(term4983, 3, -520713164);
        setIntElement(term4983, 4, -2096811176);
        setIntElement(term4983, 5, -2014950585);
        setField(term4981, term4981.getClass(), "mag", term4983);
        setIntField(term4981, term4981.getClass(), "bitCountPlusOne", 0);
        setIntField(term4981, term4981.getClass(), "bitLengthPlusOne", 0);
        setIntField(term4981, term4981.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term4981, term4981.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term4980, term4980.getClass(), "intVal", term4981);
        setIntField(term4980, term4980.getClass(), "scale", 53);
        setIntField(term4980, term4980.getClass(), "precision", 0);
        setField(term4980, term4980.getClass(), "stringCache", null);
        setLongField(term4980, term4980.getClass(), "intCompact", -9223372036854775808L);
        setField(term4941, term4941.getClass(), "price", term4980);
        setField(term4997, term4997.getClass(), "id", term4998);
        setField(term4997, term4997.getClass(), "firstName", "mmpgARMYFV");
        setField(term4997, term4997.getClass(), "lastName", "NUqhsZprdZ");
        setField(term4997, term4997.getClass(), "email", "jkzgCqWJrA");
        setField(term4997, term4997.getClass(), "books", term5036);
        setField(term4941, term4941.getClass(), "author", term4997);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("example.model.Book");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDescription", argTypes, term4941, args);
    }

};


