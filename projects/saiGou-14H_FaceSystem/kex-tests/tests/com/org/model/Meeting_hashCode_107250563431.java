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

public class Meeting_hashCode_107250563431 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32223;

    public Meeting_hashCode_107250563431() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term32224 = new Integer(-1597424060);
        Integer term32306 = new Integer(243854303);
        Integer term32308 = new Integer(1754709105);
        Integer term32323 = new Integer(1523196898);
        term32223 = newInstance(Class.forName("com.org.model.Meeting"));
        Object term32226 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term32227 = newInstance(Class.forName("java.time.LocalDate"));
        Object term32231 = newInstance(Class.forName("java.time.LocalTime"));
        Object term32272 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term32273 = newInstance(Class.forName("java.time.LocalDate"));
        Object term32277 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term32223, term32223.getClass(), "id", term32224);
        setIntField(term32227, term32227.getClass(), "year", 2017);
        setShortField(term32227, term32227.getClass(), "month", (short) 10);
        setShortField(term32227, term32227.getClass(), "day", (short) 2);
        setField(term32226, term32226.getClass(), "date", term32227);
        setByteField(term32231, term32231.getClass(), "hour", (byte) 4);
        setByteField(term32231, term32231.getClass(), "minute", (byte) 40);
        setByteField(term32231, term32231.getClass(), "second", (byte) 56);
        setIntField(term32231, term32231.getClass(), "nano", 701221907);
        setField(term32226, term32226.getClass(), "time", term32231);
        setField(term32223, term32223.getClass(), "createTime", term32226);
        setField(term32223, term32223.getClass(), "name", "tATJNkymBw");
        setField(term32223, term32223.getClass(), "link", "bkSURJdLBL");
        setField(term32223, term32223.getClass(), "introduce", "aNcXIRUToO");
        setIntField(term32273, term32273.getClass(), "year", 2017);
        setShortField(term32273, term32273.getClass(), "month", (short) 8);
        setShortField(term32273, term32273.getClass(), "day", (short) 6);
        setField(term32272, term32272.getClass(), "date", term32273);
        setByteField(term32277, term32277.getClass(), "hour", (byte) 8);
        setByteField(term32277, term32277.getClass(), "minute", (byte) 40);
        setByteField(term32277, term32277.getClass(), "second", (byte) 43);
        setIntField(term32277, term32277.getClass(), "nano", 384847912);
        setField(term32272, term32272.getClass(), "time", term32277);
        setField(term32223, term32223.getClass(), "updateTime", term32272);
        setField(term32223, term32223.getClass(), "meetingTime", "nBABxWLGOf");
        setField(term32223, term32223.getClass(), "signTime", "jdlTBcTsNZ");
        setField(term32223, term32223.getClass(), "signNumber", term32306);
        setField(term32223, term32223.getClass(), "userNumber", term32308);
        setField(term32223, term32223.getClass(), "fileUrl", "fZOYubmjQr");
        setBooleanField(term32223, term32223.getClass(), "online", true);
        setField(term32223, term32223.getClass(), "deleted", term32323);
        setField(term32223, term32223.getClass(), "host", "NgDePNgOTA");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.Meeting");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term32223, args);
    }

};


