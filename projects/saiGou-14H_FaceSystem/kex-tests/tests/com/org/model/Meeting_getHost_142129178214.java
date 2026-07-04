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

public class Meeting_getHost_142129178214 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28909;

    public Meeting_getHost_142129178214() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term28910 = new Integer(1810292112);
        Integer term28992 = new Integer(385619995);
        Integer term28994 = new Integer(-920852160);
        Integer term29009 = new Integer(-1975385844);
        term28909 = newInstance(Class.forName("com.org.model.Meeting"));
        Object term28912 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term28913 = newInstance(Class.forName("java.time.LocalDate"));
        Object term28917 = newInstance(Class.forName("java.time.LocalTime"));
        Object term28958 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term28959 = newInstance(Class.forName("java.time.LocalDate"));
        Object term28963 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term28909, term28909.getClass(), "id", term28910);
        setIntField(term28913, term28913.getClass(), "year", 2015);
        setShortField(term28913, term28913.getClass(), "month", (short) 6);
        setShortField(term28913, term28913.getClass(), "day", (short) 1);
        setField(term28912, term28912.getClass(), "date", term28913);
        setByteField(term28917, term28917.getClass(), "hour", (byte) 5);
        setByteField(term28917, term28917.getClass(), "minute", (byte) 44);
        setByteField(term28917, term28917.getClass(), "second", (byte) 48);
        setIntField(term28917, term28917.getClass(), "nano", 654356179);
        setField(term28912, term28912.getClass(), "time", term28917);
        setField(term28909, term28909.getClass(), "createTime", term28912);
        setField(term28909, term28909.getClass(), "name", "yRTLQJvUab");
        setField(term28909, term28909.getClass(), "link", "uSsBnPkCNa");
        setField(term28909, term28909.getClass(), "introduce", "hGeOoQaXwC");
        setIntField(term28959, term28959.getClass(), "year", 2027);
        setShortField(term28959, term28959.getClass(), "month", (short) 10);
        setShortField(term28959, term28959.getClass(), "day", (short) 12);
        setField(term28958, term28958.getClass(), "date", term28959);
        setByteField(term28963, term28963.getClass(), "hour", (byte) 16);
        setByteField(term28963, term28963.getClass(), "minute", (byte) 59);
        setByteField(term28963, term28963.getClass(), "second", (byte) 46);
        setIntField(term28963, term28963.getClass(), "nano", 525561936);
        setField(term28958, term28958.getClass(), "time", term28963);
        setField(term28909, term28909.getClass(), "updateTime", term28958);
        setField(term28909, term28909.getClass(), "meetingTime", "ualEpwAGnm");
        setField(term28909, term28909.getClass(), "signTime", "xYlQMsdTSy");
        setField(term28909, term28909.getClass(), "signNumber", term28992);
        setField(term28909, term28909.getClass(), "userNumber", term28994);
        setField(term28909, term28909.getClass(), "fileUrl", "bCuxURZPHN");
        setBooleanField(term28909, term28909.getClass(), "online", true);
        setField(term28909, term28909.getClass(), "deleted", term29009);
        setField(term28909, term28909.getClass(), "host", "gHeEnrQkug");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.Meeting");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getHost", argTypes, term28909, args);
    }

};


