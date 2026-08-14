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

public class MoveMetaData_getMaxHits_16806240677 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2648;

    public MoveMetaData_getMaxHits_16806240677() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term2699 = new Integer(1072005683);
        Integer term2701 = new Integer(1861318859);
        Integer term2703 = new Integer(1474524152);
        Integer term2705 = new Integer(568954359);
        Integer term2707 = new Integer(53410913);
        Integer term2709 = new Integer(-375014958);
        Integer term2711 = new Integer(1107176718);
        Integer term2713 = new Integer(480137250);
        Integer term2715 = new Integer(-341152642);
        Integer term2717 = new Integer(-2015854073);
        term2648 = newInstance(Class.forName("skaro.pokeapi.resource.move.MoveMetaData"));
        Object term2649 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term2674 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term2649, term2649.getClass(), "name", "MYWYUeLGOp");
        setField(term2649, term2649.getClass(), "url", "tsTGdgQYUL");
        setField(term2648, term2648.getClass(), "ailment", term2649);
        setField(term2674, term2674.getClass(), "name", "TtGbVmKcnX");
        setField(term2674, term2674.getClass(), "url", "GJVkUrCVdD");
        setField(term2648, term2648.getClass(), "category", term2674);
        setField(term2648, term2648.getClass(), "minHits", term2699);
        setField(term2648, term2648.getClass(), "maxHits", term2701);
        setField(term2648, term2648.getClass(), "minTurns", term2703);
        setField(term2648, term2648.getClass(), "maxTurns", term2705);
        setField(term2648, term2648.getClass(), "drain", term2707);
        setField(term2648, term2648.getClass(), "healing", term2709);
        setField(term2648, term2648.getClass(), "critRate", term2711);
        setField(term2648, term2648.getClass(), "ailmentChance", term2713);
        setField(term2648, term2648.getClass(), "flinchChance", term2715);
        setField(term2648, term2648.getClass(), "statChance", term2717);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.move.MoveMetaData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMaxHits", argTypes, term2648, args);
    }

};


