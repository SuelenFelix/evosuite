package skaro.pokeapi.resource.encounterconditionvalue;

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
import static skaro.pokeapi.resource.encounterconditionvalue.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Object;
import java.util.ArrayList;

public class EncounterConditionValue_setName_17190759404 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term261;

    public EncounterConditionValue_setName_17190759404() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term262 = new Integer(-1922583790);
        Object term303 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term305 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term303, term303.getClass(), "name", "");
        setField(term305, term305.getClass(), "name", null);
        setField(term305, term305.getClass(), "url", null);
        setField(term303, term303.getClass(), "language", term305);
        Object term306 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term308 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term306, term306.getClass(), "name", "");
        setField(term308, term308.getClass(), "name", null);
        setField(term308, term308.getClass(), "url", null);
        setField(term306, term306.getClass(), "language", term308);
        Object term309 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term311 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term309, term309.getClass(), "name", "");
        setField(term311, term311.getClass(), "name", null);
        setField(term311, term311.getClass(), "url", null);
        setField(term309, term309.getClass(), "language", term311);
        Object term312 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term314 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term312, term312.getClass(), "name", "");
        setField(term314, term314.getClass(), "name", null);
        setField(term314, term314.getClass(), "url", null);
        setField(term312, term312.getClass(), "language", term314);
        ArrayList term301 = new ArrayList();
        ((ArrayList) term301).add(term303);
        ((ArrayList) term301).add(term306);
        ((ArrayList) term301).add(term309);
        ((ArrayList) term301).add(term312);
        term261 = newInstance(Class.forName("skaro.pokeapi.resource.encounterconditionvalue.EncounterConditionValue"));
        Object term276 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term261, term261.getClass(), "id", term262);
        setField(term261, term261.getClass(), "name", "GzFkzHGYFt");
        setField(term276, term276.getClass(), "name", "tShwQLRGNe");
        setField(term276, term276.getClass(), "url", "LvtrsXUliU");
        setField(term261, term261.getClass(), "condition", term276);
        setField(term261, term261.getClass(), "names", term301);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.encounterconditionvalue.EncounterConditionValue");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "ieCtQFdkii";
        callMethod(klass, "setName", argTypes, term261, args);
    }

};


