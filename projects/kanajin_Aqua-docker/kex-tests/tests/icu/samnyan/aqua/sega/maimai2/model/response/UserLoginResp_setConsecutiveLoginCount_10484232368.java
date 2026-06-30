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
import java.lang.Integer;

public class UserLoginResp_setConsecutiveLoginCount_10484232368 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23243;
     Object term23271;

    public UserLoginResp_setConsecutiveLoginCount_10484232368() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23243 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.UserLoginResp"));
        setIntField(term23243, term23243.getClass(), "returnCode", 1);
        setField(term23243, term23243.getClass(), "lastLoginDate", "2020-01-01 00:00:00.0");
        setIntField(term23243, term23243.getClass(), "loginCount", 1);
        setIntField(term23243, term23243.getClass(), "consecutiveLoginCount", -1376241623);
        setIntField(term23243, term23243.getClass(), "loginId", 1);
        term23271 = new Integer(-949624433);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.UserLoginResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term23271;
        callMethod(klass, "setConsecutiveLoginCount", argTypes, term23243, args);
    }

};


