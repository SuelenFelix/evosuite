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

public class Machine_getId_17089173391 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public Machine_getId_17089173391() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term2 = new Integer(568599855);
        term1 = newInstance(Class.forName("skaro.pokeapi.resource.machine.Machine"));
        Object term4 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term29 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term54 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1, term1.getClass(), "id", term2);
        setField(term4, term4.getClass(), "name", "PAEBtnZtTD");
        setField(term4, term4.getClass(), "url", "sjlJAEtRrb");
        setField(term1, term1.getClass(), "item", term4);
        setField(term29, term29.getClass(), "name", "MuLcgQHgqz");
        setField(term29, term29.getClass(), "url", "xxtlPwDYFs");
        setField(term1, term1.getClass(), "move", term29);
        setField(term54, term54.getClass(), "name", "jJCZpVmanW");
        setField(term54, term54.getClass(), "url", "EGtDIRbSSb");
        setField(term1, term1.getClass(), "versionGroup", term54);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.machine.Machine");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term1, args);
    }

};


