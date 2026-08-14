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

public class GeoPackageFileName_getDataProduct_8386653345 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21382;

    public GeoPackageFileName_getDataProduct_8386653345() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term21431 = new Integer(-1786399638);
        Integer term21433 = new Integer(2055867847);
        Integer term21447 = new Integer(-1048298087);
        Integer term21449 = new Integer(292681826);
        ArrayList term21465 = new ArrayList();
        ((ArrayList) term21465).add("cSHGbqKqlN");
        ((ArrayList) term21465).add("pFAfANnxup");
        ((ArrayList) term21465).add("FbSIUZyBXZ");
        ((ArrayList) term21465).add("mhQDwIyrRi");
        ((ArrayList) term21465).add("HpZXWDPhlg");
        term21382 = newInstance(Class.forName("mil.nga.geopackage.dgiwg.GeoPackageFileName"));
        Object term21463 = newInstance(Class.forName("java.util.Date"));
        setField(term21382, term21382.getClass(), "producer", "sUEeHQTWkA");
        setField(term21382, term21382.getClass(), "dataProduct", "BDIRCxAWLA");
        setField(term21382, term21382.getClass(), "geographicCoverageArea", "eOJfbiZLnb");
        setField(term21382, term21382.getClass(), "zoomLevels", "nKZKnxWYCK");
        setField(term21382, term21382.getClass(), "zoomLevel1", term21431);
        setField(term21382, term21382.getClass(), "zoomLevel2", term21433);
        setField(term21382, term21382.getClass(), "version", "JOqQxuzRuZ");
        setField(term21382, term21382.getClass(), "majorVersion", term21447);
        setField(term21382, term21382.getClass(), "minorVersion", term21449);
        setField(term21382, term21382.getClass(), "creationDateText", "RSaoipUlsg");
        setLongField(term21463, term21463.getClass(), "fastTime", 1349069753960L);
        setField(term21463, term21463.getClass(), "cdate", null);
        setField(term21382, term21382.getClass(), "creationDate", term21463);
        setField(term21382, term21382.getClass(), "additional", term21465);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.dgiwg.GeoPackageFileName");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDataProduct", argTypes, term21382, args);
    }

};


