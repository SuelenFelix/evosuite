package ru.smartup.timetracker.dto.notice.response;

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
import static ru.smartup.timetracker.dto.notice.response.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class NoticeDto_getCreatedBy_147560336325 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8047;

    public NoticeDto_getCreatedBy_147560336325() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8047 = newInstance(Class.forName("ru.smartup.timetracker.dto.notice.response.NoticeDto"));
        setLongField(term8047, term8047.getClass(), "id", 0L);
        setField(term8047, term8047.getClass(), "type", null);
        setField(term8047, term8047.getClass(), "text", null);
        setField(term8047, term8047.getClass(), "data", null);
        setBooleanField(term8047, term8047.getClass(), "read", false);
        setIntField(term8047, term8047.getClass(), "createdBy", 0);
        setField(term8047, term8047.getClass(), "createdDate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.notice.response.NoticeDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCreatedBy", argTypes, term8047, args);
    }

};


