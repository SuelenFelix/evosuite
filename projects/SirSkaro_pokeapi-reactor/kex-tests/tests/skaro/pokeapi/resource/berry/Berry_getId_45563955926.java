package skaro.pokeapi.resource.berry;

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
import static skaro.pokeapi.resource.berry.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Berry_getId_45563955926 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4736;

    public Berry_getId_45563955926() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4736 = newInstance(Class.forName("skaro.pokeapi.resource.berry.Berry"));
        setField(term4736, term4736.getClass(), "id", null);
        setField(term4736, term4736.getClass(), "name", null);
        setField(term4736, term4736.getClass(), "growthTime", null);
        setField(term4736, term4736.getClass(), "maxHarvest", null);
        setField(term4736, term4736.getClass(), "naturalGiftPower", null);
        setField(term4736, term4736.getClass(), "size", null);
        setField(term4736, term4736.getClass(), "smoothness", null);
        setField(term4736, term4736.getClass(), "soilDryness", null);
        setField(term4736, term4736.getClass(), "firmness", null);
        setField(term4736, term4736.getClass(), "flavors", null);
        setField(term4736, term4736.getClass(), "item", null);
        setField(term4736, term4736.getClass(), "naturalGiftType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.berry.Berry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term4736, args);
    }

};


