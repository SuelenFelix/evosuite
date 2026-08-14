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
import java.lang.String;
import java.lang.Object;
import java.lang.Integer;
import java.util.ArrayList;

public class GeoPackageFile_init_16413534940 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16462;
     Object term16487;

    public GeoPackageFile_init_16413534940() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term16631 = Class.forName((String) "java.io.File$PathStatus");
        Field term16630 = ((Class) term16631).getDeclaredField((String) "INVALID");
        ((Field) term16630).setAccessible(true);
        Object enum40 = ((Field) term16630).get((Object) null);
        term16462 = newInstance(Class.forName("java.io.File"));
        setField(term16462, term16462.getClass(), "path", "vGiuZVPJNH");
        setField(term16462, term16462.getClass(), "status", enum40);
        setIntField(term16462, term16462.getClass(), "prefixLength", 391863371);
        setField(term16462, term16462.getClass(), "filePath", null);
        Integer term16536 = new Integer(568599855);
        Integer term16538 = new Integer(1162663216);
        Integer term16552 = new Integer(1484323161);
        Integer term16554 = new Integer(391863371);
        ArrayList term16570 = new ArrayList();
        ((ArrayList) term16570).add("izPpKDErnQ");
        ((ArrayList) term16570).add("NnpwZBUTvx");
        term16487 = newInstance(Class.forName("mil.nga.geopackage.dgiwg.GeoPackageFileName"));
        Object term16568 = newInstance(Class.forName("java.util.Date"));
        setField(term16487, term16487.getClass(), "producer", "tlzpzIjMib");
        setField(term16487, term16487.getClass(), "dataProduct", "AZdLeSugwv");
        setField(term16487, term16487.getClass(), "geographicCoverageArea", "RMsXuyzKJV");
        setField(term16487, term16487.getClass(), "zoomLevels", "FwPbDZcHmB");
        setField(term16487, term16487.getClass(), "zoomLevel1", term16536);
        setField(term16487, term16487.getClass(), "zoomLevel2", term16538);
        setField(term16487, term16487.getClass(), "version", "hOncybyCAH");
        setField(term16487, term16487.getClass(), "majorVersion", term16552);
        setField(term16487, term16487.getClass(), "minorVersion", term16554);
        setField(term16487, term16487.getClass(), "creationDateText", "QduALnDSVo");
        setLongField(term16568, term16568.getClass(), "fastTime", 1345871412244L);
        setField(term16568, term16568.getClass(), "cdate", null);
        setField(term16487, term16487.getClass(), "creationDate", term16568);
        setField(term16487, term16487.getClass(), "additional", term16570);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.dgiwg.GeoPackageFile");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.io.File");
        argTypes[1] = Class.forName("mil.nga.geopackage.dgiwg.GeoPackageFileName");
        Object[] args = new Object[2];
        args[0] = term16462;
        args[1] = term16487;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


