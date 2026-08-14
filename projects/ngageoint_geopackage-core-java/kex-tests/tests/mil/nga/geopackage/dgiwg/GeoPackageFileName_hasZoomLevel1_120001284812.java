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

public class GeoPackageFileName_hasZoomLevel1_120001284812 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23093;

    public GeoPackageFileName_hasZoomLevel1_120001284812() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term23142 = new Integer(972867650);
        Integer term23144 = new Integer(1655935355);
        Integer term23158 = new Integer(-481533957);
        Integer term23160 = new Integer(1240914516);
        ArrayList term23176 = new ArrayList();
        ((ArrayList) term23176).add("VkPSXewZfB");
        ((ArrayList) term23176).add("ubodzJoMGW");
        ((ArrayList) term23176).add("weddIktxOA");
        ((ArrayList) term23176).add("uSlMeISsDD");
        term23093 = newInstance(Class.forName("mil.nga.geopackage.dgiwg.GeoPackageFileName"));
        Object term23174 = newInstance(Class.forName("java.util.Date"));
        setField(term23093, term23093.getClass(), "producer", "NxgmYPzWCI");
        setField(term23093, term23093.getClass(), "dataProduct", "SqjyKmayBx");
        setField(term23093, term23093.getClass(), "geographicCoverageArea", "XjDhvToxJy");
        setField(term23093, term23093.getClass(), "zoomLevels", "nxSTJflLQy");
        setField(term23093, term23093.getClass(), "zoomLevel1", term23142);
        setField(term23093, term23093.getClass(), "zoomLevel2", term23144);
        setField(term23093, term23093.getClass(), "version", "FlHzxEfFzI");
        setField(term23093, term23093.getClass(), "majorVersion", term23158);
        setField(term23093, term23093.getClass(), "minorVersion", term23160);
        setField(term23093, term23093.getClass(), "creationDateText", "aSATgQUpoe");
        setLongField(term23174, term23174.getClass(), "fastTime", 1550698994689L);
        setField(term23174, term23174.getClass(), "cdate", null);
        setField(term23093, term23093.getClass(), "creationDate", term23174);
        setField(term23093, term23093.getClass(), "additional", term23176);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.dgiwg.GeoPackageFileName");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hasZoomLevel1", argTypes, term23093, args);
    }

};


