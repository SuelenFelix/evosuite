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

public class EvolutionDetail_getItem_7180759881 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1500;

    public EvolutionDetail_getItem_7180759881() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1551 = new Integer(-763166094);
        Integer term1653 = new Integer(-222941705);
        Integer term1655 = new Integer(291864719);
        Integer term1657 = new Integer(-1549607466);
        Integer term1659 = new Integer(853609788);
        Boolean term1661 = new Boolean(true);
        Integer term1713 = new Integer(-197820800);
        Boolean term1752 = new Boolean(false);
        term1500 = newInstance(Class.forName("skaro.pokeapi.resource.evolutionchain.EvolutionDetail"));
        Object term1501 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term1526 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term1553 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term1578 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term1603 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term1628 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term1663 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term1688 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term1727 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1501, term1501.getClass(), "name", "rYbtIDVdnd");
        setField(term1501, term1501.getClass(), "url", "UKAReurpHG");
        setField(term1500, term1500.getClass(), "item", term1501);
        setField(term1526, term1526.getClass(), "name", "WVRMUmrljA");
        setField(term1526, term1526.getClass(), "url", "NTlKJDDWlk");
        setField(term1500, term1500.getClass(), "trigger", term1526);
        setField(term1500, term1500.getClass(), "gender", term1551);
        setField(term1553, term1553.getClass(), "name", "vOuMEpOQAg");
        setField(term1553, term1553.getClass(), "url", "SIODFGaQhr");
        setField(term1500, term1500.getClass(), "heldItem", term1553);
        setField(term1578, term1578.getClass(), "name", "qYzsiuXOgS");
        setField(term1578, term1578.getClass(), "url", "bxrCBbrrct");
        setField(term1500, term1500.getClass(), "knownMove", term1578);
        setField(term1603, term1603.getClass(), "name", "CKWpJaaaxX");
        setField(term1603, term1603.getClass(), "url", "UBRmXJmfrt");
        setField(term1500, term1500.getClass(), "knownMoveType", term1603);
        setField(term1628, term1628.getClass(), "name", "WZzvmIHhzZ");
        setField(term1628, term1628.getClass(), "url", "doQLHkjpNm");
        setField(term1500, term1500.getClass(), "location", term1628);
        setField(term1500, term1500.getClass(), "minLevel", term1653);
        setField(term1500, term1500.getClass(), "minHappiness", term1655);
        setField(term1500, term1500.getClass(), "minBeauty", term1657);
        setField(term1500, term1500.getClass(), "minAffection", term1659);
        setField(term1500, term1500.getClass(), "needsOverworldRain", term1661);
        setField(term1663, term1663.getClass(), "name", "lCyLIcSuom");
        setField(term1663, term1663.getClass(), "url", "CGOpQSZZwI");
        setField(term1500, term1500.getClass(), "partySpecies", term1663);
        setField(term1688, term1688.getClass(), "name", "ypEdrstygY");
        setField(term1688, term1688.getClass(), "url", "sNQFlATEeQ");
        setField(term1500, term1500.getClass(), "partyType", term1688);
        setField(term1500, term1500.getClass(), "relativePhysicalStats", term1713);
        setField(term1500, term1500.getClass(), "timeOfDay", "ZKMLioamsY");
        setField(term1727, term1727.getClass(), "name", "WVbxuoDBcn");
        setField(term1727, term1727.getClass(), "url", "pvDEABOxLt");
        setField(term1500, term1500.getClass(), "tradeSpecies", term1727);
        setField(term1500, term1500.getClass(), "turnUpsideDown", term1752);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.evolutionchain.EvolutionDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getItem", argTypes, term1500, args);
    }

};


