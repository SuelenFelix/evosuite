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

public class Account_setPassword_11423576866 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5691;

    public Account_setPassword_11423576866() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term5707 = new Long(-4029227951294167228L);
        Long term5738 = new Long(5160033404788124731L);
        term5691 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.entity.Account"));
        Object term5692 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.entity.Domain"));
        Object term5705 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        Object term5710 = newInstance(Class.forName("java.util.Date"));
        Object term5712 = newInstance(Class.forName("java.util.Date"));
        Object term5741 = newInstance(Class.forName("java.util.Date"));
        Object term5743 = newInstance(Class.forName("java.util.Date"));
        setField(term5692, term5692.getClass(), "name", "gSAtqakaLY");
        setIntField(term5705, term5705.getClass(), "modCount", 0);
        setField(term5692, term5692.getClass(), "accounts", term5705);
        setField(term5692, term5692.getClass(), "aliases", term5705);
        setField(term5692, term5692.getClass(), "id", term5707);
        setBooleanField(term5692, term5692.getClass(), "enabled", true);
        setLongField(term5710, term5710.getClass(), "fastTime", 1702968291952L);
        setField(term5710, term5710.getClass(), "cdate", null);
        setField(term5692, term5692.getClass(), "created", term5710);
        setLongField(term5712, term5712.getClass(), "fastTime", 1593931716986L);
        setField(term5712, term5712.getClass(), "cdate", null);
        setField(term5692, term5692.getClass(), "updated", term5712);
        setField(term5691, term5691.getClass(), "domain", term5692);
        setField(term5691, term5691.getClass(), "username", "taPBiMFNEZ");
        setField(term5691, term5691.getClass(), "password", "NoAFAfGyYL");
        setField(term5691, term5691.getClass(), "id", term5738);
        setBooleanField(term5691, term5691.getClass(), "enabled", false);
        setLongField(term5741, term5741.getClass(), "fastTime", 1689632312860L);
        setField(term5741, term5741.getClass(), "cdate", null);
        setField(term5691, term5691.getClass(), "created", term5741);
        setLongField(term5743, term5743.getClass(), "fastTime", 1271913847766L);
        setField(term5743, term5743.getClass(), "cdate", null);
        setField(term5691, term5691.getClass(), "updated", term5743);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.lyubenblagoev.postfixrest.entity.Account");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "MFtfkBMyOD";
        callMethod(klass, "setPassword", argTypes, term5691, args);
    }

};


