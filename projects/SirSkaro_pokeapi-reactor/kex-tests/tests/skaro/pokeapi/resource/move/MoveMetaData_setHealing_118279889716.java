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

public class MoveMetaData_setHealing_118279889716 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3655;
     Object term3726;

    public MoveMetaData_setHealing_118279889716() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term3706 = new Integer(937859191);
        Integer term3708 = new Integer(-916584829);
        Integer term3710 = new Integer(-2131181468);
        Integer term3712 = new Integer(282916351);
        Integer term3714 = new Integer(880977281);
        Integer term3716 = new Integer(371943306);
        Integer term3718 = new Integer(982388293);
        Integer term3720 = new Integer(-159494544);
        Integer term3722 = new Integer(-75206835);
        Integer term3724 = new Integer(-1618206977);
        term3655 = newInstance(Class.forName("skaro.pokeapi.resource.move.MoveMetaData"));
        Object term3656 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term3681 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term3656, term3656.getClass(), "name", "nRvKihUSPj");
        setField(term3656, term3656.getClass(), "url", "BbNeQJpYPr");
        setField(term3655, term3655.getClass(), "ailment", term3656);
        setField(term3681, term3681.getClass(), "name", "riMtzCoxNj");
        setField(term3681, term3681.getClass(), "url", "YAXkVjQZcV");
        setField(term3655, term3655.getClass(), "category", term3681);
        setField(term3655, term3655.getClass(), "minHits", term3706);
        setField(term3655, term3655.getClass(), "maxHits", term3708);
        setField(term3655, term3655.getClass(), "minTurns", term3710);
        setField(term3655, term3655.getClass(), "maxTurns", term3712);
        setField(term3655, term3655.getClass(), "drain", term3714);
        setField(term3655, term3655.getClass(), "healing", term3716);
        setField(term3655, term3655.getClass(), "critRate", term3718);
        setField(term3655, term3655.getClass(), "ailmentChance", term3720);
        setField(term3655, term3655.getClass(), "flinchChance", term3722);
        setField(term3655, term3655.getClass(), "statChance", term3724);
        term3726 = new Integer(-1747406163);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.move.MoveMetaData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term3726;
        callMethod(klass, "setHealing", argTypes, term3655, args);
    }

};


