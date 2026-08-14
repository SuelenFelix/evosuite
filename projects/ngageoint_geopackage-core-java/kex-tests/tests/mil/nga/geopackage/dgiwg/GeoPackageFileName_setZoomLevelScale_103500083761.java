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

public class GeoPackageFileName_setZoomLevelScale_103500083761 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31705;
     Object term31706;
     Object term31708;

    public GeoPackageFileName_setZoomLevelScale_103500083761() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31705 = newInstance(Class.forName("mil.nga.geopackage.dgiwg.GeoPackageFileName"));
        setField(term31705, term31705.getClass(), "producer", null);
        setField(term31705, term31705.getClass(), "dataProduct", null);
        setField(term31705, term31705.getClass(), "geographicCoverageArea", null);
        setField(term31705, term31705.getClass(), "zoomLevels", null);
        setField(term31705, term31705.getClass(), "zoomLevel1", null);
        setField(term31705, term31705.getClass(), "zoomLevel2", null);
        setField(term31705, term31705.getClass(), "version", null);
        setField(term31705, term31705.getClass(), "majorVersion", null);
        setField(term31705, term31705.getClass(), "minorVersion", null);
        setField(term31705, term31705.getClass(), "creationDateText", null);
        setField(term31705, term31705.getClass(), "creationDate", null);
        setField(term31705, term31705.getClass(), "additional", null);
        term31706 = new Integer(0);
        term31708 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.dgiwg.GeoPackageFileName");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term31706;
        args[1] = term31708;
        callMethod(klass, "setZoomLevelScale", argTypes, term31705, args);
    }

};


