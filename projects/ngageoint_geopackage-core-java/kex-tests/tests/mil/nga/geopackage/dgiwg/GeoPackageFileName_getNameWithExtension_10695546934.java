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

public class GeoPackageFileName_getNameWithExtension_10695546934 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28788;

    public GeoPackageFileName_getNameWithExtension_10695546934() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term28837 = new Integer(-2014576105);
        Integer term28839 = new Integer(1296895584);
        Integer term28853 = new Integer(628918458);
        Integer term28855 = new Integer(-1274456137);
        ArrayList term28871 = new ArrayList();
        ((ArrayList) term28871).add("ABPtcyCzkR");
        ((ArrayList) term28871).add("QgHhxMyKvr");
        ((ArrayList) term28871).add("VGiXZZTWRO");
        ((ArrayList) term28871).add("MlPtwXnJOJ");
        ((ArrayList) term28871).add("DbfiyFeaTe");
        ((ArrayList) term28871).add("dQxXGBtDLZ");
        ((ArrayList) term28871).add("EgSgEFIyyN");
        ((ArrayList) term28871).add("iAOFcXaLSf");
        term28788 = newInstance(Class.forName("mil.nga.geopackage.dgiwg.GeoPackageFileName"));
        Object term28869 = newInstance(Class.forName("java.util.Date"));
        setField(term28788, term28788.getClass(), "producer", "BcENaQFYSd");
        setField(term28788, term28788.getClass(), "dataProduct", "POPYycoDBy");
        setField(term28788, term28788.getClass(), "geographicCoverageArea", "LuWMOXdAPA");
        setField(term28788, term28788.getClass(), "zoomLevels", "blSffTnsOv");
        setField(term28788, term28788.getClass(), "zoomLevel1", term28837);
        setField(term28788, term28788.getClass(), "zoomLevel2", term28839);
        setField(term28788, term28788.getClass(), "version", "qbUMcIvEXH");
        setField(term28788, term28788.getClass(), "majorVersion", term28853);
        setField(term28788, term28788.getClass(), "minorVersion", term28855);
        setField(term28788, term28788.getClass(), "creationDateText", "TVxGTjeDcu");
        setLongField(term28869, term28869.getClass(), "fastTime", 1666076287186L);
        setField(term28869, term28869.getClass(), "cdate", null);
        setField(term28788, term28788.getClass(), "creationDate", term28869);
        setField(term28788, term28788.getClass(), "additional", term28871);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.dgiwg.GeoPackageFileName");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNameWithExtension", argTypes, term28788, args);
    }

};


