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

public class User_getBirthdate_207866010114 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3787;

    public User_getBirthdate_207866010114() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3788 = new Long(1993646237353405740L);
        Boolean term3826 = new Boolean(false);
        Integer term3828 = new Integer(97029295);
        Long term3869 = new Long(-4043093655001688454L);
        ArrayList term3871 = new ArrayList();
        ArrayList term3874 = new ArrayList();
        ((ArrayList) term3874).add((Object)null);
        ((ArrayList) term3874).add((Object)null);
        ((ArrayList) term3874).add((Object)null);
        ((ArrayList) term3874).add((Object)null);
        ((ArrayList) term3874).add((Object)null);
        ((ArrayList) term3874).add((Object)null);
        Object term3868 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term3868, term3868.getClass(), "id", term3869);
        setField(term3868, term3868.getClass(), "users", term3871);
        setField(term3868, term3868.getClass(), "privileges", term3874);
        setField(term3868, term3868.getClass(), "name", "");
        ArrayList term3866 = new ArrayList();
        ((ArrayList) term3866).add(term3868);
        term3787 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.User"));
        Object term3893 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3894 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3898 = newInstance(Class.forName("java.time.LocalTime"));
        Object term3903 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3904 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3908 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term3787, term3787.getClass(), "id", term3788);
        setField(term3787, term3787.getClass(), "membername", "EEYmuwyVDP");
        setField(term3787, term3787.getClass(), "email", "EWFbEDAVrE");
        setField(term3787, term3787.getClass(), "password", "EMiMtYgfvr");
        setField(term3787, term3787.getClass(), "enabled", term3826);
        setField(term3787, term3787.getClass(), "age", term3828);
        setField(term3787, term3787.getClass(), "phoneNumber", "OyYyYYnJuF");
        setField(term3787, term3787.getClass(), "country", "aYLvcxZohT");
        setField(term3787, term3787.getClass(), "birthdate", "mnHyQbMyld");
        setField(term3787, term3787.getClass(), "roles", term3866);
        setBooleanField(term3787, term3787.getClass(), "isUsing2FA", false);
        setField(term3787, term3787.getClass(), "secret", "FIdNVptZpW");
        setIntField(term3894, term3894.getClass(), "year", 2014);
        setShortField(term3894, term3894.getClass(), "month", (short) 5);
        setShortField(term3894, term3894.getClass(), "day", (short) 31);
        setField(term3893, term3893.getClass(), "date", term3894);
        setByteField(term3898, term3898.getClass(), "hour", (byte) 16);
        setByteField(term3898, term3898.getClass(), "minute", (byte) 3);
        setByteField(term3898, term3898.getClass(), "second", (byte) 14);
        setIntField(term3898, term3898.getClass(), "nano", 281059649);
        setField(term3893, term3893.getClass(), "time", term3898);
        setField(term3787, term3787.getClass(), "regDate", term3893);
        setIntField(term3904, term3904.getClass(), "year", 2010);
        setShortField(term3904, term3904.getClass(), "month", (short) 12);
        setShortField(term3904, term3904.getClass(), "day", (short) 30);
        setField(term3903, term3903.getClass(), "date", term3904);
        setByteField(term3908, term3908.getClass(), "hour", (byte) 17);
        setByteField(term3908, term3908.getClass(), "minute", (byte) 44);
        setByteField(term3908, term3908.getClass(), "second", (byte) 59);
        setIntField(term3908, term3908.getClass(), "nano", 881407895);
        setField(term3903, term3903.getClass(), "time", term3908);
        setField(term3787, term3787.getClass(), "modDate", term3903);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBirthdate", argTypes, term3787, args);
    }

};


