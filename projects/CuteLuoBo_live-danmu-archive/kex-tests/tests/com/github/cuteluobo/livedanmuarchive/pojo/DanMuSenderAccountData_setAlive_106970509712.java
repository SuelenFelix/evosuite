package com.github.cuteluobo.livedanmuarchive.pojo;

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
import static com.github.cuteluobo.livedanmuarchive.pojo.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Boolean;

public class DanMuSenderAccountData_setAlive_106970509712 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5365;
     Object term5427;

    public DanMuSenderAccountData_setAlive_106970509712() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5365 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.DanMuSenderAccountData"));
        setField(term5365, term5365.getClass(), "uid", "THZSpzBRYP");
        setField(term5365, term5365.getClass(), "nickName", "ZfBIVGBQOE");
        setField(term5365, term5365.getClass(), "userName", "QSrDQfEsTR");
        setField(term5365, term5365.getClass(), "password", "PsqusYmejD");
        setField(term5365, term5365.getClass(), "cookies", "NTWMiBEaDF");
        setBooleanField(term5365, term5365.getClass(), "alive", true);
        term5427 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.DanMuSenderAccountData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term5427;
        callMethod(klass, "setAlive", argTypes, term5365, args);
    }

};


