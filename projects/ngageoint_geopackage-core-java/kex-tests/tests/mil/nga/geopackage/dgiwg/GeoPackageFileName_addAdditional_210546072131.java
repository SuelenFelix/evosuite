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

public class GeoPackageFileName_addAdditional_210546072131 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28083;

    public GeoPackageFileName_addAdditional_210546072131() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term28132 = new Integer(1830648570);
        Integer term28134 = new Integer(-227365013);
        Integer term28148 = new Integer(11724947);
        Integer term28150 = new Integer(1953277050);
        ArrayList term28166 = new ArrayList();
        term28083 = newInstance(Class.forName("mil.nga.geopackage.dgiwg.GeoPackageFileName"));
        Object term28164 = newInstance(Class.forName("java.util.Date"));
        setField(term28083, term28083.getClass(), "producer", "fLRqcTSfzF");
        setField(term28083, term28083.getClass(), "dataProduct", "EBYHwsuWAU");
        setField(term28083, term28083.getClass(), "geographicCoverageArea", "PtIjKpiSix");
        setField(term28083, term28083.getClass(), "zoomLevels", "NZdTuwSCIM");
        setField(term28083, term28083.getClass(), "zoomLevel1", term28132);
        setField(term28083, term28083.getClass(), "zoomLevel2", term28134);
        setField(term28083, term28083.getClass(), "version", "dDHcmzPAmP");
        setField(term28083, term28083.getClass(), "majorVersion", term28148);
        setField(term28083, term28083.getClass(), "minorVersion", term28150);
        setField(term28083, term28083.getClass(), "creationDateText", "HEaTkWYBgv");
        setLongField(term28164, term28164.getClass(), "fastTime", 1405279189488L);
        setField(term28164, term28164.getClass(), "cdate", null);
        setField(term28083, term28083.getClass(), "creationDate", term28164);
        setField(term28083, term28083.getClass(), "additional", term28166);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.dgiwg.GeoPackageFileName");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "MpJsPKLTIU";
        callMethod(klass, "addAdditional", argTypes, term28083, args);
    }

};


