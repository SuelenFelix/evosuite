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
import java.util.HashMap;
import java.util.LinkedList;
import java.lang.String;
import java.lang.Object;

public class SQLiteMaster_getValue_168333283911 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2447;
     Object term2465;
     Object enum8;

    public SQLiteMaster_getValue_168333283911() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2448 = new ArrayList();
        HashMap term2452 = new HashMap();
        term2447 = newInstance(Class.forName("mil.nga.geopackage.db.master.SQLiteMaster"));
        setField(term2447, term2447.getClass(), "results", term2448);
        setField(term2447, term2447.getClass(), "columns", term2452);
        setIntField(term2447, term2447.getClass(), "count", 1622346318);
        term2465 = new LinkedList();
        Class<? extends Object> term2481 = Class.forName((String) "mil.nga.geopackage.db.master.SQLiteMasterColumn");
        Field term2480 = ((Class) term2481).getDeclaredField((String) "TBL_NAME");
        ((Field) term2480).setAccessible(true);
        enum8 = ((Field) term2480).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.db.master.SQLiteMaster");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.List");
        argTypes[1] = Class.forName("mil.nga.geopackage.db.master.SQLiteMasterColumn");
        Object[] args = new Object[2];
        args[0] = term2465;
        args[1] = enum8;
        callMethod(klass, "getValue", argTypes, term2447, args);
    }

};


