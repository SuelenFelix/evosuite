package com.github.cuteluobo.livedanmuarchive.service.Impl.persistence;

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
import static com.github.cuteluobo.livedanmuarchive.service.Impl.persistence.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;

public class JsonDanMuExportServiceImpl_export_7303109723 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12948;

    public JsonDanMuExportServiceImpl_export_7303109723() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term12992 = new Long(-6823727938421990489L);
        term12948 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.DanMuData"));
        Object term12949 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.DanMuUserInfo"));
        Object term12986 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.DanMuFormat"));
        setField(term12949, term12949.getClass(), "uid", "hePqROaplw");
        setField(term12949, term12949.getClass(), "nickName", "PJcSNDruWd");
        setField(term12948, term12948.getClass(), "userIfo", term12949);
        setField(term12948, term12948.getClass(), "content", "VVNNlAePXF");
        setIntField(term12986, term12986.getClass(), "fontColor", 34470066);
        setIntField(term12986, term12986.getClass(), "fontSize", 25);
        setIntField(term12986, term12986.getClass(), "textSpeed", 2058711405);
        setIntField(term12986, term12986.getClass(), "transitionType", 1);
        setIntField(term12986, term12986.getClass(), "popupStyle", 1743683601);
        setField(term12948, term12948.getClass(), "danMuFormatData", term12986);
        setField(term12948, term12948.getClass(), "timestamp", term12992);
        setField(term12948, term12948.getClass(), "msgType", "jnwVnmKAFv");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.service.Impl.persistence.JsonDanMuExportServiceImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.DanMuData");
        Object[] args = new Object[1];
        args[0] = term12948;
        callMethod(klass, "export", argTypes, null, args);
    }

};


