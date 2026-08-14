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

public class BiliProcessedVideoData_getBvId_2228865599 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1699;

    public BiliProcessedVideoData_getBvId_2228865599() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term1740 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.danmusender.BiliProcessedPartVideoData"));
        setField(term1740, term1740.getClass(), "bvId", "");
        setLongField(term1740, term1740.getClass(), "cid", 5465527210299101732L);
        setLongField(term1740, term1740.getClass(), "duration", 4699157009689333952L);
        setField(term1740, term1740.getClass(), "partName", "");
        setLongField(term1740, term1740.getClass(), "videoStartMillTime", -78240609295693193L);
        setLongField(term1740, term1740.getClass(), "videoEndMillTime", 3090901538358721367L);
        Object term1747 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.danmusender.BiliProcessedPartVideoData"));
        setField(term1747, term1747.getClass(), "bvId", "");
        setLongField(term1747, term1747.getClass(), "cid", -1677189124507026637L);
        setLongField(term1747, term1747.getClass(), "duration", 4795660804170399986L);
        setField(term1747, term1747.getClass(), "partName", "");
        setLongField(term1747, term1747.getClass(), "videoStartMillTime", -4030863184426321096L);
        setLongField(term1747, term1747.getClass(), "videoEndMillTime", -8010214112439224349L);
        Object term1754 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.danmusender.BiliProcessedPartVideoData"));
        setField(term1754, term1754.getClass(), "bvId", "");
        setLongField(term1754, term1754.getClass(), "cid", -6673920710396545553L);
        setLongField(term1754, term1754.getClass(), "duration", 3412644969878030772L);
        setField(term1754, term1754.getClass(), "partName", "");
        setLongField(term1754, term1754.getClass(), "videoStartMillTime", 6698455537431331246L);
        setLongField(term1754, term1754.getClass(), "videoEndMillTime", -8327432141027603933L);
        Object term1761 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.danmusender.BiliProcessedPartVideoData"));
        setField(term1761, term1761.getClass(), "bvId", "");
        setLongField(term1761, term1761.getClass(), "cid", -433040798405298080L);
        setLongField(term1761, term1761.getClass(), "duration", -1505191021111100819L);
        setField(term1761, term1761.getClass(), "partName", "");
        setLongField(term1761, term1761.getClass(), "videoStartMillTime", -1000830646340880796L);
        setLongField(term1761, term1761.getClass(), "videoEndMillTime", 5973526439563541711L);
        Object term1768 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.danmusender.BiliProcessedPartVideoData"));
        setField(term1768, term1768.getClass(), "bvId", "");
        setLongField(term1768, term1768.getClass(), "cid", 5246058710498845622L);
        setLongField(term1768, term1768.getClass(), "duration", 4394651392080968777L);
        setField(term1768, term1768.getClass(), "partName", "");
        setLongField(term1768, term1768.getClass(), "videoStartMillTime", -7310273014364148916L);
        setLongField(term1768, term1768.getClass(), "videoEndMillTime", 8863790908271299748L);
        ArrayList term1738 = new ArrayList();
        ((ArrayList) term1738).add(term1740);
        ((ArrayList) term1738).add(term1747);
        ((ArrayList) term1738).add(term1754);
        ((ArrayList) term1738).add(term1761);
        ((ArrayList) term1738).add(term1768);
        Object term1779 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicInteger"));
        setIntField(term1779, term1779.getClass(), "value", -244121226);
        Object term1781 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicInteger"));
        setIntField(term1781, term1781.getClass(), "value", -203030934);
        ArrayList term1777 = new ArrayList();
        ((ArrayList) term1777).add(term1779);
        ((ArrayList) term1777).add(term1781);
        term1699 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.danmusender.BiliProcessedVideoData"));
        setLongField(term1699, term1699.getClass(), "avId", -5724112525188606013L);
        setField(term1699, term1699.getClass(), "bvId", "sEccwbJKYE");
        setField(term1699, term1699.getClass(), "videoName", "AWRooQKkdW");
        setField(term1699, term1699.getClass(), "creatorUid", "vjxIhXHxGR");
        setLongField(term1699, term1699.getClass(), "createTime", -6100012593724108983L);
        setField(term1699, term1699.getClass(), "partVideoDataList", term1738);
        setField(term1699, term1699.getClass(), "pageIndexList", term1777);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.danmusender.BiliProcessedVideoData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBvId", argTypes, term1699, args);
    }

};


