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
import java.util.LinkedList;
import java.lang.Object;
import java.lang.Long;

public class JsonDanMuExportServiceImpl_batchExport_11130195974 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13046;

    public JsonDanMuExportServiceImpl_batchExport_11130195974() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term13071 = new Long(-484994522244390100L);
        Object term13049 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.DanMuData"));
        Object term13050 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.DanMuUserInfo"));
        Object term13065 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.DanMuFormat"));
        setField(term13050, term13050.getClass(), "uid", "");
        setField(term13050, term13050.getClass(), "nickName", "");
        setField(term13049, term13049.getClass(), "userIfo", term13050);
        setField(term13049, term13049.getClass(), "content", "iuCxnHGMoW");
        setIntField(term13065, term13065.getClass(), "fontColor", -945116798);
        setIntField(term13065, term13065.getClass(), "fontSize", 25);
        setIntField(term13065, term13065.getClass(), "textSpeed", 1593461795);
        setIntField(term13065, term13065.getClass(), "transitionType", 1);
        setIntField(term13065, term13065.getClass(), "popupStyle", 515182546);
        setField(term13049, term13049.getClass(), "danMuFormatData", term13065);
        setField(term13049, term13049.getClass(), "timestamp", term13071);
        setField(term13049, term13049.getClass(), "msgType", "GPSEWEDSTo");
        Long term13095 = new Long(1233889271256172047L);
        Object term13086 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.DanMuData"));
        Object term13087 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.DanMuUserInfo"));
        Object term13089 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.DanMuFormat"));
        setField(term13087, term13087.getClass(), "uid", null);
        setField(term13087, term13087.getClass(), "nickName", null);
        setField(term13086, term13086.getClass(), "userIfo", term13087);
        setField(term13086, term13086.getClass(), "content", "");
        setIntField(term13089, term13089.getClass(), "fontColor", -936895502);
        setIntField(term13089, term13089.getClass(), "fontSize", 25);
        setIntField(term13089, term13089.getClass(), "textSpeed", -129547140);
        setIntField(term13089, term13089.getClass(), "transitionType", 1);
        setIntField(term13089, term13089.getClass(), "popupStyle", 199287428);
        setField(term13086, term13086.getClass(), "danMuFormatData", term13089);
        setField(term13086, term13086.getClass(), "timestamp", term13095);
        setField(term13086, term13086.getClass(), "msgType", "");
        Long term13100 = new Long(6617340557564669657L);
        Object term13099 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.DanMuData"));
        setField(term13099, term13099.getClass(), "userIfo", null);
        setField(term13099, term13099.getClass(), "content", null);
        setField(term13099, term13099.getClass(), "danMuFormatData", null);
        setField(term13099, term13099.getClass(), "timestamp", term13100);
        setField(term13099, term13099.getClass(), "msgType", null);
        term13046 = new LinkedList();
        ((LinkedList) term13046).add(term13049);
        ((LinkedList) term13046).add(term13086);
        ((LinkedList) term13046).add(term13099);
        ((LinkedList) term13046).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.service.Impl.persistence.JsonDanMuExportServiceImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term13046;
        callMethod(klass, "batchExport", argTypes, null, args);
    }

};


