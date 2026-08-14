package skaro.pokeapi.resource.itemflingeffect;

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
import static skaro.pokeapi.resource.itemflingeffect.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.util.ArrayList;
import java.lang.Object;
import java.util.LinkedList;

public class ItemFlingEffect_setEffectEntries_9739885056 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term244;
     Object term285;

    public ItemFlingEffect_setEffectEntries_9739885056() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term245 = new Integer(-1955890973);
        Object term261 = newInstance(Class.forName("skaro.pokeapi.resource.Effect"));
        Object term263 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term261, term261.getClass(), "effect", "");
        setField(term263, term263.getClass(), "name", null);
        setField(term263, term263.getClass(), "url", null);
        setField(term261, term261.getClass(), "language", term263);
        Object term264 = newInstance(Class.forName("skaro.pokeapi.resource.Effect"));
        Object term266 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term264, term264.getClass(), "effect", "");
        setField(term266, term266.getClass(), "name", null);
        setField(term266, term266.getClass(), "url", null);
        setField(term264, term264.getClass(), "language", term266);
        Object term267 = newInstance(Class.forName("skaro.pokeapi.resource.Effect"));
        Object term269 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term267, term267.getClass(), "effect", "");
        setField(term269, term269.getClass(), "name", null);
        setField(term269, term269.getClass(), "url", null);
        setField(term267, term267.getClass(), "language", term269);
        Object term270 = newInstance(Class.forName("skaro.pokeapi.resource.Effect"));
        Object term272 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term270, term270.getClass(), "effect", "");
        setField(term272, term272.getClass(), "name", null);
        setField(term272, term272.getClass(), "url", null);
        setField(term270, term270.getClass(), "language", term272);
        Object term273 = newInstance(Class.forName("skaro.pokeapi.resource.Effect"));
        Object term275 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term273, term273.getClass(), "effect", "");
        setField(term275, term275.getClass(), "name", null);
        setField(term275, term275.getClass(), "url", null);
        setField(term273, term273.getClass(), "language", term275);
        Object term276 = newInstance(Class.forName("skaro.pokeapi.resource.Effect"));
        Object term278 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term276, term276.getClass(), "effect", "");
        setField(term278, term278.getClass(), "name", null);
        setField(term278, term278.getClass(), "url", null);
        setField(term276, term276.getClass(), "language", term278);
        ArrayList term259 = new ArrayList();
        ((ArrayList) term259).add(term261);
        ((ArrayList) term259).add(term264);
        ((ArrayList) term259).add(term267);
        ((ArrayList) term259).add(term270);
        ((ArrayList) term259).add(term273);
        ((ArrayList) term259).add(term276);
        ArrayList term281 = new ArrayList();
        term244 = newInstance(Class.forName("skaro.pokeapi.resource.itemflingeffect.ItemFlingEffect"));
        setField(term244, term244.getClass(), "id", term245);
        setField(term244, term244.getClass(), "name", "ieCtQFdkii");
        setField(term244, term244.getClass(), "effectEntries", term259);
        setField(term244, term244.getClass(), "items", term281);
        term285 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.itemflingeffect.ItemFlingEffect");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term285;
        callMethod(klass, "setEffectEntries", argTypes, term244, args);
    }

};


