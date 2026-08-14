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

public class SuperContestEffect_setAppeal_1383663134 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term78;
     Object term99;

    public SuperContestEffect_setAppeal_1383663134() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term79 = new Integer(-2038273078);
        Integer term81 = new Integer(1227103734);
        Object term85 = newInstance(Class.forName("skaro.pokeapi.resource.FlavorText"));
        Object term87 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term88 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term85, term85.getClass(), "flavorText", "");
        setField(term87, term87.getClass(), "name", null);
        setField(term87, term87.getClass(), "url", null);
        setField(term85, term85.getClass(), "language", term87);
        setField(term88, term88.getClass(), "name", null);
        setField(term88, term88.getClass(), "url", null);
        setField(term85, term85.getClass(), "version", term88);
        Object term89 = newInstance(Class.forName("skaro.pokeapi.resource.FlavorText"));
        Object term91 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term92 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term89, term89.getClass(), "flavorText", "");
        setField(term91, term91.getClass(), "name", null);
        setField(term91, term91.getClass(), "url", null);
        setField(term89, term89.getClass(), "language", term91);
        setField(term92, term92.getClass(), "name", null);
        setField(term92, term92.getClass(), "url", null);
        setField(term89, term89.getClass(), "version", term92);
        ArrayList term83 = new ArrayList();
        ((ArrayList) term83).add(term85);
        ((ArrayList) term83).add(term89);
        ArrayList term95 = new ArrayList();
        term78 = newInstance(Class.forName("skaro.pokeapi.resource.supercontesteffect.SuperContestEffect"));
        setField(term78, term78.getClass(), "id", term79);
        setField(term78, term78.getClass(), "appeal", term81);
        setField(term78, term78.getClass(), "flavorTextEntries", term83);
        setField(term78, term78.getClass(), "moves", term95);
        term99 = new Integer(-1339778481);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.supercontesteffect.SuperContestEffect");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term99;
        callMethod(klass, "setAppeal", argTypes, term78, args);
    }

};


