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

public class Device_getUser_19937947091 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term591;

    public Device_getUser_19937947091() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term622 = new Long(7009926388951271268L);
        Object term621 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.entity.Role"));
        setField(term621, term621.getClass(), "name", null);
        setField(term621, term621.getClass(), "users", null);
        setField(term621, term621.getClass(), "id", term622);
        setBooleanField(term621, term621.getClass(), "enabled", false);
        setField(term621, term621.getClass(), "created", null);
        setField(term621, term621.getClass(), "updated", null);
        Object term625 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.entity.Role"));
        setField(term625, term625.getClass(), "name", null);
        setField(term625, term625.getClass(), "users", null);
        setField(term625, term625.getClass(), "id", null);
        setBooleanField(term625, term625.getClass(), "enabled", false);
        setField(term625, term625.getClass(), "created", null);
        setField(term625, term625.getClass(), "updated", null);
        Object term627 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.entity.Role"));
        setField(term627, term627.getClass(), "name", null);
        setField(term627, term627.getClass(), "users", null);
        setField(term627, term627.getClass(), "id", null);
        setBooleanField(term627, term627.getClass(), "enabled", false);
        setField(term627, term627.getClass(), "created", null);
        setField(term627, term627.getClass(), "updated", null);
        Long term630 = new Long(-4365849114644724155L);
        Object term629 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.entity.Role"));
        setField(term629, term629.getClass(), "name", null);
        setField(term629, term629.getClass(), "users", null);
        setField(term629, term629.getClass(), "id", term630);
        setBooleanField(term629, term629.getClass(), "enabled", true);
        setField(term629, term629.getClass(), "created", null);
        setField(term629, term629.getClass(), "updated", null);
        Object term633 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.entity.Role"));
        setField(term633, term633.getClass(), "name", null);
        setField(term633, term633.getClass(), "users", null);
        setField(term633, term633.getClass(), "id", null);
        setBooleanField(term633, term633.getClass(), "enabled", false);
        setField(term633, term633.getClass(), "created", null);
        setField(term633, term633.getClass(), "updated", null);
        ArrayList term619 = new ArrayList();
        ((ArrayList) term619).add(term621);
        ((ArrayList) term619).add(term625);
        ((ArrayList) term619).add(term627);
        ((ArrayList) term619).add(term629);
        ((ArrayList) term619).add(term633);
        Long term637 = new Long(-7672528020740371001L);
        Long term694 = new Long(-4502405999831680926L);
        term591 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.entity.Device"));
        Object term592 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.entity.User"));
        Object term617 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        Object term640 = newInstance(Class.forName("java.util.Date"));
        Object term642 = newInstance(Class.forName("java.util.Date"));
        Object term656 = newInstance(Class.forName("java.util.Date"));
        Object term697 = newInstance(Class.forName("java.util.Date"));
        Object term699 = newInstance(Class.forName("java.util.Date"));
        setField(term592, term592.getClass(), "email", "RkybSrpybU");
        setField(term592, term592.getClass(), "password", "xOEqzGAmDU");
        setIntField(term617, term617.getClass(), "modCount", 0);
        setField(term592, term592.getClass(), "devices", term617);
        setField(term592, term592.getClass(), "roles", term619);
        setField(term592, term592.getClass(), "id", term637);
        setBooleanField(term592, term592.getClass(), "enabled", false);
        setLongField(term640, term640.getClass(), "fastTime", 1853963979281L);
        setField(term640, term640.getClass(), "cdate", null);
        setField(term592, term592.getClass(), "created", term640);
        setLongField(term642, term642.getClass(), "fastTime", 1795936337628L);
        setField(term642, term642.getClass(), "cdate", null);
        setField(term592, term592.getClass(), "updated", term642);
        setField(term591, term591.getClass(), "user", term592);
        setField(term591, term591.getClass(), "refreshToken", "GzFkzHGYFt");
        setLongField(term656, term656.getClass(), "fastTime", 1802995433545L);
        setField(term656, term656.getClass(), "cdate", null);
        setField(term591, term591.getClass(), "refreshTokenExpirationDate", term656);
        setField(term591, term591.getClass(), "remoteAddress", "tShwQLRGNe");
        setField(term591, term591.getClass(), "type", "LvtrsXUliU");
        setField(term591, term591.getClass(), "os", "xLbjWUgOIL");
        setField(term591, term591.getClass(), "id", term694);
        setBooleanField(term591, term591.getClass(), "enabled", false);
        setLongField(term697, term697.getClass(), "fastTime", 1843214817357L);
        setField(term697, term697.getClass(), "cdate", null);
        setField(term591, term591.getClass(), "created", term697);
        setLongField(term699, term699.getClass(), "fastTime", 1628695316832L);
        setField(term699, term699.getClass(), "cdate", null);
        setField(term591, term591.getClass(), "updated", term699);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.lyubenblagoev.postfixrest.entity.Device");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUser", argTypes, term591, args);
    }

};


