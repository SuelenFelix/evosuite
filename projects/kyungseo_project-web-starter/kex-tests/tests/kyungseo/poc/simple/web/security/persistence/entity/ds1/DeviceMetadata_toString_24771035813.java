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

public class DeviceMetadata_toString_24771035813 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term664;

    public DeviceMetadata_toString_24771035813() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term665 = new Long(-7672528020740371001L);
        Long term667 = new Long(-4502405999831680926L);
        term664 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.DeviceMetadata"));
        Object term693 = newInstance(Class.forName("java.util.Date"));
        setField(term664, term664.getClass(), "id", term665);
        setField(term664, term664.getClass(), "userId", term667);
        setField(term664, term664.getClass(), "deviceDetails", "flxyYxBRtu");
        setField(term664, term664.getClass(), "location", "OclPbYPkcH");
        setLongField(term693, term693.getClass(), "fastTime", 1349069753960L);
        setField(term693, term693.getClass(), "cdate", null);
        setField(term664, term664.getClass(), "lastLoggedIn", term693);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.DeviceMetadata");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term664, args);
    }

};


