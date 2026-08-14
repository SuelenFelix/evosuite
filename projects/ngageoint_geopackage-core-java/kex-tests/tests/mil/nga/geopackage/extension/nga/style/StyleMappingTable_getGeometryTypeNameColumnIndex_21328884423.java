package mil.nga.geopackage.extension.nga.style;

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
import static mil.nga.geopackage.extension.nga.style.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;
import java.util.HashMap;

public class StyleMappingTable_getGeometryTypeNameColumnIndex_21328884423 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7852;

    public StyleMappingTable_getGeometryTypeNameColumnIndex_21328884423() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term7854 = new ArrayList();
        HashMap term7858 = new HashMap();
        term7852 = newInstance(Class.forName("mil.nga.geopackage.extension.nga.style.StyleMappingTable"));
        Object term7853 = newInstance(Class.forName("mil.nga.geopackage.db.table.Constraints"));
        setField(term7852, term7852.getClass(), "columns", null);
        setField(term7853, term7853.getClass(), "constraints", term7854);
        setField(term7853, term7853.getClass(), "typedContraints", term7858);
        setField(term7852, term7852.getClass(), "constraints", term7853);
        setField(term7852, term7852.getClass(), "contents", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.nga.style.StyleMappingTable");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getGeometryTypeNameColumnIndex", argTypes, term7852, args);
    }

};


