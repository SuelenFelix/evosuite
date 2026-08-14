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
import java.lang.Object;
import java.lang.String;
import java.lang.Integer;
import java.util.ArrayList;

public class GeoPackageFile_getFileName_7651041039 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18529;

    public GeoPackageFile_getFileName_7651041039() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term18659 = Class.forName((String) "java.io.File$PathStatus");
        Field term18658 = ((Class) term18659).getDeclaredField((String) "CHECKED");
        ((Field) term18658).setAccessible(true);
        Object enum46 = ((Field) term18658).get((Object) null);
        Integer term18604 = new Integer(-655067527);
        Integer term18606 = new Integer(-6029667);
        Integer term18620 = new Integer(-2068769794);
        Integer term18622 = new Integer(-117576464);
        ArrayList term18638 = new ArrayList();
        ((ArrayList) term18638).add("");
        ((ArrayList) term18638).add("");
        ((ArrayList) term18638).add("");
        ((ArrayList) term18638).add("");
        ((ArrayList) term18638).add("");
        ((ArrayList) term18638).add("");
        term18529 = newInstance(Class.forName("mil.nga.geopackage.dgiwg.GeoPackageFile"));
        Object term18530 = newInstance(Class.forName("java.io.File"));
        Object term18555 = newInstance(Class.forName("mil.nga.geopackage.dgiwg.GeoPackageFileName"));
        Object term18636 = newInstance(Class.forName("java.util.Date"));
        setField(term18530, term18530.getClass(), "path", "BwtdjiefJn");
        setField(term18530, term18530.getClass(), "status", enum46);
        setIntField(term18530, term18530.getClass(), "prefixLength", 1725571209);
        setField(term18530, term18530.getClass(), "filePath", null);
        setField(term18529, term18529.getClass(), "file", term18530);
        setField(term18555, term18555.getClass(), "producer", "jDmhBrIoDa");
        setField(term18555, term18555.getClass(), "dataProduct", "SPtPatHeOm");
        setField(term18555, term18555.getClass(), "geographicCoverageArea", "ywmcuThdfL");
        setField(term18555, term18555.getClass(), "zoomLevels", "GBOEuByOfr");
        setField(term18555, term18555.getClass(), "zoomLevel1", term18604);
        setField(term18555, term18555.getClass(), "zoomLevel2", term18606);
        setField(term18555, term18555.getClass(), "version", "NHbOFFjyVK");
        setField(term18555, term18555.getClass(), "majorVersion", term18620);
        setField(term18555, term18555.getClass(), "minorVersion", term18622);
        setField(term18555, term18555.getClass(), "creationDateText", "zaloBqlrSo");
        setLongField(term18636, term18636.getClass(), "fastTime", 1515890130018L);
        setField(term18636, term18636.getClass(), "cdate", null);
        setField(term18555, term18555.getClass(), "creationDate", term18636);
        setField(term18555, term18555.getClass(), "additional", term18638);
        setField(term18529, term18529.getClass(), "fileName", term18555);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.dgiwg.GeoPackageFile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFileName", argTypes, term18529, args);
    }

};


