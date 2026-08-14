package mil.nga.geopackage.db.master;

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
import static mil.nga.geopackage.db.master.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.util.HashMap;
import java.lang.Integer;
import java.lang.String;
import java.lang.Object;

public class SQLiteMaster_getValue_15296272059 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2145;
     Object term2163;
     Object enum7;

    public SQLiteMaster_getValue_15296272059() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2146 = new ArrayList();
        HashMap term2150 = new HashMap();
        term2145 = newInstance(Class.forName("mil.nga.geopackage.db.master.SQLiteMaster"));
        setField(term2145, term2145.getClass(), "results", term2146);
        setField(term2145, term2145.getClass(), "columns", term2150);
        setIntField(term2145, term2145.getClass(), "count", 1585847225);
        term2163 = new Integer(597278769);
        Class<? extends Object> term2174 = Class.forName((String) "mil.nga.geopackage.db.master.SQLiteMasterColumn");
        Field term2173 = ((Class) term2174).getDeclaredField((String) "TYPE");
        ((Field) term2173).setAccessible(true);
        enum7 = ((Field) term2173).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.db.master.SQLiteMaster");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("mil.nga.geopackage.db.master.SQLiteMasterColumn");
        Object[] args = new Object[2];
        args[0] = term2163;
        args[1] = enum7;
        callMethod(klass, "getValue", argTypes, term2145, args);
    }

};


