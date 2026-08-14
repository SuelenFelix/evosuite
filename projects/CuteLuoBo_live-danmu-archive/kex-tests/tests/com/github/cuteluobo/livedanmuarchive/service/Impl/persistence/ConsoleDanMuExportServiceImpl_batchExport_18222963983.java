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
import java.util.LinkedList;
import java.lang.Long;

public class ConsoleDanMuExportServiceImpl_batchExport_18222963983 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10586;
     Object term10770;

    public ConsoleDanMuExportServiceImpl_batchExport_18222963983() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10586 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.service.Impl.persistence.ConsoleDanMuExportServiceImpl"));
        Object term10587 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term10683 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term10749 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term10752 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term10755 = newInstance(Class.forName("java.util.concurrent.CopyOnWriteArrayList"));
        Object term10757 = newInstance(Class.forName("ch.qos.logback.classic.LoggerContext"));
        Object term10765 = newInstance(Class.forName("java.util.concurrent.CopyOnWriteArrayList"));
        Object term10766 = newInstance(Class.forName("java.lang.Object"));
        Object[] term10767 = (Object[]) newArray("java.lang.Object", 1);
        setField(term10587, term10587.getClass(), "name", "com.github.cuteluobo.livedanmuarchive.service.Impl.persistence.ConsoleDanMuExportServiceImpl");
        setField(term10587, term10587.getClass(), "level", null);
        setIntField(term10587, term10587.getClass(), "effectiveLevelInt", -2147483648);
        setField(term10683, term10683.getClass(), "name", "com.github.cuteluobo.livedanmuarchive.service.Impl.persistence");
        setField(term10683, term10683.getClass(), "level", null);
        setIntField(term10683, term10683.getClass(), "effectiveLevelInt", -2147483648);
        setField(term10749, term10749.getClass(), "name", "");
        setField(term10749, term10749.getClass(), "level", null);
        setIntField(term10749, term10749.getClass(), "effectiveLevelInt", -2147483648);
        setField(term10752, term10752.getClass(), "name", null);
        setField(term10752, term10752.getClass(), "level", null);
        setIntField(term10752, term10752.getClass(), "effectiveLevelInt", -2147483648);
        setField(term10752, term10752.getClass(), "parent", null);
        setField(term10752, term10752.getClass(), "childrenList", null);
        setField(term10752, term10752.getClass(), "aai", null);
        setBooleanField(term10752, term10752.getClass(), "additive", true);
        setField(term10752, term10752.getClass(), "loggerContext", null);
        setField(term10749, term10749.getClass(), "parent", term10752);
        setField(term10755, term10755.getClass(), "lock", null);
        setField(term10755, term10755.getClass(), "array", null);
        setField(term10749, term10749.getClass(), "childrenList", term10755);
        setField(term10749, term10749.getClass(), "aai", null);
        setBooleanField(term10749, term10749.getClass(), "additive", true);
        setField(term10757, term10757.getClass(), "root", null);
        setIntField(term10757, term10757.getClass(), "size", 36);
        setIntField(term10757, term10757.getClass(), "noAppenderWarning", 0);
        setField(term10757, term10757.getClass(), "loggerContextListenerList", null);
        setField(term10757, term10757.getClass(), "loggerCache", null);
        setField(term10757, term10757.getClass(), "loggerContextRemoteView", null);
        setField(term10757, term10757.getClass(), "turboFilterList", null);
        setBooleanField(term10757, term10757.getClass(), "packagingDataEnabled", false);
        setIntField(term10757, term10757.getClass(), "maxCallerDataDepth", 8);
        setIntField(term10757, term10757.getClass(), "resetCount", 0);
        setField(term10757, term10757.getClass(), "frameworkPackages", null);
        setLongField(term10757, term10757.getClass(), "birthTime", 1786460918193L);
        setField(term10757, term10757.getClass(), "name", null);
        setField(term10757, term10757.getClass(), "sm", null);
        setField(term10757, term10757.getClass(), "propertyMap", null);
        setField(term10757, term10757.getClass(), "objectMap", null);
        setField(term10757, term10757.getClass(), "configurationLock", null);
        setField(term10757, term10757.getClass(), "scheduledExecutorService", null);
        setField(term10757, term10757.getClass(), "scheduledFutures", null);
        setField(term10757, term10757.getClass(), "lifeCycleManager", null);
        setBooleanField(term10757, term10757.getClass(), "started", false);
        setField(term10749, term10749.getClass(), "loggerContext", term10757);
        setField(term10683, term10683.getClass(), "parent", term10749);
        setField(term10765, term10765.getClass(), "lock", term10766);
        setElement(term10767, 0, term10587);
        setField(term10765, term10765.getClass(), "array", term10767);
        setField(term10683, term10683.getClass(), "childrenList", term10765);
        setField(term10683, term10683.getClass(), "aai", null);
        setBooleanField(term10683, term10683.getClass(), "additive", true);
        setField(term10683, term10683.getClass(), "loggerContext", term10757);
        setField(term10587, term10587.getClass(), "parent", term10683);
        setField(term10587, term10587.getClass(), "childrenList", null);
        setField(term10587, term10587.getClass(), "aai", null);
        setBooleanField(term10587, term10587.getClass(), "additive", true);
        setField(term10587, term10587.getClass(), "loggerContext", term10757);
        setField(term10586, term10586.getClass(), "logger", term10587);
        Long term10795 = new Long(-2585684163342970173L);
        Object term10773 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.DanMuData"));
        Object term10774 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.DanMuUserInfo"));
        Object term10789 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.DanMuFormat"));
        setField(term10774, term10774.getClass(), "uid", "");
        setField(term10774, term10774.getClass(), "nickName", "");
        setField(term10773, term10773.getClass(), "userIfo", term10774);
        setField(term10773, term10773.getClass(), "content", "vKitydDVnM");
        setIntField(term10789, term10789.getClass(), "fontColor", -1254072822);
        setIntField(term10789, term10789.getClass(), "fontSize", 25);
        setIntField(term10789, term10789.getClass(), "textSpeed", -1111249833);
        setIntField(term10789, term10789.getClass(), "transitionType", 1);
        setIntField(term10789, term10789.getClass(), "popupStyle", -1692331299);
        setField(term10773, term10773.getClass(), "danMuFormatData", term10789);
        setField(term10773, term10773.getClass(), "timestamp", term10795);
        setField(term10773, term10773.getClass(), "msgType", "urCiQnUFBM");
        Long term10819 = new Long(8059786003080744426L);
        Object term10810 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.DanMuData"));
        Object term10811 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.DanMuUserInfo"));
        Object term10813 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.DanMuFormat"));
        setField(term10811, term10811.getClass(), "uid", null);
        setField(term10811, term10811.getClass(), "nickName", null);
        setField(term10810, term10810.getClass(), "userIfo", term10811);
        setField(term10810, term10810.getClass(), "content", "");
        setIntField(term10813, term10813.getClass(), "fontColor", 479531250);
        setIntField(term10813, term10813.getClass(), "fontSize", 25);
        setIntField(term10813, term10813.getClass(), "textSpeed", 1320570890);
        setIntField(term10813, term10813.getClass(), "transitionType", 1);
        setIntField(term10813, term10813.getClass(), "popupStyle", -130649791);
        setField(term10810, term10810.getClass(), "danMuFormatData", term10813);
        setField(term10810, term10810.getClass(), "timestamp", term10819);
        setField(term10810, term10810.getClass(), "msgType", "");
        Long term10824 = new Long(-4365849114644724155L);
        Object term10823 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.DanMuData"));
        setField(term10823, term10823.getClass(), "userIfo", null);
        setField(term10823, term10823.getClass(), "content", null);
        setField(term10823, term10823.getClass(), "danMuFormatData", null);
        setField(term10823, term10823.getClass(), "timestamp", term10824);
        setField(term10823, term10823.getClass(), "msgType", null);
        term10770 = new LinkedList();
        ((LinkedList) term10770).add(term10773);
        ((LinkedList) term10770).add(term10810);
        ((LinkedList) term10770).add(term10823);
        ((LinkedList) term10770).add((Object)null);
        ((LinkedList) term10770).add((Object)null);
        ((LinkedList) term10770).add((Object)null);
        ((LinkedList) term10770).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.service.Impl.persistence.ConsoleDanMuExportServiceImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term10770;
        callMethod(klass, "batchExport", argTypes, term10586, args);
    }

};


