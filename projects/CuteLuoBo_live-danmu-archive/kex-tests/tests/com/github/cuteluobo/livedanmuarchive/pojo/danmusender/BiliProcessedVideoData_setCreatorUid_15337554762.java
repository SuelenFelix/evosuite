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

public class BiliProcessedVideoData_setCreatorUid_15337554762 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1043;

    public BiliProcessedVideoData_setCreatorUid_15337554762() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term1084 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.danmusender.BiliProcessedPartVideoData"));
        setField(term1084, term1084.getClass(), "bvId", "");
        setLongField(term1084, term1084.getClass(), "cid", -8876856890348836498L);
        setLongField(term1084, term1084.getClass(), "duration", 846579494941632714L);
        setField(term1084, term1084.getClass(), "partName", "");
        setLongField(term1084, term1084.getClass(), "videoStartMillTime", 6689117472719450333L);
        setLongField(term1084, term1084.getClass(), "videoEndMillTime", 5836128569274066678L);
        Object term1091 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.danmusender.BiliProcessedPartVideoData"));
        setField(term1091, term1091.getClass(), "bvId", "");
        setLongField(term1091, term1091.getClass(), "cid", -2177368829816872572L);
        setLongField(term1091, term1091.getClass(), "duration", -8463029266761149071L);
        setField(term1091, term1091.getClass(), "partName", "");
        setLongField(term1091, term1091.getClass(), "videoStartMillTime", 3133860696238261492L);
        setLongField(term1091, term1091.getClass(), "videoEndMillTime", 7247160664318067468L);
        Object term1098 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.danmusender.BiliProcessedPartVideoData"));
        setField(term1098, term1098.getClass(), "bvId", "");
        setLongField(term1098, term1098.getClass(), "cid", 2135754395358000892L);
        setLongField(term1098, term1098.getClass(), "duration", -8085190702504231560L);
        setField(term1098, term1098.getClass(), "partName", "");
        setLongField(term1098, term1098.getClass(), "videoStartMillTime", 1672578078364590450L);
        setLongField(term1098, term1098.getClass(), "videoEndMillTime", 4949335493504695457L);
        ArrayList term1082 = new ArrayList();
        ((ArrayList) term1082).add(term1084);
        ((ArrayList) term1082).add(term1091);
        ((ArrayList) term1082).add(term1098);
        Object term1109 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicInteger"));
        setIntField(term1109, term1109.getClass(), "value", -2038273078);
        Object term1111 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicInteger"));
        setIntField(term1111, term1111.getClass(), "value", 1227103734);
        Object term1113 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicInteger"));
        setIntField(term1113, term1113.getClass(), "value", -1339778481);
        Object term1115 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicInteger"));
        setIntField(term1115, term1115.getClass(), "value", 1725571209);
        ArrayList term1107 = new ArrayList();
        ((ArrayList) term1107).add(term1109);
        ((ArrayList) term1107).add(term1111);
        ((ArrayList) term1107).add(term1113);
        ((ArrayList) term1107).add(term1115);
        term1043 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.danmusender.BiliProcessedVideoData"));
        setLongField(term1043, term1043.getClass(), "avId", 4474998035090263139L);
        setField(term1043, term1043.getClass(), "bvId", "BndsHwAFMv");
        setField(term1043, term1043.getClass(), "videoName", "GzFkzHGYFt");
        setField(term1043, term1043.getClass(), "creatorUid", "tShwQLRGNe");
        setLongField(term1043, term1043.getClass(), "createTime", 2848819812340321742L);
        setField(term1043, term1043.getClass(), "partVideoDataList", term1082);
        setField(term1043, term1043.getClass(), "pageIndexList", term1107);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.danmusender.BiliProcessedVideoData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "JDswTTCZHV";
        callMethod(klass, "setCreatorUid", argTypes, term1043, args);
    }

};


