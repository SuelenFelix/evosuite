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

public class JwtRefreshToken_canEqual_15098621742 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27334;
     Object term27533;

    public JwtRefreshToken_canEqual_15098621742() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term27335 = new Long(-872408877635399846L);
        Long term27350 = new Long(-6901566663896579785L);
        Long term27353 = new Long(5118165509511383169L);
        Boolean term27391 = new Boolean(false);
        Integer term27393 = new Integer(-1292704466);
        ArrayList term27431 = new ArrayList();
        ((ArrayList) term27431).add((Object)null);
        Long term27493 = new Long(-8124278437144435231L);
        Long term27508 = new Long(7732659324628481307L);
        Long term27515 = new Long(-3474044978480774340L);
        Long term27517 = new Long(2068458621990556070L);
        Boolean term27519 = new Boolean(true);
        Long term27521 = new Long(-3300207888965272273L);
        Boolean term27526 = new Boolean(false);
        Long term27528 = new Long(-79769691928375280L);
        term27334 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.JwtRefreshToken"));
        Object term27349 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.JwtUserDevice"));
        Object term27352 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.User"));
        Object term27448 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term27449 = newInstance(Class.forName("java.time.LocalDate"));
        Object term27453 = newInstance(Class.forName("java.time.LocalTime"));
        Object term27458 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term27459 = newInstance(Class.forName("java.time.LocalDate"));
        Object term27463 = newInstance(Class.forName("java.time.LocalTime"));
        Object term27492 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.JwtRefreshToken"));
        Object term27507 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.JwtUserDevice"));
        Object term27510 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.User"));
        Object term27514 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.JwtRefreshToken"));
        Object term27523 = newInstance(Class.forName("java.time.Instant"));
        Object term27530 = newInstance(Class.forName("java.time.Instant"));
        setField(term27334, term27334.getClass(), "id", term27335);
        setField(term27334, term27334.getClass(), "token", "hEkfLXneNw");
        setField(term27349, term27349.getClass(), "id", term27350);
        setField(term27352, term27352.getClass(), "id", term27353);
        setField(term27352, term27352.getClass(), "membername", "RcaCLEZXeW");
        setField(term27352, term27352.getClass(), "email", "QkGvmhgHMp");
        setField(term27352, term27352.getClass(), "password", "LubciqAmSz");
        setField(term27352, term27352.getClass(), "enabled", term27391);
        setField(term27352, term27352.getClass(), "age", term27393);
        setField(term27352, term27352.getClass(), "phoneNumber", "cwOkbHJWZu");
        setField(term27352, term27352.getClass(), "country", "zgUqpRpIHH");
        setField(term27352, term27352.getClass(), "birthdate", "CKfRJfocoI");
        setField(term27352, term27352.getClass(), "roles", term27431);
        setBooleanField(term27352, term27352.getClass(), "isUsing2FA", true);
        setField(term27352, term27352.getClass(), "secret", "drPIYSWWXx");
        setIntField(term27449, term27449.getClass(), "year", 2022);
        setShortField(term27449, term27449.getClass(), "month", (short) 9);
        setShortField(term27449, term27449.getClass(), "day", (short) 23);
        setField(term27448, term27448.getClass(), "date", term27449);
        setByteField(term27453, term27453.getClass(), "hour", (byte) 9);
        setByteField(term27453, term27453.getClass(), "minute", (byte) 58);
        setByteField(term27453, term27453.getClass(), "second", (byte) 40);
        setIntField(term27453, term27453.getClass(), "nano", 542827427);
        setField(term27448, term27448.getClass(), "time", term27453);
        setField(term27352, term27352.getClass(), "regDate", term27448);
        setIntField(term27459, term27459.getClass(), "year", 2011);
        setShortField(term27459, term27459.getClass(), "month", (short) 3);
        setShortField(term27459, term27459.getClass(), "day", (short) 16);
        setField(term27458, term27458.getClass(), "date", term27459);
        setByteField(term27463, term27463.getClass(), "hour", (byte) 16);
        setByteField(term27463, term27463.getClass(), "minute", (byte) 29);
        setByteField(term27463, term27463.getClass(), "second", (byte) 38);
        setIntField(term27463, term27463.getClass(), "nano", 14620604);
        setField(term27458, term27458.getClass(), "time", term27463);
        setField(term27352, term27352.getClass(), "modDate", term27458);
        setField(term27349, term27349.getClass(), "user", term27352);
        setField(term27349, term27349.getClass(), "deviceType", "WzLxpLKFtm");
        setField(term27349, term27349.getClass(), "deviceId", "msvJdZPPTe");
        setField(term27492, term27492.getClass(), "id", term27493);
        setField(term27492, term27492.getClass(), "token", "wbmmtLxBzZ");
        setField(term27507, term27507.getClass(), "id", term27508);
        setField(term27510, term27510.getClass(), "id", null);
        setField(term27510, term27510.getClass(), "membername", null);
        setField(term27510, term27510.getClass(), "email", null);
        setField(term27510, term27510.getClass(), "password", null);
        setField(term27510, term27510.getClass(), "enabled", null);
        setField(term27510, term27510.getClass(), "age", null);
        setField(term27510, term27510.getClass(), "phoneNumber", null);
        setField(term27510, term27510.getClass(), "country", null);
        setField(term27510, term27510.getClass(), "birthdate", null);
        setField(term27510, term27510.getClass(), "roles", null);
        setBooleanField(term27510, term27510.getClass(), "isUsing2FA", false);
        setField(term27510, term27510.getClass(), "secret", null);
        setField(term27510, term27510.getClass(), "regDate", null);
        setField(term27510, term27510.getClass(), "modDate", null);
        setField(term27507, term27507.getClass(), "user", term27510);
        setField(term27507, term27507.getClass(), "deviceType", "");
        setField(term27507, term27507.getClass(), "deviceId", "");
        setField(term27514, term27514.getClass(), "id", term27515);
        setField(term27514, term27514.getClass(), "token", null);
        setField(term27514, term27514.getClass(), "userDevice", null);
        setField(term27514, term27514.getClass(), "refreshCount", term27517);
        setField(term27514, term27514.getClass(), "expiryDate", null);
        setField(term27507, term27507.getClass(), "refreshToken", term27514);
        setField(term27507, term27507.getClass(), "isRefreshActive", term27519);
        setField(term27492, term27492.getClass(), "userDevice", term27507);
        setField(term27492, term27492.getClass(), "refreshCount", term27521);
        setLongField(term27523, term27523.getClass(), "seconds", 1584136591L);
        setIntField(term27523, term27523.getClass(), "nanos", 305000000);
        setField(term27492, term27492.getClass(), "expiryDate", term27523);
        setField(term27349, term27349.getClass(), "refreshToken", term27492);
        setField(term27349, term27349.getClass(), "isRefreshActive", term27526);
        setField(term27334, term27334.getClass(), "userDevice", term27349);
        setField(term27334, term27334.getClass(), "refreshCount", term27528);
        setLongField(term27530, term27530.getClass(), "seconds", 1309132342L);
        setIntField(term27530, term27530.getClass(), "nanos", 717000000);
        setField(term27334, term27334.getClass(), "expiryDate", term27530);
        term27533 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.JwtRefreshToken");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term27533;
        callMethod(klass, "canEqual", argTypes, term27334, args);
    }

};


