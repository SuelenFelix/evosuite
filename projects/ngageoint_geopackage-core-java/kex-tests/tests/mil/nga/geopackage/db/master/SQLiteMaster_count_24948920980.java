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

public class SQLiteMaster_count_24948920980 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16530;

    public SQLiteMaster_count_24948920980() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16530 = newInstance(Class.forName("mil.nga.geopackage.db.master.SQLiteMaster"));
        setField(term16530, term16530.getClass(), "results", null);
        setField(term16530, term16530.getClass(), "columns", null);
        setIntField(term16530, term16530.getClass(), "count", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.db.master.SQLiteMaster");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("mil.nga.geopackage.db.GeoPackageCoreConnection");
        argTypes[1] = Class.forName("mil.nga.geopackage.db.master.SQLiteMasterType");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "count", argTypes, term16530, args);
    }

};


