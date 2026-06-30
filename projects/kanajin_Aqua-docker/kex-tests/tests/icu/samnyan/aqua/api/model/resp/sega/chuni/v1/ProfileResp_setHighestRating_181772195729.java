package icu.samnyan.aqua.api.model.resp.sega.chuni.v1;

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
import static icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Integer;

public class ProfileResp_setHighestRating_181772195729 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2462;
     Object term2525;

    public ProfileResp_setHighestRating_181772195729() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2462 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ProfileResp"));
        Object term2504 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2505 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2509 = newInstance(Class.forName("java.time.LocalTime"));
        Object term2514 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2515 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2519 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term2462, term2462.getClass(), "userName", "ieCtQFdkii");
        setIntField(term2462, term2462.getClass(), "level", -648200466);
        setField(term2462, term2462.getClass(), "exp", "dEnhdmILtU");
        setLongField(term2462, term2462.getClass(), "point", 5330761990446327930L);
        setLongField(term2462, term2462.getClass(), "totalPoint", -3954795081650780841L);
        setIntField(term2462, term2462.getClass(), "playCount", 2007134147);
        setIntField(term2462, term2462.getClass(), "playerRating", 993388358);
        setIntField(term2462, term2462.getClass(), "highestRating", -765191335);
        setIntField(term2462, term2462.getClass(), "nameplateId", -1697741155);
        setIntField(term2462, term2462.getClass(), "frameId", 1295839803);
        setIntField(term2462, term2462.getClass(), "characterId", -1891015523);
        setIntField(term2462, term2462.getClass(), "trophyId", -1560631747);
        setIntField(term2462, term2462.getClass(), "totalMapNum", 1215150180);
        setLongField(term2462, term2462.getClass(), "totalHiScore", 3288791194263207397L);
        setLongField(term2462, term2462.getClass(), "totalBasicHighScore", 3288941170644426558L);
        setLongField(term2462, term2462.getClass(), "totalAdvancedHighScore", -8338004844694486146L);
        setLongField(term2462, term2462.getClass(), "totalExpertHighScore", 6426732259596412988L);
        setLongField(term2462, term2462.getClass(), "totalMasterHighScore", 185793058502220865L);
        setIntField(term2462, term2462.getClass(), "friendCount", -1422859977);
        setIntField(term2505, term2505.getClass(), "year", 2025);
        setShortField(term2505, term2505.getClass(), "month", (short) 3);
        setShortField(term2505, term2505.getClass(), "day", (short) 28);
        setField(term2504, term2504.getClass(), "date", term2505);
        setByteField(term2509, term2509.getClass(), "hour", (byte) 19);
        setByteField(term2509, term2509.getClass(), "minute", (byte) 56);
        setByteField(term2509, term2509.getClass(), "second", (byte) 52);
        setIntField(term2509, term2509.getClass(), "nano", 738558930);
        setField(term2504, term2504.getClass(), "time", term2509);
        setField(term2462, term2462.getClass(), "firstPlayDate", term2504);
        setIntField(term2515, term2515.getClass(), "year", 2024);
        setShortField(term2515, term2515.getClass(), "month", (short) 2);
        setShortField(term2515, term2515.getClass(), "day", (short) 29);
        setField(term2514, term2514.getClass(), "date", term2515);
        setByteField(term2519, term2519.getClass(), "hour", (byte) 17);
        setByteField(term2519, term2519.getClass(), "minute", (byte) 54);
        setByteField(term2519, term2519.getClass(), "second", (byte) 21);
        setIntField(term2519, term2519.getClass(), "nano", 605973408);
        setField(term2514, term2514.getClass(), "time", term2519);
        setField(term2462, term2462.getClass(), "lastPlayDate", term2514);
        setIntField(term2462, term2462.getClass(), "courseClass", -1972436591);
        term2525 = new Integer(68922753);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ProfileResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term2525;
        callMethod(klass, "setHighestRating", argTypes, term2462, args);
    }

};


