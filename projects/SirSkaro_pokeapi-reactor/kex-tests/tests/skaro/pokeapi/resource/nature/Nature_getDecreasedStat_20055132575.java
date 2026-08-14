package skaro.pokeapi.resource.nature;

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
import static skaro.pokeapi.resource.nature.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Object;
import java.util.ArrayList;

public class Nature_getDecreasedStat_20055132575 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term909;

    public Nature_getDecreasedStat_20055132575() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term910 = new Integer(-616727354);
        Object term1026 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term1028 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1026, term1026.getClass(), "name", "");
        setField(term1028, term1028.getClass(), "name", null);
        setField(term1028, term1028.getClass(), "url", null);
        setField(term1026, term1026.getClass(), "language", term1028);
        ArrayList term1024 = new ArrayList();
        ((ArrayList) term1024).add(term1026);
        term909 = newInstance(Class.forName("skaro.pokeapi.resource.nature.Nature"));
        Object term924 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term949 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term974 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term999 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term909, term909.getClass(), "id", term910);
        setField(term909, term909.getClass(), "name", "LvJFtLBaxj");
        setField(term924, term924.getClass(), "name", "PHvxnGHptP");
        setField(term924, term924.getClass(), "url", "TimdotUuNC");
        setField(term909, term909.getClass(), "decreasedStat", term924);
        setField(term949, term949.getClass(), "name", "PkWMRdJcBb");
        setField(term949, term949.getClass(), "url", "jSpAteRute");
        setField(term909, term909.getClass(), "increasedStat", term949);
        setField(term974, term974.getClass(), "name", "swZVeJAxjt");
        setField(term974, term974.getClass(), "url", "xOcJIiQQDu");
        setField(term909, term909.getClass(), "hatesFlavor", term974);
        setField(term999, term999.getClass(), "name", "GVizqqzXpy");
        setField(term999, term999.getClass(), "url", "JqXGgAhZPl");
        setField(term909, term909.getClass(), "likesFlavor", term999);
        setField(term909, term909.getClass(), "names", term1024);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.nature.Nature");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDecreasedStat", argTypes, term909, args);
    }

};


