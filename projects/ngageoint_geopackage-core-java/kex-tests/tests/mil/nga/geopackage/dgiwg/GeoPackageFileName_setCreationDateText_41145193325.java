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

public class GeoPackageFileName_setCreationDateText_41145193325 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26578;

    public GeoPackageFileName_setCreationDateText_41145193325() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term26627 = new Integer(96566506);
        Integer term26629 = new Integer(-343325701);
        Integer term26643 = new Integer(107945604);
        Integer term26645 = new Integer(-1963464809);
        ArrayList term26661 = new ArrayList();
        ((ArrayList) term26661).add("vgdwrCZczl");
        ((ArrayList) term26661).add("gKMNrpKBpu");
        ((ArrayList) term26661).add("ZbHJVEqcoa");
        ((ArrayList) term26661).add("awDQVEVIKi");
        ((ArrayList) term26661).add("HJwNgUzZZR");
        term26578 = newInstance(Class.forName("mil.nga.geopackage.dgiwg.GeoPackageFileName"));
        Object term26659 = newInstance(Class.forName("java.util.Date"));
        setField(term26578, term26578.getClass(), "producer", "EWFbEDAVrE");
        setField(term26578, term26578.getClass(), "dataProduct", "EMiMtYgfvr");
        setField(term26578, term26578.getClass(), "geographicCoverageArea", "OyYyYYnJuF");
        setField(term26578, term26578.getClass(), "zoomLevels", "aYLvcxZohT");
        setField(term26578, term26578.getClass(), "zoomLevel1", term26627);
        setField(term26578, term26578.getClass(), "zoomLevel2", term26629);
        setField(term26578, term26578.getClass(), "version", "mnHyQbMyld");
        setField(term26578, term26578.getClass(), "majorVersion", term26643);
        setField(term26578, term26578.getClass(), "minorVersion", term26645);
        setField(term26578, term26578.getClass(), "creationDateText", "KHtaDOIcJZ");
        setLongField(term26659, term26659.getClass(), "fastTime", 1659994192918L);
        setField(term26659, term26659.getClass(), "cdate", null);
        setField(term26578, term26578.getClass(), "creationDate", term26659);
        setField(term26578, term26578.getClass(), "additional", term26661);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.dgiwg.GeoPackageFileName");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "FvUCZgTXhq";
        callMethod(klass, "setCreationDateText", argTypes, term26578, args);
    }

};


