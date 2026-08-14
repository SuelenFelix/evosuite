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

public class AbilityPokemon_setIsHidden_3476677772 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term51;
     Object term81;

    public AbilityPokemon_setIsHidden_3476677772() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term52 = new Boolean(false);
        Integer term54 = new Integer(1162663216);
        term51 = newInstance(Class.forName("skaro.pokeapi.resource.ability.AbilityPokemon"));
        Object term56 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term51, term51.getClass(), "isHidden", term52);
        setField(term51, term51.getClass(), "slot", term54);
        setField(term56, term56.getClass(), "name", "MuLcgQHgqz");
        setField(term56, term56.getClass(), "url", "xxtlPwDYFs");
        setField(term51, term51.getClass(), "pokemon", term56);
        term81 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.ability.AbilityPokemon");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Boolean");
        Object[] args = new Object[1];
        args[0] = term81;
        callMethod(klass, "setIsHidden", argTypes, term51, args);
    }

};


