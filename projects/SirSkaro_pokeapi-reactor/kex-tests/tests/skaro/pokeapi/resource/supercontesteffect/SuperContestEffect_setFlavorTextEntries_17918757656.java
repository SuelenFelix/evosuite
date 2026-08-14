package skaro.pokeapi.resource.supercontesteffect;

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
import static skaro.pokeapi.resource.supercontesteffect.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.util.ArrayList;
import java.lang.Object;
import java.util.LinkedList;

public class SuperContestEffect_setFlavorTextEntries_17918757656 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term138;
     Object term173;

    public SuperContestEffect_setFlavorTextEntries_17918757656() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term139 = new Integer(1134449235);
        Integer term141 = new Integer(-883034806);
        Object term145 = newInstance(Class.forName("skaro.pokeapi.resource.FlavorText"));
        Object term147 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term148 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term145, term145.getClass(), "flavorText", "");
        setField(term147, term147.getClass(), "name", null);
        setField(term147, term147.getClass(), "url", null);
        setField(term145, term145.getClass(), "language", term147);
        setField(term148, term148.getClass(), "name", null);
        setField(term148, term148.getClass(), "url", null);
        setField(term145, term145.getClass(), "version", term148);
        Object term149 = newInstance(Class.forName("skaro.pokeapi.resource.FlavorText"));
        Object term151 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term152 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term149, term149.getClass(), "flavorText", "");
        setField(term151, term151.getClass(), "name", null);
        setField(term151, term151.getClass(), "url", null);
        setField(term149, term149.getClass(), "language", term151);
        setField(term152, term152.getClass(), "name", null);
        setField(term152, term152.getClass(), "url", null);
        setField(term149, term149.getClass(), "version", term152);
        Object term153 = newInstance(Class.forName("skaro.pokeapi.resource.FlavorText"));
        Object term155 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term156 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term153, term153.getClass(), "flavorText", "");
        setField(term155, term155.getClass(), "name", null);
        setField(term155, term155.getClass(), "url", null);
        setField(term153, term153.getClass(), "language", term155);
        setField(term156, term156.getClass(), "name", null);
        setField(term156, term156.getClass(), "url", null);
        setField(term153, term153.getClass(), "version", term156);
        Object term157 = newInstance(Class.forName("skaro.pokeapi.resource.FlavorText"));
        Object term159 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term160 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term157, term157.getClass(), "flavorText", "");
        setField(term159, term159.getClass(), "name", null);
        setField(term159, term159.getClass(), "url", null);
        setField(term157, term157.getClass(), "language", term159);
        setField(term160, term160.getClass(), "name", null);
        setField(term160, term160.getClass(), "url", null);
        setField(term157, term157.getClass(), "version", term160);
        Object term161 = newInstance(Class.forName("skaro.pokeapi.resource.FlavorText"));
        Object term163 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term164 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term161, term161.getClass(), "flavorText", "");
        setField(term163, term163.getClass(), "name", null);
        setField(term163, term163.getClass(), "url", null);
        setField(term161, term161.getClass(), "language", term163);
        setField(term164, term164.getClass(), "name", null);
        setField(term164, term164.getClass(), "url", null);
        setField(term161, term161.getClass(), "version", term164);
        Object term165 = newInstance(Class.forName("skaro.pokeapi.resource.FlavorText"));
        setField(term165, term165.getClass(), "flavorText", "");
        setField(term165, term165.getClass(), "language", term160);
        setField(term165, term165.getClass(), "version", term163);
        ArrayList term143 = new ArrayList();
        ((ArrayList) term143).add(term145);
        ((ArrayList) term143).add(term149);
        ((ArrayList) term143).add(term153);
        ((ArrayList) term143).add(term157);
        ((ArrayList) term143).add(term161);
        ((ArrayList) term143).add(term165);
        ArrayList term169 = new ArrayList();
        term138 = newInstance(Class.forName("skaro.pokeapi.resource.supercontesteffect.SuperContestEffect"));
        setField(term138, term138.getClass(), "id", term139);
        setField(term138, term138.getClass(), "appeal", term141);
        setField(term138, term138.getClass(), "flavorTextEntries", term143);
        setField(term138, term138.getClass(), "moves", term169);
        term173 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.supercontesteffect.SuperContestEffect");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term173;
        callMethod(klass, "setFlavorTextEntries", argTypes, term138, args);
    }

};


