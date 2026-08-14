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

public class MoveMetaData_getHealing_169298778315 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3544;

    public MoveMetaData_getHealing_169298778315() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term3595 = new Integer(-1310015129);
        Integer term3597 = new Integer(-2104981311);
        Integer term3599 = new Integer(-571169753);
        Integer term3601 = new Integer(318591690);
        Integer term3603 = new Integer(-165587447);
        Integer term3605 = new Integer(-1347358701);
        Integer term3607 = new Integer(806595993);
        Integer term3609 = new Integer(548228925);
        Integer term3611 = new Integer(-749861210);
        Integer term3613 = new Integer(1694224101);
        term3544 = newInstance(Class.forName("skaro.pokeapi.resource.move.MoveMetaData"));
        Object term3545 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term3570 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term3545, term3545.getClass(), "name", "HHQcYMSBVc");
        setField(term3545, term3545.getClass(), "url", "wdoqITnaAP");
        setField(term3544, term3544.getClass(), "ailment", term3545);
        setField(term3570, term3570.getClass(), "name", "rIPMBcrNqB");
        setField(term3570, term3570.getClass(), "url", "UDaboHZHhz");
        setField(term3544, term3544.getClass(), "category", term3570);
        setField(term3544, term3544.getClass(), "minHits", term3595);
        setField(term3544, term3544.getClass(), "maxHits", term3597);
        setField(term3544, term3544.getClass(), "minTurns", term3599);
        setField(term3544, term3544.getClass(), "maxTurns", term3601);
        setField(term3544, term3544.getClass(), "drain", term3603);
        setField(term3544, term3544.getClass(), "healing", term3605);
        setField(term3544, term3544.getClass(), "critRate", term3607);
        setField(term3544, term3544.getClass(), "ailmentChance", term3609);
        setField(term3544, term3544.getClass(), "flinchChance", term3611);
        setField(term3544, term3544.getClass(), "statChance", term3613);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.move.MoveMetaData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getHealing", argTypes, term3544, args);
    }

};


