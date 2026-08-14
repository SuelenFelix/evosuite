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

public class GeoPackageFileName_setZoomLevels_186098827710 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22579;

    public GeoPackageFileName_setZoomLevels_186098827710() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term22628 = new Integer(1540719661);
        Integer term22630 = new Integer(1265463001);
        Integer term22644 = new Integer(335112684);
        Integer term22646 = new Integer(1551099402);
        ArrayList term22662 = new ArrayList();
        term22579 = newInstance(Class.forName("mil.nga.geopackage.dgiwg.GeoPackageFileName"));
        Object term22660 = newInstance(Class.forName("java.util.Date"));
        setField(term22579, term22579.getClass(), "producer", "cdHYQDgUZR");
        setField(term22579, term22579.getClass(), "dataProduct", "KAORSSPSeV");
        setField(term22579, term22579.getClass(), "geographicCoverageArea", "UimMMORkzd");
        setField(term22579, term22579.getClass(), "zoomLevels", "huVIXUWLtI");
        setField(term22579, term22579.getClass(), "zoomLevel1", term22628);
        setField(term22579, term22579.getClass(), "zoomLevel2", term22630);
        setField(term22579, term22579.getClass(), "version", "vhKzFyKPOT");
        setField(term22579, term22579.getClass(), "majorVersion", term22644);
        setField(term22579, term22579.getClass(), "minorVersion", term22646);
        setField(term22579, term22579.getClass(), "creationDateText", "nQhIgWXdRc");
        setLongField(term22660, term22660.getClass(), "fastTime", 1668569229825L);
        setField(term22660, term22660.getClass(), "cdate", null);
        setField(term22579, term22579.getClass(), "creationDate", term22660);
        setField(term22579, term22579.getClass(), "additional", term22662);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.dgiwg.GeoPackageFileName");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "EusenEbIoF";
        callMethod(klass, "setZoomLevels", argTypes, term22579, args);
    }

};


