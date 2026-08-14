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

public class Post_getType_19681639376 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5934;

    public Post_getType_19681639376() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term5935 = new Long(6698455537431331246L);
        Long term5937 = new Long(-8327432141027603933L);
        Class<? extends Object> term5999 = Class.forName((String) "net.jaggerwang.sbip.entity.PostBO$Type");
        Field term5998 = ((Class) term5999).getDeclaredField((String) "IMAGE");
        ((Field) term5998).setAccessible(true);
        Object enum15 = ((Field) term5998).get((Object) null);
        Long term5962 = new Long(-433040798405298080L);
        Long term5964 = new Long(-1505191021111100819L);
        Long term5966 = new Long(-1000830646340880796L);
        Long term5968 = new Long(5973526439563541711L);
        Long term5970 = new Long(5246058710498845622L);
        Long term5972 = new Long(4394651392080968777L);
        ArrayList term5960 = new ArrayList();
        ((ArrayList) term5960).add(term5962);
        ((ArrayList) term5960).add(term5964);
        ((ArrayList) term5960).add(term5966);
        ((ArrayList) term5960).add(term5968);
        ((ArrayList) term5960).add(term5970);
        ((ArrayList) term5960).add(term5972);
        Long term5976 = new Long(-7310273014364148916L);
        term5934 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.Post"));
        Object term5978 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term5979 = newInstance(Class.forName("java.time.LocalDate"));
        Object term5983 = newInstance(Class.forName("java.time.LocalTime"));
        Object term5988 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term5989 = newInstance(Class.forName("java.time.LocalDate"));
        Object term5993 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term5934, term5934.getClass(), "id", term5935);
        setField(term5934, term5934.getClass(), "userId", term5937);
        setField(term5934, term5934.getClass(), "type", enum15);
        setField(term5934, term5934.getClass(), "text", "jDtqGUpnZN");
        setField(term5934, term5934.getClass(), "imageIds", term5960);
        setField(term5934, term5934.getClass(), "videoId", term5976);
        setIntField(term5979, term5979.getClass(), "year", 2021);
        setShortField(term5979, term5979.getClass(), "month", (short) 4);
        setShortField(term5979, term5979.getClass(), "day", (short) 26);
        setField(term5978, term5978.getClass(), "date", term5979);
        setByteField(term5983, term5983.getClass(), "hour", (byte) 11);
        setByteField(term5983, term5983.getClass(), "minute", (byte) 34);
        setByteField(term5983, term5983.getClass(), "second", (byte) 15);
        setIntField(term5983, term5983.getClass(), "nano", 638206023);
        setField(term5978, term5978.getClass(), "time", term5983);
        setField(term5934, term5934.getClass(), "createdAt", term5978);
        setIntField(term5989, term5989.getClass(), "year", 2013);
        setShortField(term5989, term5989.getClass(), "month", (short) 9);
        setShortField(term5989, term5989.getClass(), "day", (short) 13);
        setField(term5988, term5988.getClass(), "date", term5989);
        setByteField(term5993, term5993.getClass(), "hour", (byte) 14);
        setByteField(term5993, term5993.getClass(), "minute", (byte) 36);
        setByteField(term5993, term5993.getClass(), "second", (byte) 59);
        setIntField(term5993, term5993.getClass(), "nano", 363124001);
        setField(term5988, term5988.getClass(), "time", term5993);
        setField(term5934, term5934.getClass(), "updatedAt", term5988);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.Post");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getType", argTypes, term5934, args);
    }

};


