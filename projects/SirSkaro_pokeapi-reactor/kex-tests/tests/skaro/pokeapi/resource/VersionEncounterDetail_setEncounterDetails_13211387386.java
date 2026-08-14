package skaro.pokeapi.resource;

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
import static skaro.pokeapi.resource.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Integer;
import java.util.ArrayList;
import java.util.LinkedList;

public class VersionEncounterDetail_setEncounterDetails_13211387386 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38910;
     Object term38953;

    public VersionEncounterDetail_setEncounterDetails_13211387386() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term38936 = new Integer(1763217806);
        Integer term38941 = new Integer(1644949396);
        Integer term38943 = new Integer(-2017073245);
        ArrayList term38945 = new ArrayList();
        Integer term38948 = new Integer(522440332);
        Object term38940 = newInstance(Class.forName("skaro.pokeapi.resource.Encounter"));
        Object term38950 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term38940, term38940.getClass(), "minLevel", term38941);
        setField(term38940, term38940.getClass(), "maxLevel", term38943);
        setField(term38940, term38940.getClass(), "conditionValues", term38945);
        setField(term38940, term38940.getClass(), "chance", term38948);
        setField(term38950, term38950.getClass(), "name", null);
        setField(term38950, term38950.getClass(), "url", null);
        setField(term38940, term38940.getClass(), "method", term38950);
        ArrayList term38938 = new ArrayList();
        ((ArrayList) term38938).add(term38940);
        term38910 = newInstance(Class.forName("skaro.pokeapi.resource.VersionEncounterDetail"));
        Object term38911 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term38911, term38911.getClass(), "name", "qVZzWMIpdZ");
        setField(term38911, term38911.getClass(), "url", "RVyPHqsjIQ");
        setField(term38910, term38910.getClass(), "version", term38911);
        setField(term38910, term38910.getClass(), "maxChance", term38936);
        setField(term38910, term38910.getClass(), "encounterDetails", term38938);
        term38953 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.VersionEncounterDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term38953;
        callMethod(klass, "setEncounterDetails", argTypes, term38910, args);
    }

};


