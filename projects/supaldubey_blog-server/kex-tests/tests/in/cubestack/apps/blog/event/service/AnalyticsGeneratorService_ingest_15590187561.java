package in.cubestack.apps.blog.event.service;

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
import static in.cubestack.apps.blog.event.service.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.String;
import java.lang.Object;

public class AnalyticsGeneratorService_ingest_15590187561 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1118;
     Object term1119;

    public AnalyticsGeneratorService_ingest_15590187561() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1118 = newInstance(Class.forName("in.cubestack.apps.blog.event.service.AnalyticsGeneratorService"));
        setField(term1118, term1118.getClass(), "postService", null);
        Long term1120 = new Long(4872422362414183754L);
        Class<? extends Object> term1160 = Class.forName((String) "in.cubestack.apps.blog.event.domain.EventType");
        Field term1159 = ((Class) term1160).getDeclaredField((String) "TAG_UPDATED");
        ((Field) term1159).setAccessible(true);
        Object enum3 = ((Field) term1159).get((Object) null);
        Long term1137 = new Long(6811161968424632369L);
        term1119 = newInstance(Class.forName("in.cubestack.apps.blog.event.domain.Event"));
        Object term1139 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1140 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1144 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1149 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1150 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1154 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term1119, term1119.getClass(), "contentId", term1120);
        setField(term1119, term1119.getClass(), "eventType", enum3);
        setField(term1119, term1119.getClass(), "id", term1137);
        setIntField(term1140, term1140.getClass(), "year", 2025);
        setShortField(term1140, term1140.getClass(), "month", (short) 4);
        setShortField(term1140, term1140.getClass(), "day", (short) 24);
        setField(term1139, term1139.getClass(), "date", term1140);
        setByteField(term1144, term1144.getClass(), "hour", (byte) 18);
        setByteField(term1144, term1144.getClass(), "minute", (byte) 11);
        setByteField(term1144, term1144.getClass(), "second", (byte) 40);
        setIntField(term1144, term1144.getClass(), "nano", 137454929);
        setField(term1139, term1139.getClass(), "time", term1144);
        setField(term1119, term1119.getClass(), "createdAt", term1139);
        setIntField(term1150, term1150.getClass(), "year", 2024);
        setShortField(term1150, term1150.getClass(), "month", (short) 1);
        setShortField(term1150, term1150.getClass(), "day", (short) 24);
        setField(term1149, term1149.getClass(), "date", term1150);
        setByteField(term1154, term1154.getClass(), "hour", (byte) 20);
        setByteField(term1154, term1154.getClass(), "minute", (byte) 28);
        setByteField(term1154, term1154.getClass(), "second", (byte) 39);
        setIntField(term1154, term1154.getClass(), "nano", 952728177);
        setField(term1149, term1149.getClass(), "time", term1154);
        setField(term1119, term1119.getClass(), "updatedAt", term1149);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("in.cubestack.apps.blog.event.service.AnalyticsGeneratorService");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("in.cubestack.apps.blog.event.domain.Event");
        Object[] args = new Object[1];
        args[0] = term1119;
        callMethod(klass, "ingest", argTypes, term1118, args);
    }

};


