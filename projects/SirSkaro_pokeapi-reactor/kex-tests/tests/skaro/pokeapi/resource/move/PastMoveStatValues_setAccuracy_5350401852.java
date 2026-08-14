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
import java.lang.Integer;
import java.util.ArrayList;
import java.lang.Object;

public class PastMoveStatValues_setAccuracy_5350401852 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term124;
     Object term203;

    public PastMoveStatValues_setAccuracy_5350401852() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term125 = new Integer(-1922583790);
        Integer term127 = new Integer(-616727354);
        Integer term129 = new Integer(-1955890973);
        Integer term131 = new Integer(-2038273078);
        Object term135 = newInstance(Class.forName("skaro.pokeapi.resource.VerboseEffect"));
        Object term138 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term135, term135.getClass(), "effect", "");
        setField(term135, term135.getClass(), "shortEffect", "");
        setField(term138, term138.getClass(), "name", null);
        setField(term138, term138.getClass(), "url", null);
        setField(term135, term135.getClass(), "language", term138);
        Object term139 = newInstance(Class.forName("skaro.pokeapi.resource.VerboseEffect"));
        Object term142 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term139, term139.getClass(), "effect", "");
        setField(term139, term139.getClass(), "shortEffect", "");
        setField(term142, term142.getClass(), "name", null);
        setField(term142, term142.getClass(), "url", null);
        setField(term139, term139.getClass(), "language", term142);
        Object term143 = newInstance(Class.forName("skaro.pokeapi.resource.VerboseEffect"));
        Object term146 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term143, term143.getClass(), "effect", "");
        setField(term143, term143.getClass(), "shortEffect", "");
        setField(term146, term146.getClass(), "name", null);
        setField(term146, term146.getClass(), "url", null);
        setField(term143, term143.getClass(), "language", term146);
        Object term147 = newInstance(Class.forName("skaro.pokeapi.resource.VerboseEffect"));
        Object term150 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term147, term147.getClass(), "effect", "");
        setField(term147, term147.getClass(), "shortEffect", "");
        setField(term150, term150.getClass(), "name", null);
        setField(term150, term150.getClass(), "url", null);
        setField(term147, term147.getClass(), "language", term150);
        ArrayList term133 = new ArrayList();
        ((ArrayList) term133).add(term135);
        ((ArrayList) term133).add(term139);
        ((ArrayList) term133).add(term143);
        ((ArrayList) term133).add(term147);
        term124 = newInstance(Class.forName("skaro.pokeapi.resource.move.PastMoveStatValues"));
        Object term153 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term178 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term124, term124.getClass(), "accuracy", term125);
        setField(term124, term124.getClass(), "effectChance", term127);
        setField(term124, term124.getClass(), "power", term129);
        setField(term124, term124.getClass(), "pp", term131);
        setField(term124, term124.getClass(), "effectEntries", term133);
        setField(term153, term153.getClass(), "name", "wSQxaModmm");
        setField(term153, term153.getClass(), "url", "UlajhuVLaP");
        setField(term124, term124.getClass(), "type", term153);
        setField(term178, term178.getClass(), "name", "gGSMzuGICf");
        setField(term178, term178.getClass(), "url", "hxCBltsObl");
        setField(term124, term124.getClass(), "versionGroup", term178);
        term203 = new Integer(1227103734);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.move.PastMoveStatValues");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term203;
        callMethod(klass, "setAccuracy", argTypes, term124, args);
    }

};


