package skaro.pokeapi.resource.growthrate;

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
import static skaro.pokeapi.resource.growthrate.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.util.ArrayList;
import java.lang.Object;

public class GrowthRate_getId_20909811731 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public GrowthRate_getId_20909811731() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term2 = new Integer(568599855);
        Object term30 = newInstance(Class.forName("skaro.pokeapi.resource.Description"));
        Object term32 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term30, term30.getClass(), "description", "");
        setField(term32, term32.getClass(), "name", null);
        setField(term32, term32.getClass(), "url", null);
        setField(term30, term30.getClass(), "language", term32);
        Object term33 = newInstance(Class.forName("skaro.pokeapi.resource.Description"));
        Object term35 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term33, term33.getClass(), "description", "");
        setField(term35, term35.getClass(), "name", null);
        setField(term35, term35.getClass(), "url", null);
        setField(term33, term33.getClass(), "language", term35);
        Object term36 = newInstance(Class.forName("skaro.pokeapi.resource.Description"));
        Object term38 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term36, term36.getClass(), "description", "");
        setField(term38, term38.getClass(), "name", null);
        setField(term38, term38.getClass(), "url", null);
        setField(term36, term36.getClass(), "language", term38);
        Object term39 = newInstance(Class.forName("skaro.pokeapi.resource.Description"));
        Object term41 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term39, term39.getClass(), "description", "");
        setField(term41, term41.getClass(), "name", null);
        setField(term41, term41.getClass(), "url", null);
        setField(term39, term39.getClass(), "language", term41);
        Object term42 = newInstance(Class.forName("skaro.pokeapi.resource.Description"));
        Object term44 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term42, term42.getClass(), "description", "");
        setField(term44, term44.getClass(), "name", null);
        setField(term44, term44.getClass(), "url", null);
        setField(term42, term42.getClass(), "language", term44);
        ArrayList term28 = new ArrayList();
        ((ArrayList) term28).add(term30);
        ((ArrayList) term28).add(term33);
        ((ArrayList) term28).add(term36);
        ((ArrayList) term28).add(term39);
        ((ArrayList) term28).add(term42);
        Integer term50 = new Integer(1162663216);
        Integer term52 = new Integer(1484323161);
        Object term49 = newInstance(Class.forName("skaro.pokeapi.resource.growthrate.GrowthRateExperienceLevel"));
        setField(term49, term49.getClass(), "level", term50);
        setField(term49, term49.getClass(), "experience", term52);
        Integer term55 = new Integer(391863371);
        Integer term57 = new Integer(-1922583790);
        Object term54 = newInstance(Class.forName("skaro.pokeapi.resource.growthrate.GrowthRateExperienceLevel"));
        setField(term54, term54.getClass(), "level", term55);
        setField(term54, term54.getClass(), "experience", term57);
        Integer term60 = new Integer(-616727354);
        Integer term62 = new Integer(-1955890973);
        Object term59 = newInstance(Class.forName("skaro.pokeapi.resource.growthrate.GrowthRateExperienceLevel"));
        setField(term59, term59.getClass(), "level", term60);
        setField(term59, term59.getClass(), "experience", term62);
        Integer term65 = new Integer(-2038273078);
        Integer term67 = new Integer(1227103734);
        Object term64 = newInstance(Class.forName("skaro.pokeapi.resource.growthrate.GrowthRateExperienceLevel"));
        setField(term64, term64.getClass(), "level", term65);
        setField(term64, term64.getClass(), "experience", term67);
        ArrayList term47 = new ArrayList();
        ((ArrayList) term47).add(term49);
        ((ArrayList) term47).add(term54);
        ((ArrayList) term47).add(term59);
        ((ArrayList) term47).add(term64);
        ArrayList term71 = new ArrayList();
        term1 = newInstance(Class.forName("skaro.pokeapi.resource.growthrate.GrowthRate"));
        setField(term1, term1.getClass(), "id", term2);
        setField(term1, term1.getClass(), "name", "PAEBtnZtTD");
        setField(term1, term1.getClass(), "formula", "sjlJAEtRrb");
        setField(term1, term1.getClass(), "descriptions", term28);
        setField(term1, term1.getClass(), "levels", term47);
        setField(term1, term1.getClass(), "pokemonSpecies", term71);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.growthrate.GrowthRate");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term1, args);
    }

};


