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

public class MatchInput_getId_11000898201 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public MatchInput_getId_11000898201() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("io.javabrains.ipldashboard.data.MatchInput"));
        setField(term1, term1.getClass(), "id", "PAEBtnZtTD");
        setField(term1, term1.getClass(), "city", "sjlJAEtRrb");
        setField(term1, term1.getClass(), "date", "MuLcgQHgqz");
        setField(term1, term1.getClass(), "player_of_match", "xxtlPwDYFs");
        setField(term1, term1.getClass(), "venue", "jJCZpVmanW");
        setField(term1, term1.getClass(), "neutral_venue", "EGtDIRbSSb");
        setField(term1, term1.getClass(), "team1", "SzjVpOQTyS");
        setField(term1, term1.getClass(), "team2", "MjGYSRKTNF");
        setField(term1, term1.getClass(), "toss_winner", "hRNSzYYIrc");
        setField(term1, term1.getClass(), "toss_decision", "RMFIsYGgne");
        setField(term1, term1.getClass(), "winner", "NRdvgJlhkX");
        setField(term1, term1.getClass(), "result", "uuaPigETmJ");
        setField(term1, term1.getClass(), "result_margin", "MxlszYVzRf");
        setField(term1, term1.getClass(), "eliminator", "LQFpaHEwXR");
        setField(term1, term1.getClass(), "method", "oVcInYnLWB");
        setField(term1, term1.getClass(), "umpire1", "aJlieCFVtF");
        setField(term1, term1.getClass(), "umpire2", "ZiaGIbnzTs");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.javabrains.ipldashboard.data.MatchInput");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term1, args);
    }

};


