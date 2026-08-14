package skaro.pokeapi.resource.contesteffect;

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
import static skaro.pokeapi.resource.contesteffect.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.util.ArrayList;
import java.lang.Object;

public class ContestEffect_getJam_16968668565 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term167;

    public ContestEffect_getJam_16968668565() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term168 = new Integer(1585847225);
        Integer term170 = new Integer(597278769);
        Integer term172 = new Integer(-1685132342);
        Object term176 = newInstance(Class.forName("skaro.pokeapi.resource.Effect"));
        Object term178 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term176, term176.getClass(), "effect", "");
        setField(term178, term178.getClass(), "name", null);
        setField(term178, term178.getClass(), "url", null);
        setField(term176, term176.getClass(), "language", term178);
        Object term179 = newInstance(Class.forName("skaro.pokeapi.resource.Effect"));
        Object term181 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term179, term179.getClass(), "effect", "");
        setField(term181, term181.getClass(), "name", null);
        setField(term181, term181.getClass(), "url", null);
        setField(term179, term179.getClass(), "language", term181);
        Object term182 = newInstance(Class.forName("skaro.pokeapi.resource.Effect"));
        Object term184 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term182, term182.getClass(), "effect", "");
        setField(term184, term184.getClass(), "name", null);
        setField(term184, term184.getClass(), "url", null);
        setField(term182, term182.getClass(), "language", term184);
        Object term185 = newInstance(Class.forName("skaro.pokeapi.resource.Effect"));
        Object term187 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term185, term185.getClass(), "effect", "");
        setField(term187, term187.getClass(), "name", null);
        setField(term187, term187.getClass(), "url", null);
        setField(term185, term185.getClass(), "language", term187);
        Object term188 = newInstance(Class.forName("skaro.pokeapi.resource.Effect"));
        Object term190 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term188, term188.getClass(), "effect", "");
        setField(term190, term190.getClass(), "name", null);
        setField(term190, term190.getClass(), "url", null);
        setField(term188, term188.getClass(), "language", term190);
        Object term191 = newInstance(Class.forName("skaro.pokeapi.resource.Effect"));
        Object term193 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term191, term191.getClass(), "effect", "");
        setField(term193, term193.getClass(), "name", null);
        setField(term193, term193.getClass(), "url", null);
        setField(term191, term191.getClass(), "language", term193);
        Object term194 = newInstance(Class.forName("skaro.pokeapi.resource.Effect"));
        Object term196 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term194, term194.getClass(), "effect", "");
        setField(term196, term196.getClass(), "name", null);
        setField(term196, term196.getClass(), "url", null);
        setField(term194, term194.getClass(), "language", term196);
        ArrayList term174 = new ArrayList();
        ((ArrayList) term174).add(term176);
        ((ArrayList) term174).add(term179);
        ((ArrayList) term174).add(term182);
        ((ArrayList) term174).add(term185);
        ((ArrayList) term174).add(term188);
        ((ArrayList) term174).add(term191);
        ((ArrayList) term174).add(term194);
        Object term201 = newInstance(Class.forName("skaro.pokeapi.resource.FlavorText"));
        Object term203 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term204 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term201, term201.getClass(), "flavorText", "");
        setField(term203, term203.getClass(), "name", null);
        setField(term203, term203.getClass(), "url", null);
        setField(term201, term201.getClass(), "language", term203);
        setField(term204, term204.getClass(), "name", null);
        setField(term204, term204.getClass(), "url", null);
        setField(term201, term201.getClass(), "version", term204);
        ArrayList term199 = new ArrayList();
        ((ArrayList) term199).add(term201);
        term167 = newInstance(Class.forName("skaro.pokeapi.resource.contesteffect.ContestEffect"));
        setField(term167, term167.getClass(), "id", term168);
        setField(term167, term167.getClass(), "appeal", term170);
        setField(term167, term167.getClass(), "jam", term172);
        setField(term167, term167.getClass(), "effectEntries", term174);
        setField(term167, term167.getClass(), "flavorTextEntries", term199);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.contesteffect.ContestEffect");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getJam", argTypes, term167, args);
    }

};


