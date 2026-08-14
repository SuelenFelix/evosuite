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

public class SQLiteMaster_getTableName_13836515316 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2085;
     Object term2103;

    public SQLiteMaster_getTableName_13836515316() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2086 = new ArrayList();
        HashMap term2090 = new HashMap();
        term2085 = newInstance(Class.forName("mil.nga.geopackage.db.master.SQLiteMaster"));
        setField(term2085, term2085.getClass(), "results", term2086);
        setField(term2085, term2085.getClass(), "columns", term2090);
        setIntField(term2085, term2085.getClass(), "count", 1227103734);
        term2103 = new Integer(-1339778481);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.db.master.SQLiteMaster");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term2103;
        callMethod(klass, "getTableName", argTypes, term2085, args);
    }

};


