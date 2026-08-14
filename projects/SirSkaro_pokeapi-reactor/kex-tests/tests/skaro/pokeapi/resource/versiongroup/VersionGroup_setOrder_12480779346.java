package skaro.pokeapi.resource.versiongroup;

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
import static skaro.pokeapi.resource.versiongroup.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Object;
import java.util.ArrayList;

public class VersionGroup_setOrder_12480779346 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term465;
     Object term523;

    public VersionGroup_setOrder_12480779346() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term466 = new Integer(-522618178);
        Integer term480 = new Integer(1134449235);
        ArrayList term507 = new ArrayList();
        ArrayList term511 = new ArrayList();
        ArrayList term515 = new ArrayList();
        ArrayList term519 = new ArrayList();
        term465 = newInstance(Class.forName("skaro.pokeapi.resource.versiongroup.VersionGroup"));
        Object term482 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term465, term465.getClass(), "id", term466);
        setField(term465, term465.getClass(), "name", "ZiaGIbnzTs");
        setField(term465, term465.getClass(), "order", term480);
        setField(term482, term482.getClass(), "name", "tbcdzjIfER");
        setField(term482, term482.getClass(), "url", "HyxfbSQYBe");
        setField(term465, term465.getClass(), "generation", term482);
        setField(term465, term465.getClass(), "moveLearnMethods", term507);
        setField(term465, term465.getClass(), "pokedexes", term511);
        setField(term465, term465.getClass(), "regions", term515);
        setField(term465, term465.getClass(), "versions", term519);
        term523 = new Integer(-883034806);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.versiongroup.VersionGroup");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term523;
        callMethod(klass, "setOrder", argTypes, term465, args);
    }

};


