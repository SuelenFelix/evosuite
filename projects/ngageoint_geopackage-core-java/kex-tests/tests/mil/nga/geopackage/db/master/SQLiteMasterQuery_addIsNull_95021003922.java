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

public class SQLiteMasterQuery_addIsNull_95021003922 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20146;

    public SQLiteMasterQuery_addIsNull_95021003922() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20146 = newInstance(Class.forName("mil.nga.geopackage.db.master.SQLiteMasterQuery"));
        setField(term20146, term20146.getClass(), "combineOperation", null);
        setField(term20146, term20146.getClass(), "queries", null);
        setField(term20146, term20146.getClass(), "arguments", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.db.master.SQLiteMasterQuery");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("mil.nga.geopackage.db.master.SQLiteMasterColumn");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "addIsNull", argTypes, term20146, args);
    }

};


