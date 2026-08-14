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

public class MoveMetaData_setMaxHits_21041543438 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2759;
     Object term2830;

    public MoveMetaData_setMaxHits_21041543438() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term2810 = new Integer(538259104);
        Integer term2812 = new Integer(96566506);
        Integer term2814 = new Integer(-343325701);
        Integer term2816 = new Integer(107945604);
        Integer term2818 = new Integer(-1963464809);
        Integer term2820 = new Integer(71190297);
        Integer term2822 = new Integer(1202361360);
        Integer term2824 = new Integer(-2015048153);
        Integer term2826 = new Integer(-2063457669);
        Integer term2828 = new Integer(-1222006000);
        term2759 = newInstance(Class.forName("skaro.pokeapi.resource.move.MoveMetaData"));
        Object term2760 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term2785 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term2760, term2760.getClass(), "name", "zNdorvdUgu");
        setField(term2760, term2760.getClass(), "url", "oPxuZbkYio");
        setField(term2759, term2759.getClass(), "ailment", term2760);
        setField(term2785, term2785.getClass(), "name", "vKitydDVnM");
        setField(term2785, term2785.getClass(), "url", "urCiQnUFBM");
        setField(term2759, term2759.getClass(), "category", term2785);
        setField(term2759, term2759.getClass(), "minHits", term2810);
        setField(term2759, term2759.getClass(), "maxHits", term2812);
        setField(term2759, term2759.getClass(), "minTurns", term2814);
        setField(term2759, term2759.getClass(), "maxTurns", term2816);
        setField(term2759, term2759.getClass(), "drain", term2818);
        setField(term2759, term2759.getClass(), "healing", term2820);
        setField(term2759, term2759.getClass(), "critRate", term2822);
        setField(term2759, term2759.getClass(), "ailmentChance", term2824);
        setField(term2759, term2759.getClass(), "flinchChance", term2826);
        setField(term2759, term2759.getClass(), "statChance", term2828);
        term2830 = new Integer(2095798786);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.move.MoveMetaData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term2830;
        callMethod(klass, "setMaxHits", argTypes, term2759, args);
    }

};


