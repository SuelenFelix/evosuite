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

public class Bcc_getAccount_8544416651 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4651;

    public Bcc_getAccount_8544416651() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4668 = new Long(5592522907226111065L);
        Long term4699 = new Long(-2577420466618938650L);
        Long term4718 = new Long(5614572229094721840L);
        term4651 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.entity.Bcc"));
        Object term4652 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.entity.Account"));
        Object term4653 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.entity.Domain"));
        Object term4666 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        Object term4671 = newInstance(Class.forName("java.util.Date"));
        Object term4673 = newInstance(Class.forName("java.util.Date"));
        Object term4702 = newInstance(Class.forName("java.util.Date"));
        Object term4704 = newInstance(Class.forName("java.util.Date"));
        Object term4721 = newInstance(Class.forName("java.util.Date"));
        Object term4723 = newInstance(Class.forName("java.util.Date"));
        setField(term4653, term4653.getClass(), "name", "vXiaNiquft");
        setIntField(term4666, term4666.getClass(), "modCount", 0);
        setField(term4653, term4653.getClass(), "accounts", term4666);
        setField(term4653, term4653.getClass(), "aliases", term4666);
        setField(term4653, term4653.getClass(), "id", term4668);
        setBooleanField(term4653, term4653.getClass(), "enabled", true);
        setLongField(term4671, term4671.getClass(), "fastTime", 1562677945957L);
        setField(term4671, term4671.getClass(), "cdate", null);
        setField(term4653, term4653.getClass(), "created", term4671);
        setLongField(term4673, term4673.getClass(), "fastTime", 1514735133159L);
        setField(term4673, term4673.getClass(), "cdate", null);
        setField(term4653, term4653.getClass(), "updated", term4673);
        setField(term4652, term4652.getClass(), "domain", term4653);
        setField(term4652, term4652.getClass(), "username", "lucCeiVnYe");
        setField(term4652, term4652.getClass(), "password", "iYwkCLMsbJ");
        setField(term4652, term4652.getClass(), "id", term4699);
        setBooleanField(term4652, term4652.getClass(), "enabled", false);
        setLongField(term4702, term4702.getClass(), "fastTime", 1379940788325L);
        setField(term4702, term4702.getClass(), "cdate", null);
        setField(term4652, term4652.getClass(), "created", term4702);
        setLongField(term4704, term4704.getClass(), "fastTime", 1812203188667L);
        setField(term4704, term4704.getClass(), "cdate", null);
        setField(term4652, term4652.getClass(), "updated", term4704);
        setField(term4651, term4651.getClass(), "account", term4652);
        setField(term4651, term4651.getClass(), "receiverEmailAddress", "MXLsVQWrwc");
        setField(term4651, term4651.getClass(), "id", term4718);
        setBooleanField(term4651, term4651.getClass(), "enabled", false);
        setLongField(term4721, term4721.getClass(), "fastTime", 1366970936024L);
        setField(term4721, term4721.getClass(), "cdate", null);
        setField(term4651, term4651.getClass(), "created", term4721);
        setLongField(term4723, term4723.getClass(), "fastTime", 1389932841911L);
        setField(term4723, term4723.getClass(), "cdate", null);
        setField(term4651, term4651.getClass(), "updated", term4723);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.lyubenblagoev.postfixrest.entity.Bcc");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAccount", argTypes, term4651, args);
    }

};


