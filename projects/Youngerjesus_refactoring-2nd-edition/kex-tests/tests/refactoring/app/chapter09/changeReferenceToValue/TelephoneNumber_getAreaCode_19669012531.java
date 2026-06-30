package refactoring.app.chapter09.changeReferenceToValue;

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
import static refactoring.app.chapter09.changeReferenceToValue.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class TelephoneNumber_getAreaCode_19669012531 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45;

    public TelephoneNumber_getAreaCode_19669012531() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45 = newInstance(Class.forName("refactoring.app.chapter09.changeReferenceToValue.TelephoneNumber"));
        setField(term45, term45.getClass(), "areaCode", "MuLcgQHgqz");
        setField(term45, term45.getClass(), "number", "xxtlPwDYFs");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter09.changeReferenceToValue.TelephoneNumber");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAreaCode", argTypes, term45, args);
    }

};


