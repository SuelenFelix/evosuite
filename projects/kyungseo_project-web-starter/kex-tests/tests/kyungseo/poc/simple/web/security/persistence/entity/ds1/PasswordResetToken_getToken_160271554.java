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

public class PasswordResetToken_getToken_160271554 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13971;

    public PasswordResetToken_getToken_160271554() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term13972 = new Long(3512582740653676967L);
        Long term13987 = new Long(-6893173979797141349L);
        Boolean term14025 = new Boolean(true);
        Integer term14027 = new Integer(-1362856620);
        Long term14068 = new Long(8849217995403029606L);
        Object term14067 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term14067, term14067.getClass(), "id", term14068);
        setField(term14067, term14067.getClass(), "users", null);
        setField(term14067, term14067.getClass(), "privileges", null);
        setField(term14067, term14067.getClass(), "name", null);
        Object term14070 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term14070, term14070.getClass(), "id", null);
        setField(term14070, term14070.getClass(), "users", null);
        setField(term14070, term14070.getClass(), "privileges", null);
        setField(term14070, term14070.getClass(), "name", null);
        Object term14071 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term14071, term14071.getClass(), "id", null);
        setField(term14071, term14071.getClass(), "users", null);
        setField(term14071, term14071.getClass(), "privileges", null);
        setField(term14071, term14071.getClass(), "name", null);
        Object term14072 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term14072, term14072.getClass(), "id", null);
        setField(term14072, term14072.getClass(), "users", null);
        setField(term14072, term14072.getClass(), "privileges", null);
        setField(term14072, term14072.getClass(), "name", null);
        Long term14074 = new Long(1292632924316952683L);
        Object term14073 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term14073, term14073.getClass(), "id", term14074);
        setField(term14073, term14073.getClass(), "users", null);
        setField(term14073, term14073.getClass(), "privileges", null);
        setField(term14073, term14073.getClass(), "name", null);
        ArrayList term14065 = new ArrayList();
        ((ArrayList) term14065).add(term14067);
        ((ArrayList) term14065).add(term14070);
        ((ArrayList) term14065).add(term14071);
        ((ArrayList) term14065).add(term14070);
        ((ArrayList) term14065).add(term14072);
        ((ArrayList) term14065).add(term14073);
        term13971 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.PasswordResetToken"));
        Object term13986 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.User"));
        Object term14091 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term14092 = newInstance(Class.forName("java.time.LocalDate"));
        Object term14096 = newInstance(Class.forName("java.time.LocalTime"));
        Object term14101 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term14102 = newInstance(Class.forName("java.time.LocalDate"));
        Object term14106 = newInstance(Class.forName("java.time.LocalTime"));
        Object term14111 = newInstance(Class.forName("java.util.Date"));
        setField(term13971, term13971.getClass(), "id", term13972);
        setField(term13971, term13971.getClass(), "token", "mRdoimcRwz");
        setField(term13986, term13986.getClass(), "id", term13987);
        setField(term13986, term13986.getClass(), "membername", "dxJDKuPPPM");
        setField(term13986, term13986.getClass(), "email", "rXBuuDWXsm");
        setField(term13986, term13986.getClass(), "password", "VSvKttZYSC");
        setField(term13986, term13986.getClass(), "enabled", term14025);
        setField(term13986, term13986.getClass(), "age", term14027);
        setField(term13986, term13986.getClass(), "phoneNumber", "bbwxScASWL");
        setField(term13986, term13986.getClass(), "country", "BXJdQmJvFh");
        setField(term13986, term13986.getClass(), "birthdate", "bsPTRsievL");
        setField(term13986, term13986.getClass(), "roles", term14065);
        setBooleanField(term13986, term13986.getClass(), "isUsing2FA", false);
        setField(term13986, term13986.getClass(), "secret", "pxpYGruvWy");
        setIntField(term14092, term14092.getClass(), "year", 2013);
        setShortField(term14092, term14092.getClass(), "month", (short) 9);
        setShortField(term14092, term14092.getClass(), "day", (short) 14);
        setField(term14091, term14091.getClass(), "date", term14092);
        setByteField(term14096, term14096.getClass(), "hour", (byte) 18);
        setByteField(term14096, term14096.getClass(), "minute", (byte) 10);
        setByteField(term14096, term14096.getClass(), "second", (byte) 39);
        setIntField(term14096, term14096.getClass(), "nano", 650634905);
        setField(term14091, term14091.getClass(), "time", term14096);
        setField(term13986, term13986.getClass(), "regDate", term14091);
        setIntField(term14102, term14102.getClass(), "year", 2012);
        setShortField(term14102, term14102.getClass(), "month", (short) 8);
        setShortField(term14102, term14102.getClass(), "day", (short) 8);
        setField(term14101, term14101.getClass(), "date", term14102);
        setByteField(term14106, term14106.getClass(), "hour", (byte) 5);
        setByteField(term14106, term14106.getClass(), "minute", (byte) 3);
        setByteField(term14106, term14106.getClass(), "second", (byte) 9);
        setIntField(term14106, term14106.getClass(), "nano", 246856443);
        setField(term14101, term14101.getClass(), "time", term14106);
        setField(term13986, term13986.getClass(), "modDate", term14101);
        setField(term13971, term13971.getClass(), "user", term13986);
        setLongField(term14111, term14111.getClass(), "fastTime", 1863631094992L);
        setField(term14111, term14111.getClass(), "cdate", null);
        setField(term13971, term13971.getClass(), "expiryDate", term14111);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.PasswordResetToken");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getToken", argTypes, term13971, args);
    }

};


