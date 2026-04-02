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

public class Alias_getEmail_2271397925 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term389;

    public Alias_getEmail_2271397925() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term405 = new Long(6967924379644551255L);
        Long term436 = new Long(-2813493605142626659L);
        term389 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.entity.Alias"));
        Object term390 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.entity.Domain"));
        Object term403 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        Object term408 = newInstance(Class.forName("java.util.Date"));
        Object term410 = newInstance(Class.forName("java.util.Date"));
        Object term439 = newInstance(Class.forName("java.util.Date"));
        Object term441 = newInstance(Class.forName("java.util.Date"));
        setField(term390, term390.getClass(), "name", "oVcInYnLWB");
        setIntField(term403, term403.getClass(), "modCount", 0);
        setField(term390, term390.getClass(), "accounts", term403);
        setField(term390, term390.getClass(), "aliases", term403);
        setField(term390, term390.getClass(), "id", term405);
        setBooleanField(term390, term390.getClass(), "enabled", true);
        setLongField(term408, term408.getClass(), "fastTime", 1668569229825L);
        setField(term408, term408.getClass(), "cdate", null);
        setField(term390, term390.getClass(), "created", term408);
        setLongField(term410, term410.getClass(), "fastTime", 1725122217647L);
        setField(term410, term410.getClass(), "cdate", null);
        setField(term390, term390.getClass(), "updated", term410);
        setField(term389, term389.getClass(), "domain", term390);
        setField(term389, term389.getClass(), "alias", "aJlieCFVtF");
        setField(term389, term389.getClass(), "email", "ZiaGIbnzTs");
        setField(term389, term389.getClass(), "id", term436);
        setBooleanField(term389, term389.getClass(), "enabled", false);
        setLongField(term439, term439.getClass(), "fastTime", 1550698994689L);
        setField(term439, term439.getClass(), "cdate", null);
        setField(term389, term389.getClass(), "created", term439);
        setLongField(term441, term441.getClass(), "fastTime", 1804998087131L);
        setField(term441, term441.getClass(), "cdate", null);
        setField(term389, term389.getClass(), "updated", term441);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.lyubenblagoev.postfixrest.entity.Alias");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEmail", argTypes, term389, args);
    }

};


