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

public class VersionGroup_getId_20512848751 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public VersionGroup_getId_20512848751() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term2 = new Integer(568599855);
        Integer term16 = new Integer(1162663216);
        ArrayList term43 = new ArrayList();
        ArrayList term47 = new ArrayList();
        ArrayList term51 = new ArrayList();
        ArrayList term55 = new ArrayList();
        term1 = newInstance(Class.forName("skaro.pokeapi.resource.versiongroup.VersionGroup"));
        Object term18 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1, term1.getClass(), "id", term2);
        setField(term1, term1.getClass(), "name", "PAEBtnZtTD");
        setField(term1, term1.getClass(), "order", term16);
        setField(term18, term18.getClass(), "name", "sjlJAEtRrb");
        setField(term18, term18.getClass(), "url", "MuLcgQHgqz");
        setField(term1, term1.getClass(), "generation", term18);
        setField(term1, term1.getClass(), "moveLearnMethods", term43);
        setField(term1, term1.getClass(), "pokedexes", term47);
        setField(term1, term1.getClass(), "regions", term51);
        setField(term1, term1.getClass(), "versions", term55);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.versiongroup.VersionGroup");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term1, args);
    }

};


