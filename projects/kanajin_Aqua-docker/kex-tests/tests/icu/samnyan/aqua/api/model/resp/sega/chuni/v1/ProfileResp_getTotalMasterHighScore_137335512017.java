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

public class ProfileResp_getTotalMasterHighScore_137335512017 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1412;

    public ProfileResp_getTotalMasterHighScore_137335512017() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1412 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ProfileResp"));
        Object term1454 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1455 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1459 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1464 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1465 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1469 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term1412, term1412.getClass(), "userName", "kuTXqwMtDB");
        setIntField(term1412, term1412.getClass(), "level", -1896376975);
        setField(term1412, term1412.getClass(), "exp", "Ghbwtircqb");
        setLongField(term1412, term1412.getClass(), "point", -7268507582722666254L);
        setLongField(term1412, term1412.getClass(), "totalPoint", 5671808784468963649L);
        setIntField(term1412, term1412.getClass(), "playCount", 729658803);
        setIntField(term1412, term1412.getClass(), "playerRating", 114754804);
        setIntField(term1412, term1412.getClass(), "highestRating", 1687361082);
        setIntField(term1412, term1412.getClass(), "nameplateId", 584893196);
        setIntField(term1412, term1412.getClass(), "frameId", 497269071);
        setIntField(term1412, term1412.getClass(), "characterId", -1899301124);
        setIntField(term1412, term1412.getClass(), "trophyId", -1882480155);
        setIntField(term1412, term1412.getClass(), "totalMapNum", -1410220680);
        setLongField(term1412, term1412.getClass(), "totalHiScore", 2297097306706899827L);
        setLongField(term1412, term1412.getClass(), "totalBasicHighScore", -900457279156388404L);
        setLongField(term1412, term1412.getClass(), "totalAdvancedHighScore", 1084801489398441516L);
        setLongField(term1412, term1412.getClass(), "totalExpertHighScore", 6273754186658578034L);
        setLongField(term1412, term1412.getClass(), "totalMasterHighScore", 3620247240684476031L);
        setIntField(term1412, term1412.getClass(), "friendCount", 389427431);
        setIntField(term1455, term1455.getClass(), "year", 2010);
        setShortField(term1455, term1455.getClass(), "month", (short) 5);
        setShortField(term1455, term1455.getClass(), "day", (short) 2);
        setField(term1454, term1454.getClass(), "date", term1455);
        setByteField(term1459, term1459.getClass(), "hour", (byte) 2);
        setByteField(term1459, term1459.getClass(), "minute", (byte) 22);
        setByteField(term1459, term1459.getClass(), "second", (byte) 33);
        setIntField(term1459, term1459.getClass(), "nano", 530835039);
        setField(term1454, term1454.getClass(), "time", term1459);
        setField(term1412, term1412.getClass(), "firstPlayDate", term1454);
        setIntField(term1465, term1465.getClass(), "year", 2024);
        setShortField(term1465, term1465.getClass(), "month", (short) 4);
        setShortField(term1465, term1465.getClass(), "day", (short) 24);
        setField(term1464, term1464.getClass(), "date", term1465);
        setByteField(term1469, term1469.getClass(), "hour", (byte) 7);
        setByteField(term1469, term1469.getClass(), "minute", (byte) 2);
        setByteField(term1469, term1469.getClass(), "second", (byte) 51);
        setIntField(term1469, term1469.getClass(), "nano", 635502964);
        setField(term1464, term1464.getClass(), "time", term1469);
        setField(term1412, term1412.getClass(), "lastPlayDate", term1464);
        setIntField(term1412, term1412.getClass(), "courseClass", -1945706126);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ProfileResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotalMasterHighScore", argTypes, term1412, args);
    }

};


