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

public class NewLocationToken_getToken_6091094865 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11604;

    public NewLocationToken_getToken_6091094865() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term11605 = new Long(4977537501907213732L);
        Long term11620 = new Long(-2341942457089205755L);
        Long term11636 = new Long(-7503147844796296300L);
        Boolean term11674 = new Boolean(false);
        Integer term11676 = new Integer(34470066);
        ArrayList term11714 = new ArrayList();
        ((ArrayList) term11714).add((Object)null);
        ((ArrayList) term11714).add((Object)null);
        ((ArrayList) term11714).add((Object)null);
        term11604 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.NewLocationToken"));
        Object term11619 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.UserLocation"));
        Object term11635 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.User"));
        Object term11731 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term11732 = newInstance(Class.forName("java.time.LocalDate"));
        Object term11736 = newInstance(Class.forName("java.time.LocalTime"));
        Object term11741 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term11742 = newInstance(Class.forName("java.time.LocalDate"));
        Object term11746 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term11604, term11604.getClass(), "id", term11605);
        setField(term11604, term11604.getClass(), "token", "GvmOxwMrOk");
        setField(term11619, term11619.getClass(), "id", term11620);
        setField(term11619, term11619.getClass(), "country", "WXUKmhwFsK");
        setBooleanField(term11619, term11619.getClass(), "enabled", false);
        setField(term11635, term11635.getClass(), "id", term11636);
        setField(term11635, term11635.getClass(), "membername", "OcfokBTzZZ");
        setField(term11635, term11635.getClass(), "email", "zeBhlhyhkL");
        setField(term11635, term11635.getClass(), "password", "PxinRhWgwT");
        setField(term11635, term11635.getClass(), "enabled", term11674);
        setField(term11635, term11635.getClass(), "age", term11676);
        setField(term11635, term11635.getClass(), "phoneNumber", "pZcEKUNIXL");
        setField(term11635, term11635.getClass(), "country", "QbRtvZIDtW");
        setField(term11635, term11635.getClass(), "birthdate", "fbsmDvjMqr");
        setField(term11635, term11635.getClass(), "roles", term11714);
        setBooleanField(term11635, term11635.getClass(), "isUsing2FA", true);
        setField(term11635, term11635.getClass(), "secret", "MwiFLgdSDA");
        setIntField(term11732, term11732.getClass(), "year", 2024);
        setShortField(term11732, term11732.getClass(), "month", (short) 5);
        setShortField(term11732, term11732.getClass(), "day", (short) 8);
        setField(term11731, term11731.getClass(), "date", term11732);
        setByteField(term11736, term11736.getClass(), "hour", (byte) 10);
        setByteField(term11736, term11736.getClass(), "minute", (byte) 21);
        setByteField(term11736, term11736.getClass(), "second", (byte) 1);
        setIntField(term11736, term11736.getClass(), "nano", 912060546);
        setField(term11731, term11731.getClass(), "time", term11736);
        setField(term11635, term11635.getClass(), "regDate", term11731);
        setIntField(term11742, term11742.getClass(), "year", 2016);
        setShortField(term11742, term11742.getClass(), "month", (short) 1);
        setShortField(term11742, term11742.getClass(), "day", (short) 22);
        setField(term11741, term11741.getClass(), "date", term11742);
        setByteField(term11746, term11746.getClass(), "hour", (byte) 23);
        setByteField(term11746, term11746.getClass(), "minute", (byte) 0);
        setByteField(term11746, term11746.getClass(), "second", (byte) 1);
        setIntField(term11746, term11746.getClass(), "nano", 558329369);
        setField(term11741, term11741.getClass(), "time", term11746);
        setField(term11635, term11635.getClass(), "modDate", term11741);
        setField(term11619, term11619.getClass(), "user", term11635);
        setField(term11604, term11604.getClass(), "userLocation", term11619);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.NewLocationToken");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getToken", argTypes, term11604, args);
    }

};


