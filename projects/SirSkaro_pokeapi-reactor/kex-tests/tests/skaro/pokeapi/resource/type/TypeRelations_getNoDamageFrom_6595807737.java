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

public class TypeRelations_getNoDamageFrom_6595807737 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4436;

    public TypeRelations_getNoDamageFrom_6595807737() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term4437 = new ArrayList();
        ArrayList term4441 = new ArrayList();
        ArrayList term4445 = new ArrayList();
        ArrayList term4449 = new ArrayList();
        ArrayList term4453 = new ArrayList();
        ArrayList term4457 = new ArrayList();
        term4436 = newInstance(Class.forName("skaro.pokeapi.resource.type.TypeRelations"));
        setField(term4436, term4436.getClass(), "noDamageTo", term4437);
        setField(term4436, term4436.getClass(), "halfDamageTo", term4441);
        setField(term4436, term4436.getClass(), "doubleDamageTo", term4445);
        setField(term4436, term4436.getClass(), "noDamageFrom", term4449);
        setField(term4436, term4436.getClass(), "halfDamageFrom", term4453);
        setField(term4436, term4436.getClass(), "doubleDamageFrom", term4457);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.type.TypeRelations");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNoDamageFrom", argTypes, term4436, args);
    }

};


