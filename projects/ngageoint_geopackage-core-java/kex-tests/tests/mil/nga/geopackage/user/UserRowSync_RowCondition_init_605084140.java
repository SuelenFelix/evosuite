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

public class UserRowSync_RowCondition_init_605084140 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5859;

    public UserRowSync_RowCondition_init_605084140() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term5863 = new HashMap();
        term5859 = newInstance(Class.forName("mil.nga.geopackage.user.UserRowSync"));
        Object term5860 = newInstance(Class.forName("java.util.concurrent.locks.ReentrantLock"));
        Object term5861 = newInstance(Class.forName("java.util.concurrent.locks.ReentrantLock$NonfairSync"));
        setField(term5861, term5861.getClass(), "head", null);
        setField(term5861, term5861.getClass(), "tail", null);
        setIntField(term5861, term5861.getClass(), "state", 0);
        setField(term5861, term5861.getClass(), "exclusiveOwnerThread", null);
        setField(term5860, term5860.getClass(), "sync", term5861);
        setField(term5859, term5859.getClass(), "lock", term5860);
        setField(term5859, term5859.getClass(), "rows", term5863);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.user.UserRowSync$RowCondition");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("mil.nga.geopackage.user.UserRowSync");
        Object[] args = new Object[1];
        args[0] = term5859;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


