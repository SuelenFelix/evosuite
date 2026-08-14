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

public class Machine_setItem_5564251804 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term417;
     Object term495;

    public Machine_setItem_5564251804() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term418 = new Integer(-1922583790);
        term417 = newInstance(Class.forName("skaro.pokeapi.resource.machine.Machine"));
        Object term420 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term445 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term470 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term417, term417.getClass(), "id", term418);
        setField(term420, term420.getClass(), "name", "HyxfbSQYBe");
        setField(term420, term420.getClass(), "url", "pCTimMblYc");
        setField(term417, term417.getClass(), "item", term420);
        setField(term445, term445.getClass(), "name", "hNxWaHcfhY");
        setField(term445, term445.getClass(), "url", "RkybSrpybU");
        setField(term417, term417.getClass(), "move", term445);
        setField(term470, term470.getClass(), "name", "xOEqzGAmDU");
        setField(term470, term470.getClass(), "url", "eZFUvlxvGV");
        setField(term417, term417.getClass(), "versionGroup", term470);
        term495 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term495, term495.getClass(), "name", "flxyYxBRtu");
        setField(term495, term495.getClass(), "url", "OclPbYPkcH");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.machine.Machine");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("skaro.pokeapi.resource.NamedApiResource");
        Object[] args = new Object[1];
        args[0] = term495;
        callMethod(klass, "setItem", argTypes, term417, args);
    }

};


