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

public class Device_getRefreshToken_4929995963 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1005;

    public Device_getRefreshToken_4929995963() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1036 = new Long(6682528376118987775L);
        Object term1035 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.entity.Role"));
        setField(term1035, term1035.getClass(), "name", null);
        setField(term1035, term1035.getClass(), "users", null);
        setField(term1035, term1035.getClass(), "id", term1036);
        setBooleanField(term1035, term1035.getClass(), "enabled", false);
        setField(term1035, term1035.getClass(), "created", null);
        setField(term1035, term1035.getClass(), "updated", null);
        Long term1040 = new Long(2443640364875054177L);
        Object term1039 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.entity.Role"));
        setField(term1039, term1039.getClass(), "name", null);
        setField(term1039, term1039.getClass(), "users", null);
        setField(term1039, term1039.getClass(), "id", term1040);
        setBooleanField(term1039, term1039.getClass(), "enabled", true);
        setField(term1039, term1039.getClass(), "created", null);
        setField(term1039, term1039.getClass(), "updated", null);
        Object term1043 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.entity.Role"));
        setField(term1043, term1043.getClass(), "name", null);
        setField(term1043, term1043.getClass(), "users", null);
        setField(term1043, term1043.getClass(), "id", null);
        setBooleanField(term1043, term1043.getClass(), "enabled", false);
        setField(term1043, term1043.getClass(), "created", null);
        setField(term1043, term1043.getClass(), "updated", null);
        ArrayList term1033 = new ArrayList();
        ((ArrayList) term1033).add(term1035);
        ((ArrayList) term1033).add(term1039);
        ((ArrayList) term1033).add(term1043);
        Long term1047 = new Long(682356318767179819L);
        Long term1104 = new Long(-7291743527973326814L);
        term1005 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.entity.Device"));
        Object term1006 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.entity.User"));
        Object term1031 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        Object term1050 = newInstance(Class.forName("java.util.Date"));
        Object term1052 = newInstance(Class.forName("java.util.Date"));
        Object term1066 = newInstance(Class.forName("java.util.Date"));
        Object term1107 = newInstance(Class.forName("java.util.Date"));
        Object term1109 = newInstance(Class.forName("java.util.Date"));
        setField(term1006, term1006.getClass(), "email", "SPpkrGcPRr");
        setField(term1006, term1006.getClass(), "password", "sEccwbJKYE");
        setIntField(term1031, term1031.getClass(), "modCount", 0);
        setField(term1006, term1006.getClass(), "devices", term1031);
        setField(term1006, term1006.getClass(), "roles", term1033);
        setField(term1006, term1006.getClass(), "id", term1047);
        setBooleanField(term1006, term1006.getClass(), "enabled", false);
        setLongField(term1050, term1050.getClass(), "fastTime", 1847834235018L);
        setField(term1050, term1050.getClass(), "cdate", null);
        setField(term1006, term1006.getClass(), "created", term1050);
        setLongField(term1052, term1052.getClass(), "fastTime", 1744270719416L);
        setField(term1052, term1052.getClass(), "cdate", null);
        setField(term1006, term1006.getClass(), "updated", term1052);
        setField(term1005, term1005.getClass(), "user", term1006);
        setField(term1005, term1005.getClass(), "refreshToken", "lHfTrWKMPk");
        setLongField(term1066, term1066.getClass(), "fastTime", 1312186139711L);
        setField(term1066, term1066.getClass(), "cdate", null);
        setField(term1005, term1005.getClass(), "refreshTokenExpirationDate", term1066);
        setField(term1005, term1005.getClass(), "remoteAddress", "JDaAnsVTGV");
        setField(term1005, term1005.getClass(), "type", "mLUZFTfjle");
        setField(term1005, term1005.getClass(), "os", "xIeFjkHkOe");
        setField(term1005, term1005.getClass(), "id", term1104);
        setBooleanField(term1005, term1005.getClass(), "enabled", false);
        setLongField(term1107, term1107.getClass(), "fastTime", 1380452861286L);
        setField(term1107, term1107.getClass(), "cdate", null);
        setField(term1005, term1005.getClass(), "created", term1107);
        setLongField(term1109, term1109.getClass(), "fastTime", 1599094543267L);
        setField(term1109, term1109.getClass(), "cdate", null);
        setField(term1005, term1005.getClass(), "updated", term1109);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.lyubenblagoev.postfixrest.entity.Device");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRefreshToken", argTypes, term1005, args);
    }

};


