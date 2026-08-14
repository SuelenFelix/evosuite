package mil.nga.geopackage.property;

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
import static mil.nga.geopackage.property.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Boolean;
import java.lang.Object;

public class GeoPackageProperties_getFloatProperty_16521150512 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term522;
     Object term524;

    public GeoPackageProperties_getFloatProperty_16521150512() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term522 = new Boolean(true);
        term524 = (Object[]) newArray("java.lang.String", 6);
        setElement(term524, 0, "eZFUvlxvGV");
        setElement(term524, 1, "BYqFIqCKAV");
        setElement(term524, 2, "vrQLuWIDJX");
        setElement(term524, 3, "flxyYxBRtu");
        setElement(term524, 4, "OclPbYPkcH");
        setElement(term524, 5, "IoAlmYsBwc");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.property.GeoPackageProperties");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = boolean.class;
        argTypes[1] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[2];
        args[0] = term522;
        args[1] = term524;
        callMethod(klass, "getFloatProperty", argTypes, null, args);
    }

};


