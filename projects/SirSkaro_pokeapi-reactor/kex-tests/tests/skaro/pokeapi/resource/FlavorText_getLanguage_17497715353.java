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

public class FlavorText_getLanguage_17497715353 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15175;

    public FlavorText_getLanguage_17497715353() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15175 = newInstance(Class.forName("skaro.pokeapi.resource.FlavorText"));
        Object term15188 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term15213 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term15175, term15175.getClass(), "flavorText", "MeFZCtLbdV");
        setField(term15188, term15188.getClass(), "name", "oNgxBniAuz");
        setField(term15188, term15188.getClass(), "url", "hvbJVpbmAQ");
        setField(term15175, term15175.getClass(), "language", term15188);
        setField(term15213, term15213.getClass(), "name", "aqayJgOWOQ");
        setField(term15213, term15213.getClass(), "url", "YStxlrcedL");
        setField(term15175, term15175.getClass(), "version", term15213);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.FlavorText");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLanguage", argTypes, term15175, args);
    }

};


