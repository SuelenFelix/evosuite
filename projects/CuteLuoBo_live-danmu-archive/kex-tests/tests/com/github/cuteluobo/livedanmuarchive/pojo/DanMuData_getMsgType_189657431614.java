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
import java.lang.Object;
import java.lang.Long;

public class DanMuData_getMsgType_189657431614 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3971;

    public DanMuData_getMsgType_189657431614() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4015 = new Long(-316468845751588286L);
        term3971 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.DanMuData"));
        Object term3972 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.DanMuUserInfo"));
        Object term4009 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.DanMuFormat"));
        setField(term3972, term3972.getClass(), "uid", "PqtVXXZMqK");
        setField(term3972, term3972.getClass(), "nickName", "rYbtIDVdnd");
        setField(term3971, term3971.getClass(), "userIfo", term3972);
        setField(term3971, term3971.getClass(), "content", "UKAReurpHG");
        setIntField(term4009, term4009.getClass(), "fontColor", -1530420153);
        setIntField(term4009, term4009.getClass(), "fontSize", 25);
        setIntField(term4009, term4009.getClass(), "textSpeed", -469968304);
        setIntField(term4009, term4009.getClass(), "transitionType", 1);
        setIntField(term4009, term4009.getClass(), "popupStyle", -1145578966);
        setField(term3971, term3971.getClass(), "danMuFormatData", term4009);
        setField(term3971, term3971.getClass(), "timestamp", term4015);
        setField(term3971, term3971.getClass(), "msgType", "WVRMUmrljA");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.DanMuData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMsgType", argTypes, term3971, args);
    }

};


