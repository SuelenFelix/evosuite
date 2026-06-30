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

public class UserLoginResp_getConsecutiveLoginCount_7526740163 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7019;

    public UserLoginResp_getConsecutiveLoginCount_7526740163() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7019 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.response.UserLoginResp"));
        setIntField(term7019, term7019.getClass(), "returnCode", 1);
        setField(term7019, term7019.getClass(), "lastLoginDate", "2020-01-01 00:00:00.0");
        setIntField(term7019, term7019.getClass(), "loginCount", 2003356558);
        setIntField(term7019, term7019.getClass(), "consecutiveLoginCount", -638126185);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.response.UserLoginResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getConsecutiveLoginCount", argTypes, term7019, args);
    }

};


