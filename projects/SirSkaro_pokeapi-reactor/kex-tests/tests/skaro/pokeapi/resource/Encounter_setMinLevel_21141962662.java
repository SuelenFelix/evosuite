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
import java.lang.Integer;
import java.util.ArrayList;
import java.lang.Object;

public class Encounter_setMinLevel_21141962662 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5176;
     Object term5212;

    public Encounter_setMinLevel_21141962662() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term5177 = new Integer(590451710);
        Integer term5179 = new Integer(-1999787419);
        ArrayList term5181 = new ArrayList();
        Integer term5185 = new Integer(-1224443634);
        term5176 = newInstance(Class.forName("skaro.pokeapi.resource.Encounter"));
        Object term5187 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term5176, term5176.getClass(), "minLevel", term5177);
        setField(term5176, term5176.getClass(), "maxLevel", term5179);
        setField(term5176, term5176.getClass(), "conditionValues", term5181);
        setField(term5176, term5176.getClass(), "chance", term5185);
        setField(term5187, term5187.getClass(), "name", "HegRNsidFg");
        setField(term5187, term5187.getClass(), "url", "udRdJkgXmH");
        setField(term5176, term5176.getClass(), "method", term5187);
        term5212 = new Integer(1048451946);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.Encounter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term5212;
        callMethod(klass, "setMinLevel", argTypes, term5176, args);
    }

};


