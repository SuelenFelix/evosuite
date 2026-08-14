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

public class HuYaUserInfo_setiNobleLevel_173152397811 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30935;
     Object term30966;

    public HuYaUserInfo_setiNobleLevel_173152397811() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30935 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.HuYaUserInfo"));
        setIntField(term30935, term30935.getClass(), "lUid", -1147965121);
        setIntField(term30935, term30935.getClass(), "lImid", -867099093);
        setIntField(term30935, term30935.getClass(), "iGender", -1091199008);
        setField(term30935, term30935.getClass(), "sAvatarUrl", "");
        setIntField(term30935, term30935.getClass(), "iNobleLevel", 1837886253);
        setField(term30935, term30935.getClass(), "uid", "rJgXQRsPCl");
        setField(term30935, term30935.getClass(), "nickName", "RgqpoBknjN");
        term30966 = new Integer(-269528550);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.HuYaUserInfo");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term30966;
        callMethod(klass, "setiNobleLevel", argTypes, term30935, args);
    }

};


