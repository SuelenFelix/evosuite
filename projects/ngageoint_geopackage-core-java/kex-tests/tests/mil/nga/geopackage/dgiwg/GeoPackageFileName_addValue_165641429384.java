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

public class GeoPackageFileName_addValue_165641429384 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31736;

    public GeoPackageFileName_addValue_165641429384() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31736 = newInstance(Class.forName("mil.nga.geopackage.dgiwg.GeoPackageFileName"));
        setField(term31736, term31736.getClass(), "producer", null);
        setField(term31736, term31736.getClass(), "dataProduct", null);
        setField(term31736, term31736.getClass(), "geographicCoverageArea", null);
        setField(term31736, term31736.getClass(), "zoomLevels", null);
        setField(term31736, term31736.getClass(), "zoomLevel1", null);
        setField(term31736, term31736.getClass(), "zoomLevel2", null);
        setField(term31736, term31736.getClass(), "version", null);
        setField(term31736, term31736.getClass(), "majorVersion", null);
        setField(term31736, term31736.getClass(), "minorVersion", null);
        setField(term31736, term31736.getClass(), "creationDateText", null);
        setField(term31736, term31736.getClass(), "creationDate", null);
        setField(term31736, term31736.getClass(), "additional", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.dgiwg.GeoPackageFileName");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.StringBuilder");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "addValue", argTypes, term31736, args);
    }

};


