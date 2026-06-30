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

public class NoticeDto_getId_176411899720 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8027;

    public NoticeDto_getId_176411899720() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8027 = newInstance(Class.forName("ru.smartup.timetracker.dto.notice.response.NoticeDto"));
        setLongField(term8027, term8027.getClass(), "id", 0L);
        setField(term8027, term8027.getClass(), "type", null);
        setField(term8027, term8027.getClass(), "text", null);
        setField(term8027, term8027.getClass(), "data", null);
        setBooleanField(term8027, term8027.getClass(), "read", false);
        setIntField(term8027, term8027.getClass(), "createdBy", 0);
        setField(term8027, term8027.getClass(), "createdDate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.notice.response.NoticeDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term8027, args);
    }

};


