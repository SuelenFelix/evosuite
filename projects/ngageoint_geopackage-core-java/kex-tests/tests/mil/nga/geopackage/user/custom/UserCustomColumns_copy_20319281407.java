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
import java.util.ArrayList;
import java.lang.Object;
import java.util.HashMap;

public class UserCustomColumns_copy_20319281407 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1905;

    public UserCustomColumns_copy_20319281407() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1906 = new ArrayList();
        ((ArrayList) term1906).add("igCAtimmYB");
        ((ArrayList) term1906).add("DyiXbeYIaN");
        ((ArrayList) term1906).add("VGizxZnyHX");
        ((ArrayList) term1906).add("kVEZMHmRtR");
        ((ArrayList) term1906).add("ekxGuOYIwi");
        ((ArrayList) term1906).add("RbVQXSpxXy");
        ((ArrayList) term1906).add("YpJbIgJWWv");
        ((ArrayList) term1906).add("JppkknKVOw");
        ((ArrayList) term1906).add("iljANwuEjk");
        ArrayList term2031 = new ArrayList();
        HashMap term2036 = new HashMap();
        term1905 = newInstance(Class.forName("mil.nga.geopackage.user.custom.UserCustomColumns"));
        Object[] term2030 = (Object[]) newArray("java.lang.String", 0);
        setField(term1905, term1905.getClass(), "requiredColumns", term1906);
        setField(term1905, term1905.getClass(), "tableName", "kNqaJKIATy");
        setField(term1905, term1905.getClass(), "columnNames", term2030);
        setField(term1905, term1905.getClass(), "columns", term2031);
        setBooleanField(term1905, term1905.getClass(), "custom", false);
        setField(term1905, term1905.getClass(), "nameToIndex", term2036);
        setIntField(term1905, term1905.getClass(), "pkIndex", 865208305);
        setBooleanField(term1905, term1905.getClass(), "pkModifiable", true);
        setBooleanField(term1905, term1905.getClass(), "valueValidation", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.user.custom.UserCustomColumns");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "copy", argTypes, term1905, args);
    }

};


