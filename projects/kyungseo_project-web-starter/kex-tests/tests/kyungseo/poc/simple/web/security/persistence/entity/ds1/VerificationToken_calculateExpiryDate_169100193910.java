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

public class VerificationToken_calculateExpiryDate_169100193910 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18727;
     Object term18870;

    public VerificationToken_calculateExpiryDate_169100193910() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term18728 = new Long(-1826927759081147983L);
        Long term18743 = new Long(1770574028303523867L);
        Boolean term18781 = new Boolean(true);
        Integer term18783 = new Integer(-1097563716);
        Long term18824 = new Long(6434856191210114702L);
        Object term18823 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term18823, term18823.getClass(), "id", term18824);
        setField(term18823, term18823.getClass(), "users", null);
        setField(term18823, term18823.getClass(), "privileges", null);
        setField(term18823, term18823.getClass(), "name", null);
        Long term18827 = new Long(-431846534131845221L);
        Object term18826 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term18826, term18826.getClass(), "id", term18827);
        setField(term18826, term18826.getClass(), "users", null);
        setField(term18826, term18826.getClass(), "privileges", null);
        setField(term18826, term18826.getClass(), "name", null);
        Object term18829 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term18829, term18829.getClass(), "id", null);
        setField(term18829, term18829.getClass(), "users", null);
        setField(term18829, term18829.getClass(), "privileges", null);
        setField(term18829, term18829.getClass(), "name", null);
        Long term18831 = new Long(-4019650338948804968L);
        Object term18830 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term18830, term18830.getClass(), "id", term18831);
        setField(term18830, term18830.getClass(), "users", null);
        setField(term18830, term18830.getClass(), "privileges", null);
        setField(term18830, term18830.getClass(), "name", null);
        ArrayList term18821 = new ArrayList();
        ((ArrayList) term18821).add(term18823);
        ((ArrayList) term18821).add(term18826);
        ((ArrayList) term18821).add(term18829);
        ((ArrayList) term18821).add(term18823);
        ((ArrayList) term18821).add(term18830);
        term18727 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.VerificationToken"));
        Object term18742 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.User"));
        Object term18848 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term18849 = newInstance(Class.forName("java.time.LocalDate"));
        Object term18853 = newInstance(Class.forName("java.time.LocalTime"));
        Object term18858 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term18859 = newInstance(Class.forName("java.time.LocalDate"));
        Object term18863 = newInstance(Class.forName("java.time.LocalTime"));
        Object term18868 = newInstance(Class.forName("java.util.Date"));
        setField(term18727, term18727.getClass(), "id", term18728);
        setField(term18727, term18727.getClass(), "token", "GFxNoBwsCD");
        setField(term18742, term18742.getClass(), "id", term18743);
        setField(term18742, term18742.getClass(), "membername", "zBVQNMxMvk");
        setField(term18742, term18742.getClass(), "email", "iJSPWddhZO");
        setField(term18742, term18742.getClass(), "password", "WbvttDefvl");
        setField(term18742, term18742.getClass(), "enabled", term18781);
        setField(term18742, term18742.getClass(), "age", term18783);
        setField(term18742, term18742.getClass(), "phoneNumber", "coNhvymEkq");
        setField(term18742, term18742.getClass(), "country", "dMuXJftgrw");
        setField(term18742, term18742.getClass(), "birthdate", "INNyzaqXFS");
        setField(term18742, term18742.getClass(), "roles", term18821);
        setBooleanField(term18742, term18742.getClass(), "isUsing2FA", false);
        setField(term18742, term18742.getClass(), "secret", "CkIbQCWOgW");
        setIntField(term18849, term18849.getClass(), "year", 2019);
        setShortField(term18849, term18849.getClass(), "month", (short) 1);
        setShortField(term18849, term18849.getClass(), "day", (short) 30);
        setField(term18848, term18848.getClass(), "date", term18849);
        setByteField(term18853, term18853.getClass(), "hour", (byte) 14);
        setByteField(term18853, term18853.getClass(), "minute", (byte) 10);
        setByteField(term18853, term18853.getClass(), "second", (byte) 20);
        setIntField(term18853, term18853.getClass(), "nano", 60618008);
        setField(term18848, term18848.getClass(), "time", term18853);
        setField(term18742, term18742.getClass(), "regDate", term18848);
        setIntField(term18859, term18859.getClass(), "year", 2029);
        setShortField(term18859, term18859.getClass(), "month", (short) 12);
        setShortField(term18859, term18859.getClass(), "day", (short) 9);
        setField(term18858, term18858.getClass(), "date", term18859);
        setByteField(term18863, term18863.getClass(), "hour", (byte) 7);
        setByteField(term18863, term18863.getClass(), "minute", (byte) 27);
        setByteField(term18863, term18863.getClass(), "second", (byte) 9);
        setIntField(term18863, term18863.getClass(), "nano", 116678441);
        setField(term18858, term18858.getClass(), "time", term18863);
        setField(term18742, term18742.getClass(), "modDate", term18858);
        setField(term18727, term18727.getClass(), "user", term18742);
        setLongField(term18868, term18868.getClass(), "fastTime", 1304532099366L);
        setField(term18868, term18868.getClass(), "cdate", null);
        setField(term18727, term18727.getClass(), "expiryDate", term18868);
        term18870 = new Integer(1162663216);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.VerificationToken");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term18870;
        callMethod(klass, "calculateExpiryDate", argTypes, term18727, args);
    }

};


