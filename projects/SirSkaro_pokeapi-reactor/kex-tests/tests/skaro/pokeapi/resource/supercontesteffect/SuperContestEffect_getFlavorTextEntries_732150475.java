package skaro.pokeapi.resource.supercontesteffect;

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
import static skaro.pokeapi.resource.supercontesteffect.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.util.ArrayList;
import java.lang.Object;

public class SuperContestEffect_getFlavorTextEntries_732150475 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term101;

    public SuperContestEffect_getFlavorTextEntries_732150475() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term102 = new Integer(1725571209);
        Integer term104 = new Integer(-522618178);
        Object term108 = newInstance(Class.forName("skaro.pokeapi.resource.FlavorText"));
        Object term110 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term111 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term108, term108.getClass(), "flavorText", "");
        setField(term110, term110.getClass(), "name", null);
        setField(term110, term110.getClass(), "url", null);
        setField(term108, term108.getClass(), "language", term110);
        setField(term111, term111.getClass(), "name", null);
        setField(term111, term111.getClass(), "url", null);
        setField(term108, term108.getClass(), "version", term111);
        Object term112 = newInstance(Class.forName("skaro.pokeapi.resource.FlavorText"));
        Object term114 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term115 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term112, term112.getClass(), "flavorText", "");
        setField(term114, term114.getClass(), "name", null);
        setField(term114, term114.getClass(), "url", null);
        setField(term112, term112.getClass(), "language", term114);
        setField(term115, term115.getClass(), "name", null);
        setField(term115, term115.getClass(), "url", null);
        setField(term112, term112.getClass(), "version", term115);
        Object term116 = newInstance(Class.forName("skaro.pokeapi.resource.FlavorText"));
        Object term118 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term119 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term116, term116.getClass(), "flavorText", "");
        setField(term118, term118.getClass(), "name", null);
        setField(term118, term118.getClass(), "url", null);
        setField(term116, term116.getClass(), "language", term118);
        setField(term119, term119.getClass(), "name", null);
        setField(term119, term119.getClass(), "url", null);
        setField(term116, term116.getClass(), "version", term119);
        Object term120 = newInstance(Class.forName("skaro.pokeapi.resource.FlavorText"));
        Object term122 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term123 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term120, term120.getClass(), "flavorText", "");
        setField(term122, term122.getClass(), "name", null);
        setField(term122, term122.getClass(), "url", null);
        setField(term120, term120.getClass(), "language", term122);
        setField(term123, term123.getClass(), "name", null);
        setField(term123, term123.getClass(), "url", null);
        setField(term120, term120.getClass(), "version", term123);
        Object term124 = newInstance(Class.forName("skaro.pokeapi.resource.FlavorText"));
        Object term126 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term127 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term124, term124.getClass(), "flavorText", "");
        setField(term126, term126.getClass(), "name", null);
        setField(term126, term126.getClass(), "url", null);
        setField(term124, term124.getClass(), "language", term126);
        setField(term127, term127.getClass(), "name", null);
        setField(term127, term127.getClass(), "url", null);
        setField(term124, term124.getClass(), "version", term127);
        Object term128 = newInstance(Class.forName("skaro.pokeapi.resource.FlavorText"));
        setField(term128, term128.getClass(), "flavorText", "");
        setField(term128, term128.getClass(), "language", term123);
        setField(term128, term128.getClass(), "version", term126);
        Object term130 = newInstance(Class.forName("skaro.pokeapi.resource.FlavorText"));
        setField(term130, term130.getClass(), "flavorText", "");
        setField(term130, term130.getClass(), "language", term110);
        setField(term130, term130.getClass(), "version", term119);
        ArrayList term106 = new ArrayList();
        ((ArrayList) term106).add(term108);
        ((ArrayList) term106).add(term112);
        ((ArrayList) term106).add(term116);
        ((ArrayList) term106).add(term120);
        ((ArrayList) term106).add(term124);
        ((ArrayList) term106).add(term128);
        ((ArrayList) term106).add(term130);
        ArrayList term134 = new ArrayList();
        term101 = newInstance(Class.forName("skaro.pokeapi.resource.supercontesteffect.SuperContestEffect"));
        setField(term101, term101.getClass(), "id", term102);
        setField(term101, term101.getClass(), "appeal", term104);
        setField(term101, term101.getClass(), "flavorTextEntries", term106);
        setField(term101, term101.getClass(), "moves", term134);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.supercontesteffect.SuperContestEffect");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFlavorTextEntries", argTypes, term101, args);
    }

};


