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

public class MoveMetaData_getCritRate_75159808517 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3768;

    public MoveMetaData_getCritRate_75159808517() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term3819 = new Integer(388157121);
        Integer term3821 = new Integer(1684998508);
        Integer term3823 = new Integer(-1476644457);
        Integer term3825 = new Integer(1270666529);
        Integer term3827 = new Integer(-1146679443);
        Integer term3829 = new Integer(-860131894);
        Integer term3831 = new Integer(-1022990421);
        Integer term3833 = new Integer(1045547089);
        Integer term3835 = new Integer(-1122880881);
        Integer term3837 = new Integer(-542712742);
        term3768 = newInstance(Class.forName("skaro.pokeapi.resource.move.MoveMetaData"));
        Object term3769 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term3794 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term3769, term3769.getClass(), "name", "pumvwBWvpy");
        setField(term3769, term3769.getClass(), "url", "HwLHeGLyhe");
        setField(term3768, term3768.getClass(), "ailment", term3769);
        setField(term3794, term3794.getClass(), "name", "RDnkgWkcbz");
        setField(term3794, term3794.getClass(), "url", "IBpaxltauX");
        setField(term3768, term3768.getClass(), "category", term3794);
        setField(term3768, term3768.getClass(), "minHits", term3819);
        setField(term3768, term3768.getClass(), "maxHits", term3821);
        setField(term3768, term3768.getClass(), "minTurns", term3823);
        setField(term3768, term3768.getClass(), "maxTurns", term3825);
        setField(term3768, term3768.getClass(), "drain", term3827);
        setField(term3768, term3768.getClass(), "healing", term3829);
        setField(term3768, term3768.getClass(), "critRate", term3831);
        setField(term3768, term3768.getClass(), "ailmentChance", term3833);
        setField(term3768, term3768.getClass(), "flinchChance", term3835);
        setField(term3768, term3768.getClass(), "statChance", term3837);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.move.MoveMetaData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCritRate", argTypes, term3768, args);
    }

};


