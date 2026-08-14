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
import java.util.ArrayList;
import java.lang.Long;

public class DanMuSenderResult_getStartTime_10127635717 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28987;

    public DanMuSenderResult_getStartTime_10127635717() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term29143 = new Long(-5216789073301458893L);
        Object term29134 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.DanMuData"));
        Object term29135 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.DanMuUserInfo"));
        Object term29137 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.DanMuFormat"));
        setField(term29135, term29135.getClass(), "uid", null);
        setField(term29135, term29135.getClass(), "nickName", null);
        setField(term29134, term29134.getClass(), "userIfo", term29135);
        setField(term29134, term29134.getClass(), "content", "");
        setIntField(term29137, term29137.getClass(), "fontColor", -1731921726);
        setIntField(term29137, term29137.getClass(), "fontSize", 25);
        setIntField(term29137, term29137.getClass(), "textSpeed", 919994471);
        setIntField(term29137, term29137.getClass(), "transitionType", 1);
        setIntField(term29137, term29137.getClass(), "popupStyle", 183531701);
        setField(term29134, term29134.getClass(), "danMuFormatData", term29137);
        setField(term29134, term29134.getClass(), "timestamp", term29143);
        setField(term29134, term29134.getClass(), "msgType", "");
        Long term29155 = new Long(-1832940336320585644L);
        Object term29146 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.DanMuData"));
        Object term29147 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.DanMuUserInfo"));
        Object term29149 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.DanMuFormat"));
        setField(term29147, term29147.getClass(), "uid", null);
        setField(term29147, term29147.getClass(), "nickName", null);
        setField(term29146, term29146.getClass(), "userIfo", term29147);
        setField(term29146, term29146.getClass(), "content", "");
        setIntField(term29149, term29149.getClass(), "fontColor", -974923743);
        setIntField(term29149, term29149.getClass(), "fontSize", 25);
        setIntField(term29149, term29149.getClass(), "textSpeed", 1876738932);
        setIntField(term29149, term29149.getClass(), "transitionType", 1);
        setIntField(term29149, term29149.getClass(), "popupStyle", -1870339027);
        setField(term29146, term29146.getClass(), "danMuFormatData", term29149);
        setField(term29146, term29146.getClass(), "timestamp", term29155);
        setField(term29146, term29146.getClass(), "msgType", "");
        Long term29167 = new Long(-8033714905181142681L);
        Object term29158 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.DanMuData"));
        Object term29159 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.DanMuUserInfo"));
        Object term29161 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.DanMuFormat"));
        setField(term29159, term29159.getClass(), "uid", null);
        setField(term29159, term29159.getClass(), "nickName", null);
        setField(term29158, term29158.getClass(), "userIfo", term29159);
        setField(term29158, term29158.getClass(), "content", "");
        setIntField(term29161, term29161.getClass(), "fontColor", -1549603566);
        setIntField(term29161, term29161.getClass(), "fontSize", 25);
        setIntField(term29161, term29161.getClass(), "textSpeed", 1077223540);
        setIntField(term29161, term29161.getClass(), "transitionType", 1);
        setIntField(term29161, term29161.getClass(), "popupStyle", -1823813592);
        setField(term29158, term29158.getClass(), "danMuFormatData", term29161);
        setField(term29158, term29158.getClass(), "timestamp", term29167);
        setField(term29158, term29158.getClass(), "msgType", "");
        ArrayList term29132 = new ArrayList();
        ((ArrayList) term29132).add(term29134);
        ((ArrayList) term29132).add(term29146);
        ((ArrayList) term29132).add(term29158);
        term28987 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.DanMuSenderResult"));
        Object term28988 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term29052 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term29098 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term29101 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term29104 = newInstance(Class.forName("java.util.concurrent.CopyOnWriteArrayList"));
        Object term29106 = newInstance(Class.forName("ch.qos.logback.classic.LoggerContext"));
        Object term29114 = newInstance(Class.forName("java.util.concurrent.CopyOnWriteArrayList"));
        Object term29115 = newInstance(Class.forName("java.lang.Object"));
        Object[] term29116 = (Object[]) newArray("java.lang.Object", 1);
        Object term29119 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        Object term29121 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        Object term29123 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        setField(term28988, term28988.getClass(), "name", "com.github.cuteluobo.livedanmuarchive.pojo.DanMuSenderResult");
        setField(term28988, term28988.getClass(), "level", null);
        setIntField(term28988, term28988.getClass(), "effectiveLevelInt", -2147483648);
        setField(term29052, term29052.getClass(), "name", "com.github.cuteluobo.livedanmuarchive.pojo");
        setField(term29052, term29052.getClass(), "level", null);
        setIntField(term29052, term29052.getClass(), "effectiveLevelInt", -2147483648);
        setField(term29098, term29098.getClass(), "name", "");
        setField(term29098, term29098.getClass(), "level", null);
        setIntField(term29098, term29098.getClass(), "effectiveLevelInt", -2147483648);
        setField(term29101, term29101.getClass(), "name", null);
        setField(term29101, term29101.getClass(), "level", null);
        setIntField(term29101, term29101.getClass(), "effectiveLevelInt", -2147483648);
        setField(term29101, term29101.getClass(), "parent", null);
        setField(term29101, term29101.getClass(), "childrenList", null);
        setField(term29101, term29101.getClass(), "aai", null);
        setBooleanField(term29101, term29101.getClass(), "additive", true);
        setField(term29101, term29101.getClass(), "loggerContext", null);
        setField(term29098, term29098.getClass(), "parent", term29101);
        setField(term29104, term29104.getClass(), "lock", null);
        setField(term29104, term29104.getClass(), "array", null);
        setField(term29098, term29098.getClass(), "childrenList", term29104);
        setField(term29098, term29098.getClass(), "aai", null);
        setBooleanField(term29098, term29098.getClass(), "additive", true);
        setField(term29106, term29106.getClass(), "root", null);
        setIntField(term29106, term29106.getClass(), "size", 34);
        setIntField(term29106, term29106.getClass(), "noAppenderWarning", 0);
        setField(term29106, term29106.getClass(), "loggerContextListenerList", null);
        setField(term29106, term29106.getClass(), "loggerCache", null);
        setField(term29106, term29106.getClass(), "loggerContextRemoteView", null);
        setField(term29106, term29106.getClass(), "turboFilterList", null);
        setBooleanField(term29106, term29106.getClass(), "packagingDataEnabled", false);
        setIntField(term29106, term29106.getClass(), "maxCallerDataDepth", 8);
        setIntField(term29106, term29106.getClass(), "resetCount", 0);
        setField(term29106, term29106.getClass(), "frameworkPackages", null);
        setLongField(term29106, term29106.getClass(), "birthTime", 1786460230244L);
        setField(term29106, term29106.getClass(), "name", null);
        setField(term29106, term29106.getClass(), "sm", null);
        setField(term29106, term29106.getClass(), "propertyMap", null);
        setField(term29106, term29106.getClass(), "objectMap", null);
        setField(term29106, term29106.getClass(), "configurationLock", null);
        setField(term29106, term29106.getClass(), "scheduledExecutorService", null);
        setField(term29106, term29106.getClass(), "scheduledFutures", null);
        setField(term29106, term29106.getClass(), "lifeCycleManager", null);
        setBooleanField(term29106, term29106.getClass(), "started", false);
        setField(term29098, term29098.getClass(), "loggerContext", term29106);
        setField(term29052, term29052.getClass(), "parent", term29098);
        setField(term29114, term29114.getClass(), "lock", term29115);
        setElement(term29116, 0, term28988);
        setField(term29114, term29114.getClass(), "array", term29116);
        setField(term29052, term29052.getClass(), "childrenList", term29114);
        setField(term29052, term29052.getClass(), "aai", null);
        setBooleanField(term29052, term29052.getClass(), "additive", true);
        setField(term29052, term29052.getClass(), "loggerContext", term29106);
        setField(term28988, term28988.getClass(), "parent", term29052);
        setField(term28988, term28988.getClass(), "childrenList", null);
        setField(term28988, term28988.getClass(), "aai", null);
        setBooleanField(term28988, term28988.getClass(), "additive", true);
        setField(term28988, term28988.getClass(), "loggerContext", term29106);
        setField(term28987, term28987.getClass(), "logger", term28988);
        setLongField(term29119, term29119.getClass(), "value", 0L);
        setField(term28987, term28987.getClass(), "total", term29119);
        setLongField(term29121, term29121.getClass(), "value", 0L);
        setField(term28987, term28987.getClass(), "successNum", term29121);
        setLongField(term29123, term29123.getClass(), "value", 0L);
        setField(term28987, term28987.getClass(), "failNum", term29123);
        setLongField(term28987, term28987.getClass(), "startTime", 1786460353541L);
        setIntField(term28987, term28987.getClass(), "lastWorkVideoPartIndex", 1524590776);
        setIntField(term28987, term28987.getClass(), "lastWorkDataPageNum", 1523896653);
        setLongField(term28987, term28987.getClass(), "lastSuccessTime", 5817794709356277010L);
        setLongField(term28987, term28987.getClass(), "lastFailTimeSuccessNum", -205762347192500511L);
        setLongField(term28987, term28987.getClass(), "lastFailTime", 1786460353541L);
        setLongField(term28987, term28987.getClass(), "lastFailNum", -4987344934532917085L);
        setField(term28987, term28987.getClass(), "residueDataList", term29132);
        setField(term28987, term28987.getClass(), "processedVideoData", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.DanMuSenderResult");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStartTime", argTypes, term28987, args);
    }

};


