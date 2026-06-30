package ru.smartup.timetracker.dto.notice;

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
import static ru.smartup.timetracker.dto.notice.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class NoticeCreationDto_hashCode_169491549012 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16999;

    public NoticeCreationDto_hashCode_169491549012() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term17034 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.NoticeTypeEnum");
        Field term17033 = ((Class) term17034).getDeclaredField((String) "PASSWORD_UPDATE");
        ((Field) term17033).setAccessible(true);
        Object enum40 = ((Field) term17033).get((Object) null);
        term16999 = newInstance(Class.forName("ru.smartup.timetracker.dto.notice.NoticeCreationDto"));
        Object term17031 = newInstance(Class.forName("java.lang.Object"));
        setField(term16999, term16999.getClass(), "type", enum40);
        setField(term16999, term16999.getClass(), "text", "aKnKipADSo");
        setField(term16999, term16999.getClass(), "data", term17031);
        setIntField(term16999, term16999.getClass(), "createdBy", -93135961);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.notice.NoticeCreationDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term16999, args);
    }

};


