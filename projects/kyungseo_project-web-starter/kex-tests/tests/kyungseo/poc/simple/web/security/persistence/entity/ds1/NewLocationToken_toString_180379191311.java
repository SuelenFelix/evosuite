package kyungseo.poc.simple.web.security.persistence.entity.ds1;

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
import static kyungseo.poc.simple.web.security.persistence.entity.ds1.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.ArrayList;

public class NewLocationToken_toString_180379191311 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13261;

    public NewLocationToken_toString_180379191311() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term13262 = new Long(7622401904339010124L);
        Long term13277 = new Long(-761256632171362830L);
        Long term13293 = new Long(6975846341920664143L);
        Boolean term13331 = new Boolean(true);
        Integer term13333 = new Integer(-1533843432);
        ArrayList term13371 = new ArrayList();
        ((ArrayList) term13371).add((Object)null);
        ((ArrayList) term13371).add((Object)null);
        ((ArrayList) term13371).add((Object)null);
        ((ArrayList) term13371).add((Object)null);
        ((ArrayList) term13371).add((Object)null);
        term13261 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.NewLocationToken"));
        Object term13276 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.UserLocation"));
        Object term13292 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.User"));
        Object term13388 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term13389 = newInstance(Class.forName("java.time.LocalDate"));
        Object term13393 = newInstance(Class.forName("java.time.LocalTime"));
        Object term13398 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term13399 = newInstance(Class.forName("java.time.LocalDate"));
        Object term13403 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term13261, term13261.getClass(), "id", term13262);
        setField(term13261, term13261.getClass(), "token", "vUVScKcyFY");
        setField(term13276, term13276.getClass(), "id", term13277);
        setField(term13276, term13276.getClass(), "country", "DCSMbuGiaM");
        setBooleanField(term13276, term13276.getClass(), "enabled", true);
        setField(term13292, term13292.getClass(), "id", term13293);
        setField(term13292, term13292.getClass(), "membername", "wtOVzMPrFU");
        setField(term13292, term13292.getClass(), "email", "CBnamgJrJS");
        setField(term13292, term13292.getClass(), "password", "uJhRRqAnDP");
        setField(term13292, term13292.getClass(), "enabled", term13331);
        setField(term13292, term13292.getClass(), "age", term13333);
        setField(term13292, term13292.getClass(), "phoneNumber", "hJCqADrhuV");
        setField(term13292, term13292.getClass(), "country", "RyPUBlRpNZ");
        setField(term13292, term13292.getClass(), "birthdate", "ardfVpCueq");
        setField(term13292, term13292.getClass(), "roles", term13371);
        setBooleanField(term13292, term13292.getClass(), "isUsing2FA", true);
        setField(term13292, term13292.getClass(), "secret", "fQVSHtJlDS");
        setIntField(term13389, term13389.getClass(), "year", 2023);
        setShortField(term13389, term13389.getClass(), "month", (short) 12);
        setShortField(term13389, term13389.getClass(), "day", (short) 5);
        setField(term13388, term13388.getClass(), "date", term13389);
        setByteField(term13393, term13393.getClass(), "hour", (byte) 4);
        setByteField(term13393, term13393.getClass(), "minute", (byte) 10);
        setByteField(term13393, term13393.getClass(), "second", (byte) 41);
        setIntField(term13393, term13393.getClass(), "nano", 40865943);
        setField(term13388, term13388.getClass(), "time", term13393);
        setField(term13292, term13292.getClass(), "regDate", term13388);
        setIntField(term13399, term13399.getClass(), "year", 2027);
        setShortField(term13399, term13399.getClass(), "month", (short) 10);
        setShortField(term13399, term13399.getClass(), "day", (short) 18);
        setField(term13398, term13398.getClass(), "date", term13399);
        setByteField(term13403, term13403.getClass(), "hour", (byte) 16);
        setByteField(term13403, term13403.getClass(), "minute", (byte) 8);
        setByteField(term13403, term13403.getClass(), "second", (byte) 28);
        setIntField(term13403, term13403.getClass(), "nano", 268951041);
        setField(term13398, term13398.getClass(), "time", term13403);
        setField(term13292, term13292.getClass(), "modDate", term13398);
        setField(term13276, term13276.getClass(), "user", term13292);
        setField(term13261, term13261.getClass(), "userLocation", term13276);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.NewLocationToken");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term13261, args);
    }

};


