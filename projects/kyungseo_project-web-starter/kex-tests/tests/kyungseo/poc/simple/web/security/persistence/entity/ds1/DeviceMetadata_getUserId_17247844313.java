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

public class DeviceMetadata_getUserId_17247844313 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term105;

    public DeviceMetadata_getUserId_17247844313() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term106 = new Long(7411271909051562686L);
        Long term108 = new Long(4872422362414183754L);
        term105 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.DeviceMetadata"));
        Object term134 = newInstance(Class.forName("java.util.Date"));
        setField(term105, term105.getClass(), "id", term106);
        setField(term105, term105.getClass(), "userId", term108);
        setField(term105, term105.getClass(), "deviceDetails", "jJCZpVmanW");
        setField(term105, term105.getClass(), "location", "EGtDIRbSSb");
        setLongField(term134, term134.getClass(), "fastTime", 1610940182830L);
        setField(term134, term134.getClass(), "cdate", null);
        setField(term105, term105.getClass(), "lastLoggedIn", term134);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.DeviceMetadata");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUserId", argTypes, term105, args);
    }

};


