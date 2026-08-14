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

public class TypeRelations_getHalfDamageTo_13759506223 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4165;

    public TypeRelations_getHalfDamageTo_13759506223() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term4166 = new ArrayList();
        ArrayList term4170 = new ArrayList();
        ArrayList term4174 = new ArrayList();
        ArrayList term4178 = new ArrayList();
        ArrayList term4182 = new ArrayList();
        ArrayList term4186 = new ArrayList();
        term4165 = newInstance(Class.forName("skaro.pokeapi.resource.type.TypeRelations"));
        setField(term4165, term4165.getClass(), "noDamageTo", term4166);
        setField(term4165, term4165.getClass(), "halfDamageTo", term4170);
        setField(term4165, term4165.getClass(), "doubleDamageTo", term4174);
        setField(term4165, term4165.getClass(), "noDamageFrom", term4178);
        setField(term4165, term4165.getClass(), "halfDamageFrom", term4182);
        setField(term4165, term4165.getClass(), "doubleDamageFrom", term4186);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.type.TypeRelations");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getHalfDamageTo", argTypes, term4165, args);
    }

};


