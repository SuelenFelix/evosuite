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
import java.util.LinkedList;

public class ContestEffect_setEffectEntries_17270309418 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term294;
     Object term322;

    public ContestEffect_setEffectEntries_17270309418() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term295 = new Integer(-1007160944);
        Integer term297 = new Integer(1135664017);
        Integer term299 = new Integer(590364439);
        Object term303 = newInstance(Class.forName("skaro.pokeapi.resource.Effect"));
        Object term305 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term303, term303.getClass(), "effect", "");
        setField(term305, term305.getClass(), "name", null);
        setField(term305, term305.getClass(), "url", null);
        setField(term303, term303.getClass(), "language", term305);
        Object term306 = newInstance(Class.forName("skaro.pokeapi.resource.Effect"));
        Object term308 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term306, term306.getClass(), "effect", "");
        setField(term308, term308.getClass(), "name", null);
        setField(term308, term308.getClass(), "url", null);
        setField(term306, term306.getClass(), "language", term308);
        Object term309 = newInstance(Class.forName("skaro.pokeapi.resource.Effect"));
        Object term311 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term309, term309.getClass(), "effect", "");
        setField(term311, term311.getClass(), "name", null);
        setField(term311, term311.getClass(), "url", null);
        setField(term309, term309.getClass(), "language", term311);
        ArrayList term301 = new ArrayList();
        ((ArrayList) term301).add(term303);
        ((ArrayList) term301).add(term306);
        ((ArrayList) term301).add(term309);
        Object term316 = newInstance(Class.forName("skaro.pokeapi.resource.FlavorText"));
        Object term318 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term319 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term316, term316.getClass(), "flavorText", "");
        setField(term318, term318.getClass(), "name", null);
        setField(term318, term318.getClass(), "url", null);
        setField(term316, term316.getClass(), "language", term318);
        setField(term319, term319.getClass(), "name", null);
        setField(term319, term319.getClass(), "url", null);
        setField(term316, term316.getClass(), "version", term319);
        ArrayList term314 = new ArrayList();
        ((ArrayList) term314).add(term316);
        term294 = newInstance(Class.forName("skaro.pokeapi.resource.contesteffect.ContestEffect"));
        setField(term294, term294.getClass(), "id", term295);
        setField(term294, term294.getClass(), "appeal", term297);
        setField(term294, term294.getClass(), "jam", term299);
        setField(term294, term294.getClass(), "effectEntries", term301);
        setField(term294, term294.getClass(), "flavorTextEntries", term314);
        term322 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.contesteffect.ContestEffect");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term322;
        callMethod(klass, "setEffectEntries", argTypes, term294, args);
    }

};


