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

public class GeoPackageFileName_getName_51551197233 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28553;

    public GeoPackageFileName_getName_51551197233() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term28602 = new Integer(-461771056);
        Integer term28604 = new Integer(-243422082);
        Integer term28618 = new Integer(1384592638);
        Integer term28620 = new Integer(-1002370457);
        ArrayList term28636 = new ArrayList();
        ((ArrayList) term28636).add("IOddzvEWcl");
        ((ArrayList) term28636).add("bIrtpkYJWT");
        ((ArrayList) term28636).add("VuLLXpvPpZ");
        ((ArrayList) term28636).add("UEdzEKEEEV");
        term28553 = newInstance(Class.forName("mil.nga.geopackage.dgiwg.GeoPackageFileName"));
        Object term28634 = newInstance(Class.forName("java.util.Date"));
        setField(term28553, term28553.getClass(), "producer", "vpZIqpFbKM");
        setField(term28553, term28553.getClass(), "dataProduct", "dAbwpJCDif");
        setField(term28553, term28553.getClass(), "geographicCoverageArea", "ATSXJPySio");
        setField(term28553, term28553.getClass(), "zoomLevels", "XZkOUcbfFg");
        setField(term28553, term28553.getClass(), "zoomLevel1", term28602);
        setField(term28553, term28553.getClass(), "zoomLevel2", term28604);
        setField(term28553, term28553.getClass(), "version", "TGiJfagfky");
        setField(term28553, term28553.getClass(), "majorVersion", term28618);
        setField(term28553, term28553.getClass(), "minorVersion", term28620);
        setField(term28553, term28553.getClass(), "creationDateText", "BJklinBmhN");
        setLongField(term28634, term28634.getClass(), "fastTime", 1678177615298L);
        setField(term28634, term28634.getClass(), "cdate", null);
        setField(term28553, term28553.getClass(), "creationDate", term28634);
        setField(term28553, term28553.getClass(), "additional", term28636);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.dgiwg.GeoPackageFileName");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term28553, args);
    }

};


