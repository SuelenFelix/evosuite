package mil.nga.geopackage.features.user;

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
import static mil.nga.geopackage.features.user.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class FeatureTableReader_init_3769795950 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2077;

    public FeatureTableReader_init_3769795950() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2077 = newInstance(Class.forName("mil.nga.geopackage.features.columns.GeometryColumns"));
        setField(term2077, term2077.getClass(), "contents", null);
        setField(term2077, term2077.getClass(), "tableName", "PkWMRdJcBb");
        setField(term2077, term2077.getClass(), "columnName", "jSpAteRute");
        setField(term2077, term2077.getClass(), "geometryTypeName", "swZVeJAxjt");
        setField(term2077, term2077.getClass(), "srs", null);
        setLongField(term2077, term2077.getClass(), "srsId", 4872422362414183754L);
        setByteField(term2077, term2077.getClass(), "z", (byte) 83);
        setByteField(term2077, term2077.getClass(), "m", (byte) 74);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.features.user.FeatureTableReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("mil.nga.geopackage.features.columns.GeometryColumns");
        Object[] args = new Object[1];
        args[0] = term2077;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


