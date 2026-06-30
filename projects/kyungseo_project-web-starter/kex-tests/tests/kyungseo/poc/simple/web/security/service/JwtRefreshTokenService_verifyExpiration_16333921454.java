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

public class JwtRefreshTokenService_verifyExpiration_16333921454 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term340;

    public JwtRefreshTokenService_verifyExpiration_16333921454() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term341 = new Long(2120084523938730454L);
        Long term356 = new Long(6855071767938501807L);
        Long term359 = new Long(-5892135042702373494L);
        Boolean term397 = new Boolean(true);
        Integer term399 = new Integer(-1922583790);
        ArrayList term437 = new ArrayList();
        ((ArrayList) term437).add((Object)null);
        ((ArrayList) term437).add((Object)null);
        ((ArrayList) term437).add((Object)null);
        ((ArrayList) term437).add((Object)null);
        ((ArrayList) term437).add((Object)null);
        Long term499 = new Long(-7612550318181586304L);
        Long term514 = new Long(-2170847986967241072L);
        Long term521 = new Long(4044358158040652353L);
        Long term523 = new Long(-1468719814009985452L);
        Boolean term525 = new Boolean(true);
        Long term527 = new Long(-7738503207562305297L);
        Boolean term532 = new Boolean(true);
        Long term534 = new Long(3825396310311739952L);
        term340 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.JwtRefreshToken"));
        Object term355 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.JwtUserDevice"));
        Object term358 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.User"));
        Object term454 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term455 = newInstance(Class.forName("java.time.LocalDate"));
        Object term459 = newInstance(Class.forName("java.time.LocalTime"));
        Object term464 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term465 = newInstance(Class.forName("java.time.LocalDate"));
        Object term469 = newInstance(Class.forName("java.time.LocalTime"));
        Object term498 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.JwtRefreshToken"));
        Object term513 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.JwtUserDevice"));
        Object term516 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.User"));
        Object term520 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.JwtRefreshToken"));
        Object term529 = newInstance(Class.forName("java.time.Instant"));
        Object term536 = newInstance(Class.forName("java.time.Instant"));
        setField(term340, term340.getClass(), "id", term341);
        setField(term340, term340.getClass(), "token", "onpbIeEKoi");
        setField(term355, term355.getClass(), "id", term356);
        setField(term358, term358.getClass(), "id", term359);
        setField(term358, term358.getClass(), "membername", "YRHGsAkhxb");
        setField(term358, term358.getClass(), "email", "ffYhPOzlUs");
        setField(term358, term358.getClass(), "password", "MLqYREekMl");
        setField(term358, term358.getClass(), "enabled", term397);
        setField(term358, term358.getClass(), "age", term399);
        setField(term358, term358.getClass(), "phoneNumber", "ytSBIKXogI");
        setField(term358, term358.getClass(), "country", "nHXjMycHlU");
        setField(term358, term358.getClass(), "birthdate", "ieCtQFdkii");
        setField(term358, term358.getClass(), "roles", term437);
        setBooleanField(term358, term358.getClass(), "isUsing2FA", true);
        setField(term358, term358.getClass(), "secret", "GVizqqzXpy");
        setIntField(term455, term455.getClass(), "year", 2012);
        setShortField(term455, term455.getClass(), "month", (short) 2);
        setShortField(term455, term455.getClass(), "day", (short) 19);
        setField(term454, term454.getClass(), "date", term455);
        setByteField(term459, term459.getClass(), "hour", (byte) 8);
        setByteField(term459, term459.getClass(), "minute", (byte) 4);
        setByteField(term459, term459.getClass(), "second", (byte) 43);
        setIntField(term459, term459.getClass(), "nano", 114930008);
        setField(term454, term454.getClass(), "time", term459);
        setField(term358, term358.getClass(), "regDate", term454);
        setIntField(term465, term465.getClass(), "year", 2017);
        setShortField(term465, term465.getClass(), "month", (short) 6);
        setShortField(term465, term465.getClass(), "day", (short) 8);
        setField(term464, term464.getClass(), "date", term465);
        setByteField(term469, term469.getClass(), "hour", (byte) 0);
        setByteField(term469, term469.getClass(), "minute", (byte) 18);
        setByteField(term469, term469.getClass(), "second", (byte) 55);
        setIntField(term469, term469.getClass(), "nano", 680586717);
        setField(term464, term464.getClass(), "time", term469);
        setField(term358, term358.getClass(), "modDate", term464);
        setField(term355, term355.getClass(), "user", term358);
        setField(term355, term355.getClass(), "deviceType", "JqXGgAhZPl");
        setField(term355, term355.getClass(), "deviceId", "jiKYgYHqIS");
        setField(term498, term498.getClass(), "id", term499);
        setField(term498, term498.getClass(), "token", "DfISiziTgG");
        setField(term513, term513.getClass(), "id", term514);
        setField(term516, term516.getClass(), "id", null);
        setField(term516, term516.getClass(), "membername", null);
        setField(term516, term516.getClass(), "email", null);
        setField(term516, term516.getClass(), "password", null);
        setField(term516, term516.getClass(), "enabled", null);
        setField(term516, term516.getClass(), "age", null);
        setField(term516, term516.getClass(), "phoneNumber", null);
        setField(term516, term516.getClass(), "country", null);
        setField(term516, term516.getClass(), "birthdate", null);
        setField(term516, term516.getClass(), "roles", null);
        setBooleanField(term516, term516.getClass(), "isUsing2FA", false);
        setField(term516, term516.getClass(), "secret", null);
        setField(term516, term516.getClass(), "regDate", null);
        setField(term516, term516.getClass(), "modDate", null);
        setField(term513, term513.getClass(), "user", term516);
        setField(term513, term513.getClass(), "deviceType", "");
        setField(term513, term513.getClass(), "deviceId", "");
        setField(term520, term520.getClass(), "id", term521);
        setField(term520, term520.getClass(), "token", null);
        setField(term520, term520.getClass(), "userDevice", null);
        setField(term520, term520.getClass(), "refreshCount", term523);
        setField(term520, term520.getClass(), "expiryDate", null);
        setField(term513, term513.getClass(), "refreshToken", term520);
        setField(term513, term513.getClass(), "isRefreshActive", term525);
        setField(term498, term498.getClass(), "userDevice", term513);
        setField(term498, term498.getClass(), "refreshCount", term527);
        setLongField(term529, term529.getClass(), "seconds", 1645834034L);
        setIntField(term529, term529.getClass(), "nanos", 896000000);
        setField(term498, term498.getClass(), "expiryDate", term529);
        setField(term355, term355.getClass(), "refreshToken", term498);
        setField(term355, term355.getClass(), "isRefreshActive", term532);
        setField(term340, term340.getClass(), "userDevice", term355);
        setField(term340, term340.getClass(), "refreshCount", term534);
        setLongField(term536, term536.getClass(), "seconds", 1500721068L);
        setIntField(term536, term536.getClass(), "nanos", 23000000);
        setField(term340, term340.getClass(), "expiryDate", term536);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.security.service.JwtRefreshTokenService");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.JwtRefreshToken");
        Object[] args = new Object[1];
        args[0] = term340;
        callMethod(klass, "verifyExpiration", argTypes, null, args);
    }

};


