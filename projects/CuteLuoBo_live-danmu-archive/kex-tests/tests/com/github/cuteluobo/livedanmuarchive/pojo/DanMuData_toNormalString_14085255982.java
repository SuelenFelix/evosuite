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

public class DanMuData_toNormalString_14085255982 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2749;

    public DanMuData_toNormalString_14085255982() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2793 = new Long(2442117782898005296L);
        term2749 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.DanMuData"));
        Object term2750 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.DanMuUserInfo"));
        Object term2787 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.DanMuFormat"));
        setField(term2750, term2750.getClass(), "uid", "DhjNLmRMCu");
        setField(term2750, term2750.getClass(), "nickName", "PgPzMSEjjX");
        setField(term2749, term2749.getClass(), "userIfo", term2750);
        setField(term2749, term2749.getClass(), "content", "wzsPSPcRdj");
        setIntField(term2787, term2787.getClass(), "fontColor", 568599855);
        setIntField(term2787, term2787.getClass(), "fontSize", 25);
        setIntField(term2787, term2787.getClass(), "textSpeed", 1162663216);
        setIntField(term2787, term2787.getClass(), "transitionType", 1);
        setIntField(term2787, term2787.getClass(), "popupStyle", 1484323161);
        setField(term2749, term2749.getClass(), "danMuFormatData", term2787);
        setField(term2749, term2749.getClass(), "timestamp", term2793);
        setField(term2749, term2749.getClass(), "msgType", "kGMQdqJYyB");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.DanMuData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toNormalString", argTypes, term2749, args);
    }

};


