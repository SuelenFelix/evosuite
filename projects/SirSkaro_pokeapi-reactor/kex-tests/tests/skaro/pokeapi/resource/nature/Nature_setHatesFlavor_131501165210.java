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

public class Nature_setHatesFlavor_131501165210 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2109;
     Object term2231;

    public Nature_setHatesFlavor_131501165210() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term2110 = new Integer(1725571209);
        Object term2226 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term2228 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term2226, term2226.getClass(), "name", "");
        setField(term2228, term2228.getClass(), "name", null);
        setField(term2228, term2228.getClass(), "url", null);
        setField(term2226, term2226.getClass(), "language", term2228);
        ArrayList term2224 = new ArrayList();
        ((ArrayList) term2224).add(term2226);
        term2109 = newInstance(Class.forName("skaro.pokeapi.resource.nature.Nature"));
        Object term2124 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term2149 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term2174 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term2199 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term2109, term2109.getClass(), "id", term2110);
        setField(term2109, term2109.getClass(), "name", "ZkMALXpEAZ");
        setField(term2124, term2124.getClass(), "name", "tXfQjSqDzN");
        setField(term2124, term2124.getClass(), "url", "BjugTaMcxJ");
        setField(term2109, term2109.getClass(), "decreasedStat", term2124);
        setField(term2149, term2149.getClass(), "name", "vGiuZVPJNH");
        setField(term2149, term2149.getClass(), "url", "tlzpzIjMib");
        setField(term2109, term2109.getClass(), "increasedStat", term2149);
        setField(term2174, term2174.getClass(), "name", "AZdLeSugwv");
        setField(term2174, term2174.getClass(), "url", "RMsXuyzKJV");
        setField(term2109, term2109.getClass(), "hatesFlavor", term2174);
        setField(term2199, term2199.getClass(), "name", "FwPbDZcHmB");
        setField(term2199, term2199.getClass(), "url", "hOncybyCAH");
        setField(term2109, term2109.getClass(), "likesFlavor", term2199);
        setField(term2109, term2109.getClass(), "names", term2224);
        term2231 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term2231, term2231.getClass(), "name", "zcorEihhLK");
        setField(term2231, term2231.getClass(), "url", "GrqozDKFOk");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.nature.Nature");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("skaro.pokeapi.resource.NamedApiResource");
        Object[] args = new Object[1];
        args[0] = term2231;
        callMethod(klass, "setHatesFlavor", argTypes, term2109, args);
    }

};


