package dibujo;

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
import static dibujo.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Object;

public class Main_fill_17296317042 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term688;
     Object term690;
     Object term692;
     Object term826;

    public Main_fill_17296317042() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term688 = new Integer(590364439);
        term690 = new Integer(865208305);
        term692 = (Object[]) newObjectArray(Array.newInstance(Class.forName("dibujo.Position"), 0).getClass(), 5);
        Object[] term693 = (Object[]) newArray("dibujo.Position", 2);
        Object term694 = newInstance(Class.forName("dibujo.Position"));
        Object term710 = newInstance(Class.forName("dibujo.Position"));
        Object[] term726 = (Object[]) newArray("dibujo.Position", 3);
        Object term727 = newInstance(Class.forName("dibujo.Position"));
        Object term743 = newInstance(Class.forName("dibujo.Position"));
        Object term759 = newInstance(Class.forName("dibujo.Position"));
        Object[] term775 = (Object[]) newArray("dibujo.Position", 1);
        Object term776 = newInstance(Class.forName("dibujo.Position"));
        Object[] term792 = (Object[]) newArray("dibujo.Position", 0);
        Object[] term793 = (Object[]) newArray("dibujo.Position", 2);
        Object term794 = newInstance(Class.forName("dibujo.Position"));
        Object term810 = newInstance(Class.forName("dibujo.Position"));
        setIntField(term694, term694.getClass(), "x", -1275173084);
        setIntField(term694, term694.getClass(), "y", -244121226);
        setBooleanField(term694, term694.getClass(), "filled", false);
        setField(term694, term694.getClass(), "color", "MxlszYVzRf");
        setElement(term693, 0, term694);
        setIntField(term710, term710.getClass(), "x", -203030934);
        setIntField(term710, term710.getClass(), "y", -1179120542);
        setBooleanField(term710, term710.getClass(), "filled", false);
        setField(term710, term710.getClass(), "color", "LQFpaHEwXR");
        setElement(term693, 1, term710);
        setElement(term692, 0, term693);
        setIntField(term727, term727.getClass(), "x", -73683645);
        setIntField(term727, term727.getClass(), "y", -226514366);
        setBooleanField(term727, term727.getClass(), "filled", true);
        setField(term727, term727.getClass(), "color", "oVcInYnLWB");
        setElement(term726, 0, term727);
        setIntField(term743, term743.getClass(), "x", 1193880199);
        setIntField(term743, term743.getClass(), "y", -1087774327);
        setBooleanField(term743, term743.getClass(), "filled", true);
        setField(term743, term743.getClass(), "color", "aJlieCFVtF");
        setElement(term726, 1, term743);
        setIntField(term759, term759.getClass(), "x", -1530420153);
        setIntField(term759, term759.getClass(), "y", -469968304);
        setBooleanField(term759, term759.getClass(), "filled", true);
        setField(term759, term759.getClass(), "color", "ZiaGIbnzTs");
        setElement(term726, 2, term759);
        setElement(term692, 1, term726);
        setIntField(term776, term776.getClass(), "x", -1145578966);
        setIntField(term776, term776.getClass(), "y", 679763016);
        setBooleanField(term776, term776.getClass(), "filled", true);
        setField(term776, term776.getClass(), "color", "tbcdzjIfER");
        setElement(term775, 0, term776);
        setElement(term692, 2, term775);
        setElement(term692, 3, term792);
        setIntField(term794, term794.getClass(), "x", 1962444399);
        setIntField(term794, term794.getClass(), "y", 767834723);
        setBooleanField(term794, term794.getClass(), "filled", true);
        setField(term794, term794.getClass(), "color", "HyxfbSQYBe");
        setElement(term793, 0, term794);
        setIntField(term810, term810.getClass(), "x", -602026508);
        setIntField(term810, term810.getClass(), "y", -157887805);
        setBooleanField(term810, term810.getClass(), "filled", false);
        setField(term810, term810.getClass(), "color", "pCTimMblYc");
        setElement(term793, 1, term810);
        setElement(term692, 4, term793);
        term826 = newInstance(Class.forName("dibujo.Position"));
        setIntField(term826, term826.getClass(), "x", 1876565163);
        setIntField(term826, term826.getClass(), "y", -817164822);
        setBooleanField(term826, term826.getClass(), "filled", false);
        setField(term826, term826.getClass(), "color", "hNxWaHcfhY");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dibujo.Main");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = Array.newInstance(Array.newInstance(Class.forName("dibujo.Position"), 0).getClass(), 0).getClass();
        argTypes[3] = Class.forName("dibujo.Position");
        argTypes[4] = Class.forName("java.lang.String");
        Object[] args = new Object[5];
        args[0] = term688;
        args[1] = term690;
        args[2] = term692;
        args[3] = term826;
        args[4] = "RkybSrpybU";
        callMethod(klass, "fill", argTypes, null, args);
    }

};


