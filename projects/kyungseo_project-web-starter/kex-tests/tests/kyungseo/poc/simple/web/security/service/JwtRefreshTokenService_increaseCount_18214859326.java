package kyungseo.poc.simple.web.security.service;

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
import static kyungseo.poc.simple.web.security.service.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.ArrayList;

public class JwtRefreshTokenService_increaseCount_18214859326 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term651;

    public JwtRefreshTokenService_increaseCount_18214859326() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term652 = new Long(3892018155439224435L);
        Long term667 = new Long(5953383087795962419L);
        Long term670 = new Long(7994303628307559416L);
        Boolean term708 = new Boolean(false);
        Integer term710 = new Integer(1227103734);
        ArrayList term748 = new ArrayList();
        ((ArrayList) term748).add((Object)null);
        ((ArrayList) term748).add((Object)null);
        ((ArrayList) term748).add((Object)null);
        ((ArrayList) term748).add((Object)null);
        ((ArrayList) term748).add((Object)null);
        ((ArrayList) term748).add((Object)null);
        ((ArrayList) term748).add((Object)null);
        ((ArrayList) term748).add((Object)null);
        ((ArrayList) term748).add((Object)null);
        Long term810 = new Long(9013624480170062917L);
        Long term825 = new Long(7862575738391801707L);
        Long term828 = new Long(305759998609888272L);
        Boolean term830 = new Boolean(true);
        Integer term832 = new Integer(1134449235);
        Long term838 = new Long(50358265865610362L);
        Long term840 = new Long(2848819812340321742L);
        Boolean term842 = new Boolean(false);
        Long term844 = new Long(-8876856890348836498L);
        Boolean term849 = new Boolean(false);
        Long term851 = new Long(846579494941632714L);
        term651 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.JwtRefreshToken"));
        Object term666 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.JwtUserDevice"));
        Object term669 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.User"));
        Object term765 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term766 = newInstance(Class.forName("java.time.LocalDate"));
        Object term770 = newInstance(Class.forName("java.time.LocalTime"));
        Object term775 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term776 = newInstance(Class.forName("java.time.LocalDate"));
        Object term780 = newInstance(Class.forName("java.time.LocalTime"));
        Object term809 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.JwtRefreshToken"));
        Object term824 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.JwtUserDevice"));
        Object term827 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.User"));
        Object term837 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.JwtRefreshToken"));
        Object term846 = newInstance(Class.forName("java.time.Instant"));
        Object term853 = newInstance(Class.forName("java.time.Instant"));
        setField(term651, term651.getClass(), "id", term652);
        setField(term651, term651.getClass(), "token", "sEnIVFtZuQ");
        setField(term666, term666.getClass(), "id", term667);
        setField(term669, term669.getClass(), "id", term670);
        setField(term669, term669.getClass(), "membername", "ZVecLZMLHF");
        setField(term669, term669.getClass(), "email", "fztQhjqwdP");
        setField(term669, term669.getClass(), "password", "eVpkWxjuki");
        setField(term669, term669.getClass(), "enabled", term708);
        setField(term669, term669.getClass(), "age", term710);
        setField(term669, term669.getClass(), "phoneNumber", "SJiQaLvSKv");
        setField(term669, term669.getClass(), "country", "OEXDRUKcFl");
        setField(term669, term669.getClass(), "birthdate", "RYdKCNNMBR");
        setField(term669, term669.getClass(), "roles", term748);
        setBooleanField(term669, term669.getClass(), "isUsing2FA", false);
        setField(term669, term669.getClass(), "secret", "VYkqXKVlAJ");
        setIntField(term766, term766.getClass(), "year", 2025);
        setShortField(term766, term766.getClass(), "month", (short) 3);
        setShortField(term766, term766.getClass(), "day", (short) 9);
        setField(term765, term765.getClass(), "date", term766);
        setByteField(term770, term770.getClass(), "hour", (byte) 5);
        setByteField(term770, term770.getClass(), "minute", (byte) 49);
        setByteField(term770, term770.getClass(), "second", (byte) 12);
        setIntField(term770, term770.getClass(), "nano", 791695028);
        setField(term765, term765.getClass(), "time", term770);
        setField(term669, term669.getClass(), "regDate", term765);
        setIntField(term776, term776.getClass(), "year", 2023);
        setShortField(term776, term776.getClass(), "month", (short) 9);
        setShortField(term776, term776.getClass(), "day", (short) 23);
        setField(term775, term775.getClass(), "date", term776);
        setByteField(term780, term780.getClass(), "hour", (byte) 12);
        setByteField(term780, term780.getClass(), "minute", (byte) 55);
        setByteField(term780, term780.getClass(), "second", (byte) 58);
        setIntField(term780, term780.getClass(), "nano", 159178396);
        setField(term775, term775.getClass(), "time", term780);
        setField(term669, term669.getClass(), "modDate", term775);
        setField(term666, term666.getClass(), "user", term669);
        setField(term666, term666.getClass(), "deviceType", "XkIoWJRNwN");
        setField(term666, term666.getClass(), "deviceId", "aNWLJdrZMq");
        setField(term809, term809.getClass(), "id", term810);
        setField(term809, term809.getClass(), "token", "HHmNoYxIGj");
        setField(term824, term824.getClass(), "id", term825);
        setField(term827, term827.getClass(), "id", term828);
        setField(term827, term827.getClass(), "membername", null);
        setField(term827, term827.getClass(), "email", null);
        setField(term827, term827.getClass(), "password", null);
        setField(term827, term827.getClass(), "enabled", term830);
        setField(term827, term827.getClass(), "age", term832);
        setField(term827, term827.getClass(), "phoneNumber", null);
        setField(term827, term827.getClass(), "country", null);
        setField(term827, term827.getClass(), "birthdate", null);
        setField(term827, term827.getClass(), "roles", null);
        setBooleanField(term827, term827.getClass(), "isUsing2FA", true);
        setField(term827, term827.getClass(), "secret", null);
        setField(term827, term827.getClass(), "regDate", null);
        setField(term827, term827.getClass(), "modDate", null);
        setField(term824, term824.getClass(), "user", term827);
        setField(term824, term824.getClass(), "deviceType", "");
        setField(term824, term824.getClass(), "deviceId", "");
        setField(term837, term837.getClass(), "id", term838);
        setField(term837, term837.getClass(), "token", null);
        setField(term837, term837.getClass(), "userDevice", null);
        setField(term837, term837.getClass(), "refreshCount", term840);
        setField(term837, term837.getClass(), "expiryDate", null);
        setField(term824, term824.getClass(), "refreshToken", term837);
        setField(term824, term824.getClass(), "isRefreshActive", term842);
        setField(term809, term809.getClass(), "userDevice", term824);
        setField(term809, term809.getClass(), "refreshCount", term844);
        setLongField(term846, term846.getClass(), "seconds", 1349069753L);
        setIntField(term846, term846.getClass(), "nanos", 960000000);
        setField(term809, term809.getClass(), "expiryDate", term846);
        setField(term666, term666.getClass(), "refreshToken", term809);
        setField(term666, term666.getClass(), "isRefreshActive", term849);
        setField(term651, term651.getClass(), "userDevice", term666);
        setField(term651, term651.getClass(), "refreshCount", term851);
        setLongField(term853, term853.getClass(), "seconds", 1706078172L);
        setIntField(term853, term853.getClass(), "nanos", 457000000);
        setField(term651, term651.getClass(), "expiryDate", term853);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.security.service.JwtRefreshTokenService");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.JwtRefreshToken");
        Object[] args = new Object[1];
        args[0] = term651;
        callMethod(klass, "increaseCount", argTypes, null, args);
    }

};


