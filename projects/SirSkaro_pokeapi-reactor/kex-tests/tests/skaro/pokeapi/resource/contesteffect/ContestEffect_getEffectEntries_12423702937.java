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

public class ContestEffect_getEffectEntries_12423702937 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term256;

    public ContestEffect_getEffectEntries_12423702937() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term257 = new Integer(-6029667);
        Integer term259 = new Integer(-2068769794);
        Integer term261 = new Integer(-117576464);
        Object term265 = newInstance(Class.forName("skaro.pokeapi.resource.Effect"));
        Object term267 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term265, term265.getClass(), "effect", "");
        setField(term267, term267.getClass(), "name", null);
        setField(term267, term267.getClass(), "url", null);
        setField(term265, term265.getClass(), "language", term267);
        Object term268 = newInstance(Class.forName("skaro.pokeapi.resource.Effect"));
        Object term270 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term268, term268.getClass(), "effect", "");
        setField(term270, term270.getClass(), "name", null);
        setField(term270, term270.getClass(), "url", null);
        setField(term268, term268.getClass(), "language", term270);
        Object term271 = newInstance(Class.forName("skaro.pokeapi.resource.Effect"));
        Object term273 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term271, term271.getClass(), "effect", "");
        setField(term273, term273.getClass(), "name", null);
        setField(term273, term273.getClass(), "url", null);
        setField(term271, term271.getClass(), "language", term273);
        Object term274 = newInstance(Class.forName("skaro.pokeapi.resource.Effect"));
        Object term276 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term274, term274.getClass(), "effect", "");
        setField(term276, term276.getClass(), "name", null);
        setField(term276, term276.getClass(), "url", null);
        setField(term274, term274.getClass(), "language", term276);
        Object term277 = newInstance(Class.forName("skaro.pokeapi.resource.Effect"));
        Object term279 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term277, term277.getClass(), "effect", "");
        setField(term279, term279.getClass(), "name", null);
        setField(term279, term279.getClass(), "url", null);
        setField(term277, term277.getClass(), "language", term279);
        ArrayList term263 = new ArrayList();
        ((ArrayList) term263).add(term265);
        ((ArrayList) term263).add(term268);
        ((ArrayList) term263).add(term271);
        ((ArrayList) term263).add(term274);
        ((ArrayList) term263).add(term277);
        Object term284 = newInstance(Class.forName("skaro.pokeapi.resource.FlavorText"));
        Object term286 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term287 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term284, term284.getClass(), "flavorText", "");
        setField(term286, term286.getClass(), "name", null);
        setField(term286, term286.getClass(), "url", null);
        setField(term284, term284.getClass(), "language", term286);
        setField(term287, term287.getClass(), "name", null);
        setField(term287, term287.getClass(), "url", null);
        setField(term284, term284.getClass(), "version", term287);
        Object term288 = newInstance(Class.forName("skaro.pokeapi.resource.FlavorText"));
        Object term290 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term291 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term288, term288.getClass(), "flavorText", "");
        setField(term290, term290.getClass(), "name", null);
        setField(term290, term290.getClass(), "url", null);
        setField(term288, term288.getClass(), "language", term290);
        setField(term291, term291.getClass(), "name", null);
        setField(term291, term291.getClass(), "url", null);
        setField(term288, term288.getClass(), "version", term291);
        ArrayList term282 = new ArrayList();
        ((ArrayList) term282).add(term284);
        ((ArrayList) term282).add(term288);
        term256 = newInstance(Class.forName("skaro.pokeapi.resource.contesteffect.ContestEffect"));
        setField(term256, term256.getClass(), "id", term257);
        setField(term256, term256.getClass(), "appeal", term259);
        setField(term256, term256.getClass(), "jam", term261);
        setField(term256, term256.getClass(), "effectEntries", term263);
        setField(term256, term256.getClass(), "flavorTextEntries", term282);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.contesteffect.ContestEffect");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEffectEntries", argTypes, term256, args);
    }

};


