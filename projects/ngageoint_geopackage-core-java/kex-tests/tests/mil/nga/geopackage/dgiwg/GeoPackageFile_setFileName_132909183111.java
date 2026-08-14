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

public class GeoPackageFile_setFileName_132909183111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19192;
     Object term19308;

    public GeoPackageFile_setFileName_132909183111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term19490 = Class.forName((String) "java.io.File$PathStatus");
        Field term19489 = ((Class) term19490).getDeclaredField((String) "CHECKED");
        ((Field) term19489).setAccessible(true);
        Object enum48 = ((Field) term19489).get((Object) null);
        Integer term19267 = new Integer(-1275173084);
        Integer term19269 = new Integer(-244121226);
        Integer term19283 = new Integer(-203030934);
        Integer term19285 = new Integer(-1179120542);
        ArrayList term19301 = new ArrayList();
        ((ArrayList) term19301).add("");
        ((ArrayList) term19301).add("");
        ((ArrayList) term19301).add("");
        term19192 = newInstance(Class.forName("mil.nga.geopackage.dgiwg.GeoPackageFile"));
        Object term19193 = newInstance(Class.forName("java.io.File"));
        Object term19218 = newInstance(Class.forName("mil.nga.geopackage.dgiwg.GeoPackageFileName"));
        Object term19299 = newInstance(Class.forName("java.util.Date"));
        setField(term19193, term19193.getClass(), "path", "TXZAIPQJHt");
        setField(term19193, term19193.getClass(), "status", enum48);
        setIntField(term19193, term19193.getClass(), "prefixLength", 1134449235);
        setField(term19193, term19193.getClass(), "filePath", null);
        setField(term19192, term19192.getClass(), "file", term19193);
        setField(term19218, term19218.getClass(), "producer", "DIbeDHICho");
        setField(term19218, term19218.getClass(), "dataProduct", "dJGPlmSRnz");
        setField(term19218, term19218.getClass(), "geographicCoverageArea", "DPskuFUobI");
        setField(term19218, term19218.getClass(), "zoomLevels", "wBGfLpNNiZ");
        setField(term19218, term19218.getClass(), "zoomLevel1", term19267);
        setField(term19218, term19218.getClass(), "zoomLevel2", term19269);
        setField(term19218, term19218.getClass(), "version", "yUGCjlqgJE");
        setField(term19218, term19218.getClass(), "majorVersion", term19283);
        setField(term19218, term19218.getClass(), "minorVersion", term19285);
        setField(term19218, term19218.getClass(), "creationDateText", "PXdVZyoJyC");
        setLongField(term19299, term19299.getClass(), "fastTime", 1495357463288L);
        setField(term19299, term19299.getClass(), "cdate", null);
        setField(term19218, term19218.getClass(), "creationDate", term19299);
        setField(term19218, term19218.getClass(), "additional", term19301);
        setField(term19192, term19192.getClass(), "fileName", term19218);
        Integer term19357 = new Integer(-73683645);
        Integer term19359 = new Integer(-226514366);
        Integer term19373 = new Integer(1193880199);
        Integer term19375 = new Integer(-1087774327);
        ArrayList term19391 = new ArrayList();
        ((ArrayList) term19391).add("SPBstwKFVr");
        ((ArrayList) term19391).add("WxYUTuqmIq");
        ((ArrayList) term19391).add("OeQLvhVERT");
        ((ArrayList) term19391).add("IlvgFINwIa");
        ((ArrayList) term19391).add("GEJABPlHSI");
        ((ArrayList) term19391).add("aQFUvuaYxd");
        ((ArrayList) term19391).add("zNFLXMifnS");
        term19308 = newInstance(Class.forName("mil.nga.geopackage.dgiwg.GeoPackageFileName"));
        Object term19389 = newInstance(Class.forName("java.util.Date"));
        setField(term19308, term19308.getClass(), "producer", "DzHVBMqWtE");
        setField(term19308, term19308.getClass(), "dataProduct", "THZSpzBRYP");
        setField(term19308, term19308.getClass(), "geographicCoverageArea", "ZfBIVGBQOE");
        setField(term19308, term19308.getClass(), "zoomLevels", "QSrDQfEsTR");
        setField(term19308, term19308.getClass(), "zoomLevel1", term19357);
        setField(term19308, term19308.getClass(), "zoomLevel2", term19359);
        setField(term19308, term19308.getClass(), "version", "PsqusYmejD");
        setField(term19308, term19308.getClass(), "majorVersion", term19373);
        setField(term19308, term19308.getClass(), "minorVersion", term19375);
        setField(term19308, term19308.getClass(), "creationDateText", "NTWMiBEaDF");
        setLongField(term19389, term19389.getClass(), "fastTime", 1645834034896L);
        setField(term19389, term19389.getClass(), "cdate", null);
        setField(term19308, term19308.getClass(), "creationDate", term19389);
        setField(term19308, term19308.getClass(), "additional", term19391);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.dgiwg.GeoPackageFile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("mil.nga.geopackage.dgiwg.GeoPackageFileName");
        Object[] args = new Object[1];
        args[0] = term19308;
        callMethod(klass, "setFileName", argTypes, term19192, args);
    }

};


