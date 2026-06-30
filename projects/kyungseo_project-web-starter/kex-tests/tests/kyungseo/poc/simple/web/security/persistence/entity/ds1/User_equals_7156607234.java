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

public class User_equals_7156607234 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1416;
     Object term1542;

    public User_equals_7156607234() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1417 = new Long(682356318767179819L);
        Boolean term1455 = new Boolean(true);
        Integer term1457 = new Integer(-1685132342);
        Long term1498 = new Long(-7291743527973326814L);
        ArrayList term1500 = new ArrayList();
        ((ArrayList) term1500).add((Object)null);
        ((ArrayList) term1500).add((Object)null);
        ((ArrayList) term1500).add((Object)null);
        ((ArrayList) term1500).add((Object)null);
        ((ArrayList) term1500).add((Object)null);
        ((ArrayList) term1500).add((Object)null);
        ArrayList term1503 = new ArrayList();
        ((ArrayList) term1503).add((Object)null);
        ((ArrayList) term1503).add((Object)null);
        ((ArrayList) term1503).add((Object)null);
        ((ArrayList) term1503).add((Object)null);
        Object term1497 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term1497, term1497.getClass(), "id", term1498);
        setField(term1497, term1497.getClass(), "users", term1500);
        setField(term1497, term1497.getClass(), "privileges", term1503);
        setField(term1497, term1497.getClass(), "name", "");
        ArrayList term1495 = new ArrayList();
        ((ArrayList) term1495).add(term1497);
        term1416 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.User"));
        Object term1522 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1523 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1527 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1532 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1533 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1537 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term1416, term1416.getClass(), "id", term1417);
        setField(term1416, term1416.getClass(), "membername", "sQvGcVjdEx");
        setField(term1416, term1416.getClass(), "email", "rLHAoqXgPh");
        setField(term1416, term1416.getClass(), "password", "zUlRdimJtU");
        setField(term1416, term1416.getClass(), "enabled", term1455);
        setField(term1416, term1416.getClass(), "age", term1457);
        setField(term1416, term1416.getClass(), "phoneNumber", "vwbEQQNQrx");
        setField(term1416, term1416.getClass(), "country", "xtftXXMbem");
        setField(term1416, term1416.getClass(), "birthdate", "cudZvLMQon");
        setField(term1416, term1416.getClass(), "roles", term1495);
        setBooleanField(term1416, term1416.getClass(), "isUsing2FA", false);
        setField(term1416, term1416.getClass(), "secret", "RMsXuyzKJV");
        setIntField(term1523, term1523.getClass(), "year", 2023);
        setShortField(term1523, term1523.getClass(), "month", (short) 7);
        setShortField(term1523, term1523.getClass(), "day", (short) 16);
        setField(term1522, term1522.getClass(), "date", term1523);
        setByteField(term1527, term1527.getClass(), "hour", (byte) 3);
        setByteField(term1527, term1527.getClass(), "minute", (byte) 1);
        setByteField(term1527, term1527.getClass(), "second", (byte) 19);
        setIntField(term1527, term1527.getClass(), "nano", 488629554);
        setField(term1522, term1522.getClass(), "time", term1527);
        setField(term1416, term1416.getClass(), "regDate", term1522);
        setIntField(term1533, term1533.getClass(), "year", 2018);
        setShortField(term1533, term1533.getClass(), "month", (short) 7);
        setShortField(term1533, term1533.getClass(), "day", (short) 12);
        setField(term1532, term1532.getClass(), "date", term1533);
        setByteField(term1537, term1537.getClass(), "hour", (byte) 1);
        setByteField(term1537, term1537.getClass(), "minute", (byte) 3);
        setByteField(term1537, term1537.getClass(), "second", (byte) 47);
        setIntField(term1537, term1537.getClass(), "nano", 2729929);
        setField(term1532, term1532.getClass(), "time", term1537);
        setField(term1416, term1416.getClass(), "modDate", term1532);
        term1542 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term1542;
        callMethod(klass, "equals", argTypes, term1416, args);
    }

};


