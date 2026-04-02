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

public class Book_setDescription_119364127011 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5996;

    public Book_setDescription_119364127011() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term5997 = new Long(-4994148485124075625L);
        Long term6053 = new Long(-8842842172497711872L);
        Long term6094 = new Long(-5367775625638780650L);
        Object term6093 = newInstance(Class.forName("example.model.Book"));
        setField(term6093, term6093.getClass(), "id", term6094);
        setField(term6093, term6093.getClass(), "title", null);
        setField(term6093, term6093.getClass(), "description", null);
        setField(term6093, term6093.getClass(), "genre", null);
        setField(term6093, term6093.getClass(), "price", null);
        setField(term6093, term6093.getClass(), "author", null);
        ArrayList term6091 = new ArrayList();
        ((ArrayList) term6091).add(term6093);
        term5996 = newInstance(Class.forName("example.model.Book"));
        Object term6035 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term6036 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term6038 = (int[]) newIntArray(6);
        Object term6052 = newInstance(Class.forName("example.model.Author"));
        setField(term5996, term5996.getClass(), "id", term5997);
        setField(term5996, term5996.getClass(), "title", "GdMAXFBAtl");
        setField(term5996, term5996.getClass(), "description", "KWVRAlcIqd");
        setField(term5996, term5996.getClass(), "genre", "GeVOqtDiGv");
        setIntField(term6036, term6036.getClass(), "signum", 1);
        setIntElement(term6038, 0, 57171);
        setIntElement(term6038, 1, -2135895267);
        setIntElement(term6038, 2, -44300040);
        setIntElement(term6038, 3, -364713582);
        setIntElement(term6038, 4, -1896036537);
        setIntElement(term6038, 5, -1632954295);
        setField(term6036, term6036.getClass(), "mag", term6038);
        setIntField(term6036, term6036.getClass(), "bitCountPlusOne", 0);
        setIntField(term6036, term6036.getClass(), "bitLengthPlusOne", 0);
        setIntField(term6036, term6036.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term6036, term6036.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term6035, term6035.getClass(), "intVal", term6036);
        setIntField(term6035, term6035.getClass(), "scale", 53);
        setIntField(term6035, term6035.getClass(), "precision", 0);
        setField(term6035, term6035.getClass(), "stringCache", null);
        setLongField(term6035, term6035.getClass(), "intCompact", -9223372036854775808L);
        setField(term5996, term5996.getClass(), "price", term6035);
        setField(term6052, term6052.getClass(), "id", term6053);
        setField(term6052, term6052.getClass(), "firstName", "vbRAJCwftU");
        setField(term6052, term6052.getClass(), "lastName", "baJbjUImxp");
        setField(term6052, term6052.getClass(), "email", "lPERFqPpGz");
        setField(term6052, term6052.getClass(), "books", term6091);
        setField(term5996, term5996.getClass(), "author", term6052);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("example.model.Book");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "GsXvLZCFtf";
        callMethod(klass, "setDescription", argTypes, term5996, args);
    }

};


