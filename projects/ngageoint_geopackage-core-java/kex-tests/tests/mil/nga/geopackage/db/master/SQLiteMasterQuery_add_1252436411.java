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
import java.lang.String;
import java.lang.Object;

public class SQLiteMasterQuery_add_1252436411 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16592;
     Object enum54;

    public SQLiteMasterQuery_add_1252436411() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term16605 = new ArrayList();
        ((ArrayList) term16605).add("PHvxnGHptP");
        ((ArrayList) term16605).add("TimdotUuNC");
        ((ArrayList) term16605).add("PkWMRdJcBb");
        ((ArrayList) term16605).add("jSpAteRute");
        ((ArrayList) term16605).add("swZVeJAxjt");
        ((ArrayList) term16605).add("xOcJIiQQDu");
        ArrayList term16681 = new ArrayList();
        ((ArrayList) term16681).add("GVizqqzXpy");
        term16592 = newInstance(Class.forName("mil.nga.geopackage.db.master.SQLiteMasterQuery"));
        setField(term16592, term16592.getClass(), "combineOperation", "LvJFtLBaxj");
        setField(term16592, term16592.getClass(), "queries", term16605);
        setField(term16592, term16592.getClass(), "arguments", term16681);
        Class<? extends Object> term16797 = Class.forName((String) "mil.nga.geopackage.db.master.SQLiteMasterColumn");
        Field term16796 = ((Class) term16797).getDeclaredField((String) "SQL");
        ((Field) term16796).setAccessible(true);
        enum54 = ((Field) term16796).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.db.master.SQLiteMasterQuery");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("mil.nga.geopackage.db.master.SQLiteMasterColumn");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = enum54;
        args[1] = "JqXGgAhZPl";
        callMethod(klass, "add", argTypes, term16592, args);
    }

};


