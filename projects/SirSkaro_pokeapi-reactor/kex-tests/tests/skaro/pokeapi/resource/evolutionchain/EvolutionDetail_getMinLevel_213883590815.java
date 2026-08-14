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

public class EvolutionDetail_getMinLevel_213883590815 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7988;

    public EvolutionDetail_getMinLevel_213883590815() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term8039 = new Integer(-1999787419);
        Integer term8141 = new Integer(-1224443634);
        Integer term8143 = new Integer(1048451946);
        Integer term8145 = new Integer(5603560);
        Integer term8147 = new Integer(-1079020032);
        Boolean term8149 = new Boolean(true);
        Integer term8201 = new Integer(-1973791064);
        Boolean term8240 = new Boolean(false);
        term7988 = newInstance(Class.forName("skaro.pokeapi.resource.evolutionchain.EvolutionDetail"));
        Object term7989 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term8014 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term8041 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term8066 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term8091 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term8116 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term8151 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term8176 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term8215 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term7989, term7989.getClass(), "name", "sEphiduvkv");
        setField(term7989, term7989.getClass(), "url", "PbLgCSAHce");
        setField(term7988, term7988.getClass(), "item", term7989);
        setField(term8014, term8014.getClass(), "name", "NWldOLAbqk");
        setField(term8014, term8014.getClass(), "url", "qnYaYSpDwO");
        setField(term7988, term7988.getClass(), "trigger", term8014);
        setField(term7988, term7988.getClass(), "gender", term8039);
        setField(term8041, term8041.getClass(), "name", "dgbFDCdHtj");
        setField(term8041, term8041.getClass(), "url", "EKpdCBubDE");
        setField(term7988, term7988.getClass(), "heldItem", term8041);
        setField(term8066, term8066.getClass(), "name", "zMsSLTfGhl");
        setField(term8066, term8066.getClass(), "url", "bEmHScVZaQ");
        setField(term7988, term7988.getClass(), "knownMove", term8066);
        setField(term8091, term8091.getClass(), "name", "TcuXODkzBV");
        setField(term8091, term8091.getClass(), "url", "coJPjrBZNe");
        setField(term7988, term7988.getClass(), "knownMoveType", term8091);
        setField(term8116, term8116.getClass(), "name", "vMsWjuPTnO");
        setField(term8116, term8116.getClass(), "url", "zHvfKaOstO");
        setField(term7988, term7988.getClass(), "location", term8116);
        setField(term7988, term7988.getClass(), "minLevel", term8141);
        setField(term7988, term7988.getClass(), "minHappiness", term8143);
        setField(term7988, term7988.getClass(), "minBeauty", term8145);
        setField(term7988, term7988.getClass(), "minAffection", term8147);
        setField(term7988, term7988.getClass(), "needsOverworldRain", term8149);
        setField(term8151, term8151.getClass(), "name", "tOszriqETr");
        setField(term8151, term8151.getClass(), "url", "ncSPTkhKjO");
        setField(term7988, term7988.getClass(), "partySpecies", term8151);
        setField(term8176, term8176.getClass(), "name", "jcWKHRWhyj");
        setField(term8176, term8176.getClass(), "url", "nrQjODRMLD");
        setField(term7988, term7988.getClass(), "partyType", term8176);
        setField(term7988, term7988.getClass(), "relativePhysicalStats", term8201);
        setField(term7988, term7988.getClass(), "timeOfDay", "PNoWXrsFic");
        setField(term8215, term8215.getClass(), "name", "QZBHZqZope");
        setField(term8215, term8215.getClass(), "url", "VBUahCvyxC");
        setField(term7988, term7988.getClass(), "tradeSpecies", term8215);
        setField(term7988, term7988.getClass(), "turnUpsideDown", term8240);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.evolutionchain.EvolutionDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMinLevel", argTypes, term7988, args);
    }

};


