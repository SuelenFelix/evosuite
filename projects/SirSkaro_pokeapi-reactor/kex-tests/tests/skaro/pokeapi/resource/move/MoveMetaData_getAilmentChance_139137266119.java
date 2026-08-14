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

public class MoveMetaData_getAilmentChance_139137266119 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3992;

    public MoveMetaData_getAilmentChance_139137266119() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term4043 = new Integer(57189932);
        Integer term4045 = new Integer(1460722225);
        Integer term4047 = new Integer(1743224434);
        Integer term4049 = new Integer(842904495);
        Integer term4051 = new Integer(1008080511);
        Integer term4053 = new Integer(1935707624);
        Integer term4055 = new Integer(1507074215);
        Integer term4057 = new Integer(-282881827);
        Integer term4059 = new Integer(-1183353915);
        Integer term4061 = new Integer(-420030135);
        term3992 = newInstance(Class.forName("skaro.pokeapi.resource.move.MoveMetaData"));
        Object term3993 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term4018 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term3993, term3993.getClass(), "name", "TXyHhqeCjR");
        setField(term3993, term3993.getClass(), "url", "lZIgPZPgTu");
        setField(term3992, term3992.getClass(), "ailment", term3993);
        setField(term4018, term4018.getClass(), "name", "iuCxnHGMoW");
        setField(term4018, term4018.getClass(), "url", "GPSEWEDSTo");
        setField(term3992, term3992.getClass(), "category", term4018);
        setField(term3992, term3992.getClass(), "minHits", term4043);
        setField(term3992, term3992.getClass(), "maxHits", term4045);
        setField(term3992, term3992.getClass(), "minTurns", term4047);
        setField(term3992, term3992.getClass(), "maxTurns", term4049);
        setField(term3992, term3992.getClass(), "drain", term4051);
        setField(term3992, term3992.getClass(), "healing", term4053);
        setField(term3992, term3992.getClass(), "critRate", term4055);
        setField(term3992, term3992.getClass(), "ailmentChance", term4057);
        setField(term3992, term3992.getClass(), "flinchChance", term4059);
        setField(term3992, term3992.getClass(), "statChance", term4061);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.move.MoveMetaData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAilmentChance", argTypes, term3992, args);
    }

};


