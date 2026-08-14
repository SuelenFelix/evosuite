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

public class GeoPackageFileName_getProducer_29613609948 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31688;

    public GeoPackageFileName_getProducer_29613609948() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31688 = newInstance(Class.forName("mil.nga.geopackage.dgiwg.GeoPackageFileName"));
        setField(term31688, term31688.getClass(), "producer", null);
        setField(term31688, term31688.getClass(), "dataProduct", null);
        setField(term31688, term31688.getClass(), "geographicCoverageArea", null);
        setField(term31688, term31688.getClass(), "zoomLevels", null);
        setField(term31688, term31688.getClass(), "zoomLevel1", null);
        setField(term31688, term31688.getClass(), "zoomLevel2", null);
        setField(term31688, term31688.getClass(), "version", null);
        setField(term31688, term31688.getClass(), "majorVersion", null);
        setField(term31688, term31688.getClass(), "minorVersion", null);
        setField(term31688, term31688.getClass(), "creationDateText", null);
        setField(term31688, term31688.getClass(), "creationDate", null);
        setField(term31688, term31688.getClass(), "additional", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.dgiwg.GeoPackageFileName");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getProducer", argTypes, term31688, args);
    }

};


