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

public class AbilityPokemon_setSlot_8895041154 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term153;
     Object term183;

    public AbilityPokemon_setSlot_8895041154() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term154 = new Boolean(true);
        Integer term156 = new Integer(391863371);
        term153 = newInstance(Class.forName("skaro.pokeapi.resource.ability.AbilityPokemon"));
        Object term158 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term153, term153.getClass(), "isHidden", term154);
        setField(term153, term153.getClass(), "slot", term156);
        setField(term158, term158.getClass(), "name", "SzjVpOQTyS");
        setField(term158, term158.getClass(), "url", "MjGYSRKTNF");
        setField(term153, term153.getClass(), "pokemon", term158);
        term183 = new Integer(-1922583790);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.ability.AbilityPokemon");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term183;
        callMethod(klass, "setSlot", argTypes, term153, args);
    }

};


