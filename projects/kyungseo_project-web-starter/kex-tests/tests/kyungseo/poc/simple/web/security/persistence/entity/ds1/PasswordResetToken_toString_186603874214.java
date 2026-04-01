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

public class PasswordResetToken_toString_186603874214 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16433;

    public PasswordResetToken_toString_186603874214() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term16434 = new Long(1397546230296552361L);
        Long term16449 = new Long(4531694455151993856L);
        Boolean term16487 = new Boolean(true);
        Integer term16489 = new Integer(-920797484);
        Long term16530 = new Long(4543928187003669961L);
        Object term16529 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term16529, term16529.getClass(), "id", term16530);
        setField(term16529, term16529.getClass(), "users", null);
        setField(term16529, term16529.getClass(), "privileges", null);
        setField(term16529, term16529.getClass(), "name", null);
        Long term16533 = new Long(7207062884131909895L);
        Object term16532 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term16532, term16532.getClass(), "id", term16533);
        setField(term16532, term16532.getClass(), "users", null);
        setField(term16532, term16532.getClass(), "privileges", null);
        setField(term16532, term16532.getClass(), "name", null);
        Long term16536 = new Long(5953375436340093396L);
        Object term16535 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term16535, term16535.getClass(), "id", term16536);
        setField(term16535, term16535.getClass(), "users", null);
        setField(term16535, term16535.getClass(), "privileges", null);
        setField(term16535, term16535.getClass(), "name", null);
        Object term16538 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term16538, term16538.getClass(), "id", null);
        setField(term16538, term16538.getClass(), "users", null);
        setField(term16538, term16538.getClass(), "privileges", null);
        setField(term16538, term16538.getClass(), "name", null);
        Object term16539 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term16539, term16539.getClass(), "id", null);
        setField(term16539, term16539.getClass(), "users", null);
        setField(term16539, term16539.getClass(), "privileges", null);
        setField(term16539, term16539.getClass(), "name", null);
        Object term16540 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term16540, term16540.getClass(), "id", null);
        setField(term16540, term16540.getClass(), "users", null);
        setField(term16540, term16540.getClass(), "privileges", null);
        setField(term16540, term16540.getClass(), "name", null);
        Long term16542 = new Long(2280240558714436788L);
        Object term16541 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term16541, term16541.getClass(), "id", term16542);
        setField(term16541, term16541.getClass(), "users", null);
        setField(term16541, term16541.getClass(), "privileges", null);
        setField(term16541, term16541.getClass(), "name", null);
        ArrayList term16527 = new ArrayList();
        ((ArrayList) term16527).add(term16529);
        ((ArrayList) term16527).add(term16532);
        ((ArrayList) term16527).add(term16535);
        ((ArrayList) term16527).add(term16538);
        ((ArrayList) term16527).add(term16539);
        ((ArrayList) term16527).add(term16529);
        ((ArrayList) term16527).add(term16540);
        ((ArrayList) term16527).add(term16541);
        term16433 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.PasswordResetToken"));
        Object term16448 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.User"));
        Object term16559 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term16560 = newInstance(Class.forName("java.time.LocalDate"));
        Object term16564 = newInstance(Class.forName("java.time.LocalTime"));
        Object term16569 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term16570 = newInstance(Class.forName("java.time.LocalDate"));
        Object term16574 = newInstance(Class.forName("java.time.LocalTime"));
        Object term16579 = newInstance(Class.forName("java.util.Date"));
        setField(term16433, term16433.getClass(), "id", term16434);
        setField(term16433, term16433.getClass(), "token", "XiytdmxGYa");
        setField(term16448, term16448.getClass(), "id", term16449);
        setField(term16448, term16448.getClass(), "membername", "xuWbTDWaJN");
        setField(term16448, term16448.getClass(), "email", "LvZCXbeNaa");
        setField(term16448, term16448.getClass(), "password", "CaxKtuZUJI");
        setField(term16448, term16448.getClass(), "enabled", term16487);
        setField(term16448, term16448.getClass(), "age", term16489);
        setField(term16448, term16448.getClass(), "phoneNumber", "wokzuoOQRu");
        setField(term16448, term16448.getClass(), "country", "jIVcJcAtbp");
        setField(term16448, term16448.getClass(), "birthdate", "eugajHLhOv");
        setField(term16448, term16448.getClass(), "roles", term16527);
        setBooleanField(term16448, term16448.getClass(), "isUsing2FA", true);
        setField(term16448, term16448.getClass(), "secret", "hFUzxlerfo");
        setIntField(term16560, term16560.getClass(), "year", 2024);
        setShortField(term16560, term16560.getClass(), "month", (short) 9);
        setShortField(term16560, term16560.getClass(), "day", (short) 8);
        setField(term16559, term16559.getClass(), "date", term16560);
        setByteField(term16564, term16564.getClass(), "hour", (byte) 6);
        setByteField(term16564, term16564.getClass(), "minute", (byte) 3);
        setByteField(term16564, term16564.getClass(), "second", (byte) 52);
        setIntField(term16564, term16564.getClass(), "nano", 511733450);
        setField(term16559, term16559.getClass(), "time", term16564);
        setField(term16448, term16448.getClass(), "regDate", term16559);
        setIntField(term16570, term16570.getClass(), "year", 2015);
        setShortField(term16570, term16570.getClass(), "month", (short) 1);
        setShortField(term16570, term16570.getClass(), "day", (short) 25);
        setField(term16569, term16569.getClass(), "date", term16570);
        setByteField(term16574, term16574.getClass(), "hour", (byte) 16);
        setByteField(term16574, term16574.getClass(), "minute", (byte) 22);
        setByteField(term16574, term16574.getClass(), "second", (byte) 44);
        setIntField(term16574, term16574.getClass(), "nano", 980528775);
        setField(term16569, term16569.getClass(), "time", term16574);
        setField(term16448, term16448.getClass(), "modDate", term16569);
        setField(term16433, term16433.getClass(), "user", term16448);
        setLongField(term16579, term16579.getClass(), "fastTime", 1630952644759L);
        setField(term16579, term16579.getClass(), "cdate", null);
        setField(term16433, term16433.getClass(), "expiryDate", term16579);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.PasswordResetToken");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term16433, args);
    }

};


