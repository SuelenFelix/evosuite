package refactoring.app.chapter07.inlineClass;

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
import static refactoring.app.chapter07.inlineClass.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class TrackingInformation_setShippingCompany_5153933289 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term546;

    public TrackingInformation_setShippingCompany_5153933289() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term546 = newInstance(Class.forName("refactoring.app.chapter07.inlineClass.TrackingInformation"));
        setField(term546, term546.getClass(), "shippingCompany", null);
        setField(term546, term546.getClass(), "trackingNumber", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter07.inlineClass.TrackingInformation");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setShippingCompany", argTypes, term546, args);
    }

};


