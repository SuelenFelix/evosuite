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

public class GrowthRate_setId_11826802852 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term95;
     Object term151;

    public GrowthRate_setId_11826802852() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term96 = new Integer(-1339778481);
        Object term124 = newInstance(Class.forName("skaro.pokeapi.resource.Description"));
        Object term126 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term124, term124.getClass(), "description", "");
        setField(term126, term126.getClass(), "name", null);
        setField(term126, term126.getClass(), "url", null);
        setField(term124, term124.getClass(), "language", term126);
        Object term127 = newInstance(Class.forName("skaro.pokeapi.resource.Description"));
        Object term129 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term127, term127.getClass(), "description", "");
        setField(term129, term129.getClass(), "name", null);
        setField(term129, term129.getClass(), "url", null);
        setField(term127, term127.getClass(), "language", term129);
        Object term130 = newInstance(Class.forName("skaro.pokeapi.resource.Description"));
        Object term132 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term130, term130.getClass(), "description", "");
        setField(term132, term132.getClass(), "name", null);
        setField(term132, term132.getClass(), "url", null);
        setField(term130, term130.getClass(), "language", term132);
        Object term133 = newInstance(Class.forName("skaro.pokeapi.resource.Description"));
        Object term135 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term133, term133.getClass(), "description", "");
        setField(term135, term135.getClass(), "name", null);
        setField(term135, term135.getClass(), "url", null);
        setField(term133, term133.getClass(), "language", term135);
        ArrayList term122 = new ArrayList();
        ((ArrayList) term122).add(term124);
        ((ArrayList) term122).add(term127);
        ((ArrayList) term122).add(term130);
        ((ArrayList) term122).add(term133);
        Integer term141 = new Integer(1725571209);
        Integer term143 = new Integer(-522618178);
        Object term140 = newInstance(Class.forName("skaro.pokeapi.resource.growthrate.GrowthRateExperienceLevel"));
        setField(term140, term140.getClass(), "level", term141);
        setField(term140, term140.getClass(), "experience", term143);
        ArrayList term138 = new ArrayList();
        ((ArrayList) term138).add(term140);
        ArrayList term147 = new ArrayList();
        term95 = newInstance(Class.forName("skaro.pokeapi.resource.growthrate.GrowthRate"));
        setField(term95, term95.getClass(), "id", term96);
        setField(term95, term95.getClass(), "name", "tbcdzjIfER");
        setField(term95, term95.getClass(), "formula", "HyxfbSQYBe");
        setField(term95, term95.getClass(), "descriptions", term122);
        setField(term95, term95.getClass(), "levels", term138);
        setField(term95, term95.getClass(), "pokemonSpecies", term147);
        term151 = new Integer(1134449235);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.growthrate.GrowthRate");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term151;
        callMethod(klass, "setId", argTypes, term95, args);
    }

};


