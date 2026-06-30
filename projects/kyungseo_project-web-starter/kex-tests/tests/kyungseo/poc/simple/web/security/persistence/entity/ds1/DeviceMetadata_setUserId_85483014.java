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

public class DeviceMetadata_setUserId_85483014 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term156;
     Object term187;

    public DeviceMetadata_setUserId_85483014() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term157 = new Long(6811161968424632369L);
        Long term159 = new Long(-7237588299778557629L);
        term156 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.DeviceMetadata"));
        Object term185 = newInstance(Class.forName("java.util.Date"));
        setField(term156, term156.getClass(), "id", term157);
        setField(term156, term156.getClass(), "userId", term159);
        setField(term156, term156.getClass(), "deviceDetails", "SzjVpOQTyS");
        setField(term156, term156.getClass(), "location", "MjGYSRKTNF");
        setLongField(term185, term185.getClass(), "fastTime", 1606045635837L);
        setField(term185, term185.getClass(), "cdate", null);
        setField(term156, term156.getClass(), "lastLoggedIn", term185);
        term187 = new Long(6967924379644551255L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.DeviceMetadata");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term187;
        callMethod(klass, "setUserId", argTypes, term156, args);
    }

};


