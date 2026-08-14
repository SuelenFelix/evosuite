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

public class GeoPackageFileName_getAdditional_175870244928 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27197;

    public GeoPackageFileName_getAdditional_175870244928() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term27246 = new Integer(9726679);
        Integer term27248 = new Integer(-25637976);
        Integer term27262 = new Integer(1555897383);
        Integer term27264 = new Integer(202001407);
        ArrayList term27280 = new ArrayList();
        ((ArrayList) term27280).add("epPTwvcoyb");
        ((ArrayList) term27280).add("UBPHmOICBs");
        ((ArrayList) term27280).add("IDJUVPgUJf");
        ((ArrayList) term27280).add("JmnWRJUxGr");
        ((ArrayList) term27280).add("wgRGBNrTGP");
        ((ArrayList) term27280).add("FIdNVptZpW");
        ((ArrayList) term27280).add("rQjxAhisjm");
        term27197 = newInstance(Class.forName("mil.nga.geopackage.dgiwg.GeoPackageFileName"));
        Object term27278 = newInstance(Class.forName("java.util.Date"));
        setField(term27197, term27197.getClass(), "producer", "aZKOWhHMEh");
        setField(term27197, term27197.getClass(), "dataProduct", "YfkhviKZwl");
        setField(term27197, term27197.getClass(), "geographicCoverageArea", "DcOhhAfJTI");
        setField(term27197, term27197.getClass(), "zoomLevels", "gYTIkBFOoS");
        setField(term27197, term27197.getClass(), "zoomLevel1", term27246);
        setField(term27197, term27197.getClass(), "zoomLevel2", term27248);
        setField(term27197, term27197.getClass(), "version", "xmzSoVgiED");
        setField(term27197, term27197.getClass(), "majorVersion", term27262);
        setField(term27197, term27197.getClass(), "minorVersion", term27264);
        setField(term27197, term27197.getClass(), "creationDateText", "pdSvedKgPq");
        setLongField(term27278, term27278.getClass(), "fastTime", 1311560117361L);
        setField(term27278, term27278.getClass(), "cdate", null);
        setField(term27197, term27197.getClass(), "creationDate", term27278);
        setField(term27197, term27197.getClass(), "additional", term27280);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.dgiwg.GeoPackageFileName");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAdditional", argTypes, term27197, args);
    }

};


