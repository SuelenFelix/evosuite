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

public class GeoPackageFileName_toInteger_3509225637 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29625;

    public GeoPackageFileName_toInteger_3509225637() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term29674 = new Integer(1557431527);
        Integer term29676 = new Integer(-1504890659);
        Integer term29690 = new Integer(1358829571);
        Integer term29692 = new Integer(991356662);
        ArrayList term29708 = new ArrayList();
        ((ArrayList) term29708).add("lHYNCJRiOv");
        ((ArrayList) term29708).add("QVLresHoaP");
        ((ArrayList) term29708).add("IbxeAMwLVt");
        ((ArrayList) term29708).add("bShlAqoTmZ");
        term29625 = newInstance(Class.forName("mil.nga.geopackage.dgiwg.GeoPackageFileName"));
        Object term29706 = newInstance(Class.forName("java.util.Date"));
        setField(term29625, term29625.getClass(), "producer", "WkLpmqoQxy");
        setField(term29625, term29625.getClass(), "dataProduct", "XiNoscmYhd");
        setField(term29625, term29625.getClass(), "geographicCoverageArea", "asMqnMNrZp");
        setField(term29625, term29625.getClass(), "zoomLevels", "pqFUMTCKJd");
        setField(term29625, term29625.getClass(), "zoomLevel1", term29674);
        setField(term29625, term29625.getClass(), "zoomLevel2", term29676);
        setField(term29625, term29625.getClass(), "version", "PTEndmPMzk");
        setField(term29625, term29625.getClass(), "majorVersion", term29690);
        setField(term29625, term29625.getClass(), "minorVersion", term29692);
        setField(term29625, term29625.getClass(), "creationDateText", "aJQuCOCvZs");
        setLongField(term29706, term29706.getClass(), "fastTime", 1819191638549L);
        setField(term29706, term29706.getClass(), "cdate", null);
        setField(term29625, term29625.getClass(), "creationDate", term29706);
        setField(term29625, term29625.getClass(), "additional", term29708);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.dgiwg.GeoPackageFileName");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "nOKlKlNhtU";
        callMethod(klass, "toInteger", argTypes, term29625, args);
    }

};


