package mil.nga.geopackage.user;

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
import static mil.nga.geopackage.user.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.util.HashMap;

public class UserColumn_addConstraints_154735990542 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1649;

    public UserColumn_addConstraints_154735990542() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1650 = new ArrayList();
        HashMap term1654 = new HashMap();
        term1649 = newInstance(Class.forName("mil.nga.geopackage.db.table.Constraints"));
        setField(term1649, term1649.getClass(), "constraints", term1650);
        setField(term1649, term1649.getClass(), "typedContraints", term1654);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.user.UserColumn");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("mil.nga.geopackage.db.table.Constraints");
        Object[] args = new Object[1];
        args[0] = term1649;
        callMethod(klass, "addConstraints", argTypes, null, args);
    }

};


