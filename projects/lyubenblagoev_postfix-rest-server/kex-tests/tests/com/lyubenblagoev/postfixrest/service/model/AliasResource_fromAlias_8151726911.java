package com.lyubenblagoev.postfixrest.service.model;

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
import static com.lyubenblagoev.postfixrest.service.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;

public class AliasResource_fromAlias_8151726911 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term707;

    public AliasResource_fromAlias_8151726911() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term723 = new Long(8059786003080744426L);
        Long term754 = new Long(-4365849114644724155L);
        term707 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.entity.Alias"));
        Object term708 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.entity.Domain"));
        Object term721 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        Object term726 = newInstance(Class.forName("java.util.Date"));
        Object term728 = newInstance(Class.forName("java.util.Date"));
        Object term757 = newInstance(Class.forName("java.util.Date"));
        Object term759 = newInstance(Class.forName("java.util.Date"));
        setField(term708, term708.getClass(), "name", "IoAlmYsBwc");
        setIntField(term721, term721.getClass(), "modCount", 0);
        setField(term708, term708.getClass(), "accounts", term721);
        setField(term708, term708.getClass(), "aliases", term721);
        setField(term708, term708.getClass(), "id", term723);
        setBooleanField(term708, term708.getClass(), "enabled", false);
        setLongField(term726, term726.getClass(), "fastTime", 1345871412244L);
        setField(term726, term726.getClass(), "cdate", null);
        setField(term708, term708.getClass(), "created", term726);
        setLongField(term728, term728.getClass(), "fastTime", 1480438351369L);
        setField(term728, term728.getClass(), "cdate", null);
        setField(term708, term708.getClass(), "updated", term728);
        setField(term707, term707.getClass(), "domain", term708);
        setField(term707, term707.getClass(), "alias", "TEParAifyi");
        setField(term707, term707.getClass(), "email", "OWDIEULEFu");
        setField(term707, term707.getClass(), "id", term754);
        setBooleanField(term707, term707.getClass(), "enabled", false);
        setLongField(term757, term757.getClass(), "fastTime", 1610940182830L);
        setField(term757, term757.getClass(), "cdate", null);
        setField(term707, term707.getClass(), "created", term757);
        setLongField(term759, term759.getClass(), "fastTime", 1606045635837L);
        setField(term759, term759.getClass(), "cdate", null);
        setField(term707, term707.getClass(), "updated", term759);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.lyubenblagoev.postfixrest.service.model.AliasResource");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.lyubenblagoev.postfixrest.entity.Alias");
        Object[] args = new Object[1];
        args[0] = term707;
        callMethod(klass, "fromAlias", argTypes, null, args);
    }

};


