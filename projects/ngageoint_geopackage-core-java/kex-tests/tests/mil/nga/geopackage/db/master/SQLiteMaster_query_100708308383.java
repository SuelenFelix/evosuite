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

public class SQLiteMaster_query_100708308383 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16536;

    public SQLiteMaster_query_100708308383() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16536 = newInstance(Class.forName("mil.nga.geopackage.db.master.SQLiteMaster"));
        setField(term16536, term16536.getClass(), "results", null);
        setField(term16536, term16536.getClass(), "columns", null);
        setIntField(term16536, term16536.getClass(), "count", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.db.master.SQLiteMaster");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("mil.nga.geopackage.db.GeoPackageCoreConnection");
        argTypes[1] = Array.newInstance(Class.forName("mil.nga.geopackage.db.master.SQLiteMasterColumn"), 0).getClass();
        argTypes[2] = Class.forName("mil.nga.geopackage.db.master.SQLiteMasterType");
        argTypes[3] = Class.forName("java.lang.String");
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        callMethod(klass, "query", argTypes, term16536, args);
    }

};


