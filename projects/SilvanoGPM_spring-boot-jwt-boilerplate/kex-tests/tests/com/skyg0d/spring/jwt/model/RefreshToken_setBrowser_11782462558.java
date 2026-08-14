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

public class RefreshToken_setBrowser_11782462558 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5629;

    public RefreshToken_setBrowser_11782462558() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term5668 = new HashMap();
        Set<Object> term5812 =  ((Map) term5668).keySet();
        HashSet term5667 = new HashSet((Collection<? extends Object>) term5812);
        term5629 = newInstance(Class.forName("com.skyg0d.spring.jwt.model.RefreshToken"));
        Object term5630 = newInstance(Class.forName("com.skyg0d.spring.jwt.model.User"));
        Object term5673 = newInstance(Class.forName("java.util.UUID"));
        Object term5676 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term5677 = newInstance(Class.forName("java.time.LocalDate"));
        Object term5681 = newInstance(Class.forName("java.time.LocalTime"));
        Object term5686 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term5687 = newInstance(Class.forName("java.time.LocalDate"));
        Object term5691 = newInstance(Class.forName("java.time.LocalTime"));
        Object term5708 = newInstance(Class.forName("java.time.Instant"));
        Object term5747 = newInstance(Class.forName("java.util.UUID"));
        Object term5750 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term5751 = newInstance(Class.forName("java.time.LocalDate"));
        Object term5755 = newInstance(Class.forName("java.time.LocalTime"));
        Object term5760 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term5761 = newInstance(Class.forName("java.time.LocalDate"));
        Object term5765 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term5630, term5630.getClass(), "username", "xBsXSDjXYK");
        setField(term5630, term5630.getClass(), "email", "sEnIVFtZuQ");
        setField(term5630, term5630.getClass(), "password", "ZVecLZMLHF");
        setField(term5630, term5630.getClass(), "roles", term5667);
        setLongField(term5673, term5673.getClass(), "mostSigBits", 2354625302846375590L);
        setLongField(term5673, term5673.getClass(), "leastSigBits", 7276637106827860087L);
        setField(term5630, term5630.getClass(), "id", term5673);
        setIntField(term5677, term5677.getClass(), "year", 2021);
        setShortField(term5677, term5677.getClass(), "month", (short) 8);
        setShortField(term5677, term5677.getClass(), "day", (short) 27);
        setField(term5676, term5676.getClass(), "date", term5677);
        setByteField(term5681, term5681.getClass(), "hour", (byte) 20);
        setByteField(term5681, term5681.getClass(), "minute", (byte) 11);
        setByteField(term5681, term5681.getClass(), "second", (byte) 47);
        setIntField(term5681, term5681.getClass(), "nano", 116303493);
        setField(term5676, term5676.getClass(), "time", term5681);
        setField(term5630, term5630.getClass(), "createdAt", term5676);
        setIntField(term5687, term5687.getClass(), "year", 2012);
        setShortField(term5687, term5687.getClass(), "month", (short) 5);
        setShortField(term5687, term5687.getClass(), "day", (short) 17);
        setField(term5686, term5686.getClass(), "date", term5687);
        setByteField(term5691, term5691.getClass(), "hour", (byte) 19);
        setByteField(term5691, term5691.getClass(), "minute", (byte) 36);
        setByteField(term5691, term5691.getClass(), "second", (byte) 33);
        setIntField(term5691, term5691.getClass(), "nano", 46625011);
        setField(term5686, term5686.getClass(), "time", term5691);
        setField(term5630, term5630.getClass(), "updatedAt", term5686);
        setField(term5629, term5629.getClass(), "user", term5630);
        setField(term5629, term5629.getClass(), "token", "fztQhjqwdP");
        setLongField(term5708, term5708.getClass(), "seconds", 1500721068L);
        setIntField(term5708, term5708.getClass(), "nanos", 23000000);
        setField(term5629, term5629.getClass(), "expiryDate", term5708);
        setField(term5629, term5629.getClass(), "browser", "eVpkWxjuki");
        setField(term5629, term5629.getClass(), "operatingSystem", "SJiQaLvSKv");
        setField(term5629, term5629.getClass(), "ipAddress", "OEXDRUKcFl");
        setLongField(term5747, term5747.getClass(), "mostSigBits", -3936701866695933852L);
        setLongField(term5747, term5747.getClass(), "leastSigBits", 1215116475929634177L);
        setField(term5629, term5629.getClass(), "id", term5747);
        setIntField(term5751, term5751.getClass(), "year", 2013);
        setShortField(term5751, term5751.getClass(), "month", (short) 7);
        setShortField(term5751, term5751.getClass(), "day", (short) 3);
        setField(term5750, term5750.getClass(), "date", term5751);
        setByteField(term5755, term5755.getClass(), "hour", (byte) 10);
        setByteField(term5755, term5755.getClass(), "minute", (byte) 59);
        setByteField(term5755, term5755.getClass(), "second", (byte) 22);
        setIntField(term5755, term5755.getClass(), "nano", 937921480);
        setField(term5750, term5750.getClass(), "time", term5755);
        setField(term5629, term5629.getClass(), "createdAt", term5750);
        setIntField(term5761, term5761.getClass(), "year", 2012);
        setShortField(term5761, term5761.getClass(), "month", (short) 2);
        setShortField(term5761, term5761.getClass(), "day", (short) 29);
        setField(term5760, term5760.getClass(), "date", term5761);
        setByteField(term5765, term5765.getClass(), "hour", (byte) 14);
        setByteField(term5765, term5765.getClass(), "minute", (byte) 26);
        setByteField(term5765, term5765.getClass(), "second", (byte) 20);
        setIntField(term5765, term5765.getClass(), "nano", 780823452);
        setField(term5760, term5760.getClass(), "time", term5765);
        setField(term5629, term5629.getClass(), "updatedAt", term5760);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.skyg0d.spring.jwt.model.RefreshToken");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "RYdKCNNMBR";
        callMethod(klass, "setBrowser", argTypes, term5629, args);
    }

};


