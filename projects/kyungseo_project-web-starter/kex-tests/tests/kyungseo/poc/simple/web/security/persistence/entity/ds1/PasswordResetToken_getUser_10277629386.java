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

public class PasswordResetToken_getUser_10277629386 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14441;

    public PasswordResetToken_getUser_10277629386() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term14442 = new Long(-1884609063652624817L);
        Long term14457 = new Long(4110677574531044171L);
        Boolean term14495 = new Boolean(true);
        Integer term14497 = new Integer(-1560631747);
        Long term14538 = new Long(-7231877484121205165L);
        Object term14537 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term14537, term14537.getClass(), "id", term14538);
        setField(term14537, term14537.getClass(), "users", null);
        setField(term14537, term14537.getClass(), "privileges", null);
        setField(term14537, term14537.getClass(), "name", null);
        ArrayList term14535 = new ArrayList();
        ((ArrayList) term14535).add(term14537);
        term14441 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.PasswordResetToken"));
        Object term14456 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.User"));
        Object term14555 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term14556 = newInstance(Class.forName("java.time.LocalDate"));
        Object term14560 = newInstance(Class.forName("java.time.LocalTime"));
        Object term14565 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term14566 = newInstance(Class.forName("java.time.LocalDate"));
        Object term14570 = newInstance(Class.forName("java.time.LocalTime"));
        Object term14575 = newInstance(Class.forName("java.util.Date"));
        setField(term14441, term14441.getClass(), "id", term14442);
        setField(term14441, term14441.getClass(), "token", "xlEdrgoOEf");
        setField(term14456, term14456.getClass(), "id", term14457);
        setField(term14456, term14456.getClass(), "membername", "DfKLAuTNTf");
        setField(term14456, term14456.getClass(), "email", "lWuRJaTZQB");
        setField(term14456, term14456.getClass(), "password", "jiQYzmbdOz");
        setField(term14456, term14456.getClass(), "enabled", term14495);
        setField(term14456, term14456.getClass(), "age", term14497);
        setField(term14456, term14456.getClass(), "phoneNumber", "HBnovMFfRR");
        setField(term14456, term14456.getClass(), "country", "kvBRGWtVMY");
        setField(term14456, term14456.getClass(), "birthdate", "nnkddhphsi");
        setField(term14456, term14456.getClass(), "roles", term14535);
        setBooleanField(term14456, term14456.getClass(), "isUsing2FA", true);
        setField(term14456, term14456.getClass(), "secret", "ILplPJhYrB");
        setIntField(term14556, term14556.getClass(), "year", 2015);
        setShortField(term14556, term14556.getClass(), "month", (short) 6);
        setShortField(term14556, term14556.getClass(), "day", (short) 29);
        setField(term14555, term14555.getClass(), "date", term14556);
        setByteField(term14560, term14560.getClass(), "hour", (byte) 15);
        setByteField(term14560, term14560.getClass(), "minute", (byte) 4);
        setByteField(term14560, term14560.getClass(), "second", (byte) 16);
        setIntField(term14560, term14560.getClass(), "nano", 322383816);
        setField(term14555, term14555.getClass(), "time", term14560);
        setField(term14456, term14456.getClass(), "regDate", term14555);
        setIntField(term14566, term14566.getClass(), "year", 2029);
        setShortField(term14566, term14566.getClass(), "month", (short) 6);
        setShortField(term14566, term14566.getClass(), "day", (short) 10);
        setField(term14565, term14565.getClass(), "date", term14566);
        setByteField(term14570, term14570.getClass(), "hour", (byte) 10);
        setByteField(term14570, term14570.getClass(), "minute", (byte) 16);
        setByteField(term14570, term14570.getClass(), "second", (byte) 3);
        setIntField(term14570, term14570.getClass(), "nano", 695609423);
        setField(term14565, term14565.getClass(), "time", term14570);
        setField(term14456, term14456.getClass(), "modDate", term14565);
        setField(term14441, term14441.getClass(), "user", term14456);
        setLongField(term14575, term14575.getClass(), "fastTime", 1437757323580L);
        setField(term14575, term14575.getClass(), "cdate", null);
        setField(term14441, term14441.getClass(), "expiryDate", term14575);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.PasswordResetToken");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUser", argTypes, term14441, args);
    }

};


