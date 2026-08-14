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
import java.util.ArrayList;

public class ContestComboSets_getNormal_7870317801 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1792;

    public ContestComboSets_getNormal_7870317801() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1794 = new ArrayList();
        ArrayList term1798 = new ArrayList();
        ArrayList term1803 = new ArrayList();
        ArrayList term1807 = new ArrayList();
        term1792 = newInstance(Class.forName("skaro.pokeapi.resource.move.ContestComboSets"));
        Object term1793 = newInstance(Class.forName("skaro.pokeapi.resource.move.ContestComboDetail"));
        Object term1802 = newInstance(Class.forName("skaro.pokeapi.resource.move.ContestComboDetail"));
        setField(term1793, term1793.getClass(), "userBefore", term1794);
        setField(term1793, term1793.getClass(), "userAfter", term1798);
        setField(term1792, term1792.getClass(), "normal", term1793);
        setField(term1802, term1802.getClass(), "userBefore", term1803);
        setField(term1802, term1802.getClass(), "userAfter", term1807);
        setField(term1792, term1792.getClass(), "superb", term1802);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.move.ContestComboSets");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNormal", argTypes, term1792, args);
    }

};


