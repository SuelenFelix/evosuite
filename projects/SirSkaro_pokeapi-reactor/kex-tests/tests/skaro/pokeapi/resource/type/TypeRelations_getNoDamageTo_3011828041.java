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
import java.util.ArrayList;

public class TypeRelations_getNoDamageTo_3011828041 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4066;

    public TypeRelations_getNoDamageTo_3011828041() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term4067 = new ArrayList();
        ArrayList term4071 = new ArrayList();
        ArrayList term4075 = new ArrayList();
        ArrayList term4079 = new ArrayList();
        ArrayList term4083 = new ArrayList();
        ArrayList term4087 = new ArrayList();
        term4066 = newInstance(Class.forName("skaro.pokeapi.resource.type.TypeRelations"));
        setField(term4066, term4066.getClass(), "noDamageTo", term4067);
        setField(term4066, term4066.getClass(), "halfDamageTo", term4071);
        setField(term4066, term4066.getClass(), "doubleDamageTo", term4075);
        setField(term4066, term4066.getClass(), "noDamageFrom", term4079);
        setField(term4066, term4066.getClass(), "halfDamageFrom", term4083);
        setField(term4066, term4066.getClass(), "doubleDamageFrom", term4087);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.type.TypeRelations");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNoDamageTo", argTypes, term4066, args);
    }

};


