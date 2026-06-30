package io.javabrains.ipldashboard.data;

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
import static io.javabrains.ipldashboard.data.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class MatchInput_setResult_173157824224 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8868;

    public MatchInput_setResult_173157824224() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8868 = newInstance(Class.forName("io.javabrains.ipldashboard.data.MatchInput"));
        setField(term8868, term8868.getClass(), "id", "orEuhCStGM");
        setField(term8868, term8868.getClass(), "city", "HhEaSXWvrY");
        setField(term8868, term8868.getClass(), "date", "CVRGEomOth");
        setField(term8868, term8868.getClass(), "player_of_match", "vSeruUyNWX");
        setField(term8868, term8868.getClass(), "venue", "UkKvaeJfEC");
        setField(term8868, term8868.getClass(), "neutral_venue", "WPxXsahPRq");
        setField(term8868, term8868.getClass(), "team1", "IENRuqmwUU");
        setField(term8868, term8868.getClass(), "team2", "GsWxOwXvSu");
        setField(term8868, term8868.getClass(), "toss_winner", "bKBSncrMEZ");
        setField(term8868, term8868.getClass(), "toss_decision", "yeSXGqQExb");
        setField(term8868, term8868.getClass(), "winner", "uXYcXVYJZM");
        setField(term8868, term8868.getClass(), "result", "BJhjdJUhkz");
        setField(term8868, term8868.getClass(), "result_margin", "cdHYQDgUZR");
        setField(term8868, term8868.getClass(), "eliminator", "KAORSSPSeV");
        setField(term8868, term8868.getClass(), "method", "UimMMORkzd");
        setField(term8868, term8868.getClass(), "umpire1", "huVIXUWLtI");
        setField(term8868, term8868.getClass(), "umpire2", "vhKzFyKPOT");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.javabrains.ipldashboard.data.MatchInput");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "nQhIgWXdRc";
        callMethod(klass, "setResult", argTypes, term8868, args);
    }

};


