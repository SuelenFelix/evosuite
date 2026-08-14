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

public class SQLiteMasterQuery_validateAdd_1816365885 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18668;

    public SQLiteMasterQuery_validateAdd_1816365885() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term18681 = new ArrayList();
        ArrayList term18685 = new ArrayList();
        ((ArrayList) term18685).add("OJJtVNPyKZ");
        ((ArrayList) term18685).add("AKNapTAfmD");
        ((ArrayList) term18685).add("xJgPlLxpgC");
        ((ArrayList) term18685).add("EYtfuJaxiM");
        term18668 = newInstance(Class.forName("mil.nga.geopackage.db.master.SQLiteMasterQuery"));
        setField(term18668, term18668.getClass(), "combineOperation", "SdCKLMIYnX");
        setField(term18668, term18668.getClass(), "queries", term18681);
        setField(term18668, term18668.getClass(), "arguments", term18685);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.db.master.SQLiteMasterQuery");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "validateAdd", argTypes, term18668, args);
    }

};


