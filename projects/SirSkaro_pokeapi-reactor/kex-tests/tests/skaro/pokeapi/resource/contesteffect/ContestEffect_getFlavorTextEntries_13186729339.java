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

public class ContestEffect_getFlavorTextEntries_13186729339 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term325;

    public ContestEffect_getFlavorTextEntries_13186729339() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term326 = new Integer(865208305);
        Integer term328 = new Integer(-1275173084);
        Integer term330 = new Integer(-244121226);
        Object term334 = newInstance(Class.forName("skaro.pokeapi.resource.Effect"));
        Object term336 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term334, term334.getClass(), "effect", "");
        setField(term336, term336.getClass(), "name", null);
        setField(term336, term336.getClass(), "url", null);
        setField(term334, term334.getClass(), "language", term336);
        ArrayList term332 = new ArrayList();
        ((ArrayList) term332).add(term334);
        Object term341 = newInstance(Class.forName("skaro.pokeapi.resource.FlavorText"));
        Object term343 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term344 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term341, term341.getClass(), "flavorText", "");
        setField(term343, term343.getClass(), "name", null);
        setField(term343, term343.getClass(), "url", null);
        setField(term341, term341.getClass(), "language", term343);
        setField(term344, term344.getClass(), "name", null);
        setField(term344, term344.getClass(), "url", null);
        setField(term341, term341.getClass(), "version", term344);
        Object term345 = newInstance(Class.forName("skaro.pokeapi.resource.FlavorText"));
        Object term347 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term348 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term345, term345.getClass(), "flavorText", "");
        setField(term347, term347.getClass(), "name", null);
        setField(term347, term347.getClass(), "url", null);
        setField(term345, term345.getClass(), "language", term347);
        setField(term348, term348.getClass(), "name", null);
        setField(term348, term348.getClass(), "url", null);
        setField(term345, term345.getClass(), "version", term348);
        Object term349 = newInstance(Class.forName("skaro.pokeapi.resource.FlavorText"));
        Object term351 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term352 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term349, term349.getClass(), "flavorText", "");
        setField(term351, term351.getClass(), "name", null);
        setField(term351, term351.getClass(), "url", null);
        setField(term349, term349.getClass(), "language", term351);
        setField(term352, term352.getClass(), "name", null);
        setField(term352, term352.getClass(), "url", null);
        setField(term349, term349.getClass(), "version", term352);
        Object term353 = newInstance(Class.forName("skaro.pokeapi.resource.FlavorText"));
        Object term355 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term356 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term353, term353.getClass(), "flavorText", "");
        setField(term355, term355.getClass(), "name", null);
        setField(term355, term355.getClass(), "url", null);
        setField(term353, term353.getClass(), "language", term355);
        setField(term356, term356.getClass(), "name", null);
        setField(term356, term356.getClass(), "url", null);
        setField(term353, term353.getClass(), "version", term356);
        Object term357 = newInstance(Class.forName("skaro.pokeapi.resource.FlavorText"));
        Object term359 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term357, term357.getClass(), "flavorText", "");
        setField(term359, term359.getClass(), "name", null);
        setField(term359, term359.getClass(), "url", null);
        setField(term357, term357.getClass(), "language", term359);
        setField(term357, term357.getClass(), "version", term355);
        ArrayList term339 = new ArrayList();
        ((ArrayList) term339).add(term341);
        ((ArrayList) term339).add(term345);
        ((ArrayList) term339).add(term349);
        ((ArrayList) term339).add(term353);
        ((ArrayList) term339).add(term357);
        term325 = newInstance(Class.forName("skaro.pokeapi.resource.contesteffect.ContestEffect"));
        setField(term325, term325.getClass(), "id", term326);
        setField(term325, term325.getClass(), "appeal", term328);
        setField(term325, term325.getClass(), "jam", term330);
        setField(term325, term325.getClass(), "effectEntries", term332);
        setField(term325, term325.getClass(), "flavorTextEntries", term339);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.contesteffect.ContestEffect");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFlavorTextEntries", argTypes, term325, args);
    }

};


