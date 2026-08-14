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

public class GeoPackageFileName_setDataProduct_7356145186 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21639;

    public GeoPackageFileName_setDataProduct_7356145186() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term21688 = new Integer(458147407);
        Integer term21690 = new Integer(-184153539);
        Integer term21704 = new Integer(493620644);
        Integer term21706 = new Integer(1328271830);
        ArrayList term21722 = new ArrayList();
        ((ArrayList) term21722).add("qUtkFGMNUV");
        ((ArrayList) term21722).add("mGRiYhnMcR");
        ((ArrayList) term21722).add("NFlvfJCVPO");
        term21639 = newInstance(Class.forName("mil.nga.geopackage.dgiwg.GeoPackageFileName"));
        Object term21720 = newInstance(Class.forName("java.util.Date"));
        setField(term21639, term21639.getClass(), "producer", "lBOokzEPfe");
        setField(term21639, term21639.getClass(), "dataProduct", "dtGZCsKXbW");
        setField(term21639, term21639.getClass(), "geographicCoverageArea", "bdyhHbDAmJ");
        setField(term21639, term21639.getClass(), "zoomLevels", "BBXiTNHqGE");
        setField(term21639, term21639.getClass(), "zoomLevel1", term21688);
        setField(term21639, term21639.getClass(), "zoomLevel2", term21690);
        setField(term21639, term21639.getClass(), "version", "IEYhJmgCVd");
        setField(term21639, term21639.getClass(), "majorVersion", term21704);
        setField(term21639, term21639.getClass(), "minorVersion", term21706);
        setField(term21639, term21639.getClass(), "creationDateText", "KSJeYkkvpk");
        setLongField(term21720, term21720.getClass(), "fastTime", 1706078172457L);
        setField(term21720, term21720.getClass(), "cdate", null);
        setField(term21639, term21639.getClass(), "creationDate", term21720);
        setField(term21639, term21639.getClass(), "additional", term21722);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.dgiwg.GeoPackageFileName");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "KarbTXFmUU";
        callMethod(klass, "setDataProduct", argTypes, term21639, args);
    }

};


