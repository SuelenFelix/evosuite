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

public class DanMuData_setUserIfo_5292161277 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3210;
     Object term3268;

    public DanMuData_setUserIfo_5292161277() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3254 = new Long(-7237588299778557629L);
        term3210 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.DanMuData"));
        Object term3211 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.DanMuUserInfo"));
        Object term3248 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.DanMuFormat"));
        setField(term3211, term3211.getClass(), "uid", "izPpKDErnQ");
        setField(term3211, term3211.getClass(), "nickName", "NnpwZBUTvx");
        setField(term3210, term3210.getClass(), "userIfo", term3211);
        setField(term3210, term3210.getClass(), "content", "tlQSNgTkQX");
        setIntField(term3248, term3248.getClass(), "fontColor", 1134449235);
        setIntField(term3248, term3248.getClass(), "fontSize", 25);
        setIntField(term3248, term3248.getClass(), "textSpeed", -883034806);
        setIntField(term3248, term3248.getClass(), "transitionType", 1);
        setIntField(term3248, term3248.getClass(), "popupStyle", 1585847225);
        setField(term3210, term3210.getClass(), "danMuFormatData", term3248);
        setField(term3210, term3210.getClass(), "timestamp", term3254);
        setField(term3210, term3210.getClass(), "msgType", "PCipZnmBOF");
        term3268 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.DanMuUserInfo"));
        setField(term3268, term3268.getClass(), "uid", "zcorEihhLK");
        setField(term3268, term3268.getClass(), "nickName", "GrqozDKFOk");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.DanMuData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.DanMuUserInfo");
        Object[] args = new Object[1];
        args[0] = term3268;
        callMethod(klass, "setUserIfo", argTypes, term3210, args);
    }

};


