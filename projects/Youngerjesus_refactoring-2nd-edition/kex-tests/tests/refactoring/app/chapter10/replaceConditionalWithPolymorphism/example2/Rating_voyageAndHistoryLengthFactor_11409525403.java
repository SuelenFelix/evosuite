package refactoring.app.chapter10.replaceConditionalWithPolymorphism.example2;

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
import static refactoring.app.chapter10.replaceConditionalWithPolymorphism.example2.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;

public class Rating_voyageAndHistoryLengthFactor_11409525403 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term367;

    public Rating_voyageAndHistoryLengthFactor_11409525403() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term384 = new ArrayList();
        term367 = newInstance(Class.forName("refactoring.app.chapter10.replaceConditionalWithPolymorphism.example2.Rating"));
        Object term368 = newInstance(Class.forName("refactoring.app.chapter10.replaceConditionalWithPolymorphism.example2.Voyage"));
        Object term383 = newInstance(Class.forName("refactoring.app.chapter10.replaceConditionalWithPolymorphism.example2.History"));
        setField(term368, term368.getClass(), "zone", "uuaPigETmJ");
        setIntField(term368, term368.getClass(), "length", -2068769794);
        setIntField(term368, term368.getClass(), "profit", -117576464);
        setField(term367, term367.getClass(), "voyage", term368);
        setField(term383, term383.getClass(), "voyages", term384);
        setField(term367, term367.getClass(), "history", term383);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter10.replaceConditionalWithPolymorphism.example2.Rating");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "voyageAndHistoryLengthFactor", argTypes, term367, args);
    }

};


