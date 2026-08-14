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

public class DanMuSenderAccountData_setNickName_192743152914 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5591;

    public DanMuSenderAccountData_setNickName_192743152914() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5591 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.DanMuSenderAccountData"));
        setField(term5591, term5591.getClass(), "uid", "aQFUvuaYxd");
        setField(term5591, term5591.getClass(), "nickName", "zNFLXMifnS");
        setField(term5591, term5591.getClass(), "userName", "HHQcYMSBVc");
        setField(term5591, term5591.getClass(), "password", "wdoqITnaAP");
        setField(term5591, term5591.getClass(), "cookies", "rIPMBcrNqB");
        setBooleanField(term5591, term5591.getClass(), "alive", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.DanMuSenderAccountData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "UDaboHZHhz";
        callMethod(klass, "setNickName", argTypes, term5591, args);
    }

};


