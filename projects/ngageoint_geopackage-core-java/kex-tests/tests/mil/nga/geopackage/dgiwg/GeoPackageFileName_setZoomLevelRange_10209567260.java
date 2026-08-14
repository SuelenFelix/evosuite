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

public class GeoPackageFileName_setZoomLevelRange_10209567260 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31700;
     Object term31701;
     Object term31703;

    public GeoPackageFileName_setZoomLevelRange_10209567260() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31700 = newInstance(Class.forName("mil.nga.geopackage.dgiwg.GeoPackageFileName"));
        setField(term31700, term31700.getClass(), "producer", null);
        setField(term31700, term31700.getClass(), "dataProduct", null);
        setField(term31700, term31700.getClass(), "geographicCoverageArea", null);
        setField(term31700, term31700.getClass(), "zoomLevels", null);
        setField(term31700, term31700.getClass(), "zoomLevel1", null);
        setField(term31700, term31700.getClass(), "zoomLevel2", null);
        setField(term31700, term31700.getClass(), "version", null);
        setField(term31700, term31700.getClass(), "majorVersion", null);
        setField(term31700, term31700.getClass(), "minorVersion", null);
        setField(term31700, term31700.getClass(), "creationDateText", null);
        setField(term31700, term31700.getClass(), "creationDate", null);
        setField(term31700, term31700.getClass(), "additional", null);
        term31701 = new Integer(0);
        term31703 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.dgiwg.GeoPackageFileName");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term31701;
        args[1] = term31703;
        callMethod(klass, "setZoomLevelRange", argTypes, term31700, args);
    }

};


