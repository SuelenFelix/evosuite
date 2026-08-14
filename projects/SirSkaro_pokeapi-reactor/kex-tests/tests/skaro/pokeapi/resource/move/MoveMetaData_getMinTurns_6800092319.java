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

public class MoveMetaData_getMinTurns_6800092319 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2872;

    public MoveMetaData_getMinTurns_6800092319() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term2923 = new Integer(-1565502840);
        Integer term2925 = new Integer(344323424);
        Integer term2927 = new Integer(9726679);
        Integer term2929 = new Integer(-25637976);
        Integer term2931 = new Integer(1555897383);
        Integer term2933 = new Integer(202001407);
        Integer term2935 = new Integer(158873461);
        Integer term2937 = new Integer(-430151637);
        Integer term2939 = new Integer(-1697741339);
        Integer term2941 = new Integer(98922530);
        term2872 = newInstance(Class.forName("skaro.pokeapi.resource.move.MoveMetaData"));
        Object term2873 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term2898 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term2873, term2873.getClass(), "name", "EKjQdtKxAM");
        setField(term2873, term2873.getClass(), "url", "TXZAIPQJHt");
        setField(term2872, term2872.getClass(), "ailment", term2873);
        setField(term2898, term2898.getClass(), "name", "DIbeDHICho");
        setField(term2898, term2898.getClass(), "url", "dJGPlmSRnz");
        setField(term2872, term2872.getClass(), "category", term2898);
        setField(term2872, term2872.getClass(), "minHits", term2923);
        setField(term2872, term2872.getClass(), "maxHits", term2925);
        setField(term2872, term2872.getClass(), "minTurns", term2927);
        setField(term2872, term2872.getClass(), "maxTurns", term2929);
        setField(term2872, term2872.getClass(), "drain", term2931);
        setField(term2872, term2872.getClass(), "healing", term2933);
        setField(term2872, term2872.getClass(), "critRate", term2935);
        setField(term2872, term2872.getClass(), "ailmentChance", term2937);
        setField(term2872, term2872.getClass(), "flinchChance", term2939);
        setField(term2872, term2872.getClass(), "statChance", term2941);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.move.MoveMetaData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMinTurns", argTypes, term2872, args);
    }

};


