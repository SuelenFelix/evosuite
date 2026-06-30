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

public class MatchInput_setTeam2_185077438216 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5780;

    public MatchInput_setTeam2_185077438216() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5780 = newInstance(Class.forName("io.javabrains.ipldashboard.data.MatchInput"));
        setField(term5780, term5780.getClass(), "id", "pvDEABOxLt");
        setField(term5780, term5780.getClass(), "city", "beAMpkroCQ");
        setField(term5780, term5780.getClass(), "date", "uSUvKAyuvd");
        setField(term5780, term5780.getClass(), "player_of_match", "onQLVONGuf");
        setField(term5780, term5780.getClass(), "venue", "SOrEHbcbmn");
        setField(term5780, term5780.getClass(), "neutral_venue", "bnsyeQXFdu");
        setField(term5780, term5780.getClass(), "team1", "BwtdjiefJn");
        setField(term5780, term5780.getClass(), "team2", "jDmhBrIoDa");
        setField(term5780, term5780.getClass(), "toss_winner", "SPtPatHeOm");
        setField(term5780, term5780.getClass(), "toss_decision", "ywmcuThdfL");
        setField(term5780, term5780.getClass(), "winner", "GBOEuByOfr");
        setField(term5780, term5780.getClass(), "result", "NHbOFFjyVK");
        setField(term5780, term5780.getClass(), "result_margin", "zaloBqlrSo");
        setField(term5780, term5780.getClass(), "eliminator", "vvoLrMGCoN");
        setField(term5780, term5780.getClass(), "method", "pXdglvyrQe");
        setField(term5780, term5780.getClass(), "umpire1", "OcfNzHYdki");
        setField(term5780, term5780.getClass(), "umpire2", "uPuCVuZYOI");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.javabrains.ipldashboard.data.MatchInput");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "TweMFhxNdj";
        callMethod(klass, "setTeam2", argTypes, term5780, args);
    }

};


