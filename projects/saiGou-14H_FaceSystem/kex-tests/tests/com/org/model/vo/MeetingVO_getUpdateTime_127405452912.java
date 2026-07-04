package com.org.model.vo;

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
import static com.org.model.vo.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Object;

public class MeetingVO_getUpdateTime_127405452912 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8980;

    public MeetingVO_getUpdateTime_127405452912() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term8981 = new Integer(1241164745);
        Integer term9019 = new Integer(1723148410);
        Integer term9079 = new Integer(-920797484);
        Integer term9091 = new Integer(-1631697577);
        Integer term9093 = new Integer(765731371);
        term8980 = newInstance(Class.forName("com.org.model.vo.MeetingVO"));
        Object term9021 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term9022 = newInstance(Class.forName("java.time.LocalDate"));
        Object term9026 = newInstance(Class.forName("java.time.LocalTime"));
        Object term9081 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term9082 = newInstance(Class.forName("java.time.LocalDate"));
        Object term9086 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term8980, term8980.getClass(), "id", term8981);
        setField(term8980, term8980.getClass(), "name", "aDhkmoCCUK");
        setField(term8980, term8980.getClass(), "host", "ibnuoVVkVm");
        setField(term8980, term8980.getClass(), "roomName", "mXVgkxjTjD");
        setField(term8980, term8980.getClass(), "online", term9019);
        setIntField(term9022, term9022.getClass(), "year", 2010);
        setShortField(term9022, term9022.getClass(), "month", (short) 9);
        setShortField(term9022, term9022.getClass(), "day", (short) 28);
        setField(term9021, term9021.getClass(), "date", term9022);
        setByteField(term9026, term9026.getClass(), "hour", (byte) 6);
        setByteField(term9026, term9026.getClass(), "minute", (byte) 4);
        setByteField(term9026, term9026.getClass(), "second", (byte) 54);
        setIntField(term9026, term9026.getClass(), "nano", 604713782);
        setField(term9021, term9021.getClass(), "time", term9026);
        setField(term8980, term8980.getClass(), "createTime", term9021);
        setField(term8980, term8980.getClass(), "link", "qodBmKUkev");
        setField(term8980, term8980.getClass(), "meetingTime", "QJuqwUQEyr");
        setField(term8980, term8980.getClass(), "signTime", "qqUAzxxpNB");
        setField(term8980, term8980.getClass(), "introduce", "WqaQxuPbzr");
        setField(term8980, term8980.getClass(), "state", term9079);
        setIntField(term9082, term9082.getClass(), "year", 2023);
        setShortField(term9082, term9082.getClass(), "month", (short) 7);
        setShortField(term9082, term9082.getClass(), "day", (short) 16);
        setField(term9081, term9081.getClass(), "date", term9082);
        setByteField(term9086, term9086.getClass(), "hour", (byte) 3);
        setByteField(term9086, term9086.getClass(), "minute", (byte) 1);
        setByteField(term9086, term9086.getClass(), "second", (byte) 19);
        setIntField(term9086, term9086.getClass(), "nano", 488629554);
        setField(term9081, term9081.getClass(), "time", term9086);
        setField(term8980, term8980.getClass(), "updateTime", term9081);
        setField(term8980, term8980.getClass(), "userNumber", term9091);
        setField(term8980, term8980.getClass(), "signNumber", term9093);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.vo.MeetingVO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUpdateTime", argTypes, term8980, args);
    }

};


