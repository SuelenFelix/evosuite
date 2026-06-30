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

public class MatchInput_getEliminator_139421083127 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10037;

    public MatchInput_getEliminator_139421083127() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10037 = newInstance(Class.forName("io.javabrains.ipldashboard.data.MatchInput"));
        setField(term10037, term10037.getClass(), "id", "rwKoAngzCu");
        setField(term10037, term10037.getClass(), "city", "VUkRVwROTl");
        setField(term10037, term10037.getClass(), "date", "UDlkdccCRn");
        setField(term10037, term10037.getClass(), "player_of_match", "McpzErOcYb");
        setField(term10037, term10037.getClass(), "venue", "jqrVEUvYEz");
        setField(term10037, term10037.getClass(), "neutral_venue", "QITgiBrmfj");
        setField(term10037, term10037.getClass(), "team1", "pXxkiXgQnq");
        setField(term10037, term10037.getClass(), "team2", "tKmrUDURku");
        setField(term10037, term10037.getClass(), "toss_winner", "JeZbrwZmsP");
        setField(term10037, term10037.getClass(), "toss_decision", "bxyfeicqrK");
        setField(term10037, term10037.getClass(), "winner", "vBnWPlsZMk");
        setField(term10037, term10037.getClass(), "result", "fIZsWucfXz");
        setField(term10037, term10037.getClass(), "result_margin", "IApvtmfhnq");
        setField(term10037, term10037.getClass(), "eliminator", "VSaNnhMpRc");
        setField(term10037, term10037.getClass(), "method", "QNjNTLlUaV");
        setField(term10037, term10037.getClass(), "umpire1", "hIYsRyOZxk");
        setField(term10037, term10037.getClass(), "umpire2", "RjNoEywJbC");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.javabrains.ipldashboard.data.MatchInput");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEliminator", argTypes, term10037, args);
    }

};


