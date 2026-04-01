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

public class DeviceMetadata_getLastLoggedIn_8609502469 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term457;

    public DeviceMetadata_getLastLoggedIn_8609502469() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term458 = new Long(-6573104506744284592L);
        Long term460 = new Long(-4920224193275732920L);
        term457 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.DeviceMetadata"));
        Object term486 = newInstance(Class.forName("java.util.Date"));
        setField(term457, term457.getClass(), "id", term458);
        setField(term457, term457.getClass(), "userId", term460);
        setField(term457, term457.getClass(), "deviceDetails", "HyxfbSQYBe");
        setField(term457, term457.getClass(), "location", "pCTimMblYc");
        setLongField(term486, term486.getClass(), "fastTime", 1645834034896L);
        setField(term486, term486.getClass(), "cdate", null);
        setField(term457, term457.getClass(), "lastLoggedIn", term486);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.DeviceMetadata");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastLoggedIn", argTypes, term457, args);
    }

};


