package mil.nga.geopackage.dgiwg;

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
import static mil.nga.geopackage.dgiwg.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class DGIWGValidate_primaryKeys_69031887418 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32640;

    public DGIWGValidate_primaryKeys_69031887418() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term32640 = newInstance(Class.forName("mil.nga.geopackage.features.columns.GeometryColumns"));
        setField(term32640, term32640.getClass(), "contents", null);
        setField(term32640, term32640.getClass(), "tableName", "aPkGHbZyjj");
        setField(term32640, term32640.getClass(), "columnName", "nSWdsVyJRI");
        setField(term32640, term32640.getClass(), "geometryTypeName", "JBOPGgGKnc");
        setField(term32640, term32640.getClass(), "srs", null);
        setLongField(term32640, term32640.getClass(), "srsId", -6573104506744284592L);
        setByteField(term32640, term32640.getClass(), "z", (byte) 89);
        setByteField(term32640, term32640.getClass(), "m", (byte) 75);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.dgiwg.DGIWGValidate");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("mil.nga.geopackage.features.columns.GeometryColumns");
        Object[] args = new Object[1];
        args[0] = term32640;
        callMethod(klass, "primaryKeys", argTypes, null, args);
    }

};


