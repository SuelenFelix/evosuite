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

public class GeoPackageFileName_setZoomLevelScale_103500083716 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24125;
     Object term24308;
     Object term24310;

    public GeoPackageFileName_setZoomLevelScale_103500083716() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term24174 = new Integer(-1034506028);
        Integer term24176 = new Integer(-1263114719);
        Integer term24190 = new Integer(-894662986);
        Integer term24192 = new Integer(304775596);
        ArrayList term24208 = new ArrayList();
        ((ArrayList) term24208).add("AGXoIndFnm");
        ((ArrayList) term24208).add("mwmFMNEzkK");
        ((ArrayList) term24208).add("kVAmKknVln");
        ((ArrayList) term24208).add("MRFLbEGYKG");
        ((ArrayList) term24208).add("BYrGukTyof");
        ((ArrayList) term24208).add("jiCGTTzKGB");
        ((ArrayList) term24208).add("MqICFYzDJj");
        ((ArrayList) term24208).add("YgQvdcBQKw");
        term24125 = newInstance(Class.forName("mil.nga.geopackage.dgiwg.GeoPackageFileName"));
        Object term24206 = newInstance(Class.forName("java.util.Date"));
        setField(term24125, term24125.getClass(), "producer", "qphdrqUtNx");
        setField(term24125, term24125.getClass(), "dataProduct", "bwlLFAfNWx");
        setField(term24125, term24125.getClass(), "geographicCoverageArea", "JWodNQzjjV");
        setField(term24125, term24125.getClass(), "zoomLevels", "CAgxWjhxNf");
        setField(term24125, term24125.getClass(), "zoomLevel1", term24174);
        setField(term24125, term24125.getClass(), "zoomLevel2", term24176);
        setField(term24125, term24125.getClass(), "version", "goAoCMhKBu");
        setField(term24125, term24125.getClass(), "majorVersion", term24190);
        setField(term24125, term24125.getClass(), "minorVersion", term24192);
        setField(term24125, term24125.getClass(), "creationDateText", "BWxJSgKHRT");
        setLongField(term24206, term24206.getClass(), "fastTime", 1347400561385L);
        setField(term24206, term24206.getClass(), "cdate", null);
        setField(term24125, term24125.getClass(), "creationDate", term24206);
        setField(term24125, term24125.getClass(), "additional", term24208);
        term24308 = new Integer(1048535127);
        term24310 = new Integer(-655067527);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.dgiwg.GeoPackageFileName");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term24308;
        args[1] = term24310;
        callMethod(klass, "setZoomLevelScale", argTypes, term24125, args);
    }

};


