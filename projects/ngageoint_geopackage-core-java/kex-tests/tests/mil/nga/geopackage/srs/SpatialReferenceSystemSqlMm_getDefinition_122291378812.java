package mil.nga.geopackage.srs;

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
import static mil.nga.geopackage.srs.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class SpatialReferenceSystemSqlMm_getDefinition_122291378812 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1052;

    public SpatialReferenceSystemSqlMm_getDefinition_122291378812() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1052 = newInstance(Class.forName("mil.nga.geopackage.srs.SpatialReferenceSystemSqlMm"));
        setField(term1052, term1052.getClass(), "srsName", "tShwQLRGNe");
        setIntField(term1052, term1052.getClass(), "srsId", 1135664017);
        setField(term1052, term1052.getClass(), "organization", "LvtrsXUliU");
        setIntField(term1052, term1052.getClass(), "organizationCoordsysId", 590364439);
        setField(term1052, term1052.getClass(), "definition", "xLbjWUgOIL");
        setField(term1052, term1052.getClass(), "description", "jDtqGUpnZN");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.srs.SpatialReferenceSystemSqlMm");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDefinition", argTypes, term1052, args);
    }

};


