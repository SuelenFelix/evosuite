package com.lyubenblagoev.postfixrest.entity;

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
import static com.lyubenblagoev.postfixrest.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;

public class Alias_setAlias_726717804 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term283;

    public Alias_setAlias_726717804() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term299 = new Long(6811161968424632369L);
        Long term330 = new Long(-7237588299778557629L);
        term283 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.entity.Alias"));
        Object term284 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.entity.Domain"));
        Object term297 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        Object term302 = newInstance(Class.forName("java.util.Date"));
        Object term304 = newInstance(Class.forName("java.util.Date"));
        Object term333 = newInstance(Class.forName("java.util.Date"));
        Object term335 = newInstance(Class.forName("java.util.Date"));
        setField(term284, term284.getClass(), "name", "NRdvgJlhkX");
        setIntField(term297, term297.getClass(), "modCount", 0);
        setField(term284, term284.getClass(), "accounts", term297);
        setField(term284, term284.getClass(), "aliases", term297);
        setField(term284, term284.getClass(), "id", term299);
        setBooleanField(term284, term284.getClass(), "enabled", true);
        setLongField(term302, term302.getClass(), "fastTime", 1706078172457L);
        setField(term302, term302.getClass(), "cdate", null);
        setField(term284, term284.getClass(), "created", term302);
        setLongField(term304, term304.getClass(), "fastTime", 1863631094992L);
        setField(term304, term304.getClass(), "cdate", null);
        setField(term284, term284.getClass(), "updated", term304);
        setField(term283, term283.getClass(), "domain", term284);
        setField(term283, term283.getClass(), "alias", "uuaPigETmJ");
        setField(term283, term283.getClass(), "email", "MxlszYVzRf");
        setField(term283, term283.getClass(), "id", term330);
        setBooleanField(term283, term283.getClass(), "enabled", false);
        setLongField(term333, term333.getClass(), "fastTime", 1882638884364L);
        setField(term333, term333.getClass(), "cdate", null);
        setField(term283, term283.getClass(), "created", term333);
        setLongField(term335, term335.getClass(), "fastTime", 1437757323580L);
        setField(term335, term335.getClass(), "cdate", null);
        setField(term283, term283.getClass(), "updated", term335);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.lyubenblagoev.postfixrest.entity.Alias");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "LQFpaHEwXR";
        callMethod(klass, "setAlias", argTypes, term283, args);
    }

};


