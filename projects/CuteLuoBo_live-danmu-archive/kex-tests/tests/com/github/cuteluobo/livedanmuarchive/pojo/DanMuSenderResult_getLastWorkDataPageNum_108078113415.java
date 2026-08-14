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

public class DanMuSenderResult_getLastWorkDataPageNum_108078113415 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28459;

    public DanMuSenderResult_getLastWorkDataPageNum_108078113415() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term28615 = new Long(1672578078364590450L);
        Object term28606 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.DanMuData"));
        Object term28607 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.DanMuUserInfo"));
        Object term28609 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.DanMuFormat"));
        setField(term28607, term28607.getClass(), "uid", null);
        setField(term28607, term28607.getClass(), "nickName", null);
        setField(term28606, term28606.getClass(), "userIfo", term28607);
        setField(term28606, term28606.getClass(), "content", "");
        setIntField(term28609, term28609.getClass(), "fontColor", -1162790806);
        setIntField(term28609, term28609.getClass(), "fontSize", 25);
        setIntField(term28609, term28609.getClass(), "textSpeed", -1264595049);
        setIntField(term28609, term28609.getClass(), "transitionType", 1);
        setIntField(term28609, term28609.getClass(), "popupStyle", -2058884635);
        setField(term28606, term28606.getClass(), "danMuFormatData", term28609);
        setField(term28606, term28606.getClass(), "timestamp", term28615);
        setField(term28606, term28606.getClass(), "msgType", "");
        Long term28627 = new Long(4949335493504695457L);
        Object term28618 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.DanMuData"));
        Object term28619 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.DanMuUserInfo"));
        Object term28621 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.DanMuFormat"));
        setField(term28619, term28619.getClass(), "uid", null);
        setField(term28619, term28619.getClass(), "nickName", null);
        setField(term28618, term28618.getClass(), "userIfo", term28619);
        setField(term28618, term28618.getClass(), "content", "");
        setIntField(term28621, term28621.getClass(), "fontColor", 1064185088);
        setIntField(term28621, term28621.getClass(), "fontSize", 25);
        setIntField(term28621, term28621.getClass(), "textSpeed", -1249782654);
        setIntField(term28621, term28621.getClass(), "transitionType", 1);
        setIntField(term28621, term28621.getClass(), "popupStyle", 399302934);
        setField(term28618, term28618.getClass(), "danMuFormatData", term28621);
        setField(term28618, term28618.getClass(), "timestamp", term28627);
        setField(term28618, term28618.getClass(), "msgType", "");
        ArrayList term28604 = new ArrayList();
        ((ArrayList) term28604).add(term28606);
        ((ArrayList) term28604).add(term28618);
        term28459 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.DanMuSenderResult"));
        Object term28460 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term28524 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term28570 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term28573 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term28576 = newInstance(Class.forName("java.util.concurrent.CopyOnWriteArrayList"));
        Object term28578 = newInstance(Class.forName("ch.qos.logback.classic.LoggerContext"));
        Object term28586 = newInstance(Class.forName("java.util.concurrent.CopyOnWriteArrayList"));
        Object term28587 = newInstance(Class.forName("java.lang.Object"));
        Object[] term28588 = (Object[]) newArray("java.lang.Object", 1);
        Object term28591 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        Object term28593 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        Object term28595 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        setField(term28460, term28460.getClass(), "name", "com.github.cuteluobo.livedanmuarchive.pojo.DanMuSenderResult");
        setField(term28460, term28460.getClass(), "level", null);
        setIntField(term28460, term28460.getClass(), "effectiveLevelInt", -2147483648);
        setField(term28524, term28524.getClass(), "name", "com.github.cuteluobo.livedanmuarchive.pojo");
        setField(term28524, term28524.getClass(), "level", null);
        setIntField(term28524, term28524.getClass(), "effectiveLevelInt", -2147483648);
        setField(term28570, term28570.getClass(), "name", "");
        setField(term28570, term28570.getClass(), "level", null);
        setIntField(term28570, term28570.getClass(), "effectiveLevelInt", -2147483648);
        setField(term28573, term28573.getClass(), "name", null);
        setField(term28573, term28573.getClass(), "level", null);
        setIntField(term28573, term28573.getClass(), "effectiveLevelInt", -2147483648);
        setField(term28573, term28573.getClass(), "parent", null);
        setField(term28573, term28573.getClass(), "childrenList", null);
        setField(term28573, term28573.getClass(), "aai", null);
        setBooleanField(term28573, term28573.getClass(), "additive", true);
        setField(term28573, term28573.getClass(), "loggerContext", null);
        setField(term28570, term28570.getClass(), "parent", term28573);
        setField(term28576, term28576.getClass(), "lock", null);
        setField(term28576, term28576.getClass(), "array", null);
        setField(term28570, term28570.getClass(), "childrenList", term28576);
        setField(term28570, term28570.getClass(), "aai", null);
        setBooleanField(term28570, term28570.getClass(), "additive", true);
        setField(term28578, term28578.getClass(), "root", null);
        setIntField(term28578, term28578.getClass(), "size", 34);
        setIntField(term28578, term28578.getClass(), "noAppenderWarning", 0);
        setField(term28578, term28578.getClass(), "loggerContextListenerList", null);
        setField(term28578, term28578.getClass(), "loggerCache", null);
        setField(term28578, term28578.getClass(), "loggerContextRemoteView", null);
        setField(term28578, term28578.getClass(), "turboFilterList", null);
        setBooleanField(term28578, term28578.getClass(), "packagingDataEnabled", false);
        setIntField(term28578, term28578.getClass(), "maxCallerDataDepth", 8);
        setIntField(term28578, term28578.getClass(), "resetCount", 0);
        setField(term28578, term28578.getClass(), "frameworkPackages", null);
        setLongField(term28578, term28578.getClass(), "birthTime", 1786460230244L);
        setField(term28578, term28578.getClass(), "name", null);
        setField(term28578, term28578.getClass(), "sm", null);
        setField(term28578, term28578.getClass(), "propertyMap", null);
        setField(term28578, term28578.getClass(), "objectMap", null);
        setField(term28578, term28578.getClass(), "configurationLock", null);
        setField(term28578, term28578.getClass(), "scheduledExecutorService", null);
        setField(term28578, term28578.getClass(), "scheduledFutures", null);
        setField(term28578, term28578.getClass(), "lifeCycleManager", null);
        setBooleanField(term28578, term28578.getClass(), "started", false);
        setField(term28570, term28570.getClass(), "loggerContext", term28578);
        setField(term28524, term28524.getClass(), "parent", term28570);
        setField(term28586, term28586.getClass(), "lock", term28587);
        setElement(term28588, 0, term28460);
        setField(term28586, term28586.getClass(), "array", term28588);
        setField(term28524, term28524.getClass(), "childrenList", term28586);
        setField(term28524, term28524.getClass(), "aai", null);
        setBooleanField(term28524, term28524.getClass(), "additive", true);
        setField(term28524, term28524.getClass(), "loggerContext", term28578);
        setField(term28460, term28460.getClass(), "parent", term28524);
        setField(term28460, term28460.getClass(), "childrenList", null);
        setField(term28460, term28460.getClass(), "aai", null);
        setBooleanField(term28460, term28460.getClass(), "additive", true);
        setField(term28460, term28460.getClass(), "loggerContext", term28578);
        setField(term28459, term28459.getClass(), "logger", term28460);
        setLongField(term28591, term28591.getClass(), "value", 0L);
        setField(term28459, term28459.getClass(), "total", term28591);
        setLongField(term28593, term28593.getClass(), "value", 0L);
        setField(term28459, term28459.getClass(), "successNum", term28593);
        setLongField(term28595, term28595.getClass(), "value", 0L);
        setField(term28459, term28459.getClass(), "failNum", term28595);
        setLongField(term28459, term28459.getClass(), "startTime", 1786460353437L);
        setIntField(term28459, term28459.getClass(), "lastWorkVideoPartIndex", 1407309162);
        setIntField(term28459, term28459.getClass(), "lastWorkDataPageNum", -534033672);
        setLongField(term28459, term28459.getClass(), "lastSuccessTime", 7429946509853918683L);
        setLongField(term28459, term28459.getClass(), "lastFailTimeSuccessNum", -7148236042086608592L);
        setLongField(term28459, term28459.getClass(), "lastFailTime", 1786460353437L);
        setLongField(term28459, term28459.getClass(), "lastFailNum", 7716258711075652753L);
        setField(term28459, term28459.getClass(), "residueDataList", term28604);
        setField(term28459, term28459.getClass(), "processedVideoData", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.DanMuSenderResult");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastWorkDataPageNum", argTypes, term28459, args);
    }

};


