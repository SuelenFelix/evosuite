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

public class VerificationToken_getExpiryDate_183152918 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18290;

    public VerificationToken_getExpiryDate_183152918() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term18291 = new Long(38900113635378049L);
        Long term18306 = new Long(2167389818358075653L);
        Boolean term18344 = new Boolean(true);
        Integer term18346 = new Integer(-1549607466);
        Long term18387 = new Long(2371696206810185880L);
        Object term18386 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term18386, term18386.getClass(), "id", term18387);
        setField(term18386, term18386.getClass(), "users", null);
        setField(term18386, term18386.getClass(), "privileges", null);
        setField(term18386, term18386.getClass(), "name", null);
        Object term18389 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term18389, term18389.getClass(), "id", null);
        setField(term18389, term18389.getClass(), "users", null);
        setField(term18389, term18389.getClass(), "privileges", null);
        setField(term18389, term18389.getClass(), "name", null);
        Object term18390 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term18390, term18390.getClass(), "id", null);
        setField(term18390, term18390.getClass(), "users", null);
        setField(term18390, term18390.getClass(), "privileges", null);
        setField(term18390, term18390.getClass(), "name", null);
        ArrayList term18384 = new ArrayList();
        ((ArrayList) term18384).add(term18386);
        ((ArrayList) term18384).add(term18389);
        ((ArrayList) term18384).add(term18390);
        term18290 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.VerificationToken"));
        Object term18305 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.User"));
        Object term18406 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term18407 = newInstance(Class.forName("java.time.LocalDate"));
        Object term18411 = newInstance(Class.forName("java.time.LocalTime"));
        Object term18416 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term18417 = newInstance(Class.forName("java.time.LocalDate"));
        Object term18421 = newInstance(Class.forName("java.time.LocalTime"));
        Object term18426 = newInstance(Class.forName("java.util.Date"));
        setField(term18290, term18290.getClass(), "id", term18291);
        setField(term18290, term18290.getClass(), "token", "tdDWYXQBpB");
        setField(term18305, term18305.getClass(), "id", term18306);
        setField(term18305, term18305.getClass(), "membername", "yLbSZvdjZX");
        setField(term18305, term18305.getClass(), "email", "FhCGxrukXm");
        setField(term18305, term18305.getClass(), "password", "KAmjFnlvKU");
        setField(term18305, term18305.getClass(), "enabled", term18344);
        setField(term18305, term18305.getClass(), "age", term18346);
        setField(term18305, term18305.getClass(), "phoneNumber", "VKpNTpPbui");
        setField(term18305, term18305.getClass(), "country", "TuzuoEoycc");
        setField(term18305, term18305.getClass(), "birthdate", "LXWldHIZNy");
        setField(term18305, term18305.getClass(), "roles", term18384);
        setBooleanField(term18305, term18305.getClass(), "isUsing2FA", false);
        setField(term18305, term18305.getClass(), "secret", "rlLIYBJlxU");
        setIntField(term18407, term18407.getClass(), "year", 2017);
        setShortField(term18407, term18407.getClass(), "month", (short) 10);
        setShortField(term18407, term18407.getClass(), "day", (short) 4);
        setField(term18406, term18406.getClass(), "date", term18407);
        setByteField(term18411, term18411.getClass(), "hour", (byte) 1);
        setByteField(term18411, term18411.getClass(), "minute", (byte) 21);
        setByteField(term18411, term18411.getClass(), "second", (byte) 3);
        setIntField(term18411, term18411.getClass(), "nano", 164928538);
        setField(term18406, term18406.getClass(), "time", term18411);
        setField(term18305, term18305.getClass(), "regDate", term18406);
        setIntField(term18417, term18417.getClass(), "year", 2014);
        setShortField(term18417, term18417.getClass(), "month", (short) 5);
        setShortField(term18417, term18417.getClass(), "day", (short) 12);
        setField(term18416, term18416.getClass(), "date", term18417);
        setByteField(term18421, term18421.getClass(), "hour", (byte) 21);
        setByteField(term18421, term18421.getClass(), "minute", (byte) 50);
        setByteField(term18421, term18421.getClass(), "second", (byte) 24);
        setIntField(term18421, term18421.getClass(), "nano", 165505767);
        setField(term18416, term18416.getClass(), "time", term18421);
        setField(term18305, term18305.getClass(), "modDate", term18416);
        setField(term18290, term18290.getClass(), "user", term18305);
        setLongField(term18426, term18426.getClass(), "fastTime", 1442370534632L);
        setField(term18426, term18426.getClass(), "cdate", null);
        setField(term18290, term18290.getClass(), "expiryDate", term18426);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.VerificationToken");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getExpiryDate", argTypes, term18290, args);
    }

};


