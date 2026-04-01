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

public class UserSecurityService_isTokenExpired_13349794483 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term242;

    public UserSecurityService_isTokenExpired_13349794483() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term243 = new Long(7009926388951271268L);
        Long term258 = new Long(-7672528020740371001L);
        Boolean term296 = new Boolean(false);
        Integer term298 = new Integer(1725571209);
        Long term339 = new Long(-4502405999831680926L);
        Object term338 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term338, term338.getClass(), "id", term339);
        setField(term338, term338.getClass(), "users", null);
        setField(term338, term338.getClass(), "privileges", null);
        setField(term338, term338.getClass(), "name", null);
        Object term341 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term341, term341.getClass(), "id", null);
        setField(term341, term341.getClass(), "users", null);
        setField(term341, term341.getClass(), "privileges", null);
        setField(term341, term341.getClass(), "name", null);
        Object term342 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term342, term342.getClass(), "id", null);
        setField(term342, term342.getClass(), "users", null);
        setField(term342, term342.getClass(), "privileges", null);
        setField(term342, term342.getClass(), "name", null);
        Long term344 = new Long(-5892135042702373494L);
        Object term343 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term343, term343.getClass(), "id", term344);
        setField(term343, term343.getClass(), "users", null);
        setField(term343, term343.getClass(), "privileges", null);
        setField(term343, term343.getClass(), "name", null);
        Object term346 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term346, term346.getClass(), "id", null);
        setField(term346, term346.getClass(), "users", null);
        setField(term346, term346.getClass(), "privileges", null);
        setField(term346, term346.getClass(), "name", null);
        Object term347 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term347, term347.getClass(), "id", null);
        setField(term347, term347.getClass(), "users", null);
        setField(term347, term347.getClass(), "privileges", null);
        setField(term347, term347.getClass(), "name", null);
        ArrayList term336 = new ArrayList();
        ((ArrayList) term336).add(term338);
        ((ArrayList) term336).add(term341);
        ((ArrayList) term336).add(term342);
        ((ArrayList) term336).add(term343);
        ((ArrayList) term336).add(term341);
        ((ArrayList) term336).add(term346);
        ((ArrayList) term336).add(term347);
        term242 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.PasswordResetToken"));
        Object term257 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.User"));
        Object term363 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term364 = newInstance(Class.forName("java.time.LocalDate"));
        Object term368 = newInstance(Class.forName("java.time.LocalTime"));
        Object term373 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term374 = newInstance(Class.forName("java.time.LocalDate"));
        Object term378 = newInstance(Class.forName("java.time.LocalTime"));
        Object term383 = newInstance(Class.forName("java.util.Date"));
        setField(term242, term242.getClass(), "id", term243);
        setField(term242, term242.getClass(), "token", "PHvxnGHptP");
        setField(term257, term257.getClass(), "id", term258);
        setField(term257, term257.getClass(), "membername", "TimdotUuNC");
        setField(term257, term257.getClass(), "email", "PkWMRdJcBb");
        setField(term257, term257.getClass(), "password", "jSpAteRute");
        setField(term257, term257.getClass(), "enabled", term296);
        setField(term257, term257.getClass(), "age", term298);
        setField(term257, term257.getClass(), "phoneNumber", "swZVeJAxjt");
        setField(term257, term257.getClass(), "country", "xOcJIiQQDu");
        setField(term257, term257.getClass(), "birthdate", "GVizqqzXpy");
        setField(term257, term257.getClass(), "roles", term336);
        setBooleanField(term257, term257.getClass(), "isUsing2FA", false);
        setField(term257, term257.getClass(), "secret", "sQvGcVjdEx");
        setIntField(term364, term364.getClass(), "year", 2023);
        setShortField(term364, term364.getClass(), "month", (short) 7);
        setShortField(term364, term364.getClass(), "day", (short) 16);
        setField(term363, term363.getClass(), "date", term364);
        setByteField(term368, term368.getClass(), "hour", (byte) 3);
        setByteField(term368, term368.getClass(), "minute", (byte) 1);
        setByteField(term368, term368.getClass(), "second", (byte) 19);
        setIntField(term368, term368.getClass(), "nano", 488629554);
        setField(term363, term363.getClass(), "time", term368);
        setField(term257, term257.getClass(), "regDate", term363);
        setIntField(term374, term374.getClass(), "year", 2018);
        setShortField(term374, term374.getClass(), "month", (short) 7);
        setShortField(term374, term374.getClass(), "day", (short) 12);
        setField(term373, term373.getClass(), "date", term374);
        setByteField(term378, term378.getClass(), "hour", (byte) 1);
        setByteField(term378, term378.getClass(), "minute", (byte) 3);
        setByteField(term378, term378.getClass(), "second", (byte) 47);
        setIntField(term378, term378.getClass(), "nano", 2729929);
        setField(term373, term373.getClass(), "time", term378);
        setField(term257, term257.getClass(), "modDate", term373);
        setField(term242, term242.getClass(), "user", term257);
        setLongField(term383, term383.getClass(), "fastTime", 1480438351369L);
        setField(term383, term383.getClass(), "cdate", null);
        setField(term242, term242.getClass(), "expiryDate", term383);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.security.components.UserSecurityService");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.PasswordResetToken");
        Object[] args = new Object[1];
        args[0] = term242;
        callMethod(klass, "isTokenExpired", argTypes, null, args);
    }

};


