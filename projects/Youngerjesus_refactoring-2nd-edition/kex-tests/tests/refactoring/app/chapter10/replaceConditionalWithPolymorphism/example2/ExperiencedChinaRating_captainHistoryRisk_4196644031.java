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

public class ExperiencedChinaRating_captainHistoryRisk_4196644031 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31;

    public ExperiencedChinaRating_captainHistoryRisk_4196644031() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term48 = new ArrayList();
        term31 = newInstance(Class.forName("refactoring.app.chapter10.replaceConditionalWithPolymorphism.example2.ExperiencedChinaRating"));
        Object term32 = newInstance(Class.forName("refactoring.app.chapter10.replaceConditionalWithPolymorphism.example2.Voyage"));
        Object term47 = newInstance(Class.forName("refactoring.app.chapter10.replaceConditionalWithPolymorphism.example2.History"));
        setField(term32, term32.getClass(), "zone", "sjlJAEtRrb");
        setIntField(term32, term32.getClass(), "length", 1484323161);
        setIntField(term32, term32.getClass(), "profit", 391863371);
        setField(term31, term31.getClass(), "voyage", term32);
        setField(term47, term47.getClass(), "voyages", term48);
        setField(term31, term31.getClass(), "history", term47);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter10.replaceConditionalWithPolymorphism.example2.ExperiencedChinaRating");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "captainHistoryRisk", argTypes, term31, args);
    }

};


