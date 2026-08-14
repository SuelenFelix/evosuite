package skaro.pokeapi.resource.location;

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
import static skaro.pokeapi.resource.location.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Object;
import java.util.ArrayList;

public class Location_setId_14188363492 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term114;
     Object term182;

    public Location_setId_14188363492() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term115 = new Integer(-616727354);
        Object term156 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term158 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term156, term156.getClass(), "name", "");
        setField(term158, term158.getClass(), "name", null);
        setField(term158, term158.getClass(), "url", null);
        setField(term156, term156.getClass(), "language", term158);
        Object term159 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term161 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term159, term159.getClass(), "name", "");
        setField(term161, term161.getClass(), "name", null);
        setField(term161, term161.getClass(), "url", null);
        setField(term159, term159.getClass(), "language", term161);
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
        ArrayList term154 = new ArrayList();
        ((ArrayList) term154).add(term156);
        ((ArrayList) term154).add(term159);
        ((ArrayList) term154).add(term162);
        ((ArrayList) term154).add(term165);
        Integer term173 = new Integer(-1955890973);
        Object term172 = newInstance(Class.forName("skaro.pokeapi.resource.GenerationGameIndex"));
        Object term175 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term172, term172.getClass(), "gameIndex", term173);
        setField(term175, term175.getClass(), "name", null);
        setField(term175, term175.getClass(), "url", null);
        setField(term172, term172.getClass(), "generation", term175);
        ArrayList term170 = new ArrayList();
        ((ArrayList) term170).add(term172);
        ArrayList term178 = new ArrayList();
        term114 = newInstance(Class.forName("skaro.pokeapi.resource.location.Location"));
        Object term129 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term114, term114.getClass(), "id", term115);
        setField(term114, term114.getClass(), "name", "flxyYxBRtu");
        setField(term129, term129.getClass(), "name", "OclPbYPkcH");
        setField(term129, term129.getClass(), "url", "IoAlmYsBwc");
        setField(term114, term114.getClass(), "region", term129);
        setField(term114, term114.getClass(), "names", term154);
        setField(term114, term114.getClass(), "gameIndices", term170);
        setField(term114, term114.getClass(), "areas", term178);
        term182 = new Integer(-2038273078);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.location.Location");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term182;
        callMethod(klass, "setId", argTypes, term114, args);
    }

};


