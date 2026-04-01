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

public class DeviceMetadata_setDeviceDetails_20337772166 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term260;

    public DeviceMetadata_setDeviceDetails_20337772166() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term261 = new Long(-4325723315152823407L);
        Long term263 = new Long(2535595959091595249L);
        term260 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.DeviceMetadata"));
        Object term289 = newInstance(Class.forName("java.util.Date"));
        setField(term260, term260.getClass(), "id", term261);
        setField(term260, term260.getClass(), "userId", term263);
        setField(term260, term260.getClass(), "deviceDetails", "NRdvgJlhkX");
        setField(term260, term260.getClass(), "location", "uuaPigETmJ");
        setLongField(term289, term289.getClass(), "fastTime", 1515890130018L);
        setField(term289, term289.getClass(), "cdate", null);
        setField(term260, term260.getClass(), "lastLoggedIn", term289);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.DeviceMetadata");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "MxlszYVzRf";
        callMethod(klass, "setDeviceDetails", argTypes, term260, args);
    }

};


