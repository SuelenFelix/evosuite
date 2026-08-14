package com.github.cuteluobo.livedanmuarchive.utils;

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
import static com.github.cuteluobo.livedanmuarchive.utils.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;

public class BiliInfoUtil_getAuthInfo_12606871832 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term606;
     Object term608;

    public BiliInfoUtil_getAuthInfo_12606871832() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term606 = new Long(5270370404989704783L);
        term608 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.BaseUserInfo"));
        setLongField(term608, term608.getClass(), "uid", 7411271909051562686L);
        setBooleanField(term608, term608.getClass(), "login", false);
        setIntField(term608, term608.getClass(), "level", -522618178);
        setField(term608, term608.getClass(), "nickName", "vrQLuWIDJX");
        setField(term608, term608.getClass(), "imgKey", "flxyYxBRtu");
        setField(term608, term608.getClass(), "subKey", "OclPbYPkcH");
        setField(term608, term608.getClass(), "cookie", "IoAlmYsBwc");
        setField(term608, term608.getClass(), "accessKey", "TEParAifyi");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.utils.BiliInfoUtil");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = long.class;
        argTypes[1] = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.BaseUserInfo");
        Object[] args = new Object[2];
        args[0] = term606;
        args[1] = term608;
        callMethod(klass, "getAuthInfo", argTypes, null, args);
    }

};


