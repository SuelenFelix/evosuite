package skaro.pokeapi.resource.locationarea;

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
import static skaro.pokeapi.resource.locationarea.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Object;

public class EncounterVersionDetails_setVersion_3295354644 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term879;
     Object term907;

    public EncounterVersionDetails_setVersion_3295354644() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term880 = new Integer(-1731761810);
        term879 = newInstance(Class.forName("skaro.pokeapi.resource.locationarea.EncounterVersionDetails"));
        Object term882 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term879, term879.getClass(), "rate", term880);
        setField(term882, term882.getClass(), "name", "HHmNoYxIGj");
        setField(term882, term882.getClass(), "url", "PtirvZmsGt");
        setField(term879, term879.getClass(), "version", term882);
        term907 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term907, term907.getClass(), "name", "VeDtgDzGAN");
        setField(term907, term907.getClass(), "url", "aWYOWZFyaX");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.locationarea.EncounterVersionDetails");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("skaro.pokeapi.resource.NamedApiResource");
        Object[] args = new Object[1];
        args[0] = term907;
        callMethod(klass, "setVersion", argTypes, term879, args);
    }

};


