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

public class GeoPackageFileName_getCreationDateText_58718923769 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31721;

    public GeoPackageFileName_getCreationDateText_58718923769() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31721 = newInstance(Class.forName("mil.nga.geopackage.dgiwg.GeoPackageFileName"));
        setField(term31721, term31721.getClass(), "producer", null);
        setField(term31721, term31721.getClass(), "dataProduct", null);
        setField(term31721, term31721.getClass(), "geographicCoverageArea", null);
        setField(term31721, term31721.getClass(), "zoomLevels", null);
        setField(term31721, term31721.getClass(), "zoomLevel1", null);
        setField(term31721, term31721.getClass(), "zoomLevel2", null);
        setField(term31721, term31721.getClass(), "version", null);
        setField(term31721, term31721.getClass(), "majorVersion", null);
        setField(term31721, term31721.getClass(), "minorVersion", null);
        setField(term31721, term31721.getClass(), "creationDateText", null);
        setField(term31721, term31721.getClass(), "creationDate", null);
        setField(term31721, term31721.getClass(), "additional", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.dgiwg.GeoPackageFileName");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCreationDateText", argTypes, term31721, args);
    }

};


