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

public class GeoPackageFileName_isInformative_83741325632 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28252;

    public GeoPackageFileName_isInformative_83741325632() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term28301 = new Integer(1283079251);
        Integer term28303 = new Integer(-523949691);
        Integer term28317 = new Integer(1398204340);
        Integer term28319 = new Integer(229204365);
        ArrayList term28335 = new ArrayList();
        ((ArrayList) term28335).add("qxhOsmyyjm");
        ((ArrayList) term28335).add("DuKcNfVVYR");
        ((ArrayList) term28335).add("fRujHWvXjJ");
        ((ArrayList) term28335).add("EAIAAStlTz");
        ((ArrayList) term28335).add("yIWXcOQTgy");
        ((ArrayList) term28335).add("xAWekqanqc");
        ((ArrayList) term28335).add("GSOWFHMlbF");
        term28252 = newInstance(Class.forName("mil.nga.geopackage.dgiwg.GeoPackageFileName"));
        Object term28333 = newInstance(Class.forName("java.util.Date"));
        setField(term28252, term28252.getClass(), "producer", "IiNCZfdouL");
        setField(term28252, term28252.getClass(), "dataProduct", "AhOHzCsHKW");
        setField(term28252, term28252.getClass(), "geographicCoverageArea", "UqgLPaaAHi");
        setField(term28252, term28252.getClass(), "zoomLevels", "xypryEkUPF");
        setField(term28252, term28252.getClass(), "zoomLevel1", term28301);
        setField(term28252, term28252.getClass(), "zoomLevel2", term28303);
        setField(term28252, term28252.getClass(), "version", "zyZTzHNjQr");
        setField(term28252, term28252.getClass(), "majorVersion", term28317);
        setField(term28252, term28252.getClass(), "minorVersion", term28319);
        setField(term28252, term28252.getClass(), "creationDateText", "YSrFKQQwXE");
        setLongField(term28333, term28333.getClass(), "fastTime", 1822704644050L);
        setField(term28333, term28333.getClass(), "cdate", null);
        setField(term28252, term28252.getClass(), "creationDate", term28333);
        setField(term28252, term28252.getClass(), "additional", term28335);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.dgiwg.GeoPackageFileName");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isInformative", argTypes, term28252, args);
    }

};


