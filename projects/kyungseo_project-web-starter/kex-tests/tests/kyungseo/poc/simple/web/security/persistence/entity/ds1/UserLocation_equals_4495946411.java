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

public class UserLocation_equals_4495946411 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10409;
     Object term10541;

    public UserLocation_equals_4495946411() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term10410 = new Long(7495572757420909707L);
        Long term10426 = new Long(-1237494311441603673L);
        Boolean term10464 = new Boolean(true);
        Integer term10466 = new Integer(-1022990421);
        ArrayList term10504 = new ArrayList();
        term10409 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.UserLocation"));
        Object term10425 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.User"));
        Object term10521 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term10522 = newInstance(Class.forName("java.time.LocalDate"));
        Object term10526 = newInstance(Class.forName("java.time.LocalTime"));
        Object term10531 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term10532 = newInstance(Class.forName("java.time.LocalDate"));
        Object term10536 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term10409, term10409.getClass(), "id", term10410);
        setField(term10409, term10409.getClass(), "country", "aZiFZfzhQT");
        setBooleanField(term10409, term10409.getClass(), "enabled", false);
        setField(term10425, term10425.getClass(), "id", term10426);
        setField(term10425, term10425.getClass(), "membername", "HbzAbCwWRh");
        setField(term10425, term10425.getClass(), "email", "yBgWgFtVxP");
        setField(term10425, term10425.getClass(), "password", "NAwiEDVBcB");
        setField(term10425, term10425.getClass(), "enabled", term10464);
        setField(term10425, term10425.getClass(), "age", term10466);
        setField(term10425, term10425.getClass(), "phoneNumber", "jxuVQHHLqy");
        setField(term10425, term10425.getClass(), "country", "TnUXNtKOns");
        setField(term10425, term10425.getClass(), "birthdate", "umsYdaPflb");
        setField(term10425, term10425.getClass(), "roles", term10504);
        setBooleanField(term10425, term10425.getClass(), "isUsing2FA", false);
        setField(term10425, term10425.getClass(), "secret", "CnNmpSyiBE");
        setIntField(term10522, term10522.getClass(), "year", 2018);
        setShortField(term10522, term10522.getClass(), "month", (short) 4);
        setShortField(term10522, term10522.getClass(), "day", (short) 7);
        setField(term10521, term10521.getClass(), "date", term10522);
        setByteField(term10526, term10526.getClass(), "hour", (byte) 22);
        setByteField(term10526, term10526.getClass(), "minute", (byte) 6);
        setByteField(term10526, term10526.getClass(), "second", (byte) 38);
        setIntField(term10526, term10526.getClass(), "nano", 958732191);
        setField(term10521, term10521.getClass(), "time", term10526);
        setField(term10425, term10425.getClass(), "regDate", term10521);
        setIntField(term10532, term10532.getClass(), "year", 2017);
        setShortField(term10532, term10532.getClass(), "month", (short) 7);
        setShortField(term10532, term10532.getClass(), "day", (short) 25);
        setField(term10531, term10531.getClass(), "date", term10532);
        setByteField(term10536, term10536.getClass(), "hour", (byte) 20);
        setByteField(term10536, term10536.getClass(), "minute", (byte) 19);
        setByteField(term10536, term10536.getClass(), "second", (byte) 55);
        setIntField(term10536, term10536.getClass(), "nano", 617531786);
        setField(term10531, term10531.getClass(), "time", term10536);
        setField(term10425, term10425.getClass(), "modDate", term10531);
        setField(term10409, term10409.getClass(), "user", term10425);
        term10541 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.UserLocation");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term10541;
        callMethod(klass, "equals", argTypes, term10409, args);
    }

};


