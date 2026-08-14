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

public class BiliProcessedVideoData_getAvId_20175884217 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1440;

    public BiliProcessedVideoData_getAvId_20175884217() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term1481 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.danmusender.BiliProcessedPartVideoData"));
        setField(term1481, term1481.getClass(), "bvId", "");
        setLongField(term1481, term1481.getClass(), "cid", 5671808784468963649L);
        setLongField(term1481, term1481.getClass(), "duration", 2297097306706899827L);
        setField(term1481, term1481.getClass(), "partName", "");
        setLongField(term1481, term1481.getClass(), "videoStartMillTime", -900457279156388404L);
        setLongField(term1481, term1481.getClass(), "videoEndMillTime", 1084801489398441516L);
        Object term1488 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.danmusender.BiliProcessedPartVideoData"));
        setField(term1488, term1488.getClass(), "bvId", "");
        setLongField(term1488, term1488.getClass(), "cid", 6273754186658578034L);
        setLongField(term1488, term1488.getClass(), "duration", 3620247240684476031L);
        setField(term1488, term1488.getClass(), "partName", "");
        setLongField(term1488, term1488.getClass(), "videoStartMillTime", 8313800941204938919L);
        setLongField(term1488, term1488.getClass(), "videoEndMillTime", -1214968196781083707L);
        Object term1495 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.danmusender.BiliProcessedPartVideoData"));
        setField(term1495, term1495.getClass(), "bvId", "");
        setLongField(term1495, term1495.getClass(), "cid", -1804015692891701666L);
        setLongField(term1495, term1495.getClass(), "duration", -6432617521836576658L);
        setField(term1495, term1495.getClass(), "partName", "");
        setLongField(term1495, term1495.getClass(), "videoStartMillTime", -2255965562447970862L);
        setLongField(term1495, term1495.getClass(), "videoEndMillTime", 148047808219672941L);
        Object term1502 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.danmusender.BiliProcessedPartVideoData"));
        setField(term1502, term1502.getClass(), "bvId", "");
        setLongField(term1502, term1502.getClass(), "cid", 7489064039921396098L);
        setLongField(term1502, term1502.getClass(), "duration", 6843866297465638866L);
        setField(term1502, term1502.getClass(), "partName", "");
        setLongField(term1502, term1502.getClass(), "videoStartMillTime", -4023935540989049732L);
        setLongField(term1502, term1502.getClass(), "videoEndMillTime", 855932984568615096L);
        Object term1509 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.danmusender.BiliProcessedPartVideoData"));
        setField(term1509, term1509.getClass(), "bvId", "");
        setLongField(term1509, term1509.getClass(), "cid", -1616722610139554082L);
        setLongField(term1509, term1509.getClass(), "duration", 7495904023107549024L);
        setField(term1509, term1509.getClass(), "partName", "");
        setLongField(term1509, term1509.getClass(), "videoStartMillTime", 8802866251294305945L);
        setLongField(term1509, term1509.getClass(), "videoEndMillTime", 4513004407927379358L);
        Object term1516 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.danmusender.BiliProcessedPartVideoData"));
        setField(term1516, term1516.getClass(), "bvId", "");
        setLongField(term1516, term1516.getClass(), "cid", -7115418542247301000L);
        setLongField(term1516, term1516.getClass(), "duration", 8034714140377562739L);
        setField(term1516, term1516.getClass(), "partName", "");
        setLongField(term1516, term1516.getClass(), "videoStartMillTime", -2924531382671518368L);
        setLongField(term1516, term1516.getClass(), "videoEndMillTime", -3948863953565024517L);
        Object term1523 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.danmusender.BiliProcessedPartVideoData"));
        setField(term1523, term1523.getClass(), "bvId", "");
        setLongField(term1523, term1523.getClass(), "cid", -6587807377747738663L);
        setLongField(term1523, term1523.getClass(), "duration", -6301101997917060727L);
        setField(term1523, term1523.getClass(), "partName", "");
        setLongField(term1523, term1523.getClass(), "videoStartMillTime", 8166095254618543564L);
        setLongField(term1523, term1523.getClass(), "videoEndMillTime", -4598158870068953328L);
        ArrayList term1479 = new ArrayList();
        ((ArrayList) term1479).add(term1481);
        ((ArrayList) term1479).add(term1488);
        ((ArrayList) term1479).add(term1495);
        ((ArrayList) term1479).add(term1502);
        ((ArrayList) term1479).add(term1509);
        ((ArrayList) term1479).add(term1516);
        ((ArrayList) term1479).add(term1523);
        Object term1534 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicInteger"));
        setIntField(term1534, term1534.getClass(), "value", -117576464);
        ArrayList term1532 = new ArrayList();
        ((ArrayList) term1532).add(term1534);
        term1440 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.danmusender.BiliProcessedVideoData"));
        setLongField(term1440, term1440.getClass(), "avId", -5386201758403679145L);
        setField(term1440, term1440.getClass(), "bvId", "bLPjGVBhlX");
        setField(term1440, term1440.getClass(), "videoName", "whBvTVIIlC");
        setField(term1440, term1440.getClass(), "creatorUid", "IgRJUzaCwW");
        setLongField(term1440, term1440.getClass(), "createTime", -7268507582722666254L);
        setField(term1440, term1440.getClass(), "partVideoDataList", term1479);
        setField(term1440, term1440.getClass(), "pageIndexList", term1532);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.danmusender.BiliProcessedVideoData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAvId", argTypes, term1440, args);
    }

};


