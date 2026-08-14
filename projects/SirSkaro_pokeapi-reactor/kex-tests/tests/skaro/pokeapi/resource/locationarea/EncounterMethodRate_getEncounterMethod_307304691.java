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

public class EncounterMethodRate_getEncounterMethod_307304691 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public EncounterMethodRate_getEncounterMethod_307304691() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term30 = new Integer(568599855);
        Object term29 = newInstance(Class.forName("skaro.pokeapi.resource.locationarea.EncounterVersionDetails"));
        Object term32 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term29, term29.getClass(), "rate", term30);
        setField(term32, term32.getClass(), "name", null);
        setField(term32, term32.getClass(), "url", null);
        setField(term29, term29.getClass(), "version", term32);
        Integer term34 = new Integer(1162663216);
        Object term33 = newInstance(Class.forName("skaro.pokeapi.resource.locationarea.EncounterVersionDetails"));
        Object term36 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term33, term33.getClass(), "rate", term34);
        setField(term36, term36.getClass(), "name", null);
        setField(term36, term36.getClass(), "url", null);
        setField(term33, term33.getClass(), "version", term36);
        Integer term38 = new Integer(1484323161);
        Object term37 = newInstance(Class.forName("skaro.pokeapi.resource.locationarea.EncounterVersionDetails"));
        Object term40 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term37, term37.getClass(), "rate", term38);
        setField(term40, term40.getClass(), "name", null);
        setField(term40, term40.getClass(), "url", null);
        setField(term37, term37.getClass(), "version", term40);
        Integer term42 = new Integer(391863371);
        Object term41 = newInstance(Class.forName("skaro.pokeapi.resource.locationarea.EncounterVersionDetails"));
        Object term44 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term41, term41.getClass(), "rate", term42);
        setField(term44, term44.getClass(), "name", null);
        setField(term44, term44.getClass(), "url", null);
        setField(term41, term41.getClass(), "version", term44);
        Integer term46 = new Integer(-1922583790);
        Object term45 = newInstance(Class.forName("skaro.pokeapi.resource.locationarea.EncounterVersionDetails"));
        Object term48 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term45, term45.getClass(), "rate", term46);
        setField(term48, term48.getClass(), "name", null);
        setField(term48, term48.getClass(), "url", null);
        setField(term45, term45.getClass(), "version", term48);
        ArrayList term27 = new ArrayList();
        ((ArrayList) term27).add(term29);
        ((ArrayList) term27).add(term33);
        ((ArrayList) term27).add(term37);
        ((ArrayList) term27).add(term41);
        ((ArrayList) term27).add(term45);
        term1 = newInstance(Class.forName("skaro.pokeapi.resource.locationarea.EncounterMethodRate"));
        Object term2 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term2, term2.getClass(), "name", "PAEBtnZtTD");
        setField(term2, term2.getClass(), "url", "sjlJAEtRrb");
        setField(term1, term1.getClass(), "encounterMethod", term2);
        setField(term1, term1.getClass(), "versionDetails", term27);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.locationarea.EncounterMethodRate");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEncounterMethod", argTypes, term1, args);
    }

};


