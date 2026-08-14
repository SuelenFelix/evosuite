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

public class ContestEffect_setJam_9981842386 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term207;
     Object term254;

    public ContestEffect_setJam_9981842386() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term208 = new Integer(-1456670397);
        Integer term210 = new Integer(1622346318);
        Integer term212 = new Integer(1048535127);
        Object term216 = newInstance(Class.forName("skaro.pokeapi.resource.Effect"));
        Object term218 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term216, term216.getClass(), "effect", "");
        setField(term218, term218.getClass(), "name", null);
        setField(term218, term218.getClass(), "url", null);
        setField(term216, term216.getClass(), "language", term218);
        Object term219 = newInstance(Class.forName("skaro.pokeapi.resource.Effect"));
        Object term221 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term219, term219.getClass(), "effect", "");
        setField(term221, term221.getClass(), "name", null);
        setField(term221, term221.getClass(), "url", null);
        setField(term219, term219.getClass(), "language", term221);
        Object term222 = newInstance(Class.forName("skaro.pokeapi.resource.Effect"));
        Object term224 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term222, term222.getClass(), "effect", "");
        setField(term224, term224.getClass(), "name", null);
        setField(term224, term224.getClass(), "url", null);
        setField(term222, term222.getClass(), "language", term224);
        Object term225 = newInstance(Class.forName("skaro.pokeapi.resource.Effect"));
        Object term227 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term225, term225.getClass(), "effect", "");
        setField(term227, term227.getClass(), "name", null);
        setField(term227, term227.getClass(), "url", null);
        setField(term225, term225.getClass(), "language", term227);
        Object term228 = newInstance(Class.forName("skaro.pokeapi.resource.Effect"));
        Object term230 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term228, term228.getClass(), "effect", "");
        setField(term230, term230.getClass(), "name", null);
        setField(term230, term230.getClass(), "url", null);
        setField(term228, term228.getClass(), "language", term230);
        Object term231 = newInstance(Class.forName("skaro.pokeapi.resource.Effect"));
        Object term233 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term231, term231.getClass(), "effect", "");
        setField(term233, term233.getClass(), "name", null);
        setField(term233, term233.getClass(), "url", null);
        setField(term231, term231.getClass(), "language", term233);
        ArrayList term214 = new ArrayList();
        ((ArrayList) term214).add(term216);
        ((ArrayList) term214).add(term219);
        ((ArrayList) term214).add(term222);
        ((ArrayList) term214).add(term225);
        ((ArrayList) term214).add(term228);
        ((ArrayList) term214).add(term231);
        Object term238 = newInstance(Class.forName("skaro.pokeapi.resource.FlavorText"));
        Object term240 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term241 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term238, term238.getClass(), "flavorText", "");
        setField(term240, term240.getClass(), "name", null);
        setField(term240, term240.getClass(), "url", null);
        setField(term238, term238.getClass(), "language", term240);
        setField(term241, term241.getClass(), "name", null);
        setField(term241, term241.getClass(), "url", null);
        setField(term238, term238.getClass(), "version", term241);
        Object term242 = newInstance(Class.forName("skaro.pokeapi.resource.FlavorText"));
        Object term244 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term245 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term242, term242.getClass(), "flavorText", "");
        setField(term244, term244.getClass(), "name", null);
        setField(term244, term244.getClass(), "url", null);
        setField(term242, term242.getClass(), "language", term244);
        setField(term245, term245.getClass(), "name", null);
        setField(term245, term245.getClass(), "url", null);
        setField(term242, term242.getClass(), "version", term245);
        Object term246 = newInstance(Class.forName("skaro.pokeapi.resource.FlavorText"));
        setField(term246, term246.getClass(), "flavorText", "");
        setField(term246, term246.getClass(), "language", term241);
        setField(term246, term246.getClass(), "version", term244);
        Object term248 = newInstance(Class.forName("skaro.pokeapi.resource.FlavorText"));
        setField(term248, term248.getClass(), "flavorText", "");
        setField(term248, term248.getClass(), "language", term218);
        setField(term248, term248.getClass(), "version", term233);
        Object term250 = newInstance(Class.forName("skaro.pokeapi.resource.FlavorText"));
        setField(term250, term250.getClass(), "flavorText", "");
        setField(term250, term250.getClass(), "language", term227);
        setField(term250, term250.getClass(), "version", term221);
        ArrayList term236 = new ArrayList();
        ((ArrayList) term236).add(term238);
        ((ArrayList) term236).add(term242);
        ((ArrayList) term236).add(term246);
        ((ArrayList) term236).add(term248);
        ((ArrayList) term236).add(term250);
        term207 = newInstance(Class.forName("skaro.pokeapi.resource.contesteffect.ContestEffect"));
        setField(term207, term207.getClass(), "id", term208);
        setField(term207, term207.getClass(), "appeal", term210);
        setField(term207, term207.getClass(), "jam", term212);
        setField(term207, term207.getClass(), "effectEntries", term214);
        setField(term207, term207.getClass(), "flavorTextEntries", term236);
        term254 = new Integer(-655067527);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.contesteffect.ContestEffect");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term254;
        callMethod(klass, "setJam", argTypes, term207, args);
    }

};


