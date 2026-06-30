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

public class VerificationToken_updateToken_106516228111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18952;

    public VerificationToken_updateToken_106516228111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term18953 = new Long(-2742794200189356451L);
        Long term18968 = new Long(784504767592240462L);
        Boolean term19006 = new Boolean(false);
        Integer term19008 = new Integer(947449400);
        Long term19049 = new Long(-2000525962887472969L);
        Object term19048 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term19048, term19048.getClass(), "id", term19049);
        setField(term19048, term19048.getClass(), "users", null);
        setField(term19048, term19048.getClass(), "privileges", null);
        setField(term19048, term19048.getClass(), "name", null);
        ArrayList term19046 = new ArrayList();
        ((ArrayList) term19046).add(term19048);
        term18952 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.VerificationToken"));
        Object term18967 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.User"));
        Object term19066 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term19067 = newInstance(Class.forName("java.time.LocalDate"));
        Object term19071 = newInstance(Class.forName("java.time.LocalTime"));
        Object term19076 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term19077 = newInstance(Class.forName("java.time.LocalDate"));
        Object term19081 = newInstance(Class.forName("java.time.LocalTime"));
        Object term19086 = newInstance(Class.forName("java.util.Date"));
        setField(term18952, term18952.getClass(), "id", term18953);
        setField(term18952, term18952.getClass(), "token", "JWaRuPqymE");
        setField(term18967, term18967.getClass(), "id", term18968);
        setField(term18967, term18967.getClass(), "membername", "nTasTwGyTu");
        setField(term18967, term18967.getClass(), "email", "qRRPimcPhW");
        setField(term18967, term18967.getClass(), "password", "vhGXukwBWg");
        setField(term18967, term18967.getClass(), "enabled", term19006);
        setField(term18967, term18967.getClass(), "age", term19008);
        setField(term18967, term18967.getClass(), "phoneNumber", "JahleHixdz");
        setField(term18967, term18967.getClass(), "country", "rnkTocCEbH");
        setField(term18967, term18967.getClass(), "birthdate", "wsDKWECjHf");
        setField(term18967, term18967.getClass(), "roles", term19046);
        setBooleanField(term18967, term18967.getClass(), "isUsing2FA", true);
        setField(term18967, term18967.getClass(), "secret", "NwcJhozXMr");
        setIntField(term19067, term19067.getClass(), "year", 2010);
        setShortField(term19067, term19067.getClass(), "month", (short) 1);
        setShortField(term19067, term19067.getClass(), "day", (short) 16);
        setField(term19066, term19066.getClass(), "date", term19067);
        setByteField(term19071, term19071.getClass(), "hour", (byte) 9);
        setByteField(term19071, term19071.getClass(), "minute", (byte) 12);
        setByteField(term19071, term19071.getClass(), "second", (byte) 44);
        setIntField(term19071, term19071.getClass(), "nano", 134721246);
        setField(term19066, term19066.getClass(), "time", term19071);
        setField(term18967, term18967.getClass(), "regDate", term19066);
        setIntField(term19077, term19077.getClass(), "year", 2018);
        setShortField(term19077, term19077.getClass(), "month", (short) 8);
        setShortField(term19077, term19077.getClass(), "day", (short) 29);
        setField(term19076, term19076.getClass(), "date", term19077);
        setByteField(term19081, term19081.getClass(), "hour", (byte) 10);
        setByteField(term19081, term19081.getClass(), "minute", (byte) 58);
        setByteField(term19081, term19081.getClass(), "second", (byte) 45);
        setIntField(term19081, term19081.getClass(), "nano", 987262592);
        setField(term19076, term19076.getClass(), "time", term19081);
        setField(term18967, term18967.getClass(), "modDate", term19076);
        setField(term18952, term18952.getClass(), "user", term18967);
        setLongField(term19086, term19086.getClass(), "fastTime", 1488725902101L);
        setField(term19086, term19086.getClass(), "cdate", null);
        setField(term18952, term18952.getClass(), "expiryDate", term19086);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.VerificationToken");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "nEgtuqAlLm";
        callMethod(klass, "updateToken", argTypes, term18952, args);
    }

};


