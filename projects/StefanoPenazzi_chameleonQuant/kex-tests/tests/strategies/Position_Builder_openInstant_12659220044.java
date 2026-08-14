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

public class Position_Builder_openInstant_12659220044 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10813;
     Object term10840;

    public Position_Builder_openInstant_12659220044() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term10844 = Class.forName((String) "strategies.Position$PositionType");
        Field term10843 = ((Class) term10844).getDeclaredField((String) "SHORT");
        ((Field) term10843).setAccessible(true);
        Object enum35 = ((Field) term10843).get((Object) null);
        term10813 = newInstance(Class.forName("strategies.Position$Builder"));
        Object term10837 = newInstance(Class.forName("java.time.Instant"));
        setField(term10813, term10813.getClass(), "ts", null);
        setField(term10813, term10813.getClass(), "pt", enum35);
        setField(term10813, term10813.getClass(), "sId", "mLUZFTfjle");
        setIntField(term10813, term10813.getClass(), "initVolume", 389427431);
        setDoubleField(term10813, term10813.getClass(), "pr", 0.23129126164078717);
        setLongField(term10837, term10837.getClass(), "seconds", 1643981113L);
        setIntField(term10837, term10837.getClass(), "nanos", 575000000);
        setField(term10813, term10813.getClass(), "openInst", term10837);
        term10840 = newInstance(Class.forName("java.time.Instant"));
        setLongField(term10840, term10840.getClass(), "seconds", 1689428810L);
        setIntField(term10840, term10840.getClass(), "nanos", 999000000);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("strategies.Position$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.Instant");
        Object[] args = new Object[1];
        args[0] = term10840;
        callMethod(klass, "openInstant", argTypes, term10813, args);
    }

};


