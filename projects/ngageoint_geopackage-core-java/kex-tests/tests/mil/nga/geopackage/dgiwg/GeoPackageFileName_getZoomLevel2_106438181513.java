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

public class GeoPackageFileName_getZoomLevel2_106438181513 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23328;

    public GeoPackageFileName_getZoomLevel2_106438181513() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term23377 = new Integer(-1465035361);
        Integer term23379 = new Integer(1090617576);
        Integer term23393 = new Integer(-1547384488);
        Integer term23395 = new Integer(1442160736);
        ArrayList term23411 = new ArrayList();
        ((ArrayList) term23411).add("DSFGlcaXUb");
        ((ArrayList) term23411).add("sHMXNUzNeM");
        ((ArrayList) term23411).add("gPzGDOEPPw");
        ((ArrayList) term23411).add("rwKoAngzCu");
        ((ArrayList) term23411).add("VUkRVwROTl");
        ((ArrayList) term23411).add("UDlkdccCRn");
        ((ArrayList) term23411).add("McpzErOcYb");
        ((ArrayList) term23411).add("jqrVEUvYEz");
        term23328 = newInstance(Class.forName("mil.nga.geopackage.dgiwg.GeoPackageFileName"));
        Object term23409 = newInstance(Class.forName("java.util.Date"));
        setField(term23328, term23328.getClass(), "producer", "WdCiTDUKqn");
        setField(term23328, term23328.getClass(), "dataProduct", "PSizQDoxxe");
        setField(term23328, term23328.getClass(), "geographicCoverageArea", "mKaHyMybrK");
        setField(term23328, term23328.getClass(), "zoomLevels", "AyrEXuGrEj");
        setField(term23328, term23328.getClass(), "zoomLevel1", term23377);
        setField(term23328, term23328.getClass(), "zoomLevel2", term23379);
        setField(term23328, term23328.getClass(), "version", "yevIIoVYHq");
        setField(term23328, term23328.getClass(), "majorVersion", term23393);
        setField(term23328, term23328.getClass(), "minorVersion", term23395);
        setField(term23328, term23328.getClass(), "creationDateText", "UuYWMTqWTV");
        setLongField(term23409, term23409.getClass(), "fastTime", 1804998087131L);
        setField(term23409, term23409.getClass(), "cdate", null);
        setField(term23328, term23328.getClass(), "creationDate", term23409);
        setField(term23328, term23328.getClass(), "additional", term23411);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.dgiwg.GeoPackageFileName");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getZoomLevel2", argTypes, term23328, args);
    }

};


