package tudelft.smells.readability;

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
import static tudelft.smells.readability.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Invoice_calculate_12639600143 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term581;

    public Invoice_calculate_12639600143() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term581 = newInstance(Class.forName("tudelft.smells.readability.Invoice"));
        setField(term581, term581.getClass(), "value", null);
        setField(term581, term581.getClass(), "country", null);
        setField(term581, term581.getClass(), "customerType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tudelft.smells.readability.Invoice");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "calculate", argTypes, term581, args);
    }

};


