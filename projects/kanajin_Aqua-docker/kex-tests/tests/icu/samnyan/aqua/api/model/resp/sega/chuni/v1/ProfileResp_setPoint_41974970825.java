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
import java.lang.Long;

public class ProfileResp_setPoint_41974970825 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2122;
     Object term2185;

    public ProfileResp_setPoint_41974970825() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2122 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ProfileResp"));
        Object term2164 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2165 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2169 = newInstance(Class.forName("java.time.LocalTime"));
        Object term2174 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2175 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2179 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term2122, term2122.getClass(), "userName", "UoYtihxVaS");
        setIntField(term2122, term2122.getClass(), "level", 2049577015);
        setField(term2122, term2122.getClass(), "exp", "JDswTTCZHV");
        setLongField(term2122, term2122.getClass(), "point", -5724112525188606013L);
        setLongField(term2122, term2122.getClass(), "totalPoint", -6100012593724108983L);
        setIntField(term2122, term2122.getClass(), "playCount", 1236004505);
        setIntField(term2122, term2122.getClass(), "playerRating", 1050765721);
        setIntField(term2122, term2122.getClass(), "highestRating", 474518942);
        setIntField(term2122, term2122.getClass(), "nameplateId", -1656687479);
        setIntField(term2122, term2122.getClass(), "frameId", -249614216);
        setIntField(term2122, term2122.getClass(), "characterId", 1870727665);
        setIntField(term2122, term2122.getClass(), "trophyId", -519881101);
        setIntField(term2122, term2122.getClass(), "totalMapNum", -680920524);
        setLongField(term2122, term2122.getClass(), "totalHiScore", 5465527210299101732L);
        setLongField(term2122, term2122.getClass(), "totalBasicHighScore", 4699157009689333952L);
        setLongField(term2122, term2122.getClass(), "totalAdvancedHighScore", -78240609295693193L);
        setLongField(term2122, term2122.getClass(), "totalExpertHighScore", 3090901538358721367L);
        setLongField(term2122, term2122.getClass(), "totalMasterHighScore", -1677189124507026637L);
        setIntField(term2122, term2122.getClass(), "friendCount", -916335264);
        setIntField(term2165, term2165.getClass(), "year", 2024);
        setShortField(term2165, term2165.getClass(), "month", (short) 5);
        setShortField(term2165, term2165.getClass(), "day", (short) 6);
        setField(term2164, term2164.getClass(), "date", term2165);
        setByteField(term2169, term2169.getClass(), "hour", (byte) 20);
        setByteField(term2169, term2169.getClass(), "minute", (byte) 14);
        setByteField(term2169, term2169.getClass(), "second", (byte) 27);
        setIntField(term2169, term2169.getClass(), "nano", 900636101);
        setField(term2164, term2164.getClass(), "time", term2169);
        setField(term2122, term2122.getClass(), "firstPlayDate", term2164);
        setIntField(term2175, term2175.getClass(), "year", 2021);
        setShortField(term2175, term2175.getClass(), "month", (short) 4);
        setShortField(term2175, term2175.getClass(), "day", (short) 17);
        setField(term2174, term2174.getClass(), "date", term2175);
        setByteField(term2179, term2179.getClass(), "hour", (byte) 4);
        setByteField(term2179, term2179.getClass(), "minute", (byte) 11);
        setByteField(term2179, term2179.getClass(), "second", (byte) 16);
        setIntField(term2179, term2179.getClass(), "nano", 509895858);
        setField(term2174, term2174.getClass(), "time", term2179);
        setField(term2122, term2122.getClass(), "lastPlayDate", term2174);
        setIntField(term2122, term2122.getClass(), "courseClass", -919416536);
        term2185 = new Long(4795660804170399986L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ProfileResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term2185;
        callMethod(klass, "setPoint", argTypes, term2122, args);
    }

};


