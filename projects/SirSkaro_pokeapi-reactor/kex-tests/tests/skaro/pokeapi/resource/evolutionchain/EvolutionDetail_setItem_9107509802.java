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

public class EvolutionDetail_setItem_9107509802 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1944;
     Object term2198;

    public EvolutionDetail_setItem_9107509802() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1995 = new Integer(723812297);
        Integer term2097 = new Integer(1639448749);
        Integer term2099 = new Integer(873659088);
        Integer term2101 = new Integer(-975748721);
        Integer term2103 = new Integer(433248783);
        Boolean term2105 = new Boolean(false);
        Integer term2157 = new Integer(-507944154);
        Boolean term2196 = new Boolean(true);
        term1944 = newInstance(Class.forName("skaro.pokeapi.resource.evolutionchain.EvolutionDetail"));
        Object term1945 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term1970 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term1997 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term2022 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term2047 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term2072 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term2107 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term2132 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term2171 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1945, term1945.getClass(), "name", "beAMpkroCQ");
        setField(term1945, term1945.getClass(), "url", "uSUvKAyuvd");
        setField(term1944, term1944.getClass(), "item", term1945);
        setField(term1970, term1970.getClass(), "name", "onQLVONGuf");
        setField(term1970, term1970.getClass(), "url", "SOrEHbcbmn");
        setField(term1944, term1944.getClass(), "trigger", term1970);
        setField(term1944, term1944.getClass(), "gender", term1995);
        setField(term1997, term1997.getClass(), "name", "bnsyeQXFdu");
        setField(term1997, term1997.getClass(), "url", "BwtdjiefJn");
        setField(term1944, term1944.getClass(), "heldItem", term1997);
        setField(term2022, term2022.getClass(), "name", "jDmhBrIoDa");
        setField(term2022, term2022.getClass(), "url", "SPtPatHeOm");
        setField(term1944, term1944.getClass(), "knownMove", term2022);
        setField(term2047, term2047.getClass(), "name", "ywmcuThdfL");
        setField(term2047, term2047.getClass(), "url", "GBOEuByOfr");
        setField(term1944, term1944.getClass(), "knownMoveType", term2047);
        setField(term2072, term2072.getClass(), "name", "NHbOFFjyVK");
        setField(term2072, term2072.getClass(), "url", "zaloBqlrSo");
        setField(term1944, term1944.getClass(), "location", term2072);
        setField(term1944, term1944.getClass(), "minLevel", term2097);
        setField(term1944, term1944.getClass(), "minHappiness", term2099);
        setField(term1944, term1944.getClass(), "minBeauty", term2101);
        setField(term1944, term1944.getClass(), "minAffection", term2103);
        setField(term1944, term1944.getClass(), "needsOverworldRain", term2105);
        setField(term2107, term2107.getClass(), "name", "vvoLrMGCoN");
        setField(term2107, term2107.getClass(), "url", "pXdglvyrQe");
        setField(term1944, term1944.getClass(), "partySpecies", term2107);
        setField(term2132, term2132.getClass(), "name", "OcfNzHYdki");
        setField(term2132, term2132.getClass(), "url", "uPuCVuZYOI");
        setField(term1944, term1944.getClass(), "partyType", term2132);
        setField(term1944, term1944.getClass(), "relativePhysicalStats", term2157);
        setField(term1944, term1944.getClass(), "timeOfDay", "TweMFhxNdj");
        setField(term2171, term2171.getClass(), "name", "NBrvVzvQHe");
        setField(term2171, term2171.getClass(), "url", "FjOiNAfBOc");
        setField(term1944, term1944.getClass(), "tradeSpecies", term2171);
        setField(term1944, term1944.getClass(), "turnUpsideDown", term2196);
        term2198 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term2198, term2198.getClass(), "name", "MYWYUeLGOp");
        setField(term2198, term2198.getClass(), "url", "tsTGdgQYUL");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.evolutionchain.EvolutionDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("skaro.pokeapi.resource.NamedApiResource");
        Object[] args = new Object[1];
        args[0] = term2198;
        callMethod(klass, "setItem", argTypes, term1944, args);
    }

};


