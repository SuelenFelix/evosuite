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

public class GeoPackageFile_setFile_16579004968 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18176;

    public GeoPackageFile_setFile_16579004968() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term18317 = Class.forName((String) "java.io.File$PathStatus");
        Field term18316 = ((Class) term18317).getDeclaredField((String) "CHECKED");
        ((Field) term18316).setAccessible(true);
        Object enum45 = ((Field) term18316).get((Object) null);
        Integer term18251 = new Integer(-1685132342);
        Integer term18253 = new Integer(-1456670397);
        Integer term18267 = new Integer(1622346318);
        Integer term18269 = new Integer(1048535127);
        ArrayList term18285 = new ArrayList();
        ((ArrayList) term18285).add("");
        ((ArrayList) term18285).add("");
        ((ArrayList) term18285).add("");
        ((ArrayList) term18285).add("");
        ((ArrayList) term18285).add("");
        term18176 = newInstance(Class.forName("mil.nga.geopackage.dgiwg.GeoPackageFile"));
        Object term18177 = newInstance(Class.forName("java.io.File"));
        Object term18202 = newInstance(Class.forName("mil.nga.geopackage.dgiwg.GeoPackageFileName"));
        Object term18283 = newInstance(Class.forName("java.util.Date"));
        setField(term18177, term18177.getClass(), "path", "doQLHkjpNm");
        setField(term18177, term18177.getClass(), "status", enum45);
        setIntField(term18177, term18177.getClass(), "prefixLength", -1339778481);
        setField(term18177, term18177.getClass(), "filePath", null);
        setField(term18176, term18176.getClass(), "file", term18177);
        setField(term18202, term18202.getClass(), "producer", "lCyLIcSuom");
        setField(term18202, term18202.getClass(), "dataProduct", "CGOpQSZZwI");
        setField(term18202, term18202.getClass(), "geographicCoverageArea", "ypEdrstygY");
        setField(term18202, term18202.getClass(), "zoomLevels", "sNQFlATEeQ");
        setField(term18202, term18202.getClass(), "zoomLevel1", term18251);
        setField(term18202, term18202.getClass(), "zoomLevel2", term18253);
        setField(term18202, term18202.getClass(), "version", "ZKMLioamsY");
        setField(term18202, term18202.getClass(), "majorVersion", term18267);
        setField(term18202, term18202.getClass(), "minorVersion", term18269);
        setField(term18202, term18202.getClass(), "creationDateText", "WVbxuoDBcn");
        setLongField(term18283, term18283.getClass(), "fastTime", 1442639565302L);
        setField(term18283, term18283.getClass(), "cdate", null);
        setField(term18202, term18202.getClass(), "creationDate", term18283);
        setField(term18202, term18202.getClass(), "additional", term18285);
        setField(term18176, term18176.getClass(), "fileName", term18202);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.dgiwg.GeoPackageFile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "bnsyeQXFdu";
        callMethod(klass, "setFile", argTypes, term18176, args);
    }

};


