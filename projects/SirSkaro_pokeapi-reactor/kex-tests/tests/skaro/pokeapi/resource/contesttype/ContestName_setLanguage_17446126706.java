package skaro.pokeapi.resource.contesttype;

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
import static skaro.pokeapi.resource.contesttype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ContestName_setLanguage_17446126706 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term495;
     Object term545;

    public ContestName_setLanguage_17446126706() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term495 = newInstance(Class.forName("skaro.pokeapi.resource.contesttype.ContestName"));
        Object term520 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term495, term495.getClass(), "name", "xOEqzGAmDU");
        setField(term495, term495.getClass(), "color", "eZFUvlxvGV");
        setField(term520, term520.getClass(), "name", "BYqFIqCKAV");
        setField(term520, term520.getClass(), "url", "vrQLuWIDJX");
        setField(term495, term495.getClass(), "language", term520);
        term545 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term545, term545.getClass(), "name", "IoAlmYsBwc");
        setField(term545, term545.getClass(), "url", "TEParAifyi");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.contesttype.ContestName");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("skaro.pokeapi.resource.NamedApiResource");
        Object[] args = new Object[1];
        args[0] = term545;
        callMethod(klass, "setLanguage", argTypes, term495, args);
    }

};


