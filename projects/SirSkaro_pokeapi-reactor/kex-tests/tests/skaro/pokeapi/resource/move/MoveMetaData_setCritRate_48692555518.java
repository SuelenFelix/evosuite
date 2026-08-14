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

public class MoveMetaData_setCritRate_48692555518 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3879;
     Object term3950;

    public MoveMetaData_setCritRate_48692555518() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term3930 = new Integer(-1254072822);
        Integer term3932 = new Integer(-1111249833);
        Integer term3934 = new Integer(-1692331299);
        Integer term3936 = new Integer(479531250);
        Integer term3938 = new Integer(1320570890);
        Integer term3940 = new Integer(-130649791);
        Integer term3942 = new Integer(534834644);
        Integer term3944 = new Integer(1959097203);
        Integer term3946 = new Integer(-209654048);
        Integer term3948 = new Integer(477625804);
        term3879 = newInstance(Class.forName("skaro.pokeapi.resource.move.MoveMetaData"));
        Object term3880 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term3905 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term3880, term3880.getClass(), "name", "hePqROaplw");
        setField(term3880, term3880.getClass(), "url", "PJcSNDruWd");
        setField(term3879, term3879.getClass(), "ailment", term3880);
        setField(term3905, term3905.getClass(), "name", "VVNNlAePXF");
        setField(term3905, term3905.getClass(), "url", "jnwVnmKAFv");
        setField(term3879, term3879.getClass(), "category", term3905);
        setField(term3879, term3879.getClass(), "minHits", term3930);
        setField(term3879, term3879.getClass(), "maxHits", term3932);
        setField(term3879, term3879.getClass(), "minTurns", term3934);
        setField(term3879, term3879.getClass(), "maxTurns", term3936);
        setField(term3879, term3879.getClass(), "drain", term3938);
        setField(term3879, term3879.getClass(), "healing", term3940);
        setField(term3879, term3879.getClass(), "critRate", term3942);
        setField(term3879, term3879.getClass(), "ailmentChance", term3944);
        setField(term3879, term3879.getClass(), "flinchChance", term3946);
        setField(term3879, term3879.getClass(), "statChance", term3948);
        term3950 = new Integer(252575029);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.move.MoveMetaData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term3950;
        callMethod(klass, "setCritRate", argTypes, term3879, args);
    }

};


