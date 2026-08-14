package skaro.pokeapi.resource.movetarget;

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
import static skaro.pokeapi.resource.movetarget.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.util.ArrayList;
import java.lang.Object;

public class MoveTarget_getName_19116092803 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term131;

    public MoveTarget_getName_19116092803() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term132 = new Integer(391863371);
        Object term148 = newInstance(Class.forName("skaro.pokeapi.resource.Description"));
        Object term150 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term148, term148.getClass(), "description", "");
        setField(term150, term150.getClass(), "name", null);
        setField(term150, term150.getClass(), "url", null);
        setField(term148, term148.getClass(), "language", term150);
        Object term151 = newInstance(Class.forName("skaro.pokeapi.resource.Description"));
        Object term153 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term151, term151.getClass(), "description", "");
        setField(term153, term153.getClass(), "name", null);
        setField(term153, term153.getClass(), "url", null);
        setField(term151, term151.getClass(), "language", term153);
        ArrayList term146 = new ArrayList();
        ((ArrayList) term146).add(term148);
        ((ArrayList) term146).add(term151);
        ArrayList term156 = new ArrayList();
        Object term162 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term164 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term162, term162.getClass(), "name", "");
        setField(term164, term164.getClass(), "name", null);
        setField(term164, term164.getClass(), "url", null);
        setField(term162, term162.getClass(), "language", term164);
        Object term165 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term167 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term165, term165.getClass(), "name", "");
        setField(term167, term167.getClass(), "name", null);
        setField(term167, term167.getClass(), "url", null);
        setField(term165, term165.getClass(), "language", term167);
        Object term168 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term170 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term168, term168.getClass(), "name", "");
        setField(term170, term170.getClass(), "name", null);
        setField(term170, term170.getClass(), "url", null);
        setField(term168, term168.getClass(), "language", term170);
        Object term171 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term173 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term171, term171.getClass(), "name", "");
        setField(term173, term173.getClass(), "name", null);
        setField(term173, term173.getClass(), "url", null);
        setField(term171, term171.getClass(), "language", term173);
        Object term174 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term176 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term174, term174.getClass(), "name", "");
        setField(term176, term176.getClass(), "name", null);
        setField(term176, term176.getClass(), "url", null);
        setField(term174, term174.getClass(), "language", term176);
        Object term177 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term179 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term177, term177.getClass(), "name", "");
        setField(term179, term179.getClass(), "name", null);
        setField(term179, term179.getClass(), "url", null);
        setField(term177, term177.getClass(), "language", term179);
        Object term180 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term182 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term180, term180.getClass(), "name", "");
        setField(term182, term182.getClass(), "name", null);
        setField(term182, term182.getClass(), "url", null);
        setField(term180, term180.getClass(), "language", term182);
        ArrayList term160 = new ArrayList();
        ((ArrayList) term160).add(term162);
        ((ArrayList) term160).add(term165);
        ((ArrayList) term160).add(term168);
        ((ArrayList) term160).add(term171);
        ((ArrayList) term160).add(term174);
        ((ArrayList) term160).add(term177);
        ((ArrayList) term160).add(term180);
        term131 = newInstance(Class.forName("skaro.pokeapi.resource.movetarget.MoveTarget"));
        setField(term131, term131.getClass(), "id", term132);
        setField(term131, term131.getClass(), "name", "ffYhPOzlUs");
        setField(term131, term131.getClass(), "descriptions", term146);
        setField(term131, term131.getClass(), "moves", term156);
        setField(term131, term131.getClass(), "names", term160);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.movetarget.MoveTarget");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term131, args);
    }

};


