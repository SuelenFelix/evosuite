package com.org.model;

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
import static com.org.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Object;

public class Meeting_getSignNumber_1629492579 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27989;

    public Meeting_getSignNumber_1629492579() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term27990 = new Integer(1299041951);
        Integer term28072 = new Integer(-1772128093);
        Integer term28074 = new Integer(-2057880798);
        Integer term28089 = new Integer(-2041732081);
        term27989 = newInstance(Class.forName("com.org.model.Meeting"));
        Object term27992 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term27993 = newInstance(Class.forName("java.time.LocalDate"));
        Object term27997 = newInstance(Class.forName("java.time.LocalTime"));
        Object term28038 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term28039 = newInstance(Class.forName("java.time.LocalDate"));
        Object term28043 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term27989, term27989.getClass(), "id", term27990);
        setIntField(term27993, term27993.getClass(), "year", 2014);
        setShortField(term27993, term27993.getClass(), "month", (short) 12);
        setShortField(term27993, term27993.getClass(), "day", (short) 28);
        setField(term27992, term27992.getClass(), "date", term27993);
        setByteField(term27997, term27997.getClass(), "hour", (byte) 2);
        setByteField(term27997, term27997.getClass(), "minute", (byte) 44);
        setByteField(term27997, term27997.getClass(), "second", (byte) 18);
        setIntField(term27997, term27997.getClass(), "nano", 39913942);
        setField(term27992, term27992.getClass(), "time", term27997);
        setField(term27989, term27989.getClass(), "createTime", term27992);
        setField(term27989, term27989.getClass(), "name", "QvobVEStXg");
        setField(term27989, term27989.getClass(), "link", "RPfKIhBpQv");
        setField(term27989, term27989.getClass(), "introduce", "jQpmHIcJfG");
        setIntField(term28039, term28039.getClass(), "year", 2020);
        setShortField(term28039, term28039.getClass(), "month", (short) 11);
        setShortField(term28039, term28039.getClass(), "day", (short) 29);
        setField(term28038, term28038.getClass(), "date", term28039);
        setByteField(term28043, term28043.getClass(), "hour", (byte) 0);
        setByteField(term28043, term28043.getClass(), "minute", (byte) 40);
        setByteField(term28043, term28043.getClass(), "second", (byte) 23);
        setIntField(term28043, term28043.getClass(), "nano", 204732115);
        setField(term28038, term28038.getClass(), "time", term28043);
        setField(term27989, term27989.getClass(), "updateTime", term28038);
        setField(term27989, term27989.getClass(), "meetingTime", "CtygGfxssv");
        setField(term27989, term27989.getClass(), "signTime", "vkVKjCrolQ");
        setField(term27989, term27989.getClass(), "signNumber", term28072);
        setField(term27989, term27989.getClass(), "userNumber", term28074);
        setField(term27989, term27989.getClass(), "fileUrl", "BrcErlTKix");
        setBooleanField(term27989, term27989.getClass(), "online", false);
        setField(term27989, term27989.getClass(), "deleted", term28089);
        setField(term27989, term27989.getClass(), "host", "RTrlkZrszR");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.Meeting");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSignNumber", argTypes, term27989, args);
    }

};


