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

public class DanMuData_getTimestamp_165842957412 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3773;

    public DanMuData_getTimestamp_165842957412() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3817 = new Long(2535595959091595249L);
        term3773 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.DanMuData"));
        Object term3774 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.DanMuUserInfo"));
        Object term3811 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.DanMuFormat"));
        setField(term3774, term3774.getClass(), "uid", "XfRABIFVEp");
        setField(term3774, term3774.getClass(), "nickName", "MHGKyEnwKc");
        setField(term3773, term3773.getClass(), "userIfo", term3774);
        setField(term3773, term3773.getClass(), "content", "ShIELyuULw");
        setIntField(term3811, term3811.getClass(), "fontColor", -203030934);
        setIntField(term3811, term3811.getClass(), "fontSize", 25);
        setIntField(term3811, term3811.getClass(), "textSpeed", -1179120542);
        setIntField(term3811, term3811.getClass(), "transitionType", 1);
        setIntField(term3811, term3811.getClass(), "popupStyle", -73683645);
        setField(term3773, term3773.getClass(), "danMuFormatData", term3811);
        setField(term3773, term3773.getClass(), "timestamp", term3817);
        setField(term3773, term3773.getClass(), "msgType", "IpQuOGMgmj");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.DanMuData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTimestamp", argTypes, term3773, args);
    }

};


