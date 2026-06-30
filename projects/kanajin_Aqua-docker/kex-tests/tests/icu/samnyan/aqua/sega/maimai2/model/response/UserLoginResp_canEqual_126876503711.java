package icu.samnyan.aqua.sega.maimai2.model.response;

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
import static icu.samnyan.aqua.sega.maimai2.model.response.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class UserLoginResp_canEqual_126876503711 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23395;
     Object term23423;

    public UserLoginResp_canEqual_126876503711() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23395 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.UserLoginResp"));
        setIntField(term23395, term23395.getClass(), "returnCode", 1);
        setField(term23395, term23395.getClass(), "lastLoginDate", "2020-01-01 00:00:00.0");
        setIntField(term23395, term23395.getClass(), "loginCount", 1);
        setIntField(term23395, term23395.getClass(), "consecutiveLoginCount", 950494826);
        setIntField(term23395, term23395.getClass(), "loginId", 1);
        term23423 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.UserLoginResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term23423;
        callMethod(klass, "canEqual", argTypes, term23395, args);
    }

};


