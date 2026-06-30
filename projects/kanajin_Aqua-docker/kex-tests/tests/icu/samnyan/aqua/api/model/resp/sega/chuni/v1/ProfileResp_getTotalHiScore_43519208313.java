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

public class ProfileResp_getTotalHiScore_43519208313 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1080;

    public ProfileResp_getTotalHiScore_43519208313() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1080 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ProfileResp"));
        Object term1122 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1123 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1127 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1132 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1133 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1137 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term1080, term1080.getClass(), "userName", "flxyYxBRtu");
        setIntField(term1080, term1080.getClass(), "level", 344323424);
        setField(term1080, term1080.getClass(), "exp", "OclPbYPkcH");
        setLongField(term1080, term1080.getClass(), "point", 5836128569274066678L);
        setLongField(term1080, term1080.getClass(), "totalPoint", -2177368829816872572L);
        setIntField(term1080, term1080.getClass(), "playCount", 9726679);
        setIntField(term1080, term1080.getClass(), "playerRating", -25637976);
        setIntField(term1080, term1080.getClass(), "highestRating", 1555897383);
        setIntField(term1080, term1080.getClass(), "nameplateId", 202001407);
        setIntField(term1080, term1080.getClass(), "frameId", 158873461);
        setIntField(term1080, term1080.getClass(), "characterId", -430151637);
        setIntField(term1080, term1080.getClass(), "trophyId", -1697741339);
        setIntField(term1080, term1080.getClass(), "totalMapNum", 98922530);
        setLongField(term1080, term1080.getClass(), "totalHiScore", -8463029266761149071L);
        setLongField(term1080, term1080.getClass(), "totalBasicHighScore", 3133860696238261492L);
        setLongField(term1080, term1080.getClass(), "totalAdvancedHighScore", 7247160664318067468L);
        setLongField(term1080, term1080.getClass(), "totalExpertHighScore", 2135754395358000892L);
        setLongField(term1080, term1080.getClass(), "totalMasterHighScore", -8085190702504231560L);
        setIntField(term1080, term1080.getClass(), "friendCount", -1388471422);
        setIntField(term1123, term1123.getClass(), "year", 2028);
        setShortField(term1123, term1123.getClass(), "month", (short) 10);
        setShortField(term1123, term1123.getClass(), "day", (short) 1);
        setField(term1122, term1122.getClass(), "date", term1123);
        setByteField(term1127, term1127.getClass(), "hour", (byte) 17);
        setByteField(term1127, term1127.getClass(), "minute", (byte) 29);
        setByteField(term1127, term1127.getClass(), "second", (byte) 30);
        setIntField(term1127, term1127.getClass(), "nano", 845472306);
        setField(term1122, term1122.getClass(), "time", term1127);
        setField(term1080, term1080.getClass(), "firstPlayDate", term1122);
        setIntField(term1133, term1133.getClass(), "year", 2027);
        setShortField(term1133, term1133.getClass(), "month", (short) 2);
        setShortField(term1133, term1133.getClass(), "day", (short) 19);
        setField(term1132, term1132.getClass(), "date", term1133);
        setByteField(term1137, term1137.getClass(), "hour", (byte) 17);
        setByteField(term1137, term1137.getClass(), "minute", (byte) 37);
        setByteField(term1137, term1137.getClass(), "second", (byte) 27);
        setIntField(term1137, term1137.getClass(), "nano", 920380537);
        setField(term1132, term1132.getClass(), "time", term1137);
        setField(term1080, term1080.getClass(), "lastPlayDate", term1132);
        setIntField(term1080, term1080.getClass(), "courseClass", -1498296052);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ProfileResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotalHiScore", argTypes, term1080, args);
    }

};


