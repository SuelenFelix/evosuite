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

public class PasswordResetToken_setToken_4396955715 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14193;

    public PasswordResetToken_setToken_4396955715() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term14194 = new Long(5874242482849721868L);
        Long term14209 = new Long(682045578778432659L);
        Boolean term14247 = new Boolean(true);
        Integer term14249 = new Integer(-1351605385);
        Long term14290 = new Long(-1059217926759861865L);
        Object term14289 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term14289, term14289.getClass(), "id", term14290);
        setField(term14289, term14289.getClass(), "users", null);
        setField(term14289, term14289.getClass(), "privileges", null);
        setField(term14289, term14289.getClass(), "name", null);
        Object term14292 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term14292, term14292.getClass(), "id", null);
        setField(term14292, term14292.getClass(), "users", null);
        setField(term14292, term14292.getClass(), "privileges", null);
        setField(term14292, term14292.getClass(), "name", null);
        Long term14294 = new Long(8180021874498524998L);
        Object term14293 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term14293, term14293.getClass(), "id", term14294);
        setField(term14293, term14293.getClass(), "users", null);
        setField(term14293, term14293.getClass(), "privileges", null);
        setField(term14293, term14293.getClass(), "name", null);
        Long term14297 = new Long(8578289401978257809L);
        Object term14296 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term14296, term14296.getClass(), "id", term14297);
        setField(term14296, term14296.getClass(), "users", null);
        setField(term14296, term14296.getClass(), "privileges", null);
        setField(term14296, term14296.getClass(), "name", null);
        Long term14300 = new Long(60910260492008727L);
        Object term14299 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term14299, term14299.getClass(), "id", term14300);
        setField(term14299, term14299.getClass(), "users", null);
        setField(term14299, term14299.getClass(), "privileges", null);
        setField(term14299, term14299.getClass(), "name", null);
        ArrayList term14287 = new ArrayList();
        ((ArrayList) term14287).add(term14289);
        ((ArrayList) term14287).add(term14292);
        ((ArrayList) term14287).add(term14293);
        ((ArrayList) term14287).add(term14296);
        ((ArrayList) term14287).add(term14299);
        ((ArrayList) term14287).add(term14292);
        ((ArrayList) term14287).add(term14296);
        ((ArrayList) term14287).add(term14299);
        term14193 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.PasswordResetToken"));
        Object term14208 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.User"));
        Object term14317 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term14318 = newInstance(Class.forName("java.time.LocalDate"));
        Object term14322 = newInstance(Class.forName("java.time.LocalTime"));
        Object term14327 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term14328 = newInstance(Class.forName("java.time.LocalDate"));
        Object term14332 = newInstance(Class.forName("java.time.LocalTime"));
        Object term14337 = newInstance(Class.forName("java.util.Date"));
        setField(term14193, term14193.getClass(), "id", term14194);
        setField(term14193, term14193.getClass(), "token", "BMskFMPoeb");
        setField(term14208, term14208.getClass(), "id", term14209);
        setField(term14208, term14208.getClass(), "membername", "LdfzgJfEqK");
        setField(term14208, term14208.getClass(), "email", "YdzBhsGATX");
        setField(term14208, term14208.getClass(), "password", "IxrOGCWNvM");
        setField(term14208, term14208.getClass(), "enabled", term14247);
        setField(term14208, term14208.getClass(), "age", term14249);
        setField(term14208, term14208.getClass(), "phoneNumber", "ixwssTuJbB");
        setField(term14208, term14208.getClass(), "country", "IXdiuaFyFC");
        setField(term14208, term14208.getClass(), "birthdate", "CLVzSrhOjS");
        setField(term14208, term14208.getClass(), "roles", term14287);
        setBooleanField(term14208, term14208.getClass(), "isUsing2FA", false);
        setField(term14208, term14208.getClass(), "secret", "gXyUtfRzMt");
        setIntField(term14318, term14318.getClass(), "year", 2014);
        setShortField(term14318, term14318.getClass(), "month", (short) 12);
        setShortField(term14318, term14318.getClass(), "day", (short) 28);
        setField(term14317, term14317.getClass(), "date", term14318);
        setByteField(term14322, term14322.getClass(), "hour", (byte) 2);
        setByteField(term14322, term14322.getClass(), "minute", (byte) 44);
        setByteField(term14322, term14322.getClass(), "second", (byte) 18);
        setIntField(term14322, term14322.getClass(), "nano", 39913942);
        setField(term14317, term14317.getClass(), "time", term14322);
        setField(term14208, term14208.getClass(), "regDate", term14317);
        setIntField(term14328, term14328.getClass(), "year", 2020);
        setShortField(term14328, term14328.getClass(), "month", (short) 11);
        setShortField(term14328, term14328.getClass(), "day", (short) 29);
        setField(term14327, term14327.getClass(), "date", term14328);
        setByteField(term14332, term14332.getClass(), "hour", (byte) 0);
        setByteField(term14332, term14332.getClass(), "minute", (byte) 40);
        setByteField(term14332, term14332.getClass(), "second", (byte) 23);
        setIntField(term14332, term14332.getClass(), "nano", 204732115);
        setField(term14327, term14327.getClass(), "time", term14332);
        setField(term14208, term14208.getClass(), "modDate", term14327);
        setField(term14193, term14193.getClass(), "user", term14208);
        setLongField(term14337, term14337.getClass(), "fastTime", 1882638884364L);
        setField(term14337, term14337.getClass(), "cdate", null);
        setField(term14193, term14193.getClass(), "expiryDate", term14337);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.PasswordResetToken");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "RUmloTNkOF";
        callMethod(klass, "setToken", argTypes, term14193, args);
    }

};


