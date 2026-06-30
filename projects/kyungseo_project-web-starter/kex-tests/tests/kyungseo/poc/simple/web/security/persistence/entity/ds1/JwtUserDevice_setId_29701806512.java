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

public class JwtUserDevice_setId_29701806512 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23967;
     Object term24198;

    public JwtUserDevice_setId_29701806512() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term23968 = new Long(6759285425911636341L);
        Long term23971 = new Long(-2312307545038820068L);
        Boolean term24009 = new Boolean(true);
        Integer term24011 = new Integer(-246967963);
        Long term24052 = new Long(-5076378196239032509L);
        Object term24051 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term24051, term24051.getClass(), "id", term24052);
        setField(term24051, term24051.getClass(), "users", null);
        setField(term24051, term24051.getClass(), "privileges", null);
        setField(term24051, term24051.getClass(), "name", null);
        ArrayList term24049 = new ArrayList();
        ((ArrayList) term24049).add(term24051);
        Long term24114 = new Long(828765974823196503L);
        Long term24129 = new Long(2517346858311378765L);
        Long term24132 = new Long(-1294722164117772682L);
        Boolean term24137 = new Boolean(false);
        Integer term24139 = new Integer(-1367122405);
        ArrayList term24144 = new ArrayList();
        ((ArrayList) term24144).add((Object)null);
        ((ArrayList) term24144).add((Object)null);
        ((ArrayList) term24144).add((Object)null);
        ((ArrayList) term24144).add((Object)null);
        ((ArrayList) term24144).add((Object)null);
        ((ArrayList) term24144).add((Object)null);
        ((ArrayList) term24144).add((Object)null);
        ((ArrayList) term24144).add((Object)null);
        ((ArrayList) term24144).add((Object)null);
        Long term24176 = new Long(8227165037887933407L);
        Long term24180 = new Long(-689231427687092388L);
        Boolean term24182 = new Boolean(true);
        Long term24184 = new Long(-5504583784484702218L);
        Boolean term24189 = new Boolean(false);
        Long term24191 = new Long(-717218840624209572L);
        Boolean term24196 = new Boolean(false);
        term23967 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.JwtUserDevice"));
        Object term23970 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.User"));
        Object term24069 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term24070 = newInstance(Class.forName("java.time.LocalDate"));
        Object term24074 = newInstance(Class.forName("java.time.LocalTime"));
        Object term24079 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term24080 = newInstance(Class.forName("java.time.LocalDate"));
        Object term24084 = newInstance(Class.forName("java.time.LocalTime"));
        Object term24113 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.JwtRefreshToken"));
        Object term24128 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.JwtUserDevice"));
        Object term24131 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.User"));
        Object term24149 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term24150 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term24175 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.JwtRefreshToken"));
        Object term24179 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.JwtUserDevice"));
        Object term24186 = newInstance(Class.forName("java.time.Instant"));
        Object term24193 = newInstance(Class.forName("java.time.Instant"));
        setField(term23967, term23967.getClass(), "id", term23968);
        setField(term23970, term23970.getClass(), "id", term23971);
        setField(term23970, term23970.getClass(), "membername", "lVJlzPWBAK");
        setField(term23970, term23970.getClass(), "email", "bejLIJbwQs");
        setField(term23970, term23970.getClass(), "password", "rSnKEBMtyz");
        setField(term23970, term23970.getClass(), "enabled", term24009);
        setField(term23970, term23970.getClass(), "age", term24011);
        setField(term23970, term23970.getClass(), "phoneNumber", "ryQHIDoyML");
        setField(term23970, term23970.getClass(), "country", "vmiwpXnDWD");
        setField(term23970, term23970.getClass(), "birthdate", "boaaRNDJpY");
        setField(term23970, term23970.getClass(), "roles", term24049);
        setBooleanField(term23970, term23970.getClass(), "isUsing2FA", true);
        setField(term23970, term23970.getClass(), "secret", "HZeIrhANSL");
        setIntField(term24070, term24070.getClass(), "year", 2024);
        setShortField(term24070, term24070.getClass(), "month", (short) 5);
        setShortField(term24070, term24070.getClass(), "day", (short) 16);
        setField(term24069, term24069.getClass(), "date", term24070);
        setByteField(term24074, term24074.getClass(), "hour", (byte) 12);
        setByteField(term24074, term24074.getClass(), "minute", (byte) 27);
        setByteField(term24074, term24074.getClass(), "second", (byte) 12);
        setIntField(term24074, term24074.getClass(), "nano", 36169190);
        setField(term24069, term24069.getClass(), "time", term24074);
        setField(term23970, term23970.getClass(), "regDate", term24069);
        setIntField(term24080, term24080.getClass(), "year", 2016);
        setShortField(term24080, term24080.getClass(), "month", (short) 12);
        setShortField(term24080, term24080.getClass(), "day", (short) 12);
        setField(term24079, term24079.getClass(), "date", term24080);
        setByteField(term24084, term24084.getClass(), "hour", (byte) 8);
        setByteField(term24084, term24084.getClass(), "minute", (byte) 56);
        setByteField(term24084, term24084.getClass(), "second", (byte) 11);
        setIntField(term24084, term24084.getClass(), "nano", 369122424);
        setField(term24079, term24079.getClass(), "time", term24084);
        setField(term23970, term23970.getClass(), "modDate", term24079);
        setField(term23967, term23967.getClass(), "user", term23970);
        setField(term23967, term23967.getClass(), "deviceType", "FACxkPWyov");
        setField(term23967, term23967.getClass(), "deviceId", "aOlWTliPWV");
        setField(term24113, term24113.getClass(), "id", term24114);
        setField(term24113, term24113.getClass(), "token", "RJhoTTLFxq");
        setField(term24128, term24128.getClass(), "id", term24129);
        setField(term24131, term24131.getClass(), "id", term24132);
        setField(term24131, term24131.getClass(), "membername", "");
        setField(term24131, term24131.getClass(), "email", "");
        setField(term24131, term24131.getClass(), "password", "");
        setField(term24131, term24131.getClass(), "enabled", term24137);
        setField(term24131, term24131.getClass(), "age", term24139);
        setField(term24131, term24131.getClass(), "phoneNumber", "");
        setField(term24131, term24131.getClass(), "country", "");
        setField(term24131, term24131.getClass(), "birthdate", "");
        setField(term24131, term24131.getClass(), "roles", term24144);
        setBooleanField(term24131, term24131.getClass(), "isUsing2FA", true);
        setField(term24131, term24131.getClass(), "secret", "");
        setField(term24149, term24149.getClass(), "date", null);
        setField(term24149, term24149.getClass(), "time", null);
        setField(term24131, term24131.getClass(), "regDate", term24149);
        setField(term24150, term24150.getClass(), "date", null);
        setField(term24150, term24150.getClass(), "time", null);
        setField(term24131, term24131.getClass(), "modDate", term24150);
        setField(term24128, term24128.getClass(), "user", term24131);
        setField(term24128, term24128.getClass(), "deviceType", "acEefJcPBx");
        setField(term24128, term24128.getClass(), "deviceId", "CyuPzrjeFW");
        setField(term24175, term24175.getClass(), "id", term24176);
        setField(term24175, term24175.getClass(), "token", "");
        setField(term24179, term24179.getClass(), "id", term24180);
        setField(term24179, term24179.getClass(), "user", term23970);
        setField(term24179, term24179.getClass(), "deviceType", null);
        setField(term24179, term24179.getClass(), "deviceId", null);
        setField(term24179, term24179.getClass(), "refreshToken", null);
        setField(term24179, term24179.getClass(), "isRefreshActive", term24182);
        setField(term24175, term24175.getClass(), "userDevice", term24179);
        setField(term24175, term24175.getClass(), "refreshCount", term24184);
        setLongField(term24186, term24186.getClass(), "seconds", 1762147441L);
        setIntField(term24186, term24186.getClass(), "nanos", 299000000);
        setField(term24175, term24175.getClass(), "expiryDate", term24186);
        setField(term24128, term24128.getClass(), "refreshToken", term24175);
        setField(term24128, term24128.getClass(), "isRefreshActive", term24189);
        setField(term24113, term24113.getClass(), "userDevice", term24128);
        setField(term24113, term24113.getClass(), "refreshCount", term24191);
        setLongField(term24193, term24193.getClass(), "seconds", 1395479491L);
        setIntField(term24193, term24193.getClass(), "nanos", 666000000);
        setField(term24113, term24113.getClass(), "expiryDate", term24193);
        setField(term23967, term23967.getClass(), "refreshToken", term24113);
        setField(term23967, term23967.getClass(), "isRefreshActive", term24196);
        term24198 = new Long(-2831937652710360219L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.JwtUserDevice");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term24198;
        callMethod(klass, "setId", argTypes, term23967, args);
    }

};


