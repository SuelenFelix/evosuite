package mil.nga.geopackage.user.custom;

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
import static mil.nga.geopackage.user.custom.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;
import java.util.HashMap;

public class UserCustomTable_getRequiredColumns_11701848338 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2878;

    public UserCustomTable_getRequiredColumns_11701848338() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2880 = new ArrayList();
        HashMap term2884 = new HashMap();
        term2878 = newInstance(Class.forName("mil.nga.geopackage.user.custom.UserCustomTable"));
        Object term2879 = newInstance(Class.forName("mil.nga.geopackage.db.table.Constraints"));
        setField(term2878, term2878.getClass(), "columns", null);
        setField(term2879, term2879.getClass(), "constraints", term2880);
        setField(term2879, term2879.getClass(), "typedContraints", term2884);
        setField(term2878, term2878.getClass(), "constraints", term2879);
        setField(term2878, term2878.getClass(), "contents", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.user.custom.UserCustomTable");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRequiredColumns", argTypes, term2878, args);
    }

};


