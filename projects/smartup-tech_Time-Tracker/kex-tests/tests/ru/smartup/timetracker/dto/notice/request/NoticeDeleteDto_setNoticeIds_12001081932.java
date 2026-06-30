package ru.smartup.timetracker.dto.notice.request;

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
import static ru.smartup.timetracker.dto.notice.request.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.util.Map;
import java.lang.Object;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class NoticeDeleteDto_setNoticeIds_12001081932 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term173;
     Object term217;

    public NoticeDeleteDto_setNoticeIds_12001081932() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term175 = new HashMap();
        Set<Object> term223 =  ((Map) term175).keySet();
        HashSet term174 = new HashSet((Collection<? extends Object>) term223);
        term173 = newInstance(Class.forName("ru.smartup.timetracker.dto.notice.request.NoticeDeleteDto"));
        setField(term173, term173.getClass(), "noticeIds", term174);
        HashMap term218 = new HashMap();
        Set<Object> term224 =  ((Map) term218).keySet();
        term217 = new HashSet((Collection<? extends Object>) term224);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.notice.request.NoticeDeleteDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Set");
        Object[] args = new Object[1];
        args[0] = term217;
        callMethod(klass, "setNoticeIds", argTypes, term173, args);
    }

};


