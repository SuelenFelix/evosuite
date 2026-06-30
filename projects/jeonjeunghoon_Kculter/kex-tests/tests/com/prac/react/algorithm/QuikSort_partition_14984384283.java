package com.prac.react.algorithm;

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
import static com.prac.react.algorithm.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.LinkedList;
import java.util.ArrayList;
import java.lang.Integer;

public class QuikSort_partition_14984384283 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term432;
     Object term519;
     Object term625;
     Object term627;

    public QuikSort_partition_14984384283() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term432 = newInstance(Class.forName("com.prac.react.algorithm.QuikSort"));
        Object term433 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term470 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term498 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term501 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term504 = newInstance(Class.forName("java.util.concurrent.CopyOnWriteArrayList"));
        Object term506 = newInstance(Class.forName("ch.qos.logback.classic.LoggerContext"));
        Object term514 = newInstance(Class.forName("java.util.concurrent.CopyOnWriteArrayList"));
        Object term515 = newInstance(Class.forName("java.lang.Object"));
        Object[] term516 = (Object[]) newArray("java.lang.Object", 1);
        setField(term433, term433.getClass(), "name", "com.prac.react.algorithm.QuikSort");
        setField(term433, term433.getClass(), "level", null);
        setIntField(term433, term433.getClass(), "effectiveLevelInt", -2147483648);
        setField(term470, term470.getClass(), "name", "com.prac.react.algorithm");
        setField(term470, term470.getClass(), "level", null);
        setIntField(term470, term470.getClass(), "effectiveLevelInt", -2147483648);
        setField(term498, term498.getClass(), "name", "");
        setField(term498, term498.getClass(), "level", null);
        setIntField(term498, term498.getClass(), "effectiveLevelInt", -2147483648);
        setField(term501, term501.getClass(), "name", null);
        setField(term501, term501.getClass(), "level", null);
        setIntField(term501, term501.getClass(), "effectiveLevelInt", -2147483648);
        setField(term501, term501.getClass(), "parent", null);
        setField(term501, term501.getClass(), "childrenList", null);
        setField(term501, term501.getClass(), "aai", null);
        setBooleanField(term501, term501.getClass(), "additive", true);
        setField(term501, term501.getClass(), "loggerContext", null);
        setField(term498, term498.getClass(), "parent", term501);
        setField(term504, term504.getClass(), "lock", null);
        setField(term504, term504.getClass(), "array", null);
        setField(term498, term498.getClass(), "childrenList", term504);
        setField(term498, term498.getClass(), "aai", null);
        setBooleanField(term498, term498.getClass(), "additive", true);
        setField(term506, term506.getClass(), "root", null);
        setIntField(term506, term506.getClass(), "size", 31);
        setIntField(term506, term506.getClass(), "noAppenderWarning", 0);
        setField(term506, term506.getClass(), "loggerContextListenerList", null);
        setField(term506, term506.getClass(), "loggerCache", null);
        setField(term506, term506.getClass(), "loggerContextRemoteView", null);
        setField(term506, term506.getClass(), "turboFilterList", null);
        setBooleanField(term506, term506.getClass(), "packagingDataEnabled", false);
        setIntField(term506, term506.getClass(), "maxCallerDataDepth", 8);
        setIntField(term506, term506.getClass(), "resetCount", 0);
        setField(term506, term506.getClass(), "frameworkPackages", null);
        setLongField(term506, term506.getClass(), "birthTime", 1782677505830L);
        setField(term506, term506.getClass(), "name", null);
        setField(term506, term506.getClass(), "sm", null);
        setField(term506, term506.getClass(), "propertyMap", null);
        setField(term506, term506.getClass(), "objectMap", null);
        setField(term506, term506.getClass(), "configurationLock", null);
        setField(term506, term506.getClass(), "scheduledExecutorService", null);
        setField(term506, term506.getClass(), "scheduledFutures", null);
        setField(term506, term506.getClass(), "lifeCycleManager", null);
        setBooleanField(term506, term506.getClass(), "started", false);
        setField(term498, term498.getClass(), "loggerContext", term506);
        setField(term470, term470.getClass(), "parent", term498);
        setField(term514, term514.getClass(), "lock", term515);
        setElement(term516, 0, term433);
        setField(term514, term514.getClass(), "array", term516);
        setField(term470, term470.getClass(), "childrenList", term514);
        setField(term470, term470.getClass(), "aai", null);
        setBooleanField(term470, term470.getClass(), "additive", true);
        setField(term470, term470.getClass(), "loggerContext", term506);
        setField(term433, term433.getClass(), "parent", term470);
        setField(term433, term433.getClass(), "childrenList", null);
        setField(term433, term433.getClass(), "aai", null);
        setBooleanField(term433, term433.getClass(), "additive", true);
        setField(term433, term433.getClass(), "loggerContext", term506);
        setField(term432, term432.getClass(), "logger", term433);
        ArrayList term523 = new ArrayList();
        Object term522 = newInstance(Class.forName("com.prac.react.model.dto.CourseWrapper"));
        setField(term522, term522.getClass(), "course", term523);
        setField(term522, term522.getClass(), "courseName", "yVMkkQhvmN");
        setIntField(term522, term522.getClass(), "memberNum", -1588772968);
        setField(term522, term522.getClass(), "memberHash", "mvrkADEgpp");
        setIntField(term522, term522.getClass(), "courseNum", -93135961);
        setField(term522, term522.getClass(), "courseHash", "pXOkjyeIRb");
        ArrayList term567 = new ArrayList();
        ((ArrayList) term567).add((Object)null);
        ((ArrayList) term567).add((Object)null);
        ((ArrayList) term567).add((Object)null);
        ((ArrayList) term567).add((Object)null);
        ((ArrayList) term567).add((Object)null);
        ((ArrayList) term567).add((Object)null);
        ((ArrayList) term567).add((Object)null);
        ((ArrayList) term567).add((Object)null);
        ((ArrayList) term567).add((Object)null);
        Object term566 = newInstance(Class.forName("com.prac.react.model.dto.CourseWrapper"));
        setField(term566, term566.getClass(), "course", term567);
        setField(term566, term566.getClass(), "courseName", "");
        setIntField(term566, term566.getClass(), "memberNum", 444029505);
        setField(term566, term566.getClass(), "memberHash", "");
        setIntField(term566, term566.getClass(), "courseNum", -1034506028);
        setField(term566, term566.getClass(), "courseHash", "");
        Object term576 = newInstance(Class.forName("com.prac.react.model.dto.CourseWrapper"));
        setField(term576, term576.getClass(), "course", null);
        setField(term576, term576.getClass(), "courseName", null);
        setIntField(term576, term576.getClass(), "memberNum", 568954359);
        setField(term576, term576.getClass(), "memberHash", null);
        setIntField(term576, term576.getClass(), "courseNum", 53410913);
        setField(term576, term576.getClass(), "courseHash", null);
        term519 = new LinkedList();
        ((LinkedList) term519).add(term522);
        ((LinkedList) term519).add(term566);
        ((LinkedList) term519).add(term576);
        ((LinkedList) term519).add((Object)null);
        ((LinkedList) term519).add((Object)null);
        term625 = new Integer(1283079251);
        term627 = new Integer(-523949691);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.algorithm.QuikSort");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.util.List");
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term519;
        args[1] = term625;
        args[2] = term627;
        callMethod(klass, "partition", argTypes, term432, args);
    }

};


