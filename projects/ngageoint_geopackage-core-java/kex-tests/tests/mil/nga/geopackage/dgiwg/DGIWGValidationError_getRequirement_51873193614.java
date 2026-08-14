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
import java.lang.String;
import java.lang.Object;
import java.util.ArrayList;

public class DGIWGValidationError_getRequirement_51873193614 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13009;

    public DGIWGValidationError_getRequirement_51873193614() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term13178 = Class.forName((String) "mil.nga.geopackage.dgiwg.DGIWGRequirement");
        Field term13177 = ((Class) term13178).getDeclaredField((String) "CRS_COMPOUND_WKT");
        ((Field) term13177).setAccessible(true);
        Object enum33 = ((Field) term13177).get((Object) null);
        Object term13129 = newInstance(Class.forName("mil.nga.geopackage.dgiwg.DGIWGValidationKey"));
        setField(term13129, term13129.getClass(), "column", "");
        setField(term13129, term13129.getClass(), "value", "");
        Object term13132 = newInstance(Class.forName("mil.nga.geopackage.dgiwg.DGIWGValidationKey"));
        setField(term13132, term13132.getClass(), "column", "");
        setField(term13132, term13132.getClass(), "value", "");
        ArrayList term13127 = new ArrayList();
        ((ArrayList) term13127).add(term13129);
        ((ArrayList) term13127).add(term13132);
        term13009 = newInstance(Class.forName("mil.nga.geopackage.dgiwg.DGIWGValidationError"));
        setField(term13009, term13009.getClass(), "table", "dpNsDgfPso");
        setField(term13009, term13009.getClass(), "column", "hCWPJQKpdc");
        setField(term13009, term13009.getClass(), "value", "WzMEhMXkKx");
        setField(term13009, term13009.getClass(), "constraint", "XOiDvlDhdc");
        setField(term13009, term13009.getClass(), "requirement", enum33);
        setField(term13009, term13009.getClass(), "primaryKeys", term13127);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.dgiwg.DGIWGValidationError");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRequirement", argTypes, term13009, args);
    }

};


