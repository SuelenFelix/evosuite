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

public class GeoPackageFileName_setVersion_106039859223 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26148;
     Object term26283;
     Object term26285;

    public GeoPackageFileName_setVersion_106039859223() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term26197 = new Integer(568954359);
        Integer term26199 = new Integer(53410913);
        Integer term26213 = new Integer(-375014958);
        Integer term26215 = new Integer(1107176718);
        ArrayList term26231 = new ArrayList();
        ((ArrayList) term26231).add("bucTnYicnp");
        ((ArrayList) term26231).add("EkgprvqZlM");
        ((ArrayList) term26231).add("fbnKvthhOz");
        ((ArrayList) term26231).add("PGfCDJTBek");
        term26148 = newInstance(Class.forName("mil.nga.geopackage.dgiwg.GeoPackageFileName"));
        Object term26229 = newInstance(Class.forName("java.util.Date"));
        setField(term26148, term26148.getClass(), "producer", "PaCpFXGzdX");
        setField(term26148, term26148.getClass(), "dataProduct", "FftYCNbnks");
        setField(term26148, term26148.getClass(), "geographicCoverageArea", "lJoltmsadS");
        setField(term26148, term26148.getClass(), "zoomLevels", "mvfDtZNEHr");
        setField(term26148, term26148.getClass(), "zoomLevel1", term26197);
        setField(term26148, term26148.getClass(), "zoomLevel2", term26199);
        setField(term26148, term26148.getClass(), "version", "bvSgmFUDOU");
        setField(term26148, term26148.getClass(), "majorVersion", term26213);
        setField(term26148, term26148.getClass(), "minorVersion", term26215);
        setField(term26148, term26148.getClass(), "creationDateText", "XMHwbfiHRl");
        setLongField(term26229, term26229.getClass(), "fastTime", 1691868468367L);
        setField(term26229, term26229.getClass(), "cdate", null);
        setField(term26148, term26148.getClass(), "creationDate", term26229);
        setField(term26148, term26148.getClass(), "additional", term26231);
        term26283 = new Integer(-6029667);
        term26285 = new Integer(-2068769794);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.dgiwg.GeoPackageFileName");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term26283;
        args[1] = term26285;
        callMethod(klass, "setVersion", argTypes, term26148, args);
    }

};


