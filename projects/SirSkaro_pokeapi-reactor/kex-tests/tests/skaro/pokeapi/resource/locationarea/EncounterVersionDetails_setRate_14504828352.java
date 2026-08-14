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

public class EncounterVersionDetails_setRate_14504828352 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term781;
     Object term809;

    public EncounterVersionDetails_setRate_14504828352() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term782 = new Integer(663292551);
        term781 = newInstance(Class.forName("skaro.pokeapi.resource.locationarea.EncounterVersionDetails"));
        Object term784 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term781, term781.getClass(), "rate", term782);
        setField(term784, term784.getClass(), "name", "MwwjNtdOFT");
        setField(term784, term784.getClass(), "url", "VYkqXKVlAJ");
        setField(term781, term781.getClass(), "version", term784);
        term809 = new Integer(-1885090354);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.locationarea.EncounterVersionDetails");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term809;
        callMethod(klass, "setRate", argTypes, term781, args);
    }

};


