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

public class User_setMembername_138987256719 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4869;

    public User_setMembername_138987256719() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4870 = new Long(-593735869267672817L);
        Boolean term4908 = new Boolean(true);
        Integer term4910 = new Integer(-478195677);
        Long term4951 = new Long(6041374912351843923L);
        ArrayList term4953 = new ArrayList();
        ((ArrayList) term4953).add((Object)null);
        ((ArrayList) term4953).add((Object)null);
        ((ArrayList) term4953).add((Object)null);
        ((ArrayList) term4953).add((Object)null);
        ((ArrayList) term4953).add((Object)null);
        ((ArrayList) term4953).add((Object)null);
        ArrayList term4956 = new ArrayList();
        Object term4950 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term4950, term4950.getClass(), "id", term4951);
        setField(term4950, term4950.getClass(), "users", term4953);
        setField(term4950, term4950.getClass(), "privileges", term4956);
        setField(term4950, term4950.getClass(), "name", "");
        Long term4961 = new Long(1346299551708610248L);
        ArrayList term4963 = new ArrayList();
        ((ArrayList) term4963).add((Object)null);
        ((ArrayList) term4963).add((Object)null);
        ArrayList term4966 = new ArrayList();
        Object term4960 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term4960, term4960.getClass(), "id", term4961);
        setField(term4960, term4960.getClass(), "users", term4963);
        setField(term4960, term4960.getClass(), "privileges", term4966);
        setField(term4960, term4960.getClass(), "name", "");
        ArrayList term4948 = new ArrayList();
        ((ArrayList) term4948).add(term4950);
        ((ArrayList) term4948).add(term4960);
        term4869 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.User"));
        Object term4985 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4986 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4990 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4995 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4996 = newInstance(Class.forName("java.time.LocalDate"));
        Object term5000 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term4869, term4869.getClass(), "id", term4870);
        setField(term4869, term4869.getClass(), "membername", "mxVLTgCwki");
        setField(term4869, term4869.getClass(), "email", "wCurppnDSA");
        setField(term4869, term4869.getClass(), "password", "JydxSNTMYt");
        setField(term4869, term4869.getClass(), "enabled", term4908);
        setField(term4869, term4869.getClass(), "age", term4910);
        setField(term4869, term4869.getClass(), "phoneNumber", "KpurAcrHYT");
        setField(term4869, term4869.getClass(), "country", "QjvDwgKJGz");
        setField(term4869, term4869.getClass(), "birthdate", "ngYxiXTZrk");
        setField(term4869, term4869.getClass(), "roles", term4948);
        setBooleanField(term4869, term4869.getClass(), "isUsing2FA", false);
        setField(term4869, term4869.getClass(), "secret", "Bcivwcjece");
        setIntField(term4986, term4986.getClass(), "year", 2023);
        setShortField(term4986, term4986.getClass(), "month", (short) 8);
        setShortField(term4986, term4986.getClass(), "day", (short) 21);
        setField(term4985, term4985.getClass(), "date", term4986);
        setByteField(term4990, term4990.getClass(), "hour", (byte) 10);
        setByteField(term4990, term4990.getClass(), "minute", (byte) 36);
        setByteField(term4990, term4990.getClass(), "second", (byte) 15);
        setIntField(term4990, term4990.getClass(), "nano", 257070204);
        setField(term4985, term4985.getClass(), "time", term4990);
        setField(term4869, term4869.getClass(), "regDate", term4985);
        setIntField(term4996, term4996.getClass(), "year", 2012);
        setShortField(term4996, term4996.getClass(), "month", (short) 12);
        setShortField(term4996, term4996.getClass(), "day", (short) 14);
        setField(term4995, term4995.getClass(), "date", term4996);
        setByteField(term5000, term5000.getClass(), "hour", (byte) 1);
        setByteField(term5000, term5000.getClass(), "minute", (byte) 47);
        setByteField(term5000, term5000.getClass(), "second", (byte) 3);
        setIntField(term5000, term5000.getClass(), "nano", 359751066);
        setField(term4995, term4995.getClass(), "time", term5000);
        setField(term4869, term4869.getClass(), "modDate", term4995);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "QTefjRuiez";
        callMethod(klass, "setMembername", argTypes, term4869, args);
    }

};


