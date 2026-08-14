package skaro.pokeapi.resource.language;

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
import static skaro.pokeapi.resource.language.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Language_setIso3166_149007077223 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1133;

    public Language_setIso3166_149007077223() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1133 = newInstance(Class.forName("skaro.pokeapi.resource.language.Language"));
        setField(term1133, term1133.getClass(), "id", null);
        setField(term1133, term1133.getClass(), "name", null);
        setField(term1133, term1133.getClass(), "official", null);
        setField(term1133, term1133.getClass(), "iso639", null);
        setField(term1133, term1133.getClass(), "iso3166", null);
        setField(term1133, term1133.getClass(), "names", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.language.Language");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setIso3166", argTypes, term1133, args);
    }

};


