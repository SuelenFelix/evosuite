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

public class GeoPackageFileName_setDataProduct_73561451851 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31691;

    public GeoPackageFileName_setDataProduct_73561451851() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31691 = newInstance(Class.forName("mil.nga.geopackage.dgiwg.GeoPackageFileName"));
        setField(term31691, term31691.getClass(), "producer", null);
        setField(term31691, term31691.getClass(), "dataProduct", null);
        setField(term31691, term31691.getClass(), "geographicCoverageArea", null);
        setField(term31691, term31691.getClass(), "zoomLevels", null);
        setField(term31691, term31691.getClass(), "zoomLevel1", null);
        setField(term31691, term31691.getClass(), "zoomLevel2", null);
        setField(term31691, term31691.getClass(), "version", null);
        setField(term31691, term31691.getClass(), "majorVersion", null);
        setField(term31691, term31691.getClass(), "minorVersion", null);
        setField(term31691, term31691.getClass(), "creationDateText", null);
        setField(term31691, term31691.getClass(), "creationDate", null);
        setField(term31691, term31691.getClass(), "additional", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.dgiwg.GeoPackageFileName");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setDataProduct", argTypes, term31691, args);
    }

};


