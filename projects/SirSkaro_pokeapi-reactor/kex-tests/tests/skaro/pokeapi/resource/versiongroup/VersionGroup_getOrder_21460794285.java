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

public class VersionGroup_getOrder_21460794285 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term377;

    public VersionGroup_getOrder_21460794285() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term378 = new Integer(-1339778481);
        Integer term392 = new Integer(1725571209);
        ArrayList term419 = new ArrayList();
        ArrayList term423 = new ArrayList();
        ArrayList term427 = new ArrayList();
        ArrayList term431 = new ArrayList();
        term377 = newInstance(Class.forName("skaro.pokeapi.resource.versiongroup.VersionGroup"));
        Object term394 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term377, term377.getClass(), "id", term378);
        setField(term377, term377.getClass(), "name", "LQFpaHEwXR");
        setField(term377, term377.getClass(), "order", term392);
        setField(term394, term394.getClass(), "name", "oVcInYnLWB");
        setField(term394, term394.getClass(), "url", "aJlieCFVtF");
        setField(term377, term377.getClass(), "generation", term394);
        setField(term377, term377.getClass(), "moveLearnMethods", term419);
        setField(term377, term377.getClass(), "pokedexes", term423);
        setField(term377, term377.getClass(), "regions", term427);
        setField(term377, term377.getClass(), "versions", term431);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.versiongroup.VersionGroup");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getOrder", argTypes, term377, args);
    }

};


