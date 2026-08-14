package interview;

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
import static interview.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class StringReplacement_1_compare_4679142761 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term259;
     Object term260;
     Object term263;

    public StringReplacement_1_compare_4679142761() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term259 = newInstance(Class.forName("interview.StringReplacement$1"));
        term260 = newInstance(Class.forName("interview.Entity"));
        setIntField(term260, term260.getClass(), "start", -2095575670);
        setIntField(term260, term260.getClass(), "end", 1225272962);
        setField(term260, term260.getClass(), "html", null);
        term263 = newInstance(Class.forName("interview.Entity"));
        setIntField(term263, term263.getClass(), "start", 1324040357);
        setIntField(term263, term263.getClass(), "end", -1588772968);
        setField(term263, term263.getClass(), "html", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("interview.StringReplacement$1");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("interview.Entity");
        argTypes[1] = Class.forName("interview.Entity");
        Object[] args = new Object[2];
        args[0] = term260;
        args[1] = term263;
        callMethod(klass, "compare", argTypes, term259, args);
    }

};


