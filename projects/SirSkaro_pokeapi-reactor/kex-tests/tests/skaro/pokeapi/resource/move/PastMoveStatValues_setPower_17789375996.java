package skaro.pokeapi.resource.move;

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
import static skaro.pokeapi.resource.move.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.util.ArrayList;
import java.lang.Object;

public class PastMoveStatValues_setPower_17789375996 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term588;
     Object term675;

    public PastMoveStatValues_setPower_17789375996() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term589 = new Integer(-2068769794);
        Integer term591 = new Integer(-117576464);
        Integer term593 = new Integer(-1007160944);
        Integer term595 = new Integer(1135664017);
        Object term599 = newInstance(Class.forName("skaro.pokeapi.resource.VerboseEffect"));
        Object term602 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term599, term599.getClass(), "effect", "");
        setField(term599, term599.getClass(), "shortEffect", "");
        setField(term602, term602.getClass(), "name", null);
        setField(term602, term602.getClass(), "url", null);
        setField(term599, term599.getClass(), "language", term602);
        Object term603 = newInstance(Class.forName("skaro.pokeapi.resource.VerboseEffect"));
        Object term606 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term603, term603.getClass(), "effect", "");
        setField(term603, term603.getClass(), "shortEffect", "");
        setField(term606, term606.getClass(), "name", null);
        setField(term606, term606.getClass(), "url", null);
        setField(term603, term603.getClass(), "language", term606);
        Object term607 = newInstance(Class.forName("skaro.pokeapi.resource.VerboseEffect"));
        Object term610 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term607, term607.getClass(), "effect", "");
        setField(term607, term607.getClass(), "shortEffect", "");
        setField(term610, term610.getClass(), "name", null);
        setField(term610, term610.getClass(), "url", null);
        setField(term607, term607.getClass(), "language", term610);
        Object term611 = newInstance(Class.forName("skaro.pokeapi.resource.VerboseEffect"));
        Object term614 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term611, term611.getClass(), "effect", "");
        setField(term611, term611.getClass(), "shortEffect", "");
        setField(term614, term614.getClass(), "name", null);
        setField(term614, term614.getClass(), "url", null);
        setField(term611, term611.getClass(), "language", term614);
        Object term615 = newInstance(Class.forName("skaro.pokeapi.resource.VerboseEffect"));
        Object term618 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term615, term615.getClass(), "effect", "");
        setField(term615, term615.getClass(), "shortEffect", "");
        setField(term618, term618.getClass(), "name", null);
        setField(term618, term618.getClass(), "url", null);
        setField(term615, term615.getClass(), "language", term618);
        Object term619 = newInstance(Class.forName("skaro.pokeapi.resource.VerboseEffect"));
        Object term622 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term619, term619.getClass(), "effect", "");
        setField(term619, term619.getClass(), "shortEffect", "");
        setField(term622, term622.getClass(), "name", null);
        setField(term622, term622.getClass(), "url", null);
        setField(term619, term619.getClass(), "language", term622);
        ArrayList term597 = new ArrayList();
        ((ArrayList) term597).add(term599);
        ((ArrayList) term597).add(term603);
        ((ArrayList) term597).add(term607);
        ((ArrayList) term597).add(term611);
        ((ArrayList) term597).add(term615);
        ((ArrayList) term597).add(term619);
        term588 = newInstance(Class.forName("skaro.pokeapi.resource.move.PastMoveStatValues"));
        Object term625 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term650 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term588, term588.getClass(), "accuracy", term589);
        setField(term588, term588.getClass(), "effectChance", term591);
        setField(term588, term588.getClass(), "power", term593);
        setField(term588, term588.getClass(), "pp", term595);
        setField(term588, term588.getClass(), "effectEntries", term597);
        setField(term625, term625.getClass(), "name", "OEXDRUKcFl");
        setField(term625, term625.getClass(), "url", "RYdKCNNMBR");
        setField(term588, term588.getClass(), "type", term625);
        setField(term650, term650.getClass(), "name", "yGtHPyvYiQ");
        setField(term650, term650.getClass(), "url", "MvRIxilFMJ");
        setField(term588, term588.getClass(), "versionGroup", term650);
        term675 = new Integer(590364439);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.move.PastMoveStatValues");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term675;
        callMethod(klass, "setPower", argTypes, term588, args);
    }

};


