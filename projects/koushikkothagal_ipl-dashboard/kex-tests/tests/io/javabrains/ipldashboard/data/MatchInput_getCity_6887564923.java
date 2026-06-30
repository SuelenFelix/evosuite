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

public class MatchInput_getCity_6887564923 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term773;

    public MatchInput_getCity_6887564923() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term773 = newInstance(Class.forName("io.javabrains.ipldashboard.data.MatchInput"));
        setField(term773, term773.getClass(), "id", "Ghbwtircqb");
        setField(term773, term773.getClass(), "city", "xrwlQZdwCp");
        setField(term773, term773.getClass(), "date", "IDCWpPLRkE");
        setField(term773, term773.getClass(), "player_of_match", "nyiiPDVjAc");
        setField(term773, term773.getClass(), "venue", "aKnKipADSo");
        setField(term773, term773.getClass(), "neutral_venue", "wSQxaModmm");
        setField(term773, term773.getClass(), "team1", "UlajhuVLaP");
        setField(term773, term773.getClass(), "team2", "gGSMzuGICf");
        setField(term773, term773.getClass(), "toss_winner", "hxCBltsObl");
        setField(term773, term773.getClass(), "toss_decision", "BndsHwAFMv");
        setField(term773, term773.getClass(), "winner", "GzFkzHGYFt");
        setField(term773, term773.getClass(), "result", "tShwQLRGNe");
        setField(term773, term773.getClass(), "result_margin", "LvtrsXUliU");
        setField(term773, term773.getClass(), "eliminator", "xLbjWUgOIL");
        setField(term773, term773.getClass(), "method", "jDtqGUpnZN");
        setField(term773, term773.getClass(), "umpire1", "nGKItKLYNC");
        setField(term773, term773.getClass(), "umpire2", "UiUYnPrcCi");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.javabrains.ipldashboard.data.MatchInput");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCity", argTypes, term773, args);
    }

};


