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
import java.util.ArrayList;
import java.lang.Long;
import java.util.LinkedList;

public class User_setDevices_1398947037 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3481;
     Object term3519;

    public User_setDevices_1398947037() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term3508 = new ArrayList();
        Long term3512 = new Long(8403492202041709902L);
        term3481 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.entity.User"));
        Object term3506 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        Object term3515 = newInstance(Class.forName("java.util.Date"));
        Object term3517 = newInstance(Class.forName("java.util.Date"));
        setField(term3481, term3481.getClass(), "email", "McpzErOcYb");
        setField(term3481, term3481.getClass(), "password", "jqrVEUvYEz");
        setIntField(term3506, term3506.getClass(), "modCount", 0);
        setField(term3481, term3481.getClass(), "devices", term3506);
        setField(term3481, term3481.getClass(), "roles", term3508);
        setField(term3481, term3481.getClass(), "id", term3512);
        setBooleanField(term3481, term3481.getClass(), "enabled", true);
        setLongField(term3515, term3515.getClass(), "fastTime", 1420676685312L);
        setField(term3515, term3515.getClass(), "cdate", null);
        setField(term3481, term3481.getClass(), "created", term3515);
        setLongField(term3517, term3517.getClass(), "fastTime", 1660581012376L);
        setField(term3517, term3517.getClass(), "cdate", null);
        setField(term3481, term3481.getClass(), "updated", term3517);
        ArrayList term3526 = new ArrayList();
        ((ArrayList) term3526).add((Object)null);
        Long term3529 = new Long(3423965054378869855L);
        Long term3586 = new Long(-593735869267672817L);
        Object term3522 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.entity.Device"));
        Object term3523 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.entity.User"));
        Object term3532 = newInstance(Class.forName("java.util.Date"));
        Object term3534 = newInstance(Class.forName("java.util.Date"));
        Object term3548 = newInstance(Class.forName("java.util.Date"));
        Object term3589 = newInstance(Class.forName("java.util.Date"));
        Object term3591 = newInstance(Class.forName("java.util.Date"));
        setField(term3523, term3523.getClass(), "email", "");
        setField(term3523, term3523.getClass(), "password", "");
        setField(term3523, term3523.getClass(), "devices", term3506);
        setField(term3523, term3523.getClass(), "roles", term3526);
        setField(term3523, term3523.getClass(), "id", term3529);
        setBooleanField(term3523, term3523.getClass(), "enabled", false);
        setLongField(term3532, term3532.getClass(), "fastTime", 1868705614427L);
        setField(term3532, term3532.getClass(), "cdate", null);
        setField(term3523, term3523.getClass(), "created", term3532);
        setLongField(term3534, term3534.getClass(), "fastTime", 1699431611544L);
        setField(term3534, term3534.getClass(), "cdate", null);
        setField(term3523, term3523.getClass(), "updated", term3534);
        setField(term3522, term3522.getClass(), "user", term3523);
        setField(term3522, term3522.getClass(), "refreshToken", "goAoCMhKBu");
        setLongField(term3548, term3548.getClass(), "fastTime", 1531781792150L);
        setField(term3548, term3548.getClass(), "cdate", null);
        setField(term3522, term3522.getClass(), "refreshTokenExpirationDate", term3548);
        setField(term3522, term3522.getClass(), "remoteAddress", "BWxJSgKHRT");
        setField(term3522, term3522.getClass(), "type", "AGXoIndFnm");
        setField(term3522, term3522.getClass(), "os", "mwmFMNEzkK");
        setField(term3522, term3522.getClass(), "id", term3586);
        setBooleanField(term3522, term3522.getClass(), "enabled", true);
        setLongField(term3589, term3589.getClass(), "fastTime", 1599033558510L);
        setField(term3589, term3589.getClass(), "cdate", null);
        setField(term3522, term3522.getClass(), "created", term3589);
        setLongField(term3591, term3591.getClass(), "fastTime", 1364453803662L);
        setField(term3591, term3591.getClass(), "cdate", null);
        setField(term3522, term3522.getClass(), "updated", term3591);
        Long term3596 = new Long(-7191625829563442696L);
        Long term3605 = new Long(1463379874413441830L);
        Object term3594 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.entity.Device"));
        Object term3595 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.entity.User"));
        Object term3600 = newInstance(Class.forName("java.util.Date"));
        Object term3608 = newInstance(Class.forName("java.util.Date"));
        Object term3610 = newInstance(Class.forName("java.util.Date"));
        setField(term3595, term3595.getClass(), "email", null);
        setField(term3595, term3595.getClass(), "password", null);
        setField(term3595, term3595.getClass(), "devices", term3506);
        setField(term3595, term3595.getClass(), "roles", null);
        setField(term3595, term3595.getClass(), "id", term3596);
        setBooleanField(term3595, term3595.getClass(), "enabled", true);
        setField(term3595, term3595.getClass(), "created", null);
        setField(term3595, term3595.getClass(), "updated", null);
        setField(term3594, term3594.getClass(), "user", term3595);
        setField(term3594, term3594.getClass(), "refreshToken", "");
        setLongField(term3600, term3600.getClass(), "fastTime", 1483432592773L);
        setField(term3600, term3600.getClass(), "cdate", null);
        setField(term3594, term3594.getClass(), "refreshTokenExpirationDate", term3600);
        setField(term3594, term3594.getClass(), "remoteAddress", "");
        setField(term3594, term3594.getClass(), "type", "");
        setField(term3594, term3594.getClass(), "os", "");
        setField(term3594, term3594.getClass(), "id", term3605);
        setBooleanField(term3594, term3594.getClass(), "enabled", true);
        setLongField(term3608, term3608.getClass(), "fastTime", 1784358717925L);
        setField(term3608, term3608.getClass(), "cdate", null);
        setField(term3594, term3594.getClass(), "created", term3608);
        setLongField(term3610, term3610.getClass(), "fastTime", 1662200363293L);
        setField(term3610, term3610.getClass(), "cdate", null);
        setField(term3594, term3594.getClass(), "updated", term3610);
        Long term3614 = new Long(-6609679920238945303L);
        Object term3613 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.entity.Device"));
        setField(term3613, term3613.getClass(), "user", null);
        setField(term3613, term3613.getClass(), "refreshToken", null);
        setField(term3613, term3613.getClass(), "refreshTokenExpirationDate", null);
        setField(term3613, term3613.getClass(), "remoteAddress", null);
        setField(term3613, term3613.getClass(), "type", null);
        setField(term3613, term3613.getClass(), "os", null);
        setField(term3613, term3613.getClass(), "id", term3614);
        setBooleanField(term3613, term3613.getClass(), "enabled", true);
        setField(term3613, term3613.getClass(), "created", null);
        setField(term3613, term3613.getClass(), "updated", null);
        term3519 = new LinkedList();
        ((LinkedList) term3519).add(term3522);
        ((LinkedList) term3519).add(term3594);
        ((LinkedList) term3519).add(term3613);
        ((LinkedList) term3519).add((Object)null);
        ((LinkedList) term3519).add((Object)null);
        ((LinkedList) term3519).add((Object)null);
        ((LinkedList) term3519).add((Object)null);
        ((LinkedList) term3519).add((Object)null);
        ((LinkedList) term3519).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.lyubenblagoev.postfixrest.entity.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term3519;
        callMethod(klass, "setDevices", argTypes, term3481, args);
    }

};


