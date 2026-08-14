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

public class PastMoveStatValues_getPp_8938796987 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term717;

    public PastMoveStatValues_getPp_8938796987() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term718 = new Integer(865208305);
        Integer term720 = new Integer(-1275173084);
        Integer term722 = new Integer(-244121226);
        Integer term724 = new Integer(-203030934);
        Object term728 = newInstance(Class.forName("skaro.pokeapi.resource.VerboseEffect"));
        Object term731 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term728, term728.getClass(), "effect", "");
        setField(term728, term728.getClass(), "shortEffect", "");
        setField(term731, term731.getClass(), "name", null);
        setField(term731, term731.getClass(), "url", null);
        setField(term728, term728.getClass(), "language", term731);
        Object term732 = newInstance(Class.forName("skaro.pokeapi.resource.VerboseEffect"));
        Object term735 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term732, term732.getClass(), "effect", "");
        setField(term732, term732.getClass(), "shortEffect", "");
        setField(term735, term735.getClass(), "name", null);
        setField(term735, term735.getClass(), "url", null);
        setField(term732, term732.getClass(), "language", term735);
        ArrayList term726 = new ArrayList();
        ((ArrayList) term726).add(term728);
        ((ArrayList) term726).add(term732);
        term717 = newInstance(Class.forName("skaro.pokeapi.resource.move.PastMoveStatValues"));
        Object term738 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term763 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term717, term717.getClass(), "accuracy", term718);
        setField(term717, term717.getClass(), "effectChance", term720);
        setField(term717, term717.getClass(), "power", term722);
        setField(term717, term717.getClass(), "pp", term724);
        setField(term717, term717.getClass(), "effectEntries", term726);
        setField(term738, term738.getClass(), "name", "AdxvLJhNLe");
        setField(term738, term738.getClass(), "url", "lHfTrWKMPk");
        setField(term717, term717.getClass(), "type", term738);
        setField(term763, term763.getClass(), "name", "JDaAnsVTGV");
        setField(term763, term763.getClass(), "url", "mLUZFTfjle");
        setField(term717, term717.getClass(), "versionGroup", term763);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.move.PastMoveStatValues");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPp", argTypes, term717, args);
    }

};


