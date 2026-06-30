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

public class UserLoginResp_getReturnCode_21363966330 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6875;

    public UserLoginResp_getReturnCode_21363966330() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6875 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.response.UserLoginResp"));
        setIntField(term6875, term6875.getClass(), "returnCode", 1);
        setField(term6875, term6875.getClass(), "lastLoginDate", "2020-01-01 00:00:00.0");
        setIntField(term6875, term6875.getClass(), "loginCount", 427005798);
        setIntField(term6875, term6875.getClass(), "consecutiveLoginCount", -993454505);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.response.UserLoginResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getReturnCode", argTypes, term6875, args);
    }

};


