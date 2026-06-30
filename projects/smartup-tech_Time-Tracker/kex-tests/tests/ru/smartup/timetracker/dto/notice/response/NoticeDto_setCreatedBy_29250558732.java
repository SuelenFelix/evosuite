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
import java.lang.Integer;

public class NoticeDto_setCreatedBy_29250558732 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8079;
     Object term8083;

    public NoticeDto_setCreatedBy_29250558732() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8079 = newInstance(Class.forName("ru.smartup.timetracker.dto.notice.response.NoticeDto"));
        setLongField(term8079, term8079.getClass(), "id", 0L);
        setField(term8079, term8079.getClass(), "type", null);
        setField(term8079, term8079.getClass(), "text", null);
        setField(term8079, term8079.getClass(), "data", null);
        setBooleanField(term8079, term8079.getClass(), "read", false);
        setIntField(term8079, term8079.getClass(), "createdBy", 0);
        setField(term8079, term8079.getClass(), "createdDate", null);
        term8083 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.notice.response.NoticeDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term8083;
        callMethod(klass, "setCreatedBy", argTypes, term8079, args);
    }

};


