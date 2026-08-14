package nl.jiankai.mapper;

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
import static nl.jiankai.mapper.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;

public class ResultSetMapper_map_5046090934 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term708;

    public ResultSetMapper_map_5046090934() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term798 = new HashMap();
        HashMap term803 = new HashMap();
        HashMap term808 = new HashMap();
        HashMap term813 = new HashMap();
        HashMap term819 = new HashMap();
        HashMap term835 = new HashMap();
        term708 = newInstance(Class.forName("nl.jiankai.mapper.ResultSetMapper"));
        Object term709 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term746 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term767 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term770 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term773 = newInstance(Class.forName("java.util.concurrent.CopyOnWriteArrayList"));
        Object term775 = newInstance(Class.forName("ch.qos.logback.classic.LoggerContext"));
        Object term783 = newInstance(Class.forName("java.util.concurrent.CopyOnWriteArrayList"));
        Object term784 = newInstance(Class.forName("java.lang.Object"));
        Object[] term785 = (Object[]) newArray("java.lang.Object", 2);
        Object term787 = newInstance(Class.forName("java.util.concurrent.CopyOnWriteArrayList"));
        Object term788 = newInstance(Class.forName("java.lang.Object"));
        Object[] term789 = (Object[]) newArray("java.lang.Object", 2);
        Object term790 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term793 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term797 = newInstance(Class.forName("nl.jiankai.mapper.ResultSetMapper$ClassCache"));
        Object term818 = newInstance(Class.forName("nl.jiankai.mapper.strategies.IdentityFieldNamingStrategy"));
        setField(term709, term709.getClass(), "name", "nl.jiankai.mapper.ResultSetMapper");
        setField(term709, term709.getClass(), "level", null);
        setIntField(term709, term709.getClass(), "effectiveLevelInt", -2147483648);
        setField(term746, term746.getClass(), "name", "nl.jiankai.mapper");
        setField(term746, term746.getClass(), "level", null);
        setIntField(term746, term746.getClass(), "effectiveLevelInt", -2147483648);
        setField(term767, term767.getClass(), "name", "");
        setField(term767, term767.getClass(), "level", null);
        setIntField(term767, term767.getClass(), "effectiveLevelInt", -2147483648);
        setField(term770, term770.getClass(), "name", null);
        setField(term770, term770.getClass(), "level", null);
        setIntField(term770, term770.getClass(), "effectiveLevelInt", -2147483648);
        setField(term770, term770.getClass(), "parent", null);
        setField(term770, term770.getClass(), "childrenList", null);
        setField(term770, term770.getClass(), "aai", null);
        setBooleanField(term770, term770.getClass(), "additive", true);
        setField(term770, term770.getClass(), "loggerContext", null);
        setField(term767, term767.getClass(), "parent", term770);
        setField(term773, term773.getClass(), "lock", null);
        setField(term773, term773.getClass(), "array", null);
        setField(term767, term767.getClass(), "childrenList", term773);
        setField(term767, term767.getClass(), "aai", null);
        setBooleanField(term767, term767.getClass(), "additive", true);
        setField(term775, term775.getClass(), "root", null);
        setIntField(term775, term775.getClass(), "size", 35);
        setIntField(term775, term775.getClass(), "noAppenderWarning", 0);
        setField(term775, term775.getClass(), "loggerContextListenerList", null);
        setField(term775, term775.getClass(), "loggerCache", null);
        setField(term775, term775.getClass(), "loggerContextRemoteView", null);
        setField(term775, term775.getClass(), "turboFilterList", null);
        setBooleanField(term775, term775.getClass(), "packagingDataEnabled", false);
        setIntField(term775, term775.getClass(), "maxCallerDataDepth", 8);
        setIntField(term775, term775.getClass(), "resetCount", 0);
        setField(term775, term775.getClass(), "frameworkPackages", null);
        setLongField(term775, term775.getClass(), "birthTime", 1786403842639L);
        setField(term775, term775.getClass(), "name", null);
        setField(term775, term775.getClass(), "sm", null);
        setField(term775, term775.getClass(), "propertyMap", null);
        setField(term775, term775.getClass(), "objectMap", null);
        setField(term775, term775.getClass(), "configurationLock", null);
        setField(term775, term775.getClass(), "scheduledExecutorService", null);
        setField(term775, term775.getClass(), "scheduledFutures", null);
        setField(term775, term775.getClass(), "lifeCycleManager", null);
        setBooleanField(term775, term775.getClass(), "started", false);
        setField(term767, term767.getClass(), "loggerContext", term775);
        setField(term746, term746.getClass(), "parent", term767);
        setField(term783, term783.getClass(), "lock", term784);
        setElement(term785, 0, term709);
        setField(term783, term783.getClass(), "array", term785);
        setField(term746, term746.getClass(), "childrenList", term783);
        setField(term746, term746.getClass(), "aai", null);
        setBooleanField(term746, term746.getClass(), "additive", true);
        setField(term746, term746.getClass(), "loggerContext", term775);
        setField(term709, term709.getClass(), "parent", term746);
        setField(term787, term787.getClass(), "lock", term788);
        setField(term790, term790.getClass(), "name", null);
        setField(term790, term790.getClass(), "level", null);
        setIntField(term790, term790.getClass(), "effectiveLevelInt", -2147483648);
        setField(term790, term790.getClass(), "parent", term709);
        setField(term790, term790.getClass(), "childrenList", null);
        setField(term790, term790.getClass(), "aai", null);
        setBooleanField(term790, term790.getClass(), "additive", true);
        setField(term790, term790.getClass(), "loggerContext", term775);
        setElement(term789, 0, term790);
        setField(term793, term793.getClass(), "name", null);
        setField(term793, term793.getClass(), "level", null);
        setIntField(term793, term793.getClass(), "effectiveLevelInt", -2147483648);
        setField(term793, term793.getClass(), "parent", term709);
        setField(term793, term793.getClass(), "childrenList", null);
        setField(term793, term793.getClass(), "aai", null);
        setBooleanField(term793, term793.getClass(), "additive", true);
        setField(term793, term793.getClass(), "loggerContext", term775);
        setElement(term789, 1, term793);
        setField(term787, term787.getClass(), "array", term789);
        setField(term709, term709.getClass(), "childrenList", term787);
        setField(term709, term709.getClass(), "aai", null);
        setBooleanField(term709, term709.getClass(), "additive", true);
        setField(term709, term709.getClass(), "loggerContext", term775);
        setField(term708, term708.getClass(), "logger", term709);
        setField(term797, term797.getClass(), "logger", term793);
        setField(term797, term797.getClass(), "cachedClassFields", term798);
        setField(term797, term797.getClass(), "cachedClassAnnotations", term803);
        setField(term797, term797.getClass(), "cachedFieldAnnotations", term808);
        setField(term797, term797.getClass(), "cachedPrimitiveFields", term813);
        setField(term797, term797.getClass(), "this$0", term708);
        setField(term708, term708.getClass(), "classCache", term797);
        setField(term708, term708.getClass(), "fieldNamingStrategy", term818);
        setField(term708, term708.getClass(), "attributeConvertersBySourceAndTarget", term819);
        setField(term708, term708.getClass(), "attributeConvertersByClass", term835);
        setBooleanField(term708, term708.getClass(), "hasClassLevelWarningSuppression", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("nl.jiankai.mapper.ResultSetMapper");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.sql.ResultSet");
        argTypes[1] = Class.forName("java.lang.Class");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "map", argTypes, term708, args);
    }

};


