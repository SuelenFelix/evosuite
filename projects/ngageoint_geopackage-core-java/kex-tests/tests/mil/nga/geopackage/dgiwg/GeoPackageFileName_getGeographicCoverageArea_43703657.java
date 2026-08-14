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

public class GeoPackageFileName_getGeographicCoverageArea_43703657 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21874;

    public GeoPackageFileName_getGeographicCoverageArea_43703657() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term21923 = new Integer(1596070772);
        Integer term21925 = new Integer(97029295);
        Integer term21939 = new Integer(-1371869594);
        Integer term21941 = new Integer(-2095575670);
        ArrayList term21957 = new ArrayList();
        ((ArrayList) term21957).add("TjWpyghUWN");
        ((ArrayList) term21957).add("dkZFDZxcde");
        ((ArrayList) term21957).add("WXcZEtUKlI");
        ((ArrayList) term21957).add("IkpjUOuWQU");
        ((ArrayList) term21957).add("boSSpezHeU");
        term21874 = newInstance(Class.forName("mil.nga.geopackage.dgiwg.GeoPackageFileName"));
        Object term21955 = newInstance(Class.forName("java.util.Date"));
        setField(term21874, term21874.getClass(), "producer", "jiUSjqwSIQ");
        setField(term21874, term21874.getClass(), "dataProduct", "MgLCedQfoj");
        setField(term21874, term21874.getClass(), "geographicCoverageArea", "zgKiINdgNu");
        setField(term21874, term21874.getClass(), "zoomLevels", "zLMTXDQHYH");
        setField(term21874, term21874.getClass(), "zoomLevel1", term21923);
        setField(term21874, term21874.getClass(), "zoomLevel2", term21925);
        setField(term21874, term21874.getClass(), "version", "PqywFWJlpE");
        setField(term21874, term21874.getClass(), "majorVersion", term21939);
        setField(term21874, term21874.getClass(), "minorVersion", term21941);
        setField(term21874, term21874.getClass(), "creationDateText", "OzXRsFGTIp");
        setLongField(term21955, term21955.getClass(), "fastTime", 1863631094992L);
        setField(term21955, term21955.getClass(), "cdate", null);
        setField(term21874, term21874.getClass(), "creationDate", term21955);
        setField(term21874, term21874.getClass(), "additional", term21957);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.dgiwg.GeoPackageFileName");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getGeographicCoverageArea", argTypes, term21874, args);
    }

};


