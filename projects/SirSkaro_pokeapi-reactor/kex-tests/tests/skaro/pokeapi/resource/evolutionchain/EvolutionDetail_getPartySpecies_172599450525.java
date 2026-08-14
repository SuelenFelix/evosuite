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

public class EvolutionDetail_getPartySpecies_172599450525 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12438;

    public EvolutionDetail_getPartySpecies_172599450525() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term12489 = new Integer(273590437);
        Integer term12591 = new Integer(-348612876);
        Integer term12593 = new Integer(1302807565);
        Integer term12595 = new Integer(-838848221);
        Integer term12597 = new Integer(1163761623);
        Boolean term12599 = new Boolean(true);
        Integer term12651 = new Integer(718742281);
        Boolean term12690 = new Boolean(false);
        term12438 = newInstance(Class.forName("skaro.pokeapi.resource.evolutionchain.EvolutionDetail"));
        Object term12439 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term12464 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term12491 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term12516 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term12541 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term12566 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term12601 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term12626 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term12665 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term12439, term12439.getClass(), "name", "bShlAqoTmZ");
        setField(term12439, term12439.getClass(), "url", "nOKlKlNhtU");
        setField(term12438, term12438.getClass(), "item", term12439);
        setField(term12464, term12464.getClass(), "name", "gXFNBHJSey");
        setField(term12464, term12464.getClass(), "url", "wUcSfItZgv");
        setField(term12438, term12438.getClass(), "trigger", term12464);
        setField(term12438, term12438.getClass(), "gender", term12489);
        setField(term12491, term12491.getClass(), "name", "rOfPCPHmtJ");
        setField(term12491, term12491.getClass(), "url", "EnmiAvfpJv");
        setField(term12438, term12438.getClass(), "heldItem", term12491);
        setField(term12516, term12516.getClass(), "name", "AdYzLPMcwe");
        setField(term12516, term12516.getClass(), "url", "FrTZLybkKk");
        setField(term12438, term12438.getClass(), "knownMove", term12516);
        setField(term12541, term12541.getClass(), "name", "FlxVmiMYKP");
        setField(term12541, term12541.getClass(), "url", "fgOpAWlGYN");
        setField(term12438, term12438.getClass(), "knownMoveType", term12541);
        setField(term12566, term12566.getClass(), "name", "PNzNzzjSXM");
        setField(term12566, term12566.getClass(), "url", "ktKcSZiuGM");
        setField(term12438, term12438.getClass(), "location", term12566);
        setField(term12438, term12438.getClass(), "minLevel", term12591);
        setField(term12438, term12438.getClass(), "minHappiness", term12593);
        setField(term12438, term12438.getClass(), "minBeauty", term12595);
        setField(term12438, term12438.getClass(), "minAffection", term12597);
        setField(term12438, term12438.getClass(), "needsOverworldRain", term12599);
        setField(term12601, term12601.getClass(), "name", "PSOttyUeqv");
        setField(term12601, term12601.getClass(), "url", "HmEvTlmzXo");
        setField(term12438, term12438.getClass(), "partySpecies", term12601);
        setField(term12626, term12626.getClass(), "name", "BMMonTIZgJ");
        setField(term12626, term12626.getClass(), "url", "QXyFXBjFde");
        setField(term12438, term12438.getClass(), "partyType", term12626);
        setField(term12438, term12438.getClass(), "relativePhysicalStats", term12651);
        setField(term12438, term12438.getClass(), "timeOfDay", "xVFgeyYxZS");
        setField(term12665, term12665.getClass(), "name", "iQiGTulJiH");
        setField(term12665, term12665.getClass(), "url", "utCuuVCKqE");
        setField(term12438, term12438.getClass(), "tradeSpecies", term12665);
        setField(term12438, term12438.getClass(), "turnUpsideDown", term12690);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.evolutionchain.EvolutionDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPartySpecies", argTypes, term12438, args);
    }

};


