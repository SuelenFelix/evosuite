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

public class VerificationToken_toString_141522093514 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19638;

    public VerificationToken_toString_141522093514() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term19639 = new Long(-3355803345734534021L);
        Long term19654 = new Long(5579342693904906403L);
        Boolean term19692 = new Boolean(true);
        Integer term19694 = new Integer(-1556527718);
        Long term19735 = new Long(-8838530728518114289L);
        Object term19734 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term19734, term19734.getClass(), "id", term19735);
        setField(term19734, term19734.getClass(), "users", null);
        setField(term19734, term19734.getClass(), "privileges", null);
        setField(term19734, term19734.getClass(), "name", null);
        Object term19737 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term19737, term19737.getClass(), "id", null);
        setField(term19737, term19737.getClass(), "users", null);
        setField(term19737, term19737.getClass(), "privileges", null);
        setField(term19737, term19737.getClass(), "name", null);
        Object term19738 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term19738, term19738.getClass(), "id", null);
        setField(term19738, term19738.getClass(), "users", null);
        setField(term19738, term19738.getClass(), "privileges", null);
        setField(term19738, term19738.getClass(), "name", null);
        Object term19739 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term19739, term19739.getClass(), "id", null);
        setField(term19739, term19739.getClass(), "users", null);
        setField(term19739, term19739.getClass(), "privileges", null);
        setField(term19739, term19739.getClass(), "name", null);
        Object term19740 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term19740, term19740.getClass(), "id", null);
        setField(term19740, term19740.getClass(), "users", null);
        setField(term19740, term19740.getClass(), "privileges", null);
        setField(term19740, term19740.getClass(), "name", null);
        ArrayList term19732 = new ArrayList();
        ((ArrayList) term19732).add(term19734);
        ((ArrayList) term19732).add(term19737);
        ((ArrayList) term19732).add(term19738);
        ((ArrayList) term19732).add(term19739);
        ((ArrayList) term19732).add(term19740);
        ((ArrayList) term19732).add(term19738);
        term19638 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.VerificationToken"));
        Object term19653 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.User"));
        Object term19756 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term19757 = newInstance(Class.forName("java.time.LocalDate"));
        Object term19761 = newInstance(Class.forName("java.time.LocalTime"));
        Object term19766 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term19767 = newInstance(Class.forName("java.time.LocalDate"));
        Object term19771 = newInstance(Class.forName("java.time.LocalTime"));
        Object term19776 = newInstance(Class.forName("java.util.Date"));
        setField(term19638, term19638.getClass(), "id", term19639);
        setField(term19638, term19638.getClass(), "token", "rJpPoVDPxO");
        setField(term19653, term19653.getClass(), "id", term19654);
        setField(term19653, term19653.getClass(), "membername", "wAzHMzePqz");
        setField(term19653, term19653.getClass(), "email", "apDIHttQkF");
        setField(term19653, term19653.getClass(), "password", "JnkpKxjKwX");
        setField(term19653, term19653.getClass(), "enabled", term19692);
        setField(term19653, term19653.getClass(), "age", term19694);
        setField(term19653, term19653.getClass(), "phoneNumber", "QmmFUcQTWe");
        setField(term19653, term19653.getClass(), "country", "SrhlGLISlG");
        setField(term19653, term19653.getClass(), "birthdate", "UPhCxQiSer");
        setField(term19653, term19653.getClass(), "roles", term19732);
        setBooleanField(term19653, term19653.getClass(), "isUsing2FA", false);
        setField(term19653, term19653.getClass(), "secret", "tjWInMuXpE");
        setIntField(term19757, term19757.getClass(), "year", 2024);
        setShortField(term19757, term19757.getClass(), "month", (short) 4);
        setShortField(term19757, term19757.getClass(), "day", (short) 7);
        setField(term19756, term19756.getClass(), "date", term19757);
        setByteField(term19761, term19761.getClass(), "hour", (byte) 15);
        setByteField(term19761, term19761.getClass(), "minute", (byte) 47);
        setByteField(term19761, term19761.getClass(), "second", (byte) 40);
        setIntField(term19761, term19761.getClass(), "nano", 993873846);
        setField(term19756, term19756.getClass(), "time", term19761);
        setField(term19653, term19653.getClass(), "regDate", term19756);
        setIntField(term19767, term19767.getClass(), "year", 2029);
        setShortField(term19767, term19767.getClass(), "month", (short) 5);
        setShortField(term19767, term19767.getClass(), "day", (short) 2);
        setField(term19766, term19766.getClass(), "date", term19767);
        setByteField(term19771, term19771.getClass(), "hour", (byte) 19);
        setByteField(term19771, term19771.getClass(), "minute", (byte) 50);
        setByteField(term19771, term19771.getClass(), "second", (byte) 46);
        setIntField(term19771, term19771.getClass(), "nano", 326633709);
        setField(term19766, term19766.getClass(), "time", term19771);
        setField(term19653, term19653.getClass(), "modDate", term19766);
        setField(term19638, term19638.getClass(), "user", term19653);
        setLongField(term19776, term19776.getClass(), "fastTime", 1464421789888L);
        setField(term19776, term19776.getClass(), "cdate", null);
        setField(term19638, term19638.getClass(), "expiryDate", term19776);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.VerificationToken");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term19638, args);
    }

};


