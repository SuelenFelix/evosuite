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

public class UserLoginResp_getLoginCount_18721093102 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6971;

    public UserLoginResp_getLoginCount_18721093102() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6971 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.response.UserLoginResp"));
        setIntField(term6971, term6971.getClass(), "returnCode", 1);
        setField(term6971, term6971.getClass(), "lastLoginDate", "2020-01-01 00:00:00.0");
        setIntField(term6971, term6971.getClass(), "loginCount", 2087429143);
        setIntField(term6971, term6971.getClass(), "consecutiveLoginCount", -1892890104);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.response.UserLoginResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLoginCount", argTypes, term6971, args);
    }

};


