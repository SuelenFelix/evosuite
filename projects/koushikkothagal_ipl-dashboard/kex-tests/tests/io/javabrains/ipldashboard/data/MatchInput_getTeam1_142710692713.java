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

public class MatchInput_getTeam1_142710692713 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4633;

    public MatchInput_getTeam1_142710692713() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4633 = newInstance(Class.forName("io.javabrains.ipldashboard.data.MatchInput"));
        setField(term4633, term4633.getClass(), "id", "hOncybyCAH");
        setField(term4633, term4633.getClass(), "city", "QduALnDSVo");
        setField(term4633, term4633.getClass(), "date", "izPpKDErnQ");
        setField(term4633, term4633.getClass(), "player_of_match", "NnpwZBUTvx");
        setField(term4633, term4633.getClass(), "venue", "tlQSNgTkQX");
        setField(term4633, term4633.getClass(), "neutral_venue", "PCipZnmBOF");
        setField(term4633, term4633.getClass(), "team1", "zcorEihhLK");
        setField(term4633, term4633.getClass(), "team2", "GrqozDKFOk");
        setField(term4633, term4633.getClass(), "toss_winner", "CFyoseFGLF");
        setField(term4633, term4633.getClass(), "toss_decision", "SFqCrhEWLm");
        setField(term4633, term4633.getClass(), "winner", "GZdcJyZntS");
        setField(term4633, term4633.getClass(), "result", "OIHoJeysUi");
        setField(term4633, term4633.getClass(), "result_margin", "WXMWFDGcLB");
        setField(term4633, term4633.getClass(), "eliminator", "wKWbJssZuG");
        setField(term4633, term4633.getClass(), "method", "NzBMMhkhpT");
        setField(term4633, term4633.getClass(), "umpire1", "qCpEbQDHdF");
        setField(term4633, term4633.getClass(), "umpire2", "AHbZyFOmlo");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.javabrains.ipldashboard.data.MatchInput");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTeam1", argTypes, term4633, args);
    }

};


