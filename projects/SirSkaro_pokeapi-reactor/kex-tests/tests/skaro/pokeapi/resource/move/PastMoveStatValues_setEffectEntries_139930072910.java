package skaro.pokeapi.resource.move;

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
import static skaro.pokeapi.resource.move.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.util.ArrayList;
import java.lang.Object;
import java.util.LinkedList;

public class PastMoveStatValues_setEffectEntries_139930072910 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1088;
     Object term1155;

    public PastMoveStatValues_setEffectEntries_139930072910() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1089 = new Integer(1962444399);
        Integer term1091 = new Integer(767834723);
        Integer term1093 = new Integer(-602026508);
        Integer term1095 = new Integer(-157887805);
        Object term1099 = newInstance(Class.forName("skaro.pokeapi.resource.VerboseEffect"));
        Object term1102 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1099, term1099.getClass(), "effect", "");
        setField(term1099, term1099.getClass(), "shortEffect", "");
        setField(term1102, term1102.getClass(), "name", null);
        setField(term1102, term1102.getClass(), "url", null);
        setField(term1099, term1099.getClass(), "language", term1102);
        ArrayList term1097 = new ArrayList();
        ((ArrayList) term1097).add(term1099);
        term1088 = newInstance(Class.forName("skaro.pokeapi.resource.move.PastMoveStatValues"));
        Object term1105 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term1130 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1088, term1088.getClass(), "accuracy", term1089);
        setField(term1088, term1088.getClass(), "effectChance", term1091);
        setField(term1088, term1088.getClass(), "power", term1093);
        setField(term1088, term1088.getClass(), "pp", term1095);
        setField(term1088, term1088.getClass(), "effectEntries", term1097);
        setField(term1105, term1105.getClass(), "name", "OqbwYQfvAe");
        setField(term1105, term1105.getClass(), "url", "tRxZafjqIx");
        setField(term1088, term1088.getClass(), "type", term1105);
        setField(term1130, term1130.getClass(), "name", "DhjNLmRMCu");
        setField(term1130, term1130.getClass(), "url", "PgPzMSEjjX");
        setField(term1088, term1088.getClass(), "versionGroup", term1130);
        term1155 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.move.PastMoveStatValues");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term1155;
        callMethod(klass, "setEffectEntries", argTypes, term1088, args);
    }

};


