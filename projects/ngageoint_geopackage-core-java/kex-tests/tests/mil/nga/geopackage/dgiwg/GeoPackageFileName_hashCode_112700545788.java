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

public class GeoPackageFileName_hashCode_112700545788 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31740;

    public GeoPackageFileName_hashCode_112700545788() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31740 = newInstance(Class.forName("mil.nga.geopackage.dgiwg.GeoPackageFileName"));
        setField(term31740, term31740.getClass(), "producer", null);
        setField(term31740, term31740.getClass(), "dataProduct", null);
        setField(term31740, term31740.getClass(), "geographicCoverageArea", null);
        setField(term31740, term31740.getClass(), "zoomLevels", null);
        setField(term31740, term31740.getClass(), "zoomLevel1", null);
        setField(term31740, term31740.getClass(), "zoomLevel2", null);
        setField(term31740, term31740.getClass(), "version", null);
        setField(term31740, term31740.getClass(), "majorVersion", null);
        setField(term31740, term31740.getClass(), "minorVersion", null);
        setField(term31740, term31740.getClass(), "creationDateText", null);
        setField(term31740, term31740.getClass(), "creationDate", null);
        setField(term31740, term31740.getClass(), "additional", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.dgiwg.GeoPackageFileName");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term31740, args);
    }

};


