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

public class Entity_compare_19183666752 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term231;
     Object term234;
     Object term237;

    public Entity_compare_19183666752() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term231 = newInstance(Class.forName("interview.Entity"));
        setIntField(term231, term231.getClass(), "start", -184153539);
        setIntField(term231, term231.getClass(), "end", 493620644);
        setField(term231, term231.getClass(), "html", null);
        term234 = newInstance(Class.forName("interview.Entity"));
        setIntField(term234, term234.getClass(), "start", 1328271830);
        setIntField(term234, term234.getClass(), "end", 1596070772);
        setField(term234, term234.getClass(), "html", null);
        term237 = newInstance(Class.forName("interview.Entity"));
        setIntField(term237, term237.getClass(), "start", 97029295);
        setIntField(term237, term237.getClass(), "end", -1371869594);
        setField(term237, term237.getClass(), "html", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("interview.Entity");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("interview.Entity");
        argTypes[1] = Class.forName("interview.Entity");
        Object[] args = new Object[2];
        args[0] = term234;
        args[1] = term237;
        callMethod(klass, "compare", argTypes, term231, args);
    }

};


