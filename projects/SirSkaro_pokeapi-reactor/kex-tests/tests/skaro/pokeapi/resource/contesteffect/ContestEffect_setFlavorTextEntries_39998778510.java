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

public class ContestEffect_setFlavorTextEntries_39998778510 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term362;
     Object term405;

    public ContestEffect_setFlavorTextEntries_39998778510() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term363 = new Integer(-203030934);
        Integer term365 = new Integer(-1179120542);
        Integer term367 = new Integer(-73683645);
        Object term371 = newInstance(Class.forName("skaro.pokeapi.resource.Effect"));
        Object term373 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term371, term371.getClass(), "effect", "");
        setField(term373, term373.getClass(), "name", null);
        setField(term373, term373.getClass(), "url", null);
        setField(term371, term371.getClass(), "language", term373);
        Object term374 = newInstance(Class.forName("skaro.pokeapi.resource.Effect"));
        Object term376 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term374, term374.getClass(), "effect", "");
        setField(term376, term376.getClass(), "name", null);
        setField(term376, term376.getClass(), "url", null);
        setField(term374, term374.getClass(), "language", term376);
        Object term377 = newInstance(Class.forName("skaro.pokeapi.resource.Effect"));
        Object term379 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term377, term377.getClass(), "effect", "");
        setField(term379, term379.getClass(), "name", null);
        setField(term379, term379.getClass(), "url", null);
        setField(term377, term377.getClass(), "language", term379);
        Object term380 = newInstance(Class.forName("skaro.pokeapi.resource.Effect"));
        Object term382 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term380, term380.getClass(), "effect", "");
        setField(term382, term382.getClass(), "name", null);
        setField(term382, term382.getClass(), "url", null);
        setField(term380, term380.getClass(), "language", term382);
        Object term383 = newInstance(Class.forName("skaro.pokeapi.resource.Effect"));
        Object term385 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term383, term383.getClass(), "effect", "");
        setField(term385, term385.getClass(), "name", null);
        setField(term385, term385.getClass(), "url", null);
        setField(term383, term383.getClass(), "language", term385);
        ArrayList term369 = new ArrayList();
        ((ArrayList) term369).add(term371);
        ((ArrayList) term369).add(term374);
        ((ArrayList) term369).add(term377);
        ((ArrayList) term369).add(term380);
        ((ArrayList) term369).add(term383);
        Object term390 = newInstance(Class.forName("skaro.pokeapi.resource.FlavorText"));
        Object term392 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term393 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term390, term390.getClass(), "flavorText", "");
        setField(term392, term392.getClass(), "name", null);
        setField(term392, term392.getClass(), "url", null);
        setField(term390, term390.getClass(), "language", term392);
        setField(term393, term393.getClass(), "name", null);
        setField(term393, term393.getClass(), "url", null);
        setField(term390, term390.getClass(), "version", term393);
        Object term394 = newInstance(Class.forName("skaro.pokeapi.resource.FlavorText"));
        Object term396 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term397 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term394, term394.getClass(), "flavorText", "");
        setField(term396, term396.getClass(), "name", null);
        setField(term396, term396.getClass(), "url", null);
        setField(term394, term394.getClass(), "language", term396);
        setField(term397, term397.getClass(), "name", null);
        setField(term397, term397.getClass(), "url", null);
        setField(term394, term394.getClass(), "version", term397);
        Object term398 = newInstance(Class.forName("skaro.pokeapi.resource.FlavorText"));
        Object term400 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term398, term398.getClass(), "flavorText", "");
        setField(term400, term400.getClass(), "name", null);
        setField(term400, term400.getClass(), "url", null);
        setField(term398, term398.getClass(), "language", term400);
        setField(term398, term398.getClass(), "version", term396);
        Object term401 = newInstance(Class.forName("skaro.pokeapi.resource.FlavorText"));
        setField(term401, term401.getClass(), "flavorText", "");
        setField(term401, term401.getClass(), "language", term397);
        setField(term401, term401.getClass(), "version", term373);
        ArrayList term388 = new ArrayList();
        ((ArrayList) term388).add(term390);
        ((ArrayList) term388).add(term394);
        ((ArrayList) term388).add(term398);
        ((ArrayList) term388).add(term401);
        term362 = newInstance(Class.forName("skaro.pokeapi.resource.contesteffect.ContestEffect"));
        setField(term362, term362.getClass(), "id", term363);
        setField(term362, term362.getClass(), "appeal", term365);
        setField(term362, term362.getClass(), "jam", term367);
        setField(term362, term362.getClass(), "effectEntries", term369);
        setField(term362, term362.getClass(), "flavorTextEntries", term388);
        Object term408 = newInstance(Class.forName("skaro.pokeapi.resource.FlavorText"));
        Object term421 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term424 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term408, term408.getClass(), "flavorText", "pvDEABOxLt");
        setField(term421, term421.getClass(), "name", "");
        setField(term421, term421.getClass(), "url", "");
        setField(term408, term408.getClass(), "language", term421);
        setField(term424, term424.getClass(), "name", "");
        setField(term424, term424.getClass(), "url", "");
        setField(term408, term408.getClass(), "version", term424);
        Object term428 = newInstance(Class.forName("skaro.pokeapi.resource.FlavorText"));
        Object term430 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term431 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term428, term428.getClass(), "flavorText", "");
        setField(term430, term430.getClass(), "name", null);
        setField(term430, term430.getClass(), "url", null);
        setField(term428, term428.getClass(), "language", term430);
        setField(term431, term431.getClass(), "name", null);
        setField(term431, term431.getClass(), "url", null);
        setField(term428, term428.getClass(), "version", term431);
        Object term433 = newInstance(Class.forName("skaro.pokeapi.resource.FlavorText"));
        setField(term433, term433.getClass(), "flavorText", null);
        setField(term433, term433.getClass(), "language", null);
        setField(term433, term433.getClass(), "version", null);
        term405 = new LinkedList();
        ((LinkedList) term405).add(term408);
        ((LinkedList) term405).add(term428);
        ((LinkedList) term405).add(term433);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.contesteffect.ContestEffect");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term405;
        callMethod(klass, "setFlavorTextEntries", argTypes, term362, args);
    }

};


