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

public class DanMuData_setContent_16744782229 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3451;

    public DanMuData_setContent_16744782229() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3495 = new Long(-2813493605142626659L);
        term3451 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.DanMuData"));
        Object term3452 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.DanMuUserInfo"));
        Object term3489 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.DanMuFormat"));
        setField(term3452, term3452.getClass(), "uid", "WXMWFDGcLB");
        setField(term3452, term3452.getClass(), "nickName", "wKWbJssZuG");
        setField(term3451, term3451.getClass(), "userIfo", term3452);
        setField(term3451, term3451.getClass(), "content", "NzBMMhkhpT");
        setIntField(term3489, term3489.getClass(), "fontColor", 1622346318);
        setIntField(term3489, term3489.getClass(), "fontSize", 25);
        setIntField(term3489, term3489.getClass(), "textSpeed", 1048535127);
        setIntField(term3489, term3489.getClass(), "transitionType", 1);
        setIntField(term3489, term3489.getClass(), "popupStyle", -655067527);
        setField(term3451, term3451.getClass(), "danMuFormatData", term3489);
        setField(term3451, term3451.getClass(), "timestamp", term3495);
        setField(term3451, term3451.getClass(), "msgType", "qCpEbQDHdF");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.DanMuData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "AHbZyFOmlo";
        callMethod(klass, "setContent", argTypes, term3451, args);
    }

};


