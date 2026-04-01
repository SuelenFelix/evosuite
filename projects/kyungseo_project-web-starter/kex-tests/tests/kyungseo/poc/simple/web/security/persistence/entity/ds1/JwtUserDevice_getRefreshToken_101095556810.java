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

public class JwtUserDevice_getRefreshToken_101095556810 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23267;

    public JwtUserDevice_getRefreshToken_101095556810() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term23268 = new Long(-2356268402672275562L);
        Long term23271 = new Long(4920060206553726462L);
        Boolean term23309 = new Boolean(false);
        Integer term23311 = new Integer(777492093);
        Long term23352 = new Long(-5089949977716478457L);
        Object term23351 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term23351, term23351.getClass(), "id", term23352);
        setField(term23351, term23351.getClass(), "users", null);
        setField(term23351, term23351.getClass(), "privileges", null);
        setField(term23351, term23351.getClass(), "name", null);
        Object term23354 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term23354, term23354.getClass(), "id", null);
        setField(term23354, term23354.getClass(), "users", null);
        setField(term23354, term23354.getClass(), "privileges", null);
        setField(term23354, term23354.getClass(), "name", null);
        ArrayList term23349 = new ArrayList();
        ((ArrayList) term23349).add(term23351);
        ((ArrayList) term23349).add(term23354);
        Long term23415 = new Long(-3982367954172699860L);
        Long term23430 = new Long(7153115868701511726L);
        Long term23433 = new Long(4404944231648782138L);
        Boolean term23438 = new Boolean(true);
        Integer term23440 = new Integer(109078154);
        ArrayList term23445 = new ArrayList();
        ((ArrayList) term23445).add((Object)null);
        ((ArrayList) term23445).add((Object)null);
        ((ArrayList) term23445).add((Object)null);
        ((ArrayList) term23445).add((Object)null);
        ((ArrayList) term23445).add((Object)null);
        ((ArrayList) term23445).add((Object)null);
        Long term23477 = new Long(3042394513611697851L);
        Long term23481 = new Long(4021900249730695810L);
        Boolean term23483 = new Boolean(false);
        Long term23485 = new Long(1837377990745487524L);
        Boolean term23490 = new Boolean(true);
        Long term23492 = new Long(7253514194157710276L);
        Boolean term23497 = new Boolean(false);
        term23267 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.JwtUserDevice"));
        Object term23270 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.User"));
        Object term23370 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term23371 = newInstance(Class.forName("java.time.LocalDate"));
        Object term23375 = newInstance(Class.forName("java.time.LocalTime"));
        Object term23380 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term23381 = newInstance(Class.forName("java.time.LocalDate"));
        Object term23385 = newInstance(Class.forName("java.time.LocalTime"));
        Object term23414 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.JwtRefreshToken"));
        Object term23429 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.JwtUserDevice"));
        Object term23432 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.User"));
        Object term23450 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term23451 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term23476 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.JwtRefreshToken"));
        Object term23480 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.JwtUserDevice"));
        Object term23487 = newInstance(Class.forName("java.time.Instant"));
        Object term23494 = newInstance(Class.forName("java.time.Instant"));
        setField(term23267, term23267.getClass(), "id", term23268);
        setField(term23270, term23270.getClass(), "id", term23271);
        setField(term23270, term23270.getClass(), "membername", "aJASPPtPMs");
        setField(term23270, term23270.getClass(), "email", "ZEKHvyxbLZ");
        setField(term23270, term23270.getClass(), "password", "BRBhgpeeOx");
        setField(term23270, term23270.getClass(), "enabled", term23309);
        setField(term23270, term23270.getClass(), "age", term23311);
        setField(term23270, term23270.getClass(), "phoneNumber", "UWmJYgkKXW");
        setField(term23270, term23270.getClass(), "country", "JCqswoYQxx");
        setField(term23270, term23270.getClass(), "birthdate", "DbEuFCyCVD");
        setField(term23270, term23270.getClass(), "roles", term23349);
        setBooleanField(term23270, term23270.getClass(), "isUsing2FA", false);
        setField(term23270, term23270.getClass(), "secret", "LvPdtNhyPi");
        setIntField(term23371, term23371.getClass(), "year", 2024);
        setShortField(term23371, term23371.getClass(), "month", (short) 12);
        setShortField(term23371, term23371.getClass(), "day", (short) 3);
        setField(term23370, term23370.getClass(), "date", term23371);
        setByteField(term23375, term23375.getClass(), "hour", (byte) 14);
        setByteField(term23375, term23375.getClass(), "minute", (byte) 14);
        setByteField(term23375, term23375.getClass(), "second", (byte) 18);
        setIntField(term23375, term23375.getClass(), "nano", 793131232);
        setField(term23370, term23370.getClass(), "time", term23375);
        setField(term23270, term23270.getClass(), "regDate", term23370);
        setIntField(term23381, term23381.getClass(), "year", 2017);
        setShortField(term23381, term23381.getClass(), "month", (short) 5);
        setShortField(term23381, term23381.getClass(), "day", (short) 6);
        setField(term23380, term23380.getClass(), "date", term23381);
        setByteField(term23385, term23385.getClass(), "hour", (byte) 13);
        setByteField(term23385, term23385.getClass(), "minute", (byte) 52);
        setByteField(term23385, term23385.getClass(), "second", (byte) 35);
        setIntField(term23385, term23385.getClass(), "nano", 8283927);
        setField(term23380, term23380.getClass(), "time", term23385);
        setField(term23270, term23270.getClass(), "modDate", term23380);
        setField(term23267, term23267.getClass(), "user", term23270);
        setField(term23267, term23267.getClass(), "deviceType", "LxkkwJYmre");
        setField(term23267, term23267.getClass(), "deviceId", "wpmpEfMgmx");
        setField(term23414, term23414.getClass(), "id", term23415);
        setField(term23414, term23414.getClass(), "token", "JNOsqfXWyI");
        setField(term23429, term23429.getClass(), "id", term23430);
        setField(term23432, term23432.getClass(), "id", term23433);
        setField(term23432, term23432.getClass(), "membername", "");
        setField(term23432, term23432.getClass(), "email", "");
        setField(term23432, term23432.getClass(), "password", "");
        setField(term23432, term23432.getClass(), "enabled", term23438);
        setField(term23432, term23432.getClass(), "age", term23440);
        setField(term23432, term23432.getClass(), "phoneNumber", "");
        setField(term23432, term23432.getClass(), "country", "");
        setField(term23432, term23432.getClass(), "birthdate", "");
        setField(term23432, term23432.getClass(), "roles", term23445);
        setBooleanField(term23432, term23432.getClass(), "isUsing2FA", true);
        setField(term23432, term23432.getClass(), "secret", "");
        setField(term23450, term23450.getClass(), "date", null);
        setField(term23450, term23450.getClass(), "time", null);
        setField(term23432, term23432.getClass(), "regDate", term23450);
        setField(term23451, term23451.getClass(), "date", null);
        setField(term23451, term23451.getClass(), "time", null);
        setField(term23432, term23432.getClass(), "modDate", term23451);
        setField(term23429, term23429.getClass(), "user", term23432);
        setField(term23429, term23429.getClass(), "deviceType", "iTxvNsKnDY");
        setField(term23429, term23429.getClass(), "deviceId", "MxewnGKZeY");
        setField(term23476, term23476.getClass(), "id", term23477);
        setField(term23476, term23476.getClass(), "token", "");
        setField(term23480, term23480.getClass(), "id", term23481);
        setField(term23480, term23480.getClass(), "user", null);
        setField(term23480, term23480.getClass(), "deviceType", null);
        setField(term23480, term23480.getClass(), "deviceId", null);
        setField(term23480, term23480.getClass(), "refreshToken", null);
        setField(term23480, term23480.getClass(), "isRefreshActive", term23483);
        setField(term23476, term23476.getClass(), "userDevice", term23480);
        setField(term23476, term23476.getClass(), "refreshCount", term23485);
        setLongField(term23487, term23487.getClass(), "seconds", 1741444563L);
        setIntField(term23487, term23487.getClass(), "nanos", 811000000);
        setField(term23476, term23476.getClass(), "expiryDate", term23487);
        setField(term23429, term23429.getClass(), "refreshToken", term23476);
        setField(term23429, term23429.getClass(), "isRefreshActive", term23490);
        setField(term23414, term23414.getClass(), "userDevice", term23429);
        setField(term23414, term23414.getClass(), "refreshCount", term23492);
        setLongField(term23494, term23494.getClass(), "seconds", 1761994701L);
        setIntField(term23494, term23494.getClass(), "nanos", 322000000);
        setField(term23414, term23414.getClass(), "expiryDate", term23494);
        setField(term23267, term23267.getClass(), "refreshToken", term23414);
        setField(term23267, term23267.getClass(), "isRefreshActive", term23497);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.JwtUserDevice");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRefreshToken", argTypes, term23267, args);
    }

};


