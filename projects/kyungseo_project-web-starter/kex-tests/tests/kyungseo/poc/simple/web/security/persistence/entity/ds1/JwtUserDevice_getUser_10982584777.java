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

public class JwtUserDevice_getUser_10982584777 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22211;

    public JwtUserDevice_getUser_10982584777() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term22212 = new Long(3093905091334313614L);
        Long term22215 = new Long(6031696788173482309L);
        Boolean term22253 = new Boolean(false);
        Integer term22255 = new Integer(-255317272);
        Long term22296 = new Long(-992268380840969737L);
        Object term22295 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term22295, term22295.getClass(), "id", term22296);
        setField(term22295, term22295.getClass(), "users", null);
        setField(term22295, term22295.getClass(), "privileges", null);
        setField(term22295, term22295.getClass(), "name", null);
        Object term22298 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term22298, term22298.getClass(), "id", null);
        setField(term22298, term22298.getClass(), "users", null);
        setField(term22298, term22298.getClass(), "privileges", null);
        setField(term22298, term22298.getClass(), "name", null);
        Object term22299 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term22299, term22299.getClass(), "id", null);
        setField(term22299, term22299.getClass(), "users", null);
        setField(term22299, term22299.getClass(), "privileges", null);
        setField(term22299, term22299.getClass(), "name", null);
        Long term22301 = new Long(1984510319790430917L);
        Object term22300 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term22300, term22300.getClass(), "id", term22301);
        setField(term22300, term22300.getClass(), "users", null);
        setField(term22300, term22300.getClass(), "privileges", null);
        setField(term22300, term22300.getClass(), "name", null);
        Object term22303 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term22303, term22303.getClass(), "id", null);
        setField(term22303, term22303.getClass(), "users", null);
        setField(term22303, term22303.getClass(), "privileges", null);
        setField(term22303, term22303.getClass(), "name", null);
        ArrayList term22293 = new ArrayList();
        ((ArrayList) term22293).add(term22295);
        ((ArrayList) term22293).add(term22298);
        ((ArrayList) term22293).add(term22299);
        ((ArrayList) term22293).add(term22300);
        ((ArrayList) term22293).add(term22303);
        Long term22364 = new Long(1503652575237136976L);
        Long term22379 = new Long(-1765527138913795029L);
        Long term22382 = new Long(-1702769190313660197L);
        Boolean term22387 = new Boolean(true);
        Integer term22389 = new Integer(-885788574);
        ArrayList term22394 = new ArrayList();
        ((ArrayList) term22394).add((Object)null);
        Long term22426 = new Long(4850987747626140720L);
        Long term22430 = new Long(1805176718113697933L);
        Boolean term22432 = new Boolean(false);
        Long term22434 = new Long(-5753794060274661933L);
        Boolean term22439 = new Boolean(false);
        Long term22441 = new Long(-631692052300282581L);
        Boolean term22446 = new Boolean(false);
        term22211 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.JwtUserDevice"));
        Object term22214 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.User"));
        Object term22319 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term22320 = newInstance(Class.forName("java.time.LocalDate"));
        Object term22324 = newInstance(Class.forName("java.time.LocalTime"));
        Object term22329 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term22330 = newInstance(Class.forName("java.time.LocalDate"));
        Object term22334 = newInstance(Class.forName("java.time.LocalTime"));
        Object term22363 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.JwtRefreshToken"));
        Object term22378 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.JwtUserDevice"));
        Object term22381 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.User"));
        Object term22399 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term22400 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term22425 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.JwtRefreshToken"));
        Object term22429 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.JwtUserDevice"));
        Object term22436 = newInstance(Class.forName("java.time.Instant"));
        Object term22443 = newInstance(Class.forName("java.time.Instant"));
        setField(term22211, term22211.getClass(), "id", term22212);
        setField(term22214, term22214.getClass(), "id", term22215);
        setField(term22214, term22214.getClass(), "membername", "LrwYiZGGQg");
        setField(term22214, term22214.getClass(), "email", "ugFOXAltBR");
        setField(term22214, term22214.getClass(), "password", "PviulmdPhA");
        setField(term22214, term22214.getClass(), "enabled", term22253);
        setField(term22214, term22214.getClass(), "age", term22255);
        setField(term22214, term22214.getClass(), "phoneNumber", "NAUDTajaNN");
        setField(term22214, term22214.getClass(), "country", "BgJwVzSZYi");
        setField(term22214, term22214.getClass(), "birthdate", "ecRYXrSwPc");
        setField(term22214, term22214.getClass(), "roles", term22293);
        setBooleanField(term22214, term22214.getClass(), "isUsing2FA", false);
        setField(term22214, term22214.getClass(), "secret", "CUvKslUjGD");
        setIntField(term22320, term22320.getClass(), "year", 2024);
        setShortField(term22320, term22320.getClass(), "month", (short) 1);
        setShortField(term22320, term22320.getClass(), "day", (short) 16);
        setField(term22319, term22319.getClass(), "date", term22320);
        setByteField(term22324, term22324.getClass(), "hour", (byte) 19);
        setByteField(term22324, term22324.getClass(), "minute", (byte) 24);
        setByteField(term22324, term22324.getClass(), "second", (byte) 37);
        setIntField(term22324, term22324.getClass(), "nano", 310724537);
        setField(term22319, term22319.getClass(), "time", term22324);
        setField(term22214, term22214.getClass(), "regDate", term22319);
        setIntField(term22330, term22330.getClass(), "year", 2018);
        setShortField(term22330, term22330.getClass(), "month", (short) 1);
        setShortField(term22330, term22330.getClass(), "day", (short) 11);
        setField(term22329, term22329.getClass(), "date", term22330);
        setByteField(term22334, term22334.getClass(), "hour", (byte) 22);
        setByteField(term22334, term22334.getClass(), "minute", (byte) 49);
        setByteField(term22334, term22334.getClass(), "second", (byte) 21);
        setIntField(term22334, term22334.getClass(), "nano", 384803149);
        setField(term22329, term22329.getClass(), "time", term22334);
        setField(term22214, term22214.getClass(), "modDate", term22329);
        setField(term22211, term22211.getClass(), "user", term22214);
        setField(term22211, term22211.getClass(), "deviceType", "WIGBWJtmAB");
        setField(term22211, term22211.getClass(), "deviceId", "QBaceAmfVr");
        setField(term22363, term22363.getClass(), "id", term22364);
        setField(term22363, term22363.getClass(), "token", "hWLfpgPZDo");
        setField(term22378, term22378.getClass(), "id", term22379);
        setField(term22381, term22381.getClass(), "id", term22382);
        setField(term22381, term22381.getClass(), "membername", "");
        setField(term22381, term22381.getClass(), "email", "");
        setField(term22381, term22381.getClass(), "password", "");
        setField(term22381, term22381.getClass(), "enabled", term22387);
        setField(term22381, term22381.getClass(), "age", term22389);
        setField(term22381, term22381.getClass(), "phoneNumber", "");
        setField(term22381, term22381.getClass(), "country", "");
        setField(term22381, term22381.getClass(), "birthdate", "");
        setField(term22381, term22381.getClass(), "roles", term22394);
        setBooleanField(term22381, term22381.getClass(), "isUsing2FA", true);
        setField(term22381, term22381.getClass(), "secret", "");
        setField(term22399, term22399.getClass(), "date", null);
        setField(term22399, term22399.getClass(), "time", null);
        setField(term22381, term22381.getClass(), "regDate", term22399);
        setField(term22400, term22400.getClass(), "date", null);
        setField(term22400, term22400.getClass(), "time", null);
        setField(term22381, term22381.getClass(), "modDate", term22400);
        setField(term22378, term22378.getClass(), "user", term22381);
        setField(term22378, term22378.getClass(), "deviceType", "IsSVVsKoyt");
        setField(term22378, term22378.getClass(), "deviceId", "JIYvHbwfiy");
        setField(term22425, term22425.getClass(), "id", term22426);
        setField(term22425, term22425.getClass(), "token", "");
        setField(term22429, term22429.getClass(), "id", term22430);
        setField(term22429, term22429.getClass(), "user", null);
        setField(term22429, term22429.getClass(), "deviceType", null);
        setField(term22429, term22429.getClass(), "deviceId", null);
        setField(term22429, term22429.getClass(), "refreshToken", null);
        setField(term22429, term22429.getClass(), "isRefreshActive", term22432);
        setField(term22425, term22425.getClass(), "userDevice", term22429);
        setField(term22425, term22425.getClass(), "refreshCount", term22434);
        setLongField(term22436, term22436.getClass(), "seconds", 1659994192L);
        setIntField(term22436, term22436.getClass(), "nanos", 918000000);
        setField(term22425, term22425.getClass(), "expiryDate", term22436);
        setField(term22378, term22378.getClass(), "refreshToken", term22425);
        setField(term22378, term22378.getClass(), "isRefreshActive", term22439);
        setField(term22363, term22363.getClass(), "userDevice", term22378);
        setField(term22363, term22363.getClass(), "refreshCount", term22441);
        setLongField(term22443, term22443.getClass(), "seconds", 1876872800L);
        setIntField(term22443, term22443.getClass(), "nanos", 559000000);
        setField(term22363, term22363.getClass(), "expiryDate", term22443);
        setField(term22211, term22211.getClass(), "refreshToken", term22363);
        setField(term22211, term22211.getClass(), "isRefreshActive", term22446);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.JwtUserDevice");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUser", argTypes, term22211, args);
    }

};


