package skaro.pokeapi.resource.encountermethod;

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
import static skaro.pokeapi.resource.encountermethod.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.util.ArrayList;
import java.lang.Object;

public class EncounterMethod_getId_11659795631 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public EncounterMethod_getId_11659795631() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term2 = new Integer(568599855);
        Integer term16 = new Integer(1162663216);
        Object term20 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term22 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term20, term20.getClass(), "name", "");
        setField(term22, term22.getClass(), "name", null);
        setField(term22, term22.getClass(), "url", null);
        setField(term20, term20.getClass(), "language", term22);
        Object term23 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term25 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term23, term23.getClass(), "name", "");
        setField(term25, term25.getClass(), "name", null);
        setField(term25, term25.getClass(), "url", null);
        setField(term23, term23.getClass(), "language", term25);
        Object term26 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term28 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term26, term26.getClass(), "name", "");
        setField(term28, term28.getClass(), "name", null);
        setField(term28, term28.getClass(), "url", null);
        setField(term26, term26.getClass(), "language", term28);
        Object term29 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term31 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term29, term29.getClass(), "name", "");
        setField(term31, term31.getClass(), "name", null);
        setField(term31, term31.getClass(), "url", null);
        setField(term29, term29.getClass(), "language", term31);
        Object term32 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term34 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term32, term32.getClass(), "name", "");
        setField(term34, term34.getClass(), "name", null);
        setField(term34, term34.getClass(), "url", null);
        setField(term32, term32.getClass(), "language", term34);
        ArrayList term18 = new ArrayList();
        ((ArrayList) term18).add(term20);
        ((ArrayList) term18).add(term23);
        ((ArrayList) term18).add(term26);
        ((ArrayList) term18).add(term29);
        ((ArrayList) term18).add(term32);
        term1 = newInstance(Class.forName("skaro.pokeapi.resource.encountermethod.EncounterMethod"));
        setField(term1, term1.getClass(), "id", term2);
        setField(term1, term1.getClass(), "name", "PAEBtnZtTD");
        setField(term1, term1.getClass(), "order", term16);
        setField(term1, term1.getClass(), "names", term18);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.encountermethod.EncounterMethod");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term1, args);
    }

};


