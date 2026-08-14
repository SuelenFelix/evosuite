package com.github.cuteluobo.livedanmuarchive.async;

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
import static com.github.cuteluobo.livedanmuarchive.async.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;

public class AbstractDanMuSender_runSender_4429007532 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1767;

    public AbstractDanMuSender_runSender_4429007532() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term1808 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.danmusender.BiliProcessedPartVideoData"));
        setField(term1808, term1808.getClass(), "bvId", "");
        setLongField(term1808, term1808.getClass(), "cid", 4872422362414183754L);
        setLongField(term1808, term1808.getClass(), "duration", 6811161968424632369L);
        setField(term1808, term1808.getClass(), "partName", "");
        setLongField(term1808, term1808.getClass(), "videoStartMillTime", -7237588299778557629L);
        setLongField(term1808, term1808.getClass(), "videoEndMillTime", 6967924379644551255L);
        Object term1815 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.danmusender.BiliProcessedPartVideoData"));
        setField(term1815, term1815.getClass(), "bvId", "");
        setLongField(term1815, term1815.getClass(), "cid", -2813493605142626659L);
        setLongField(term1815, term1815.getClass(), "duration", -8885298608300233488L);
        setField(term1815, term1815.getClass(), "partName", "");
        setLongField(term1815, term1815.getClass(), "videoStartMillTime", -4325723315152823407L);
        setLongField(term1815, term1815.getClass(), "videoEndMillTime", 2535595959091595249L);
        Object term1822 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.danmusender.BiliProcessedPartVideoData"));
        setField(term1822, term1822.getClass(), "bvId", "");
        setLongField(term1822, term1822.getClass(), "cid", -5476826692763582090L);
        setLongField(term1822, term1822.getClass(), "duration", -872011222785455006L);
        setField(term1822, term1822.getClass(), "partName", "");
        setLongField(term1822, term1822.getClass(), "videoStartMillTime", -316468845751588286L);
        setLongField(term1822, term1822.getClass(), "videoEndMillTime", 5127676408959197577L);
        Object term1829 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.danmusender.BiliProcessedPartVideoData"));
        setField(term1829, term1829.getClass(), "bvId", "");
        setLongField(term1829, term1829.getClass(), "cid", -6573104506744284592L);
        setLongField(term1829, term1829.getClass(), "duration", -4920224193275732920L);
        setField(term1829, term1829.getClass(), "partName", "");
        setLongField(term1829, term1829.getClass(), "videoStartMillTime", 8428634514691209827L);
        setLongField(term1829, term1829.getClass(), "videoEndMillTime", -2585684163342970173L);
        Object term1836 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.danmusender.BiliProcessedPartVideoData"));
        setField(term1836, term1836.getClass(), "bvId", "");
        setLongField(term1836, term1836.getClass(), "cid", 8059786003080744426L);
        setLongField(term1836, term1836.getClass(), "duration", -4365849114644724155L);
        setField(term1836, term1836.getClass(), "partName", "");
        setLongField(term1836, term1836.getClass(), "videoStartMillTime", 2486810210675247493L);
        setLongField(term1836, term1836.getClass(), "videoEndMillTime", 7009926388951271268L);
        ArrayList term1806 = new ArrayList();
        ((ArrayList) term1806).add(term1808);
        ((ArrayList) term1806).add(term1815);
        ((ArrayList) term1806).add(term1822);
        ((ArrayList) term1806).add(term1829);
        ((ArrayList) term1806).add(term1836);
        Object term1847 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicInteger"));
        setIntField(term1847, term1847.getClass(), "value", 568599855);
        Object term1849 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicInteger"));
        setIntField(term1849, term1849.getClass(), "value", 1162663216);
        Object term1851 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicInteger"));
        setIntField(term1851, term1851.getClass(), "value", 1484323161);
        Object term1853 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicInteger"));
        setIntField(term1853, term1853.getClass(), "value", 391863371);
        ArrayList term1845 = new ArrayList();
        ((ArrayList) term1845).add(term1847);
        ((ArrayList) term1845).add(term1849);
        ((ArrayList) term1845).add(term1851);
        ((ArrayList) term1845).add(term1853);
        term1767 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.danmusender.BiliProcessedVideoData"));
        setLongField(term1767, term1767.getClass(), "avId", 5270370404989704783L);
        setField(term1767, term1767.getClass(), "bvId", "HqBOwkVqjD");
        setField(term1767, term1767.getClass(), "videoName", "MAcUBcBckh");
        setField(term1767, term1767.getClass(), "creatorUid", "oVgzLbrsFr");
        setLongField(term1767, term1767.getClass(), "createTime", 7411271909051562686L);
        setField(term1767, term1767.getClass(), "partVideoDataList", term1806);
        setField(term1767, term1767.getClass(), "pageIndexList", term1845);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.async.AbstractDanMuSender");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.danmusender.BiliProcessedVideoData");
        Object[] args = new Object[1];
        args[0] = term1767;
        callMethod(klass, "runSender", argTypes, null, args);
    }

};


