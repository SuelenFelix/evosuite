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

public class User_setUsing2FA_34175100828 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6795;
     Object term6941;

    public User_setUsing2FA_34175100828() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term6796 = new Long(4012955251407483889L);
        Boolean term6834 = new Boolean(false);
        Integer term6836 = new Integer(1072005683);
        Long term6877 = new Long(-4058686252500969842L);
        ArrayList term6879 = new ArrayList();
        ((ArrayList) term6879).add((Object)null);
        ((ArrayList) term6879).add((Object)null);
        ((ArrayList) term6879).add((Object)null);
        ((ArrayList) term6879).add((Object)null);
        ((ArrayList) term6879).add((Object)null);
        ((ArrayList) term6879).add((Object)null);
        ((ArrayList) term6879).add((Object)null);
        ArrayList term6882 = new ArrayList();
        ((ArrayList) term6882).add((Object)null);
        ((ArrayList) term6882).add((Object)null);
        ((ArrayList) term6882).add((Object)null);
        ((ArrayList) term6882).add((Object)null);
        ((ArrayList) term6882).add((Object)null);
        ((ArrayList) term6882).add((Object)null);
        ((ArrayList) term6882).add((Object)null);
        ((ArrayList) term6882).add((Object)null);
        Object term6876 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term6876, term6876.getClass(), "id", term6877);
        setField(term6876, term6876.getClass(), "users", term6879);
        setField(term6876, term6876.getClass(), "privileges", term6882);
        setField(term6876, term6876.getClass(), "name", "");
        Long term6887 = new Long(-6771377873268167033L);
        ArrayList term6889 = new ArrayList();
        ((ArrayList) term6889).add((Object)null);
        ArrayList term6892 = new ArrayList();
        ((ArrayList) term6892).add((Object)null);
        ((ArrayList) term6892).add((Object)null);
        ((ArrayList) term6892).add((Object)null);
        ((ArrayList) term6892).add((Object)null);
        ((ArrayList) term6892).add((Object)null);
        ((ArrayList) term6892).add((Object)null);
        ((ArrayList) term6892).add((Object)null);
        ((ArrayList) term6892).add((Object)null);
        ((ArrayList) term6892).add((Object)null);
        Object term6886 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term6886, term6886.getClass(), "id", term6887);
        setField(term6886, term6886.getClass(), "users", term6889);
        setField(term6886, term6886.getClass(), "privileges", term6892);
        setField(term6886, term6886.getClass(), "name", "");
        Long term6897 = new Long(-7423063312741500355L);
        ArrayList term6899 = new ArrayList();
        ((ArrayList) term6899).add((Object)null);
        ArrayList term6902 = new ArrayList();
        ((ArrayList) term6902).add((Object)null);
        ((ArrayList) term6902).add((Object)null);
        ((ArrayList) term6902).add((Object)null);
        ((ArrayList) term6902).add((Object)null);
        ((ArrayList) term6902).add((Object)null);
        ((ArrayList) term6902).add((Object)null);
        ((ArrayList) term6902).add((Object)null);
        ((ArrayList) term6902).add((Object)null);
        Object term6896 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term6896, term6896.getClass(), "id", term6897);
        setField(term6896, term6896.getClass(), "users", term6899);
        setField(term6896, term6896.getClass(), "privileges", term6902);
        setField(term6896, term6896.getClass(), "name", "");
        ArrayList term6874 = new ArrayList();
        ((ArrayList) term6874).add(term6876);
        ((ArrayList) term6874).add(term6876);
        ((ArrayList) term6874).add(term6886);
        ((ArrayList) term6874).add(term6896);
        ((ArrayList) term6874).add(term6896);
        term6795 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.User"));
        Object term6921 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term6922 = newInstance(Class.forName("java.time.LocalDate"));
        Object term6926 = newInstance(Class.forName("java.time.LocalTime"));
        Object term6931 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term6932 = newInstance(Class.forName("java.time.LocalDate"));
        Object term6936 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term6795, term6795.getClass(), "id", term6796);
        setField(term6795, term6795.getClass(), "membername", "cuWgFcYkPC");
        setField(term6795, term6795.getClass(), "email", "HfbcOKkXBm");
        setField(term6795, term6795.getClass(), "password", "pLbTzSMbsN");
        setField(term6795, term6795.getClass(), "enabled", term6834);
        setField(term6795, term6795.getClass(), "age", term6836);
        setField(term6795, term6795.getClass(), "phoneNumber", "lFSbxerCPP");
        setField(term6795, term6795.getClass(), "country", "vjaZIyixCm");
        setField(term6795, term6795.getClass(), "birthdate", "gAAPyftlIR");
        setField(term6795, term6795.getClass(), "roles", term6874);
        setBooleanField(term6795, term6795.getClass(), "isUsing2FA", false);
        setField(term6795, term6795.getClass(), "secret", "ZzqRHVEXcM");
        setIntField(term6922, term6922.getClass(), "year", 2020);
        setShortField(term6922, term6922.getClass(), "month", (short) 7);
        setShortField(term6922, term6922.getClass(), "day", (short) 24);
        setField(term6921, term6921.getClass(), "date", term6922);
        setByteField(term6926, term6926.getClass(), "hour", (byte) 22);
        setByteField(term6926, term6926.getClass(), "minute", (byte) 16);
        setByteField(term6926, term6926.getClass(), "second", (byte) 59);
        setIntField(term6926, term6926.getClass(), "nano", 588569833);
        setField(term6921, term6921.getClass(), "time", term6926);
        setField(term6795, term6795.getClass(), "regDate", term6921);
        setIntField(term6932, term6932.getClass(), "year", 2019);
        setShortField(term6932, term6932.getClass(), "month", (short) 8);
        setShortField(term6932, term6932.getClass(), "day", (short) 6);
        setField(term6931, term6931.getClass(), "date", term6932);
        setByteField(term6936, term6936.getClass(), "hour", (byte) 5);
        setByteField(term6936, term6936.getClass(), "minute", (byte) 32);
        setByteField(term6936, term6936.getClass(), "second", (byte) 47);
        setIntField(term6936, term6936.getClass(), "nano", 73220317);
        setField(term6931, term6931.getClass(), "time", term6936);
        setField(term6795, term6795.getClass(), "modDate", term6931);
        term6941 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term6941;
        callMethod(klass, "setUsing2FA", argTypes, term6795, args);
    }

};


