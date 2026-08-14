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

public class SQLiteMaster_query_143038964047 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum41;
     Object term12261;

    public SQLiteMaster_query_143038964047() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term12331 = Class.forName((String) "mil.nga.geopackage.db.master.SQLiteMasterType");
        Field term12330 = ((Class) term12331).getDeclaredField((String) "TRIGGER");
        ((Field) term12330).setAccessible(true);
        enum41 = ((Field) term12330).get((Object) null);
        ArrayList term12274 = new ArrayList();
        ((ArrayList) term12274).add("JDswTTCZHV");
        ((ArrayList) term12274).add("onpbIeEKoi");
        ArrayList term12302 = new ArrayList();
        ((ArrayList) term12302).add("YRHGsAkhxb");
        ((ArrayList) term12302).add("ffYhPOzlUs");
        term12261 = newInstance(Class.forName("mil.nga.geopackage.db.master.SQLiteMasterQuery"));
        setField(term12261, term12261.getClass(), "combineOperation", "UoYtihxVaS");
        setField(term12261, term12261.getClass(), "queries", term12274);
        setField(term12261, term12261.getClass(), "arguments", term12302);
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
        args[1] = enum41;
        args[2] = term12261;
        callMethod(klass, "query", argTypes, null, args);
    }

};


