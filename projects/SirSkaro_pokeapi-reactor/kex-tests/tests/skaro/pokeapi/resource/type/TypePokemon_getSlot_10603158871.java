package skaro.pokeapi.resource.type;

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
import static skaro.pokeapi.resource.type.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Object;

public class TypePokemon_getSlot_10603158871 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public TypePokemon_getSlot_10603158871() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term2 = new Integer(568599855);
        term1 = newInstance(Class.forName("skaro.pokeapi.resource.type.TypePokemon"));
        Object term4 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1, term1.getClass(), "slot", term2);
        setField(term4, term4.getClass(), "name", "PAEBtnZtTD");
        setField(term4, term4.getClass(), "url", "sjlJAEtRrb");
        setField(term1, term1.getClass(), "pokemon", term4);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.type.TypePokemon");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSlot", argTypes, term1, args);
    }

};


