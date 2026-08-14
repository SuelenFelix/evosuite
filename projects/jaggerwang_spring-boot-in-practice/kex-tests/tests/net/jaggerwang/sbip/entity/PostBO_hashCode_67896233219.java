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

public class PostBO_hashCode_67896233219 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18634;

    public PostBO_hashCode_67896233219() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term18635 = new Long(-629491722907628764L);
        Long term18637 = new Long(-5552123402871285352L);
        Class<? extends Object> term18695 = Class.forName((String) "net.jaggerwang.sbip.entity.PostBO$Type");
        Field term18694 = ((Class) term18695).getDeclaredField((String) "IMAGE");
        ((Field) term18694).setAccessible(true);
        Object enum52 = ((Field) term18694).get((Object) null);
        Long term18662 = new Long(-5587528177305224828L);
        Long term18664 = new Long(7950532649535587877L);
        Long term18666 = new Long(7799452759993694308L);
        Long term18668 = new Long(-1571034605670661708L);
        ArrayList term18660 = new ArrayList();
        ((ArrayList) term18660).add(term18662);
        ((ArrayList) term18660).add(term18664);
        ((ArrayList) term18660).add(term18666);
        ((ArrayList) term18660).add(term18668);
        Long term18672 = new Long(-7983954942068142191L);
        term18634 = newInstance(Class.forName("net.jaggerwang.sbip.entity.PostBO"));
        Object term18674 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term18675 = newInstance(Class.forName("java.time.LocalDate"));
        Object term18679 = newInstance(Class.forName("java.time.LocalTime"));
        Object term18684 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term18685 = newInstance(Class.forName("java.time.LocalDate"));
        Object term18689 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term18634, term18634.getClass(), "id", term18635);
        setField(term18634, term18634.getClass(), "userId", term18637);
        setField(term18634, term18634.getClass(), "type", enum52);
        setField(term18634, term18634.getClass(), "text", "lihXWlGDxk");
        setField(term18634, term18634.getClass(), "imageIds", term18660);
        setField(term18634, term18634.getClass(), "videoId", term18672);
        setIntField(term18675, term18675.getClass(), "year", 2020);
        setShortField(term18675, term18675.getClass(), "month", (short) 2);
        setShortField(term18675, term18675.getClass(), "day", (short) 1);
        setField(term18674, term18674.getClass(), "date", term18675);
        setByteField(term18679, term18679.getClass(), "hour", (byte) 0);
        setByteField(term18679, term18679.getClass(), "minute", (byte) 46);
        setByteField(term18679, term18679.getClass(), "second", (byte) 1);
        setIntField(term18679, term18679.getClass(), "nano", 544722812);
        setField(term18674, term18674.getClass(), "time", term18679);
        setField(term18634, term18634.getClass(), "createdAt", term18674);
        setIntField(term18685, term18685.getClass(), "year", 2027);
        setShortField(term18685, term18685.getClass(), "month", (short) 8);
        setShortField(term18685, term18685.getClass(), "day", (short) 16);
        setField(term18684, term18684.getClass(), "date", term18685);
        setByteField(term18689, term18689.getClass(), "hour", (byte) 15);
        setByteField(term18689, term18689.getClass(), "minute", (byte) 1);
        setByteField(term18689, term18689.getClass(), "second", (byte) 18);
        setIntField(term18689, term18689.getClass(), "nano", 245350825);
        setField(term18684, term18684.getClass(), "time", term18689);
        setField(term18634, term18634.getClass(), "updatedAt", term18684);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.entity.PostBO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term18634, args);
    }

};


