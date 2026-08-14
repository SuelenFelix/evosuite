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

public class GeoPackageFileName_setZoomLevelRange_10209567215 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23930;
     Object term24041;
     Object term24043;

    public GeoPackageFileName_setZoomLevelRange_10209567215() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term23979 = new Integer(-505439934);
        Integer term23981 = new Integer(-344842608);
        Integer term23995 = new Integer(941650513);
        Integer term23997 = new Integer(444029505);
        ArrayList term24013 = new ArrayList();
        ((ArrayList) term24013).add("wsysQLGFnl");
        ((ArrayList) term24013).add("ckQLZGFjMX");
        term23930 = newInstance(Class.forName("mil.nga.geopackage.dgiwg.GeoPackageFileName"));
        Object term24011 = newInstance(Class.forName("java.util.Date"));
        setField(term23930, term23930.getClass(), "producer", "RTTvrwwhou");
        setField(term23930, term23930.getClass(), "dataProduct", "lRORwXipuk");
        setField(term23930, term23930.getClass(), "geographicCoverageArea", "fVdTcjgHdw");
        setField(term23930, term23930.getClass(), "zoomLevels", "wwAwLLcLPp");
        setField(term23930, term23930.getClass(), "zoomLevel1", term23979);
        setField(term23930, term23930.getClass(), "zoomLevel2", term23981);
        setField(term23930, term23930.getClass(), "version", "nHpMKOmlpQ");
        setField(term23930, term23930.getClass(), "majorVersion", term23995);
        setField(term23930, term23930.getClass(), "minorVersion", term23997);
        setField(term23930, term23930.getClass(), "creationDateText", "fKhrQsJToZ");
        setLongField(term24011, term24011.getClass(), "fastTime", 1744090065937L);
        setField(term24011, term24011.getClass(), "cdate", null);
        setField(term23930, term23930.getClass(), "creationDate", term24011);
        setField(term23930, term23930.getClass(), "additional", term24013);
        term24041 = new Integer(-1456670397);
        term24043 = new Integer(1622346318);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.dgiwg.GeoPackageFileName");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term24041;
        args[1] = term24043;
        callMethod(klass, "setZoomLevelRange", argTypes, term23930, args);
    }

};


