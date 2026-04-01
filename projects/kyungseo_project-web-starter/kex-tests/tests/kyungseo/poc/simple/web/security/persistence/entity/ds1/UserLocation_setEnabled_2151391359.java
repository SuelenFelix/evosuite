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

public class UserLocation_setEnabled_2151391359 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9966;
     Object term10105;

    public UserLocation_setEnabled_2151391359() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term9967 = new Long(1924411240174876881L);
        Long term9983 = new Long(-8287954071414913487L);
        Boolean term10021 = new Boolean(false);
        Integer term10023 = new Integer(548228925);
        Long term10064 = new Long(-1379663556617181551L);
        Object term10063 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term10063, term10063.getClass(), "id", term10064);
        setField(term10063, term10063.getClass(), "users", null);
        setField(term10063, term10063.getClass(), "privileges", null);
        setField(term10063, term10063.getClass(), "name", null);
        Object term10066 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term10066, term10066.getClass(), "id", null);
        setField(term10066, term10066.getClass(), "users", null);
        setField(term10066, term10066.getClass(), "privileges", null);
        setField(term10066, term10066.getClass(), "name", null);
        Object term10067 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term10067, term10067.getClass(), "id", null);
        setField(term10067, term10067.getClass(), "users", null);
        setField(term10067, term10067.getClass(), "privileges", null);
        setField(term10067, term10067.getClass(), "name", null);
        Object term10068 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term10068, term10068.getClass(), "id", null);
        setField(term10068, term10068.getClass(), "users", null);
        setField(term10068, term10068.getClass(), "privileges", null);
        setField(term10068, term10068.getClass(), "name", null);
        Object term10069 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term10069, term10069.getClass(), "id", null);
        setField(term10069, term10069.getClass(), "users", null);
        setField(term10069, term10069.getClass(), "privileges", null);
        setField(term10069, term10069.getClass(), "name", null);
        ArrayList term10061 = new ArrayList();
        ((ArrayList) term10061).add(term10063);
        ((ArrayList) term10061).add(term10066);
        ((ArrayList) term10061).add(term10067);
        ((ArrayList) term10061).add(term10068);
        ((ArrayList) term10061).add(term10067);
        ((ArrayList) term10061).add(term10069);
        ((ArrayList) term10061).add(term10067);
        ((ArrayList) term10061).add(term10068);
        term9966 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.UserLocation"));
        Object term9982 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.User"));
        Object term10085 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term10086 = newInstance(Class.forName("java.time.LocalDate"));
        Object term10090 = newInstance(Class.forName("java.time.LocalTime"));
        Object term10095 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term10096 = newInstance(Class.forName("java.time.LocalDate"));
        Object term10100 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term9966, term9966.getClass(), "id", term9967);
        setField(term9966, term9966.getClass(), "country", "bdONLhBZoA");
        setBooleanField(term9966, term9966.getClass(), "enabled", false);
        setField(term9982, term9982.getClass(), "id", term9983);
        setField(term9982, term9982.getClass(), "membername", "qPVeRcolUe");
        setField(term9982, term9982.getClass(), "email", "AscZyfQFkU");
        setField(term9982, term9982.getClass(), "password", "nPfruizWey");
        setField(term9982, term9982.getClass(), "enabled", term10021);
        setField(term9982, term9982.getClass(), "age", term10023);
        setField(term9982, term9982.getClass(), "phoneNumber", "RvgkUqMUFX");
        setField(term9982, term9982.getClass(), "country", "nOqmldTbXj");
        setField(term9982, term9982.getClass(), "birthdate", "xNDnWDGUNx");
        setField(term9982, term9982.getClass(), "roles", term10061);
        setBooleanField(term9982, term9982.getClass(), "isUsing2FA", false);
        setField(term9982, term9982.getClass(), "secret", "TSUdwgvHgU");
        setIntField(term10086, term10086.getClass(), "year", 2027);
        setShortField(term10086, term10086.getClass(), "month", (short) 9);
        setShortField(term10086, term10086.getClass(), "day", (short) 19);
        setField(term10085, term10085.getClass(), "date", term10086);
        setByteField(term10090, term10090.getClass(), "hour", (byte) 13);
        setByteField(term10090, term10090.getClass(), "minute", (byte) 17);
        setByteField(term10090, term10090.getClass(), "second", (byte) 43);
        setIntField(term10090, term10090.getClass(), "nano", 359493485);
        setField(term10085, term10085.getClass(), "time", term10090);
        setField(term9982, term9982.getClass(), "regDate", term10085);
        setIntField(term10096, term10096.getClass(), "year", 2028);
        setShortField(term10096, term10096.getClass(), "month", (short) 2);
        setShortField(term10096, term10096.getClass(), "day", (short) 3);
        setField(term10095, term10095.getClass(), "date", term10096);
        setByteField(term10100, term10100.getClass(), "hour", (byte) 14);
        setByteField(term10100, term10100.getClass(), "minute", (byte) 31);
        setByteField(term10100, term10100.getClass(), "second", (byte) 5);
        setIntField(term10100, term10100.getClass(), "nano", 770924836);
        setField(term10095, term10095.getClass(), "time", term10100);
        setField(term9982, term9982.getClass(), "modDate", term10095);
        setField(term9966, term9966.getClass(), "user", term9982);
        term10105 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.UserLocation");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term10105;
        callMethod(klass, "setEnabled", argTypes, term9966, args);
    }

};


