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

public class VersionGroup_getMoveLearnMethods_18519934219 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term776;

    public VersionGroup_getMoveLearnMethods_18519934219() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term777 = new Integer(1622346318);
        Integer term791 = new Integer(1048535127);
        ArrayList term818 = new ArrayList();
        ArrayList term822 = new ArrayList();
        ArrayList term826 = new ArrayList();
        ArrayList term830 = new ArrayList();
        term776 = newInstance(Class.forName("skaro.pokeapi.resource.versiongroup.VersionGroup"));
        Object term793 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term776, term776.getClass(), "id", term777);
        setField(term776, term776.getClass(), "name", "TEParAifyi");
        setField(term776, term776.getClass(), "order", term791);
        setField(term793, term793.getClass(), "name", "OWDIEULEFu");
        setField(term793, term793.getClass(), "url", "dWRymuLBtr");
        setField(term776, term776.getClass(), "generation", term793);
        setField(term776, term776.getClass(), "moveLearnMethods", term818);
        setField(term776, term776.getClass(), "pokedexes", term822);
        setField(term776, term776.getClass(), "regions", term826);
        setField(term776, term776.getClass(), "versions", term830);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.versiongroup.VersionGroup");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMoveLearnMethods", argTypes, term776, args);
    }

};


