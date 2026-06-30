package refactoring.app.chapter04;

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
import static refactoring.app.chapter04.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;

public class Province_getPrice_135454063316 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1080;

    public Province_getPrice_135454063316() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1093 = new ArrayList();
        term1080 = newInstance(Class.forName("refactoring.app.chapter04.Province"));
        setField(term1080, term1080.getClass(), "name", "aQFUvuaYxd");
        setField(term1080, term1080.getClass(), "producers", term1093);
        setIntField(term1080, term1080.getClass(), "totalProduction", -626779272);
        setIntField(term1080, term1080.getClass(), "demand", -1150062870);
        setIntField(term1080, term1080.getClass(), "price", -886200503);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter04.Province");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPrice", argTypes, term1080, args);
    }

};


