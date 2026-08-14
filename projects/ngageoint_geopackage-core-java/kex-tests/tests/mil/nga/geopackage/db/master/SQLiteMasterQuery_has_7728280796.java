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

public class SQLiteMasterQuery_has_7728280796 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18787;

    public SQLiteMasterQuery_has_7728280796() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term18800 = new ArrayList();
        ArrayList term18804 = new ArrayList();
        ((ArrayList) term18804).add("fWKJoSoCwE");
        ((ArrayList) term18804).add("wfaXBpWAUH");
        ((ArrayList) term18804).add("VMeAzAHwZj");
        ((ArrayList) term18804).add("PznxWXsZME");
        ((ArrayList) term18804).add("ZzIujlwVsw");
        ((ArrayList) term18804).add("LWyEaeIyAo");
        ((ArrayList) term18804).add("yVMkkQhvmN");
        term18787 = newInstance(Class.forName("mil.nga.geopackage.db.master.SQLiteMasterQuery"));
        setField(term18787, term18787.getClass(), "combineOperation", "gCWtLVKVVe");
        setField(term18787, term18787.getClass(), "queries", term18800);
        setField(term18787, term18787.getClass(), "arguments", term18804);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.db.master.SQLiteMasterQuery");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "has", argTypes, term18787, args);
    }

};


