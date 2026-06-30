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
import java.lang.Boolean;
import java.lang.Integer;
import java.util.ArrayList;
import java.lang.Object;

public class User_getAge_2576107011 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3119;

    public User_getAge_2576107011() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3120 = new Long(-6673920710396545553L);
        Boolean term3158 = new Boolean(false);
        Integer term3160 = new Integer(2055867847);
        Long term3201 = new Long(3412644969878030772L);
        ArrayList term3203 = new ArrayList();
        ((ArrayList) term3203).add((Object)null);
        ((ArrayList) term3203).add((Object)null);
        ((ArrayList) term3203).add((Object)null);
        ((ArrayList) term3203).add((Object)null);
        ((ArrayList) term3203).add((Object)null);
        ArrayList term3206 = new ArrayList();
        ((ArrayList) term3206).add((Object)null);
        ((ArrayList) term3206).add((Object)null);
        ((ArrayList) term3206).add((Object)null);
        Object term3200 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term3200, term3200.getClass(), "id", term3201);
        setField(term3200, term3200.getClass(), "users", term3203);
        setField(term3200, term3200.getClass(), "privileges", term3206);
        setField(term3200, term3200.getClass(), "name", "");
        Long term3211 = new Long(8540994973773607992L);
        ArrayList term3213 = new ArrayList();
        ((ArrayList) term3213).add((Object)null);
        ArrayList term3216 = new ArrayList();
        ((ArrayList) term3216).add((Object)null);
        Object term3210 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term3210, term3210.getClass(), "id", term3211);
        setField(term3210, term3210.getClass(), "users", term3213);
        setField(term3210, term3210.getClass(), "privileges", term3216);
        setField(term3210, term3210.getClass(), "name", "");
        Long term3221 = new Long(-7310273014364148916L);
        ArrayList term3223 = new ArrayList();
        ((ArrayList) term3223).add((Object)null);
        ArrayList term3226 = new ArrayList();
        ((ArrayList) term3226).add((Object)null);
        ((ArrayList) term3226).add((Object)null);
        ((ArrayList) term3226).add((Object)null);
        ((ArrayList) term3226).add((Object)null);
        ((ArrayList) term3226).add((Object)null);
        Object term3220 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term3220, term3220.getClass(), "id", term3221);
        setField(term3220, term3220.getClass(), "users", term3223);
        setField(term3220, term3220.getClass(), "privileges", term3226);
        setField(term3220, term3220.getClass(), "name", "");
        Long term3231 = new Long(9205327385733285058L);
        ArrayList term3233 = new ArrayList();
        ((ArrayList) term3233).add((Object)null);
        ((ArrayList) term3233).add((Object)null);
        ((ArrayList) term3233).add((Object)null);
        ArrayList term3236 = new ArrayList();
        ((ArrayList) term3236).add((Object)null);
        ((ArrayList) term3236).add((Object)null);
        ((ArrayList) term3236).add((Object)null);
        ((ArrayList) term3236).add((Object)null);
        ((ArrayList) term3236).add((Object)null);
        ((ArrayList) term3236).add((Object)null);
        Object term3230 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term3230, term3230.getClass(), "id", term3231);
        setField(term3230, term3230.getClass(), "users", term3233);
        setField(term3230, term3230.getClass(), "privileges", term3236);
        setField(term3230, term3230.getClass(), "name", "");
        ArrayList term3198 = new ArrayList();
        ((ArrayList) term3198).add(term3200);
        ((ArrayList) term3198).add(term3210);
        ((ArrayList) term3198).add(term3220);
        ((ArrayList) term3198).add(term3230);
        ((ArrayList) term3198).add(term3210);
        term3119 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.User"));
        Object term3255 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3256 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3260 = newInstance(Class.forName("java.time.LocalTime"));
        Object term3265 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3266 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3270 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term3119, term3119.getClass(), "id", term3120);
        setField(term3119, term3119.getClass(), "membername", "IlBhdrCvHq");
        setField(term3119, term3119.getClass(), "email", "OirVUQhauU");
        setField(term3119, term3119.getClass(), "password", "GLbyDfbNZI");
        setField(term3119, term3119.getClass(), "enabled", term3158);
        setField(term3119, term3119.getClass(), "age", term3160);
        setField(term3119, term3119.getClass(), "phoneNumber", "oNLcCYDAsO");
        setField(term3119, term3119.getClass(), "country", "CNqMxLvtcJ");
        setField(term3119, term3119.getClass(), "birthdate", "ktbqerIaKW");
        setField(term3119, term3119.getClass(), "roles", term3198);
        setBooleanField(term3119, term3119.getClass(), "isUsing2FA", false);
        setField(term3119, term3119.getClass(), "secret", "bEmHScVZaQ");
        setIntField(term3256, term3256.getClass(), "year", 2028);
        setShortField(term3256, term3256.getClass(), "month", (short) 4);
        setShortField(term3256, term3256.getClass(), "day", (short) 11);
        setField(term3255, term3255.getClass(), "date", term3256);
        setByteField(term3260, term3260.getClass(), "hour", (byte) 4);
        setByteField(term3260, term3260.getClass(), "minute", (byte) 45);
        setByteField(term3260, term3260.getClass(), "second", (byte) 2);
        setIntField(term3260, term3260.getClass(), "nano", 374177968);
        setField(term3255, term3255.getClass(), "time", term3260);
        setField(term3119, term3119.getClass(), "regDate", term3255);
        setIntField(term3266, term3266.getClass(), "year", 2021);
        setShortField(term3266, term3266.getClass(), "month", (short) 4);
        setShortField(term3266, term3266.getClass(), "day", (short) 22);
        setField(term3265, term3265.getClass(), "date", term3266);
        setByteField(term3270, term3270.getClass(), "hour", (byte) 17);
        setByteField(term3270, term3270.getClass(), "minute", (byte) 6);
        setByteField(term3270, term3270.getClass(), "second", (byte) 33);
        setIntField(term3270, term3270.getClass(), "nano", 21410850);
        setField(term3265, term3265.getClass(), "time", term3270);
        setField(term3119, term3119.getClass(), "modDate", term3265);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAge", argTypes, term3119, args);
    }

};


