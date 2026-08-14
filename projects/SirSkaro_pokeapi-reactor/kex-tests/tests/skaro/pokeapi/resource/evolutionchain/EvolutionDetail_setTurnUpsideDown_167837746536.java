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

public class EvolutionDetail_setTurnUpsideDown_167837746536 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17481;
     Object term17735;

    public EvolutionDetail_setTurnUpsideDown_167837746536() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term17532 = new Integer(-1511130237);
        Integer term17634 = new Integer(452088587);
        Integer term17636 = new Integer(-1630069454);
        Integer term17638 = new Integer(1499735894);
        Integer term17640 = new Integer(716486048);
        Boolean term17642 = new Boolean(true);
        Integer term17694 = new Integer(-466708718);
        Boolean term17733 = new Boolean(false);
        term17481 = newInstance(Class.forName("skaro.pokeapi.resource.evolutionchain.EvolutionDetail"));
        Object term17482 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term17507 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term17534 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term17559 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term17584 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term17609 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term17644 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term17669 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term17708 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term17482, term17482.getClass(), "name", "lRaSlqzqNY");
        setField(term17482, term17482.getClass(), "url", "TiEyxWXsra");
        setField(term17481, term17481.getClass(), "item", term17482);
        setField(term17507, term17507.getClass(), "name", "TuLgwTZsPP");
        setField(term17507, term17507.getClass(), "url", "KoasxTJGpx");
        setField(term17481, term17481.getClass(), "trigger", term17507);
        setField(term17481, term17481.getClass(), "gender", term17532);
        setField(term17534, term17534.getClass(), "name", "ceGeARYMoa");
        setField(term17534, term17534.getClass(), "url", "fFWllaiFvh");
        setField(term17481, term17481.getClass(), "heldItem", term17534);
        setField(term17559, term17559.getClass(), "name", "PFTdEDSbvZ");
        setField(term17559, term17559.getClass(), "url", "TbiwoiebNe");
        setField(term17481, term17481.getClass(), "knownMove", term17559);
        setField(term17584, term17584.getClass(), "name", "laTITSWZuc");
        setField(term17584, term17584.getClass(), "url", "fkzRpxlAqS");
        setField(term17481, term17481.getClass(), "knownMoveType", term17584);
        setField(term17609, term17609.getClass(), "name", "VYvbTGKslj");
        setField(term17609, term17609.getClass(), "url", "owLqDDnwZA");
        setField(term17481, term17481.getClass(), "location", term17609);
        setField(term17481, term17481.getClass(), "minLevel", term17634);
        setField(term17481, term17481.getClass(), "minHappiness", term17636);
        setField(term17481, term17481.getClass(), "minBeauty", term17638);
        setField(term17481, term17481.getClass(), "minAffection", term17640);
        setField(term17481, term17481.getClass(), "needsOverworldRain", term17642);
        setField(term17644, term17644.getClass(), "name", "eBcTbweeYp");
        setField(term17644, term17644.getClass(), "url", "drcmjfQUDq");
        setField(term17481, term17481.getClass(), "partySpecies", term17644);
        setField(term17669, term17669.getClass(), "name", "GjdWUoUSyA");
        setField(term17669, term17669.getClass(), "url", "YEkxWsWaUl");
        setField(term17481, term17481.getClass(), "partyType", term17669);
        setField(term17481, term17481.getClass(), "relativePhysicalStats", term17694);
        setField(term17481, term17481.getClass(), "timeOfDay", "RINhPkhhct");
        setField(term17708, term17708.getClass(), "name", "vjNPcTSqmS");
        setField(term17708, term17708.getClass(), "url", "fFhdWuJbdC");
        setField(term17481, term17481.getClass(), "tradeSpecies", term17708);
        setField(term17481, term17481.getClass(), "turnUpsideDown", term17733);
        term17735 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.evolutionchain.EvolutionDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Boolean");
        Object[] args = new Object[1];
        args[0] = term17735;
        callMethod(klass, "setTurnUpsideDown", argTypes, term17481, args);
    }

};


