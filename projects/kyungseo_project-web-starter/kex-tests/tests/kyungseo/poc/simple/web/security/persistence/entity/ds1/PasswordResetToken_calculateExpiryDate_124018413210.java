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

public class PasswordResetToken_calculateExpiryDate_124018413210 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15525;
     Object term15664;

    public PasswordResetToken_calculateExpiryDate_124018413210() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term15526 = new Long(3437866678450547130L);
        Long term15541 = new Long(-2375099996964834173L);
        Boolean term15579 = new Boolean(false);
        Integer term15581 = new Integer(794568325);
        Long term15622 = new Long(3058795643782579829L);
        Object term15621 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term15621, term15621.getClass(), "id", term15622);
        setField(term15621, term15621.getClass(), "users", null);
        setField(term15621, term15621.getClass(), "privileges", null);
        setField(term15621, term15621.getClass(), "name", null);
        Long term15625 = new Long(-3542890656778018623L);
        Object term15624 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term15624, term15624.getClass(), "id", term15625);
        setField(term15624, term15624.getClass(), "users", null);
        setField(term15624, term15624.getClass(), "privileges", null);
        setField(term15624, term15624.getClass(), "name", null);
        ArrayList term15619 = new ArrayList();
        ((ArrayList) term15619).add(term15621);
        ((ArrayList) term15619).add(term15621);
        ((ArrayList) term15619).add(term15624);
        term15525 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.PasswordResetToken"));
        Object term15540 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.User"));
        Object term15642 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term15643 = newInstance(Class.forName("java.time.LocalDate"));
        Object term15647 = newInstance(Class.forName("java.time.LocalTime"));
        Object term15652 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term15653 = newInstance(Class.forName("java.time.LocalDate"));
        Object term15657 = newInstance(Class.forName("java.time.LocalTime"));
        Object term15662 = newInstance(Class.forName("java.util.Date"));
        setField(term15525, term15525.getClass(), "id", term15526);
        setField(term15525, term15525.getClass(), "token", "zNKHFvTvNQ");
        setField(term15540, term15540.getClass(), "id", term15541);
        setField(term15540, term15540.getClass(), "membername", "cyqgSKerVH");
        setField(term15540, term15540.getClass(), "email", "KMFbAPDgQN");
        setField(term15540, term15540.getClass(), "password", "pOXTylvole");
        setField(term15540, term15540.getClass(), "enabled", term15579);
        setField(term15540, term15540.getClass(), "age", term15581);
        setField(term15540, term15540.getClass(), "phoneNumber", "kfguTpQAqI");
        setField(term15540, term15540.getClass(), "country", "YcPukufpJs");
        setField(term15540, term15540.getClass(), "birthdate", "vvGshYKSpj");
        setField(term15540, term15540.getClass(), "roles", term15619);
        setBooleanField(term15540, term15540.getClass(), "isUsing2FA", false);
        setField(term15540, term15540.getClass(), "secret", "UgIqArPAat");
        setIntField(term15643, term15643.getClass(), "year", 2017);
        setShortField(term15643, term15643.getClass(), "month", (short) 4);
        setShortField(term15643, term15643.getClass(), "day", (short) 7);
        setField(term15642, term15642.getClass(), "date", term15643);
        setByteField(term15647, term15647.getClass(), "hour", (byte) 21);
        setByteField(term15647, term15647.getClass(), "minute", (byte) 7);
        setByteField(term15647, term15647.getClass(), "second", (byte) 57);
        setIntField(term15647, term15647.getClass(), "nano", 229024114);
        setField(term15642, term15642.getClass(), "time", term15647);
        setField(term15540, term15540.getClass(), "regDate", term15642);
        setIntField(term15653, term15653.getClass(), "year", 2019);
        setShortField(term15653, term15653.getClass(), "month", (short) 2);
        setShortField(term15653, term15653.getClass(), "day", (short) 24);
        setField(term15652, term15652.getClass(), "date", term15653);
        setByteField(term15657, term15657.getClass(), "hour", (byte) 1);
        setByteField(term15657, term15657.getClass(), "minute", (byte) 34);
        setByteField(term15657, term15657.getClass(), "second", (byte) 39);
        setIntField(term15657, term15657.getClass(), "nano", 549100800);
        setField(term15652, term15652.getClass(), "time", term15657);
        setField(term15540, term15540.getClass(), "modDate", term15652);
        setField(term15525, term15525.getClass(), "user", term15540);
        setLongField(term15662, term15662.getClass(), "fastTime", 1538078916394L);
        setField(term15662, term15662.getClass(), "cdate", null);
        setField(term15525, term15525.getClass(), "expiryDate", term15662);
        term15664 = new Integer(568599855);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.PasswordResetToken");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term15664;
        callMethod(klass, "calculateExpiryDate", argTypes, term15525, args);
    }

};


