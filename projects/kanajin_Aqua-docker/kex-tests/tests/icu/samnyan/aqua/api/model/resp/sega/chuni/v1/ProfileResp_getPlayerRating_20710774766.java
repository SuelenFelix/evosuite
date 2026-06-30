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

public class ProfileResp_getPlayerRating_20710774766 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term499;

    public ProfileResp_getPlayerRating_20710774766() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term499 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ProfileResp"));
        Object term541 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term542 = newInstance(Class.forName("java.time.LocalDate"));
        Object term546 = newInstance(Class.forName("java.time.LocalTime"));
        Object term551 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term552 = newInstance(Class.forName("java.time.LocalDate"));
        Object term556 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term499, term499.getClass(), "userName", "MxlszYVzRf");
        setIntField(term499, term499.getClass(), "level", -1588772968);
        setField(term499, term499.getClass(), "exp", "LQFpaHEwXR");
        setLongField(term499, term499.getClass(), "point", -6292278961887936280L);
        setLongField(term499, term499.getClass(), "totalPoint", -6645965768855543712L);
        setIntField(term499, term499.getClass(), "playCount", -93135961);
        setIntField(term499, term499.getClass(), "playerRating", -112921587);
        setIntField(term499, term499.getClass(), "highestRating", 933028652);
        setIntField(term499, term499.getClass(), "nameplateId", 287287233);
        setIntField(term499, term499.getClass(), "frameId", 962840079);
        setIntField(term499, term499.getClass(), "characterId", 1540719661);
        setIntField(term499, term499.getClass(), "trophyId", 1265463001);
        setIntField(term499, term499.getClass(), "totalMapNum", 335112684);
        setLongField(term499, term499.getClass(), "totalHiScore", 4784595517102746672L);
        setLongField(term499, term499.getClass(), "totalBasicHighScore", -7612550318181586304L);
        setLongField(term499, term499.getClass(), "totalAdvancedHighScore", -2170847986967241072L);
        setLongField(term499, term499.getClass(), "totalExpertHighScore", 4044358158040652353L);
        setLongField(term499, term499.getClass(), "totalMasterHighScore", -4443169559037975007L);
        setIntField(term499, term499.getClass(), "friendCount", 1551099402);
        setIntField(term542, term542.getClass(), "year", 2012);
        setShortField(term542, term542.getClass(), "month", (short) 9);
        setShortField(term542, term542.getClass(), "day", (short) 11);
        setField(term541, term541.getClass(), "date", term542);
        setByteField(term546, term546.getClass(), "hour", (byte) 22);
        setByteField(term546, term546.getClass(), "minute", (byte) 10);
        setByteField(term546, term546.getClass(), "second", (byte) 8);
        setIntField(term546, term546.getClass(), "nano", 380008862);
        setField(term541, term541.getClass(), "time", term546);
        setField(term499, term499.getClass(), "firstPlayDate", term541);
        setIntField(term552, term552.getClass(), "year", 2021);
        setShortField(term552, term552.getClass(), "month", (short) 9);
        setShortField(term552, term552.getClass(), "day", (short) 7);
        setField(term551, term551.getClass(), "date", term552);
        setByteField(term556, term556.getClass(), "hour", (byte) 5);
        setByteField(term556, term556.getClass(), "minute", (byte) 25);
        setByteField(term556, term556.getClass(), "second", (byte) 7);
        setIntField(term556, term556.getClass(), "nano", 755924076);
        setField(term551, term551.getClass(), "time", term556);
        setField(term499, term499.getClass(), "lastPlayDate", term551);
        setIntField(term499, term499.getClass(), "courseClass", -2027534003);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ProfileResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlayerRating", argTypes, term499, args);
    }

};


