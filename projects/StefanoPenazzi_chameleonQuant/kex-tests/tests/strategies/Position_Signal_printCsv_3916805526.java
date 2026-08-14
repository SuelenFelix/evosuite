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

public class Position_Signal_printCsv_3916805526 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3553;

    public Position_Signal_printCsv_3916805526() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term3592 = Class.forName((String) "strategies.Position$Action");
        Field term3591 = ((Class) term3592).getDeclaredField((String) "SELL");
        ((Field) term3591).setAccessible(true);
        Object enum13 = ((Field) term3591).get((Object) null);
        term3553 = newInstance(Class.forName("strategies.Position$Signal"));
        Object term3564 = newInstance(Class.forName("java.time.Instant"));
        setDoubleField(term3553, term3553.getClass(), "volume", 0.6397214730945112);
        setDoubleField(term3553, term3553.getClass(), "price", 0.25937345430928016);
        setField(term3553, term3553.getClass(), "action", enum13);
        setLongField(term3564, term3564.getClass(), "seconds", 1347400561L);
        setIntField(term3564, term3564.getClass(), "nanos", 385000000);
        setField(term3553, term3553.getClass(), "instant", term3564);
        setField(term3553, term3553.getClass(), "uuid", "LvtrsXUliU");
        setField(term3553, term3553.getClass(), "sId", "xLbjWUgOIL");
        setField(term3553, term3553.getClass(), "this$0", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("strategies.Position$Signal");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "printCsv", argTypes, term3553, args);
    }

};


