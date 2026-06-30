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

public class PasswordResetToken_equals_146948218913 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16214;
     Object term16352;

    public PasswordResetToken_equals_146948218913() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term16215 = new Long(6187687406539061577L);
        Long term16230 = new Long(-4281700567835283963L);
        Boolean term16268 = new Boolean(true);
        Integer term16270 = new Integer(-439048495);
        Long term16311 = new Long(8779425347424216281L);
        Object term16310 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term16310, term16310.getClass(), "id", term16311);
        setField(term16310, term16310.getClass(), "users", null);
        setField(term16310, term16310.getClass(), "privileges", null);
        setField(term16310, term16310.getClass(), "name", null);
        Object term16313 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term16313, term16313.getClass(), "id", null);
        setField(term16313, term16313.getClass(), "users", null);
        setField(term16313, term16313.getClass(), "privileges", null);
        setField(term16313, term16313.getClass(), "name", null);
        Object term16314 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term16314, term16314.getClass(), "id", null);
        setField(term16314, term16314.getClass(), "users", null);
        setField(term16314, term16314.getClass(), "privileges", null);
        setField(term16314, term16314.getClass(), "name", null);
        ArrayList term16308 = new ArrayList();
        ((ArrayList) term16308).add(term16310);
        ((ArrayList) term16308).add(term16313);
        ((ArrayList) term16308).add(term16314);
        term16214 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.PasswordResetToken"));
        Object term16229 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.User"));
        Object term16330 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term16331 = newInstance(Class.forName("java.time.LocalDate"));
        Object term16335 = newInstance(Class.forName("java.time.LocalTime"));
        Object term16340 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term16341 = newInstance(Class.forName("java.time.LocalDate"));
        Object term16345 = newInstance(Class.forName("java.time.LocalTime"));
        Object term16350 = newInstance(Class.forName("java.util.Date"));
        setField(term16214, term16214.getClass(), "id", term16215);
        setField(term16214, term16214.getClass(), "token", "wbtDRRVkMv");
        setField(term16229, term16229.getClass(), "id", term16230);
        setField(term16229, term16229.getClass(), "membername", "abzzbYwTRo");
        setField(term16229, term16229.getClass(), "email", "HxIZqtNMYu");
        setField(term16229, term16229.getClass(), "password", "NVlTBmmeHa");
        setField(term16229, term16229.getClass(), "enabled", term16268);
        setField(term16229, term16229.getClass(), "age", term16270);
        setField(term16229, term16229.getClass(), "phoneNumber", "QZomwNJvGF");
        setField(term16229, term16229.getClass(), "country", "qfHzTgyYaj");
        setField(term16229, term16229.getClass(), "birthdate", "BzOSSnQpxM");
        setField(term16229, term16229.getClass(), "roles", term16308);
        setBooleanField(term16229, term16229.getClass(), "isUsing2FA", true);
        setField(term16229, term16229.getClass(), "secret", "IqzRlGAXKQ");
        setIntField(term16331, term16331.getClass(), "year", 2024);
        setShortField(term16331, term16331.getClass(), "month", (short) 5);
        setShortField(term16331, term16331.getClass(), "day", (short) 2);
        setField(term16330, term16330.getClass(), "date", term16331);
        setByteField(term16335, term16335.getClass(), "hour", (byte) 16);
        setByteField(term16335, term16335.getClass(), "minute", (byte) 41);
        setByteField(term16335, term16335.getClass(), "second", (byte) 21);
        setIntField(term16335, term16335.getClass(), "nano", 463370731);
        setField(term16330, term16330.getClass(), "time", term16335);
        setField(term16229, term16229.getClass(), "regDate", term16330);
        setIntField(term16341, term16341.getClass(), "year", 2027);
        setShortField(term16341, term16341.getClass(), "month", (short) 10);
        setShortField(term16341, term16341.getClass(), "day", (short) 4);
        setField(term16340, term16340.getClass(), "date", term16341);
        setByteField(term16345, term16345.getClass(), "hour", (byte) 23);
        setByteField(term16345, term16345.getClass(), "minute", (byte) 48);
        setByteField(term16345, term16345.getClass(), "second", (byte) 10);
        setIntField(term16345, term16345.getClass(), "nano", 256586329);
        setField(term16340, term16340.getClass(), "time", term16345);
        setField(term16229, term16229.getClass(), "modDate", term16340);
        setField(term16214, term16214.getClass(), "user", term16229);
        setLongField(term16350, term16350.getClass(), "fastTime", 1502158153899L);
        setField(term16350, term16350.getClass(), "cdate", null);
        setField(term16214, term16214.getClass(), "expiryDate", term16350);
        term16352 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.PasswordResetToken");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term16352;
        callMethod(klass, "equals", argTypes, term16214, args);
    }

};


