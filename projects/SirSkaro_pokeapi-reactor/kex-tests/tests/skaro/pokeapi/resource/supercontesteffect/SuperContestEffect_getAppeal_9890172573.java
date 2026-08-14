package skaro.pokeapi.resource.supercontesteffect;

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
import static skaro.pokeapi.resource.supercontesteffect.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.util.ArrayList;
import java.lang.Object;

public class SuperContestEffect_getAppeal_9890172573 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term61;

    public SuperContestEffect_getAppeal_9890172573() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term62 = new Integer(-616727354);
        Integer term64 = new Integer(-1955890973);
        Object term68 = newInstance(Class.forName("skaro.pokeapi.resource.FlavorText"));
        Object term70 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term71 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term68, term68.getClass(), "flavorText", "");
        setField(term70, term70.getClass(), "name", null);
        setField(term70, term70.getClass(), "url", null);
        setField(term68, term68.getClass(), "language", term70);
        setField(term71, term71.getClass(), "name", null);
        setField(term71, term71.getClass(), "url", null);
        setField(term68, term68.getClass(), "version", term71);
        ArrayList term66 = new ArrayList();
        ((ArrayList) term66).add(term68);
        ArrayList term74 = new ArrayList();
        term61 = newInstance(Class.forName("skaro.pokeapi.resource.supercontesteffect.SuperContestEffect"));
        setField(term61, term61.getClass(), "id", term62);
        setField(term61, term61.getClass(), "appeal", term64);
        setField(term61, term61.getClass(), "flavorTextEntries", term66);
        setField(term61, term61.getClass(), "moves", term74);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.supercontesteffect.SuperContestEffect");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAppeal", argTypes, term61, args);
    }

};


