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

public class UserLocation_setCountry_20471869275 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8876;

    public UserLocation_setCountry_20471869275() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term8877 = new Long(3660520943100987842L);
        Long term8893 = new Long(-8211240904293846981L);
        Boolean term8931 = new Boolean(true);
        Integer term8933 = new Integer(-507387516);
        ArrayList term8971 = new ArrayList();
        term8876 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.UserLocation"));
        Object term8892 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.User"));
        Object term8988 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term8989 = newInstance(Class.forName("java.time.LocalDate"));
        Object term8993 = newInstance(Class.forName("java.time.LocalTime"));
        Object term8998 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term8999 = newInstance(Class.forName("java.time.LocalDate"));
        Object term9003 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term8876, term8876.getClass(), "id", term8877);
        setField(term8876, term8876.getClass(), "country", "TDQIAXaJru");
        setBooleanField(term8876, term8876.getClass(), "enabled", false);
        setField(term8892, term8892.getClass(), "id", term8893);
        setField(term8892, term8892.getClass(), "membername", "frPMFqGmrE");
        setField(term8892, term8892.getClass(), "email", "DvfOYWcNBN");
        setField(term8892, term8892.getClass(), "password", "cvbvwpPlNk");
        setField(term8892, term8892.getClass(), "enabled", term8931);
        setField(term8892, term8892.getClass(), "age", term8933);
        setField(term8892, term8892.getClass(), "phoneNumber", "uCdLbhvYeG");
        setField(term8892, term8892.getClass(), "country", "ipoyEHBfoG");
        setField(term8892, term8892.getClass(), "birthdate", "iSBTpbiteU");
        setField(term8892, term8892.getClass(), "roles", term8971);
        setBooleanField(term8892, term8892.getClass(), "isUsing2FA", false);
        setField(term8892, term8892.getClass(), "secret", "MTwFbEoMZj");
        setIntField(term8989, term8989.getClass(), "year", 2018);
        setShortField(term8989, term8989.getClass(), "month", (short) 2);
        setShortField(term8989, term8989.getClass(), "day", (short) 16);
        setField(term8988, term8988.getClass(), "date", term8989);
        setByteField(term8993, term8993.getClass(), "hour", (byte) 16);
        setByteField(term8993, term8993.getClass(), "minute", (byte) 32);
        setByteField(term8993, term8993.getClass(), "second", (byte) 46);
        setIntField(term8993, term8993.getClass(), "nano", 932915298);
        setField(term8988, term8988.getClass(), "time", term8993);
        setField(term8892, term8892.getClass(), "regDate", term8988);
        setIntField(term8999, term8999.getClass(), "year", 2013);
        setShortField(term8999, term8999.getClass(), "month", (short) 11);
        setShortField(term8999, term8999.getClass(), "day", (short) 7);
        setField(term8998, term8998.getClass(), "date", term8999);
        setByteField(term9003, term9003.getClass(), "hour", (byte) 9);
        setByteField(term9003, term9003.getClass(), "minute", (byte) 3);
        setByteField(term9003, term9003.getClass(), "second", (byte) 32);
        setIntField(term9003, term9003.getClass(), "nano", 53548583);
        setField(term8998, term8998.getClass(), "time", term9003);
        setField(term8892, term8892.getClass(), "modDate", term8998);
        setField(term8876, term8876.getClass(), "user", term8892);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.UserLocation");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "uEQbnHbyAn";
        callMethod(klass, "setCountry", argTypes, term8876, args);
    }

};


