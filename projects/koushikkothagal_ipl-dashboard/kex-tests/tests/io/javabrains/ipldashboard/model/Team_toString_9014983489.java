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
import java.util.ArrayList;
import java.lang.Object;

public class Team_toString_9014983489 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8739;

    public Team_toString_9014983489() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term8757 = newInstance(Class.forName("io.javabrains.ipldashboard.model.Match"));
        Object term8760 = newInstance(Class.forName("java.time.LocalDate"));
        setLongField(term8757, term8757.getClass(), "id", 5836128569274066678L);
        setField(term8757, term8757.getClass(), "city", "");
        setIntField(term8760, term8760.getClass(), "year", 2016);
        setShortField(term8760, term8760.getClass(), "month", (short) 6);
        setShortField(term8760, term8760.getClass(), "day", (short) 15);
        setField(term8757, term8757.getClass(), "date", term8760);
        setField(term8757, term8757.getClass(), "playerOfMatch", "");
        setField(term8757, term8757.getClass(), "venue", "");
        setField(term8757, term8757.getClass(), "team1", "");
        setField(term8757, term8757.getClass(), "team2", "");
        setField(term8757, term8757.getClass(), "tossWinner", "");
        setField(term8757, term8757.getClass(), "tossDecision", "");
        setField(term8757, term8757.getClass(), "matchWinner", "");
        setField(term8757, term8757.getClass(), "result", "");
        setField(term8757, term8757.getClass(), "resultMargin", "");
        setField(term8757, term8757.getClass(), "umpire1", "");
        setField(term8757, term8757.getClass(), "umpire2", "");
        Object term8775 = newInstance(Class.forName("io.javabrains.ipldashboard.model.Match"));
        Object term8778 = newInstance(Class.forName("java.time.LocalDate"));
        setLongField(term8775, term8775.getClass(), "id", -2177368829816872572L);
        setField(term8775, term8775.getClass(), "city", "");
        setIntField(term8778, term8778.getClass(), "year", 2018);
        setShortField(term8778, term8778.getClass(), "month", (short) 9);
        setShortField(term8778, term8778.getClass(), "day", (short) 1);
        setField(term8775, term8775.getClass(), "date", term8778);
        setField(term8775, term8775.getClass(), "playerOfMatch", "");
        setField(term8775, term8775.getClass(), "venue", "");
        setField(term8775, term8775.getClass(), "team1", "");
        setField(term8775, term8775.getClass(), "team2", "");
        setField(term8775, term8775.getClass(), "tossWinner", "");
        setField(term8775, term8775.getClass(), "tossDecision", "");
        setField(term8775, term8775.getClass(), "matchWinner", "");
        setField(term8775, term8775.getClass(), "result", "");
        setField(term8775, term8775.getClass(), "resultMargin", "");
        setField(term8775, term8775.getClass(), "umpire1", "");
        setField(term8775, term8775.getClass(), "umpire2", "");
        Object term8793 = newInstance(Class.forName("io.javabrains.ipldashboard.model.Match"));
        Object term8796 = newInstance(Class.forName("java.time.LocalDate"));
        setLongField(term8793, term8793.getClass(), "id", -8463029266761149071L);
        setField(term8793, term8793.getClass(), "city", "");
        setIntField(term8796, term8796.getClass(), "year", 2012);
        setShortField(term8796, term8796.getClass(), "month", (short) 8);
        setShortField(term8796, term8796.getClass(), "day", (short) 25);
        setField(term8793, term8793.getClass(), "date", term8796);
        setField(term8793, term8793.getClass(), "playerOfMatch", "");
        setField(term8793, term8793.getClass(), "venue", "");
        setField(term8793, term8793.getClass(), "team1", "");
        setField(term8793, term8793.getClass(), "team2", "");
        setField(term8793, term8793.getClass(), "tossWinner", "");
        setField(term8793, term8793.getClass(), "tossDecision", "");
        setField(term8793, term8793.getClass(), "matchWinner", "");
        setField(term8793, term8793.getClass(), "result", "");
        setField(term8793, term8793.getClass(), "resultMargin", "");
        setField(term8793, term8793.getClass(), "umpire1", "");
        setField(term8793, term8793.getClass(), "umpire2", "");
        Object term8811 = newInstance(Class.forName("io.javabrains.ipldashboard.model.Match"));
        Object term8814 = newInstance(Class.forName("java.time.LocalDate"));
        setLongField(term8811, term8811.getClass(), "id", 3133860696238261492L);
        setField(term8811, term8811.getClass(), "city", "");
        setIntField(term8814, term8814.getClass(), "year", 2028);
        setShortField(term8814, term8814.getClass(), "month", (short) 4);
        setShortField(term8814, term8814.getClass(), "day", (short) 3);
        setField(term8811, term8811.getClass(), "date", term8814);
        setField(term8811, term8811.getClass(), "playerOfMatch", "");
        setField(term8811, term8811.getClass(), "venue", "");
        setField(term8811, term8811.getClass(), "team1", "");
        setField(term8811, term8811.getClass(), "team2", "");
        setField(term8811, term8811.getClass(), "tossWinner", "");
        setField(term8811, term8811.getClass(), "tossDecision", "");
        setField(term8811, term8811.getClass(), "matchWinner", "");
        setField(term8811, term8811.getClass(), "result", "");
        setField(term8811, term8811.getClass(), "resultMargin", "");
        setField(term8811, term8811.getClass(), "umpire1", "");
        setField(term8811, term8811.getClass(), "umpire2", "");
        Object term8829 = newInstance(Class.forName("io.javabrains.ipldashboard.model.Match"));
        Object term8832 = newInstance(Class.forName("java.time.LocalDate"));
        setLongField(term8829, term8829.getClass(), "id", 7247160664318067468L);
        setField(term8829, term8829.getClass(), "city", "");
        setIntField(term8832, term8832.getClass(), "year", 2012);
        setShortField(term8832, term8832.getClass(), "month", (short) 3);
        setShortField(term8832, term8832.getClass(), "day", (short) 27);
        setField(term8829, term8829.getClass(), "date", term8832);
        setField(term8829, term8829.getClass(), "playerOfMatch", "");
        setField(term8829, term8829.getClass(), "venue", "");
        setField(term8829, term8829.getClass(), "team1", "");
        setField(term8829, term8829.getClass(), "team2", "");
        setField(term8829, term8829.getClass(), "tossWinner", "");
        setField(term8829, term8829.getClass(), "tossDecision", "");
        setField(term8829, term8829.getClass(), "matchWinner", "");
        setField(term8829, term8829.getClass(), "result", "");
        setField(term8829, term8829.getClass(), "resultMargin", "");
        setField(term8829, term8829.getClass(), "umpire1", "");
        setField(term8829, term8829.getClass(), "umpire2", "");
        Object term8847 = newInstance(Class.forName("io.javabrains.ipldashboard.model.Match"));
        Object term8850 = newInstance(Class.forName("java.time.LocalDate"));
        setLongField(term8847, term8847.getClass(), "id", 2135754395358000892L);
        setField(term8847, term8847.getClass(), "city", "");
        setIntField(term8850, term8850.getClass(), "year", 2020);
        setShortField(term8850, term8850.getClass(), "month", (short) 8);
        setShortField(term8850, term8850.getClass(), "day", (short) 12);
        setField(term8847, term8847.getClass(), "date", term8850);
        setField(term8847, term8847.getClass(), "playerOfMatch", "");
        setField(term8847, term8847.getClass(), "venue", "");
        setField(term8847, term8847.getClass(), "team1", "");
        setField(term8847, term8847.getClass(), "team2", "");
        setField(term8847, term8847.getClass(), "tossWinner", "");
        setField(term8847, term8847.getClass(), "tossDecision", "");
        setField(term8847, term8847.getClass(), "matchWinner", "");
        setField(term8847, term8847.getClass(), "result", "");
        setField(term8847, term8847.getClass(), "resultMargin", "");
        setField(term8847, term8847.getClass(), "umpire1", "");
        setField(term8847, term8847.getClass(), "umpire2", "");
        Object term8865 = newInstance(Class.forName("io.javabrains.ipldashboard.model.Match"));
        Object term8868 = newInstance(Class.forName("java.time.LocalDate"));
        setLongField(term8865, term8865.getClass(), "id", -8085190702504231560L);
        setField(term8865, term8865.getClass(), "city", "");
        setIntField(term8868, term8868.getClass(), "year", 2010);
        setShortField(term8868, term8868.getClass(), "month", (short) 6);
        setShortField(term8868, term8868.getClass(), "day", (short) 14);
        setField(term8865, term8865.getClass(), "date", term8868);
        setField(term8865, term8865.getClass(), "playerOfMatch", "");
        setField(term8865, term8865.getClass(), "venue", "");
        setField(term8865, term8865.getClass(), "team1", "");
        setField(term8865, term8865.getClass(), "team2", "");
        setField(term8865, term8865.getClass(), "tossWinner", "");
        setField(term8865, term8865.getClass(), "tossDecision", "");
        setField(term8865, term8865.getClass(), "matchWinner", "");
        setField(term8865, term8865.getClass(), "result", "");
        setField(term8865, term8865.getClass(), "resultMargin", "");
        setField(term8865, term8865.getClass(), "umpire1", "");
        setField(term8865, term8865.getClass(), "umpire2", "");
        ArrayList term8755 = new ArrayList();
        ((ArrayList) term8755).add(term8757);
        ((ArrayList) term8755).add(term8775);
        ((ArrayList) term8755).add(term8793);
        ((ArrayList) term8755).add(term8811);
        ((ArrayList) term8755).add(term8829);
        ((ArrayList) term8755).add(term8847);
        ((ArrayList) term8755).add(term8865);
        term8739 = newInstance(Class.forName("io.javabrains.ipldashboard.model.Team"));
        setLongField(term8739, term8739.getClass(), "id", -8876856890348836498L);
        setField(term8739, term8739.getClass(), "teamName", "AdYzLPMcwe");
        setLongField(term8739, term8739.getClass(), "totalMatches", 846579494941632714L);
        setLongField(term8739, term8739.getClass(), "totalWins", 6689117472719450333L);
        setField(term8739, term8739.getClass(), "matches", term8755);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.javabrains.ipldashboard.model.Team");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term8739, args);
    }

};


