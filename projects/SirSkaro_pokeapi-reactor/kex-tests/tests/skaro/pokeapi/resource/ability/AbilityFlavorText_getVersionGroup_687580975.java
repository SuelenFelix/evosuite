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

public class AbilityFlavorText_getVersionGroup_687580975 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4221;

    public AbilityFlavorText_getVersionGroup_687580975() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4221 = newInstance(Class.forName("skaro.pokeapi.resource.ability.AbilityFlavorText"));
        Object term4234 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term4259 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term4221, term4221.getClass(), "flavorText", "gVnDVbSyKa");
        setField(term4234, term4234.getClass(), "name", "kdCYNMSuoD");
        setField(term4234, term4234.getClass(), "url", "eRYlSLwtvV");
        setField(term4221, term4221.getClass(), "language", term4234);
        setField(term4259, term4259.getClass(), "name", "duOyJsARTD");
        setField(term4259, term4259.getClass(), "url", "xPnOHsNlyc");
        setField(term4221, term4221.getClass(), "versionGroup", term4259);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.ability.AbilityFlavorText");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getVersionGroup", argTypes, term4221, args);
    }

};


