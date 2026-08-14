package net.jaggerwang.sbip.entity;

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
import static net.jaggerwang.sbip.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.String;
import java.lang.Object;
import java.util.ArrayList;

public class PostBO_getText_21456686554 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14160;

    public PostBO_getText_21456686554() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term14161 = new Long(5184635470881147510L);
        Long term14163 = new Long(918397384129253729L);
        Class<? extends Object> term14215 = Class.forName((String) "net.jaggerwang.sbip.entity.PostBO$Type");
        Field term14214 = ((Class) term14215).getDeclaredField((String) "VIDEO");
        ((Field) term14214).setAccessible(true);
        Object enum36 = ((Field) term14214).get((Object) null);
        Long term14188 = new Long(-2187638136407967948L);
        ArrayList term14186 = new ArrayList();
        ((ArrayList) term14186).add(term14188);
        Long term14192 = new Long(8708846223293804408L);
        term14160 = newInstance(Class.forName("net.jaggerwang.sbip.entity.PostBO"));
        Object term14194 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term14195 = newInstance(Class.forName("java.time.LocalDate"));
        Object term14199 = newInstance(Class.forName("java.time.LocalTime"));
        Object term14204 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term14205 = newInstance(Class.forName("java.time.LocalDate"));
        Object term14209 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term14160, term14160.getClass(), "id", term14161);
        setField(term14160, term14160.getClass(), "userId", term14163);
        setField(term14160, term14160.getClass(), "type", enum36);
        setField(term14160, term14160.getClass(), "text", "VeDtgDzGAN");
        setField(term14160, term14160.getClass(), "imageIds", term14186);
        setField(term14160, term14160.getClass(), "videoId", term14192);
        setIntField(term14195, term14195.getClass(), "year", 2010);
        setShortField(term14195, term14195.getClass(), "month", (short) 3);
        setShortField(term14195, term14195.getClass(), "day", (short) 11);
        setField(term14194, term14194.getClass(), "date", term14195);
        setByteField(term14199, term14199.getClass(), "hour", (byte) 0);
        setByteField(term14199, term14199.getClass(), "minute", (byte) 21);
        setByteField(term14199, term14199.getClass(), "second", (byte) 25);
        setIntField(term14199, term14199.getClass(), "nano", 201315999);
        setField(term14194, term14194.getClass(), "time", term14199);
        setField(term14160, term14160.getClass(), "createdAt", term14194);
        setIntField(term14205, term14205.getClass(), "year", 2016);
        setShortField(term14205, term14205.getClass(), "month", (short) 8);
        setShortField(term14205, term14205.getClass(), "day", (short) 24);
        setField(term14204, term14204.getClass(), "date", term14205);
        setByteField(term14209, term14209.getClass(), "hour", (byte) 22);
        setByteField(term14209, term14209.getClass(), "minute", (byte) 25);
        setByteField(term14209, term14209.getClass(), "second", (byte) 3);
        setIntField(term14209, term14209.getClass(), "nano", 185613519);
        setField(term14204, term14204.getClass(), "time", term14209);
        setField(term14160, term14160.getClass(), "updatedAt", term14204);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.entity.PostBO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getText", argTypes, term14160, args);
    }

};


