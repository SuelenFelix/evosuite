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

public class JwtRefreshToken_setRefreshCount_144427738715 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31521;
     Object term31726;

    public JwtRefreshToken_setRefreshCount_144427738715() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term31522 = new Long(1359306275461301169L);
        Long term31537 = new Long(-5217551292483969913L);
        Long term31540 = new Long(3440455167808262818L);
        Boolean term31578 = new Boolean(false);
        Integer term31580 = new Integer(2118747457);
        ArrayList term31618 = new ArrayList();
        Long term31680 = new Long(-4517489106829707868L);
        Long term31695 = new Long(3134763618587864799L);
        Long term31698 = new Long(2315991740687437411L);
        Boolean term31700 = new Boolean(false);
        Integer term31702 = new Integer(1868344256);
        Long term31708 = new Long(661658911296323350L);
        Long term31710 = new Long(-2747979550793547397L);
        Boolean term31712 = new Boolean(false);
        Long term31714 = new Long(9109639281020807778L);
        Boolean term31719 = new Boolean(false);
        Long term31721 = new Long(6914197512599341154L);
        term31521 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.JwtRefreshToken"));
        Object term31536 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.JwtUserDevice"));
        Object term31539 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.User"));
        Object term31635 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term31636 = newInstance(Class.forName("java.time.LocalDate"));
        Object term31640 = newInstance(Class.forName("java.time.LocalTime"));
        Object term31645 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term31646 = newInstance(Class.forName("java.time.LocalDate"));
        Object term31650 = newInstance(Class.forName("java.time.LocalTime"));
        Object term31679 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.JwtRefreshToken"));
        Object term31694 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.JwtUserDevice"));
        Object term31697 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.User"));
        Object term31707 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.JwtRefreshToken"));
        Object term31716 = newInstance(Class.forName("java.time.Instant"));
        Object term31723 = newInstance(Class.forName("java.time.Instant"));
        setField(term31521, term31521.getClass(), "id", term31522);
        setField(term31521, term31521.getClass(), "token", "GZfyTlJvPo");
        setField(term31536, term31536.getClass(), "id", term31537);
        setField(term31539, term31539.getClass(), "id", term31540);
        setField(term31539, term31539.getClass(), "membername", "ErykqtSHSR");
        setField(term31539, term31539.getClass(), "email", "cYBIjKvbtm");
        setField(term31539, term31539.getClass(), "password", "BEvLYxGdKf");
        setField(term31539, term31539.getClass(), "enabled", term31578);
        setField(term31539, term31539.getClass(), "age", term31580);
        setField(term31539, term31539.getClass(), "phoneNumber", "ANkSSVQejl");
        setField(term31539, term31539.getClass(), "country", "UiDKxqVkSN");
        setField(term31539, term31539.getClass(), "birthdate", "vxFZtlwdRB");
        setField(term31539, term31539.getClass(), "roles", term31618);
        setBooleanField(term31539, term31539.getClass(), "isUsing2FA", false);
        setField(term31539, term31539.getClass(), "secret", "gwRYIIqrRr");
        setIntField(term31636, term31636.getClass(), "year", 2028);
        setShortField(term31636, term31636.getClass(), "month", (short) 5);
        setShortField(term31636, term31636.getClass(), "day", (short) 24);
        setField(term31635, term31635.getClass(), "date", term31636);
        setByteField(term31640, term31640.getClass(), "hour", (byte) 20);
        setByteField(term31640, term31640.getClass(), "minute", (byte) 5);
        setByteField(term31640, term31640.getClass(), "second", (byte) 44);
        setIntField(term31640, term31640.getClass(), "nano", 283024850);
        setField(term31635, term31635.getClass(), "time", term31640);
        setField(term31539, term31539.getClass(), "regDate", term31635);
        setIntField(term31646, term31646.getClass(), "year", 2029);
        setShortField(term31646, term31646.getClass(), "month", (short) 3);
        setShortField(term31646, term31646.getClass(), "day", (short) 15);
        setField(term31645, term31645.getClass(), "date", term31646);
        setByteField(term31650, term31650.getClass(), "hour", (byte) 10);
        setByteField(term31650, term31650.getClass(), "minute", (byte) 22);
        setByteField(term31650, term31650.getClass(), "second", (byte) 21);
        setIntField(term31650, term31650.getClass(), "nano", 258160604);
        setField(term31645, term31645.getClass(), "time", term31650);
        setField(term31539, term31539.getClass(), "modDate", term31645);
        setField(term31536, term31536.getClass(), "user", term31539);
        setField(term31536, term31536.getClass(), "deviceType", "aBvLuPbJPh");
        setField(term31536, term31536.getClass(), "deviceId", "TvrcwGmIbL");
        setField(term31679, term31679.getClass(), "id", term31680);
        setField(term31679, term31679.getClass(), "token", "CLEwlxHcqT");
        setField(term31694, term31694.getClass(), "id", term31695);
        setField(term31697, term31697.getClass(), "id", term31698);
        setField(term31697, term31697.getClass(), "membername", null);
        setField(term31697, term31697.getClass(), "email", null);
        setField(term31697, term31697.getClass(), "password", null);
        setField(term31697, term31697.getClass(), "enabled", term31700);
        setField(term31697, term31697.getClass(), "age", term31702);
        setField(term31697, term31697.getClass(), "phoneNumber", null);
        setField(term31697, term31697.getClass(), "country", null);
        setField(term31697, term31697.getClass(), "birthdate", null);
        setField(term31697, term31697.getClass(), "roles", null);
        setBooleanField(term31697, term31697.getClass(), "isUsing2FA", false);
        setField(term31697, term31697.getClass(), "secret", null);
        setField(term31697, term31697.getClass(), "regDate", null);
        setField(term31697, term31697.getClass(), "modDate", null);
        setField(term31694, term31694.getClass(), "user", term31697);
        setField(term31694, term31694.getClass(), "deviceType", "");
        setField(term31694, term31694.getClass(), "deviceId", "");
        setField(term31707, term31707.getClass(), "id", term31708);
        setField(term31707, term31707.getClass(), "token", null);
        setField(term31707, term31707.getClass(), "userDevice", null);
        setField(term31707, term31707.getClass(), "refreshCount", term31710);
        setField(term31707, term31707.getClass(), "expiryDate", null);
        setField(term31694, term31694.getClass(), "refreshToken", term31707);
        setField(term31694, term31694.getClass(), "isRefreshActive", term31712);
        setField(term31679, term31679.getClass(), "userDevice", term31694);
        setField(term31679, term31679.getClass(), "refreshCount", term31714);
        setLongField(term31716, term31716.getClass(), "seconds", 1420265476L);
        setIntField(term31716, term31716.getClass(), "nanos", 195000000);
        setField(term31679, term31679.getClass(), "expiryDate", term31716);
        setField(term31536, term31536.getClass(), "refreshToken", term31679);
        setField(term31536, term31536.getClass(), "isRefreshActive", term31719);
        setField(term31521, term31521.getClass(), "userDevice", term31536);
        setField(term31521, term31521.getClass(), "refreshCount", term31721);
        setLongField(term31723, term31723.getClass(), "seconds", 1379588514L);
        setIntField(term31723, term31723.getClass(), "nanos", 567000000);
        setField(term31521, term31521.getClass(), "expiryDate", term31723);
        term31726 = new Long(-6395079400634628442L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.JwtRefreshToken");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term31726;
        callMethod(klass, "setRefreshCount", argTypes, term31521, args);
    }

};


