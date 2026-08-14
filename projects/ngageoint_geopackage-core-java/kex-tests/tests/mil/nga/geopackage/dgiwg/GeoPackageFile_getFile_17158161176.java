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

public class GeoPackageFile_getFile_17158161176 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17488;

    public GeoPackageFile_getFile_17158161176() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term17621 = Class.forName((String) "java.io.File$PathStatus");
        Field term17620 = ((Class) term17621).getDeclaredField((String) "INVALID");
        ((Field) term17620).setAccessible(true);
        Object enum43 = ((Field) term17620).get((Object) null);
        Integer term17563 = new Integer(1227103734);
        Integer term17565 = new Integer(-1339778481);
        Integer term17579 = new Integer(1725571209);
        Integer term17581 = new Integer(-522618178);
        ArrayList term17597 = new ArrayList();
        ((ArrayList) term17597).add("");
        ((ArrayList) term17597).add("");
        ((ArrayList) term17597).add("");
        ((ArrayList) term17597).add("");
        ((ArrayList) term17597).add("");
        ((ArrayList) term17597).add("");
        ((ArrayList) term17597).add("");
        ((ArrayList) term17597).add("");
        ((ArrayList) term17597).add("");
        term17488 = newInstance(Class.forName("mil.nga.geopackage.dgiwg.GeoPackageFile"));
        Object term17489 = newInstance(Class.forName("java.io.File"));
        Object term17514 = newInstance(Class.forName("mil.nga.geopackage.dgiwg.GeoPackageFileName"));
        Object term17595 = newInstance(Class.forName("java.util.Date"));
        setField(term17489, term17489.getClass(), "path", "gUvcueTURF");
        setField(term17489, term17489.getClass(), "status", enum43);
        setIntField(term17489, term17489.getClass(), "prefixLength", -1955890973);
        setField(term17489, term17489.getClass(), "filePath", null);
        setField(term17488, term17488.getClass(), "file", term17489);
        setField(term17514, term17514.getClass(), "producer", "EwQBhZjCIT");
        setField(term17514, term17514.getClass(), "dataProduct", "aSkmSwTnEw");
        setField(term17514, term17514.getClass(), "geographicCoverageArea", "xvkbvaEGYd");
        setField(term17514, term17514.getClass(), "zoomLevels", "HBGNxdNURv");
        setField(term17514, term17514.getClass(), "zoomLevel1", term17563);
        setField(term17514, term17514.getClass(), "zoomLevel2", term17565);
        setField(term17514, term17514.getClass(), "version", "mfCpTPPQQm");
        setField(term17514, term17514.getClass(), "majorVersion", term17579);
        setField(term17514, term17514.getClass(), "minorVersion", term17581);
        setField(term17514, term17514.getClass(), "creationDateText", "OcJCIDNIXA");
        setLongField(term17595, term17595.getClass(), "fastTime", 1610940182830L);
        setField(term17595, term17595.getClass(), "cdate", null);
        setField(term17514, term17514.getClass(), "creationDate", term17595);
        setField(term17514, term17514.getClass(), "additional", term17597);
        setField(term17488, term17488.getClass(), "fileName", term17514);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.dgiwg.GeoPackageFile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFile", argTypes, term17488, args);
    }

};


