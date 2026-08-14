package tudelft.model;

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
import static tudelft.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class PhonePlan_pricePerMonth_13885096811 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7;

    public PhonePlan_pricePerMonth_13885096811() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7 = newInstance(Class.forName("tudelft.model.PhonePlan"));
        setBooleanField(term7, term7.getClass(), "international", false);
        setBooleanField(term7, term7.getClass(), "autoRenewal", true);
        setBooleanField(term7, term7.getClass(), "loyal", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tudelft.model.PhonePlan");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "pricePerMonth", argTypes, term7, args);
    }

};


