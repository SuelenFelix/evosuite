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

public class UserLoginResp_setLoginId_13941746489 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23294;
     Object term23322;

    public UserLoginResp_setLoginId_13941746489() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23294 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.UserLoginResp"));
        setIntField(term23294, term23294.getClass(), "returnCode", 1);
        setField(term23294, term23294.getClass(), "lastLoginDate", "2020-01-01 00:00:00.0");
        setIntField(term23294, term23294.getClass(), "loginCount", 1);
        setIntField(term23294, term23294.getClass(), "consecutiveLoginCount", 757298168);
        setIntField(term23294, term23294.getClass(), "loginId", 1);
        term23322 = new Integer(1392304956);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.UserLoginResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term23322;
        callMethod(klass, "setLoginId", argTypes, term23294, args);
    }

};


