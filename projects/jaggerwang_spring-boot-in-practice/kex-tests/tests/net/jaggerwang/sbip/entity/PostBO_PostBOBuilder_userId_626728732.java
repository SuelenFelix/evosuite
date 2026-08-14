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

public class PostBO_PostBOBuilder_userId_626728732 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21626;
     Object term21690;

    public PostBO_PostBOBuilder_userId_626728732() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term21627 = new Long(3453457027014743006L);
        Long term21629 = new Long(3931473624300151730L);
        Class<? extends Object> term21693 = Class.forName((String) "net.jaggerwang.sbip.entity.PostBO$Type");
        Field term21692 = ((Class) term21693).getDeclaredField((String) "IMAGE");
        ((Field) term21692).setAccessible(true);
        Object enum60 = ((Field) term21692).get((Object) null);
        Long term21654 = new Long(661905373566913125L);
        Long term21656 = new Long(-3753621038448351550L);
        Long term21658 = new Long(5304481534735378567L);
        Long term21660 = new Long(3423155413133381764L);
        Long term21662 = new Long(7711054832353934171L);
        Long term21664 = new Long(185544001230120339L);
        ArrayList term21652 = new ArrayList();
        ((ArrayList) term21652).add(term21654);
        ((ArrayList) term21652).add(term21656);
        ((ArrayList) term21652).add(term21658);
        ((ArrayList) term21652).add(term21660);
        ((ArrayList) term21652).add(term21662);
        ((ArrayList) term21652).add(term21664);
        Long term21668 = new Long(4096288569907305445L);
        term21626 = newInstance(Class.forName("net.jaggerwang.sbip.entity.PostBO$PostBOBuilder"));
        Object term21670 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term21671 = newInstance(Class.forName("java.time.LocalDate"));
        Object term21675 = newInstance(Class.forName("java.time.LocalTime"));
        Object term21680 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term21681 = newInstance(Class.forName("java.time.LocalDate"));
        Object term21685 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term21626, term21626.getClass(), "id", term21627);
        setField(term21626, term21626.getClass(), "userId", term21629);
        setField(term21626, term21626.getClass(), "type", enum60);
        setField(term21626, term21626.getClass(), "text", "nhoHrZfnIN");
        setField(term21626, term21626.getClass(), "imageIds", term21652);
        setField(term21626, term21626.getClass(), "videoId", term21668);
        setIntField(term21671, term21671.getClass(), "year", 2020);
        setShortField(term21671, term21671.getClass(), "month", (short) 4);
        setShortField(term21671, term21671.getClass(), "day", (short) 2);
        setField(term21670, term21670.getClass(), "date", term21671);
        setByteField(term21675, term21675.getClass(), "hour", (byte) 11);
        setByteField(term21675, term21675.getClass(), "minute", (byte) 26);
        setByteField(term21675, term21675.getClass(), "second", (byte) 22);
        setIntField(term21675, term21675.getClass(), "nano", 168224721);
        setField(term21670, term21670.getClass(), "time", term21675);
        setField(term21626, term21626.getClass(), "createdAt", term21670);
        setIntField(term21681, term21681.getClass(), "year", 2010);
        setShortField(term21681, term21681.getClass(), "month", (short) 10);
        setShortField(term21681, term21681.getClass(), "day", (short) 26);
        setField(term21680, term21680.getClass(), "date", term21681);
        setByteField(term21685, term21685.getClass(), "hour", (byte) 6);
        setByteField(term21685, term21685.getClass(), "minute", (byte) 28);
        setByteField(term21685, term21685.getClass(), "second", (byte) 52);
        setIntField(term21685, term21685.getClass(), "nano", 197540216);
        setField(term21680, term21680.getClass(), "time", term21685);
        setField(term21626, term21626.getClass(), "updatedAt", term21680);
        term21690 = new Long(6940486570215409900L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.entity.PostBO$PostBOBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term21690;
        callMethod(klass, "userId", argTypes, term21626, args);
    }

};


