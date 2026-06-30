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

public class ProfileResp_getTotalMapNum_37059143212 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term997;

    public ProfileResp_getTotalMapNum_37059143212() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term997 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ProfileResp"));
        Object term1039 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1040 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1044 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1049 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1050 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1054 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term997, term997.getClass(), "userName", "BYqFIqCKAV");
        setIntField(term997, term997.getClass(), "level", 96566506);
        setField(term997, term997.getClass(), "exp", "vrQLuWIDJX");
        setLongField(term997, term997.getClass(), "point", -8652538484981166496L);
        setLongField(term997, term997.getClass(), "totalPoint", 2701184207686293431L);
        setIntField(term997, term997.getClass(), "playCount", -343325701);
        setIntField(term997, term997.getClass(), "playerRating", 107945604);
        setIntField(term997, term997.getClass(), "highestRating", -1963464809);
        setIntField(term997, term997.getClass(), "nameplateId", 71190297);
        setIntField(term997, term997.getClass(), "frameId", 1202361360);
        setIntField(term997, term997.getClass(), "characterId", -2015048153);
        setIntField(term997, term997.getClass(), "trophyId", -2063457669);
        setIntField(term997, term997.getClass(), "totalMapNum", -1222006000);
        setLongField(term997, term997.getClass(), "totalHiScore", 4474998035090263139L);
        setLongField(term997, term997.getClass(), "totalBasicHighScore", 2848819812340321742L);
        setLongField(term997, term997.getClass(), "totalAdvancedHighScore", -8876856890348836498L);
        setLongField(term997, term997.getClass(), "totalExpertHighScore", 846579494941632714L);
        setLongField(term997, term997.getClass(), "totalMasterHighScore", 6689117472719450333L);
        setIntField(term997, term997.getClass(), "friendCount", 2095798786);
        setIntField(term1040, term1040.getClass(), "year", 2025);
        setShortField(term1040, term1040.getClass(), "month", (short) 3);
        setShortField(term1040, term1040.getClass(), "day", (short) 9);
        setField(term1039, term1039.getClass(), "date", term1040);
        setByteField(term1044, term1044.getClass(), "hour", (byte) 5);
        setByteField(term1044, term1044.getClass(), "minute", (byte) 49);
        setByteField(term1044, term1044.getClass(), "second", (byte) 12);
        setIntField(term1044, term1044.getClass(), "nano", 791695028);
        setField(term1039, term1039.getClass(), "time", term1044);
        setField(term997, term997.getClass(), "firstPlayDate", term1039);
        setIntField(term1050, term1050.getClass(), "year", 2023);
        setShortField(term1050, term1050.getClass(), "month", (short) 9);
        setShortField(term1050, term1050.getClass(), "day", (short) 23);
        setField(term1049, term1049.getClass(), "date", term1050);
        setByteField(term1054, term1054.getClass(), "hour", (byte) 12);
        setByteField(term1054, term1054.getClass(), "minute", (byte) 55);
        setByteField(term1054, term1054.getClass(), "second", (byte) 58);
        setIntField(term1054, term1054.getClass(), "nano", 159178396);
        setField(term1049, term1049.getClass(), "time", term1054);
        setField(term997, term997.getClass(), "lastPlayDate", term1049);
        setIntField(term997, term997.getClass(), "courseClass", -1565502840);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ProfileResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotalMapNum", argTypes, term997, args);
    }

};


