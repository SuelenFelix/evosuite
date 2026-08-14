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

public class PastMoveStatValues_setVersionGroup_204397429614 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1584;
     Object term1647;

    public PastMoveStatValues_setVersionGroup_204397429614() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1585 = new Integer(458147407);
        Integer term1587 = new Integer(-184153539);
        Integer term1589 = new Integer(493620644);
        Integer term1591 = new Integer(1328271830);
        ArrayList term1593 = new ArrayList();
        term1584 = newInstance(Class.forName("skaro.pokeapi.resource.move.PastMoveStatValues"));
        Object term1597 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term1622 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1584, term1584.getClass(), "accuracy", term1585);
        setField(term1584, term1584.getClass(), "effectChance", term1587);
        setField(term1584, term1584.getClass(), "power", term1589);
        setField(term1584, term1584.getClass(), "pp", term1591);
        setField(term1584, term1584.getClass(), "effectEntries", term1593);
        setField(term1597, term1597.getClass(), "name", "rYbtIDVdnd");
        setField(term1597, term1597.getClass(), "url", "UKAReurpHG");
        setField(term1584, term1584.getClass(), "type", term1597);
        setField(term1622, term1622.getClass(), "name", "WVRMUmrljA");
        setField(term1622, term1622.getClass(), "url", "NTlKJDDWlk");
        setField(term1584, term1584.getClass(), "versionGroup", term1622);
        term1647 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1647, term1647.getClass(), "name", "qYzsiuXOgS");
        setField(term1647, term1647.getClass(), "url", "bxrCBbrrct");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.move.PastMoveStatValues");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("skaro.pokeapi.resource.NamedApiResource");
        Object[] args = new Object[1];
        args[0] = term1647;
        callMethod(klass, "setVersionGroup", argTypes, term1584, args);
    }

};


