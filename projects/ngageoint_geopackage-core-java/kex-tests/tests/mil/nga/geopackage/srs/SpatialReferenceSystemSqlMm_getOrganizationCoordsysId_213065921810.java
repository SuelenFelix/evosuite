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

public class SpatialReferenceSystemSqlMm_getOrganizationCoordsysId_213065921810 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term868;

    public SpatialReferenceSystemSqlMm_getOrganizationCoordsysId_213065921810() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term868 = newInstance(Class.forName("mil.nga.geopackage.srs.SpatialReferenceSystemSqlMm"));
        setField(term868, term868.getClass(), "srsName", "nyiiPDVjAc");
        setIntField(term868, term868.getClass(), "srsId", -655067527);
        setField(term868, term868.getClass(), "organization", "aKnKipADSo");
        setIntField(term868, term868.getClass(), "organizationCoordsysId", -6029667);
        setField(term868, term868.getClass(), "definition", "wSQxaModmm");
        setField(term868, term868.getClass(), "description", "UlajhuVLaP");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.srs.SpatialReferenceSystemSqlMm");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getOrganizationCoordsysId", argTypes, term868, args);
    }

};


