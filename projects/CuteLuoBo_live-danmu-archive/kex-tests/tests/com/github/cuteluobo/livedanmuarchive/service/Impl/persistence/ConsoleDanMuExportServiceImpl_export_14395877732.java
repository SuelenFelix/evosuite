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

public class ConsoleDanMuExportServiceImpl_export_14395877732 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10150;
     Object term10334;

    public ConsoleDanMuExportServiceImpl_export_14395877732() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10150 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.service.Impl.persistence.ConsoleDanMuExportServiceImpl"));
        Object term10151 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term10247 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term10313 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term10316 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term10319 = newInstance(Class.forName("java.util.concurrent.CopyOnWriteArrayList"));
        Object term10321 = newInstance(Class.forName("ch.qos.logback.classic.LoggerContext"));
        Object term10329 = newInstance(Class.forName("java.util.concurrent.CopyOnWriteArrayList"));
        Object term10330 = newInstance(Class.forName("java.lang.Object"));
        Object[] term10331 = (Object[]) newArray("java.lang.Object", 1);
        setField(term10151, term10151.getClass(), "name", "com.github.cuteluobo.livedanmuarchive.service.Impl.persistence.ConsoleDanMuExportServiceImpl");
        setField(term10151, term10151.getClass(), "level", null);
        setIntField(term10151, term10151.getClass(), "effectiveLevelInt", -2147483648);
        setField(term10247, term10247.getClass(), "name", "com.github.cuteluobo.livedanmuarchive.service.Impl.persistence");
        setField(term10247, term10247.getClass(), "level", null);
        setIntField(term10247, term10247.getClass(), "effectiveLevelInt", -2147483648);
        setField(term10313, term10313.getClass(), "name", "");
        setField(term10313, term10313.getClass(), "level", null);
        setIntField(term10313, term10313.getClass(), "effectiveLevelInt", -2147483648);
        setField(term10316, term10316.getClass(), "name", null);
        setField(term10316, term10316.getClass(), "level", null);
        setIntField(term10316, term10316.getClass(), "effectiveLevelInt", -2147483648);
        setField(term10316, term10316.getClass(), "parent", null);
        setField(term10316, term10316.getClass(), "childrenList", null);
        setField(term10316, term10316.getClass(), "aai", null);
        setBooleanField(term10316, term10316.getClass(), "additive", true);
        setField(term10316, term10316.getClass(), "loggerContext", null);
        setField(term10313, term10313.getClass(), "parent", term10316);
        setField(term10319, term10319.getClass(), "lock", null);
        setField(term10319, term10319.getClass(), "array", null);
        setField(term10313, term10313.getClass(), "childrenList", term10319);
        setField(term10313, term10313.getClass(), "aai", null);
        setBooleanField(term10313, term10313.getClass(), "additive", true);
        setField(term10321, term10321.getClass(), "root", null);
        setIntField(term10321, term10321.getClass(), "size", 36);
        setIntField(term10321, term10321.getClass(), "noAppenderWarning", 0);
        setField(term10321, term10321.getClass(), "loggerContextListenerList", null);
        setField(term10321, term10321.getClass(), "loggerCache", null);
        setField(term10321, term10321.getClass(), "loggerContextRemoteView", null);
        setField(term10321, term10321.getClass(), "turboFilterList", null);
        setBooleanField(term10321, term10321.getClass(), "packagingDataEnabled", false);
        setIntField(term10321, term10321.getClass(), "maxCallerDataDepth", 8);
        setIntField(term10321, term10321.getClass(), "resetCount", 0);
        setField(term10321, term10321.getClass(), "frameworkPackages", null);
        setLongField(term10321, term10321.getClass(), "birthTime", 1786460918193L);
        setField(term10321, term10321.getClass(), "name", null);
        setField(term10321, term10321.getClass(), "sm", null);
        setField(term10321, term10321.getClass(), "propertyMap", null);
        setField(term10321, term10321.getClass(), "objectMap", null);
        setField(term10321, term10321.getClass(), "configurationLock", null);
        setField(term10321, term10321.getClass(), "scheduledExecutorService", null);
        setField(term10321, term10321.getClass(), "scheduledFutures", null);
        setField(term10321, term10321.getClass(), "lifeCycleManager", null);
        setBooleanField(term10321, term10321.getClass(), "started", false);
        setField(term10313, term10313.getClass(), "loggerContext", term10321);
        setField(term10247, term10247.getClass(), "parent", term10313);
        setField(term10329, term10329.getClass(), "lock", term10330);
        setElement(term10331, 0, term10151);
        setField(term10329, term10329.getClass(), "array", term10331);
        setField(term10247, term10247.getClass(), "childrenList", term10329);
        setField(term10247, term10247.getClass(), "aai", null);
        setBooleanField(term10247, term10247.getClass(), "additive", true);
        setField(term10247, term10247.getClass(), "loggerContext", term10321);
        setField(term10151, term10151.getClass(), "parent", term10247);
        setField(term10151, term10151.getClass(), "childrenList", null);
        setField(term10151, term10151.getClass(), "aai", null);
        setBooleanField(term10151, term10151.getClass(), "additive", true);
        setField(term10151, term10151.getClass(), "loggerContext", term10321);
        setField(term10150, term10150.getClass(), "logger", term10151);
        Long term10378 = new Long(8428634514691209827L);
        term10334 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.DanMuData"));
        Object term10335 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.DanMuUserInfo"));
        Object term10372 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.DanMuFormat"));
        setField(term10335, term10335.getClass(), "uid", "MYWYUeLGOp");
        setField(term10335, term10335.getClass(), "nickName", "tsTGdgQYUL");
        setField(term10334, term10334.getClass(), "userIfo", term10335);
        setField(term10334, term10334.getClass(), "content", "TtGbVmKcnX");
        setIntField(term10372, term10372.getClass(), "fontColor", 1045547089);
        setIntField(term10372, term10372.getClass(), "fontSize", 25);
        setIntField(term10372, term10372.getClass(), "textSpeed", -1122880881);
        setIntField(term10372, term10372.getClass(), "transitionType", 1);
        setIntField(term10372, term10372.getClass(), "popupStyle", -542712742);
        setField(term10334, term10334.getClass(), "danMuFormatData", term10372);
        setField(term10334, term10334.getClass(), "timestamp", term10378);
        setField(term10334, term10334.getClass(), "msgType", "GJVkUrCVdD");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.service.Impl.persistence.ConsoleDanMuExportServiceImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.DanMuData");
        Object[] args = new Object[1];
        args[0] = term10334;
        callMethod(klass, "export", argTypes, term10150, args);
    }

};


