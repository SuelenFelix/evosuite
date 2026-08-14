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

public class ContestEffect_setId_15872352552 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44;
     Object term83;

    public ContestEffect_setId_15872352552() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term45 = new Integer(391863371);
        Integer term47 = new Integer(-1922583790);
        Integer term49 = new Integer(-616727354);
        Object term53 = newInstance(Class.forName("skaro.pokeapi.resource.Effect"));
        Object term55 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term53, term53.getClass(), "effect", "");
        setField(term55, term55.getClass(), "name", null);
        setField(term55, term55.getClass(), "url", null);
        setField(term53, term53.getClass(), "language", term55);
        Object term56 = newInstance(Class.forName("skaro.pokeapi.resource.Effect"));
        Object term58 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term56, term56.getClass(), "effect", "");
        setField(term58, term58.getClass(), "name", null);
        setField(term58, term58.getClass(), "url", null);
        setField(term56, term56.getClass(), "language", term58);
        Object term59 = newInstance(Class.forName("skaro.pokeapi.resource.Effect"));
        Object term61 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term59, term59.getClass(), "effect", "");
        setField(term61, term61.getClass(), "name", null);
        setField(term61, term61.getClass(), "url", null);
        setField(term59, term59.getClass(), "language", term61);
        ArrayList term51 = new ArrayList();
        ((ArrayList) term51).add(term53);
        ((ArrayList) term51).add(term56);
        ((ArrayList) term51).add(term59);
        Object term66 = newInstance(Class.forName("skaro.pokeapi.resource.FlavorText"));
        Object term68 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term69 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term66, term66.getClass(), "flavorText", "");
        setField(term68, term68.getClass(), "name", null);
        setField(term68, term68.getClass(), "url", null);
        setField(term66, term66.getClass(), "language", term68);
        setField(term69, term69.getClass(), "name", null);
        setField(term69, term69.getClass(), "url", null);
        setField(term66, term66.getClass(), "version", term69);
        Object term70 = newInstance(Class.forName("skaro.pokeapi.resource.FlavorText"));
        Object term72 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term73 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term70, term70.getClass(), "flavorText", "");
        setField(term72, term72.getClass(), "name", null);
        setField(term72, term72.getClass(), "url", null);
        setField(term70, term70.getClass(), "language", term72);
        setField(term73, term73.getClass(), "name", null);
        setField(term73, term73.getClass(), "url", null);
        setField(term70, term70.getClass(), "version", term73);
        Object term74 = newInstance(Class.forName("skaro.pokeapi.resource.FlavorText"));
        Object term76 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term77 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term74, term74.getClass(), "flavorText", "");
        setField(term76, term76.getClass(), "name", null);
        setField(term76, term76.getClass(), "url", null);
        setField(term74, term74.getClass(), "language", term76);
        setField(term77, term77.getClass(), "name", null);
        setField(term77, term77.getClass(), "url", null);
        setField(term74, term74.getClass(), "version", term77);
        Object term78 = newInstance(Class.forName("skaro.pokeapi.resource.FlavorText"));
        Object term80 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term78, term78.getClass(), "flavorText", "");
        setField(term80, term80.getClass(), "name", null);
        setField(term80, term80.getClass(), "url", null);
        setField(term78, term78.getClass(), "language", term80);
        setField(term78, term78.getClass(), "version", term76);
        ArrayList term64 = new ArrayList();
        ((ArrayList) term64).add(term66);
        ((ArrayList) term64).add(term70);
        ((ArrayList) term64).add(term74);
        ((ArrayList) term64).add(term78);
        term44 = newInstance(Class.forName("skaro.pokeapi.resource.contesteffect.ContestEffect"));
        setField(term44, term44.getClass(), "id", term45);
        setField(term44, term44.getClass(), "appeal", term47);
        setField(term44, term44.getClass(), "jam", term49);
        setField(term44, term44.getClass(), "effectEntries", term51);
        setField(term44, term44.getClass(), "flavorTextEntries", term64);
        term83 = new Integer(-1955890973);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.contesteffect.ContestEffect");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term83;
        callMethod(klass, "setId", argTypes, term44, args);
    }

};


