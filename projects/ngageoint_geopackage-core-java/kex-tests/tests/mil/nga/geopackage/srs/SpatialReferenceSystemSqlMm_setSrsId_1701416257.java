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

public class SpatialReferenceSystemSqlMm_setSrsId_1701416257 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term571;
     Object term622;

    public SpatialReferenceSystemSqlMm_setSrsId_1701416257() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term571 = newInstance(Class.forName("mil.nga.geopackage.srs.SpatialReferenceSystemSqlMm"));
        setField(term571, term571.getClass(), "srsName", "vrQLuWIDJX");
        setIntField(term571, term571.getClass(), "srsId", -883034806);
        setField(term571, term571.getClass(), "organization", "flxyYxBRtu");
        setIntField(term571, term571.getClass(), "organizationCoordsysId", 1585847225);
        setField(term571, term571.getClass(), "definition", "OclPbYPkcH");
        setField(term571, term571.getClass(), "description", "IoAlmYsBwc");
        term622 = new Integer(597278769);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.srs.SpatialReferenceSystemSqlMm");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term622;
        callMethod(klass, "setSrsId", argTypes, term571, args);
    }

};


