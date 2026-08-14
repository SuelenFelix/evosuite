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

public class EncounterConditionValue_setCondition_15150048926 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term446;
     Object term508;

    public EncounterConditionValue_setCondition_15150048926() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term447 = new Integer(-1955890973);
        Object term488 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term490 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term488, term488.getClass(), "name", "");
        setField(term490, term490.getClass(), "name", null);
        setField(term490, term490.getClass(), "url", null);
        setField(term488, term488.getClass(), "language", term490);
        Object term491 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term493 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term491, term491.getClass(), "name", "");
        setField(term493, term493.getClass(), "name", null);
        setField(term493, term493.getClass(), "url", null);
        setField(term491, term491.getClass(), "language", term493);
        Object term494 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term496 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term494, term494.getClass(), "name", "");
        setField(term496, term496.getClass(), "name", null);
        setField(term496, term496.getClass(), "url", null);
        setField(term494, term494.getClass(), "language", term496);
        Object term497 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term499 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term497, term497.getClass(), "name", "");
        setField(term499, term499.getClass(), "name", null);
        setField(term499, term499.getClass(), "url", null);
        setField(term497, term497.getClass(), "language", term499);
        Object term500 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term502 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term500, term500.getClass(), "name", "");
        setField(term502, term502.getClass(), "name", null);
        setField(term502, term502.getClass(), "url", null);
        setField(term500, term500.getClass(), "language", term502);
        Object term503 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term505 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term503, term503.getClass(), "name", "");
        setField(term505, term505.getClass(), "name", null);
        setField(term505, term505.getClass(), "url", null);
        setField(term503, term503.getClass(), "language", term505);
        ArrayList term486 = new ArrayList();
        ((ArrayList) term486).add(term488);
        ((ArrayList) term486).add(term491);
        ((ArrayList) term486).add(term494);
        ((ArrayList) term486).add(term497);
        ((ArrayList) term486).add(term500);
        ((ArrayList) term486).add(term503);
        term446 = newInstance(Class.forName("skaro.pokeapi.resource.encounterconditionvalue.EncounterConditionValue"));
        Object term461 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term446, term446.getClass(), "id", term447);
        setField(term446, term446.getClass(), "name", "TJmVBGfTML");
        setField(term461, term461.getClass(), "name", "tPlsykYBqO");
        setField(term461, term461.getClass(), "url", "bLPjGVBhlX");
        setField(term446, term446.getClass(), "condition", term461);
        setField(term446, term446.getClass(), "names", term486);
        term508 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term508, term508.getClass(), "name", "swZVeJAxjt");
        setField(term508, term508.getClass(), "url", "xOcJIiQQDu");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.encounterconditionvalue.EncounterConditionValue");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("skaro.pokeapi.resource.NamedApiResource");
        Object[] args = new Object[1];
        args[0] = term508;
        callMethod(klass, "setCondition", argTypes, term446, args);
    }

};


