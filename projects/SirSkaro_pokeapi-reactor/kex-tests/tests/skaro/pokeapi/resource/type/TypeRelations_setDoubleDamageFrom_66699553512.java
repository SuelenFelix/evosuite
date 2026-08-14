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
import java.util.LinkedList;

public class TypeRelations_setDoubleDamageFrom_66699553512 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4703;
     Object term4728;

    public TypeRelations_setDoubleDamageFrom_66699553512() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term4704 = new ArrayList();
        ArrayList term4708 = new ArrayList();
        ArrayList term4712 = new ArrayList();
        ArrayList term4716 = new ArrayList();
        ArrayList term4720 = new ArrayList();
        ArrayList term4724 = new ArrayList();
        term4703 = newInstance(Class.forName("skaro.pokeapi.resource.type.TypeRelations"));
        setField(term4703, term4703.getClass(), "noDamageTo", term4704);
        setField(term4703, term4703.getClass(), "halfDamageTo", term4708);
        setField(term4703, term4703.getClass(), "doubleDamageTo", term4712);
        setField(term4703, term4703.getClass(), "noDamageFrom", term4716);
        setField(term4703, term4703.getClass(), "halfDamageFrom", term4720);
        setField(term4703, term4703.getClass(), "doubleDamageFrom", term4724);
        term4728 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.type.TypeRelations");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term4728;
        callMethod(klass, "setDoubleDamageFrom", argTypes, term4703, args);
    }

};


