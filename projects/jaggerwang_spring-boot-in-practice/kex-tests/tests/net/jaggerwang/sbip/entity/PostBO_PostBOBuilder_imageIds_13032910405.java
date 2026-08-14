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
import java.util.LinkedList;

public class PostBO_PostBOBuilder_imageIds_13032910405 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22713;
     Object term22778;

    public PostBO_PostBOBuilder_imageIds_13032910405() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term22714 = new Long(-7506365302323354325L);
        Long term22716 = new Long(-4693900822622913579L);
        Class<? extends Object> term22794 = Class.forName((String) "net.jaggerwang.sbip.entity.PostBO$Type");
        Field term22793 = ((Class) term22794).getDeclaredField((String) "TEXT");
        ((Field) term22793).setAccessible(true);
        Object enum64 = ((Field) term22793).get((Object) null);
        Long term22740 = new Long(-997945615782059734L);
        Long term22742 = new Long(-599981502351912419L);
        Long term22744 = new Long(8171709541116491249L);
        Long term22746 = new Long(1867943942587005261L);
        Long term22748 = new Long(-9168517519350392654L);
        Long term22750 = new Long(4828755228445882127L);
        Long term22752 = new Long(970120292495348028L);
        ArrayList term22738 = new ArrayList();
        ((ArrayList) term22738).add(term22740);
        ((ArrayList) term22738).add(term22742);
        ((ArrayList) term22738).add(term22744);
        ((ArrayList) term22738).add(term22746);
        ((ArrayList) term22738).add(term22748);
        ((ArrayList) term22738).add(term22750);
        ((ArrayList) term22738).add(term22752);
        Long term22756 = new Long(77619432202128806L);
        term22713 = newInstance(Class.forName("net.jaggerwang.sbip.entity.PostBO$PostBOBuilder"));
        Object term22758 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term22759 = newInstance(Class.forName("java.time.LocalDate"));
        Object term22763 = newInstance(Class.forName("java.time.LocalTime"));
        Object term22768 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term22769 = newInstance(Class.forName("java.time.LocalDate"));
        Object term22773 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term22713, term22713.getClass(), "id", term22714);
        setField(term22713, term22713.getClass(), "userId", term22716);
        setField(term22713, term22713.getClass(), "type", enum64);
        setField(term22713, term22713.getClass(), "text", "vGiuZVPJNH");
        setField(term22713, term22713.getClass(), "imageIds", term22738);
        setField(term22713, term22713.getClass(), "videoId", term22756);
        setIntField(term22759, term22759.getClass(), "year", 2012);
        setShortField(term22759, term22759.getClass(), "month", (short) 6);
        setShortField(term22759, term22759.getClass(), "day", (short) 24);
        setField(term22758, term22758.getClass(), "date", term22759);
        setByteField(term22763, term22763.getClass(), "hour", (byte) 23);
        setByteField(term22763, term22763.getClass(), "minute", (byte) 9);
        setByteField(term22763, term22763.getClass(), "second", (byte) 32);
        setIntField(term22763, term22763.getClass(), "nano", 933669930);
        setField(term22758, term22758.getClass(), "time", term22763);
        setField(term22713, term22713.getClass(), "createdAt", term22758);
        setIntField(term22769, term22769.getClass(), "year", 2013);
        setShortField(term22769, term22769.getClass(), "month", (short) 9);
        setShortField(term22769, term22769.getClass(), "day", (short) 29);
        setField(term22768, term22768.getClass(), "date", term22769);
        setByteField(term22773, term22773.getClass(), "hour", (byte) 18);
        setByteField(term22773, term22773.getClass(), "minute", (byte) 32);
        setByteField(term22773, term22773.getClass(), "second", (byte) 59);
        setIntField(term22773, term22773.getClass(), "nano", 213125607);
        setField(term22768, term22768.getClass(), "time", term22773);
        setField(term22713, term22713.getClass(), "updatedAt", term22768);
        Long term22781 = new Long(-1647156882669215876L);
        Long term22784 = new Long(4115148503664117517L);
        Long term22787 = new Long(8527367353497875781L);
        Long term22790 = new Long(-6489405551733780896L);
        term22778 = new LinkedList();
        ((LinkedList) term22778).add(term22781);
        ((LinkedList) term22778).add(term22784);
        ((LinkedList) term22778).add(term22787);
        ((LinkedList) term22778).add(term22790);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.entity.PostBO$PostBOBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term22778;
        callMethod(klass, "imageIds", argTypes, term22713, args);
    }

};


