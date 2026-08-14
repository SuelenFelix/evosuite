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

public class ConsoleDanMuExportServiceImpl_printMessageToConsole_445380371 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9714;
     Object term9898;

    public ConsoleDanMuExportServiceImpl_printMessageToConsole_445380371() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9714 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.service.Impl.persistence.ConsoleDanMuExportServiceImpl"));
        Object term9715 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term9811 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term9877 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term9880 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term9883 = newInstance(Class.forName("java.util.concurrent.CopyOnWriteArrayList"));
        Object term9885 = newInstance(Class.forName("ch.qos.logback.classic.LoggerContext"));
        Object term9893 = newInstance(Class.forName("java.util.concurrent.CopyOnWriteArrayList"));
        Object term9894 = newInstance(Class.forName("java.lang.Object"));
        Object[] term9895 = (Object[]) newArray("java.lang.Object", 1);
        setField(term9715, term9715.getClass(), "name", "com.github.cuteluobo.livedanmuarchive.service.Impl.persistence.ConsoleDanMuExportServiceImpl");
        setField(term9715, term9715.getClass(), "level", null);
        setIntField(term9715, term9715.getClass(), "effectiveLevelInt", -2147483648);
        setField(term9811, term9811.getClass(), "name", "com.github.cuteluobo.livedanmuarchive.service.Impl.persistence");
        setField(term9811, term9811.getClass(), "level", null);
        setIntField(term9811, term9811.getClass(), "effectiveLevelInt", -2147483648);
        setField(term9877, term9877.getClass(), "name", "");
        setField(term9877, term9877.getClass(), "level", null);
        setIntField(term9877, term9877.getClass(), "effectiveLevelInt", -2147483648);
        setField(term9880, term9880.getClass(), "name", null);
        setField(term9880, term9880.getClass(), "level", null);
        setIntField(term9880, term9880.getClass(), "effectiveLevelInt", -2147483648);
        setField(term9880, term9880.getClass(), "parent", null);
        setField(term9880, term9880.getClass(), "childrenList", null);
        setField(term9880, term9880.getClass(), "aai", null);
        setBooleanField(term9880, term9880.getClass(), "additive", true);
        setField(term9880, term9880.getClass(), "loggerContext", null);
        setField(term9877, term9877.getClass(), "parent", term9880);
        setField(term9883, term9883.getClass(), "lock", null);
        setField(term9883, term9883.getClass(), "array", null);
        setField(term9877, term9877.getClass(), "childrenList", term9883);
        setField(term9877, term9877.getClass(), "aai", null);
        setBooleanField(term9877, term9877.getClass(), "additive", true);
        setField(term9885, term9885.getClass(), "root", null);
        setIntField(term9885, term9885.getClass(), "size", 36);
        setIntField(term9885, term9885.getClass(), "noAppenderWarning", 0);
        setField(term9885, term9885.getClass(), "loggerContextListenerList", null);
        setField(term9885, term9885.getClass(), "loggerCache", null);
        setField(term9885, term9885.getClass(), "loggerContextRemoteView", null);
        setField(term9885, term9885.getClass(), "turboFilterList", null);
        setBooleanField(term9885, term9885.getClass(), "packagingDataEnabled", false);
        setIntField(term9885, term9885.getClass(), "maxCallerDataDepth", 8);
        setIntField(term9885, term9885.getClass(), "resetCount", 0);
        setField(term9885, term9885.getClass(), "frameworkPackages", null);
        setLongField(term9885, term9885.getClass(), "birthTime", 1786460918193L);
        setField(term9885, term9885.getClass(), "name", null);
        setField(term9885, term9885.getClass(), "sm", null);
        setField(term9885, term9885.getClass(), "propertyMap", null);
        setField(term9885, term9885.getClass(), "objectMap", null);
        setField(term9885, term9885.getClass(), "configurationLock", null);
        setField(term9885, term9885.getClass(), "scheduledExecutorService", null);
        setField(term9885, term9885.getClass(), "scheduledFutures", null);
        setField(term9885, term9885.getClass(), "lifeCycleManager", null);
        setBooleanField(term9885, term9885.getClass(), "started", false);
        setField(term9877, term9877.getClass(), "loggerContext", term9885);
        setField(term9811, term9811.getClass(), "parent", term9877);
        setField(term9893, term9893.getClass(), "lock", term9894);
        setElement(term9895, 0, term9715);
        setField(term9893, term9893.getClass(), "array", term9895);
        setField(term9811, term9811.getClass(), "childrenList", term9893);
        setField(term9811, term9811.getClass(), "aai", null);
        setBooleanField(term9811, term9811.getClass(), "additive", true);
        setField(term9811, term9811.getClass(), "loggerContext", term9885);
        setField(term9715, term9715.getClass(), "parent", term9811);
        setField(term9715, term9715.getClass(), "childrenList", null);
        setField(term9715, term9715.getClass(), "aai", null);
        setBooleanField(term9715, term9715.getClass(), "additive", true);
        setField(term9715, term9715.getClass(), "loggerContext", term9885);
        setField(term9714, term9714.getClass(), "logger", term9715);
        Long term9942 = new Long(-4920224193275732920L);
        term9898 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.DanMuData"));
        Object term9899 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.DanMuUserInfo"));
        Object term9936 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.DanMuFormat"));
        setField(term9899, term9899.getClass(), "uid", "NBrvVzvQHe");
        setField(term9899, term9899.getClass(), "nickName", "FjOiNAfBOc");
        setField(term9898, term9898.getClass(), "userIfo", term9899);
        setField(term9898, term9898.getClass(), "content", "iCCsaLHohG");
        setIntField(term9936, term9936.getClass(), "fontColor", -1146679443);
        setIntField(term9936, term9936.getClass(), "fontSize", 25);
        setIntField(term9936, term9936.getClass(), "textSpeed", -860131894);
        setIntField(term9936, term9936.getClass(), "transitionType", 1);
        setIntField(term9936, term9936.getClass(), "popupStyle", -1022990421);
        setField(term9898, term9898.getClass(), "danMuFormatData", term9936);
        setField(term9898, term9898.getClass(), "timestamp", term9942);
        setField(term9898, term9898.getClass(), "msgType", "NJhGgctbdj");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.service.Impl.persistence.ConsoleDanMuExportServiceImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.DanMuData");
        Object[] args = new Object[1];
        args[0] = term9898;
        callMethod(klass, "printMessageToConsole", argTypes, term9714, args);
    }

};


