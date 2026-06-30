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

public class ProfileResp_setPlayerRating_113455191028 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2377;
     Object term2440;

    public ProfileResp_setPlayerRating_113455191028() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2377 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ProfileResp"));
        Object term2419 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2420 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2424 = newInstance(Class.forName("java.time.LocalTime"));
        Object term2429 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2430 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2434 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term2377, term2377.getClass(), "userName", "ytSBIKXogI");
        setIntField(term2377, term2377.getClass(), "level", -1835839814);
        setField(term2377, term2377.getClass(), "exp", "nHXjMycHlU");
        setLongField(term2377, term2377.getClass(), "point", 4199886998224701110L);
        setLongField(term2377, term2377.getClass(), "totalPoint", 8540994973773607992L);
        setIntField(term2377, term2377.getClass(), "playCount", -1404350380);
        setIntField(term2377, term2377.getClass(), "playerRating", -2013924238);
        setIntField(term2377, term2377.getClass(), "highestRating", 579006268);
        setIntField(term2377, term2377.getClass(), "nameplateId", -1694747156);
        setIntField(term2377, term2377.getClass(), "frameId", 1466373988);
        setIntField(term2377, term2377.getClass(), "characterId", -358526505);
        setIntField(term2377, term2377.getClass(), "trophyId", 1843268026);
        setIntField(term2377, term2377.getClass(), "totalMapNum", 954660603);
        setLongField(term2377, term2377.getClass(), "totalHiScore", -2338103433822116635L);
        setLongField(term2377, term2377.getClass(), "totalBasicHighScore", -1885698929232124806L);
        setLongField(term2377, term2377.getClass(), "totalAdvancedHighScore", 5731563613239387113L);
        setLongField(term2377, term2377.getClass(), "totalExpertHighScore", 3381333711768010594L);
        setLongField(term2377, term2377.getClass(), "totalMasterHighScore", 3580984732036213717L);
        setIntField(term2377, term2377.getClass(), "friendCount", -1351605385);
        setIntField(term2420, term2420.getClass(), "year", 2022);
        setShortField(term2420, term2420.getClass(), "month", (short) 6);
        setShortField(term2420, term2420.getClass(), "day", (short) 20);
        setField(term2419, term2419.getClass(), "date", term2420);
        setByteField(term2424, term2424.getClass(), "hour", (byte) 7);
        setByteField(term2424, term2424.getClass(), "minute", (byte) 57);
        setByteField(term2424, term2424.getClass(), "second", (byte) 37);
        setIntField(term2424, term2424.getClass(), "nano", 90374877);
        setField(term2419, term2419.getClass(), "time", term2424);
        setField(term2377, term2377.getClass(), "firstPlayDate", term2419);
        setIntField(term2430, term2430.getClass(), "year", 2023);
        setShortField(term2430, term2430.getClass(), "month", (short) 2);
        setShortField(term2430, term2430.getClass(), "day", (short) 16);
        setField(term2429, term2429.getClass(), "date", term2430);
        setByteField(term2434, term2434.getClass(), "hour", (byte) 3);
        setByteField(term2434, term2434.getClass(), "minute", (byte) 18);
        setByteField(term2434, term2434.getClass(), "second", (byte) 56);
        setIntField(term2434, term2434.getClass(), "nano", 733017887);
        setField(term2429, term2429.getClass(), "time", term2434);
        setField(term2377, term2377.getClass(), "lastPlayDate", term2429);
        setIntField(term2377, term2377.getClass(), "courseClass", 278355793);
        term2440 = new Integer(-310648604);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ProfileResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term2440;
        callMethod(klass, "setPlayerRating", argTypes, term2377, args);
    }

};


