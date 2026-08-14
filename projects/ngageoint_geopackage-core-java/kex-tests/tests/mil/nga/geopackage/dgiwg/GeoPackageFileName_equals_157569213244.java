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

public class GeoPackageFileName_equals_157569213244 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31386;
     Object term31557;

    public GeoPackageFileName_equals_157569213244() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term31435 = new Integer(318591690);
        Integer term31437 = new Integer(-165587447);
        Integer term31451 = new Integer(-1347358701);
        Integer term31453 = new Integer(806595993);
        ArrayList term31469 = new ArrayList();
        ((ArrayList) term31469).add("rfqJDkDppz");
        ((ArrayList) term31469).add("MGorMVGauT");
        ((ArrayList) term31469).add("jXKxUGTuEF");
        ((ArrayList) term31469).add("nDCcyhiTnS");
        ((ArrayList) term31469).add("Bcivwcjece");
        ((ArrayList) term31469).add("QTefjRuiez");
        ((ArrayList) term31469).add("SQZVNkAVBB");
        term31386 = newInstance(Class.forName("mil.nga.geopackage.dgiwg.GeoPackageFileName"));
        Object term31467 = newInstance(Class.forName("java.util.Date"));
        setField(term31386, term31386.getClass(), "producer", "nJnRIRiLZK");
        setField(term31386, term31386.getClass(), "dataProduct", "eWnrMSbYbT");
        setField(term31386, term31386.getClass(), "geographicCoverageArea", "AjoFvDFyCY");
        setField(term31386, term31386.getClass(), "zoomLevels", "OFTJwdPiTG");
        setField(term31386, term31386.getClass(), "zoomLevel1", term31435);
        setField(term31386, term31386.getClass(), "zoomLevel2", term31437);
        setField(term31386, term31386.getClass(), "version", "QiUprSEluR");
        setField(term31386, term31386.getClass(), "majorVersion", term31451);
        setField(term31386, term31386.getClass(), "minorVersion", term31453);
        setField(term31386, term31386.getClass(), "creationDateText", "cDOXXottZh");
        setLongField(term31467, term31467.getClass(), "fastTime", 1795936337628L);
        setField(term31467, term31467.getClass(), "cdate", null);
        setField(term31386, term31386.getClass(), "creationDate", term31467);
        setField(term31386, term31386.getClass(), "additional", term31469);
        term31557 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.dgiwg.GeoPackageFileName");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term31557;
        callMethod(klass, "equals", argTypes, term31386, args);
    }

};


