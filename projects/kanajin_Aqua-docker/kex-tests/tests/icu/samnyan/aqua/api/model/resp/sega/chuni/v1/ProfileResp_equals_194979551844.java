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

public class ProfileResp_equals_194979551844 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3753;
     Object term3816;

    public ProfileResp_equals_194979551844() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3753 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ProfileResp"));
        Object term3795 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3796 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3800 = newInstance(Class.forName("java.time.LocalTime"));
        Object term3805 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3806 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3810 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term3753, term3753.getClass(), "userName", "swZVeJAxjt");
        setIntField(term3753, term3753.getClass(), "level", 1964967720);
        setField(term3753, term3753.getClass(), "exp", "xOcJIiQQDu");
        setLongField(term3753, term3753.getClass(), "point", -1497280900081695731L);
        setLongField(term3753, term3753.getClass(), "totalPoint", -3602825674339018793L);
        setIntField(term3753, term3753.getClass(), "playCount", 1351900243);
        setIntField(term3753, term3753.getClass(), "playerRating", -330897705);
        setIntField(term3753, term3753.getClass(), "highestRating", 1065595802);
        setIntField(term3753, term3753.getClass(), "nameplateId", 21031843);
        setIntField(term3753, term3753.getClass(), "frameId", -380787857);
        setIntField(term3753, term3753.getClass(), "characterId", 319853052);
        setIntField(term3753, term3753.getClass(), "trophyId", -1097563716);
        setIntField(term3753, term3753.getClass(), "totalMapNum", 1572907769);
        setLongField(term3753, term3753.getClass(), "totalHiScore", 3086974592680165932L);
        setLongField(term3753, term3753.getClass(), "totalBasicHighScore", -532956263280568707L);
        setLongField(term3753, term3753.getClass(), "totalAdvancedHighScore", 6073193746616629086L);
        setLongField(term3753, term3753.getClass(), "totalExpertHighScore", -2463629530824341661L);
        setLongField(term3753, term3753.getClass(), "totalMasterHighScore", 7800835025296877231L);
        setIntField(term3753, term3753.getClass(), "friendCount", 1608016787);
        setIntField(term3796, term3796.getClass(), "year", 2013);
        setShortField(term3796, term3796.getClass(), "month", (short) 5);
        setShortField(term3796, term3796.getClass(), "day", (short) 9);
        setField(term3795, term3795.getClass(), "date", term3796);
        setByteField(term3800, term3800.getClass(), "hour", (byte) 4);
        setByteField(term3800, term3800.getClass(), "minute", (byte) 18);
        setByteField(term3800, term3800.getClass(), "second", (byte) 35);
        setIntField(term3800, term3800.getClass(), "nano", 909079395);
        setField(term3795, term3795.getClass(), "time", term3800);
        setField(term3753, term3753.getClass(), "firstPlayDate", term3795);
        setIntField(term3806, term3806.getClass(), "year", 2015);
        setShortField(term3806, term3806.getClass(), "month", (short) 3);
        setShortField(term3806, term3806.getClass(), "day", (short) 15);
        setField(term3805, term3805.getClass(), "date", term3806);
        setByteField(term3810, term3810.getClass(), "hour", (byte) 8);
        setByteField(term3810, term3810.getClass(), "minute", (byte) 45);
        setByteField(term3810, term3810.getClass(), "second", (byte) 29);
        setIntField(term3810, term3810.getClass(), "nano", 781486470);
        setField(term3805, term3805.getClass(), "time", term3810);
        setField(term3753, term3753.getClass(), "lastPlayDate", term3805);
        setIntField(term3753, term3753.getClass(), "courseClass", -516303035);
        term3816 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ProfileResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term3816;
        callMethod(klass, "equals", argTypes, term3753, args);
    }

};


