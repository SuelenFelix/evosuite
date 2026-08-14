package skaro.pokeapi.utils.locale;

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
import static skaro.pokeapi.utils.locale.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class PokeApiLocaleUtils_getInLocale_2383049113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23;

    public PokeApiLocaleUtils_getInLocale_2383049113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23 = newInstance(Class.forName("skaro.pokeapi.utils.locale.PokeApiLocaleUtils"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.utils.locale.PokeApiLocaleUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("skaro.pokeapi.utils.locale.Localizable");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "getInLocale", argTypes, term23, args);
    }

};


