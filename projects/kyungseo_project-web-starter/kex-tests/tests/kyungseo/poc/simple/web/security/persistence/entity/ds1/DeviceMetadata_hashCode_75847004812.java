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

public class DeviceMetadata_hashCode_75847004812 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term613;

    public DeviceMetadata_hashCode_75847004812() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term614 = new Long(2486810210675247493L);
        Long term616 = new Long(7009926388951271268L);
        term613 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.DeviceMetadata"));
        Object term642 = newInstance(Class.forName("java.util.Date"));
        setField(term613, term613.getClass(), "id", term614);
        setField(term613, term613.getClass(), "userId", term616);
        setField(term613, term613.getClass(), "deviceDetails", "BYqFIqCKAV");
        setField(term613, term613.getClass(), "location", "vrQLuWIDJX");
        setLongField(term642, term642.getClass(), "fastTime", 1745462962080L);
        setField(term642, term642.getClass(), "cdate", null);
        setField(term613, term613.getClass(), "lastLoggedIn", term642);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.DeviceMetadata");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term613, args);
    }

};


