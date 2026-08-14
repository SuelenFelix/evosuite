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

public class MoveMetaData_setMinHits_13316757696 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2535;
     Object term2606;

    public MoveMetaData_setMinHits_13316757696() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term2586 = new Integer(-341962980);
        Integer term2588 = new Integer(1532716628);
        Integer term2590 = new Integer(-1801760683);
        Integer term2592 = new Integer(1141317871);
        Integer term2594 = new Integer(890669485);
        Integer term2596 = new Integer(691577392);
        Integer term2598 = new Integer(-893623680);
        Integer term2600 = new Integer(-1963434938);
        Integer term2602 = new Integer(906181092);
        Integer term2604 = new Integer(1045657203);
        term2535 = newInstance(Class.forName("skaro.pokeapi.resource.move.MoveMetaData"));
        Object term2536 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term2561 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term2536, term2536.getClass(), "name", "NBrvVzvQHe");
        setField(term2536, term2536.getClass(), "url", "FjOiNAfBOc");
        setField(term2535, term2535.getClass(), "ailment", term2536);
        setField(term2561, term2561.getClass(), "name", "iCCsaLHohG");
        setField(term2561, term2561.getClass(), "url", "NJhGgctbdj");
        setField(term2535, term2535.getClass(), "category", term2561);
        setField(term2535, term2535.getClass(), "minHits", term2586);
        setField(term2535, term2535.getClass(), "maxHits", term2588);
        setField(term2535, term2535.getClass(), "minTurns", term2590);
        setField(term2535, term2535.getClass(), "maxTurns", term2592);
        setField(term2535, term2535.getClass(), "drain", term2594);
        setField(term2535, term2535.getClass(), "healing", term2596);
        setField(term2535, term2535.getClass(), "critRate", term2598);
        setField(term2535, term2535.getClass(), "ailmentChance", term2600);
        setField(term2535, term2535.getClass(), "flinchChance", term2602);
        setField(term2535, term2535.getClass(), "statChance", term2604);
        term2606 = new Integer(1386130016);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.move.MoveMetaData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term2606;
        callMethod(klass, "setMinHits", argTypes, term2535, args);
    }

};


