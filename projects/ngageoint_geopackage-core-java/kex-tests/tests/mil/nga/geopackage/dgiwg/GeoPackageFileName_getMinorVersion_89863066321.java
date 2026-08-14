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

public class GeoPackageFileName_getMinorVersion_89863066321 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25634;

    public GeoPackageFileName_getMinorVersion_89863066321() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term25683 = new Integer(-893623680);
        Integer term25685 = new Integer(-1963434938);
        Integer term25699 = new Integer(906181092);
        Integer term25701 = new Integer(1045657203);
        ArrayList term25717 = new ArrayList();
        ((ArrayList) term25717).add("QZBHZqZope");
        ((ArrayList) term25717).add("VBUahCvyxC");
        ((ArrayList) term25717).add("MlzTkzKMCX");
        ((ArrayList) term25717).add("UqKUbMyPMJ");
        ((ArrayList) term25717).add("QpYltHAdyY");
        ((ArrayList) term25717).add("lbmSGBwIiV");
        ((ArrayList) term25717).add("DAxyHoTLzZ");
        term25634 = newInstance(Class.forName("mil.nga.geopackage.dgiwg.GeoPackageFileName"));
        Object term25715 = newInstance(Class.forName("java.util.Date"));
        setField(term25634, term25634.getClass(), "producer", "zHvfKaOstO");
        setField(term25634, term25634.getClass(), "dataProduct", "tOszriqETr");
        setField(term25634, term25634.getClass(), "geographicCoverageArea", "ncSPTkhKjO");
        setField(term25634, term25634.getClass(), "zoomLevels", "jcWKHRWhyj");
        setField(term25634, term25634.getClass(), "zoomLevel1", term25683);
        setField(term25634, term25634.getClass(), "zoomLevel2", term25685);
        setField(term25634, term25634.getClass(), "version", "nrQjODRMLD");
        setField(term25634, term25634.getClass(), "majorVersion", term25699);
        setField(term25634, term25634.getClass(), "minorVersion", term25701);
        setField(term25634, term25634.getClass(), "creationDateText", "PNoWXrsFic");
        setLongField(term25715, term25715.getClass(), "fastTime", 1334853104718L);
        setField(term25715, term25715.getClass(), "cdate", null);
        setField(term25634, term25634.getClass(), "creationDate", term25715);
        setField(term25634, term25634.getClass(), "additional", term25717);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.dgiwg.GeoPackageFileName");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMinorVersion", argTypes, term25634, args);
    }

};


