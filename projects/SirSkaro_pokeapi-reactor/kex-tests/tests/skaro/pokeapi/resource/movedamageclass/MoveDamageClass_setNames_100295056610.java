package skaro.pokeapi.resource.movedamageclass;

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
import static skaro.pokeapi.resource.movedamageclass.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.util.ArrayList;
import java.lang.Object;
import java.util.LinkedList;

public class MoveDamageClass_setNames_100295056610 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term550;
     Object term613;

    public MoveDamageClass_setNames_100295056610() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term551 = new Integer(1725571209);
        Object term567 = newInstance(Class.forName("skaro.pokeapi.resource.Description"));
        Object term569 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term567, term567.getClass(), "description", "");
        setField(term569, term569.getClass(), "name", null);
        setField(term569, term569.getClass(), "url", null);
        setField(term567, term567.getClass(), "language", term569);
        Object term570 = newInstance(Class.forName("skaro.pokeapi.resource.Description"));
        Object term572 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term570, term570.getClass(), "description", "");
        setField(term572, term572.getClass(), "name", null);
        setField(term572, term572.getClass(), "url", null);
        setField(term570, term570.getClass(), "language", term572);
        Object term573 = newInstance(Class.forName("skaro.pokeapi.resource.Description"));
        Object term575 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term573, term573.getClass(), "description", "");
        setField(term575, term575.getClass(), "name", null);
        setField(term575, term575.getClass(), "url", null);
        setField(term573, term573.getClass(), "language", term575);
        Object term576 = newInstance(Class.forName("skaro.pokeapi.resource.Description"));
        Object term578 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term576, term576.getClass(), "description", "");
        setField(term578, term578.getClass(), "name", null);
        setField(term578, term578.getClass(), "url", null);
        setField(term576, term576.getClass(), "language", term578);
        Object term579 = newInstance(Class.forName("skaro.pokeapi.resource.Description"));
        Object term581 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term579, term579.getClass(), "description", "");
        setField(term581, term581.getClass(), "name", null);
        setField(term581, term581.getClass(), "url", null);
        setField(term579, term579.getClass(), "language", term581);
        Object term582 = newInstance(Class.forName("skaro.pokeapi.resource.Description"));
        Object term584 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term582, term582.getClass(), "description", "");
        setField(term584, term584.getClass(), "name", null);
        setField(term584, term584.getClass(), "url", null);
        setField(term582, term582.getClass(), "language", term584);
        Object term585 = newInstance(Class.forName("skaro.pokeapi.resource.Description"));
        Object term587 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term585, term585.getClass(), "description", "");
        setField(term587, term587.getClass(), "name", null);
        setField(term587, term587.getClass(), "url", null);
        setField(term585, term585.getClass(), "language", term587);
        ArrayList term565 = new ArrayList();
        ((ArrayList) term565).add(term567);
        ((ArrayList) term565).add(term570);
        ((ArrayList) term565).add(term573);
        ((ArrayList) term565).add(term576);
        ((ArrayList) term565).add(term579);
        ((ArrayList) term565).add(term582);
        ((ArrayList) term565).add(term585);
        ArrayList term590 = new ArrayList();
        Object term596 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term598 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term596, term596.getClass(), "name", "");
        setField(term598, term598.getClass(), "name", null);
        setField(term598, term598.getClass(), "url", null);
        setField(term596, term596.getClass(), "language", term598);
        Object term599 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term601 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term599, term599.getClass(), "name", "");
        setField(term601, term601.getClass(), "name", null);
        setField(term601, term601.getClass(), "url", null);
        setField(term599, term599.getClass(), "language", term601);
        Object term602 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term604 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term602, term602.getClass(), "name", "");
        setField(term604, term604.getClass(), "name", null);
        setField(term604, term604.getClass(), "url", null);
        setField(term602, term602.getClass(), "language", term604);
        Object term605 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        setField(term605, term605.getClass(), "name", "");
        setField(term605, term605.getClass(), "language", term598);
        Object term607 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        setField(term607, term607.getClass(), "name", "");
        setField(term607, term607.getClass(), "language", term601);
        Object term609 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        setField(term609, term609.getClass(), "name", "");
        setField(term609, term609.getClass(), "language", term569);
        ArrayList term594 = new ArrayList();
        ((ArrayList) term594).add(term596);
        ((ArrayList) term594).add(term599);
        ((ArrayList) term594).add(term602);
        ((ArrayList) term594).add(term605);
        ((ArrayList) term594).add(term607);
        ((ArrayList) term594).add(term609);
        term550 = newInstance(Class.forName("skaro.pokeapi.resource.movedamageclass.MoveDamageClass"));
        setField(term550, term550.getClass(), "id", term551);
        setField(term550, term550.getClass(), "name", "wzsPSPcRdj");
        setField(term550, term550.getClass(), "descriptions", term565);
        setField(term550, term550.getClass(), "moves", term590);
        setField(term550, term550.getClass(), "names", term594);
        term613 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.movedamageclass.MoveDamageClass");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term613;
        callMethod(klass, "setNames", argTypes, term550, args);
    }

};


