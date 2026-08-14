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

public class UserRowSync_setRow_6394897132 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1838;
     Object term1847;

    public UserRowSync_setRow_6394897132() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1842 = new HashMap();
        term1838 = newInstance(Class.forName("mil.nga.geopackage.user.UserRowSync"));
        Object term1839 = newInstance(Class.forName("java.util.concurrent.locks.ReentrantLock"));
        Object term1840 = newInstance(Class.forName("java.util.concurrent.locks.ReentrantLock$NonfairSync"));
        setField(term1840, term1840.getClass(), "head", null);
        setField(term1840, term1840.getClass(), "tail", null);
        setIntField(term1840, term1840.getClass(), "state", 0);
        setField(term1840, term1840.getClass(), "exclusiveOwnerThread", null);
        setField(term1839, term1839.getClass(), "sync", term1840);
        setField(term1838, term1838.getClass(), "lock", term1839);
        setField(term1838, term1838.getClass(), "rows", term1842);
        term1847 = new Long(6375119433582206027L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.user.UserRowSync");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = long.class;
        argTypes[1] = Class.forName("mil.nga.geopackage.user.UserCoreRow");
        Object[] args = new Object[2];
        args[0] = term1847;
        args[1] = null;
        callMethod(klass, "setRow", argTypes, term1838, args);
    }

};


