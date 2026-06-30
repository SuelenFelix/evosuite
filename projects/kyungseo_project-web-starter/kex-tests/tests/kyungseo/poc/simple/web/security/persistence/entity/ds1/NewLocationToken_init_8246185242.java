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

public class NewLocationToken_init_8246185242 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10898;

    public NewLocationToken_init_8246185242() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term10899 = new Long(2315395988604904502L);
        Long term10915 = new Long(4337555582321907177L);
        Boolean term10953 = new Boolean(false);
        Integer term10955 = new Integer(1959097203);
        Long term10996 = new Long(-6367418587326372844L);
        Object term10995 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term10995, term10995.getClass(), "id", term10996);
        setField(term10995, term10995.getClass(), "users", null);
        setField(term10995, term10995.getClass(), "privileges", null);
        setField(term10995, term10995.getClass(), "name", null);
        Long term10999 = new Long(7921404547326630089L);
        Object term10998 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term10998, term10998.getClass(), "id", term10999);
        setField(term10998, term10998.getClass(), "users", null);
        setField(term10998, term10998.getClass(), "privileges", null);
        setField(term10998, term10998.getClass(), "name", null);
        Object term11001 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term11001, term11001.getClass(), "id", null);
        setField(term11001, term11001.getClass(), "users", null);
        setField(term11001, term11001.getClass(), "privileges", null);
        setField(term11001, term11001.getClass(), "name", null);
        Object term11002 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term11002, term11002.getClass(), "id", null);
        setField(term11002, term11002.getClass(), "users", null);
        setField(term11002, term11002.getClass(), "privileges", null);
        setField(term11002, term11002.getClass(), "name", null);
        ArrayList term10993 = new ArrayList();
        ((ArrayList) term10993).add(term10995);
        ((ArrayList) term10993).add(term10998);
        ((ArrayList) term10993).add(term11001);
        ((ArrayList) term10993).add(term11002);
        term10898 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.UserLocation"));
        Object term10914 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.User"));
        Object term11018 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term11019 = newInstance(Class.forName("java.time.LocalDate"));
        Object term11023 = newInstance(Class.forName("java.time.LocalTime"));
        Object term11028 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term11029 = newInstance(Class.forName("java.time.LocalDate"));
        Object term11033 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term10898, term10898.getClass(), "id", term10899);
        setField(term10898, term10898.getClass(), "country", "SgyGAlytLF");
        setBooleanField(term10898, term10898.getClass(), "enabled", true);
        setField(term10914, term10914.getClass(), "id", term10915);
        setField(term10914, term10914.getClass(), "membername", "OoXopVvpwr");
        setField(term10914, term10914.getClass(), "email", "lwwreKJCFL");
        setField(term10914, term10914.getClass(), "password", "PWBggYjpOQ");
        setField(term10914, term10914.getClass(), "enabled", term10953);
        setField(term10914, term10914.getClass(), "age", term10955);
        setField(term10914, term10914.getClass(), "phoneNumber", "FDzNpfjYDI");
        setField(term10914, term10914.getClass(), "country", "vSbbcByIuA");
        setField(term10914, term10914.getClass(), "birthdate", "QSvdWzkkPx");
        setField(term10914, term10914.getClass(), "roles", term10993);
        setBooleanField(term10914, term10914.getClass(), "isUsing2FA", true);
        setField(term10914, term10914.getClass(), "secret", "pZrAdSHQIs");
        setIntField(term11019, term11019.getClass(), "year", 2016);
        setShortField(term11019, term11019.getClass(), "month", (short) 5);
        setShortField(term11019, term11019.getClass(), "day", (short) 15);
        setField(term11018, term11018.getClass(), "date", term11019);
        setByteField(term11023, term11023.getClass(), "hour", (byte) 13);
        setByteField(term11023, term11023.getClass(), "minute", (byte) 7);
        setByteField(term11023, term11023.getClass(), "second", (byte) 29);
        setIntField(term11023, term11023.getClass(), "nano", 36973761);
        setField(term11018, term11018.getClass(), "time", term11023);
        setField(term10914, term10914.getClass(), "regDate", term11018);
        setIntField(term11029, term11029.getClass(), "year", 2028);
        setShortField(term11029, term11029.getClass(), "month", (short) 11);
        setShortField(term11029, term11029.getClass(), "day", (short) 8);
        setField(term11028, term11028.getClass(), "date", term11029);
        setByteField(term11033, term11033.getClass(), "hour", (byte) 11);
        setByteField(term11033, term11033.getClass(), "minute", (byte) 41);
        setByteField(term11033, term11033.getClass(), "second", (byte) 26);
        setIntField(term11033, term11033.getClass(), "nano", 234822620);
        setField(term11028, term11028.getClass(), "time", term11033);
        setField(term10914, term10914.getClass(), "modDate", term11028);
        setField(term10898, term10898.getClass(), "user", term10914);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.NewLocationToken");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.UserLocation");
        Object[] args = new Object[2];
        args[0] = "iKuSKqVzvy";
        args[1] = term10898;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


