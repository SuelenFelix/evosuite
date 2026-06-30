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

public class User_setBirthdate_191590266126 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6585;

    public User_setBirthdate_191590266126() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term6586 = new Long(-7400951017937830861L);
        Boolean term6624 = new Boolean(false);
        Integer term6626 = new Integer(691577392);
        ArrayList term6664 = new ArrayList();
        term6585 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.User"));
        Object term6681 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term6682 = newInstance(Class.forName("java.time.LocalDate"));
        Object term6686 = newInstance(Class.forName("java.time.LocalTime"));
        Object term6691 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term6692 = newInstance(Class.forName("java.time.LocalDate"));
        Object term6696 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term6585, term6585.getClass(), "id", term6586);
        setField(term6585, term6585.getClass(), "membername", "dPHtrzKWgf");
        setField(term6585, term6585.getClass(), "email", "olmFxfIVeh");
        setField(term6585, term6585.getClass(), "password", "iSPirUEhXs");
        setField(term6585, term6585.getClass(), "enabled", term6624);
        setField(term6585, term6585.getClass(), "age", term6626);
        setField(term6585, term6585.getClass(), "phoneNumber", "WWyLFmYpAy");
        setField(term6585, term6585.getClass(), "country", "vbSWeJWOQh");
        setField(term6585, term6585.getClass(), "birthdate", "hyvFdAvkOr");
        setField(term6585, term6585.getClass(), "roles", term6664);
        setBooleanField(term6585, term6585.getClass(), "isUsing2FA", false);
        setField(term6585, term6585.getClass(), "secret", "ewbQRtustW");
        setIntField(term6682, term6682.getClass(), "year", 2028);
        setShortField(term6682, term6682.getClass(), "month", (short) 12);
        setShortField(term6682, term6682.getClass(), "day", (short) 2);
        setField(term6681, term6681.getClass(), "date", term6682);
        setByteField(term6686, term6686.getClass(), "hour", (byte) 18);
        setByteField(term6686, term6686.getClass(), "minute", (byte) 6);
        setByteField(term6686, term6686.getClass(), "second", (byte) 45);
        setIntField(term6686, term6686.getClass(), "nano", 967474945);
        setField(term6681, term6681.getClass(), "time", term6686);
        setField(term6585, term6585.getClass(), "regDate", term6681);
        setIntField(term6692, term6692.getClass(), "year", 2018);
        setShortField(term6692, term6692.getClass(), "month", (short) 11);
        setShortField(term6692, term6692.getClass(), "day", (short) 11);
        setField(term6691, term6691.getClass(), "date", term6692);
        setByteField(term6696, term6696.getClass(), "hour", (byte) 11);
        setByteField(term6696, term6696.getClass(), "minute", (byte) 30);
        setByteField(term6696, term6696.getClass(), "second", (byte) 33);
        setIntField(term6696, term6696.getClass(), "nano", 101261443);
        setField(term6691, term6691.getClass(), "time", term6696);
        setField(term6585, term6585.getClass(), "modDate", term6691);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "cABEHYBnys";
        callMethod(klass, "setBirthdate", argTypes, term6585, args);
    }

};


