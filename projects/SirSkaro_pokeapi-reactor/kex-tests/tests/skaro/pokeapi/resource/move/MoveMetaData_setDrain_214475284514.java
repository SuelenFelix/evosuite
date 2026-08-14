package skaro.pokeapi.resource.move;

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
import static skaro.pokeapi.resource.move.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Integer;

public class MoveMetaData_setDrain_214475284514 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3431;
     Object term3502;

    public MoveMetaData_setDrain_214475284514() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term3482 = new Integer(-1882480155);
        Integer term3484 = new Integer(-1410220680);
        Integer term3486 = new Integer(389427431);
        Integer term3488 = new Integer(-1945706126);
        Integer term3490 = new Integer(1152356969);
        Integer term3492 = new Integer(-1667990367);
        Integer term3494 = new Integer(-1214628358);
        Integer term3496 = new Integer(1102721075);
        Integer term3498 = new Integer(-426764678);
        Integer term3500 = new Integer(-1222614956);
        term3431 = newInstance(Class.forName("skaro.pokeapi.resource.move.MoveMetaData"));
        Object term3432 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term3457 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term3432, term3432.getClass(), "name", "IlvgFINwIa");
        setField(term3432, term3432.getClass(), "url", "GEJABPlHSI");
        setField(term3431, term3431.getClass(), "ailment", term3432);
        setField(term3457, term3457.getClass(), "name", "aQFUvuaYxd");
        setField(term3457, term3457.getClass(), "url", "zNFLXMifnS");
        setField(term3431, term3431.getClass(), "category", term3457);
        setField(term3431, term3431.getClass(), "minHits", term3482);
        setField(term3431, term3431.getClass(), "maxHits", term3484);
        setField(term3431, term3431.getClass(), "minTurns", term3486);
        setField(term3431, term3431.getClass(), "maxTurns", term3488);
        setField(term3431, term3431.getClass(), "drain", term3490);
        setField(term3431, term3431.getClass(), "healing", term3492);
        setField(term3431, term3431.getClass(), "critRate", term3494);
        setField(term3431, term3431.getClass(), "ailmentChance", term3496);
        setField(term3431, term3431.getClass(), "flinchChance", term3498);
        setField(term3431, term3431.getClass(), "statChance", term3500);
        term3502 = new Integer(-1870495012);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.move.MoveMetaData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term3502;
        callMethod(klass, "setDrain", argTypes, term3431, args);
    }

};


