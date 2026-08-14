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

public class DanMuData_setMsgType_158691195615 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4069;

    public DanMuData_setMsgType_158691195615() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4113 = new Long(5127676408959197577L);
        term4069 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.DanMuData"));
        Object term4070 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.DanMuUserInfo"));
        Object term4107 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.DanMuFormat"));
        setField(term4070, term4070.getClass(), "uid", "NTlKJDDWlk");
        setField(term4070, term4070.getClass(), "nickName", "vOuMEpOQAg");
        setField(term4069, term4069.getClass(), "userIfo", term4070);
        setField(term4069, term4069.getClass(), "content", "SIODFGaQhr");
        setIntField(term4107, term4107.getClass(), "fontColor", 679763016);
        setIntField(term4107, term4107.getClass(), "fontSize", 25);
        setIntField(term4107, term4107.getClass(), "textSpeed", 1962444399);
        setIntField(term4107, term4107.getClass(), "transitionType", 1);
        setIntField(term4107, term4107.getClass(), "popupStyle", 767834723);
        setField(term4069, term4069.getClass(), "danMuFormatData", term4107);
        setField(term4069, term4069.getClass(), "timestamp", term4113);
        setField(term4069, term4069.getClass(), "msgType", "qYzsiuXOgS");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.DanMuData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "bxrCBbrrct";
        callMethod(klass, "setMsgType", argTypes, term4069, args);
    }

};


