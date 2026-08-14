package skaro.pokeapi.resource.contesttype;

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
import static skaro.pokeapi.resource.contesttype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ContestName_getLanguage_13689313465 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term405;

    public ContestName_getLanguage_13689313465() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term405 = newInstance(Class.forName("skaro.pokeapi.resource.contesttype.ContestName"));
        Object term430 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term405, term405.getClass(), "name", "HyxfbSQYBe");
        setField(term405, term405.getClass(), "color", "pCTimMblYc");
        setField(term430, term430.getClass(), "name", "hNxWaHcfhY");
        setField(term430, term430.getClass(), "url", "RkybSrpybU");
        setField(term405, term405.getClass(), "language", term430);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.contesttype.ContestName");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLanguage", argTypes, term405, args);
    }

};


