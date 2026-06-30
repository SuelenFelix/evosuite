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

public class NewLocationToken_setToken_1854410706 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11841;

    public NewLocationToken_setToken_1854410706() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term11842 = new Long(937792282597213200L);
        Long term11857 = new Long(-6096027338784768449L);
        Long term11873 = new Long(6338971839666144092L);
        Boolean term11911 = new Boolean(false);
        Integer term11913 = new Integer(1593461795);
        ArrayList term11951 = new ArrayList();
        ((ArrayList) term11951).add((Object)null);
        ((ArrayList) term11951).add((Object)null);
        ((ArrayList) term11951).add((Object)null);
        ((ArrayList) term11951).add((Object)null);
        ((ArrayList) term11951).add((Object)null);
        ((ArrayList) term11951).add((Object)null);
        term11841 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.NewLocationToken"));
        Object term11856 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.UserLocation"));
        Object term11872 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.User"));
        Object term11968 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term11969 = newInstance(Class.forName("java.time.LocalDate"));
        Object term11973 = newInstance(Class.forName("java.time.LocalTime"));
        Object term11978 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term11979 = newInstance(Class.forName("java.time.LocalDate"));
        Object term11983 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term11841, term11841.getClass(), "id", term11842);
        setField(term11841, term11841.getClass(), "token", "VhnistEcCA");
        setField(term11856, term11856.getClass(), "id", term11857);
        setField(term11856, term11856.getClass(), "country", "hlPKLObFBU");
        setBooleanField(term11856, term11856.getClass(), "enabled", false);
        setField(term11872, term11872.getClass(), "id", term11873);
        setField(term11872, term11872.getClass(), "membername", "oNGVAyjCob");
        setField(term11872, term11872.getClass(), "email", "lzqPLDonds");
        setField(term11872, term11872.getClass(), "password", "gCFzBxPZKw");
        setField(term11872, term11872.getClass(), "enabled", term11911);
        setField(term11872, term11872.getClass(), "age", term11913);
        setField(term11872, term11872.getClass(), "phoneNumber", "YNVbzJpOdk");
        setField(term11872, term11872.getClass(), "country", "CjPfMVeNPm");
        setField(term11872, term11872.getClass(), "birthdate", "TeqSJDWXQD");
        setField(term11872, term11872.getClass(), "roles", term11951);
        setBooleanField(term11872, term11872.getClass(), "isUsing2FA", true);
        setField(term11872, term11872.getClass(), "secret", "VTjvZBqRUX");
        setIntField(term11969, term11969.getClass(), "year", 2010);
        setShortField(term11969, term11969.getClass(), "month", (short) 8);
        setShortField(term11969, term11969.getClass(), "day", (short) 29);
        setField(term11968, term11968.getClass(), "date", term11969);
        setByteField(term11973, term11973.getClass(), "hour", (byte) 14);
        setByteField(term11973, term11973.getClass(), "minute", (byte) 6);
        setByteField(term11973, term11973.getClass(), "second", (byte) 52);
        setIntField(term11973, term11973.getClass(), "nano", 882272618);
        setField(term11968, term11968.getClass(), "time", term11973);
        setField(term11872, term11872.getClass(), "regDate", term11968);
        setIntField(term11979, term11979.getClass(), "year", 2011);
        setShortField(term11979, term11979.getClass(), "month", (short) 3);
        setShortField(term11979, term11979.getClass(), "day", (short) 21);
        setField(term11978, term11978.getClass(), "date", term11979);
        setByteField(term11983, term11983.getClass(), "hour", (byte) 10);
        setByteField(term11983, term11983.getClass(), "minute", (byte) 56);
        setByteField(term11983, term11983.getClass(), "second", (byte) 39);
        setIntField(term11983, term11983.getClass(), "nano", 54553750);
        setField(term11978, term11978.getClass(), "time", term11983);
        setField(term11872, term11872.getClass(), "modDate", term11978);
        setField(term11856, term11856.getClass(), "user", term11872);
        setField(term11841, term11841.getClass(), "userLocation", term11856);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.NewLocationToken");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "vhjxsMJjOh";
        callMethod(klass, "setToken", argTypes, term11841, args);
    }

};


