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
import java.lang.Object;
import java.util.ArrayList;

public class TypeRelationsPast_setDamageRelations_8403407954 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5001;
     Object term5052;

    public TypeRelationsPast_setDamageRelations_8403407954() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term5028 = new ArrayList();
        ArrayList term5032 = new ArrayList();
        ArrayList term5036 = new ArrayList();
        ArrayList term5040 = new ArrayList();
        ArrayList term5044 = new ArrayList();
        ArrayList term5048 = new ArrayList();
        term5001 = newInstance(Class.forName("skaro.pokeapi.resource.type.TypeRelationsPast"));
        Object term5002 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term5027 = newInstance(Class.forName("skaro.pokeapi.resource.type.TypeRelations"));
        setField(term5002, term5002.getClass(), "name", "gbbYBYyfvr");
        setField(term5002, term5002.getClass(), "url", "SrWMUlbtWV");
        setField(term5001, term5001.getClass(), "generation", term5002);
        setField(term5027, term5027.getClass(), "noDamageTo", term5028);
        setField(term5027, term5027.getClass(), "halfDamageTo", term5032);
        setField(term5027, term5027.getClass(), "doubleDamageTo", term5036);
        setField(term5027, term5027.getClass(), "noDamageFrom", term5040);
        setField(term5027, term5027.getClass(), "halfDamageFrom", term5044);
        setField(term5027, term5027.getClass(), "doubleDamageFrom", term5048);
        setField(term5001, term5001.getClass(), "damageRelations", term5027);
        ArrayList term5053 = new ArrayList();
        ArrayList term5057 = new ArrayList();
        ArrayList term5061 = new ArrayList();
        ArrayList term5065 = new ArrayList();
        ArrayList term5069 = new ArrayList();
        ArrayList term5073 = new ArrayList();
        term5052 = newInstance(Class.forName("skaro.pokeapi.resource.type.TypeRelations"));
        setField(term5052, term5052.getClass(), "noDamageTo", term5053);
        setField(term5052, term5052.getClass(), "halfDamageTo", term5057);
        setField(term5052, term5052.getClass(), "doubleDamageTo", term5061);
        setField(term5052, term5052.getClass(), "noDamageFrom", term5065);
        setField(term5052, term5052.getClass(), "halfDamageFrom", term5069);
        setField(term5052, term5052.getClass(), "doubleDamageFrom", term5073);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.type.TypeRelationsPast");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("skaro.pokeapi.resource.type.TypeRelations");
        Object[] args = new Object[1];
        args[0] = term5052;
        callMethod(klass, "setDamageRelations", argTypes, term5001, args);
    }

};


