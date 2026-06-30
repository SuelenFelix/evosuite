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

public class ProfileResp_setTotalHiScore_50133252335 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2972;
     Object term3035;

    public ProfileResp_setTotalHiScore_50133252335() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2972 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ProfileResp"));
        Object term3014 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3015 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3019 = newInstance(Class.forName("java.time.LocalTime"));
        Object term3024 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3025 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3029 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term2972, term2972.getClass(), "userName", "JUmudUmaaV");
        setIntField(term2972, term2972.getClass(), "level", 2143282300);
        setField(term2972, term2972.getClass(), "exp", "KoyGrUJeJW");
        setLongField(term2972, term2972.getClass(), "point", -67485388932970712L);
        setLongField(term2972, term2972.getClass(), "totalPoint", 5806367330808555223L);
        setIntField(term2972, term2972.getClass(), "playCount", 1137624258);
        setIntField(term2972, term2972.getClass(), "playerRating", 977862393);
        setIntField(term2972, term2972.getClass(), "highestRating", 301401782);
        setIntField(term2972, term2972.getClass(), "nameplateId", 1988605357);
        setIntField(term2972, term2972.getClass(), "frameId", 808203320);
        setIntField(term2972, term2972.getClass(), "characterId", -544382127);
        setIntField(term2972, term2972.getClass(), "trophyId", -1830198043);
        setIntField(term2972, term2972.getClass(), "totalMapNum", -439048495);
        setLongField(term2972, term2972.getClass(), "totalHiScore", 4576699120365923235L);
        setLongField(term2972, term2972.getClass(), "totalBasicHighScore", -1635471392209071620L);
        setLongField(term2972, term2972.getClass(), "totalAdvancedHighScore", -4714000263923324167L);
        setLongField(term2972, term2972.getClass(), "totalExpertHighScore", 6906379511067694917L);
        setLongField(term2972, term2972.getClass(), "totalMasterHighScore", -9204303423581447271L);
        setIntField(term2972, term2972.getClass(), "friendCount", -1849105286);
        setIntField(term3015, term3015.getClass(), "year", 2022);
        setShortField(term3015, term3015.getClass(), "month", (short) 4);
        setShortField(term3015, term3015.getClass(), "day", (short) 15);
        setField(term3014, term3014.getClass(), "date", term3015);
        setByteField(term3019, term3019.getClass(), "hour", (byte) 20);
        setByteField(term3019, term3019.getClass(), "minute", (byte) 58);
        setByteField(term3019, term3019.getClass(), "second", (byte) 46);
        setIntField(term3019, term3019.getClass(), "nano", 435562727);
        setField(term3014, term3014.getClass(), "time", term3019);
        setField(term2972, term2972.getClass(), "firstPlayDate", term3014);
        setIntField(term3025, term3025.getClass(), "year", 2026);
        setShortField(term3025, term3025.getClass(), "month", (short) 10);
        setShortField(term3025, term3025.getClass(), "day", (short) 31);
        setField(term3024, term3024.getClass(), "date", term3025);
        setByteField(term3029, term3029.getClass(), "hour", (byte) 17);
        setByteField(term3029, term3029.getClass(), "minute", (byte) 6);
        setByteField(term3029, term3029.getClass(), "second", (byte) 30);
        setIntField(term3029, term3029.getClass(), "nano", 785931660);
        setField(term3024, term3024.getClass(), "time", term3029);
        setField(term2972, term2972.getClass(), "lastPlayDate", term3024);
        setIntField(term2972, term2972.getClass(), "courseClass", 1334483645);
        term3035 = new Long(6248239231585852341L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ProfileResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term3035;
        callMethod(klass, "setTotalHiScore", argTypes, term2972, args);
    }

};


