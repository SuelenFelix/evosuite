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

public class ProfileResp_setFrameId_90863074031 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2632;
     Object term2695;

    public ProfileResp_setFrameId_90863074031() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2632 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ProfileResp"));
        Object term2674 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2675 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2679 = newInstance(Class.forName("java.time.LocalTime"));
        Object term2684 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2685 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2689 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term2632, term2632.getClass(), "userName", "fhkbdRViHi");
        setIntField(term2632, term2632.getClass(), "level", -2005784375);
        setField(term2632, term2632.getClass(), "exp", "uWHnvSvaPl");
        setLongField(term2632, term2632.getClass(), "point", -4043093655001688454L);
        setLongField(term2632, term2632.getClass(), "totalPoint", -419800263764810394L);
        setIntField(term2632, term2632.getClass(), "playCount", -288604325);
        setIntField(term2632, term2632.getClass(), "playerRating", -1268314569);
        setIntField(term2632, term2632.getClass(), "highestRating", 877649659);
        setIntField(term2632, term2632.getClass(), "nameplateId", -1332748804);
        setIntField(term2632, term2632.getClass(), "frameId", 1774507971);
        setIntField(term2632, term2632.getClass(), "characterId", -1420269858);
        setIntField(term2632, term2632.getClass(), "trophyId", -2119545015);
        setIntField(term2632, term2632.getClass(), "totalMapNum", 1272542218);
        setLongField(term2632, term2632.getClass(), "totalHiScore", 5904678961906211249L);
        setLongField(term2632, term2632.getClass(), "totalBasicHighScore", -1820639665251914495L);
        setLongField(term2632, term2632.getClass(), "totalAdvancedHighScore", 3238645206498300107L);
        setLongField(term2632, term2632.getClass(), "totalExpertHighScore", -1592696983130738594L);
        setLongField(term2632, term2632.getClass(), "totalMasterHighScore", 6902365338255307910L);
        setIntField(term2632, term2632.getClass(), "friendCount", 1209799204);
        setIntField(term2675, term2675.getClass(), "year", 2016);
        setShortField(term2675, term2675.getClass(), "month", (short) 10);
        setShortField(term2675, term2675.getClass(), "day", (short) 20);
        setField(term2674, term2674.getClass(), "date", term2675);
        setByteField(term2679, term2679.getClass(), "hour", (byte) 18);
        setByteField(term2679, term2679.getClass(), "minute", (byte) 39);
        setByteField(term2679, term2679.getClass(), "second", (byte) 1);
        setIntField(term2679, term2679.getClass(), "nano", 196253988);
        setField(term2674, term2674.getClass(), "time", term2679);
        setField(term2632, term2632.getClass(), "firstPlayDate", term2674);
        setIntField(term2685, term2685.getClass(), "year", 2019);
        setShortField(term2685, term2685.getClass(), "month", (short) 1);
        setShortField(term2685, term2685.getClass(), "day", (short) 6);
        setField(term2684, term2684.getClass(), "date", term2685);
        setByteField(term2689, term2689.getClass(), "hour", (byte) 18);
        setByteField(term2689, term2689.getClass(), "minute", (byte) 8);
        setByteField(term2689, term2689.getClass(), "second", (byte) 46);
        setIntField(term2689, term2689.getClass(), "nano", 934136445);
        setField(term2684, term2684.getClass(), "time", term2689);
        setField(term2632, term2632.getClass(), "lastPlayDate", term2684);
        setIntField(term2632, term2632.getClass(), "courseClass", 1094107751);
        term2695 = new Integer(844222656);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ProfileResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term2695;
        callMethod(klass, "setFrameId", argTypes, term2632, args);
    }

};


