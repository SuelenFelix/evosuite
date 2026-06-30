package icu.samnyan.aqua.sega.maimai.model.response;

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
import static icu.samnyan.aqua.sega.maimai.model.response.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class UserLoginResp_setConsecutiveLoginCount_3768090787 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7237;
     Object term7264;

    public UserLoginResp_setConsecutiveLoginCount_3768090787() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7237 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.response.UserLoginResp"));
        setIntField(term7237, term7237.getClass(), "returnCode", 1);
        setField(term7237, term7237.getClass(), "lastLoginDate", "2020-01-01 00:00:00.0");
        setIntField(term7237, term7237.getClass(), "loginCount", -985141153);
        setIntField(term7237, term7237.getClass(), "consecutiveLoginCount", -1983740361);
        term7264 = new Integer(-1494716341);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.response.UserLoginResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term7264;
        callMethod(klass, "setConsecutiveLoginCount", argTypes, term7237, args);
    }

};


