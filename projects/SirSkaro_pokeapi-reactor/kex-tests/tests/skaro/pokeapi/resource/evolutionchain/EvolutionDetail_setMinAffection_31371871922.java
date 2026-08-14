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

public class EvolutionDetail_setMinAffection_31371871922 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11102;
     Object term11356;

    public EvolutionDetail_setMinAffection_31371871922() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term11153 = new Integer(-728760750);
        Integer term11255 = new Integer(-1617383807);
        Integer term11257 = new Integer(-1244386281);
        Integer term11259 = new Integer(-885788574);
        Integer term11261 = new Integer(-865722613);
        Boolean term11263 = new Boolean(true);
        Integer term11315 = new Integer(-1551355284);
        Boolean term11354 = new Boolean(true);
        term11102 = newInstance(Class.forName("skaro.pokeapi.resource.evolutionchain.EvolutionDetail"));
        Object term11103 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term11128 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term11155 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term11180 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term11205 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term11230 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term11265 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term11290 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term11329 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term11103, term11103.getClass(), "name", "xAWekqanqc");
        setField(term11103, term11103.getClass(), "url", "GSOWFHMlbF");
        setField(term11102, term11102.getClass(), "item", term11103);
        setField(term11128, term11128.getClass(), "name", "vpZIqpFbKM");
        setField(term11128, term11128.getClass(), "url", "dAbwpJCDif");
        setField(term11102, term11102.getClass(), "trigger", term11128);
        setField(term11102, term11102.getClass(), "gender", term11153);
        setField(term11155, term11155.getClass(), "name", "ATSXJPySio");
        setField(term11155, term11155.getClass(), "url", "XZkOUcbfFg");
        setField(term11102, term11102.getClass(), "heldItem", term11155);
        setField(term11180, term11180.getClass(), "name", "TGiJfagfky");
        setField(term11180, term11180.getClass(), "url", "BJklinBmhN");
        setField(term11102, term11102.getClass(), "knownMove", term11180);
        setField(term11205, term11205.getClass(), "name", "IOddzvEWcl");
        setField(term11205, term11205.getClass(), "url", "bIrtpkYJWT");
        setField(term11102, term11102.getClass(), "knownMoveType", term11205);
        setField(term11230, term11230.getClass(), "name", "VuLLXpvPpZ");
        setField(term11230, term11230.getClass(), "url", "UEdzEKEEEV");
        setField(term11102, term11102.getClass(), "location", term11230);
        setField(term11102, term11102.getClass(), "minLevel", term11255);
        setField(term11102, term11102.getClass(), "minHappiness", term11257);
        setField(term11102, term11102.getClass(), "minBeauty", term11259);
        setField(term11102, term11102.getClass(), "minAffection", term11261);
        setField(term11102, term11102.getClass(), "needsOverworldRain", term11263);
        setField(term11265, term11265.getClass(), "name", "BcENaQFYSd");
        setField(term11265, term11265.getClass(), "url", "POPYycoDBy");
        setField(term11102, term11102.getClass(), "partySpecies", term11265);
        setField(term11290, term11290.getClass(), "name", "LuWMOXdAPA");
        setField(term11290, term11290.getClass(), "url", "blSffTnsOv");
        setField(term11102, term11102.getClass(), "partyType", term11290);
        setField(term11102, term11102.getClass(), "relativePhysicalStats", term11315);
        setField(term11102, term11102.getClass(), "timeOfDay", "qbUMcIvEXH");
        setField(term11329, term11329.getClass(), "name", "TVxGTjeDcu");
        setField(term11329, term11329.getClass(), "url", "ABPtcyCzkR");
        setField(term11102, term11102.getClass(), "tradeSpecies", term11329);
        setField(term11102, term11102.getClass(), "turnUpsideDown", term11354);
        term11356 = new Integer(-1381970335);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.evolutionchain.EvolutionDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term11356;
        callMethod(klass, "setMinAffection", argTypes, term11102, args);
    }

};


