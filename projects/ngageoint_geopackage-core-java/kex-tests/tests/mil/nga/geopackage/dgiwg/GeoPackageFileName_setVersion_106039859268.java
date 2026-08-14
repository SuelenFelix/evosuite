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
import java.lang.Integer;

public class GeoPackageFileName_setVersion_106039859268 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31716;
     Object term31717;
     Object term31719;

    public GeoPackageFileName_setVersion_106039859268() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31716 = newInstance(Class.forName("mil.nga.geopackage.dgiwg.GeoPackageFileName"));
        setField(term31716, term31716.getClass(), "producer", null);
        setField(term31716, term31716.getClass(), "dataProduct", null);
        setField(term31716, term31716.getClass(), "geographicCoverageArea", null);
        setField(term31716, term31716.getClass(), "zoomLevels", null);
        setField(term31716, term31716.getClass(), "zoomLevel1", null);
        setField(term31716, term31716.getClass(), "zoomLevel2", null);
        setField(term31716, term31716.getClass(), "version", null);
        setField(term31716, term31716.getClass(), "majorVersion", null);
        setField(term31716, term31716.getClass(), "minorVersion", null);
        setField(term31716, term31716.getClass(), "creationDateText", null);
        setField(term31716, term31716.getClass(), "creationDate", null);
        setField(term31716, term31716.getClass(), "additional", null);
        term31717 = new Integer(0);
        term31719 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.dgiwg.GeoPackageFileName");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term31717;
        args[1] = term31719;
        callMethod(klass, "setVersion", argTypes, term31716, args);
    }

};


