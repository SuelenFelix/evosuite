package skaro.pokeapi.resource.encounterconditionvalue;

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
import static skaro.pokeapi.resource.encounterconditionvalue.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Object;
import java.util.ArrayList;

public class EncounterConditionValue_setId_17775785752 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term90;
     Object term146;

    public EncounterConditionValue_setId_17775785752() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term91 = new Integer(1162663216);
        Object term132 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term134 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term132, term132.getClass(), "name", "");
        setField(term134, term134.getClass(), "name", null);
        setField(term134, term134.getClass(), "url", null);
        setField(term132, term132.getClass(), "language", term134);
        Object term135 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term137 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term135, term135.getClass(), "name", "");
        setField(term137, term137.getClass(), "name", null);
        setField(term137, term137.getClass(), "url", null);
        setField(term135, term135.getClass(), "language", term137);
        Object term138 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term140 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term138, term138.getClass(), "name", "");
        setField(term140, term140.getClass(), "name", null);
        setField(term140, term140.getClass(), "url", null);
        setField(term138, term138.getClass(), "language", term140);
        Object term141 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term143 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term141, term141.getClass(), "name", "");
        setField(term143, term143.getClass(), "name", null);
        setField(term143, term143.getClass(), "url", null);
        setField(term141, term141.getClass(), "language", term143);
        ArrayList term130 = new ArrayList();
        ((ArrayList) term130).add(term132);
        ((ArrayList) term130).add(term135);
        ((ArrayList) term130).add(term138);
        ((ArrayList) term130).add(term141);
        term90 = newInstance(Class.forName("skaro.pokeapi.resource.encounterconditionvalue.EncounterConditionValue"));
        Object term105 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term90, term90.getClass(), "id", term91);
        setField(term90, term90.getClass(), "name", "HyxfbSQYBe");
        setField(term105, term105.getClass(), "name", "pCTimMblYc");
        setField(term105, term105.getClass(), "url", "hNxWaHcfhY");
        setField(term90, term90.getClass(), "condition", term105);
        setField(term90, term90.getClass(), "names", term130);
        term146 = new Integer(1484323161);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.encounterconditionvalue.EncounterConditionValue");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term146;
        callMethod(klass, "setId", argTypes, term90, args);
    }

};


