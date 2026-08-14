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

public class SQLiteMaster_getSql_4082807368 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2125;
     Object term2143;

    public SQLiteMaster_getSql_4082807368() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2126 = new ArrayList();
        HashMap term2130 = new HashMap();
        term2125 = newInstance(Class.forName("mil.nga.geopackage.db.master.SQLiteMaster"));
        setField(term2125, term2125.getClass(), "results", term2126);
        setField(term2125, term2125.getClass(), "columns", term2130);
        setIntField(term2125, term2125.getClass(), "count", 1134449235);
        term2143 = new Integer(-883034806);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.db.master.SQLiteMaster");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term2143;
        callMethod(klass, "getSql", argTypes, term2125, args);
    }

};


