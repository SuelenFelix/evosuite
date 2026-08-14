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

public class GeoPackageFileName_getZoomLevel1_106438085411 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22748;

    public GeoPackageFileName_getZoomLevel1_106438085411() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term22797 = new Integer(-2027534003);
        Integer term22799 = new Integer(1063420942);
        Integer term22813 = new Integer(1375330971);
        Integer term22815 = new Integer(-478195677);
        ArrayList term22831 = new ArrayList();
        ((ArrayList) term22831).add("IpmgwHTgnG");
        ((ArrayList) term22831).add("tIpkeYIezR");
        ((ArrayList) term22831).add("YkZtEtthvz");
        ((ArrayList) term22831).add("dwlZSxlXOo");
        ((ArrayList) term22831).add("lKrEAkypza");
        ((ArrayList) term22831).add("KtuuNAqGCQ");
        ((ArrayList) term22831).add("OGQsfjmReM");
        ((ArrayList) term22831).add("YsUtbngnRO");
        ((ArrayList) term22831).add("JisaWUxcNb");
        term22748 = newInstance(Class.forName("mil.nga.geopackage.dgiwg.GeoPackageFileName"));
        Object term22829 = newInstance(Class.forName("java.util.Date"));
        setField(term22748, term22748.getClass(), "producer", "SScVQYSvWH");
        setField(term22748, term22748.getClass(), "dataProduct", "MnovcqFhCl");
        setField(term22748, term22748.getClass(), "geographicCoverageArea", "qYtAeLzOhW");
        setField(term22748, term22748.getClass(), "zoomLevels", "tJzmOfcUnY");
        setField(term22748, term22748.getClass(), "zoomLevel1", term22797);
        setField(term22748, term22748.getClass(), "zoomLevel2", term22799);
        setField(term22748, term22748.getClass(), "version", "TKlccZUpjz");
        setField(term22748, term22748.getClass(), "majorVersion", term22813);
        setField(term22748, term22748.getClass(), "minorVersion", term22815);
        setField(term22748, term22748.getClass(), "creationDateText", "GGzwMoHZXC");
        setLongField(term22829, term22829.getClass(), "fastTime", 1725122217647L);
        setField(term22829, term22829.getClass(), "cdate", null);
        setField(term22748, term22748.getClass(), "creationDate", term22829);
        setField(term22748, term22748.getClass(), "additional", term22831);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.dgiwg.GeoPackageFileName");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getZoomLevel1", argTypes, term22748, args);
    }

};


