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

public class Machine_setMove_6668229386 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term738;
     Object term816;

    public Machine_setMove_6668229386() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term739 = new Integer(-1955890973);
        term738 = newInstance(Class.forName("skaro.pokeapi.resource.machine.Machine"));
        Object term741 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term766 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term791 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term738, term738.getClass(), "id", term739);
        setField(term741, term741.getClass(), "name", "kuTXqwMtDB");
        setField(term741, term741.getClass(), "url", "Ghbwtircqb");
        setField(term738, term738.getClass(), "item", term741);
        setField(term766, term766.getClass(), "name", "xrwlQZdwCp");
        setField(term766, term766.getClass(), "url", "IDCWpPLRkE");
        setField(term738, term738.getClass(), "move", term766);
        setField(term791, term791.getClass(), "name", "nyiiPDVjAc");
        setField(term791, term791.getClass(), "url", "aKnKipADSo");
        setField(term738, term738.getClass(), "versionGroup", term791);
        term816 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term816, term816.getClass(), "name", "gGSMzuGICf");
        setField(term816, term816.getClass(), "url", "hxCBltsObl");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.machine.Machine");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("skaro.pokeapi.resource.NamedApiResource");
        Object[] args = new Object[1];
        args[0] = term816;
        callMethod(klass, "setMove", argTypes, term738, args);
    }

};


