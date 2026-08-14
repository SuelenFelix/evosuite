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

public class GeoPackageFileName_hasMinorVersion_159667390722 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25935;

    public GeoPackageFileName_hasMinorVersion_159667390722() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term25984 = new Integer(1386130016);
        Integer term25986 = new Integer(1072005683);
        Integer term26000 = new Integer(1861318859);
        Integer term26002 = new Integer(1474524152);
        ArrayList term26018 = new ArrayList();
        ((ArrayList) term26018).add("ONcbPCQnHd");
        ((ArrayList) term26018).add("AobDaplFLl");
        ((ArrayList) term26018).add("pDkMNnAGgv");
        term25935 = newInstance(Class.forName("mil.nga.geopackage.dgiwg.GeoPackageFileName"));
        Object term26016 = newInstance(Class.forName("java.util.Date"));
        setField(term25935, term25935.getClass(), "producer", "fhZgTouhCC");
        setField(term25935, term25935.getClass(), "dataProduct", "wrikqJwXvL");
        setField(term25935, term25935.getClass(), "geographicCoverageArea", "UiWhvbypdr");
        setField(term25935, term25935.getClass(), "zoomLevels", "CgleElJNje");
        setField(term25935, term25935.getClass(), "zoomLevel1", term25984);
        setField(term25935, term25935.getClass(), "zoomLevel2", term25986);
        setField(term25935, term25935.getClass(), "version", "ZrchvNGMtd");
        setField(term25935, term25935.getClass(), "majorVersion", term26000);
        setField(term25935, term25935.getClass(), "minorVersion", term26002);
        setField(term25935, term25935.getClass(), "creationDateText", "WaEcyVlcIx");
        setLongField(term26016, term26016.getClass(), "fastTime", 1496859828764L);
        setField(term26016, term26016.getClass(), "cdate", null);
        setField(term25935, term25935.getClass(), "creationDate", term26016);
        setField(term25935, term25935.getClass(), "additional", term26018);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.dgiwg.GeoPackageFileName");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hasMinorVersion", argTypes, term25935, args);
    }

};


