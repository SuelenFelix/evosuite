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

public class TrackingInformation_display_3951013691 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term275;

    public TrackingInformation_display_3951013691() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term275 = newInstance(Class.forName("refactoring.app.chapter07.inlineClass.TrackingInformation"));
        setField(term275, term275.getClass(), "shippingCompany", "MxlszYVzRf");
        setField(term275, term275.getClass(), "trackingNumber", "LQFpaHEwXR");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter07.inlineClass.TrackingInformation");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "display", argTypes, term275, args);
    }

};


