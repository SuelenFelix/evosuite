package com.github.cuteluobo.livedanmuarchive.pojo.biliapi;

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
import static com.github.cuteluobo.livedanmuarchive.pojo.biliapi.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class BaseUserInfo_setSubKey_13936927048 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14935;

    public BaseUserInfo_setSubKey_13936927048() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14935 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.BaseUserInfo"));
        setLongField(term14935, term14935.getClass(), "uid", -2083524977884307536L);
        setBooleanField(term14935, term14935.getClass(), "login", true);
        setIntField(term14935, term14935.getClass(), "level", 1841286431);
        setField(term14935, term14935.getClass(), "nickName", "RxrsjXRVcT");
        setField(term14935, term14935.getClass(), "imgKey", "cfRimmJxqA");
        setField(term14935, term14935.getClass(), "subKey", "oOnRVGqFmy");
        setField(term14935, term14935.getClass(), "cookie", "LaXzFIlWMk");
        setField(term14935, term14935.getClass(), "accessKey", "GuVQjhBxma");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.BaseUserInfo");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "WAVMPPbIfL";
        callMethod(klass, "setSubKey", argTypes, term14935, args);
    }

};


