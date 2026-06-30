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

public class NoticeCreationDto_NoticeCreationDtoBuilder_data_2823445683 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2412;
     Object term2444;

    public NoticeCreationDto_NoticeCreationDtoBuilder_data_2823445683() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2446 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.NoticeTypeEnum");
        Field term2445 = ((Class) term2446).getDeclaredField((String) "ADMIN_REMOVED");
        ((Field) term2445).setAccessible(true);
        Object enum5 = ((Field) term2445).get((Object) null);
        term2412 = newInstance(Class.forName("ru.smartup.timetracker.dto.notice.NoticeCreationDto$NoticeCreationDtoBuilder"));
        Object term2442 = newInstance(Class.forName("java.lang.Object"));
        setField(term2412, term2412.getClass(), "type", enum5);
        setField(term2412, term2412.getClass(), "text", "jJCZpVmanW");
        setField(term2412, term2412.getClass(), "data", term2442);
        setIntField(term2412, term2412.getClass(), "createdBy", 1484323161);
        term2444 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.notice.NoticeCreationDto$NoticeCreationDtoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term2444;
        callMethod(klass, "data", argTypes, term2412, args);
    }

};


