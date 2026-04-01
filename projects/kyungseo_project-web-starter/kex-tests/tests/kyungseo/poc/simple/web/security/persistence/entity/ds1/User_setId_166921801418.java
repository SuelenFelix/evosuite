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

public class User_setId_166921801418 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4681;
     Object term4797;

    public User_setId_166921801418() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4682 = new Long(6130232388739280211L);
        Boolean term4720 = new Boolean(false);
        Integer term4722 = new Integer(1375330971);
        ArrayList term4760 = new ArrayList();
        term4681 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.User"));
        Object term4777 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4778 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4782 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4787 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4788 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4792 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term4681, term4681.getClass(), "id", term4682);
        setField(term4681, term4681.getClass(), "membername", "JptuwlirlS");
        setField(term4681, term4681.getClass(), "email", "TKOMaGswbU");
        setField(term4681, term4681.getClass(), "password", "YcTbglHiUq");
        setField(term4681, term4681.getClass(), "enabled", term4720);
        setField(term4681, term4681.getClass(), "age", term4722);
        setField(term4681, term4681.getClass(), "phoneNumber", "TiUqHrjoEU");
        setField(term4681, term4681.getClass(), "country", "eoEvZbdLjL");
        setField(term4681, term4681.getClass(), "birthdate", "BkIxsyPkGy");
        setField(term4681, term4681.getClass(), "roles", term4760);
        setBooleanField(term4681, term4681.getClass(), "isUsing2FA", false);
        setField(term4681, term4681.getClass(), "secret", "mrMGwoRgVY");
        setIntField(term4778, term4778.getClass(), "year", 2020);
        setShortField(term4778, term4778.getClass(), "month", (short) 5);
        setShortField(term4778, term4778.getClass(), "day", (short) 12);
        setField(term4777, term4777.getClass(), "date", term4778);
        setByteField(term4782, term4782.getClass(), "hour", (byte) 22);
        setByteField(term4782, term4782.getClass(), "minute", (byte) 7);
        setByteField(term4782, term4782.getClass(), "second", (byte) 49);
        setIntField(term4782, term4782.getClass(), "nano", 677355362);
        setField(term4777, term4777.getClass(), "time", term4782);
        setField(term4681, term4681.getClass(), "regDate", term4777);
        setIntField(term4788, term4788.getClass(), "year", 2010);
        setShortField(term4788, term4788.getClass(), "month", (short) 11);
        setShortField(term4788, term4788.getClass(), "day", (short) 1);
        setField(term4787, term4787.getClass(), "date", term4788);
        setByteField(term4792, term4792.getClass(), "hour", (byte) 5);
        setByteField(term4792, term4792.getClass(), "minute", (byte) 32);
        setByteField(term4792, term4792.getClass(), "second", (byte) 8);
        setIntField(term4792, term4792.getClass(), "nano", 918832231);
        setField(term4787, term4787.getClass(), "time", term4792);
        setField(term4681, term4681.getClass(), "modDate", term4787);
        term4797 = new Long(3423965054378869855L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term4797;
        callMethod(klass, "setId", argTypes, term4681, args);
    }

};


