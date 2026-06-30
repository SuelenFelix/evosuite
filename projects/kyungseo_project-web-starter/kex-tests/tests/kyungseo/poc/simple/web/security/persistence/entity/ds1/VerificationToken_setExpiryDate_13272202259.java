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

public class VerificationToken_setExpiryDate_13272202259 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18508;
     Object term18645;

    public VerificationToken_setExpiryDate_13272202259() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term18509 = new Long(-3649565702016413399L);
        Long term18524 = new Long(-373060971444161211L);
        Boolean term18562 = new Boolean(true);
        Integer term18564 = new Integer(-1736183862);
        Long term18605 = new Long(-2342559604213128910L);
        Object term18604 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term18604, term18604.getClass(), "id", term18605);
        setField(term18604, term18604.getClass(), "users", null);
        setField(term18604, term18604.getClass(), "privileges", null);
        setField(term18604, term18604.getClass(), "name", null);
        Object term18607 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term18607, term18607.getClass(), "id", null);
        setField(term18607, term18607.getClass(), "users", null);
        setField(term18607, term18607.getClass(), "privileges", null);
        setField(term18607, term18607.getClass(), "name", null);
        ArrayList term18602 = new ArrayList();
        ((ArrayList) term18602).add(term18604);
        ((ArrayList) term18602).add(term18607);
        term18508 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.VerificationToken"));
        Object term18523 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.User"));
        Object term18623 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term18624 = newInstance(Class.forName("java.time.LocalDate"));
        Object term18628 = newInstance(Class.forName("java.time.LocalTime"));
        Object term18633 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term18634 = newInstance(Class.forName("java.time.LocalDate"));
        Object term18638 = newInstance(Class.forName("java.time.LocalTime"));
        Object term18643 = newInstance(Class.forName("java.util.Date"));
        setField(term18508, term18508.getClass(), "id", term18509);
        setField(term18508, term18508.getClass(), "token", "jtfkxwFefh");
        setField(term18523, term18523.getClass(), "id", term18524);
        setField(term18523, term18523.getClass(), "membername", "ESnYpdjELS");
        setField(term18523, term18523.getClass(), "email", "IsOpDBwqZb");
        setField(term18523, term18523.getClass(), "password", "GBSKSryDNr");
        setField(term18523, term18523.getClass(), "enabled", term18562);
        setField(term18523, term18523.getClass(), "age", term18564);
        setField(term18523, term18523.getClass(), "phoneNumber", "lewYJfdwbu");
        setField(term18523, term18523.getClass(), "country", "wmCdnKXFIV");
        setField(term18523, term18523.getClass(), "birthdate", "OQFYTZSsmT");
        setField(term18523, term18523.getClass(), "roles", term18602);
        setBooleanField(term18523, term18523.getClass(), "isUsing2FA", false);
        setField(term18523, term18523.getClass(), "secret", "FYhlObvAKO");
        setIntField(term18624, term18624.getClass(), "year", 2017);
        setShortField(term18624, term18624.getClass(), "month", (short) 7);
        setShortField(term18624, term18624.getClass(), "day", (short) 7);
        setField(term18623, term18623.getClass(), "date", term18624);
        setByteField(term18628, term18628.getClass(), "hour", (byte) 12);
        setByteField(term18628, term18628.getClass(), "minute", (byte) 29);
        setByteField(term18628, term18628.getClass(), "second", (byte) 38);
        setIntField(term18628, term18628.getClass(), "nano", 396071426);
        setField(term18623, term18623.getClass(), "time", term18628);
        setField(term18523, term18523.getClass(), "regDate", term18623);
        setIntField(term18634, term18634.getClass(), "year", 2025);
        setShortField(term18634, term18634.getClass(), "month", (short) 12);
        setShortField(term18634, term18634.getClass(), "day", (short) 4);
        setField(term18633, term18633.getClass(), "date", term18634);
        setByteField(term18638, term18638.getClass(), "hour", (byte) 20);
        setByteField(term18638, term18638.getClass(), "minute", (byte) 48);
        setByteField(term18638, term18638.getClass(), "second", (byte) 37);
        setIntField(term18638, term18638.getClass(), "nano", 178948777);
        setField(term18633, term18633.getClass(), "time", term18638);
        setField(term18523, term18523.getClass(), "modDate", term18633);
        setField(term18508, term18508.getClass(), "user", term18523);
        setLongField(term18643, term18643.getClass(), "fastTime", 1659994192918L);
        setField(term18643, term18643.getClass(), "cdate", null);
        setField(term18508, term18508.getClass(), "expiryDate", term18643);
        term18645 = newInstance(Class.forName("java.util.Date"));
        setLongField(term18645, term18645.getClass(), "fastTime", 1876872800559L);
        setField(term18645, term18645.getClass(), "cdate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.VerificationToken");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Date");
        Object[] args = new Object[1];
        args[0] = term18645;
        callMethod(klass, "setExpiryDate", argTypes, term18508, args);
    }

};


