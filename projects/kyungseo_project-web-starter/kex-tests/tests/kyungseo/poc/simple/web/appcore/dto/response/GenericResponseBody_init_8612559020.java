package kyungseo.poc.simple.web.appcore.dto.response;

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
import static kyungseo.poc.simple.web.appcore.dto.response.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Boolean;
import java.lang.Object;

public class GenericResponseBody_init_8612559020 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5778;
     Object term5780;
     Object term5818;
     Object term5819;

    public GenericResponseBody_init_8612559020() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5778 = new Integer(597278769);
        term5780 = new Boolean(false);
        term5818 = newInstance(Class.forName("java.lang.Object"));
        term5819 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term5820 = newInstance(Class.forName("java.time.LocalDate"));
        Object term5824 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term5820, term5820.getClass(), "year", 2019);
        setShortField(term5820, term5820.getClass(), "month", (short) 2);
        setShortField(term5820, term5820.getClass(), "day", (short) 21);
        setField(term5819, term5819.getClass(), "date", term5820);
        setByteField(term5824, term5824.getClass(), "hour", (byte) 5);
        setByteField(term5824, term5824.getClass(), "minute", (byte) 41);
        setByteField(term5824, term5824.getClass(), "second", (byte) 11);
        setIntField(term5824, term5824.getClass(), "nano", 859829782);
        setField(term5819, term5819.getClass(), "time", term5824);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.appcore.dto.response.GenericResponseBody");
        Class<?>[] argTypes = new Class<?>[7];
        argTypes[0] = int.class;
        argTypes[1] = boolean.class;
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("java.lang.String");
        argTypes[4] = Class.forName("java.lang.String");
        argTypes[5] = Class.forName("java.lang.Object");
        argTypes[6] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[7];
        args[0] = term5778;
        args[1] = term5780;
        args[2] = "tShwQLRGNe";
        args[3] = "LvtrsXUliU";
        args[4] = "xLbjWUgOIL";
        args[5] = term5818;
        args[6] = term5819;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


