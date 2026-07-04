package com.org.model;

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
import static com.org.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Object;

public class Meeting_canEqual_18034367030 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32038;
     Object term32152;

    public Meeting_canEqual_18034367030() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term32039 = new Integer(1045689376);
        Integer term32121 = new Integer(767458787);
        Integer term32123 = new Integer(2103721338);
        Integer term32138 = new Integer(621330308);
        term32038 = newInstance(Class.forName("com.org.model.Meeting"));
        Object term32041 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term32042 = newInstance(Class.forName("java.time.LocalDate"));
        Object term32046 = newInstance(Class.forName("java.time.LocalTime"));
        Object term32087 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term32088 = newInstance(Class.forName("java.time.LocalDate"));
        Object term32092 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term32038, term32038.getClass(), "id", term32039);
        setIntField(term32042, term32042.getClass(), "year", 2010);
        setShortField(term32042, term32042.getClass(), "month", (short) 3);
        setShortField(term32042, term32042.getClass(), "day", (short) 19);
        setField(term32041, term32041.getClass(), "date", term32042);
        setByteField(term32046, term32046.getClass(), "hour", (byte) 8);
        setByteField(term32046, term32046.getClass(), "minute", (byte) 38);
        setByteField(term32046, term32046.getClass(), "second", (byte) 34);
        setIntField(term32046, term32046.getClass(), "nano", 473897267);
        setField(term32041, term32041.getClass(), "time", term32046);
        setField(term32038, term32038.getClass(), "createTime", term32041);
        setField(term32038, term32038.getClass(), "name", "KicaFputVc");
        setField(term32038, term32038.getClass(), "link", "LTKjLSGpcQ");
        setField(term32038, term32038.getClass(), "introduce", "aTxAeHZsQJ");
        setIntField(term32088, term32088.getClass(), "year", 2023);
        setShortField(term32088, term32088.getClass(), "month", (short) 3);
        setShortField(term32088, term32088.getClass(), "day", (short) 17);
        setField(term32087, term32087.getClass(), "date", term32088);
        setByteField(term32092, term32092.getClass(), "hour", (byte) 13);
        setByteField(term32092, term32092.getClass(), "minute", (byte) 18);
        setByteField(term32092, term32092.getClass(), "second", (byte) 12);
        setIntField(term32092, term32092.getClass(), "nano", 422255508);
        setField(term32087, term32087.getClass(), "time", term32092);
        setField(term32038, term32038.getClass(), "updateTime", term32087);
        setField(term32038, term32038.getClass(), "meetingTime", "VeVoOlkaSZ");
        setField(term32038, term32038.getClass(), "signTime", "wdxwtYvPiv");
        setField(term32038, term32038.getClass(), "signNumber", term32121);
        setField(term32038, term32038.getClass(), "userNumber", term32123);
        setField(term32038, term32038.getClass(), "fileUrl", "xUmjORhtNm");
        setBooleanField(term32038, term32038.getClass(), "online", false);
        setField(term32038, term32038.getClass(), "deleted", term32138);
        setField(term32038, term32038.getClass(), "host", "aAllLDsbll");
        term32152 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.Meeting");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term32152;
        callMethod(klass, "canEqual", argTypes, term32038, args);
    }

};


