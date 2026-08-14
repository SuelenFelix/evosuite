package net.jaggerwang.sbip.entity;

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
import static net.jaggerwang.sbip.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.String;
import java.lang.Object;
import java.util.ArrayList;

public class PostBO_setCreatedAt_57716924115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17488;
     Object term17554;

    public PostBO_setCreatedAt_57716924115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term17489 = new Long(146749226579788091L);
        Long term17491 = new Long(-1279670138064751276L);
        Class<? extends Object> term17565 = Class.forName((String) "net.jaggerwang.sbip.entity.PostBO$Type");
        Field term17564 = ((Class) term17565).getDeclaredField((String) "IMAGE");
        ((Field) term17564).setAccessible(true);
        Object enum48 = ((Field) term17564).get((Object) null);
        Long term17516 = new Long(-7205236974351118210L);
        Long term17518 = new Long(-2136893352275781569L);
        Long term17520 = new Long(-9147545274054597570L);
        Long term17522 = new Long(-8398381579707958144L);
        Long term17524 = new Long(-2195061939206930224L);
        Long term17526 = new Long(4525924047960478347L);
        Long term17528 = new Long(-3225860270104198596L);
        ArrayList term17514 = new ArrayList();
        ((ArrayList) term17514).add(term17516);
        ((ArrayList) term17514).add(term17518);
        ((ArrayList) term17514).add(term17520);
        ((ArrayList) term17514).add(term17522);
        ((ArrayList) term17514).add(term17524);
        ((ArrayList) term17514).add(term17526);
        ((ArrayList) term17514).add(term17528);
        Long term17532 = new Long(-1164342036939643746L);
        term17488 = newInstance(Class.forName("net.jaggerwang.sbip.entity.PostBO"));
        Object term17534 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term17535 = newInstance(Class.forName("java.time.LocalDate"));
        Object term17539 = newInstance(Class.forName("java.time.LocalTime"));
        Object term17544 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term17545 = newInstance(Class.forName("java.time.LocalDate"));
        Object term17549 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term17488, term17488.getClass(), "id", term17489);
        setField(term17488, term17488.getClass(), "userId", term17491);
        setField(term17488, term17488.getClass(), "type", enum48);
        setField(term17488, term17488.getClass(), "text", "zUlRdimJtU");
        setField(term17488, term17488.getClass(), "imageIds", term17514);
        setField(term17488, term17488.getClass(), "videoId", term17532);
        setIntField(term17535, term17535.getClass(), "year", 2027);
        setShortField(term17535, term17535.getClass(), "month", (short) 5);
        setShortField(term17535, term17535.getClass(), "day", (short) 2);
        setField(term17534, term17534.getClass(), "date", term17535);
        setByteField(term17539, term17539.getClass(), "hour", (byte) 6);
        setByteField(term17539, term17539.getClass(), "minute", (byte) 10);
        setByteField(term17539, term17539.getClass(), "second", (byte) 19);
        setIntField(term17539, term17539.getClass(), "nano", 422884120);
        setField(term17534, term17534.getClass(), "time", term17539);
        setField(term17488, term17488.getClass(), "createdAt", term17534);
        setIntField(term17545, term17545.getClass(), "year", 2029);
        setShortField(term17545, term17545.getClass(), "month", (short) 10);
        setShortField(term17545, term17545.getClass(), "day", (short) 19);
        setField(term17544, term17544.getClass(), "date", term17545);
        setByteField(term17549, term17549.getClass(), "hour", (byte) 15);
        setByteField(term17549, term17549.getClass(), "minute", (byte) 8);
        setByteField(term17549, term17549.getClass(), "second", (byte) 15);
        setIntField(term17549, term17549.getClass(), "nano", 25396748);
        setField(term17544, term17544.getClass(), "time", term17549);
        setField(term17488, term17488.getClass(), "updatedAt", term17544);
        term17554 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term17555 = newInstance(Class.forName("java.time.LocalDate"));
        Object term17559 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term17555, term17555.getClass(), "year", 2014);
        setShortField(term17555, term17555.getClass(), "month", (short) 6);
        setShortField(term17555, term17555.getClass(), "day", (short) 28);
        setField(term17554, term17554.getClass(), "date", term17555);
        setByteField(term17559, term17559.getClass(), "hour", (byte) 7);
        setByteField(term17559, term17559.getClass(), "minute", (byte) 14);
        setByteField(term17559, term17559.getClass(), "second", (byte) 59);
        setIntField(term17559, term17559.getClass(), "nano", 314278386);
        setField(term17554, term17554.getClass(), "time", term17559);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.entity.PostBO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = term17554;
        callMethod(klass, "setCreatedAt", argTypes, term17488, args);
    }

};


