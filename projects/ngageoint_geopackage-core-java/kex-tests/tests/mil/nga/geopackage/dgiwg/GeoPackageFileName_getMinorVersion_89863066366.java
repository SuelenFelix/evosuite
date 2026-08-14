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

public class GeoPackageFileName_getMinorVersion_89863066366 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31714;

    public GeoPackageFileName_getMinorVersion_89863066366() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31714 = newInstance(Class.forName("mil.nga.geopackage.dgiwg.GeoPackageFileName"));
        setField(term31714, term31714.getClass(), "producer", null);
        setField(term31714, term31714.getClass(), "dataProduct", null);
        setField(term31714, term31714.getClass(), "geographicCoverageArea", null);
        setField(term31714, term31714.getClass(), "zoomLevels", null);
        setField(term31714, term31714.getClass(), "zoomLevel1", null);
        setField(term31714, term31714.getClass(), "zoomLevel2", null);
        setField(term31714, term31714.getClass(), "version", null);
        setField(term31714, term31714.getClass(), "majorVersion", null);
        setField(term31714, term31714.getClass(), "minorVersion", null);
        setField(term31714, term31714.getClass(), "creationDateText", null);
        setField(term31714, term31714.getClass(), "creationDate", null);
        setField(term31714, term31714.getClass(), "additional", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.dgiwg.GeoPackageFileName");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMinorVersion", argTypes, term31714, args);
    }

};


