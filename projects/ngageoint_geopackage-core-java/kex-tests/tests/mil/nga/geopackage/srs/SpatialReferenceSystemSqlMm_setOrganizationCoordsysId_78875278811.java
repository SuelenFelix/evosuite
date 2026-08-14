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
import java.lang.Integer;

public class SpatialReferenceSystemSqlMm_setOrganizationCoordsysId_78875278811 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term959;
     Object term1010;

    public SpatialReferenceSystemSqlMm_setOrganizationCoordsysId_78875278811() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term959 = newInstance(Class.forName("mil.nga.geopackage.srs.SpatialReferenceSystemSqlMm"));
        setField(term959, term959.getClass(), "srsName", "gGSMzuGICf");
        setIntField(term959, term959.getClass(), "srsId", -2068769794);
        setField(term959, term959.getClass(), "organization", "hxCBltsObl");
        setIntField(term959, term959.getClass(), "organizationCoordsysId", -117576464);
        setField(term959, term959.getClass(), "definition", "BndsHwAFMv");
        setField(term959, term959.getClass(), "description", "GzFkzHGYFt");
        term1010 = new Integer(-1007160944);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.srs.SpatialReferenceSystemSqlMm");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term1010;
        callMethod(klass, "setOrganizationCoordsysId", argTypes, term959, args);
    }

};


