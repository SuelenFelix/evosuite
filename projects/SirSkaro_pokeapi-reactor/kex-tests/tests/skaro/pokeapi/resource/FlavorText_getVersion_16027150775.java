package skaro.pokeapi.resource;

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
import static skaro.pokeapi.resource.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class FlavorText_getVersion_16027150775 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15446;

    public FlavorText_getVersion_16027150775() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15446 = newInstance(Class.forName("skaro.pokeapi.resource.FlavorText"));
        Object term15459 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term15484 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term15446, term15446.getClass(), "flavorText", "mgjEDzRwET");
        setField(term15459, term15459.getClass(), "name", "CepeBzACyE");
        setField(term15459, term15459.getClass(), "url", "WtgzEUhZIl");
        setField(term15446, term15446.getClass(), "language", term15459);
        setField(term15484, term15484.getClass(), "name", "tzigWGaijF");
        setField(term15484, term15484.getClass(), "url", "VWFNUuzpse");
        setField(term15446, term15446.getClass(), "version", term15484);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.FlavorText");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getVersion", argTypes, term15446, args);
    }

};


