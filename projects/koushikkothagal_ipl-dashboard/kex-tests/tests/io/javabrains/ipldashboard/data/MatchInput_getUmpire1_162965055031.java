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

public class MatchInput_getUmpire1_162965055031 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11581;

    public MatchInput_getUmpire1_162965055031() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11581 = newInstance(Class.forName("io.javabrains.ipldashboard.data.MatchInput"));
        setField(term11581, term11581.getClass(), "id", "mfHtgSbdjD");
        setField(term11581, term11581.getClass(), "city", "cmuaUiHMVL");
        setField(term11581, term11581.getClass(), "date", "xjoSGPWUgu");
        setField(term11581, term11581.getClass(), "player_of_match", "uzmqjnOUXu");
        setField(term11581, term11581.getClass(), "venue", "xeyjTOCOJb");
        setField(term11581, term11581.getClass(), "neutral_venue", "DGRqjjdhzy");
        setField(term11581, term11581.getClass(), "team1", "lQFkjJUPAR");
        setField(term11581, term11581.getClass(), "team2", "BsuVlGUUjV");
        setField(term11581, term11581.getClass(), "toss_winner", "bHHjfDCntT");
        setField(term11581, term11581.getClass(), "toss_decision", "sEphiduvkv");
        setField(term11581, term11581.getClass(), "winner", "PbLgCSAHce");
        setField(term11581, term11581.getClass(), "result", "NWldOLAbqk");
        setField(term11581, term11581.getClass(), "result_margin", "qnYaYSpDwO");
        setField(term11581, term11581.getClass(), "eliminator", "dgbFDCdHtj");
        setField(term11581, term11581.getClass(), "method", "EKpdCBubDE");
        setField(term11581, term11581.getClass(), "umpire1", "zMsSLTfGhl");
        setField(term11581, term11581.getClass(), "umpire2", "bEmHScVZaQ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.javabrains.ipldashboard.data.MatchInput");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUmpire1", argTypes, term11581, args);
    }

};


