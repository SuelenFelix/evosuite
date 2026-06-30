package icu.samnyan.aqua.api.model.resp.sega.chuni.v2;

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
import static icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ProfileResp_getTotalUltimaHighScore_156378699318 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term117333;

    public ProfileResp_getTotalUltimaHighScore_156378699318() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term117333 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ProfileResp"));
        Object term117376 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term117377 = newInstance(Class.forName("java.time.LocalDate"));
        Object term117381 = newInstance(Class.forName("java.time.LocalTime"));
        Object term117386 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term117387 = newInstance(Class.forName("java.time.LocalDate"));
        Object term117391 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term117333, term117333.getClass(), "userName", "ryVxyRTkkz");
        setIntField(term117333, term117333.getClass(), "level", 154353226);
        setField(term117333, term117333.getClass(), "exp", "NOFdXeSrBs");
        setLongField(term117333, term117333.getClass(), "point", 3934914242875060981L);
        setLongField(term117333, term117333.getClass(), "totalPoint", -8399638382262003730L);
        setIntField(term117333, term117333.getClass(), "playCount", 299409627);
        setIntField(term117333, term117333.getClass(), "playerRating", -706013845);
        setIntField(term117333, term117333.getClass(), "highestRating", 766699915);
        setIntField(term117333, term117333.getClass(), "nameplateId", -1323352297);
        setIntField(term117333, term117333.getClass(), "frameId", -1007225876);
        setIntField(term117333, term117333.getClass(), "characterId", 1248774754);
        setIntField(term117333, term117333.getClass(), "trophyId", 2077904668);
        setIntField(term117333, term117333.getClass(), "totalMapNum", 1306479234);
        setLongField(term117333, term117333.getClass(), "totalHiScore", 1122416832206282085L);
        setLongField(term117333, term117333.getClass(), "totalBasicHighScore", 8533632177187405209L);
        setLongField(term117333, term117333.getClass(), "totalAdvancedHighScore", 7691914418659253004L);
        setLongField(term117333, term117333.getClass(), "totalExpertHighScore", -8890905894692514776L);
        setLongField(term117333, term117333.getClass(), "totalMasterHighScore", 2347103903798520229L);
        setLongField(term117333, term117333.getClass(), "totalUltimaHighScore", 496363067304632356L);
        setIntField(term117333, term117333.getClass(), "friendCount", 1681115028);
        setIntField(term117377, term117377.getClass(), "year", 2019);
        setShortField(term117377, term117377.getClass(), "month", (short) 4);
        setShortField(term117377, term117377.getClass(), "day", (short) 18);
        setField(term117376, term117376.getClass(), "date", term117377);
        setByteField(term117381, term117381.getClass(), "hour", (byte) 16);
        setByteField(term117381, term117381.getClass(), "minute", (byte) 8);
        setByteField(term117381, term117381.getClass(), "second", (byte) 31);
        setIntField(term117381, term117381.getClass(), "nano", 962511524);
        setField(term117376, term117376.getClass(), "time", term117381);
        setField(term117333, term117333.getClass(), "firstPlayDate", term117376);
        setIntField(term117387, term117387.getClass(), "year", 2026);
        setShortField(term117387, term117387.getClass(), "month", (short) 4);
        setShortField(term117387, term117387.getClass(), "day", (short) 4);
        setField(term117386, term117386.getClass(), "date", term117387);
        setByteField(term117391, term117391.getClass(), "hour", (byte) 10);
        setByteField(term117391, term117391.getClass(), "minute", (byte) 22);
        setByteField(term117391, term117391.getClass(), "second", (byte) 11);
        setIntField(term117391, term117391.getClass(), "nano", 310470344);
        setField(term117386, term117386.getClass(), "time", term117391);
        setField(term117333, term117333.getClass(), "lastPlayDate", term117386);
        setIntField(term117333, term117333.getClass(), "courseClass", 1002142534);
        setIntField(term117333, term117333.getClass(), "overPowerPoint", 368800901);
        setIntField(term117333, term117333.getClass(), "overPowerRate", -1902302939);
        setIntField(term117333, term117333.getClass(), "mapIconId", 2024905986);
        setIntField(term117333, term117333.getClass(), "voiceId", 1622800045);
        setIntField(term117333, term117333.getClass(), "avatarWear", 2017632053);
        setIntField(term117333, term117333.getClass(), "avatarHead", -366812565);
        setIntField(term117333, term117333.getClass(), "avatarFace", 497333243);
        setIntField(term117333, term117333.getClass(), "avatarSkin", 1123613565);
        setIntField(term117333, term117333.getClass(), "avatarItem", -475188341);
        setIntField(term117333, term117333.getClass(), "avatarFront", 1625641062);
        setIntField(term117333, term117333.getClass(), "avatarBack", 1142191137);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ProfileResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotalUltimaHighScore", argTypes, term117333, args);
    }

};


