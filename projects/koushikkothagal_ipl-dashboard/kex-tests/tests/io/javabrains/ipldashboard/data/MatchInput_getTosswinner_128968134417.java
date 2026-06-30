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

public class MatchInput_getTosswinner_128968134417 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6177;

    public MatchInput_getTosswinner_128968134417() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6177 = newInstance(Class.forName("io.javabrains.ipldashboard.data.MatchInput"));
        setField(term6177, term6177.getClass(), "id", "NBrvVzvQHe");
        setField(term6177, term6177.getClass(), "city", "FjOiNAfBOc");
        setField(term6177, term6177.getClass(), "date", "iCCsaLHohG");
        setField(term6177, term6177.getClass(), "player_of_match", "NJhGgctbdj");
        setField(term6177, term6177.getClass(), "venue", "MYWYUeLGOp");
        setField(term6177, term6177.getClass(), "neutral_venue", "tsTGdgQYUL");
        setField(term6177, term6177.getClass(), "team1", "TtGbVmKcnX");
        setField(term6177, term6177.getClass(), "team2", "GJVkUrCVdD");
        setField(term6177, term6177.getClass(), "toss_winner", "zNdorvdUgu");
        setField(term6177, term6177.getClass(), "toss_decision", "oPxuZbkYio");
        setField(term6177, term6177.getClass(), "winner", "vKitydDVnM");
        setField(term6177, term6177.getClass(), "result", "urCiQnUFBM");
        setField(term6177, term6177.getClass(), "result_margin", "EKjQdtKxAM");
        setField(term6177, term6177.getClass(), "eliminator", "TXZAIPQJHt");
        setField(term6177, term6177.getClass(), "method", "DIbeDHICho");
        setField(term6177, term6177.getClass(), "umpire1", "dJGPlmSRnz");
        setField(term6177, term6177.getClass(), "umpire2", "DPskuFUobI");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.javabrains.ipldashboard.data.MatchInput");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getToss_winner", argTypes, term6177, args);
    }

};


