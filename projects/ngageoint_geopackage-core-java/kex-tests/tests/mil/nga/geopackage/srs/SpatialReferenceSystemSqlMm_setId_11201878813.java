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

public class SpatialReferenceSystemSqlMm_setId_11201878813 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term183;
     Object term234;

    public SpatialReferenceSystemSqlMm_setId_11201878813() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term183 = newInstance(Class.forName("mil.nga.geopackage.srs.SpatialReferenceSystemSqlMm"));
        setField(term183, term183.getClass(), "srsName", "hRNSzYYIrc");
        setIntField(term183, term183.getClass(), "srsId", -1922583790);
        setField(term183, term183.getClass(), "organization", "RMFIsYGgne");
        setIntField(term183, term183.getClass(), "organizationCoordsysId", -616727354);
        setField(term183, term183.getClass(), "definition", "NRdvgJlhkX");
        setField(term183, term183.getClass(), "description", "uuaPigETmJ");
        term234 = new Integer(-1955890973);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.srs.SpatialReferenceSystemSqlMm");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term234;
        callMethod(klass, "setId", argTypes, term183, args);
    }

};


