package com.prac.react.controller;

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
import static com.prac.react.controller.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;

public class CourseController_insertCourse_11814587231 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1863;
     Object term1952;

    public CourseController_insertCourse_11814587231() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1863 = newInstance(Class.forName("com.prac.react.controller.CourseController"));
        Object term1864 = newInstance(Class.forName("com.prac.react.service.CourseService"));
        Object term1865 = newInstance(Class.forName("com.prac.react.security.Encryption"));
        Object term1866 = newInstance(Class.forName("com.prac.react.model.dto.SecretKey"));
        Object term1897 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term1935 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term1938 = newInstance(Class.forName("ch.qos.logback.classic.Logger"));
        Object term1941 = newInstance(Class.forName("java.util.concurrent.CopyOnWriteArrayList"));
        Object term1943 = newInstance(Class.forName("ch.qos.logback.classic.LoggerContext"));
        setField(term1863, term1863.getClass(), "logger", null);
        setField(term1864, term1864.getClass(), "logger", null);
        setField(term1864, term1864.getClass(), "cd", null);
        setField(term1863, term1863.getClass(), "cs", term1864);
        setField(term1866, term1866.getClass(), "secretKey", "MxlszYVzRf");
        setField(term1865, term1865.getClass(), "sk", term1866);
        setField(term1865, term1865.getClass(), "iv", "AlyjNGZKzkfEsasZ");
        setField(term1897, term1897.getClass(), "name", "com.prac.react.security.Encryption");
        setField(term1897, term1897.getClass(), "level", null);
        setIntField(term1897, term1897.getClass(), "effectiveLevelInt", -2147483648);
        setField(term1935, term1935.getClass(), "name", "");
        setField(term1935, term1935.getClass(), "level", null);
        setIntField(term1935, term1935.getClass(), "effectiveLevelInt", -2147483648);
        setField(term1938, term1938.getClass(), "name", null);
        setField(term1938, term1938.getClass(), "level", null);
        setIntField(term1938, term1938.getClass(), "effectiveLevelInt", -2147483648);
        setField(term1938, term1938.getClass(), "parent", null);
        setField(term1938, term1938.getClass(), "childrenList", null);
        setField(term1938, term1938.getClass(), "aai", null);
        setBooleanField(term1938, term1938.getClass(), "additive", true);
        setField(term1938, term1938.getClass(), "loggerContext", null);
        setField(term1935, term1935.getClass(), "parent", term1938);
        setField(term1941, term1941.getClass(), "lock", null);
        setField(term1941, term1941.getClass(), "array", null);
        setField(term1935, term1935.getClass(), "childrenList", term1941);
        setField(term1935, term1935.getClass(), "aai", null);
        setBooleanField(term1935, term1935.getClass(), "additive", true);
        setField(term1943, term1943.getClass(), "root", null);
        setIntField(term1943, term1943.getClass(), "size", 33);
        setIntField(term1943, term1943.getClass(), "noAppenderWarning", 0);
        setField(term1943, term1943.getClass(), "loggerContextListenerList", null);
        setField(term1943, term1943.getClass(), "loggerCache", null);
        setField(term1943, term1943.getClass(), "loggerContextRemoteView", null);
        setField(term1943, term1943.getClass(), "turboFilterList", null);
        setBooleanField(term1943, term1943.getClass(), "packagingDataEnabled", false);
        setIntField(term1943, term1943.getClass(), "maxCallerDataDepth", 8);
        setIntField(term1943, term1943.getClass(), "resetCount", 0);
        setField(term1943, term1943.getClass(), "frameworkPackages", null);
        setLongField(term1943, term1943.getClass(), "birthTime", 1775069216969L);
        setField(term1943, term1943.getClass(), "name", null);
        setField(term1943, term1943.getClass(), "sm", null);
        setField(term1943, term1943.getClass(), "propertyMap", null);
        setField(term1943, term1943.getClass(), "objectMap", null);
        setField(term1943, term1943.getClass(), "configurationLock", null);
        setField(term1943, term1943.getClass(), "scheduledExecutorService", null);
        setField(term1943, term1943.getClass(), "scheduledFutures", null);
        setField(term1943, term1943.getClass(), "lifeCycleManager", null);
        setBooleanField(term1943, term1943.getClass(), "started", false);
        setField(term1935, term1935.getClass(), "loggerContext", term1943);
        setField(term1897, term1897.getClass(), "parent", term1935);
        setField(term1897, term1897.getClass(), "childrenList", null);
        setField(term1897, term1897.getClass(), "aai", null);
        setBooleanField(term1897, term1897.getClass(), "additive", true);
        setField(term1897, term1897.getClass(), "loggerContext", term1943);
        setField(term1865, term1865.getClass(), "logger", term1897);
        setField(term1863, term1863.getClass(), "encryption", term1865);
        Object term1955 = newInstance(Class.forName("com.prac.react.model.dto.Place"));
        setIntField(term1955, term1955.getClass(), "placeNum", 568599855);
        setField(term1955, term1955.getClass(), "keyHash", "");
        setIntField(term1955, term1955.getClass(), "placeType", 1162663216);
        setField(term1955, term1955.getClass(), "culture", "");
        setField(term1955, term1955.getClass(), "kpop", "");
        setDoubleField(term1955, term1955.getClass(), "lat", 0.13238746331190498);
        setDoubleField(term1955, term1955.getClass(), "lng", 0.3455959125047594);
        setIntField(term1955, term1955.getClass(), "status", 1484323161);
        setField(term1955, term1955.getClass(), "name", "");
        setField(term1955, term1955.getClass(), "explain", "");
        setField(term1955, term1955.getClass(), "address", "");
        setField(term1955, term1955.getClass(), "fileUrl", "");
        Object term1968 = newInstance(Class.forName("com.prac.react.model.dto.Place"));
        setIntField(term1968, term1968.getClass(), "placeNum", 391863371);
        setField(term1968, term1968.getClass(), "keyHash", "");
        setIntField(term1968, term1968.getClass(), "placeType", -1922583790);
        setField(term1968, term1968.getClass(), "culture", "");
        setField(term1968, term1968.getClass(), "kpop", "");
        setDoubleField(term1968, term1968.getClass(), "lat", 0.5523635872663106);
        setDoubleField(term1968, term1968.getClass(), "lng", 0.544608645520025);
        setIntField(term1968, term1968.getClass(), "status", -616727354);
        setField(term1968, term1968.getClass(), "name", "");
        setField(term1968, term1968.getClass(), "explain", "");
        setField(term1968, term1968.getClass(), "address", "");
        setField(term1968, term1968.getClass(), "fileUrl", "");
        Object term1981 = newInstance(Class.forName("com.prac.react.model.dto.Place"));
        setIntField(term1981, term1981.getClass(), "placeNum", -1955890973);
        setField(term1981, term1981.getClass(), "keyHash", "");
        setIntField(term1981, term1981.getClass(), "placeType", -2038273078);
        setField(term1981, term1981.getClass(), "culture", "");
        setField(term1981, term1981.getClass(), "kpop", "");
        setDoubleField(term1981, term1981.getClass(), "lat", 0.28570734989730284);
        setDoubleField(term1981, term1981.getClass(), "lng", 0.40176586625454525);
        setIntField(term1981, term1981.getClass(), "status", 1227103734);
        setField(term1981, term1981.getClass(), "name", "");
        setField(term1981, term1981.getClass(), "explain", "");
        setField(term1981, term1981.getClass(), "address", "");
        setField(term1981, term1981.getClass(), "fileUrl", "");
        Object term1994 = newInstance(Class.forName("com.prac.react.model.dto.Place"));
        setIntField(term1994, term1994.getClass(), "placeNum", -1339778481);
        setField(term1994, term1994.getClass(), "keyHash", "");
        setIntField(term1994, term1994.getClass(), "placeType", 1725571209);
        setField(term1994, term1994.getClass(), "culture", "");
        setField(term1994, term1994.getClass(), "kpop", "");
        setDoubleField(term1994, term1994.getClass(), "lat", 0.2641345529914265);
        setDoubleField(term1994, term1994.getClass(), "lng", 0.36923381893433327);
        setIntField(term1994, term1994.getClass(), "status", -522618178);
        setField(term1994, term1994.getClass(), "name", "");
        setField(term1994, term1994.getClass(), "explain", "");
        setField(term1994, term1994.getClass(), "address", "");
        setField(term1994, term1994.getClass(), "fileUrl", "");
        Object term2007 = newInstance(Class.forName("com.prac.react.model.dto.Place"));
        setIntField(term2007, term2007.getClass(), "placeNum", 1134449235);
        setField(term2007, term2007.getClass(), "keyHash", "");
        setIntField(term2007, term2007.getClass(), "placeType", -883034806);
        setField(term2007, term2007.getClass(), "culture", "");
        setField(term2007, term2007.getClass(), "kpop", "");
        setDoubleField(term2007, term2007.getClass(), "lat", 0.6076495596892013);
        setDoubleField(term2007, term2007.getClass(), "lng", 0.37773193782763337);
        setIntField(term2007, term2007.getClass(), "status", 1585847225);
        setField(term2007, term2007.getClass(), "name", "");
        setField(term2007, term2007.getClass(), "explain", "");
        setField(term2007, term2007.getClass(), "address", "");
        setField(term2007, term2007.getClass(), "fileUrl", "");
        ArrayList term1953 = new ArrayList();
        ((ArrayList) term1953).add(term1955);
        ((ArrayList) term1953).add(term1968);
        ((ArrayList) term1953).add(term1981);
        ((ArrayList) term1953).add(term1994);
        ((ArrayList) term1953).add(term2007);
        term1952 = newInstance(Class.forName("com.prac.react.model.dto.CourseWrapper"));
        setField(term1952, term1952.getClass(), "course", term1953);
        setField(term1952, term1952.getClass(), "courseName", "xLbjWUgOIL");
        setIntField(term1952, term1952.getClass(), "memberNum", 597278769);
        setField(term1952, term1952.getClass(), "memberHash", "jDtqGUpnZN");
        setIntField(term1952, term1952.getClass(), "courseNum", -1685132342);
        setField(term1952, term1952.getClass(), "courseHash", "nGKItKLYNC");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.controller.CourseController");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.prac.react.model.dto.CourseWrapper");
        Object[] args = new Object[1];
        args[0] = term1952;
        callMethod(klass, "insertCourse", argTypes, term1863, args);
    }

};


