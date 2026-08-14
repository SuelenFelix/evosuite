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

public class VersionGroup_getRegions_143342659113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1134;

    public VersionGroup_getRegions_143342659113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1135 = new Integer(590364439);
        Integer term1149 = new Integer(865208305);
        ArrayList term1176 = new ArrayList();
        ArrayList term1180 = new ArrayList();
        ArrayList term1184 = new ArrayList();
        ArrayList term1188 = new ArrayList();
        term1134 = newInstance(Class.forName("skaro.pokeapi.resource.versiongroup.VersionGroup"));
        Object term1151 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1134, term1134.getClass(), "id", term1135);
        setField(term1134, term1134.getClass(), "name", "UlajhuVLaP");
        setField(term1134, term1134.getClass(), "order", term1149);
        setField(term1151, term1151.getClass(), "name", "gGSMzuGICf");
        setField(term1151, term1151.getClass(), "url", "hxCBltsObl");
        setField(term1134, term1134.getClass(), "generation", term1151);
        setField(term1134, term1134.getClass(), "moveLearnMethods", term1176);
        setField(term1134, term1134.getClass(), "pokedexes", term1180);
        setField(term1134, term1134.getClass(), "regions", term1184);
        setField(term1134, term1134.getClass(), "versions", term1188);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.versiongroup.VersionGroup");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRegions", argTypes, term1134, args);
    }

};


