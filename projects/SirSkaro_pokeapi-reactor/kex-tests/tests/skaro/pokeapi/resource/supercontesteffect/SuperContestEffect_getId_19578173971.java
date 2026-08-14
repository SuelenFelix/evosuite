package skaro.pokeapi.resource.supercontesteffect;

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
import static skaro.pokeapi.resource.supercontesteffect.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.util.ArrayList;
import java.lang.Object;

public class SuperContestEffect_getId_19578173971 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public SuperContestEffect_getId_19578173971() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term2 = new Integer(568599855);
        Integer term4 = new Integer(1162663216);
        Object term8 = newInstance(Class.forName("skaro.pokeapi.resource.FlavorText"));
        Object term10 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term11 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term8, term8.getClass(), "flavorText", "");
        setField(term10, term10.getClass(), "name", null);
        setField(term10, term10.getClass(), "url", null);
        setField(term8, term8.getClass(), "language", term10);
        setField(term11, term11.getClass(), "name", null);
        setField(term11, term11.getClass(), "url", null);
        setField(term8, term8.getClass(), "version", term11);
        Object term12 = newInstance(Class.forName("skaro.pokeapi.resource.FlavorText"));
        Object term14 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term15 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term12, term12.getClass(), "flavorText", "");
        setField(term14, term14.getClass(), "name", null);
        setField(term14, term14.getClass(), "url", null);
        setField(term12, term12.getClass(), "language", term14);
        setField(term15, term15.getClass(), "name", null);
        setField(term15, term15.getClass(), "url", null);
        setField(term12, term12.getClass(), "version", term15);
        Object term16 = newInstance(Class.forName("skaro.pokeapi.resource.FlavorText"));
        Object term18 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term19 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term16, term16.getClass(), "flavorText", "");
        setField(term18, term18.getClass(), "name", null);
        setField(term18, term18.getClass(), "url", null);
        setField(term16, term16.getClass(), "language", term18);
        setField(term19, term19.getClass(), "name", null);
        setField(term19, term19.getClass(), "url", null);
        setField(term16, term16.getClass(), "version", term19);
        Object term20 = newInstance(Class.forName("skaro.pokeapi.resource.FlavorText"));
        Object term22 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term23 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term20, term20.getClass(), "flavorText", "");
        setField(term22, term22.getClass(), "name", null);
        setField(term22, term22.getClass(), "url", null);
        setField(term20, term20.getClass(), "language", term22);
        setField(term23, term23.getClass(), "name", null);
        setField(term23, term23.getClass(), "url", null);
        setField(term20, term20.getClass(), "version", term23);
        Object term24 = newInstance(Class.forName("skaro.pokeapi.resource.FlavorText"));
        Object term26 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term27 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term24, term24.getClass(), "flavorText", "");
        setField(term26, term26.getClass(), "name", null);
        setField(term26, term26.getClass(), "url", null);
        setField(term24, term24.getClass(), "language", term26);
        setField(term27, term27.getClass(), "name", null);
        setField(term27, term27.getClass(), "url", null);
        setField(term24, term24.getClass(), "version", term27);
        ArrayList term6 = new ArrayList();
        ((ArrayList) term6).add(term8);
        ((ArrayList) term6).add(term12);
        ((ArrayList) term6).add(term16);
        ((ArrayList) term6).add(term20);
        ((ArrayList) term6).add(term24);
        ArrayList term30 = new ArrayList();
        term1 = newInstance(Class.forName("skaro.pokeapi.resource.supercontesteffect.SuperContestEffect"));
        setField(term1, term1.getClass(), "id", term2);
        setField(term1, term1.getClass(), "appeal", term4);
        setField(term1, term1.getClass(), "flavorTextEntries", term6);
        setField(term1, term1.getClass(), "moves", term30);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.supercontesteffect.SuperContestEffect");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term1, args);
    }

};


