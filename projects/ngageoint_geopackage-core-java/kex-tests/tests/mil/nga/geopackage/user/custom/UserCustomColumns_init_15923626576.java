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

public class UserCustomColumns_init_15923626576 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1660;

    public UserCustomColumns_init_15923626576() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1661 = new ArrayList();
        ((ArrayList) term1661).add("OYbzXylRWW");
        ((ArrayList) term1661).add("DSNsTGYXDF");
        ((ArrayList) term1661).add("sQvGcVjdEx");
        ((ArrayList) term1661).add("rLHAoqXgPh");
        ArrayList term1786 = new ArrayList();
        HashMap term1791 = new HashMap();
        term1660 = newInstance(Class.forName("mil.nga.geopackage.user.custom.UserCustomColumns"));
        Object[] term1725 = (Object[]) newArray("java.lang.String", 5);
        setField(term1660, term1660.getClass(), "requiredColumns", term1661);
        setField(term1660, term1660.getClass(), "tableName", "zUlRdimJtU");
        setElement(term1725, 0, "vwbEQQNQrx");
        setElement(term1725, 1, "xtftXXMbem");
        setElement(term1725, 2, "cudZvLMQon");
        setElement(term1725, 3, "lihXWlGDxk");
        setElement(term1725, 4, "JmcmxoGhIK");
        setField(term1660, term1660.getClass(), "columnNames", term1725);
        setField(term1660, term1660.getClass(), "columns", term1786);
        setBooleanField(term1660, term1660.getClass(), "custom", false);
        setField(term1660, term1660.getClass(), "nameToIndex", term1791);
        setIntField(term1660, term1660.getClass(), "pkIndex", 590364439);
        setBooleanField(term1660, term1660.getClass(), "pkModifiable", true);
        setBooleanField(term1660, term1660.getClass(), "valueValidation", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.user.custom.UserCustomColumns");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("mil.nga.geopackage.user.custom.UserCustomColumns");
        Object[] args = new Object[1];
        args[0] = term1660;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


