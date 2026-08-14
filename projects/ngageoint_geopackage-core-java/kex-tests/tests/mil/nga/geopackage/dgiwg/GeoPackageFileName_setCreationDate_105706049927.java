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

public class GeoPackageFileName_setCreationDate_105706049927 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27004;
     Object term27115;

    public GeoPackageFileName_setCreationDate_105706049927() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term27053 = new Integer(-1222006000);
        Integer term27055 = new Integer(2095798786);
        Integer term27069 = new Integer(-1565502840);
        Integer term27071 = new Integer(344323424);
        ArrayList term27087 = new ArrayList();
        ((ArrayList) term27087).add("GSzQdbHLHw");
        ((ArrayList) term27087).add("IkfarsYNJO");
        term27004 = newInstance(Class.forName("mil.nga.geopackage.dgiwg.GeoPackageFileName"));
        Object term27085 = newInstance(Class.forName("java.util.Date"));
        setField(term27004, term27004.getClass(), "producer", "btBLMvHzJg");
        setField(term27004, term27004.getClass(), "dataProduct", "JdOMfNWgLP");
        setField(term27004, term27004.getClass(), "geographicCoverageArea", "uWqXrwAsDU");
        setField(term27004, term27004.getClass(), "zoomLevels", "hgFbWAUtsu");
        setField(term27004, term27004.getClass(), "zoomLevel1", term27053);
        setField(term27004, term27004.getClass(), "zoomLevel2", term27055);
        setField(term27004, term27004.getClass(), "version", "HqoTWlkbwF");
        setField(term27004, term27004.getClass(), "majorVersion", term27069);
        setField(term27004, term27004.getClass(), "minorVersion", term27071);
        setField(term27004, term27004.getClass(), "creationDateText", "CwNELDTAPP");
        setLongField(term27085, term27085.getClass(), "fastTime", 1304532099366L);
        setField(term27085, term27085.getClass(), "cdate", null);
        setField(term27004, term27004.getClass(), "creationDate", term27085);
        setField(term27004, term27004.getClass(), "additional", term27087);
        term27115 = newInstance(Class.forName("java.util.Date"));
        setLongField(term27115, term27115.getClass(), "fastTime", 1488725902101L);
        setField(term27115, term27115.getClass(), "cdate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.dgiwg.GeoPackageFileName");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Date");
        Object[] args = new Object[1];
        args[0] = term27115;
        callMethod(klass, "setCreationDate", argTypes, term27004, args);
    }

};


