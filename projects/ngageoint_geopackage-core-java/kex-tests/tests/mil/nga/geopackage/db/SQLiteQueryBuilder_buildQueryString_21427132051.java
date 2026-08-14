package mil.nga.geopackage.db;

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
import static mil.nga.geopackage.db.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Boolean;
import java.lang.Object;

public class SQLiteQueryBuilder_buildQueryString_21427132051 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38879;
     Object term38893;
     Object term38978;

    public SQLiteQueryBuilder_buildQueryString_21427132051() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term38879 = new Boolean(true);
        term38893 = (Object[]) newArray("java.lang.String", 7);
        setElement(term38893, 0, "HmEvTlmzXo");
        setElement(term38893, 1, "BMMonTIZgJ");
        setElement(term38893, 2, "QXyFXBjFde");
        setElement(term38893, 3, "xVFgeyYxZS");
        setElement(term38893, 4, "iQiGTulJiH");
        setElement(term38893, 5, "utCuuVCKqE");
        setElement(term38893, 6, "zSfoqzJbPT");
        term38978 = (Object[]) newArray("java.lang.String", 7);
        setElement(term38978, 0, "QUymMnsCIj");
        setElement(term38978, 1, "ikTtOgdVYS");
        setElement(term38978, 2, "JptuwlirlS");
        setElement(term38978, 3, "TKOMaGswbU");
        setElement(term38978, 4, "YcTbglHiUq");
        setElement(term38978, 5, "TiUqHrjoEU");
        setElement(term38978, 6, "eoEvZbdLjL");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.db.SQLiteQueryBuilder");
        Class<?>[] argTypes = new Class<?>[9];
        argTypes[0] = boolean.class;
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        argTypes[3] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        argTypes[4] = Class.forName("java.lang.String");
        argTypes[5] = Class.forName("java.lang.String");
        argTypes[6] = Class.forName("java.lang.String");
        argTypes[7] = Class.forName("java.lang.String");
        argTypes[8] = Class.forName("java.lang.String");
        Object[] args = new Object[9];
        args[0] = term38879;
        args[1] = "PSOttyUeqv";
        args[2] = term38893;
        args[3] = term38978;
        args[4] = "BkIxsyPkGy";
        args[5] = "mrMGwoRgVY";
        args[6] = "mxVLTgCwki";
        args[7] = "wCurppnDSA";
        args[8] = "JydxSNTMYt";
        callMethod(klass, "buildQueryString", argTypes, null, args);
    }

};


