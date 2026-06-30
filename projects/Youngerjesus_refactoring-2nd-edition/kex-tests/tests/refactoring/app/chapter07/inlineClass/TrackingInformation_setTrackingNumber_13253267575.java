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

public class TrackingInformation_setTrackingNumber_13253267575 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term477;

    public TrackingInformation_setTrackingNumber_13253267575() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term477 = newInstance(Class.forName("refactoring.app.chapter07.inlineClass.TrackingInformation"));
        setField(term477, term477.getClass(), "shippingCompany", "RkybSrpybU");
        setField(term477, term477.getClass(), "trackingNumber", "xOEqzGAmDU");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter07.inlineClass.TrackingInformation");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "eZFUvlxvGV";
        callMethod(klass, "setTrackingNumber", argTypes, term477, args);
    }

};


