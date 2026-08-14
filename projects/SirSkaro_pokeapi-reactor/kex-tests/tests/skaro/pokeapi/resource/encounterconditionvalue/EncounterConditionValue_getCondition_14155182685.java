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

public class EncounterConditionValue_getCondition_14155182685 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term369;

    public EncounterConditionValue_getCondition_14155182685() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term370 = new Integer(-616727354);
        Object term411 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term413 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term411, term411.getClass(), "name", "");
        setField(term413, term413.getClass(), "name", null);
        setField(term413, term413.getClass(), "url", null);
        setField(term411, term411.getClass(), "language", term413);
        ArrayList term409 = new ArrayList();
        ((ArrayList) term409).add(term411);
        term369 = newInstance(Class.forName("skaro.pokeapi.resource.encounterconditionvalue.EncounterConditionValue"));
        Object term384 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term369, term369.getClass(), "id", term370);
        setField(term369, term369.getClass(), "name", "dEnhdmILtU");
        setField(term384, term384.getClass(), "name", "hoicvmsovO");
        setField(term384, term384.getClass(), "url", "eqJfYWRaEL");
        setField(term369, term369.getClass(), "condition", term384);
        setField(term369, term369.getClass(), "names", term409);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.encounterconditionvalue.EncounterConditionValue");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCondition", argTypes, term369, args);
    }

};


