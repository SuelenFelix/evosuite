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
import java.lang.Integer;
import java.lang.Boolean;
import java.util.ArrayList;
import java.lang.Object;

public class Language_getIso639_13528010767 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term546;

    public Language_getIso639_13528010767() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term547 = new Integer(-2038273078);
        Boolean term561 = new Boolean(true);
        Object term589 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term591 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term589, term589.getClass(), "name", "");
        setField(term591, term591.getClass(), "name", null);
        setField(term591, term591.getClass(), "url", null);
        setField(term589, term589.getClass(), "language", term591);
        Object term592 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term594 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term592, term592.getClass(), "name", "");
        setField(term594, term594.getClass(), "name", null);
        setField(term594, term594.getClass(), "url", null);
        setField(term592, term592.getClass(), "language", term594);
        ArrayList term587 = new ArrayList();
        ((ArrayList) term587).add(term589);
        ((ArrayList) term587).add(term592);
        term546 = newInstance(Class.forName("skaro.pokeapi.resource.language.Language"));
        setField(term546, term546.getClass(), "id", term547);
        setField(term546, term546.getClass(), "name", "PkWMRdJcBb");
        setField(term546, term546.getClass(), "official", term561);
        setField(term546, term546.getClass(), "iso639", "jSpAteRute");
        setField(term546, term546.getClass(), "iso3166", "swZVeJAxjt");
        setField(term546, term546.getClass(), "names", term587);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.language.Language");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getIso639", argTypes, term546, args);
    }

};


