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

public class MatchInput_setVenue_6347390810 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3464;

    public MatchInput_setVenue_6347390810() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3464 = newInstance(Class.forName("io.javabrains.ipldashboard.data.MatchInput"));
        setField(term3464, term3464.getClass(), "id", "PtirvZmsGt");
        setField(term3464, term3464.getClass(), "city", "HWkpTmtlrc");
        setField(term3464, term3464.getClass(), "date", "hMmaoREuCK");
        setField(term3464, term3464.getClass(), "player_of_match", "VeDtgDzGAN");
        setField(term3464, term3464.getClass(), "venue", "aWYOWZFyaX");
        setField(term3464, term3464.getClass(), "neutral_venue", "BRIVNtfUWU");
        setField(term3464, term3464.getClass(), "team1", "DbiCVtPPCT");
        setField(term3464, term3464.getClass(), "team2", "WzFopsaDuG");
        setField(term3464, term3464.getClass(), "toss_winner", "PapWxkhEWe");
        setField(term3464, term3464.getClass(), "toss_decision", "smnHEqRFRx");
        setField(term3464, term3464.getClass(), "winner", "XYtryyobou");
        setField(term3464, term3464.getClass(), "result", "OYbzXylRWW");
        setField(term3464, term3464.getClass(), "result_margin", "DSNsTGYXDF");
        setField(term3464, term3464.getClass(), "eliminator", "sQvGcVjdEx");
        setField(term3464, term3464.getClass(), "method", "rLHAoqXgPh");
        setField(term3464, term3464.getClass(), "umpire1", "zUlRdimJtU");
        setField(term3464, term3464.getClass(), "umpire2", "vwbEQQNQrx");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.javabrains.ipldashboard.data.MatchInput");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "xtftXXMbem";
        callMethod(klass, "setVenue", argTypes, term3464, args);
    }

};


