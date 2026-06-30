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

public class NewLocationToken_hashCode_12930322239 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12786;

    public NewLocationToken_hashCode_12930322239() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term12787 = new Long(4003767587571884508L);
        Long term12802 = new Long(-4773031420684190217L);
        Long term12818 = new Long(4815723481405472054L);
        Boolean term12856 = new Boolean(true);
        Integer term12858 = new Integer(-249614216);
        ArrayList term12896 = new ArrayList();
        ((ArrayList) term12896).add((Object)null);
        ((ArrayList) term12896).add((Object)null);
        ((ArrayList) term12896).add((Object)null);
        ((ArrayList) term12896).add((Object)null);
        ((ArrayList) term12896).add((Object)null);
        ((ArrayList) term12896).add((Object)null);
        ((ArrayList) term12896).add((Object)null);
        ((ArrayList) term12896).add((Object)null);
        ((ArrayList) term12896).add((Object)null);
        term12786 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.NewLocationToken"));
        Object term12801 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.UserLocation"));
        Object term12817 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.User"));
        Object term12913 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term12914 = newInstance(Class.forName("java.time.LocalDate"));
        Object term12918 = newInstance(Class.forName("java.time.LocalTime"));
        Object term12923 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term12924 = newInstance(Class.forName("java.time.LocalDate"));
        Object term12928 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term12786, term12786.getClass(), "id", term12787);
        setField(term12786, term12786.getClass(), "token", "laQWfyDqCq");
        setField(term12801, term12801.getClass(), "id", term12802);
        setField(term12801, term12801.getClass(), "country", "gMFGfpbPZE");
        setBooleanField(term12801, term12801.getClass(), "enabled", true);
        setField(term12817, term12817.getClass(), "id", term12818);
        setField(term12817, term12817.getClass(), "membername", "QcfydYbOGP");
        setField(term12817, term12817.getClass(), "email", "FdMzwKizAk");
        setField(term12817, term12817.getClass(), "password", "jjwHVTqCkP");
        setField(term12817, term12817.getClass(), "enabled", term12856);
        setField(term12817, term12817.getClass(), "age", term12858);
        setField(term12817, term12817.getClass(), "phoneNumber", "uUAkxSFPyL");
        setField(term12817, term12817.getClass(), "country", "XfzbAdTaCO");
        setField(term12817, term12817.getClass(), "birthdate", "rDcGfVDmsE");
        setField(term12817, term12817.getClass(), "roles", term12896);
        setBooleanField(term12817, term12817.getClass(), "isUsing2FA", true);
        setField(term12817, term12817.getClass(), "secret", "TxymnVINZF");
        setIntField(term12914, term12914.getClass(), "year", 2018);
        setShortField(term12914, term12914.getClass(), "month", (short) 12);
        setShortField(term12914, term12914.getClass(), "day", (short) 4);
        setField(term12913, term12913.getClass(), "date", term12914);
        setByteField(term12918, term12918.getClass(), "hour", (byte) 6);
        setByteField(term12918, term12918.getClass(), "minute", (byte) 23);
        setByteField(term12918, term12918.getClass(), "second", (byte) 36);
        setIntField(term12918, term12918.getClass(), "nano", 89535482);
        setField(term12913, term12913.getClass(), "time", term12918);
        setField(term12817, term12817.getClass(), "regDate", term12913);
        setIntField(term12924, term12924.getClass(), "year", 2020);
        setShortField(term12924, term12924.getClass(), "month", (short) 1);
        setShortField(term12924, term12924.getClass(), "day", (short) 16);
        setField(term12923, term12923.getClass(), "date", term12924);
        setByteField(term12928, term12928.getClass(), "hour", (byte) 1);
        setByteField(term12928, term12928.getClass(), "minute", (byte) 58);
        setByteField(term12928, term12928.getClass(), "second", (byte) 17);
        setIntField(term12928, term12928.getClass(), "nano", 383254195);
        setField(term12923, term12923.getClass(), "time", term12928);
        setField(term12817, term12817.getClass(), "modDate", term12923);
        setField(term12801, term12801.getClass(), "user", term12817);
        setField(term12786, term12786.getClass(), "userLocation", term12801);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.NewLocationToken");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term12786, args);
    }

};


