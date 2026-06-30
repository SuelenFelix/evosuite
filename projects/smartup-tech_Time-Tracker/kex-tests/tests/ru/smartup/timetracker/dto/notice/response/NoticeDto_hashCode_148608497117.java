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

public class NoticeDto_hashCode_148608497117 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7231;

    public NoticeDto_hashCode_148608497117() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term7270 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.NoticeTypeEnum");
        Field term7269 = ((Class) term7270).getDeclaredField((String) "PASSWORD_RESET");
        ((Field) term7269).setAccessible(true);
        Object enum17 = ((Field) term7269).get((Object) null);
        term7231 = newInstance(Class.forName("ru.smartup.timetracker.dto.notice.response.NoticeDto"));
        Object term7263 = newInstance(Class.forName("java.lang.Object"));
        Object term7266 = newInstance(Class.forName("java.sql.Timestamp"));
        setLongField(term7231, term7231.getClass(), "id", 5127676408959197577L);
        setField(term7231, term7231.getClass(), "type", enum17);
        setField(term7231, term7231.getClass(), "text", "tbcdzjIfER");
        setField(term7231, term7231.getClass(), "data", term7263);
        setBooleanField(term7231, term7231.getClass(), "read", true);
        setIntField(term7231, term7231.getClass(), "createdBy", -602026508);
        setIntField(term7266, term7266.getClass(), "nanos", 580000000);
        setLongField(term7266, term7266.getClass(), "fastTime", 1437746523000L);
        setField(term7266, term7266.getClass(), "cdate", null);
        setField(term7231, term7231.getClass(), "createdDate", term7266);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.notice.response.NoticeDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term7231, args);
    }

};


