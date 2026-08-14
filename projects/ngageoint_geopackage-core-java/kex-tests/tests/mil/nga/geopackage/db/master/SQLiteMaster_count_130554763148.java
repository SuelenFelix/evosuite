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
import java.lang.String;
import java.lang.Object;
import java.util.ArrayList;

public class SQLiteMaster_count_130554763148 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum42;
     Object term12644;

    public SQLiteMaster_count_130554763148() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term12678 = Class.forName((String) "mil.nga.geopackage.db.master.SQLiteMasterType");
        Field term12677 = ((Class) term12678).getDeclaredField((String) "TRIGGER");
        ((Field) term12677).setAccessible(true);
        enum42 = ((Field) term12677).get((Object) null);
        ArrayList term12657 = new ArrayList();
        ((ArrayList) term12657).add("ytSBIKXogI");
        ArrayList term12673 = new ArrayList();
        term12644 = newInstance(Class.forName("mil.nga.geopackage.db.master.SQLiteMasterQuery"));
        setField(term12644, term12644.getClass(), "combineOperation", "MLqYREekMl");
        setField(term12644, term12644.getClass(), "queries", term12657);
        setField(term12644, term12644.getClass(), "arguments", term12673);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.db.master.SQLiteMaster");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("mil.nga.geopackage.db.GeoPackageCoreConnection");
        argTypes[1] = Class.forName("mil.nga.geopackage.db.master.SQLiteMasterType");
        argTypes[2] = Class.forName("mil.nga.geopackage.db.master.SQLiteMasterQuery");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = enum42;
        args[2] = term12644;
        callMethod(klass, "count", argTypes, null, args);
    }

};


