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

public class SqliteDanMuExportServiceImpl_export_10680792081 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11563;

    public SqliteDanMuExportServiceImpl_export_10680792081() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term11607 = new Long(1967728129628047933L);
        term11563 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.DanMuData"));
        Object term11564 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.DanMuUserInfo"));
        Object term11601 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.DanMuFormat"));
        setField(term11564, term11564.getClass(), "uid", "wdoqITnaAP");
        setField(term11564, term11564.getClass(), "nickName", "rIPMBcrNqB");
        setField(term11563, term11563.getClass(), "userIfo", term11564);
        setField(term11563, term11563.getClass(), "content", "UDaboHZHhz");
        setIntField(term11601, term11601.getClass(), "fontColor", 267763294);
        setIntField(term11601, term11601.getClass(), "fontSize", 25);
        setIntField(term11601, term11601.getClass(), "textSpeed", -1497710478);
        setIntField(term11601, term11601.getClass(), "transitionType", 1);
        setIntField(term11601, term11601.getClass(), "popupStyle", 49950830);
        setField(term11563, term11563.getClass(), "danMuFormatData", term11601);
        setField(term11563, term11563.getClass(), "timestamp", term11607);
        setField(term11563, term11563.getClass(), "msgType", "nRvKihUSPj");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.service.Impl.persistence.SqliteDanMuExportServiceImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.DanMuData");
        Object[] args = new Object[1];
        args[0] = term11563;
        callMethod(klass, "export", argTypes, null, args);
    }

};


