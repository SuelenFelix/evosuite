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

public class UserLocation_hashCode_49364613910 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10187;

    public UserLocation_hashCode_49364613910() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term10188 = new Long(6151197215723513345L);
        Long term10204 = new Long(2923644849350978175L);
        Boolean term10242 = new Boolean(true);
        Integer term10244 = new Integer(-159494544);
        Long term10285 = new Long(-575923088526116016L);
        Object term10284 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term10284, term10284.getClass(), "id", term10285);
        setField(term10284, term10284.getClass(), "users", null);
        setField(term10284, term10284.getClass(), "privileges", null);
        setField(term10284, term10284.getClass(), "name", null);
        Object term10287 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term10287, term10287.getClass(), "id", null);
        setField(term10287, term10287.getClass(), "users", null);
        setField(term10287, term10287.getClass(), "privileges", null);
        setField(term10287, term10287.getClass(), "name", null);
        Long term10289 = new Long(5307445998877056304L);
        Object term10288 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term10288, term10288.getClass(), "id", term10289);
        setField(term10288, term10288.getClass(), "users", null);
        setField(term10288, term10288.getClass(), "privileges", null);
        setField(term10288, term10288.getClass(), "name", null);
        Object term10291 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term10291, term10291.getClass(), "id", null);
        setField(term10291, term10291.getClass(), "users", null);
        setField(term10291, term10291.getClass(), "privileges", null);
        setField(term10291, term10291.getClass(), "name", null);
        Object term10292 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term10292, term10292.getClass(), "id", null);
        setField(term10292, term10292.getClass(), "users", null);
        setField(term10292, term10292.getClass(), "privileges", null);
        setField(term10292, term10292.getClass(), "name", null);
        Object term10293 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term10293, term10293.getClass(), "id", null);
        setField(term10293, term10293.getClass(), "users", null);
        setField(term10293, term10293.getClass(), "privileges", null);
        setField(term10293, term10293.getClass(), "name", null);
        ArrayList term10282 = new ArrayList();
        ((ArrayList) term10282).add(term10284);
        ((ArrayList) term10282).add(term10287);
        ((ArrayList) term10282).add(term10288);
        ((ArrayList) term10282).add(term10291);
        ((ArrayList) term10282).add(term10292);
        ((ArrayList) term10282).add(term10293);
        term10187 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.UserLocation"));
        Object term10203 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.User"));
        Object term10309 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term10310 = newInstance(Class.forName("java.time.LocalDate"));
        Object term10314 = newInstance(Class.forName("java.time.LocalTime"));
        Object term10319 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term10320 = newInstance(Class.forName("java.time.LocalDate"));
        Object term10324 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term10187, term10187.getClass(), "id", term10188);
        setField(term10187, term10187.getClass(), "country", "YBQxTjzIrN");
        setBooleanField(term10187, term10187.getClass(), "enabled", true);
        setField(term10203, term10203.getClass(), "id", term10204);
        setField(term10203, term10203.getClass(), "membername", "xfqaJVcHGx");
        setField(term10203, term10203.getClass(), "email", "bANxpqKESI");
        setField(term10203, term10203.getClass(), "password", "sgpUSVSuVZ");
        setField(term10203, term10203.getClass(), "enabled", term10242);
        setField(term10203, term10203.getClass(), "age", term10244);
        setField(term10203, term10203.getClass(), "phoneNumber", "ZOYhOzwINI");
        setField(term10203, term10203.getClass(), "country", "sPqjQQfymN");
        setField(term10203, term10203.getClass(), "birthdate", "tNKFzflLBd");
        setField(term10203, term10203.getClass(), "roles", term10282);
        setBooleanField(term10203, term10203.getClass(), "isUsing2FA", true);
        setField(term10203, term10203.getClass(), "secret", "uAgfQbLPeZ");
        setIntField(term10310, term10310.getClass(), "year", 2023);
        setShortField(term10310, term10310.getClass(), "month", (short) 1);
        setShortField(term10310, term10310.getClass(), "day", (short) 10);
        setField(term10309, term10309.getClass(), "date", term10310);
        setByteField(term10314, term10314.getClass(), "hour", (byte) 2);
        setByteField(term10314, term10314.getClass(), "minute", (byte) 12);
        setByteField(term10314, term10314.getClass(), "second", (byte) 45);
        setIntField(term10314, term10314.getClass(), "nano", 793047168);
        setField(term10309, term10309.getClass(), "time", term10314);
        setField(term10203, term10203.getClass(), "regDate", term10309);
        setIntField(term10320, term10320.getClass(), "year", 2028);
        setShortField(term10320, term10320.getClass(), "month", (short) 6);
        setShortField(term10320, term10320.getClass(), "day", (short) 12);
        setField(term10319, term10319.getClass(), "date", term10320);
        setByteField(term10324, term10324.getClass(), "hour", (byte) 9);
        setByteField(term10324, term10324.getClass(), "minute", (byte) 39);
        setByteField(term10324, term10324.getClass(), "second", (byte) 7);
        setIntField(term10324, term10324.getClass(), "nano", 950068890);
        setField(term10319, term10319.getClass(), "time", term10324);
        setField(term10203, term10203.getClass(), "modDate", term10319);
        setField(term10187, term10187.getClass(), "user", term10203);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.UserLocation");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term10187, args);
    }

};


