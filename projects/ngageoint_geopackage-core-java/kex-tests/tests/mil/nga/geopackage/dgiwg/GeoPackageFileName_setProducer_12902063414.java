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

public class GeoPackageFileName_setProducer_12902063414 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21169;

    public GeoPackageFileName_setProducer_12902063414() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term21218 = new Integer(579005622);
        Integer term21220 = new Integer(-14890619);
        Integer term21234 = new Integer(1632125673);
        Integer term21236 = new Integer(454281060);
        ArrayList term21252 = new ArrayList();
        ((ArrayList) term21252).add("AWYyZiNfsm");
        ((ArrayList) term21252).add("ITRRYiuDwH");
        term21169 = newInstance(Class.forName("mil.nga.geopackage.dgiwg.GeoPackageFileName"));
        Object term21250 = newInstance(Class.forName("java.util.Date"));
        setField(term21169, term21169.getClass(), "producer", "MeTmRZXErV");
        setField(term21169, term21169.getClass(), "dataProduct", "jNxbVmoZgq");
        setField(term21169, term21169.getClass(), "geographicCoverageArea", "PvmBHIXaMY");
        setField(term21169, term21169.getClass(), "zoomLevels", "hulYxtowxw");
        setField(term21169, term21169.getClass(), "zoomLevel1", term21218);
        setField(term21169, term21169.getClass(), "zoomLevel2", term21220);
        setField(term21169, term21169.getClass(), "version", "GNEmuHPNcU");
        setField(term21169, term21169.getClass(), "majorVersion", term21234);
        setField(term21169, term21169.getClass(), "minorVersion", term21236);
        setField(term21169, term21169.getClass(), "creationDateText", "IoSfuKDFRe");
        setLongField(term21250, term21250.getClass(), "fastTime", 1745462962080L);
        setField(term21250, term21250.getClass(), "cdate", null);
        setField(term21169, term21169.getClass(), "creationDate", term21250);
        setField(term21169, term21169.getClass(), "additional", term21252);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.dgiwg.GeoPackageFileName");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "llRfwANcVF";
        callMethod(klass, "setProducer", argTypes, term21169, args);
    }

};


