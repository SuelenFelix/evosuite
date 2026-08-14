package com.github.cuteluobo.livedanmuarchive.pojo.danmusender;

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
import static com.github.cuteluobo.livedanmuarchive.pojo.danmusender.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;

public class BiliProcessedVideoData_setBvId_194276312710 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1815;

    public BiliProcessedVideoData_setBvId_194276312710() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term1856 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.danmusender.BiliProcessedPartVideoData"));
        setField(term1856, term1856.getClass(), "bvId", "");
        setLongField(term1856, term1856.getClass(), "cid", 8540994973773607992L);
        setLongField(term1856, term1856.getClass(), "duration", -2338103433822116635L);
        setField(term1856, term1856.getClass(), "partName", "");
        setLongField(term1856, term1856.getClass(), "videoStartMillTime", -1885698929232124806L);
        setLongField(term1856, term1856.getClass(), "videoEndMillTime", 5731563613239387113L);
        Object term1863 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.danmusender.BiliProcessedPartVideoData"));
        setField(term1863, term1863.getClass(), "bvId", "");
        setLongField(term1863, term1863.getClass(), "cid", 3381333711768010594L);
        setLongField(term1863, term1863.getClass(), "duration", 3580984732036213717L);
        setField(term1863, term1863.getClass(), "partName", "");
        setLongField(term1863, term1863.getClass(), "videoStartMillTime", 5330761990446327930L);
        setLongField(term1863, term1863.getClass(), "videoEndMillTime", -3954795081650780841L);
        Object term1870 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.danmusender.BiliProcessedPartVideoData"));
        setField(term1870, term1870.getClass(), "bvId", "");
        setLongField(term1870, term1870.getClass(), "cid", 3288791194263207397L);
        setLongField(term1870, term1870.getClass(), "duration", 3288941170644426558L);
        setField(term1870, term1870.getClass(), "partName", "");
        setLongField(term1870, term1870.getClass(), "videoStartMillTime", -8338004844694486146L);
        setLongField(term1870, term1870.getClass(), "videoEndMillTime", 6426732259596412988L);
        ArrayList term1854 = new ArrayList();
        ((ArrayList) term1854).add(term1856);
        ((ArrayList) term1854).add(term1863);
        ((ArrayList) term1854).add(term1870);
        Object term1881 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicInteger"));
        setIntField(term1881, term1881.getClass(), "value", -1179120542);
        ArrayList term1879 = new ArrayList();
        ((ArrayList) term1879).add(term1881);
        term1815 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.danmusender.BiliProcessedVideoData"));
        setLongField(term1815, term1815.getClass(), "avId", 9205327385733285058L);
        setField(term1815, term1815.getClass(), "bvId", "yGtHPyvYiQ");
        setField(term1815, term1815.getClass(), "videoName", "MvRIxilFMJ");
        setField(term1815, term1815.getClass(), "creatorUid", "iNwOJRBEjp");
        setLongField(term1815, term1815.getClass(), "createTime", 4199886998224701110L);
        setField(term1815, term1815.getClass(), "partVideoDataList", term1854);
        setField(term1815, term1815.getClass(), "pageIndexList", term1879);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.danmusender.BiliProcessedVideoData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "XOiDvlDhdc";
        callMethod(klass, "setBvId", argTypes, term1815, args);
    }

};


