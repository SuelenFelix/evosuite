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

public class PasswordResetToken_getExpiryDate_4691330988 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15079;

    public PasswordResetToken_getExpiryDate_4691330988() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term15080 = new Long(3378211908158042365L);
        Long term15095 = new Long(3218173944566395082L);
        Boolean term15133 = new Boolean(true);
        Integer term15135 = new Integer(-1420269858);
        Long term15176 = new Long(-3694649475237271412L);
        Object term15175 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term15175, term15175.getClass(), "id", term15176);
        setField(term15175, term15175.getClass(), "users", null);
        setField(term15175, term15175.getClass(), "privileges", null);
        setField(term15175, term15175.getClass(), "name", null);
        Object term15178 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term15178, term15178.getClass(), "id", null);
        setField(term15178, term15178.getClass(), "users", null);
        setField(term15178, term15178.getClass(), "privileges", null);
        setField(term15178, term15178.getClass(), "name", null);
        Long term15180 = new Long(8461184996981583369L);
        Object term15179 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term15179, term15179.getClass(), "id", term15180);
        setField(term15179, term15179.getClass(), "users", null);
        setField(term15179, term15179.getClass(), "privileges", null);
        setField(term15179, term15179.getClass(), "name", null);
        Object term15182 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term15182, term15182.getClass(), "id", null);
        setField(term15182, term15182.getClass(), "users", null);
        setField(term15182, term15182.getClass(), "privileges", null);
        setField(term15182, term15182.getClass(), "name", null);
        ArrayList term15173 = new ArrayList();
        ((ArrayList) term15173).add(term15175);
        ((ArrayList) term15173).add(term15178);
        ((ArrayList) term15173).add(term15175);
        ((ArrayList) term15173).add(term15179);
        ((ArrayList) term15173).add(term15182);
        term15079 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.PasswordResetToken"));
        Object term15094 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.User"));
        Object term15198 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term15199 = newInstance(Class.forName("java.time.LocalDate"));
        Object term15203 = newInstance(Class.forName("java.time.LocalTime"));
        Object term15208 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term15209 = newInstance(Class.forName("java.time.LocalDate"));
        Object term15213 = newInstance(Class.forName("java.time.LocalTime"));
        Object term15218 = newInstance(Class.forName("java.util.Date"));
        setField(term15079, term15079.getClass(), "id", term15080);
        setField(term15079, term15079.getClass(), "token", "ZGRjCkxZnF");
        setField(term15094, term15094.getClass(), "id", term15095);
        setField(term15094, term15094.getClass(), "membername", "qntIiXdFTu");
        setField(term15094, term15094.getClass(), "email", "qneYYcRNxx");
        setField(term15094, term15094.getClass(), "password", "UampjCLvRN");
        setField(term15094, term15094.getClass(), "enabled", term15133);
        setField(term15094, term15094.getClass(), "age", term15135);
        setField(term15094, term15094.getClass(), "phoneNumber", "EsQWMjShML");
        setField(term15094, term15094.getClass(), "country", "JPgLQWnVaG");
        setField(term15094, term15094.getClass(), "birthdate", "IOLqavRFIA");
        setField(term15094, term15094.getClass(), "roles", term15173);
        setBooleanField(term15094, term15094.getClass(), "isUsing2FA", false);
        setField(term15094, term15094.getClass(), "secret", "tzigWGaijF");
        setIntField(term15199, term15199.getClass(), "year", 2026);
        setShortField(term15199, term15199.getClass(), "month", (short) 11);
        setShortField(term15199, term15199.getClass(), "day", (short) 25);
        setField(term15198, term15198.getClass(), "date", term15199);
        setByteField(term15203, term15203.getClass(), "hour", (byte) 12);
        setByteField(term15203, term15203.getClass(), "minute", (byte) 39);
        setByteField(term15203, term15203.getClass(), "second", (byte) 8);
        setIntField(term15203, term15203.getClass(), "nano", 444272669);
        setField(term15198, term15198.getClass(), "time", term15203);
        setField(term15094, term15094.getClass(), "regDate", term15198);
        setIntField(term15209, term15209.getClass(), "year", 2023);
        setShortField(term15209, term15209.getClass(), "month", (short) 1);
        setShortField(term15209, term15209.getClass(), "day", (short) 9);
        setField(term15208, term15208.getClass(), "date", term15209);
        setByteField(term15213, term15213.getClass(), "hour", (byte) 5);
        setByteField(term15213, term15213.getClass(), "minute", (byte) 45);
        setByteField(term15213, term15213.getClass(), "second", (byte) 39);
        setIntField(term15213, term15213.getClass(), "nano", 734895244);
        setField(term15208, term15208.getClass(), "time", term15213);
        setField(term15094, term15094.getClass(), "modDate", term15208);
        setField(term15079, term15079.getClass(), "user", term15094);
        setLongField(term15218, term15218.getClass(), "fastTime", 1725122217647L);
        setField(term15218, term15218.getClass(), "cdate", null);
        setField(term15079, term15079.getClass(), "expiryDate", term15218);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.PasswordResetToken");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getExpiryDate", argTypes, term15079, args);
    }

};


