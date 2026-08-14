package net.jaggerwang.sbip.adapter.dao.jpa.entity;

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
import static net.jaggerwang.sbip.adapter.dao.jpa.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.String;
import java.lang.Object;
import java.util.ArrayList;

public class Post_fromBO_1180856980 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4508;

    public Post_fromBO_1180856980() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4509 = new Long(-7884871963229073324L);
        Long term4511 = new Long(-8649738738252714180L);
        Class<? extends Object> term4597 = Class.forName((String) "net.jaggerwang.sbip.entity.PostBO$Type");
        Field term4596 = ((Class) term4597).getDeclaredField((String) "IMAGE");
        ((Field) term4596).setAccessible(true);
        Object enum10 = ((Field) term4596).get((Object) null);
        Long term4536 = new Long(-7278883608542636188L);
        Long term4538 = new Long(-1539859611880912454L);
        Long term4540 = new Long(4100236067313034103L);
        Long term4542 = new Long(1195529027276497124L);
        Long term4544 = new Long(-2783999800714825789L);
        ArrayList term4534 = new ArrayList();
        ((ArrayList) term4534).add(term4536);
        ((ArrayList) term4534).add(term4538);
        ((ArrayList) term4534).add(term4540);
        ((ArrayList) term4534).add(term4542);
        ((ArrayList) term4534).add(term4544);
        Long term4548 = new Long(4266570509071948633L);
        term4508 = newInstance(Class.forName("net.jaggerwang.sbip.entity.PostBO"));
        Object term4550 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4551 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4555 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4560 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4561 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4565 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term4508, term4508.getClass(), "id", term4509);
        setField(term4508, term4508.getClass(), "userId", term4511);
        setField(term4508, term4508.getClass(), "type", enum10);
        setField(term4508, term4508.getClass(), "text", "BndsHwAFMv");
        setField(term4508, term4508.getClass(), "imageIds", term4534);
        setField(term4508, term4508.getClass(), "videoId", term4548);
        setIntField(term4551, term4551.getClass(), "year", 2021);
        setShortField(term4551, term4551.getClass(), "month", (short) 3);
        setShortField(term4551, term4551.getClass(), "day", (short) 13);
        setField(term4550, term4550.getClass(), "date", term4551);
        setByteField(term4555, term4555.getClass(), "hour", (byte) 6);
        setByteField(term4555, term4555.getClass(), "minute", (byte) 25);
        setByteField(term4555, term4555.getClass(), "second", (byte) 42);
        setIntField(term4555, term4555.getClass(), "nano", 282924199);
        setField(term4550, term4550.getClass(), "time", term4555);
        setField(term4508, term4508.getClass(), "createdAt", term4550);
        setIntField(term4561, term4561.getClass(), "year", 2020);
        setShortField(term4561, term4561.getClass(), "month", (short) 10);
        setShortField(term4561, term4561.getClass(), "day", (short) 25);
        setField(term4560, term4560.getClass(), "date", term4561);
        setByteField(term4565, term4565.getClass(), "hour", (byte) 18);
        setByteField(term4565, term4565.getClass(), "minute", (byte) 22);
        setByteField(term4565, term4565.getClass(), "second", (byte) 30);
        setIntField(term4565, term4565.getClass(), "nano", 948592965);
        setField(term4560, term4560.getClass(), "time", term4565);
        setField(term4508, term4508.getClass(), "updatedAt", term4560);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.Post");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("net.jaggerwang.sbip.entity.PostBO");
        Object[] args = new Object[1];
        args[0] = term4508;
        callMethod(klass, "fromBO", argTypes, null, args);
    }

};


