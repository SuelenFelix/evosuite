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

public class GeoPackageFileName_setVersion_90808396518 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24665;

    public GeoPackageFileName_setVersion_90808396518() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term24714 = new Integer(-268815336);
        Integer term24716 = new Integer(-1210583429);
        Integer term24730 = new Integer(-663691365);
        Integer term24732 = new Integer(339854490);
        ArrayList term24748 = new ArrayList();
        ((ArrayList) term24748).add("VoghngXfsK");
        ((ArrayList) term24748).add("GbahCBMvct");
        ((ArrayList) term24748).add("iiHBhsNFgk");
        ((ArrayList) term24748).add("HknsTajwxJ");
        ((ArrayList) term24748).add("XtiurrVYKw");
        ((ArrayList) term24748).add("rsumfoDNHa");
        term24665 = newInstance(Class.forName("mil.nga.geopackage.dgiwg.GeoPackageFileName"));
        Object term24746 = newInstance(Class.forName("java.util.Date"));
        setField(term24665, term24665.getClass(), "producer", "IlBhdrCvHq");
        setField(term24665, term24665.getClass(), "dataProduct", "OirVUQhauU");
        setField(term24665, term24665.getClass(), "geographicCoverageArea", "GLbyDfbNZI");
        setField(term24665, term24665.getClass(), "zoomLevels", "oNLcCYDAsO");
        setField(term24665, term24665.getClass(), "zoomLevel1", term24714);
        setField(term24665, term24665.getClass(), "zoomLevel2", term24716);
        setField(term24665, term24665.getClass(), "version", "CNqMxLvtcJ");
        setField(term24665, term24665.getClass(), "majorVersion", term24730);
        setField(term24665, term24665.getClass(), "minorVersion", term24732);
        setField(term24665, term24665.getClass(), "creationDateText", "ktbqerIaKW");
        setLongField(term24746, term24746.getClass(), "fastTime", 1630952644759L);
        setField(term24746, term24746.getClass(), "cdate", null);
        setField(term24665, term24665.getClass(), "creationDate", term24746);
        setField(term24665, term24665.getClass(), "additional", term24748);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.dgiwg.GeoPackageFileName");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "ceCWHUTQUM";
        callMethod(klass, "setVersion", argTypes, term24665, args);
    }

};


