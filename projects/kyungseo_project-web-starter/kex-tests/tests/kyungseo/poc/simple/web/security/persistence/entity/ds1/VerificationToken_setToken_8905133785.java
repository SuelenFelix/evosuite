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

public class VerificationToken_setToken_8905133785 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17392;

    public VerificationToken_setToken_8905133785() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term17393 = new Long(1712520441197520950L);
        Long term17408 = new Long(7043650218274841102L);
        Boolean term17446 = new Boolean(true);
        Integer term17448 = new Integer(-370828664);
        Long term17489 = new Long(-6096774034189525139L);
        Object term17488 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term17488, term17488.getClass(), "id", term17489);
        setField(term17488, term17488.getClass(), "users", null);
        setField(term17488, term17488.getClass(), "privileges", null);
        setField(term17488, term17488.getClass(), "name", null);
        Object term17491 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term17491, term17491.getClass(), "id", null);
        setField(term17491, term17491.getClass(), "users", null);
        setField(term17491, term17491.getClass(), "privileges", null);
        setField(term17491, term17491.getClass(), "name", null);
        ArrayList term17486 = new ArrayList();
        ((ArrayList) term17486).add(term17488);
        ((ArrayList) term17486).add(term17491);
        term17392 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.VerificationToken"));
        Object term17407 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.User"));
        Object term17507 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term17508 = newInstance(Class.forName("java.time.LocalDate"));
        Object term17512 = newInstance(Class.forName("java.time.LocalTime"));
        Object term17517 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term17518 = newInstance(Class.forName("java.time.LocalDate"));
        Object term17522 = newInstance(Class.forName("java.time.LocalTime"));
        Object term17527 = newInstance(Class.forName("java.util.Date"));
        setField(term17392, term17392.getClass(), "id", term17393);
        setField(term17392, term17392.getClass(), "token", "MXAuemWmBo");
        setField(term17407, term17407.getClass(), "id", term17408);
        setField(term17407, term17407.getClass(), "membername", "IEbHsgLKBk");
        setField(term17407, term17407.getClass(), "email", "uFZktToTuS");
        setField(term17407, term17407.getClass(), "password", "pVpSARCHtf");
        setField(term17407, term17407.getClass(), "enabled", term17446);
        setField(term17407, term17407.getClass(), "age", term17448);
        setField(term17407, term17407.getClass(), "phoneNumber", "wnvCIiaAYo");
        setField(term17407, term17407.getClass(), "country", "waPCjDLHIu");
        setField(term17407, term17407.getClass(), "birthdate", "ziLgjZfcmc");
        setField(term17407, term17407.getClass(), "roles", term17486);
        setBooleanField(term17407, term17407.getClass(), "isUsing2FA", true);
        setField(term17407, term17407.getClass(), "secret", "VQLNXTwXTJ");
        setIntField(term17508, term17508.getClass(), "year", 2014);
        setShortField(term17508, term17508.getClass(), "month", (short) 3);
        setShortField(term17508, term17508.getClass(), "day", (short) 6);
        setField(term17507, term17507.getClass(), "date", term17508);
        setByteField(term17512, term17512.getClass(), "hour", (byte) 3);
        setByteField(term17512, term17512.getClass(), "minute", (byte) 21);
        setByteField(term17512, term17512.getClass(), "second", (byte) 53);
        setIntField(term17512, term17512.getClass(), "nano", 978038024);
        setField(term17507, term17507.getClass(), "time", term17512);
        setField(term17407, term17407.getClass(), "regDate", term17507);
        setIntField(term17518, term17518.getClass(), "year", 2013);
        setShortField(term17518, term17518.getClass(), "month", (short) 5);
        setShortField(term17518, term17518.getClass(), "day", (short) 10);
        setField(term17517, term17517.getClass(), "date", term17518);
        setByteField(term17522, term17522.getClass(), "hour", (byte) 8);
        setByteField(term17522, term17522.getClass(), "minute", (byte) 51);
        setByteField(term17522, term17522.getClass(), "second", (byte) 38);
        setIntField(term17522, term17522.getClass(), "nano", 326978944);
        setField(term17517, term17517.getClass(), "time", term17522);
        setField(term17407, term17407.getClass(), "modDate", term17517);
        setField(term17392, term17392.getClass(), "user", term17407);
        setLongField(term17527, term17527.getClass(), "fastTime", 1334853104718L);
        setField(term17527, term17527.getClass(), "cdate", null);
        setField(term17392, term17392.getClass(), "expiryDate", term17527);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.VerificationToken");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "GZygAttIuk";
        callMethod(klass, "setToken", argTypes, term17392, args);
    }

};


