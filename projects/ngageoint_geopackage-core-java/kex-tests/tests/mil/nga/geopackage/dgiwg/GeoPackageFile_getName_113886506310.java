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

public class GeoPackageFile_getName_113886506310 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18861;

    public GeoPackageFile_getName_113886506310() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term18990 = Class.forName((String) "java.io.File$PathStatus");
        Field term18989 = ((Class) term18990).getDeclaredField((String) "INVALID");
        ((Field) term18989).setAccessible(true);
        Object enum47 = ((Field) term18989).get((Object) null);
        Integer term18936 = new Integer(-1007160944);
        Integer term18938 = new Integer(1135664017);
        Integer term18952 = new Integer(590364439);
        Integer term18954 = new Integer(865208305);
        ArrayList term18970 = new ArrayList();
        ((ArrayList) term18970).add("");
        ((ArrayList) term18970).add("");
        ((ArrayList) term18970).add("");
        ((ArrayList) term18970).add("");
        ((ArrayList) term18970).add("");
        term18861 = newInstance(Class.forName("mil.nga.geopackage.dgiwg.GeoPackageFile"));
        Object term18862 = newInstance(Class.forName("java.io.File"));
        Object term18887 = newInstance(Class.forName("mil.nga.geopackage.dgiwg.GeoPackageFileName"));
        Object term18968 = newInstance(Class.forName("java.util.Date"));
        setField(term18862, term18862.getClass(), "path", "FjOiNAfBOc");
        setField(term18862, term18862.getClass(), "status", enum47);
        setIntField(term18862, term18862.getClass(), "prefixLength", -522618178);
        setField(term18862, term18862.getClass(), "filePath", null);
        setField(term18861, term18861.getClass(), "file", term18862);
        setField(term18887, term18887.getClass(), "producer", "iCCsaLHohG");
        setField(term18887, term18887.getClass(), "dataProduct", "NJhGgctbdj");
        setField(term18887, term18887.getClass(), "geographicCoverageArea", "MYWYUeLGOp");
        setField(term18887, term18887.getClass(), "zoomLevels", "tsTGdgQYUL");
        setField(term18887, term18887.getClass(), "zoomLevel1", term18936);
        setField(term18887, term18887.getClass(), "zoomLevel2", term18938);
        setField(term18887, term18887.getClass(), "version", "TtGbVmKcnX");
        setField(term18887, term18887.getClass(), "majorVersion", term18952);
        setField(term18887, term18887.getClass(), "minorVersion", term18954);
        setField(term18887, term18887.getClass(), "creationDateText", "GJVkUrCVdD");
        setLongField(term18968, term18968.getClass(), "fastTime", 1429023851389L);
        setField(term18968, term18968.getClass(), "cdate", null);
        setField(term18887, term18887.getClass(), "creationDate", term18968);
        setField(term18887, term18887.getClass(), "additional", term18970);
        setField(term18861, term18861.getClass(), "fileName", term18887);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.dgiwg.GeoPackageFile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term18861, args);
    }

};


