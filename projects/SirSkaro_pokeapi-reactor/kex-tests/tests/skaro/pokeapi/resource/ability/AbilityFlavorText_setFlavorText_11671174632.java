package skaro.pokeapi.resource.ability;

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
import static skaro.pokeapi.resource.ability.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class AbilityFlavorText_setFlavorText_11671174632 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3815;

    public AbilityFlavorText_setFlavorText_11671174632() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3815 = newInstance(Class.forName("skaro.pokeapi.resource.ability.AbilityFlavorText"));
        Object term3828 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term3853 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term3815, term3815.getClass(), "flavorText", "TiEyxWXsra");
        setField(term3828, term3828.getClass(), "name", "TuLgwTZsPP");
        setField(term3828, term3828.getClass(), "url", "KoasxTJGpx");
        setField(term3815, term3815.getClass(), "language", term3828);
        setField(term3853, term3853.getClass(), "name", "ceGeARYMoa");
        setField(term3853, term3853.getClass(), "url", "fFWllaiFvh");
        setField(term3815, term3815.getClass(), "versionGroup", term3853);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.ability.AbilityFlavorText");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "PFTdEDSbvZ";
        callMethod(klass, "setFlavorText", argTypes, term3815, args);
    }

};


