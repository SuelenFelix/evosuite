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

public class FileDTO_setPath_94338793517 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23716;

    public FileDTO_setPath_94338793517() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term23717 = new Long(-8211859616692114655L);
        Long term23719 = new Long(7487838449539103993L);
        Class<? extends Object> term23837 = Class.forName((String) "net.jaggerwang.sbip.entity.FileBO$Region");
        Field term23836 = ((Class) term23837).getDeclaredField((String) "LOCAL");
        ((Field) term23836).setAccessible(true);
        Object enum46 = ((Field) term23836).get((Object) null);
        Long term23767 = new Long(7010148136855890340L);
        HashMap term23813 = new HashMap();
        term23716 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.FileDTO"));
        Object term23754 = newInstance(Class.forName("net.jaggerwang.sbip.entity.FileBO$Meta"));
        Object term23781 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term23782 = newInstance(Class.forName("java.time.LocalDate"));
        Object term23786 = newInstance(Class.forName("java.time.LocalTime"));
        Object term23791 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term23792 = newInstance(Class.forName("java.time.LocalDate"));
        Object term23796 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term23716, term23716.getClass(), "id", term23717);
        setField(term23716, term23716.getClass(), "userId", term23719);
        setField(term23716, term23716.getClass(), "region", enum46);
        setField(term23716, term23716.getClass(), "bucket", "UDlkdccCRn");
        setField(term23716, term23716.getClass(), "path", "McpzErOcYb");
        setField(term23754, term23754.getClass(), "name", "jqrVEUvYEz");
        setField(term23754, term23754.getClass(), "size", term23767);
        setField(term23754, term23754.getClass(), "type", "QITgiBrmfj");
        setField(term23716, term23716.getClass(), "meta", term23754);
        setIntField(term23782, term23782.getClass(), "year", 2011);
        setShortField(term23782, term23782.getClass(), "month", (short) 9);
        setShortField(term23782, term23782.getClass(), "day", (short) 7);
        setField(term23781, term23781.getClass(), "date", term23782);
        setByteField(term23786, term23786.getClass(), "hour", (byte) 0);
        setByteField(term23786, term23786.getClass(), "minute", (byte) 51);
        setByteField(term23786, term23786.getClass(), "second", (byte) 44);
        setIntField(term23786, term23786.getClass(), "nano", 245610060);
        setField(term23781, term23781.getClass(), "time", term23786);
        setField(term23716, term23716.getClass(), "createdAt", term23781);
        setIntField(term23792, term23792.getClass(), "year", 2018);
        setShortField(term23792, term23792.getClass(), "month", (short) 1);
        setShortField(term23792, term23792.getClass(), "day", (short) 29);
        setField(term23791, term23791.getClass(), "date", term23792);
        setByteField(term23796, term23796.getClass(), "hour", (byte) 22);
        setByteField(term23796, term23796.getClass(), "minute", (byte) 20);
        setByteField(term23796, term23796.getClass(), "second", (byte) 36);
        setIntField(term23796, term23796.getClass(), "nano", 74678080);
        setField(term23791, term23791.getClass(), "time", term23796);
        setField(term23716, term23716.getClass(), "updatedAt", term23791);
        setField(term23716, term23716.getClass(), "url", "pXxkiXgQnq");
        setField(term23716, term23716.getClass(), "thumbs", term23813);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.FileDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "JeZbrwZmsP";
        callMethod(klass, "setPath", argTypes, term23716, args);
    }

};


