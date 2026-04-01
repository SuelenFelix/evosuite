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

public class UserLocation_setId_9985167553 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8443;
     Object term8582;

    public UserLocation_setId_9985167553() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term8444 = new Long(-8699693633047465617L);
        Long term8460 = new Long(-590890905395927244L);
        Boolean term8498 = new Boolean(false);
        Integer term8500 = new Integer(663292551);
        Long term8541 = new Long(6978548804004471804L);
        Object term8540 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term8540, term8540.getClass(), "id", term8541);
        setField(term8540, term8540.getClass(), "users", null);
        setField(term8540, term8540.getClass(), "privileges", null);
        setField(term8540, term8540.getClass(), "name", null);
        Object term8543 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term8543, term8543.getClass(), "id", null);
        setField(term8543, term8543.getClass(), "users", null);
        setField(term8543, term8543.getClass(), "privileges", null);
        setField(term8543, term8543.getClass(), "name", null);
        Object term8544 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term8544, term8544.getClass(), "id", null);
        setField(term8544, term8544.getClass(), "users", null);
        setField(term8544, term8544.getClass(), "privileges", null);
        setField(term8544, term8544.getClass(), "name", null);
        Object term8545 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term8545, term8545.getClass(), "id", null);
        setField(term8545, term8545.getClass(), "users", null);
        setField(term8545, term8545.getClass(), "privileges", null);
        setField(term8545, term8545.getClass(), "name", null);
        Object term8546 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term8546, term8546.getClass(), "id", null);
        setField(term8546, term8546.getClass(), "users", null);
        setField(term8546, term8546.getClass(), "privileges", null);
        setField(term8546, term8546.getClass(), "name", null);
        ArrayList term8538 = new ArrayList();
        ((ArrayList) term8538).add(term8540);
        ((ArrayList) term8538).add(term8543);
        ((ArrayList) term8538).add(term8544);
        ((ArrayList) term8538).add(term8545);
        ((ArrayList) term8538).add(term8543);
        ((ArrayList) term8538).add(term8546);
        ((ArrayList) term8538).add(term8545);
        ((ArrayList) term8538).add(term8546);
        term8443 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.UserLocation"));
        Object term8459 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.User"));
        Object term8562 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term8563 = newInstance(Class.forName("java.time.LocalDate"));
        Object term8567 = newInstance(Class.forName("java.time.LocalTime"));
        Object term8572 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term8573 = newInstance(Class.forName("java.time.LocalDate"));
        Object term8577 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term8443, term8443.getClass(), "id", term8444);
        setField(term8443, term8443.getClass(), "country", "AvdsiEyCve");
        setBooleanField(term8443, term8443.getClass(), "enabled", true);
        setField(term8459, term8459.getClass(), "id", term8460);
        setField(term8459, term8459.getClass(), "membername", "XMArCaVAEc");
        setField(term8459, term8459.getClass(), "email", "URWnZtbrQH");
        setField(term8459, term8459.getClass(), "password", "hpTAdtnQku");
        setField(term8459, term8459.getClass(), "enabled", term8498);
        setField(term8459, term8459.getClass(), "age", term8500);
        setField(term8459, term8459.getClass(), "phoneNumber", "GdMAXFBAtl");
        setField(term8459, term8459.getClass(), "country", "KWVRAlcIqd");
        setField(term8459, term8459.getClass(), "birthdate", "GeVOqtDiGv");
        setField(term8459, term8459.getClass(), "roles", term8538);
        setBooleanField(term8459, term8459.getClass(), "isUsing2FA", true);
        setField(term8459, term8459.getClass(), "secret", "fNzFTiRCjp");
        setIntField(term8563, term8563.getClass(), "year", 2018);
        setShortField(term8563, term8563.getClass(), "month", (short) 9);
        setShortField(term8563, term8563.getClass(), "day", (short) 19);
        setField(term8562, term8562.getClass(), "date", term8563);
        setByteField(term8567, term8567.getClass(), "hour", (byte) 23);
        setByteField(term8567, term8567.getClass(), "minute", (byte) 30);
        setByteField(term8567, term8567.getClass(), "second", (byte) 11);
        setIntField(term8567, term8567.getClass(), "nano", 615798597);
        setField(term8562, term8562.getClass(), "time", term8567);
        setField(term8459, term8459.getClass(), "regDate", term8562);
        setIntField(term8573, term8573.getClass(), "year", 2021);
        setShortField(term8573, term8573.getClass(), "month", (short) 3);
        setShortField(term8573, term8573.getClass(), "day", (short) 13);
        setField(term8572, term8572.getClass(), "date", term8573);
        setByteField(term8577, term8577.getClass(), "hour", (byte) 11);
        setByteField(term8577, term8577.getClass(), "minute", (byte) 11);
        setByteField(term8577, term8577.getClass(), "second", (byte) 36);
        setIntField(term8577, term8577.getClass(), "nano", 411690155);
        setField(term8572, term8572.getClass(), "time", term8577);
        setField(term8459, term8459.getClass(), "modDate", term8572);
        setField(term8443, term8443.getClass(), "user", term8459);
        term8582 = new Long(-7181112149072926893L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.UserLocation");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term8582;
        callMethod(klass, "setId", argTypes, term8443, args);
    }

};


