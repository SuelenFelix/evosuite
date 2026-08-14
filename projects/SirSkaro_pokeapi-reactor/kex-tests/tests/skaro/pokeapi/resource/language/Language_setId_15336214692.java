package skaro.pokeapi.resource.language;

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
import static skaro.pokeapi.resource.language.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Boolean;
import java.util.ArrayList;
import java.lang.Object;

public class Language_setId_15336214692 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term91;
     Object term148;

    public Language_setId_15336214692() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term92 = new Integer(1162663216);
        Boolean term106 = new Boolean(false);
        Object term134 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term136 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term134, term134.getClass(), "name", "");
        setField(term136, term136.getClass(), "name", null);
        setField(term136, term136.getClass(), "url", null);
        setField(term134, term134.getClass(), "language", term136);
        Object term137 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term139 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term137, term137.getClass(), "name", "");
        setField(term139, term139.getClass(), "name", null);
        setField(term139, term139.getClass(), "url", null);
        setField(term137, term137.getClass(), "language", term139);
        Object term140 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term142 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term140, term140.getClass(), "name", "");
        setField(term142, term142.getClass(), "name", null);
        setField(term142, term142.getClass(), "url", null);
        setField(term140, term140.getClass(), "language", term142);
        Object term143 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term145 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term143, term143.getClass(), "name", "");
        setField(term145, term145.getClass(), "name", null);
        setField(term145, term145.getClass(), "url", null);
        setField(term143, term143.getClass(), "language", term145);
        ArrayList term132 = new ArrayList();
        ((ArrayList) term132).add(term134);
        ((ArrayList) term132).add(term137);
        ((ArrayList) term132).add(term140);
        ((ArrayList) term132).add(term143);
        term91 = newInstance(Class.forName("skaro.pokeapi.resource.language.Language"));
        setField(term91, term91.getClass(), "id", term92);
        setField(term91, term91.getClass(), "name", "HyxfbSQYBe");
        setField(term91, term91.getClass(), "official", term106);
        setField(term91, term91.getClass(), "iso639", "pCTimMblYc");
        setField(term91, term91.getClass(), "iso3166", "hNxWaHcfhY");
        setField(term91, term91.getClass(), "names", term132);
        term148 = new Integer(1484323161);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.language.Language");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term148;
        callMethod(klass, "setId", argTypes, term91, args);
    }

};


