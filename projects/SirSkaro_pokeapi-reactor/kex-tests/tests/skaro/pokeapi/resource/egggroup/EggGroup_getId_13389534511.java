package skaro.pokeapi.resource.egggroup;

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
import static skaro.pokeapi.resource.egggroup.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.util.ArrayList;
import java.lang.Object;

public class EggGroup_getId_13389534511 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public EggGroup_getId_13389534511() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term2 = new Integer(568599855);
        Object term18 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term20 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term18, term18.getClass(), "name", "");
        setField(term20, term20.getClass(), "name", null);
        setField(term20, term20.getClass(), "url", null);
        setField(term18, term18.getClass(), "language", term20);
        Object term21 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term23 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term21, term21.getClass(), "name", "");
        setField(term23, term23.getClass(), "name", null);
        setField(term23, term23.getClass(), "url", null);
        setField(term21, term21.getClass(), "language", term23);
        Object term24 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term26 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term24, term24.getClass(), "name", "");
        setField(term26, term26.getClass(), "name", null);
        setField(term26, term26.getClass(), "url", null);
        setField(term24, term24.getClass(), "language", term26);
        Object term27 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term29 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term27, term27.getClass(), "name", "");
        setField(term29, term29.getClass(), "name", null);
        setField(term29, term29.getClass(), "url", null);
        setField(term27, term27.getClass(), "language", term29);
        Object term30 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term32 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term30, term30.getClass(), "name", "");
        setField(term32, term32.getClass(), "name", null);
        setField(term32, term32.getClass(), "url", null);
        setField(term30, term30.getClass(), "language", term32);
        ArrayList term16 = new ArrayList();
        ((ArrayList) term16).add(term18);
        ((ArrayList) term16).add(term21);
        ((ArrayList) term16).add(term24);
        ((ArrayList) term16).add(term27);
        ((ArrayList) term16).add(term30);
        ArrayList term35 = new ArrayList();
        term1 = newInstance(Class.forName("skaro.pokeapi.resource.egggroup.EggGroup"));
        setField(term1, term1.getClass(), "id", term2);
        setField(term1, term1.getClass(), "name", "PAEBtnZtTD");
        setField(term1, term1.getClass(), "names", term16);
        setField(term1, term1.getClass(), "pokemonSpecies", term35);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.egggroup.EggGroup");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term1, args);
    }

};


