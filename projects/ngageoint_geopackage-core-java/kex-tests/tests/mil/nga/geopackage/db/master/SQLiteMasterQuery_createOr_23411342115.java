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

public class SQLiteMasterQuery_createOr_23411342115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20119;

    public SQLiteMasterQuery_createOr_23411342115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20119 = newInstance(Class.forName("mil.nga.geopackage.db.master.SQLiteMasterQuery"));
        setField(term20119, term20119.getClass(), "combineOperation", null);
        setField(term20119, term20119.getClass(), "queries", null);
        setField(term20119, term20119.getClass(), "arguments", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.db.master.SQLiteMasterQuery");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("mil.nga.geopackage.db.master.SQLiteMasterColumn");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.util.Collection");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        callMethod(klass, "createOr", argTypes, term20119, args);
    }

};


