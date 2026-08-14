package skaro.pokeapi.resource.machine;

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
import static skaro.pokeapi.resource.machine.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Object;

public class Machine_setId_6876115012 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term139;
     Object term217;

    public Machine_setId_6876115012() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term140 = new Integer(1162663216);
        term139 = newInstance(Class.forName("skaro.pokeapi.resource.machine.Machine"));
        Object term142 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term167 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term192 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term139, term139.getClass(), "id", term140);
        setField(term142, term142.getClass(), "name", "SzjVpOQTyS");
        setField(term142, term142.getClass(), "url", "MjGYSRKTNF");
        setField(term139, term139.getClass(), "item", term142);
        setField(term167, term167.getClass(), "name", "hRNSzYYIrc");
        setField(term167, term167.getClass(), "url", "RMFIsYGgne");
        setField(term139, term139.getClass(), "move", term167);
        setField(term192, term192.getClass(), "name", "NRdvgJlhkX");
        setField(term192, term192.getClass(), "url", "uuaPigETmJ");
        setField(term139, term139.getClass(), "versionGroup", term192);
        term217 = new Integer(1484323161);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.machine.Machine");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term217;
        callMethod(klass, "setId", argTypes, term139, args);
    }

};


