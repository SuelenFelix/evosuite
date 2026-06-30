package io.javabrains.ipldashboard.model;

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
import static io.javabrains.ipldashboard.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Match_setTossDecision_213670758718 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4729;

    public Match_setTossDecision_213670758718() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4729 = newInstance(Class.forName("io.javabrains.ipldashboard.model.Match"));
        Object term4743 = newInstance(Class.forName("java.time.LocalDate"));
        setLongField(term4729, term4729.getClass(), "id", -6573104506744284592L);
        setField(term4729, term4729.getClass(), "city", "hOncybyCAH");
        setIntField(term4743, term4743.getClass(), "year", 2022);
        setShortField(term4743, term4743.getClass(), "month", (short) 11);
        setShortField(term4743, term4743.getClass(), "day", (short) 16);
        setField(term4729, term4729.getClass(), "date", term4743);
        setField(term4729, term4729.getClass(), "playerOfMatch", "QduALnDSVo");
        setField(term4729, term4729.getClass(), "venue", "izPpKDErnQ");
        setField(term4729, term4729.getClass(), "team1", "NnpwZBUTvx");
        setField(term4729, term4729.getClass(), "team2", "tlQSNgTkQX");
        setField(term4729, term4729.getClass(), "tossWinner", "PCipZnmBOF");
        setField(term4729, term4729.getClass(), "tossDecision", "zcorEihhLK");
        setField(term4729, term4729.getClass(), "matchWinner", "GrqozDKFOk");
        setField(term4729, term4729.getClass(), "result", "CFyoseFGLF");
        setField(term4729, term4729.getClass(), "resultMargin", "SFqCrhEWLm");
        setField(term4729, term4729.getClass(), "umpire1", "GZdcJyZntS");
        setField(term4729, term4729.getClass(), "umpire2", "OIHoJeysUi");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.javabrains.ipldashboard.model.Match");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "WXMWFDGcLB";
        callMethod(klass, "setTossDecision", argTypes, term4729, args);
    }

};


