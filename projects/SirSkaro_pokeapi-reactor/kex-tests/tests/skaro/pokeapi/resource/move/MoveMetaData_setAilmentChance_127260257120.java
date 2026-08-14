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

public class MoveMetaData_setAilmentChance_127260257120 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4103;
     Object term4174;

    public MoveMetaData_setAilmentChance_127260257120() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term4154 = new Integer(267763294);
        Integer term4156 = new Integer(-1497710478);
        Integer term4158 = new Integer(49950830);
        Integer term4160 = new Integer(-525257914);
        Integer term4162 = new Integer(147209682);
        Integer term4164 = new Integer(34470066);
        Integer term4166 = new Integer(2058711405);
        Integer term4168 = new Integer(1743683601);
        Integer term4170 = new Integer(-945116798);
        Integer term4172 = new Integer(1593461795);
        term4103 = newInstance(Class.forName("skaro.pokeapi.resource.move.MoveMetaData"));
        Object term4104 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term4129 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term4104, term4104.getClass(), "name", "RCOqfVsRHt");
        setField(term4104, term4104.getClass(), "url", "TSyCeEZPaT");
        setField(term4103, term4103.getClass(), "ailment", term4104);
        setField(term4129, term4129.getClass(), "name", "JeZFtaqkzW");
        setField(term4129, term4129.getClass(), "url", "vOVuNSCCLe");
        setField(term4103, term4103.getClass(), "category", term4129);
        setField(term4103, term4103.getClass(), "minHits", term4154);
        setField(term4103, term4103.getClass(), "maxHits", term4156);
        setField(term4103, term4103.getClass(), "minTurns", term4158);
        setField(term4103, term4103.getClass(), "maxTurns", term4160);
        setField(term4103, term4103.getClass(), "drain", term4162);
        setField(term4103, term4103.getClass(), "healing", term4164);
        setField(term4103, term4103.getClass(), "critRate", term4166);
        setField(term4103, term4103.getClass(), "ailmentChance", term4168);
        setField(term4103, term4103.getClass(), "flinchChance", term4170);
        setField(term4103, term4103.getClass(), "statChance", term4172);
        term4174 = new Integer(515182546);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.move.MoveMetaData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term4174;
        callMethod(klass, "setAilmentChance", argTypes, term4103, args);
    }

};


