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
import java.util.LinkedList;

public class EncounterMethodRate_setVersionDetails_6425817784 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term244;
     Object term290;

    public EncounterMethodRate_setVersionDetails_6425817784() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term273 = new Integer(1134449235);
        Object term272 = newInstance(Class.forName("skaro.pokeapi.resource.locationarea.EncounterVersionDetails"));
        Object term275 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term272, term272.getClass(), "rate", term273);
        setField(term275, term275.getClass(), "name", null);
        setField(term275, term275.getClass(), "url", null);
        setField(term272, term272.getClass(), "version", term275);
        Integer term277 = new Integer(-883034806);
        Object term276 = newInstance(Class.forName("skaro.pokeapi.resource.locationarea.EncounterVersionDetails"));
        Object term279 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term276, term276.getClass(), "rate", term277);
        setField(term279, term279.getClass(), "name", null);
        setField(term279, term279.getClass(), "url", null);
        setField(term276, term276.getClass(), "version", term279);
        Integer term281 = new Integer(1585847225);
        Object term280 = newInstance(Class.forName("skaro.pokeapi.resource.locationarea.EncounterVersionDetails"));
        Object term283 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term280, term280.getClass(), "rate", term281);
        setField(term283, term283.getClass(), "name", null);
        setField(term283, term283.getClass(), "url", null);
        setField(term280, term280.getClass(), "version", term283);
        Integer term285 = new Integer(597278769);
        Object term284 = newInstance(Class.forName("skaro.pokeapi.resource.locationarea.EncounterVersionDetails"));
        Object term287 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term284, term284.getClass(), "rate", term285);
        setField(term287, term287.getClass(), "name", null);
        setField(term287, term287.getClass(), "url", null);
        setField(term284, term284.getClass(), "version", term287);
        ArrayList term270 = new ArrayList();
        ((ArrayList) term270).add(term272);
        ((ArrayList) term270).add(term276);
        ((ArrayList) term270).add(term280);
        ((ArrayList) term270).add(term284);
        term244 = newInstance(Class.forName("skaro.pokeapi.resource.locationarea.EncounterMethodRate"));
        Object term245 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term245, term245.getClass(), "name", "kuTXqwMtDB");
        setField(term245, term245.getClass(), "url", "Ghbwtircqb");
        setField(term244, term244.getClass(), "encounterMethod", term245);
        setField(term244, term244.getClass(), "versionDetails", term270);
        Integer term294 = new Integer(-1685132342);
        Object term293 = newInstance(Class.forName("skaro.pokeapi.resource.locationarea.EncounterVersionDetails"));
        Object term296 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term293, term293.getClass(), "rate", term294);
        setField(term296, term296.getClass(), "name", "");
        setField(term296, term296.getClass(), "url", "");
        setField(term293, term293.getClass(), "version", term296);
        Integer term301 = new Integer(-1456670397);
        Object term300 = newInstance(Class.forName("skaro.pokeapi.resource.locationarea.EncounterVersionDetails"));
        Object term303 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term300, term300.getClass(), "rate", term301);
        setField(term303, term303.getClass(), "name", null);
        setField(term303, term303.getClass(), "url", null);
        setField(term300, term300.getClass(), "version", term303);
        Integer term306 = new Integer(1622346318);
        Object term305 = newInstance(Class.forName("skaro.pokeapi.resource.locationarea.EncounterVersionDetails"));
        setField(term305, term305.getClass(), "rate", term306);
        setField(term305, term305.getClass(), "version", null);
        term290 = new LinkedList();
        ((LinkedList) term290).add(term293);
        ((LinkedList) term290).add(term300);
        ((LinkedList) term290).add(term305);
        ((LinkedList) term290).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.locationarea.EncounterMethodRate");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term290;
        callMethod(klass, "setVersionDetails", argTypes, term244, args);
    }

};


