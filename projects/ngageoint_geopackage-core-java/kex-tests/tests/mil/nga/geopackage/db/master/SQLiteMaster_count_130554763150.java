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
import java.lang.Object;
import java.lang.String;
import java.util.ArrayList;

public class SQLiteMaster_count_130554763150 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14572;
     Object term14584;

    public SQLiteMaster_count_130554763150() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term14714 = Class.forName((String) "mil.nga.geopackage.db.master.SQLiteMasterType");
        Field term14713 = ((Class) term14714).getDeclaredField((String) "TRIGGER");
        ((Field) term14713).setAccessible(true);
        Object enum49 = ((Field) term14713).get((Object) null);
        term14572 = (Object[]) newArray("mil.nga.geopackage.db.master.SQLiteMasterType", 1);
        setElement(term14572, 0, enum49);
        ArrayList term14597 = new ArrayList();
        ((ArrayList) term14597).add("dEnhdmILtU");
        ((ArrayList) term14597).add("hoicvmsovO");
        ((ArrayList) term14597).add("eqJfYWRaEL");
        ((ArrayList) term14597).add("fhkbdRViHi");
        ((ArrayList) term14597).add("uWHnvSvaPl");
        ArrayList term14661 = new ArrayList();
        ((ArrayList) term14661).add("kBdSllIBVz");
        ((ArrayList) term14661).add("TJmVBGfTML");
        ((ArrayList) term14661).add("tPlsykYBqO");
        ((ArrayList) term14661).add("bLPjGVBhlX");
        term14584 = newInstance(Class.forName("mil.nga.geopackage.db.master.SQLiteMasterQuery"));
        setField(term14584, term14584.getClass(), "combineOperation", "ieCtQFdkii");
        setField(term14584, term14584.getClass(), "queries", term14597);
        setField(term14584, term14584.getClass(), "arguments", term14661);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.db.master.SQLiteMaster");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("mil.nga.geopackage.db.GeoPackageCoreConnection");
        argTypes[1] = Array.newInstance(Class.forName("mil.nga.geopackage.db.master.SQLiteMasterType"), 0).getClass();
        argTypes[2] = Class.forName("mil.nga.geopackage.db.master.SQLiteMasterQuery");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term14572;
        args[2] = term14584;
        callMethod(klass, "count", argTypes, null, args);
    }

};


