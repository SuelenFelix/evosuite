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
import java.lang.Object;
import java.util.HashMap;
import java.lang.Long;

public class UserRowSync_getRowOrLock_19000786311 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1827;
     Object term1836;

    public UserRowSync_getRowOrLock_19000786311() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1831 = new HashMap();
        term1827 = newInstance(Class.forName("mil.nga.geopackage.user.UserRowSync"));
        Object term1828 = newInstance(Class.forName("java.util.concurrent.locks.ReentrantLock"));
        Object term1829 = newInstance(Class.forName("java.util.concurrent.locks.ReentrantLock$NonfairSync"));
        setField(term1829, term1829.getClass(), "head", null);
        setField(term1829, term1829.getClass(), "tail", null);
        setIntField(term1829, term1829.getClass(), "state", 0);
        setField(term1829, term1829.getClass(), "exclusiveOwnerThread", null);
        setField(term1828, term1828.getClass(), "sync", term1829);
        setField(term1827, term1827.getClass(), "lock", term1828);
        setField(term1827, term1827.getClass(), "rows", term1831);
        term1836 = new Long(2442117782898005296L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.user.UserRowSync");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term1836;
        callMethod(klass, "getRowOrLock", argTypes, term1827, args);
    }

};


