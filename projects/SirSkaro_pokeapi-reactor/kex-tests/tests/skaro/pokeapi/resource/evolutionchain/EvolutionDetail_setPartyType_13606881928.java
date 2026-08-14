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

public class EvolutionDetail_setPartyType_13606881928 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13815;
     Object term14069;

    public EvolutionDetail_setPartyType_13606881928() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term13866 = new Integer(-314165467);
        Integer term13968 = new Integer(963694071);
        Integer term13970 = new Integer(-995785731);
        Integer term13972 = new Integer(1349815364);
        Integer term13974 = new Integer(2128383340);
        Boolean term13976 = new Boolean(false);
        Integer term14028 = new Integer(1238598518);
        Boolean term14067 = new Boolean(false);
        term13815 = newInstance(Class.forName("skaro.pokeapi.resource.evolutionchain.EvolutionDetail"));
        Object term13816 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term13841 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term13868 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term13893 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term13918 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term13943 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term13978 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term14003 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term14042 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term13816, term13816.getClass(), "name", "dWVwcwFGNo");
        setField(term13816, term13816.getClass(), "url", "PNdLRrSAIY");
        setField(term13815, term13815.getClass(), "item", term13816);
        setField(term13841, term13841.getClass(), "name", "nJnRIRiLZK");
        setField(term13841, term13841.getClass(), "url", "eWnrMSbYbT");
        setField(term13815, term13815.getClass(), "trigger", term13841);
        setField(term13815, term13815.getClass(), "gender", term13866);
        setField(term13868, term13868.getClass(), "name", "AjoFvDFyCY");
        setField(term13868, term13868.getClass(), "url", "OFTJwdPiTG");
        setField(term13815, term13815.getClass(), "heldItem", term13868);
        setField(term13893, term13893.getClass(), "name", "QiUprSEluR");
        setField(term13893, term13893.getClass(), "url", "cDOXXottZh");
        setField(term13815, term13815.getClass(), "knownMove", term13893);
        setField(term13918, term13918.getClass(), "name", "rfqJDkDppz");
        setField(term13918, term13918.getClass(), "url", "MGorMVGauT");
        setField(term13815, term13815.getClass(), "knownMoveType", term13918);
        setField(term13943, term13943.getClass(), "name", "jXKxUGTuEF");
        setField(term13943, term13943.getClass(), "url", "nDCcyhiTnS");
        setField(term13815, term13815.getClass(), "location", term13943);
        setField(term13815, term13815.getClass(), "minLevel", term13968);
        setField(term13815, term13815.getClass(), "minHappiness", term13970);
        setField(term13815, term13815.getClass(), "minBeauty", term13972);
        setField(term13815, term13815.getClass(), "minAffection", term13974);
        setField(term13815, term13815.getClass(), "needsOverworldRain", term13976);
        setField(term13978, term13978.getClass(), "name", "Bcivwcjece");
        setField(term13978, term13978.getClass(), "url", "QTefjRuiez");
        setField(term13815, term13815.getClass(), "partySpecies", term13978);
        setField(term14003, term14003.getClass(), "name", "SQZVNkAVBB");
        setField(term14003, term14003.getClass(), "url", "mrSAYJlddZ");
        setField(term13815, term13815.getClass(), "partyType", term14003);
        setField(term13815, term13815.getClass(), "relativePhysicalStats", term14028);
        setField(term13815, term13815.getClass(), "timeOfDay", "KbwxawvYsw");
        setField(term14042, term14042.getClass(), "name", "gvjdfHNzOa");
        setField(term14042, term14042.getClass(), "url", "HqitWglYWX");
        setField(term13815, term13815.getClass(), "tradeSpecies", term14042);
        setField(term13815, term13815.getClass(), "turnUpsideDown", term14067);
        term14069 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term14069, term14069.getClass(), "name", "vydWXHfFTw");
        setField(term14069, term14069.getClass(), "url", "DRhkpDneCC");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.evolutionchain.EvolutionDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("skaro.pokeapi.resource.NamedApiResource");
        Object[] args = new Object[1];
        args[0] = term14069;
        callMethod(klass, "setPartyType", argTypes, term13815, args);
    }

};


