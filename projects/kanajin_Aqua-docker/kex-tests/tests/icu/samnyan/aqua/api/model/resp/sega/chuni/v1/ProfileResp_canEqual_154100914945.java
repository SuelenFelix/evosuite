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

public class ProfileResp_canEqual_154100914945 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3837;
     Object term3900;

    public ProfileResp_canEqual_154100914945() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3837 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ProfileResp"));
        Object term3879 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3880 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3884 = newInstance(Class.forName("java.time.LocalTime"));
        Object term3889 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3890 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3894 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term3837, term3837.getClass(), "userName", "GVizqqzXpy");
        setIntField(term3837, term3837.getClass(), "level", -2143043890);
        setField(term3837, term3837.getClass(), "exp", "JqXGgAhZPl");
        setLongField(term3837, term3837.getClass(), "point", -187772971269812453L);
        setLongField(term3837, term3837.getClass(), "totalPoint", 468487103823886117L);
        setIntField(term3837, term3837.getClass(), "playCount", -2138825831);
        setIntField(term3837, term3837.getClass(), "playerRating", 1454781562);
        setIntField(term3837, term3837.getClass(), "highestRating", -27944011);
        setIntField(term3837, term3837.getClass(), "nameplateId", -20614472);
        setIntField(term3837, term3837.getClass(), "frameId", 1126618861);
        setIntField(term3837, term3837.getClass(), "characterId", 947449400);
        setIntField(term3837, term3837.getClass(), "trophyId", -763799087);
        setIntField(term3837, term3837.getClass(), "totalMapNum", 1207142014);
        setLongField(term3837, term3837.getClass(), "totalHiScore", 4139034517298316285L);
        setLongField(term3837, term3837.getClass(), "totalBasicHighScore", 5797412846146719084L);
        setLongField(term3837, term3837.getClass(), "totalAdvancedHighScore", 5319740127125920367L);
        setLongField(term3837, term3837.getClass(), "totalExpertHighScore", 6465987664600701876L);
        setLongField(term3837, term3837.getClass(), "totalMasterHighScore", -136372844051852955L);
        setIntField(term3837, term3837.getClass(), "friendCount", -876426634);
        setIntField(term3880, term3880.getClass(), "year", 2021);
        setShortField(term3880, term3880.getClass(), "month", (short) 4);
        setShortField(term3880, term3880.getClass(), "day", (short) 26);
        setField(term3879, term3879.getClass(), "date", term3880);
        setByteField(term3884, term3884.getClass(), "hour", (byte) 11);
        setByteField(term3884, term3884.getClass(), "minute", (byte) 34);
        setByteField(term3884, term3884.getClass(), "second", (byte) 15);
        setIntField(term3884, term3884.getClass(), "nano", 638206023);
        setField(term3879, term3879.getClass(), "time", term3884);
        setField(term3837, term3837.getClass(), "firstPlayDate", term3879);
        setIntField(term3890, term3890.getClass(), "year", 2013);
        setShortField(term3890, term3890.getClass(), "month", (short) 9);
        setShortField(term3890, term3890.getClass(), "day", (short) 13);
        setField(term3889, term3889.getClass(), "date", term3890);
        setByteField(term3894, term3894.getClass(), "hour", (byte) 14);
        setByteField(term3894, term3894.getClass(), "minute", (byte) 36);
        setByteField(term3894, term3894.getClass(), "second", (byte) 59);
        setIntField(term3894, term3894.getClass(), "nano", 363124001);
        setField(term3889, term3889.getClass(), "time", term3894);
        setField(term3837, term3837.getClass(), "lastPlayDate", term3889);
        setIntField(term3837, term3837.getClass(), "courseClass", 213831054);
        term3900 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ProfileResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term3900;
        callMethod(klass, "canEqual", argTypes, term3837, args);
    }

};


