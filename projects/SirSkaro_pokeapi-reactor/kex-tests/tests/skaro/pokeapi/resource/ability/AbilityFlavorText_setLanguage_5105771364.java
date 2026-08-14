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

public class AbilityFlavorText_setLanguage_5105771364 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4063;
     Object term4126;

    public AbilityFlavorText_setLanguage_5105771364() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4063 = newInstance(Class.forName("skaro.pokeapi.resource.ability.AbilityFlavorText"));
        Object term4076 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term4101 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term4063, term4063.getClass(), "flavorText", "eBcTbweeYp");
        setField(term4076, term4076.getClass(), "name", "drcmjfQUDq");
        setField(term4076, term4076.getClass(), "url", "GjdWUoUSyA");
        setField(term4063, term4063.getClass(), "language", term4076);
        setField(term4101, term4101.getClass(), "name", "YEkxWsWaUl");
        setField(term4101, term4101.getClass(), "url", "RINhPkhhct");
        setField(term4063, term4063.getClass(), "versionGroup", term4101);
        term4126 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term4126, term4126.getClass(), "name", "JlgLIHPabR");
        setField(term4126, term4126.getClass(), "url", "LHnkeoNwHq");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.ability.AbilityFlavorText");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("skaro.pokeapi.resource.NamedApiResource");
        Object[] args = new Object[1];
        args[0] = term4126;
        callMethod(klass, "setLanguage", argTypes, term4063, args);
    }

};


