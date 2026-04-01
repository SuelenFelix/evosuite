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

public class VerificationToken_equals_192029999613 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19414;
     Object term19557;

    public VerificationToken_equals_192029999613() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term19415 = new Long(-5668489101686002218L);
        Long term19430 = new Long(8713229483070783866L);
        Boolean term19468 = new Boolean(true);
        Integer term19470 = new Integer(-26316536);
        Long term19511 = new Long(7598786125321910224L);
        Object term19510 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term19510, term19510.getClass(), "id", term19511);
        setField(term19510, term19510.getClass(), "users", null);
        setField(term19510, term19510.getClass(), "privileges", null);
        setField(term19510, term19510.getClass(), "name", null);
        Object term19513 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term19513, term19513.getClass(), "id", null);
        setField(term19513, term19513.getClass(), "users", null);
        setField(term19513, term19513.getClass(), "privileges", null);
        setField(term19513, term19513.getClass(), "name", null);
        Object term19514 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term19514, term19514.getClass(), "id", null);
        setField(term19514, term19514.getClass(), "users", null);
        setField(term19514, term19514.getClass(), "privileges", null);
        setField(term19514, term19514.getClass(), "name", null);
        Object term19515 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term19515, term19515.getClass(), "id", null);
        setField(term19515, term19515.getClass(), "users", null);
        setField(term19515, term19515.getClass(), "privileges", null);
        setField(term19515, term19515.getClass(), "name", null);
        Object term19516 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term19516, term19516.getClass(), "id", null);
        setField(term19516, term19516.getClass(), "users", null);
        setField(term19516, term19516.getClass(), "privileges", null);
        setField(term19516, term19516.getClass(), "name", null);
        Long term19518 = new Long(-3551818295265883412L);
        Object term19517 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term19517, term19517.getClass(), "id", term19518);
        setField(term19517, term19517.getClass(), "users", null);
        setField(term19517, term19517.getClass(), "privileges", null);
        setField(term19517, term19517.getClass(), "name", null);
        ArrayList term19508 = new ArrayList();
        ((ArrayList) term19508).add(term19510);
        ((ArrayList) term19508).add(term19513);
        ((ArrayList) term19508).add(term19514);
        ((ArrayList) term19508).add(term19515);
        ((ArrayList) term19508).add(term19514);
        ((ArrayList) term19508).add(term19516);
        ((ArrayList) term19508).add(term19514);
        ((ArrayList) term19508).add(term19515);
        ((ArrayList) term19508).add(term19517);
        term19414 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.VerificationToken"));
        Object term19429 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.User"));
        Object term19535 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term19536 = newInstance(Class.forName("java.time.LocalDate"));
        Object term19540 = newInstance(Class.forName("java.time.LocalTime"));
        Object term19545 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term19546 = newInstance(Class.forName("java.time.LocalDate"));
        Object term19550 = newInstance(Class.forName("java.time.LocalTime"));
        Object term19555 = newInstance(Class.forName("java.util.Date"));
        setField(term19414, term19414.getClass(), "id", term19415);
        setField(term19414, term19414.getClass(), "token", "foXieiGQTk");
        setField(term19429, term19429.getClass(), "id", term19430);
        setField(term19429, term19429.getClass(), "membername", "XgtGzhZjwe");
        setField(term19429, term19429.getClass(), "email", "kuzULljuRL");
        setField(term19429, term19429.getClass(), "password", "DNgbgDcryI");
        setField(term19429, term19429.getClass(), "enabled", term19468);
        setField(term19429, term19429.getClass(), "age", term19470);
        setField(term19429, term19429.getClass(), "phoneNumber", "NHOLoiInVI");
        setField(term19429, term19429.getClass(), "country", "PVcjWjrzGf");
        setField(term19429, term19429.getClass(), "birthdate", "EsauoauZcZ");
        setField(term19429, term19429.getClass(), "roles", term19508);
        setBooleanField(term19429, term19429.getClass(), "isUsing2FA", false);
        setField(term19429, term19429.getClass(), "secret", "bCRIEMBwda");
        setIntField(term19536, term19536.getClass(), "year", 2026);
        setShortField(term19536, term19536.getClass(), "month", (short) 9);
        setShortField(term19536, term19536.getClass(), "day", (short) 9);
        setField(term19535, term19535.getClass(), "date", term19536);
        setByteField(term19540, term19540.getClass(), "hour", (byte) 5);
        setByteField(term19540, term19540.getClass(), "minute", (byte) 5);
        setByteField(term19540, term19540.getClass(), "second", (byte) 34);
        setIntField(term19540, term19540.getClass(), "nano", 167743575);
        setField(term19535, term19535.getClass(), "time", term19540);
        setField(term19429, term19429.getClass(), "regDate", term19535);
        setIntField(term19546, term19546.getClass(), "year", 2027);
        setShortField(term19546, term19546.getClass(), "month", (short) 12);
        setShortField(term19546, term19546.getClass(), "day", (short) 7);
        setField(term19545, term19545.getClass(), "date", term19546);
        setByteField(term19550, term19550.getClass(), "hour", (byte) 13);
        setByteField(term19550, term19550.getClass(), "minute", (byte) 1);
        setByteField(term19550, term19550.getClass(), "second", (byte) 57);
        setIntField(term19550, term19550.getClass(), "nano", 505495887);
        setField(term19545, term19545.getClass(), "time", term19550);
        setField(term19429, term19429.getClass(), "modDate", term19545);
        setField(term19414, term19414.getClass(), "user", term19429);
        setLongField(term19555, term19555.getClass(), "fastTime", 1595517583842L);
        setField(term19555, term19555.getClass(), "cdate", null);
        setField(term19414, term19414.getClass(), "expiryDate", term19555);
        term19557 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.VerificationToken");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term19557;
        callMethod(klass, "equals", argTypes, term19414, args);
    }

};


