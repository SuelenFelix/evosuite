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
import java.lang.String;
import java.lang.Object;

public class LiveRoomData_getLiveAnchorName_620786819 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34751;

    public LiveRoomData_getLiveAnchorName_620786819() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term34831 = Class.forName((String) "com.github.cuteluobo.livedanmuarchive.enums.WebsiteType");
        Field term34830 = ((Class) term34831).getDeclaredField((String) "Huya");
        ((Field) term34830).setAccessible(true);
        Object enum9 = ((Field) term34830).get((Object) null);
        term34751 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.LiveRoomData"));
        setField(term34751, term34751.getClass(), "saveName", "jSTBfkWjge");
        setField(term34751, term34751.getClass(), "websiteType", enum9);
        setField(term34751, term34751.getClass(), "liveRoomUrl", "uKYhZULSHp");
        setField(term34751, term34751.getClass(), "liveRoomCode", "xdYuLllgpn");
        setField(term34751, term34751.getClass(), "liveAnchorName", "ayonlqalLA");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.LiveRoomData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLiveAnchorName", argTypes, term34751, args);
    }

};


