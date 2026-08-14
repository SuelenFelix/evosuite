package mil.nga.geopackage.extension.related.simple;

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
import static mil.nga.geopackage.extension.related.simple.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;
import java.util.HashMap;

public class SimpleAttributesTable_getIdColumn_65503069823 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13277;

    public SimpleAttributesTable_getIdColumn_65503069823() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term13303 = new ArrayList();
        HashMap term13307 = new HashMap();
        term13277 = newInstance(Class.forName("mil.nga.geopackage.extension.related.simple.SimpleAttributesTable"));
        Object term13302 = newInstance(Class.forName("mil.nga.geopackage.db.table.Constraints"));
        setField(term13277, term13277.getClass(), "relationName", "bvSgmFUDOU");
        setField(term13277, term13277.getClass(), "dataType", "XMHwbfiHRl");
        setField(term13277, term13277.getClass(), "columns", null);
        setField(term13302, term13302.getClass(), "constraints", term13303);
        setField(term13302, term13302.getClass(), "typedContraints", term13307);
        setField(term13277, term13277.getClass(), "constraints", term13302);
        setField(term13277, term13277.getClass(), "contents", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.related.simple.SimpleAttributesTable");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getIdColumn", argTypes, term13277, args);
    }

};


