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

public class UserLocation_isEnabled_1494552958 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9751;

    public UserLocation_isEnabled_1494552958() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term9752 = new Long(-1283936527800858962L);
        Long term9768 = new Long(-8901189796092679153L);
        Boolean term9806 = new Boolean(true);
        Integer term9808 = new Integer(-426764678);
        Long term9849 = new Long(1731335447688885587L);
        Object term9848 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term9848, term9848.getClass(), "id", term9849);
        setField(term9848, term9848.getClass(), "users", null);
        setField(term9848, term9848.getClass(), "privileges", null);
        setField(term9848, term9848.getClass(), "name", null);
        ArrayList term9846 = new ArrayList();
        ((ArrayList) term9846).add(term9848);
        term9751 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.UserLocation"));
        Object term9767 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.User"));
        Object term9866 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term9867 = newInstance(Class.forName("java.time.LocalDate"));
        Object term9871 = newInstance(Class.forName("java.time.LocalTime"));
        Object term9876 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term9877 = newInstance(Class.forName("java.time.LocalDate"));
        Object term9881 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term9751, term9751.getClass(), "id", term9752);
        setField(term9751, term9751.getClass(), "country", "TowhQcovXu");
        setBooleanField(term9751, term9751.getClass(), "enabled", false);
        setField(term9767, term9767.getClass(), "id", term9768);
        setField(term9767, term9767.getClass(), "membername", "UFGOnIMOzf");
        setField(term9767, term9767.getClass(), "email", "ySiyRlAQpt");
        setField(term9767, term9767.getClass(), "password", "MiankJgKCp");
        setField(term9767, term9767.getClass(), "enabled", term9806);
        setField(term9767, term9767.getClass(), "age", term9808);
        setField(term9767, term9767.getClass(), "phoneNumber", "lmZBCmpOeb");
        setField(term9767, term9767.getClass(), "country", "cPlYOAUqsP");
        setField(term9767, term9767.getClass(), "birthdate", "ritBUyuuKt");
        setField(term9767, term9767.getClass(), "roles", term9846);
        setBooleanField(term9767, term9767.getClass(), "isUsing2FA", false);
        setField(term9767, term9767.getClass(), "secret", "AOsIglRFcp");
        setIntField(term9867, term9867.getClass(), "year", 2011);
        setShortField(term9867, term9867.getClass(), "month", (short) 1);
        setShortField(term9867, term9867.getClass(), "day", (short) 7);
        setField(term9866, term9866.getClass(), "date", term9867);
        setByteField(term9871, term9871.getClass(), "hour", (byte) 10);
        setByteField(term9871, term9871.getClass(), "minute", (byte) 6);
        setByteField(term9871, term9871.getClass(), "second", (byte) 28);
        setIntField(term9871, term9871.getClass(), "nano", 669533698);
        setField(term9866, term9866.getClass(), "time", term9871);
        setField(term9767, term9767.getClass(), "regDate", term9866);
        setIntField(term9877, term9877.getClass(), "year", 2016);
        setShortField(term9877, term9877.getClass(), "month", (short) 11);
        setShortField(term9877, term9877.getClass(), "day", (short) 15);
        setField(term9876, term9876.getClass(), "date", term9877);
        setByteField(term9881, term9881.getClass(), "hour", (byte) 14);
        setByteField(term9881, term9881.getClass(), "minute", (byte) 34);
        setByteField(term9881, term9881.getClass(), "second", (byte) 23);
        setIntField(term9881, term9881.getClass(), "nano", 287070581);
        setField(term9876, term9876.getClass(), "time", term9881);
        setField(term9767, term9767.getClass(), "modDate", term9876);
        setField(term9751, term9751.getClass(), "user", term9767);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.UserLocation");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isEnabled", argTypes, term9751, args);
    }

};


