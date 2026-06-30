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
import java.lang.Boolean;
import java.lang.Integer;
import java.util.ArrayList;
import java.lang.Object;

public class UserLocation_init_9533033491 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7999;

    public UserLocation_init_9533033491() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term8000 = new Long(-5367775625638780650L);
        Boolean term8038 = new Boolean(false);
        Integer term8040 = new Integer(1283079251);
        Long term8081 = new Long(-7830820957252387854L);
        ArrayList term8083 = new ArrayList();
        ((ArrayList) term8083).add((Object)null);
        ((ArrayList) term8083).add((Object)null);
        ((ArrayList) term8083).add((Object)null);
        ((ArrayList) term8083).add((Object)null);
        ((ArrayList) term8083).add((Object)null);
        ArrayList term8086 = new ArrayList();
        ((ArrayList) term8086).add((Object)null);
        ((ArrayList) term8086).add((Object)null);
        ((ArrayList) term8086).add((Object)null);
        ((ArrayList) term8086).add((Object)null);
        ((ArrayList) term8086).add((Object)null);
        ((ArrayList) term8086).add((Object)null);
        ((ArrayList) term8086).add((Object)null);
        ((ArrayList) term8086).add((Object)null);
        ((ArrayList) term8086).add((Object)null);
        Object term8080 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term8080, term8080.getClass(), "id", term8081);
        setField(term8080, term8080.getClass(), "users", term8083);
        setField(term8080, term8080.getClass(), "privileges", term8086);
        setField(term8080, term8080.getClass(), "name", "");
        Long term8091 = new Long(-1889784286465977825L);
        ArrayList term8093 = new ArrayList();
        ((ArrayList) term8093).add((Object)null);
        ((ArrayList) term8093).add((Object)null);
        ((ArrayList) term8093).add((Object)null);
        ((ArrayList) term8093).add((Object)null);
        ((ArrayList) term8093).add((Object)null);
        ArrayList term8096 = new ArrayList();
        ((ArrayList) term8096).add((Object)null);
        ((ArrayList) term8096).add((Object)null);
        Object term8090 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term8090, term8090.getClass(), "id", term8091);
        setField(term8090, term8090.getClass(), "users", term8093);
        setField(term8090, term8090.getClass(), "privileges", term8096);
        setField(term8090, term8090.getClass(), "name", "");
        Long term8101 = new Long(-159468133651974975L);
        ArrayList term8103 = new ArrayList();
        ((ArrayList) term8103).add((Object)null);
        ArrayList term8106 = new ArrayList();
        ((ArrayList) term8106).add((Object)null);
        ((ArrayList) term8106).add((Object)null);
        ((ArrayList) term8106).add((Object)null);
        ((ArrayList) term8106).add((Object)null);
        ((ArrayList) term8106).add((Object)null);
        Object term8100 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term8100, term8100.getClass(), "id", term8101);
        setField(term8100, term8100.getClass(), "users", term8103);
        setField(term8100, term8100.getClass(), "privileges", term8106);
        setField(term8100, term8100.getClass(), "name", "");
        ArrayList term8078 = new ArrayList();
        ((ArrayList) term8078).add(term8080);
        ((ArrayList) term8078).add(term8090);
        ((ArrayList) term8078).add(term8100);
        ((ArrayList) term8078).add(term8090);
        term7999 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.User"));
        Object term8125 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term8126 = newInstance(Class.forName("java.time.LocalDate"));
        Object term8130 = newInstance(Class.forName("java.time.LocalTime"));
        Object term8135 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term8136 = newInstance(Class.forName("java.time.LocalDate"));
        Object term8140 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term7999, term7999.getClass(), "id", term8000);
        setField(term7999, term7999.getClass(), "membername", "unvQfYuBUz");
        setField(term7999, term7999.getClass(), "email", "RqnYUpQBbG");
        setField(term7999, term7999.getClass(), "password", "sKnuhmcjCC");
        setField(term7999, term7999.getClass(), "enabled", term8038);
        setField(term7999, term7999.getClass(), "age", term8040);
        setField(term7999, term7999.getClass(), "phoneNumber", "oCBbVNwMnb");
        setField(term7999, term7999.getClass(), "country", "miJxAzOVJy");
        setField(term7999, term7999.getClass(), "birthdate", "kjqlBVaviD");
        setField(term7999, term7999.getClass(), "roles", term8078);
        setBooleanField(term7999, term7999.getClass(), "isUsing2FA", false);
        setField(term7999, term7999.getClass(), "secret", "woQcQRYwNH");
        setIntField(term8126, term8126.getClass(), "year", 2015);
        setShortField(term8126, term8126.getClass(), "month", (short) 4);
        setShortField(term8126, term8126.getClass(), "day", (short) 14);
        setField(term8125, term8125.getClass(), "date", term8126);
        setByteField(term8130, term8130.getClass(), "hour", (byte) 23);
        setByteField(term8130, term8130.getClass(), "minute", (byte) 8);
        setByteField(term8130, term8130.getClass(), "second", (byte) 53);
        setIntField(term8130, term8130.getClass(), "nano", 375234559);
        setField(term8125, term8125.getClass(), "time", term8130);
        setField(term7999, term7999.getClass(), "regDate", term8125);
        setIntField(term8136, term8136.getClass(), "year", 2018);
        setShortField(term8136, term8136.getClass(), "month", (short) 1);
        setShortField(term8136, term8136.getClass(), "day", (short) 29);
        setField(term8135, term8135.getClass(), "date", term8136);
        setByteField(term8140, term8140.getClass(), "hour", (byte) 17);
        setByteField(term8140, term8140.getClass(), "minute", (byte) 5);
        setByteField(term8140, term8140.getClass(), "second", (byte) 53);
        setIntField(term8140, term8140.getClass(), "nano", 36624440);
        setField(term8135, term8135.getClass(), "time", term8140);
        setField(term7999, term7999.getClass(), "modDate", term8135);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.UserLocation");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.User");
        Object[] args = new Object[2];
        args[0] = "lnPIxHHyEK";
        args[1] = term7999;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


