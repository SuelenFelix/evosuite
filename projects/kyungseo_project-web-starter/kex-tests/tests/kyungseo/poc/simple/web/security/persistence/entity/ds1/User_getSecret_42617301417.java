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

public class User_getSecret_42617301417 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4475;

    public User_getSecret_42617301417() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4476 = new Long(8000844860910174690L);
        Boolean term4514 = new Boolean(false);
        Integer term4516 = new Integer(335112684);
        Long term4557 = new Long(2209808079059619773L);
        ArrayList term4559 = new ArrayList();
        ((ArrayList) term4559).add((Object)null);
        ArrayList term4562 = new ArrayList();
        ((ArrayList) term4562).add((Object)null);
        ((ArrayList) term4562).add((Object)null);
        ((ArrayList) term4562).add((Object)null);
        ((ArrayList) term4562).add((Object)null);
        ((ArrayList) term4562).add((Object)null);
        Object term4556 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term4556, term4556.getClass(), "id", term4557);
        setField(term4556, term4556.getClass(), "users", term4559);
        setField(term4556, term4556.getClass(), "privileges", term4562);
        setField(term4556, term4556.getClass(), "name", "");
        Long term4567 = new Long(174253963298276221L);
        ArrayList term4569 = new ArrayList();
        ((ArrayList) term4569).add((Object)null);
        ((ArrayList) term4569).add((Object)null);
        ((ArrayList) term4569).add((Object)null);
        ((ArrayList) term4569).add((Object)null);
        ((ArrayList) term4569).add((Object)null);
        ((ArrayList) term4569).add((Object)null);
        ArrayList term4572 = new ArrayList();
        ((ArrayList) term4572).add((Object)null);
        ((ArrayList) term4572).add((Object)null);
        ((ArrayList) term4572).add((Object)null);
        ((ArrayList) term4572).add((Object)null);
        ((ArrayList) term4572).add((Object)null);
        ((ArrayList) term4572).add((Object)null);
        Object term4566 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term4566, term4566.getClass(), "id", term4567);
        setField(term4566, term4566.getClass(), "users", term4569);
        setField(term4566, term4566.getClass(), "privileges", term4572);
        setField(term4566, term4566.getClass(), "name", "");
        ArrayList term4554 = new ArrayList();
        ((ArrayList) term4554).add(term4556);
        ((ArrayList) term4554).add(term4566);
        term4475 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.User"));
        Object term4591 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4592 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4596 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4601 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4602 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4606 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term4475, term4475.getClass(), "id", term4476);
        setField(term4475, term4475.getClass(), "membername", "mdxcgZwsaP");
        setField(term4475, term4475.getClass(), "email", "XildIRoZHG");
        setField(term4475, term4475.getClass(), "password", "lEcrFlxJXH");
        setField(term4475, term4475.getClass(), "enabled", term4514);
        setField(term4475, term4475.getClass(), "age", term4516);
        setField(term4475, term4475.getClass(), "phoneNumber", "VNdDwXMYxR");
        setField(term4475, term4475.getClass(), "country", "bVbexZPmwW");
        setField(term4475, term4475.getClass(), "birthdate", "tvxYdqiyGc");
        setField(term4475, term4475.getClass(), "roles", term4554);
        setBooleanField(term4475, term4475.getClass(), "isUsing2FA", false);
        setField(term4475, term4475.getClass(), "secret", "ikTtOgdVYS");
        setIntField(term4592, term4592.getClass(), "year", 2023);
        setShortField(term4592, term4592.getClass(), "month", (short) 7);
        setShortField(term4592, term4592.getClass(), "day", (short) 27);
        setField(term4591, term4591.getClass(), "date", term4592);
        setByteField(term4596, term4596.getClass(), "hour", (byte) 4);
        setByteField(term4596, term4596.getClass(), "minute", (byte) 25);
        setByteField(term4596, term4596.getClass(), "second", (byte) 46);
        setIntField(term4596, term4596.getClass(), "nano", 646465452);
        setField(term4591, term4591.getClass(), "time", term4596);
        setField(term4475, term4475.getClass(), "regDate", term4591);
        setIntField(term4602, term4602.getClass(), "year", 2022);
        setShortField(term4602, term4602.getClass(), "month", (short) 11);
        setShortField(term4602, term4602.getClass(), "day", (short) 2);
        setField(term4601, term4601.getClass(), "date", term4602);
        setByteField(term4606, term4606.getClass(), "hour", (byte) 4);
        setByteField(term4606, term4606.getClass(), "minute", (byte) 14);
        setByteField(term4606, term4606.getClass(), "second", (byte) 5);
        setIntField(term4606, term4606.getClass(), "nano", 604465127);
        setField(term4601, term4601.getClass(), "time", term4606);
        setField(term4475, term4475.getClass(), "modDate", term4601);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSecret", argTypes, term4475, args);
    }

};


