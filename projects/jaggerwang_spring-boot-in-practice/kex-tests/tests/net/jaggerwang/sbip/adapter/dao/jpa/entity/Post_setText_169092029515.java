package net.jaggerwang.sbip.adapter.dao.jpa.entity;

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
import static net.jaggerwang.sbip.adapter.dao.jpa.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.String;
import java.lang.Object;
import java.util.ArrayList;

public class Post_setText_169092029515 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8685;

    public Post_setText_169092029515() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term8686 = new Long(4069264186851023313L);
        Long term8688 = new Long(5184635470881147510L);
        Class<? extends Object> term8756 = Class.forName((String) "net.jaggerwang.sbip.entity.PostBO$Type");
        Field term8755 = ((Class) term8756).getDeclaredField((String) "IMAGE");
        ((Field) term8755).setAccessible(true);
        Object enum25 = ((Field) term8755).get((Object) null);
        Long term8713 = new Long(918397384129253729L);
        Long term8715 = new Long(-2187638136407967948L);
        Long term8717 = new Long(8708846223293804408L);
        ArrayList term8711 = new ArrayList();
        ((ArrayList) term8711).add(term8713);
        ((ArrayList) term8711).add(term8715);
        ((ArrayList) term8711).add(term8717);
        Long term8721 = new Long(-2986201902216133814L);
        term8685 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.Post"));
        Object term8723 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term8724 = newInstance(Class.forName("java.time.LocalDate"));
        Object term8728 = newInstance(Class.forName("java.time.LocalTime"));
        Object term8733 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term8734 = newInstance(Class.forName("java.time.LocalDate"));
        Object term8738 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term8685, term8685.getClass(), "id", term8686);
        setField(term8685, term8685.getClass(), "userId", term8688);
        setField(term8685, term8685.getClass(), "type", enum25);
        setField(term8685, term8685.getClass(), "text", "ytSBIKXogI");
        setField(term8685, term8685.getClass(), "imageIds", term8711);
        setField(term8685, term8685.getClass(), "videoId", term8721);
        setIntField(term8724, term8724.getClass(), "year", 2029);
        setShortField(term8724, term8724.getClass(), "month", (short) 7);
        setShortField(term8724, term8724.getClass(), "day", (short) 19);
        setField(term8723, term8723.getClass(), "date", term8724);
        setByteField(term8728, term8728.getClass(), "hour", (byte) 17);
        setByteField(term8728, term8728.getClass(), "minute", (byte) 37);
        setByteField(term8728, term8728.getClass(), "second", (byte) 21);
        setIntField(term8728, term8728.getClass(), "nano", 320093277);
        setField(term8723, term8723.getClass(), "time", term8728);
        setField(term8685, term8685.getClass(), "createdAt", term8723);
        setIntField(term8734, term8734.getClass(), "year", 2028);
        setShortField(term8734, term8734.getClass(), "month", (short) 1);
        setShortField(term8734, term8734.getClass(), "day", (short) 11);
        setField(term8733, term8733.getClass(), "date", term8734);
        setByteField(term8738, term8738.getClass(), "hour", (byte) 22);
        setByteField(term8738, term8738.getClass(), "minute", (byte) 3);
        setByteField(term8738, term8738.getClass(), "second", (byte) 39);
        setIntField(term8738, term8738.getClass(), "nano", 175567313);
        setField(term8733, term8733.getClass(), "time", term8738);
        setField(term8685, term8685.getClass(), "updatedAt", term8733);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.Post");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "nHXjMycHlU";
        callMethod(klass, "setText", argTypes, term8685, args);
    }

};


