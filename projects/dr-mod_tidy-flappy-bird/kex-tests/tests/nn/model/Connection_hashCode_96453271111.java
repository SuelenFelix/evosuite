package nn.model;

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
import static nn.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;
import java.util.ArrayList;

public class Connection_hashCode_96453271111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2625;

    public Connection_hashCode_96453271111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2674 = Class.forName((String) "nn.model.Type");
        Field term2673 = ((Class) term2674).getDeclaredField((String) "OUTPUT");
        ((Field) term2673).setAccessible(true);
        Object enum21 = ((Field) term2673).get((Object) null);
        Object term2640 = newInstance(Class.forName("nn.model.Connection"));
        setField(term2640, term2640.getClass(), "in", null);
        setField(term2640, term2640.getClass(), "out", null);
        setFloatField(term2640, term2640.getClass(), "weight", 0.24759698F);
        setBooleanField(term2640, term2640.getClass(), "expressed", false);
        setIntField(term2640, term2640.getClass(), "innovation", -1945706126);
        Object term2644 = newInstance(Class.forName("nn.model.Connection"));
        setField(term2644, term2644.getClass(), "in", null);
        setField(term2644, term2644.getClass(), "out", null);
        setFloatField(term2644, term2644.getClass(), "weight", 0.07802445F);
        setBooleanField(term2644, term2644.getClass(), "expressed", false);
        setIntField(term2644, term2644.getClass(), "innovation", 497269071);
        Object term2648 = newInstance(Class.forName("nn.model.Connection"));
        setField(term2648, term2648.getClass(), "in", null);
        setField(term2648, term2648.getClass(), "out", null);
        setFloatField(term2648, term2648.getClass(), "weight", 0.0F);
        setBooleanField(term2648, term2648.getClass(), "expressed", false);
        setIntField(term2648, term2648.getClass(), "innovation", 0);
        ArrayList term2638 = new ArrayList();
        ((ArrayList) term2638).add(term2640);
        ((ArrayList) term2638).add(term2644);
        ((ArrayList) term2638).add(term2644);
        ((ArrayList) term2638).add(term2640);
        ((ArrayList) term2638).add(term2648);
        Object term2659 = newInstance(Class.forName("nn.model.Connection"));
        setField(term2659, term2659.getClass(), "in", null);
        setField(term2659, term2659.getClass(), "out", null);
        setFloatField(term2659, term2659.getClass(), "weight", 0.0F);
        setBooleanField(term2659, term2659.getClass(), "expressed", false);
        setIntField(term2659, term2659.getClass(), "innovation", 0);
        Object term2663 = newInstance(Class.forName("nn.model.Connection"));
        setField(term2663, term2663.getClass(), "in", null);
        setField(term2663, term2663.getClass(), "out", null);
        setFloatField(term2663, term2663.getClass(), "weight", 0.0F);
        setBooleanField(term2663, term2663.getClass(), "expressed", false);
        setIntField(term2663, term2663.getClass(), "innovation", 0);
        ArrayList term2657 = new ArrayList();
        ((ArrayList) term2657).add(term2648);
        ((ArrayList) term2657).add(term2659);
        ((ArrayList) term2657).add(term2663);
        term2625 = newInstance(Class.forName("nn.model.Connection"));
        Object term2626 = newInstance(Class.forName("nn.model.Node"));
        Object term2655 = newInstance(Class.forName("nn.model.Node"));
        setField(term2626, term2626.getClass(), "type", enum21);
        setIntField(term2626, term2626.getClass(), "innovation", -507387516);
        setField(term2626, term2626.getClass(), "connections", term2638);
        setDoubleField(term2626, term2626.getClass(), "bias", 0.6059734092898602);
        setField(term2625, term2625.getClass(), "in", term2626);
        setField(term2655, term2655.getClass(), "type", enum21);
        setIntField(term2655, term2655.getClass(), "innovation", 1152356969);
        setField(term2655, term2655.getClass(), "connections", term2657);
        setDoubleField(term2655, term2655.getClass(), "bias", 0.3074693824288357);
        setField(term2625, term2625.getClass(), "out", term2655);
        setFloatField(term2625, term2625.getClass(), "weight", 0.32021916F);
        setBooleanField(term2625, term2625.getClass(), "expressed", false);
        setIntField(term2625, term2625.getClass(), "innovation", -1667990367);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("nn.model.Connection");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term2625, args);
    }

};


