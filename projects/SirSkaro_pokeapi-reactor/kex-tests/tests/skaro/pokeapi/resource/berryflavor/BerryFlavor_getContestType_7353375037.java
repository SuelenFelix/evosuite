package skaro.pokeapi.resource.berryflavor;

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
import static skaro.pokeapi.resource.berryflavor.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.util.ArrayList;
import java.lang.Object;

public class BerryFlavor_getContestType_7353375037 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term911;

    public BerryFlavor_getContestType_7353375037() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term912 = new Integer(-1530420153);
        Integer term929 = new Integer(-469968304);
        Object term928 = newInstance(Class.forName("skaro.pokeapi.resource.berryflavor.FlavorBerryMap"));
        Object term931 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term928, term928.getClass(), "potency", term929);
        setField(term931, term931.getClass(), "name", null);
        setField(term931, term931.getClass(), "url", null);
        setField(term928, term928.getClass(), "berry", term931);
        ArrayList term926 = new ArrayList();
        ((ArrayList) term926).add(term928);
        ArrayList term959 = new ArrayList();
        term911 = newInstance(Class.forName("skaro.pokeapi.resource.berryflavor.BerryFlavor"));
        Object term934 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term911, term911.getClass(), "id", term912);
        setField(term911, term911.getClass(), "name", "VYkqXKVlAJ");
        setField(term911, term911.getClass(), "barries", term926);
        setField(term934, term934.getClass(), "name", "HHmNoYxIGj");
        setField(term934, term934.getClass(), "url", "PtirvZmsGt");
        setField(term911, term911.getClass(), "contestType", term934);
        setField(term911, term911.getClass(), "names", term959);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.berryflavor.BerryFlavor");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getContestType", argTypes, term911, args);
    }

};


