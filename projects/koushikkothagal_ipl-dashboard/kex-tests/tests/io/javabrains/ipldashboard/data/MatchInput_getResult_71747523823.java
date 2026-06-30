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

public class MatchInput_getResult_71747523823 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8493;

    public MatchInput_getResult_71747523823() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8493 = newInstance(Class.forName("io.javabrains.ipldashboard.data.MatchInput"));
        setField(term8493, term8493.getClass(), "id", "MgLCedQfoj");
        setField(term8493, term8493.getClass(), "city", "zgKiINdgNu");
        setField(term8493, term8493.getClass(), "date", "zLMTXDQHYH");
        setField(term8493, term8493.getClass(), "player_of_match", "PqywFWJlpE");
        setField(term8493, term8493.getClass(), "venue", "OzXRsFGTIp");
        setField(term8493, term8493.getClass(), "neutral_venue", "TjWpyghUWN");
        setField(term8493, term8493.getClass(), "team1", "dkZFDZxcde");
        setField(term8493, term8493.getClass(), "team2", "WXcZEtUKlI");
        setField(term8493, term8493.getClass(), "toss_winner", "IkpjUOuWQU");
        setField(term8493, term8493.getClass(), "toss_decision", "boSSpezHeU");
        setField(term8493, term8493.getClass(), "winner", "OUeBWNTQDh");
        setField(term8493, term8493.getClass(), "result", "gltJarNuUk");
        setField(term8493, term8493.getClass(), "result_margin", "ZwZIDwYcSW");
        setField(term8493, term8493.getClass(), "eliminator", "sOdkipUKRu");
        setField(term8493, term8493.getClass(), "method", "oKwCDqywym");
        setField(term8493, term8493.getClass(), "umpire1", "zjZYTddemL");
        setField(term8493, term8493.getClass(), "umpire2", "QtrylgCLiF");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.javabrains.ipldashboard.data.MatchInput");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getResult", argTypes, term8493, args);
    }

};


