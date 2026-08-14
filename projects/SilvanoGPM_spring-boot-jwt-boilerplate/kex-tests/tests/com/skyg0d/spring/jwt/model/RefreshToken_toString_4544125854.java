package com.skyg0d.spring.jwt.model;

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
import static com.skyg0d.spring.jwt.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class RefreshToken_toString_4544125854 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4659;

    public RefreshToken_toString_4544125854() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term4698 = new HashMap();
        Set<Object> term4830 =  ((Map) term4698).keySet();
        HashSet term4697 = new HashSet((Collection<? extends Object>) term4830);
        term4659 = newInstance(Class.forName("com.skyg0d.spring.jwt.model.RefreshToken"));
        Object term4660 = newInstance(Class.forName("com.skyg0d.spring.jwt.model.User"));
        Object term4703 = newInstance(Class.forName("java.util.UUID"));
        Object term4706 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4707 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4711 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4716 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4717 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4721 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4738 = newInstance(Class.forName("java.time.Instant"));
        Object term4777 = newInstance(Class.forName("java.util.UUID"));
        Object term4780 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4781 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4785 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4790 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4791 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4795 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term4660, term4660.getClass(), "username", "HqBOwkVqjD");
        setField(term4660, term4660.getClass(), "email", "MAcUBcBckh");
        setField(term4660, term4660.getClass(), "password", "oVgzLbrsFr");
        setField(term4660, term4660.getClass(), "roles", term4697);
        setLongField(term4703, term4703.getClass(), "mostSigBits", -8876856890348836498L);
        setLongField(term4703, term4703.getClass(), "leastSigBits", 846579494941632714L);
        setField(term4660, term4660.getClass(), "id", term4703);
        setIntField(term4707, term4707.getClass(), "year", 2023);
        setShortField(term4707, term4707.getClass(), "month", (short) 5);
        setShortField(term4707, term4707.getClass(), "day", (short) 23);
        setField(term4706, term4706.getClass(), "date", term4707);
        setByteField(term4711, term4711.getClass(), "hour", (byte) 0);
        setByteField(term4711, term4711.getClass(), "minute", (byte) 50);
        setByteField(term4711, term4711.getClass(), "second", (byte) 5);
        setIntField(term4711, term4711.getClass(), "nano", 296286825);
        setField(term4706, term4706.getClass(), "time", term4711);
        setField(term4660, term4660.getClass(), "createdAt", term4706);
        setIntField(term4717, term4717.getClass(), "year", 2015);
        setShortField(term4717, term4717.getClass(), "month", (short) 2);
        setShortField(term4717, term4717.getClass(), "day", (short) 5);
        setField(term4716, term4716.getClass(), "date", term4717);
        setByteField(term4721, term4721.getClass(), "hour", (byte) 3);
        setByteField(term4721, term4721.getClass(), "minute", (byte) 26);
        setByteField(term4721, term4721.getClass(), "second", (byte) 49);
        setIntField(term4721, term4721.getClass(), "nano", 995758570);
        setField(term4716, term4716.getClass(), "time", term4721);
        setField(term4660, term4660.getClass(), "updatedAt", term4716);
        setField(term4659, term4659.getClass(), "user", term4660);
        setField(term4659, term4659.getClass(), "token", "vQVyKLdtaz");
        setLongField(term4738, term4738.getClass(), "seconds", 1442639565L);
        setIntField(term4738, term4738.getClass(), "nanos", 302000000);
        setField(term4659, term4659.getClass(), "expiryDate", term4738);
        setField(term4659, term4659.getClass(), "browser", "OWKQODBLzb");
        setField(term4659, term4659.getClass(), "operatingSystem", "wGmYcqUkgE");
        setField(term4659, term4659.getClass(), "ipAddress", "idgaQsnJpQ");
        setLongField(term4777, term4777.getClass(), "mostSigBits", 6689117472719450333L);
        setLongField(term4777, term4777.getClass(), "leastSigBits", 5836128569274066678L);
        setField(term4659, term4659.getClass(), "id", term4777);
        setIntField(term4781, term4781.getClass(), "year", 2013);
        setShortField(term4781, term4781.getClass(), "month", (short) 5);
        setShortField(term4781, term4781.getClass(), "day", (short) 9);
        setField(term4780, term4780.getClass(), "date", term4781);
        setByteField(term4785, term4785.getClass(), "hour", (byte) 4);
        setByteField(term4785, term4785.getClass(), "minute", (byte) 18);
        setByteField(term4785, term4785.getClass(), "second", (byte) 35);
        setIntField(term4785, term4785.getClass(), "nano", 909079395);
        setField(term4780, term4780.getClass(), "time", term4785);
        setField(term4659, term4659.getClass(), "createdAt", term4780);
        setIntField(term4791, term4791.getClass(), "year", 2015);
        setShortField(term4791, term4791.getClass(), "month", (short) 3);
        setShortField(term4791, term4791.getClass(), "day", (short) 15);
        setField(term4790, term4790.getClass(), "date", term4791);
        setByteField(term4795, term4795.getClass(), "hour", (byte) 8);
        setByteField(term4795, term4795.getClass(), "minute", (byte) 45);
        setByteField(term4795, term4795.getClass(), "second", (byte) 29);
        setIntField(term4795, term4795.getClass(), "nano", 781486470);
        setField(term4790, term4790.getClass(), "time", term4795);
        setField(term4659, term4659.getClass(), "updatedAt", term4790);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.skyg0d.spring.jwt.model.RefreshToken");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term4659, args);
    }

};


