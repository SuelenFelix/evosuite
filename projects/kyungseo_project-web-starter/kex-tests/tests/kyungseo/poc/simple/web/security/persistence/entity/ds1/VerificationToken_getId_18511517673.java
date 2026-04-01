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

public class VerificationToken_getId_18511517673 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16955;

    public VerificationToken_getId_18511517673() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term16956 = new Long(-1750953812188769604L);
        Long term16971 = new Long(-2708952612032666340L);
        Boolean term17009 = new Boolean(false);
        Integer term17011 = new Integer(510162332);
        Long term17052 = new Long(-1148993446345293581L);
        Object term17051 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term17051, term17051.getClass(), "id", term17052);
        setField(term17051, term17051.getClass(), "users", null);
        setField(term17051, term17051.getClass(), "privileges", null);
        setField(term17051, term17051.getClass(), "name", null);
        Long term17055 = new Long(-3672309483214533219L);
        Object term17054 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term17054, term17054.getClass(), "id", term17055);
        setField(term17054, term17054.getClass(), "users", null);
        setField(term17054, term17054.getClass(), "privileges", null);
        setField(term17054, term17054.getClass(), "name", null);
        ArrayList term17049 = new ArrayList();
        ((ArrayList) term17049).add(term17051);
        ((ArrayList) term17049).add(term17051);
        ((ArrayList) term17049).add(term17054);
        term16955 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.VerificationToken"));
        Object term16970 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.User"));
        Object term17072 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term17073 = newInstance(Class.forName("java.time.LocalDate"));
        Object term17077 = newInstance(Class.forName("java.time.LocalTime"));
        Object term17082 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term17083 = newInstance(Class.forName("java.time.LocalDate"));
        Object term17087 = newInstance(Class.forName("java.time.LocalTime"));
        Object term17092 = newInstance(Class.forName("java.util.Date"));
        setField(term16955, term16955.getClass(), "id", term16956);
        setField(term16955, term16955.getClass(), "token", "ohZrjboUnX");
        setField(term16970, term16970.getClass(), "id", term16971);
        setField(term16970, term16970.getClass(), "membername", "rwlrpQuNrG");
        setField(term16970, term16970.getClass(), "email", "fctYGLXetS");
        setField(term16970, term16970.getClass(), "password", "UPbgrEUWQD");
        setField(term16970, term16970.getClass(), "enabled", term17009);
        setField(term16970, term16970.getClass(), "age", term17011);
        setField(term16970, term16970.getClass(), "phoneNumber", "HABnTZidNp");
        setField(term16970, term16970.getClass(), "country", "qXysRdBrsg");
        setField(term16970, term16970.getClass(), "birthdate", "hbtKoWkZLU");
        setField(term16970, term16970.getClass(), "roles", term17049);
        setBooleanField(term16970, term16970.getClass(), "isUsing2FA", false);
        setField(term16970, term16970.getClass(), "secret", "YyIBJVokET");
        setIntField(term17073, term17073.getClass(), "year", 2010);
        setShortField(term17073, term17073.getClass(), "month", (short) 2);
        setShortField(term17073, term17073.getClass(), "day", (short) 11);
        setField(term17072, term17072.getClass(), "date", term17073);
        setByteField(term17077, term17077.getClass(), "hour", (byte) 12);
        setByteField(term17077, term17077.getClass(), "minute", (byte) 49);
        setByteField(term17077, term17077.getClass(), "second", (byte) 35);
        setIntField(term17077, term17077.getClass(), "nano", 685384504);
        setField(term17072, term17072.getClass(), "time", term17077);
        setField(term16970, term16970.getClass(), "regDate", term17072);
        setIntField(term17083, term17083.getClass(), "year", 2024);
        setShortField(term17083, term17083.getClass(), "month", (short) 8);
        setShortField(term17083, term17083.getClass(), "day", (short) 7);
        setField(term17082, term17082.getClass(), "date", term17083);
        setByteField(term17087, term17087.getClass(), "hour", (byte) 8);
        setByteField(term17087, term17087.getClass(), "minute", (byte) 41);
        setByteField(term17087, term17087.getClass(), "second", (byte) 36);
        setIntField(term17087, term17087.getClass(), "nano", 84091386);
        setField(term17082, term17082.getClass(), "time", term17087);
        setField(term16970, term16970.getClass(), "modDate", term17082);
        setField(term16955, term16955.getClass(), "user", term16970);
        setLongField(term17092, term17092.getClass(), "fastTime", 1739417792956L);
        setField(term17092, term17092.getClass(), "cdate", null);
        setField(term16955, term16955.getClass(), "expiryDate", term17092);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.VerificationToken");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term16955, args);
    }

};


