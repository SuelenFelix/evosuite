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
import java.lang.String;
import java.lang.Object;

public class NoticeDto_equals_103739829615 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6401;
     Object term6442;

    public NoticeDto_equals_103739829615() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term6444 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.NoticeTypeEnum");
        Field term6443 = ((Class) term6444).getDeclaredField((String) "APPROVAL_REQUIRED");
        ((Field) term6443).setAccessible(true);
        Object enum15 = ((Field) term6443).get((Object) null);
        term6401 = newInstance(Class.forName("ru.smartup.timetracker.dto.notice.response.NoticeDto"));
        Object term6436 = newInstance(Class.forName("java.lang.Object"));
        Object term6439 = newInstance(Class.forName("java.sql.Timestamp"));
        setLongField(term6401, term6401.getClass(), "id", -872011222785455006L);
        setField(term6401, term6401.getClass(), "type", enum15);
        setField(term6401, term6401.getClass(), "text", "aJlieCFVtF");
        setField(term6401, term6401.getClass(), "data", term6436);
        setBooleanField(term6401, term6401.getClass(), "read", false);
        setIntField(term6401, term6401.getClass(), "createdBy", 1962444399);
        setIntField(term6439, term6439.getClass(), "nanos", 992000000);
        setLongField(term6439, term6439.getClass(), "fastTime", 1863620294000L);
        setField(term6439, term6439.getClass(), "cdate", null);
        setField(term6401, term6401.getClass(), "createdDate", term6439);
        term6442 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.notice.response.NoticeDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term6442;
        callMethod(klass, "equals", argTypes, term6401, args);
    }

};


