package skaro.pokeapi.resource.ability;

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
import static skaro.pokeapi.resource.ability.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;

public class AbilityPokemon_getSlot_21429249333 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term103;

    public AbilityPokemon_getSlot_21429249333() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term104 = new Boolean(false);
        Integer term106 = new Integer(1484323161);
        term103 = newInstance(Class.forName("skaro.pokeapi.resource.ability.AbilityPokemon"));
        Object term108 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term103, term103.getClass(), "isHidden", term104);
        setField(term103, term103.getClass(), "slot", term106);
        setField(term108, term108.getClass(), "name", "jJCZpVmanW");
        setField(term108, term108.getClass(), "url", "EGtDIRbSSb");
        setField(term103, term103.getClass(), "pokemon", term108);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.ability.AbilityPokemon");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSlot", argTypes, term103, args);
    }

};


