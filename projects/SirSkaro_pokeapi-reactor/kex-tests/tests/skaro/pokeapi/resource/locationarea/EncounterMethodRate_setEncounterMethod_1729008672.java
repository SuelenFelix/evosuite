package skaro.pokeapi.resource.locationarea;

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
import static skaro.pokeapi.resource.locationarea.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.Integer;

public class EncounterMethodRate_setEncounterMethod_1729008672 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term71;
     Object term117;

    public EncounterMethodRate_setEncounterMethod_1729008672() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term100 = new Integer(-616727354);
        Object term99 = newInstance(Class.forName("skaro.pokeapi.resource.locationarea.EncounterVersionDetails"));
        Object term102 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term99, term99.getClass(), "rate", term100);
        setField(term102, term102.getClass(), "name", null);
        setField(term102, term102.getClass(), "url", null);
        setField(term99, term99.getClass(), "version", term102);
        Integer term104 = new Integer(-1955890973);
        Object term103 = newInstance(Class.forName("skaro.pokeapi.resource.locationarea.EncounterVersionDetails"));
        Object term106 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term103, term103.getClass(), "rate", term104);
        setField(term106, term106.getClass(), "name", null);
        setField(term106, term106.getClass(), "url", null);
        setField(term103, term103.getClass(), "version", term106);
        Integer term108 = new Integer(-2038273078);
        Object term107 = newInstance(Class.forName("skaro.pokeapi.resource.locationarea.EncounterVersionDetails"));
        Object term110 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term107, term107.getClass(), "rate", term108);
        setField(term110, term110.getClass(), "name", null);
        setField(term110, term110.getClass(), "url", null);
        setField(term107, term107.getClass(), "version", term110);
        Integer term112 = new Integer(1227103734);
        Object term111 = newInstance(Class.forName("skaro.pokeapi.resource.locationarea.EncounterVersionDetails"));
        Object term114 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term111, term111.getClass(), "rate", term112);
        setField(term114, term114.getClass(), "name", null);
        setField(term114, term114.getClass(), "url", null);
        setField(term111, term111.getClass(), "version", term114);
        ArrayList term97 = new ArrayList();
        ((ArrayList) term97).add(term99);
        ((ArrayList) term97).add(term103);
        ((ArrayList) term97).add(term107);
        ((ArrayList) term97).add(term111);
        term71 = newInstance(Class.forName("skaro.pokeapi.resource.locationarea.EncounterMethodRate"));
        Object term72 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term72, term72.getClass(), "name", "MxlszYVzRf");
        setField(term72, term72.getClass(), "url", "LQFpaHEwXR");
        setField(term71, term71.getClass(), "encounterMethod", term72);
        setField(term71, term71.getClass(), "versionDetails", term97);
        term117 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term117, term117.getClass(), "name", "BYqFIqCKAV");
        setField(term117, term117.getClass(), "url", "vrQLuWIDJX");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.locationarea.EncounterMethodRate");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("skaro.pokeapi.resource.NamedApiResource");
        Object[] args = new Object[1];
        args[0] = term117;
        callMethod(klass, "setEncounterMethod", argTypes, term71, args);
    }

};


