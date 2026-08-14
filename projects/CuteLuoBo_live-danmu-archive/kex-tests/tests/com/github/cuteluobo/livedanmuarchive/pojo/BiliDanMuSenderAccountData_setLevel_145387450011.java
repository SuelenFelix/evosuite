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
import java.lang.Integer;

public class BiliDanMuSenderAccountData_setLevel_145387450011 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37084;
     Object term37183;

    public BiliDanMuSenderAccountData_setLevel_145387450011() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term37084 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.BiliDanMuSenderAccountData"));
        setField(term37084, term37084.getClass(), "accessKey", "dTxnMmHoVm");
        setField(term37084, term37084.getClass(), "appKey", "iswxaQUQgT");
        setField(term37084, term37084.getClass(), "appSec", "MxUSQqhNse");
        setIntField(term37084, term37084.getClass(), "level", 241725499);
        setField(term37084, term37084.getClass(), "uid", "skwxdosvQV");
        setField(term37084, term37084.getClass(), "nickName", "DBYTggnCkD");
        setField(term37084, term37084.getClass(), "userName", "RyXrJxJQiY");
        setField(term37084, term37084.getClass(), "password", "JfnQeTdzWs");
        setField(term37084, term37084.getClass(), "cookies", "HGhGqMiMOk");
        setBooleanField(term37084, term37084.getClass(), "alive", true);
        term37183 = new Integer(823179298);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.BiliDanMuSenderAccountData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term37183;
        callMethod(klass, "setLevel", argTypes, term37084, args);
    }

};


