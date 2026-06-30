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

public class ExperiencedChinaRating_voyageAndHistoryLengthFactor_2531000652 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term62;

    public ExperiencedChinaRating_voyageAndHistoryLengthFactor_2531000652() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term79 = new ArrayList();
        term62 = newInstance(Class.forName("refactoring.app.chapter10.replaceConditionalWithPolymorphism.example2.ExperiencedChinaRating"));
        Object term63 = newInstance(Class.forName("refactoring.app.chapter10.replaceConditionalWithPolymorphism.example2.Voyage"));
        Object term78 = newInstance(Class.forName("refactoring.app.chapter10.replaceConditionalWithPolymorphism.example2.History"));
        setField(term63, term63.getClass(), "zone", "MuLcgQHgqz");
        setIntField(term63, term63.getClass(), "length", -1922583790);
        setIntField(term63, term63.getClass(), "profit", -616727354);
        setField(term62, term62.getClass(), "voyage", term63);
        setField(term78, term78.getClass(), "voyages", term79);
        setField(term62, term62.getClass(), "history", term78);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter10.replaceConditionalWithPolymorphism.example2.ExperiencedChinaRating");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "voyageAndHistoryLengthFactor", argTypes, term62, args);
    }

};


