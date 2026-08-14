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
import java.lang.Integer;

public class SQLiteMaster_getTypeString_21143399454 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2045;
     Object term2063;

    public SQLiteMaster_getTypeString_21143399454() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2046 = new ArrayList();
        HashMap term2050 = new HashMap();
        term2045 = newInstance(Class.forName("mil.nga.geopackage.db.master.SQLiteMaster"));
        setField(term2045, term2045.getClass(), "results", term2046);
        setField(term2045, term2045.getClass(), "columns", term2050);
        setIntField(term2045, term2045.getClass(), "count", -1922583790);
        term2063 = new Integer(-616727354);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.db.master.SQLiteMaster");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term2063;
        callMethod(klass, "getTypeString", argTypes, term2045, args);
    }

};


