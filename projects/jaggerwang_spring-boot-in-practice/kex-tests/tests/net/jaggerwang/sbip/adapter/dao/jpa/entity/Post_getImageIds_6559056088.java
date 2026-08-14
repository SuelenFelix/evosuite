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

public class Post_getImageIds_6559056088 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6498;

    public Post_getImageIds_6559056088() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term6499 = new Long(-1885698929232124806L);
        Long term6501 = new Long(5731563613239387113L);
        Class<? extends Object> term6562 = Class.forName((String) "net.jaggerwang.sbip.entity.PostBO$Type");
        Field term6561 = ((Class) term6562).getDeclaredField((String) "TEXT");
        ((Field) term6561).setAccessible(true);
        Object enum17 = ((Field) term6561).get((Object) null);
        Long term6525 = new Long(3381333711768010594L);
        Long term6527 = new Long(3580984732036213717L);
        Long term6529 = new Long(5330761990446327930L);
        Long term6531 = new Long(-3954795081650780841L);
        Long term6533 = new Long(3288791194263207397L);
        Long term6535 = new Long(3288941170644426558L);
        ArrayList term6523 = new ArrayList();
        ((ArrayList) term6523).add(term6525);
        ((ArrayList) term6523).add(term6527);
        ((ArrayList) term6523).add(term6529);
        ((ArrayList) term6523).add(term6531);
        ((ArrayList) term6523).add(term6533);
        ((ArrayList) term6523).add(term6535);
        Long term6539 = new Long(-8338004844694486146L);
        term6498 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.Post"));
        Object term6541 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term6542 = newInstance(Class.forName("java.time.LocalDate"));
        Object term6546 = newInstance(Class.forName("java.time.LocalTime"));
        Object term6551 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term6552 = newInstance(Class.forName("java.time.LocalDate"));
        Object term6556 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term6498, term6498.getClass(), "id", term6499);
        setField(term6498, term6498.getClass(), "userId", term6501);
        setField(term6498, term6498.getClass(), "type", enum17);
        setField(term6498, term6498.getClass(), "text", "UiUYnPrcCi");
        setField(term6498, term6498.getClass(), "imageIds", term6523);
        setField(term6498, term6498.getClass(), "videoId", term6539);
        setIntField(term6542, term6542.getClass(), "year", 2016);
        setShortField(term6542, term6542.getClass(), "month", (short) 6);
        setShortField(term6542, term6542.getClass(), "day", (short) 23);
        setField(term6541, term6541.getClass(), "date", term6542);
        setByteField(term6546, term6546.getClass(), "hour", (byte) 20);
        setByteField(term6546, term6546.getClass(), "minute", (byte) 51);
        setByteField(term6546, term6546.getClass(), "second", (byte) 43);
        setIntField(term6546, term6546.getClass(), "nano", 284389409);
        setField(term6541, term6541.getClass(), "time", term6546);
        setField(term6498, term6498.getClass(), "createdAt", term6541);
        setIntField(term6552, term6552.getClass(), "year", 2014);
        setShortField(term6552, term6552.getClass(), "month", (short) 10);
        setShortField(term6552, term6552.getClass(), "day", (short) 7);
        setField(term6551, term6551.getClass(), "date", term6552);
        setByteField(term6556, term6556.getClass(), "hour", (byte) 12);
        setByteField(term6556, term6556.getClass(), "minute", (byte) 59);
        setByteField(term6556, term6556.getClass(), "second", (byte) 39);
        setIntField(term6556, term6556.getClass(), "nano", 603709306);
        setField(term6551, term6551.getClass(), "time", term6556);
        setField(term6498, term6498.getClass(), "updatedAt", term6551);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.Post");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getImageIds", argTypes, term6498, args);
    }

};


