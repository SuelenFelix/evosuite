package strategies;

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
import static strategies.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;
import java.lang.Double;

public class Position_Builder_price_11959851133 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10592;
     Object term10619;

    public Position_Builder_price_11959851133() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term10622 = Class.forName((String) "strategies.Position$PositionType");
        Field term10621 = ((Class) term10622).getDeclaredField((String) "SHORT");
        ((Field) term10621).setAccessible(true);
        Object enum34 = ((Field) term10621).get((Object) null);
        term10592 = newInstance(Class.forName("strategies.Position$Builder"));
        Object term10616 = newInstance(Class.forName("java.time.Instant"));
        setField(term10592, term10592.getClass(), "ts", null);
        setField(term10592, term10592.getClass(), "pt", enum34);
        setField(term10592, term10592.getClass(), "sId", "JDaAnsVTGV");
        setIntField(term10592, term10592.getClass(), "initVolume", -1410220680);
        setDoubleField(term10592, term10592.getClass(), "pr", 0.06480976831423468);
        setLongField(term10616, term10616.getClass(), "seconds", 1285661498L);
        setIntField(term10616, term10616.getClass(), "nanos", 273000000);
        setField(term10592, term10592.getClass(), "openInst", term10616);
        term10619 = new Double(0.8490790645379176);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("strategies.Position$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term10619;
        callMethod(klass, "price", argTypes, term10592, args);
    }

};


