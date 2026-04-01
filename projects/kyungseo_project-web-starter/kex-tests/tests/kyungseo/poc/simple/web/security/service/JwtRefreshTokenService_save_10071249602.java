package kyungseo.poc.simple.web.security.service;

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
import static kyungseo.poc.simple.web.security.service.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.ArrayList;

public class JwtRefreshTokenService_save_10071249602 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23;

    public JwtRefreshTokenService_save_10071249602() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term24 = new Long(2442117782898005296L);
        Long term39 = new Long(6375119433582206027L);
        Long term42 = new Long(-8257434502486459194L);
        Boolean term80 = new Boolean(false);
        Integer term82 = new Integer(568599855);
        ArrayList term120 = new ArrayList();
        ((ArrayList) term120).add((Object)null);
        ((ArrayList) term120).add((Object)null);
        ((ArrayList) term120).add((Object)null);
        ((ArrayList) term120).add((Object)null);
        ((ArrayList) term120).add((Object)null);
        Long term182 = new Long(-316468845751588286L);
        Long term197 = new Long(5127676408959197577L);
        Long term200 = new Long(-7237588299778557629L);
        Boolean term202 = new Boolean(false);
        Integer term204 = new Integer(391863371);
        Long term210 = new Long(-6573104506744284592L);
        Long term212 = new Long(-7672528020740371001L);
        Boolean term214 = new Boolean(true);
        Long term216 = new Long(-4502405999831680926L);
        Boolean term221 = new Boolean(false);
        Long term223 = new Long(1967728129628047933L);
        term23 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.JwtRefreshToken"));
        Object term38 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.JwtUserDevice"));
        Object term41 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.User"));
        Object term137 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term138 = newInstance(Class.forName("java.time.LocalDate"));
        Object term142 = newInstance(Class.forName("java.time.LocalTime"));
        Object term147 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term148 = newInstance(Class.forName("java.time.LocalDate"));
        Object term152 = newInstance(Class.forName("java.time.LocalTime"));
        Object term181 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.JwtRefreshToken"));
        Object term196 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.JwtUserDevice"));
        Object term199 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.User"));
        Object term209 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.JwtRefreshToken"));
        Object term218 = newInstance(Class.forName("java.time.Instant"));
        Object term225 = newInstance(Class.forName("java.time.Instant"));
        setField(term23, term23.getClass(), "id", term24);
        setField(term23, term23.getClass(), "token", "sjlJAEtRrb");
        setField(term38, term38.getClass(), "id", term39);
        setField(term41, term41.getClass(), "id", term42);
        setField(term41, term41.getClass(), "membername", "MuLcgQHgqz");
        setField(term41, term41.getClass(), "email", "xxtlPwDYFs");
        setField(term41, term41.getClass(), "password", "jJCZpVmanW");
        setField(term41, term41.getClass(), "enabled", term80);
        setField(term41, term41.getClass(), "age", term82);
        setField(term41, term41.getClass(), "phoneNumber", "EGtDIRbSSb");
        setField(term41, term41.getClass(), "country", "SzjVpOQTyS");
        setField(term41, term41.getClass(), "birthdate", "MjGYSRKTNF");
        setField(term41, term41.getClass(), "roles", term120);
        setBooleanField(term41, term41.getClass(), "isUsing2FA", false);
        setField(term41, term41.getClass(), "secret", "aKnKipADSo");
        setIntField(term138, term138.getClass(), "year", 2025);
        setShortField(term138, term138.getClass(), "month", (short) 4);
        setShortField(term138, term138.getClass(), "day", (short) 24);
        setField(term137, term137.getClass(), "date", term138);
        setByteField(term142, term142.getClass(), "hour", (byte) 18);
        setByteField(term142, term142.getClass(), "minute", (byte) 11);
        setByteField(term142, term142.getClass(), "second", (byte) 40);
        setIntField(term142, term142.getClass(), "nano", 137454929);
        setField(term137, term137.getClass(), "time", term142);
        setField(term41, term41.getClass(), "regDate", term137);
        setIntField(term148, term148.getClass(), "year", 2024);
        setShortField(term148, term148.getClass(), "month", (short) 1);
        setShortField(term148, term148.getClass(), "day", (short) 24);
        setField(term147, term147.getClass(), "date", term148);
        setByteField(term152, term152.getClass(), "hour", (byte) 20);
        setByteField(term152, term152.getClass(), "minute", (byte) 28);
        setByteField(term152, term152.getClass(), "second", (byte) 39);
        setIntField(term152, term152.getClass(), "nano", 952728177);
        setField(term147, term147.getClass(), "time", term152);
        setField(term41, term41.getClass(), "modDate", term147);
        setField(term38, term38.getClass(), "user", term41);
        setField(term38, term38.getClass(), "deviceType", "wSQxaModmm");
        setField(term38, term38.getClass(), "deviceId", "UlajhuVLaP");
        setField(term181, term181.getClass(), "id", term182);
        setField(term181, term181.getClass(), "token", "gGSMzuGICf");
        setField(term196, term196.getClass(), "id", term197);
        setField(term199, term199.getClass(), "id", term200);
        setField(term199, term199.getClass(), "membername", null);
        setField(term199, term199.getClass(), "email", null);
        setField(term199, term199.getClass(), "password", null);
        setField(term199, term199.getClass(), "enabled", term202);
        setField(term199, term199.getClass(), "age", term204);
        setField(term199, term199.getClass(), "phoneNumber", null);
        setField(term199, term199.getClass(), "country", null);
        setField(term199, term199.getClass(), "birthdate", null);
        setField(term199, term199.getClass(), "roles", null);
        setBooleanField(term199, term199.getClass(), "isUsing2FA", false);
        setField(term199, term199.getClass(), "secret", null);
        setField(term199, term199.getClass(), "regDate", null);
        setField(term199, term199.getClass(), "modDate", null);
        setField(term196, term196.getClass(), "user", term199);
        setField(term196, term196.getClass(), "deviceType", "");
        setField(term196, term196.getClass(), "deviceId", "");
        setField(term209, term209.getClass(), "id", term210);
        setField(term209, term209.getClass(), "token", null);
        setField(term209, term209.getClass(), "userDevice", null);
        setField(term209, term209.getClass(), "refreshCount", term212);
        setField(term209, term209.getClass(), "expiryDate", null);
        setField(term196, term196.getClass(), "refreshToken", term209);
        setField(term196, term196.getClass(), "isRefreshActive", term214);
        setField(term181, term181.getClass(), "userDevice", term196);
        setField(term181, term181.getClass(), "refreshCount", term216);
        setLongField(term218, term218.getClass(), "seconds", 1606045635L);
        setIntField(term218, term218.getClass(), "nanos", 837000000);
        setField(term181, term181.getClass(), "expiryDate", term218);
        setField(term38, term38.getClass(), "refreshToken", term181);
        setField(term38, term38.getClass(), "isRefreshActive", term221);
        setField(term23, term23.getClass(), "userDevice", term38);
        setField(term23, term23.getClass(), "refreshCount", term223);
        setLongField(term225, term225.getClass(), "seconds", 1442639565L);
        setIntField(term225, term225.getClass(), "nanos", 302000000);
        setField(term23, term23.getClass(), "expiryDate", term225);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.security.service.JwtRefreshTokenService");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.JwtRefreshToken");
        Object[] args = new Object[1];
        args[0] = term23;
        callMethod(klass, "save", argTypes, null, args);
    }

};


