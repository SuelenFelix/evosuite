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
import java.util.LinkedList;

public class Nature_setNames_178444845614 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3086;
     Object term3211;

    public Nature_setNames_178444845614() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term3087 = new Integer(1585847225);
        Object term3203 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term3205 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term3203, term3203.getClass(), "name", "");
        setField(term3205, term3205.getClass(), "name", null);
        setField(term3205, term3205.getClass(), "url", null);
        setField(term3203, term3203.getClass(), "language", term3205);
        Object term3206 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term3208 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term3206, term3206.getClass(), "name", "");
        setField(term3208, term3208.getClass(), "name", null);
        setField(term3208, term3208.getClass(), "url", null);
        setField(term3206, term3206.getClass(), "language", term3208);
        ArrayList term3201 = new ArrayList();
        ((ArrayList) term3201).add(term3203);
        ((ArrayList) term3201).add(term3206);
        term3086 = newInstance(Class.forName("skaro.pokeapi.resource.nature.Nature"));
        Object term3101 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term3126 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term3151 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term3176 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term3086, term3086.getClass(), "id", term3087);
        setField(term3086, term3086.getClass(), "name", "wBGfLpNNiZ");
        setField(term3101, term3101.getClass(), "name", "yUGCjlqgJE");
        setField(term3101, term3101.getClass(), "url", "PXdVZyoJyC");
        setField(term3086, term3086.getClass(), "decreasedStat", term3101);
        setField(term3126, term3126.getClass(), "name", "vLerpqavFM");
        setField(term3126, term3126.getClass(), "url", "qnvxzwuGKX");
        setField(term3086, term3086.getClass(), "increasedStat", term3126);
        setField(term3151, term3151.getClass(), "name", "EdPAvpluZg");
        setField(term3151, term3151.getClass(), "url", "DzHVBMqWtE");
        setField(term3086, term3086.getClass(), "hatesFlavor", term3151);
        setField(term3176, term3176.getClass(), "name", "THZSpzBRYP");
        setField(term3176, term3176.getClass(), "url", "ZfBIVGBQOE");
        setField(term3086, term3086.getClass(), "likesFlavor", term3176);
        setField(term3086, term3086.getClass(), "names", term3201);
        term3211 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.nature.Nature");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term3211;
        callMethod(klass, "setNames", argTypes, term3086, args);
    }

};


