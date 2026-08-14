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

public class Language_setOfficial_16850242016 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term451;
     Object term514;

    public Language_setOfficial_16850242016() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term452 = new Integer(-1955890973);
        Boolean term466 = new Boolean(true);
        Object term494 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term496 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term494, term494.getClass(), "name", "");
        setField(term496, term496.getClass(), "name", null);
        setField(term496, term496.getClass(), "url", null);
        setField(term494, term494.getClass(), "language", term496);
        Object term497 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term499 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term497, term497.getClass(), "name", "");
        setField(term499, term499.getClass(), "name", null);
        setField(term499, term499.getClass(), "url", null);
        setField(term497, term497.getClass(), "language", term499);
        Object term500 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term502 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term500, term500.getClass(), "name", "");
        setField(term502, term502.getClass(), "name", null);
        setField(term502, term502.getClass(), "url", null);
        setField(term500, term500.getClass(), "language", term502);
        Object term503 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term505 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term503, term503.getClass(), "name", "");
        setField(term505, term505.getClass(), "name", null);
        setField(term505, term505.getClass(), "url", null);
        setField(term503, term503.getClass(), "language", term505);
        Object term506 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term508 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term506, term506.getClass(), "name", "");
        setField(term508, term508.getClass(), "name", null);
        setField(term508, term508.getClass(), "url", null);
        setField(term506, term506.getClass(), "language", term508);
        Object term509 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term511 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term509, term509.getClass(), "name", "");
        setField(term511, term511.getClass(), "name", null);
        setField(term511, term511.getClass(), "url", null);
        setField(term509, term509.getClass(), "language", term511);
        ArrayList term492 = new ArrayList();
        ((ArrayList) term492).add(term494);
        ((ArrayList) term492).add(term497);
        ((ArrayList) term492).add(term500);
        ((ArrayList) term492).add(term503);
        ((ArrayList) term492).add(term506);
        ((ArrayList) term492).add(term509);
        term451 = newInstance(Class.forName("skaro.pokeapi.resource.language.Language"));
        setField(term451, term451.getClass(), "id", term452);
        setField(term451, term451.getClass(), "name", "TJmVBGfTML");
        setField(term451, term451.getClass(), "official", term466);
        setField(term451, term451.getClass(), "iso639", "tPlsykYBqO");
        setField(term451, term451.getClass(), "iso3166", "bLPjGVBhlX");
        setField(term451, term451.getClass(), "names", term492);
        term514 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.language.Language");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Boolean");
        Object[] args = new Object[1];
        args[0] = term514;
        callMethod(klass, "setOfficial", argTypes, term451, args);
    }

};


