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

public class GeoPackageProperties_getBooleanProperty_164908893516 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term748;
     Object term750;

    public GeoPackageProperties_getBooleanProperty_164908893516() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term748 = new Boolean(true);
        term750 = (Object[]) newArray("java.lang.String", 6);
        setElement(term750, 0, "SbAoxhfrkn");
        setElement(term750, 1, "kuTXqwMtDB");
        setElement(term750, 2, "Ghbwtircqb");
        setElement(term750, 3, "xrwlQZdwCp");
        setElement(term750, 4, "IDCWpPLRkE");
        setElement(term750, 5, "nyiiPDVjAc");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.property.GeoPackageProperties");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = boolean.class;
        argTypes[1] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[2];
        args[0] = term748;
        args[1] = term750;
        callMethod(klass, "getBooleanProperty", argTypes, null, args);
    }

};


