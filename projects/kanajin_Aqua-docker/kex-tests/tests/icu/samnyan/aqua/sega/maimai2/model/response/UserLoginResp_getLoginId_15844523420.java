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

public class UserLoginResp_getLoginId_15844523420 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23593;

    public UserLoginResp_getLoginId_15844523420() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23593 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.UserLoginResp"));
        setIntField(term23593, term23593.getClass(), "returnCode", 0);
        setField(term23593, term23593.getClass(), "lastLoginDate", null);
        setIntField(term23593, term23593.getClass(), "loginCount", 0);
        setIntField(term23593, term23593.getClass(), "consecutiveLoginCount", 0);
        setIntField(term23593, term23593.getClass(), "loginId", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.UserLoginResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLoginId", argTypes, term23593, args);
    }

};


