package net.jaggerwang.sbip.adapter.api.controller.dto;

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
import static net.jaggerwang.sbip.adapter.api.controller.dto.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.String;
import java.lang.Object;
import java.util.HashMap;

public class FileDTO_FileDTOBuilder_toString_209757589212 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57530;

    public FileDTO_FileDTOBuilder_toString_209757589212() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term57531 = new Long(-5187796980288712037L);
        Long term57533 = new Long(238025331923627916L);
        Class<? extends Object> term57639 = Class.forName((String) "net.jaggerwang.sbip.entity.FileBO$Region");
        Field term57638 = ((Class) term57639).getDeclaredField((String) "LOCAL");
        ((Field) term57638).setAccessible(true);
        Object enum113 = ((Field) term57638).get((Object) null);
        Long term57581 = new Long(-6163417416099720642L);
        HashMap term57627 = new HashMap();
        term57530 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.FileDTO$FileDTOBuilder"));
        Object term57568 = newInstance(Class.forName("net.jaggerwang.sbip.entity.FileBO$Meta"));
        Object term57595 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term57596 = newInstance(Class.forName("java.time.LocalDate"));
        Object term57600 = newInstance(Class.forName("java.time.LocalTime"));
        Object term57605 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term57606 = newInstance(Class.forName("java.time.LocalDate"));
        Object term57610 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term57530, term57530.getClass(), "id", term57531);
        setField(term57530, term57530.getClass(), "userId", term57533);
        setField(term57530, term57530.getClass(), "region", enum113);
        setField(term57530, term57530.getClass(), "bucket", "ywoADeiUfF");
        setField(term57530, term57530.getClass(), "path", "loHiudJxbt");
        setField(term57568, term57568.getClass(), "name", "lRbxbybNew");
        setField(term57568, term57568.getClass(), "size", term57581);
        setField(term57568, term57568.getClass(), "type", "WzGudiEARD");
        setField(term57530, term57530.getClass(), "meta", term57568);
        setIntField(term57596, term57596.getClass(), "year", 2028);
        setShortField(term57596, term57596.getClass(), "month", (short) 7);
        setShortField(term57596, term57596.getClass(), "day", (short) 24);
        setField(term57595, term57595.getClass(), "date", term57596);
        setByteField(term57600, term57600.getClass(), "hour", (byte) 11);
        setByteField(term57600, term57600.getClass(), "minute", (byte) 2);
        setByteField(term57600, term57600.getClass(), "second", (byte) 47);
        setIntField(term57600, term57600.getClass(), "nano", 875421060);
        setField(term57595, term57595.getClass(), "time", term57600);
        setField(term57530, term57530.getClass(), "createdAt", term57595);
        setIntField(term57606, term57606.getClass(), "year", 2029);
        setShortField(term57606, term57606.getClass(), "month", (short) 12);
        setShortField(term57606, term57606.getClass(), "day", (short) 20);
        setField(term57605, term57605.getClass(), "date", term57606);
        setByteField(term57610, term57610.getClass(), "hour", (byte) 3);
        setByteField(term57610, term57610.getClass(), "minute", (byte) 1);
        setByteField(term57610, term57610.getClass(), "second", (byte) 52);
        setIntField(term57610, term57610.getClass(), "nano", 833458434);
        setField(term57605, term57605.getClass(), "time", term57610);
        setField(term57530, term57530.getClass(), "updatedAt", term57605);
        setField(term57530, term57530.getClass(), "url", "IoefPqGtaj");
        setField(term57530, term57530.getClass(), "thumbs", term57627);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.FileDTO$FileDTOBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term57530, args);
    }

};


