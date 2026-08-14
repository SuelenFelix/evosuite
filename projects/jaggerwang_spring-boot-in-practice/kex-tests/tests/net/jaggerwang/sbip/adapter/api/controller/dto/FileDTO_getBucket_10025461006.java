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

public class FileDTO_getBucket_10025461006 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19510;

    public FileDTO_getBucket_10025461006() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term19511 = new Long(1353683663053784647L);
        Long term19513 = new Long(-1465819833800717311L);
        Class<? extends Object> term19619 = Class.forName((String) "net.jaggerwang.sbip.entity.FileBO$Region");
        Field term19618 = ((Class) term19619).getDeclaredField((String) "LOCAL");
        ((Field) term19618).setAccessible(true);
        Object enum35 = ((Field) term19618).get((Object) null);
        Long term19561 = new Long(-8306611953768020559L);
        HashMap term19607 = new HashMap();
        term19510 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.FileDTO"));
        Object term19548 = newInstance(Class.forName("net.jaggerwang.sbip.entity.FileBO$Meta"));
        Object term19575 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term19576 = newInstance(Class.forName("java.time.LocalDate"));
        Object term19580 = newInstance(Class.forName("java.time.LocalTime"));
        Object term19585 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term19586 = newInstance(Class.forName("java.time.LocalDate"));
        Object term19590 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term19510, term19510.getClass(), "id", term19511);
        setField(term19510, term19510.getClass(), "userId", term19513);
        setField(term19510, term19510.getClass(), "region", enum35);
        setField(term19510, term19510.getClass(), "bucket", "TjWpyghUWN");
        setField(term19510, term19510.getClass(), "path", "dkZFDZxcde");
        setField(term19548, term19548.getClass(), "name", "WXcZEtUKlI");
        setField(term19548, term19548.getClass(), "size", term19561);
        setField(term19548, term19548.getClass(), "type", "IkpjUOuWQU");
        setField(term19510, term19510.getClass(), "meta", term19548);
        setIntField(term19576, term19576.getClass(), "year", 2020);
        setShortField(term19576, term19576.getClass(), "month", (short) 1);
        setShortField(term19576, term19576.getClass(), "day", (short) 23);
        setField(term19575, term19575.getClass(), "date", term19576);
        setByteField(term19580, term19580.getClass(), "hour", (byte) 17);
        setByteField(term19580, term19580.getClass(), "minute", (byte) 24);
        setByteField(term19580, term19580.getClass(), "second", (byte) 54);
        setIntField(term19580, term19580.getClass(), "nano", 261767355);
        setField(term19575, term19575.getClass(), "time", term19580);
        setField(term19510, term19510.getClass(), "createdAt", term19575);
        setIntField(term19586, term19586.getClass(), "year", 2011);
        setShortField(term19586, term19586.getClass(), "month", (short) 1);
        setShortField(term19586, term19586.getClass(), "day", (short) 20);
        setField(term19585, term19585.getClass(), "date", term19586);
        setByteField(term19590, term19590.getClass(), "hour", (byte) 5);
        setByteField(term19590, term19590.getClass(), "minute", (byte) 23);
        setByteField(term19590, term19590.getClass(), "second", (byte) 54);
        setIntField(term19590, term19590.getClass(), "nano", 4207750);
        setField(term19585, term19585.getClass(), "time", term19590);
        setField(term19510, term19510.getClass(), "updatedAt", term19585);
        setField(term19510, term19510.getClass(), "url", "boSSpezHeU");
        setField(term19510, term19510.getClass(), "thumbs", term19607);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.FileDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBucket", argTypes, term19510, args);
    }

};


