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

public class ResultSetMapper_registerAttributeConverter_11187440323 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term511;

    public ResultSetMapper_registerAttributeConverter_11187440323() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term601 = new HashMap();
        HashMap term606 = new HashMap();
        HashMap term611 = new HashMap();
        HashMap term616 = new HashMap();
        HashMap term622 = new HashMap();
        HashMap term638 = new HashMap();
        term511 = newInstance(Class.forName("nl.jiankai.mapper.ResultSetMapper"));
        Object term512 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term549 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term570 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term573 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term576 = newInstance(Class.forName("java.util.concurrent.CopyOnWriteArrayList"));
        Object term578 = newInstance(Class.forName("ch.qos.logback.classic.LoggerContext"));
        Object term586 = newInstance(Class.forName("java.util.concurrent.CopyOnWriteArrayList"));
        Object term587 = newInstance(Class.forName("java.lang.Object"));
        Object[] term588 = (Object[]) newArray("java.lang.Object", 2);
        Object term590 = newInstance(Class.forName("java.util.concurrent.CopyOnWriteArrayList"));
        Object term591 = newInstance(Class.forName("java.lang.Object"));
        Object[] term592 = (Object[]) newArray("java.lang.Object", 2);
        Object term593 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term596 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term600 = newInstance(Class.forName("nl.jiankai.mapper.ResultSetMapper$ClassCache"));
        Object term621 = newInstance(Class.forName("nl.jiankai.mapper.strategies.IdentityFieldNamingStrategy"));
        setField(term512, term512.getClass(), "name", "nl.jiankai.mapper.ResultSetMapper");
        setField(term512, term512.getClass(), "level", null);
        setIntField(term512, term512.getClass(), "effectiveLevelInt", -2147483648);
        setField(term549, term549.getClass(), "name", "nl.jiankai.mapper");
        setField(term549, term549.getClass(), "level", null);
        setIntField(term549, term549.getClass(), "effectiveLevelInt", -2147483648);
        setField(term570, term570.getClass(), "name", "");
        setField(term570, term570.getClass(), "level", null);
        setIntField(term570, term570.getClass(), "effectiveLevelInt", -2147483648);
        setField(term573, term573.getClass(), "name", null);
        setField(term573, term573.getClass(), "level", null);
        setIntField(term573, term573.getClass(), "effectiveLevelInt", -2147483648);
        setField(term573, term573.getClass(), "parent", null);
        setField(term573, term573.getClass(), "childrenList", null);
        setField(term573, term573.getClass(), "aai", null);
        setBooleanField(term573, term573.getClass(), "additive", true);
        setField(term573, term573.getClass(), "loggerContext", null);
        setField(term570, term570.getClass(), "parent", term573);
        setField(term576, term576.getClass(), "lock", null);
        setField(term576, term576.getClass(), "array", null);
        setField(term570, term570.getClass(), "childrenList", term576);
        setField(term570, term570.getClass(), "aai", null);
        setBooleanField(term570, term570.getClass(), "additive", true);
        setField(term578, term578.getClass(), "root", null);
        setIntField(term578, term578.getClass(), "size", 35);
        setIntField(term578, term578.getClass(), "noAppenderWarning", 0);
        setField(term578, term578.getClass(), "loggerContextListenerList", null);
        setField(term578, term578.getClass(), "loggerCache", null);
        setField(term578, term578.getClass(), "loggerContextRemoteView", null);
        setField(term578, term578.getClass(), "turboFilterList", null);
        setBooleanField(term578, term578.getClass(), "packagingDataEnabled", false);
        setIntField(term578, term578.getClass(), "maxCallerDataDepth", 8);
        setIntField(term578, term578.getClass(), "resetCount", 0);
        setField(term578, term578.getClass(), "frameworkPackages", null);
        setLongField(term578, term578.getClass(), "birthTime", 1786403842639L);
        setField(term578, term578.getClass(), "name", null);
        setField(term578, term578.getClass(), "sm", null);
        setField(term578, term578.getClass(), "propertyMap", null);
        setField(term578, term578.getClass(), "objectMap", null);
        setField(term578, term578.getClass(), "configurationLock", null);
        setField(term578, term578.getClass(), "scheduledExecutorService", null);
        setField(term578, term578.getClass(), "scheduledFutures", null);
        setField(term578, term578.getClass(), "lifeCycleManager", null);
        setBooleanField(term578, term578.getClass(), "started", false);
        setField(term570, term570.getClass(), "loggerContext", term578);
        setField(term549, term549.getClass(), "parent", term570);
        setField(term586, term586.getClass(), "lock", term587);
        setElement(term588, 0, term512);
        setField(term586, term586.getClass(), "array", term588);
        setField(term549, term549.getClass(), "childrenList", term586);
        setField(term549, term549.getClass(), "aai", null);
        setBooleanField(term549, term549.getClass(), "additive", true);
        setField(term549, term549.getClass(), "loggerContext", term578);
        setField(term512, term512.getClass(), "parent", term549);
        setField(term590, term590.getClass(), "lock", term591);
        setField(term593, term593.getClass(), "name", null);
        setField(term593, term593.getClass(), "level", null);
        setIntField(term593, term593.getClass(), "effectiveLevelInt", -2147483648);
        setField(term593, term593.getClass(), "parent", term512);
        setField(term593, term593.getClass(), "childrenList", null);
        setField(term593, term593.getClass(), "aai", null);
        setBooleanField(term593, term593.getClass(), "additive", true);
        setField(term593, term593.getClass(), "loggerContext", term578);
        setElement(term592, 0, term593);
        setField(term596, term596.getClass(), "name", null);
        setField(term596, term596.getClass(), "level", null);
        setIntField(term596, term596.getClass(), "effectiveLevelInt", -2147483648);
        setField(term596, term596.getClass(), "parent", term512);
        setField(term596, term596.getClass(), "childrenList", null);
        setField(term596, term596.getClass(), "aai", null);
        setBooleanField(term596, term596.getClass(), "additive", true);
        setField(term596, term596.getClass(), "loggerContext", term578);
        setElement(term592, 1, term596);
        setField(term590, term590.getClass(), "array", term592);
        setField(term512, term512.getClass(), "childrenList", term590);
        setField(term512, term512.getClass(), "aai", null);
        setBooleanField(term512, term512.getClass(), "additive", true);
        setField(term512, term512.getClass(), "loggerContext", term578);
        setField(term511, term511.getClass(), "logger", term512);
        setField(term600, term600.getClass(), "logger", term596);
        setField(term600, term600.getClass(), "cachedClassFields", term601);
        setField(term600, term600.getClass(), "cachedClassAnnotations", term606);
        setField(term600, term600.getClass(), "cachedFieldAnnotations", term611);
        setField(term600, term600.getClass(), "cachedPrimitiveFields", term616);
        setField(term600, term600.getClass(), "this$0", term511);
        setField(term511, term511.getClass(), "classCache", term600);
        setField(term511, term511.getClass(), "fieldNamingStrategy", term621);
        setField(term511, term511.getClass(), "attributeConvertersBySourceAndTarget", term622);
        setField(term511, term511.getClass(), "attributeConvertersByClass", term638);
        setBooleanField(term511, term511.getClass(), "hasClassLevelWarningSuppression", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("nl.jiankai.mapper.ResultSetMapper");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("nl.jiankai.mapper.converters.AttributeConverter");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "registerAttributeConverter", argTypes, term511, args);
    }

};


