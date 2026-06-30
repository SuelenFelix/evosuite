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

public class NoticeDto_hashCode_148608497136 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8097;

    public NoticeDto_hashCode_148608497136() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8097 = newInstance(Class.forName("ru.smartup.timetracker.dto.notice.response.NoticeDto"));
        setLongField(term8097, term8097.getClass(), "id", 0L);
        setField(term8097, term8097.getClass(), "type", null);
        setField(term8097, term8097.getClass(), "text", null);
        setField(term8097, term8097.getClass(), "data", null);
        setBooleanField(term8097, term8097.getClass(), "read", false);
        setIntField(term8097, term8097.getClass(), "createdBy", 0);
        setField(term8097, term8097.getClass(), "createdDate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.notice.response.NoticeDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term8097, args);
    }

};


