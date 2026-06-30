package kyungseo.poc.simple.web.security.components;

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
import static kyungseo.poc.simple.web.security.components.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.ArrayList;

public class UserSecurityService_isTokenFound_9405908912 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23;

    public UserSecurityService_isTokenFound_9405908912() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term24 = new Long(2442117782898005296L);
        Long term39 = new Long(6375119433582206027L);
        Boolean term77 = new Boolean(false);
        Integer term79 = new Integer(568599855);
        Long term120 = new Long(-8257434502486459194L);
        Object term119 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term119, term119.getClass(), "id", term120);
        setField(term119, term119.getClass(), "users", null);
        setField(term119, term119.getClass(), "privileges", null);
        setField(term119, term119.getClass(), "name", null);
        Object term122 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term122, term122.getClass(), "id", null);
        setField(term122, term122.getClass(), "users", null);
        setField(term122, term122.getClass(), "privileges", null);
        setField(term122, term122.getClass(), "name", null);
        Object term123 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term123, term123.getClass(), "id", null);
        setField(term123, term123.getClass(), "users", null);
        setField(term123, term123.getClass(), "privileges", null);
        setField(term123, term123.getClass(), "name", null);
        Object term124 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term124, term124.getClass(), "id", null);
        setField(term124, term124.getClass(), "users", null);
        setField(term124, term124.getClass(), "privileges", null);
        setField(term124, term124.getClass(), "name", null);
        ArrayList term117 = new ArrayList();
        ((ArrayList) term117).add(term119);
        ((ArrayList) term117).add(term122);
        ((ArrayList) term117).add(term123);
        ((ArrayList) term117).add(term122);
        ((ArrayList) term117).add(term124);
        term23 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.PasswordResetToken"));
        Object term38 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.User"));
        Object term140 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term141 = newInstance(Class.forName("java.time.LocalDate"));
        Object term145 = newInstance(Class.forName("java.time.LocalTime"));
        Object term150 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term151 = newInstance(Class.forName("java.time.LocalDate"));
        Object term155 = newInstance(Class.forName("java.time.LocalTime"));
        Object term160 = newInstance(Class.forName("java.util.Date"));
        setField(term23, term23.getClass(), "id", term24);
        setField(term23, term23.getClass(), "token", "sjlJAEtRrb");
        setField(term38, term38.getClass(), "id", term39);
        setField(term38, term38.getClass(), "membername", "MuLcgQHgqz");
        setField(term38, term38.getClass(), "email", "xxtlPwDYFs");
        setField(term38, term38.getClass(), "password", "jJCZpVmanW");
        setField(term38, term38.getClass(), "enabled", term77);
        setField(term38, term38.getClass(), "age", term79);
        setField(term38, term38.getClass(), "phoneNumber", "EGtDIRbSSb");
        setField(term38, term38.getClass(), "country", "SzjVpOQTyS");
        setField(term38, term38.getClass(), "birthdate", "MjGYSRKTNF");
        setField(term38, term38.getClass(), "roles", term117);
        setBooleanField(term38, term38.getClass(), "isUsing2FA", true);
        setField(term38, term38.getClass(), "secret", "LvJFtLBaxj");
        setIntField(term141, term141.getClass(), "year", 2017);
        setShortField(term141, term141.getClass(), "month", (short) 3);
        setShortField(term141, term141.getClass(), "day", (short) 5);
        setField(term140, term140.getClass(), "date", term141);
        setByteField(term145, term145.getClass(), "hour", (byte) 20);
        setByteField(term145, term145.getClass(), "minute", (byte) 34);
        setByteField(term145, term145.getClass(), "second", (byte) 55);
        setIntField(term145, term145.getClass(), "nano", 78024496);
        setField(term140, term140.getClass(), "time", term145);
        setField(term38, term38.getClass(), "regDate", term140);
        setIntField(term151, term151.getClass(), "year", 2020);
        setShortField(term151, term151.getClass(), "month", (short) 7);
        setShortField(term151, term151.getClass(), "day", (short) 24);
        setField(term150, term150.getClass(), "date", term151);
        setByteField(term155, term155.getClass(), "hour", (byte) 0);
        setByteField(term155, term155.getClass(), "minute", (byte) 59);
        setByteField(term155, term155.getClass(), "second", (byte) 56);
        setIntField(term155, term155.getClass(), "nano", 320219201);
        setField(term150, term150.getClass(), "time", term155);
        setField(term38, term38.getClass(), "modDate", term150);
        setField(term23, term23.getClass(), "user", term38);
        setLongField(term160, term160.getClass(), "fastTime", 1345871412244L);
        setField(term160, term160.getClass(), "cdate", null);
        setField(term23, term23.getClass(), "expiryDate", term160);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.security.components.UserSecurityService");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.PasswordResetToken");
        Object[] args = new Object[1];
        args[0] = term23;
        callMethod(klass, "isTokenFound", argTypes, null, args);
    }

};


