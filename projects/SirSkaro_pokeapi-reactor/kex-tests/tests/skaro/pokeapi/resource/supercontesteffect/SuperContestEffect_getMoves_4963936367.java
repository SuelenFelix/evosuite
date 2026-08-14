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

public class SuperContestEffect_getMoves_4963936367 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term176;

    public SuperContestEffect_getMoves_4963936367() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term177 = new Integer(1585847225);
        Integer term179 = new Integer(597278769);
        Object term183 = newInstance(Class.forName("skaro.pokeapi.resource.FlavorText"));
        Object term185 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term186 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term183, term183.getClass(), "flavorText", "");
        setField(term185, term185.getClass(), "name", null);
        setField(term185, term185.getClass(), "url", null);
        setField(term183, term183.getClass(), "language", term185);
        setField(term186, term186.getClass(), "name", null);
        setField(term186, term186.getClass(), "url", null);
        setField(term183, term183.getClass(), "version", term186);
        ArrayList term181 = new ArrayList();
        ((ArrayList) term181).add(term183);
        ArrayList term189 = new ArrayList();
        term176 = newInstance(Class.forName("skaro.pokeapi.resource.supercontesteffect.SuperContestEffect"));
        setField(term176, term176.getClass(), "id", term177);
        setField(term176, term176.getClass(), "appeal", term179);
        setField(term176, term176.getClass(), "flavorTextEntries", term181);
        setField(term176, term176.getClass(), "moves", term189);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.supercontesteffect.SuperContestEffect");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMoves", argTypes, term176, args);
    }

};


