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
import java.util.LinkedList;

public class GeoPackageFileName_setAdditional_121997991330 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27689;
     Object term27884;

    public GeoPackageFileName_setAdditional_121997991330() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term27738 = new Integer(-1388471422);
        Integer term27740 = new Integer(-1498296052);
        Integer term27754 = new Integer(2098647989);
        Integer term27756 = new Integer(1598895173);
        ArrayList term27772 = new ArrayList();
        ((ArrayList) term27772).add("RbQmXqfXAT");
        ((ArrayList) term27772).add("fcCAsvfBbe");
        ((ArrayList) term27772).add("mUNcKUxghj");
        ((ArrayList) term27772).add("lnvLKbtveE");
        ((ArrayList) term27772).add("FfrrEhTHzQ");
        ((ArrayList) term27772).add("LXnDNrMsqT");
        ((ArrayList) term27772).add("ZLQamJFBmu");
        ((ArrayList) term27772).add("ZWcOCwKNvd");
        ((ArrayList) term27772).add("GTmoNrziyc");
        term27689 = newInstance(Class.forName("mil.nga.geopackage.dgiwg.GeoPackageFileName"));
        Object term27770 = newInstance(Class.forName("java.util.Date"));
        setField(term27689, term27689.getClass(), "producer", "iVOvTzOxwt");
        setField(term27689, term27689.getClass(), "dataProduct", "BjZQdecXvB");
        setField(term27689, term27689.getClass(), "geographicCoverageArea", "iUkOOQhEkw");
        setField(term27689, term27689.getClass(), "zoomLevels", "wmVoFoUVmU");
        setField(term27689, term27689.getClass(), "zoomLevel1", term27738);
        setField(term27689, term27689.getClass(), "zoomLevel2", term27740);
        setField(term27689, term27689.getClass(), "version", "lLiSiPCciB");
        setField(term27689, term27689.getClass(), "majorVersion", term27754);
        setField(term27689, term27689.getClass(), "minorVersion", term27756);
        setField(term27689, term27689.getClass(), "creationDateText", "PsMKIIEwdR");
        setLongField(term27770, term27770.getClass(), "fastTime", 1464421789888L);
        setField(term27770, term27770.getClass(), "cdate", null);
        setField(term27689, term27689.getClass(), "creationDate", term27770);
        setField(term27689, term27689.getClass(), "additional", term27772);
        term27884 = new LinkedList();
        ((LinkedList) term27884).add("LvztehSlhM");
        ((LinkedList) term27884).add("njvnWFTMxN");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.dgiwg.GeoPackageFileName");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term27884;
        callMethod(klass, "setAdditional", argTypes, term27689, args);
    }

};


