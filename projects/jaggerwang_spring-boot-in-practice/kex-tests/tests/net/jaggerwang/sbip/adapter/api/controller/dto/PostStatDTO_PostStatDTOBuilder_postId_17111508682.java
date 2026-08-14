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
import java.lang.Object;

public class PostStatDTO_PostStatDTOBuilder_postId_17111508682 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term58323;
     Object term58350;

    public PostStatDTO_PostStatDTOBuilder_postId_17111508682() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term58324 = new Long(-7779928833373989299L);
        Long term58326 = new Long(2105697925603985714L);
        Long term58328 = new Long(-589167249491619196L);
        term58323 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.PostStatDTO$PostStatDTOBuilder"));
        Object term58330 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term58331 = newInstance(Class.forName("java.time.LocalDate"));
        Object term58335 = newInstance(Class.forName("java.time.LocalTime"));
        Object term58340 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term58341 = newInstance(Class.forName("java.time.LocalDate"));
        Object term58345 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term58323, term58323.getClass(), "id", term58324);
        setField(term58323, term58323.getClass(), "postId", term58326);
        setField(term58323, term58323.getClass(), "likeCount", term58328);
        setIntField(term58331, term58331.getClass(), "year", 2014);
        setShortField(term58331, term58331.getClass(), "month", (short) 9);
        setShortField(term58331, term58331.getClass(), "day", (short) 26);
        setField(term58330, term58330.getClass(), "date", term58331);
        setByteField(term58335, term58335.getClass(), "hour", (byte) 5);
        setByteField(term58335, term58335.getClass(), "minute", (byte) 40);
        setByteField(term58335, term58335.getClass(), "second", (byte) 6);
        setIntField(term58335, term58335.getClass(), "nano", 923937756);
        setField(term58330, term58330.getClass(), "time", term58335);
        setField(term58323, term58323.getClass(), "createdAt", term58330);
        setIntField(term58341, term58341.getClass(), "year", 2023);
        setShortField(term58341, term58341.getClass(), "month", (short) 8);
        setShortField(term58341, term58341.getClass(), "day", (short) 18);
        setField(term58340, term58340.getClass(), "date", term58341);
        setByteField(term58345, term58345.getClass(), "hour", (byte) 14);
        setByteField(term58345, term58345.getClass(), "minute", (byte) 2);
        setByteField(term58345, term58345.getClass(), "second", (byte) 54);
        setIntField(term58345, term58345.getClass(), "nano", 97633516);
        setField(term58340, term58340.getClass(), "time", term58345);
        setField(term58323, term58323.getClass(), "updatedAt", term58340);
        term58350 = new Long(5990686118620195001L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.PostStatDTO$PostStatDTOBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term58350;
        callMethod(klass, "postId", argTypes, term58323, args);
    }

};


