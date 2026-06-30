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

public class UserLocation_getId_5684749972 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8225;

    public UserLocation_getId_5684749972() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term8226 = new Long(9160882370265093763L);
        Long term8242 = new Long(6848008460134431064L);
        Boolean term8280 = new Boolean(true);
        Integer term8282 = new Integer(-461771056);
        Long term8323 = new Long(-5338413783740215067L);
        Object term8322 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term8322, term8322.getClass(), "id", term8323);
        setField(term8322, term8322.getClass(), "users", null);
        setField(term8322, term8322.getClass(), "privileges", null);
        setField(term8322, term8322.getClass(), "name", null);
        Long term8326 = new Long(-2720964670491002091L);
        Object term8325 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term8325, term8325.getClass(), "id", term8326);
        setField(term8325, term8325.getClass(), "users", null);
        setField(term8325, term8325.getClass(), "privileges", null);
        setField(term8325, term8325.getClass(), "name", null);
        ArrayList term8320 = new ArrayList();
        ((ArrayList) term8320).add(term8322);
        ((ArrayList) term8320).add(term8325);
        term8225 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.UserLocation"));
        Object term8241 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.User"));
        Object term8343 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term8344 = newInstance(Class.forName("java.time.LocalDate"));
        Object term8348 = newInstance(Class.forName("java.time.LocalTime"));
        Object term8353 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term8354 = newInstance(Class.forName("java.time.LocalDate"));
        Object term8358 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term8225, term8225.getClass(), "id", term8226);
        setField(term8225, term8225.getClass(), "country", "uQjzusifTg");
        setBooleanField(term8225, term8225.getClass(), "enabled", true);
        setField(term8241, term8241.getClass(), "id", term8242);
        setField(term8241, term8241.getClass(), "membername", "mOulGkUjOk");
        setField(term8241, term8241.getClass(), "email", "hNWRuNEgOf");
        setField(term8241, term8241.getClass(), "password", "CEtjGBplmv");
        setField(term8241, term8241.getClass(), "enabled", term8280);
        setField(term8241, term8241.getClass(), "age", term8282);
        setField(term8241, term8241.getClass(), "phoneNumber", "XosDTAzIAT");
        setField(term8241, term8241.getClass(), "country", "lcCEhCpiZM");
        setField(term8241, term8241.getClass(), "birthdate", "OPJlqMJxdq");
        setField(term8241, term8241.getClass(), "roles", term8320);
        setBooleanField(term8241, term8241.getClass(), "isUsing2FA", false);
        setField(term8241, term8241.getClass(), "secret", "uIgRFcwqLd");
        setIntField(term8344, term8344.getClass(), "year", 2028);
        setShortField(term8344, term8344.getClass(), "month", (short) 7);
        setShortField(term8344, term8344.getClass(), "day", (short) 4);
        setField(term8343, term8343.getClass(), "date", term8344);
        setByteField(term8348, term8348.getClass(), "hour", (byte) 13);
        setByteField(term8348, term8348.getClass(), "minute", (byte) 43);
        setByteField(term8348, term8348.getClass(), "second", (byte) 17);
        setIntField(term8348, term8348.getClass(), "nano", 949713407);
        setField(term8343, term8343.getClass(), "time", term8348);
        setField(term8241, term8241.getClass(), "regDate", term8343);
        setIntField(term8354, term8354.getClass(), "year", 2013);
        setShortField(term8354, term8354.getClass(), "month", (short) 3);
        setShortField(term8354, term8354.getClass(), "day", (short) 25);
        setField(term8353, term8353.getClass(), "date", term8354);
        setByteField(term8358, term8358.getClass(), "hour", (byte) 16);
        setByteField(term8358, term8358.getClass(), "minute", (byte) 28);
        setByteField(term8358, term8358.getClass(), "second", (byte) 0);
        setIntField(term8358, term8358.getClass(), "nano", 265797826);
        setField(term8353, term8353.getClass(), "time", term8358);
        setField(term8241, term8241.getClass(), "modDate", term8353);
        setField(term8225, term8225.getClass(), "user", term8241);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.UserLocation");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term8225, args);
    }

};


