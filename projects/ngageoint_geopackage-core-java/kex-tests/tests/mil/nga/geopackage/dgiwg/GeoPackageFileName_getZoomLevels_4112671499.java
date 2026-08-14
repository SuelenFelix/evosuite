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
import java.lang.Object;
import java.util.ArrayList;

public class GeoPackageFileName_getZoomLevels_4112671499 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22410;

    public GeoPackageFileName_getZoomLevels_4112671499() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term22459 = new Integer(-112921587);
        Integer term22461 = new Integer(933028652);
        Integer term22475 = new Integer(287287233);
        Integer term22477 = new Integer(962840079);
        ArrayList term22493 = new ArrayList();
        ((ArrayList) term22493).add("BJhjdJUhkz");
        term22410 = newInstance(Class.forName("mil.nga.geopackage.dgiwg.GeoPackageFileName"));
        Object term22491 = newInstance(Class.forName("java.util.Date"));
        setField(term22410, term22410.getClass(), "producer", "WPxXsahPRq");
        setField(term22410, term22410.getClass(), "dataProduct", "IENRuqmwUU");
        setField(term22410, term22410.getClass(), "geographicCoverageArea", "GsWxOwXvSu");
        setField(term22410, term22410.getClass(), "zoomLevels", "bKBSncrMEZ");
        setField(term22410, term22410.getClass(), "zoomLevel1", term22459);
        setField(term22410, term22410.getClass(), "zoomLevel2", term22461);
        setField(term22410, term22410.getClass(), "version", "yeSXGqQExb");
        setField(term22410, term22410.getClass(), "majorVersion", term22475);
        setField(term22410, term22410.getClass(), "minorVersion", term22477);
        setField(term22410, term22410.getClass(), "creationDateText", "uXYcXVYJZM");
        setLongField(term22491, term22491.getClass(), "fastTime", 1437757323580L);
        setField(term22491, term22491.getClass(), "cdate", null);
        setField(term22410, term22410.getClass(), "creationDate", term22491);
        setField(term22410, term22410.getClass(), "additional", term22493);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.dgiwg.GeoPackageFileName");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getZoomLevels", argTypes, term22410, args);
    }

};


