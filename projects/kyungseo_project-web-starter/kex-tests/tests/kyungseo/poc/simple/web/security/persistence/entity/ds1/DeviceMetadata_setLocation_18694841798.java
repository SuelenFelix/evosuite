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

public class DeviceMetadata_setLocation_18694841798 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term384;

    public DeviceMetadata_setLocation_18694841798() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term385 = new Long(-316468845751588286L);
        Long term387 = new Long(5127676408959197577L);
        term384 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.DeviceMetadata"));
        Object term413 = newInstance(Class.forName("java.util.Date"));
        setField(term384, term384.getClass(), "id", term385);
        setField(term384, term384.getClass(), "userId", term387);
        setField(term384, term384.getClass(), "deviceDetails", "aJlieCFVtF");
        setField(term384, term384.getClass(), "location", "ZiaGIbnzTs");
        setLongField(term413, term413.getClass(), "fastTime", 1495357463288L);
        setField(term413, term413.getClass(), "cdate", null);
        setField(term384, term384.getClass(), "lastLoggedIn", term413);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.DeviceMetadata");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "tbcdzjIfER";
        callMethod(klass, "setLocation", argTypes, term384, args);
    }

};


