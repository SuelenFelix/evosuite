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

public class SimpleAttributesTable_isSimple_93469752725 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13365;

    public SimpleAttributesTable_isSimple_93469752725() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13365 = newInstance(Class.forName("mil.nga.geopackage.extension.related.simple.SimpleAttributesTable"));
        setField(term13365, term13365.getClass(), "relationName", null);
        setField(term13365, term13365.getClass(), "dataType", null);
        setField(term13365, term13365.getClass(), "columns", null);
        setField(term13365, term13365.getClass(), "constraints", null);
        setField(term13365, term13365.getClass(), "contents", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.related.simple.SimpleAttributesTable");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("mil.nga.geopackage.db.GeoPackageDataType");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "isSimple", argTypes, term13365, args);
    }

};


