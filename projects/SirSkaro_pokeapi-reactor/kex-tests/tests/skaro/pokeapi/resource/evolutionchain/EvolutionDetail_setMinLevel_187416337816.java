package skaro.pokeapi.resource.evolutionchain;

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
import static skaro.pokeapi.resource.evolutionchain.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Integer;
import java.lang.Boolean;

public class EvolutionDetail_setMinLevel_187416337816 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8432;
     Object term8686;

    public EvolutionDetail_setMinLevel_187416337816() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term8483 = new Integer(-2072158633);
        Integer term8585 = new Integer(-355469363);
        Integer term8587 = new Integer(1465188553);
        Integer term8589 = new Integer(1633913667);
        Integer term8591 = new Integer(1292332296);
        Boolean term8593 = new Boolean(true);
        Integer term8645 = new Integer(-1415256843);
        Boolean term8684 = new Boolean(true);
        term8432 = newInstance(Class.forName("skaro.pokeapi.resource.evolutionchain.EvolutionDetail"));
        Object term8433 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term8458 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term8485 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term8510 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term8535 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term8560 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term8595 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term8620 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term8659 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term8433, term8433.getClass(), "name", "MlzTkzKMCX");
        setField(term8433, term8433.getClass(), "url", "UqKUbMyPMJ");
        setField(term8432, term8432.getClass(), "item", term8433);
        setField(term8458, term8458.getClass(), "name", "QpYltHAdyY");
        setField(term8458, term8458.getClass(), "url", "lbmSGBwIiV");
        setField(term8432, term8432.getClass(), "trigger", term8458);
        setField(term8432, term8432.getClass(), "gender", term8483);
        setField(term8485, term8485.getClass(), "name", "DAxyHoTLzZ");
        setField(term8485, term8485.getClass(), "url", "fhZgTouhCC");
        setField(term8432, term8432.getClass(), "heldItem", term8485);
        setField(term8510, term8510.getClass(), "name", "wrikqJwXvL");
        setField(term8510, term8510.getClass(), "url", "UiWhvbypdr");
        setField(term8432, term8432.getClass(), "knownMove", term8510);
        setField(term8535, term8535.getClass(), "name", "CgleElJNje");
        setField(term8535, term8535.getClass(), "url", "ZrchvNGMtd");
        setField(term8432, term8432.getClass(), "knownMoveType", term8535);
        setField(term8560, term8560.getClass(), "name", "WaEcyVlcIx");
        setField(term8560, term8560.getClass(), "url", "ONcbPCQnHd");
        setField(term8432, term8432.getClass(), "location", term8560);
        setField(term8432, term8432.getClass(), "minLevel", term8585);
        setField(term8432, term8432.getClass(), "minHappiness", term8587);
        setField(term8432, term8432.getClass(), "minBeauty", term8589);
        setField(term8432, term8432.getClass(), "minAffection", term8591);
        setField(term8432, term8432.getClass(), "needsOverworldRain", term8593);
        setField(term8595, term8595.getClass(), "name", "AobDaplFLl");
        setField(term8595, term8595.getClass(), "url", "pDkMNnAGgv");
        setField(term8432, term8432.getClass(), "partySpecies", term8595);
        setField(term8620, term8620.getClass(), "name", "PaCpFXGzdX");
        setField(term8620, term8620.getClass(), "url", "FftYCNbnks");
        setField(term8432, term8432.getClass(), "partyType", term8620);
        setField(term8432, term8432.getClass(), "relativePhysicalStats", term8645);
        setField(term8432, term8432.getClass(), "timeOfDay", "lJoltmsadS");
        setField(term8659, term8659.getClass(), "name", "mvfDtZNEHr");
        setField(term8659, term8659.getClass(), "url", "bvSgmFUDOU");
        setField(term8432, term8432.getClass(), "tradeSpecies", term8659);
        setField(term8432, term8432.getClass(), "turnUpsideDown", term8684);
        term8686 = new Integer(612177768);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.evolutionchain.EvolutionDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term8686;
        callMethod(klass, "setMinLevel", argTypes, term8432, args);
    }

};


