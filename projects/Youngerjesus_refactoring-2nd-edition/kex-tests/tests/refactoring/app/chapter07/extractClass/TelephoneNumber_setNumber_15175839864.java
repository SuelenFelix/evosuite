package refactoring.app.chapter07.extractClass;

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
import static refactoring.app.chapter07.extractClass.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class TelephoneNumber_setNumber_15175839864 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term374;

    public TelephoneNumber_setNumber_15175839864() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term374 = newInstance(Class.forName("refactoring.app.chapter07.extractClass.TelephoneNumber"));
        setField(term374, term374.getClass(), "areaCode", "ZiaGIbnzTs");
        setField(term374, term374.getClass(), "number", "tbcdzjIfER");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter07.extractClass.TelephoneNumber");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "HyxfbSQYBe";
        callMethod(klass, "setNumber", argTypes, term374, args);
    }

};


