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

public class Rating_value_18422231051 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term305;

    public Rating_value_18422231051() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term322 = new ArrayList();
        term305 = newInstance(Class.forName("refactoring.app.chapter10.replaceConditionalWithPolymorphism.example2.Rating"));
        Object term306 = newInstance(Class.forName("refactoring.app.chapter10.replaceConditionalWithPolymorphism.example2.Voyage"));
        Object term321 = newInstance(Class.forName("refactoring.app.chapter10.replaceConditionalWithPolymorphism.example2.History"));
        setField(term306, term306.getClass(), "zone", "RMFIsYGgne");
        setIntField(term306, term306.getClass(), "length", 1622346318);
        setIntField(term306, term306.getClass(), "profit", 1048535127);
        setField(term305, term305.getClass(), "voyage", term306);
        setField(term321, term321.getClass(), "voyages", term322);
        setField(term305, term305.getClass(), "history", term321);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter10.replaceConditionalWithPolymorphism.example2.Rating");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "value", argTypes, term305, args);
    }

};


