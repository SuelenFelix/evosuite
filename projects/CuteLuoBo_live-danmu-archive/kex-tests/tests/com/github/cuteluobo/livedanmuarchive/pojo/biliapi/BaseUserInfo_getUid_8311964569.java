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

public class BaseUserInfo_getUid_8311964569 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15071;

    public BaseUserInfo_getUid_8311964569() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15071 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.BaseUserInfo"));
        setLongField(term15071, term15071.getClass(), "uid", -2691996476200751382L);
        setBooleanField(term15071, term15071.getClass(), "login", true);
        setIntField(term15071, term15071.getClass(), "level", -1723168189);
        setField(term15071, term15071.getClass(), "nickName", "GISHLsgALf");
        setField(term15071, term15071.getClass(), "imgKey", "PVykkUSgBq");
        setField(term15071, term15071.getClass(), "subKey", "tnKbZaCsuj");
        setField(term15071, term15071.getClass(), "cookie", "ZFpcYBgLNC");
        setField(term15071, term15071.getClass(), "accessKey", "VAGkRppBem");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.BaseUserInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUid", argTypes, term15071, args);
    }

};


