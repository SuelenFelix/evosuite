package mil.nga.geopackage.extension.nga.index;

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
import static mil.nga.geopackage.extension.nga.index.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;

public class GeometryIndexKey_setGeomId_16276101834 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term131;
     Object term145;

    public GeometryIndexKey_setGeomId_16276101834() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term131 = newInstance(Class.forName("mil.nga.geopackage.extension.nga.index.GeometryIndexKey"));
        setField(term131, term131.getClass(), "tableName", "EGtDIRbSSb");
        setLongField(term131, term131.getClass(), "geomId", 5270370404989704783L);
        term145 = new Long(7411271909051562686L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.nga.index.GeometryIndexKey");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term145;
        callMethod(klass, "setGeomId", argTypes, term131, args);
    }

};


