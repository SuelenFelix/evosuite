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
import java.lang.Integer;

public class ProfileResp_setOverPowerPoint_172843932257 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term121140;
     Object term121215;

    public ProfileResp_setOverPowerPoint_172843932257() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term121140 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ProfileResp"));
        Object term121183 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term121184 = newInstance(Class.forName("java.time.LocalDate"));
        Object term121188 = newInstance(Class.forName("java.time.LocalTime"));
        Object term121193 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term121194 = newInstance(Class.forName("java.time.LocalDate"));
        Object term121198 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term121140, term121140.getClass(), "userName", "wYKOwifIEg");
        setIntField(term121140, term121140.getClass(), "level", 2020156400);
        setField(term121140, term121140.getClass(), "exp", "CmnJlLSyYb");
        setLongField(term121140, term121140.getClass(), "point", 7669889891777642887L);
        setLongField(term121140, term121140.getClass(), "totalPoint", 5613234010220883734L);
        setIntField(term121140, term121140.getClass(), "playCount", -732695826);
        setIntField(term121140, term121140.getClass(), "playerRating", -1667608780);
        setIntField(term121140, term121140.getClass(), "highestRating", -1457801350);
        setIntField(term121140, term121140.getClass(), "nameplateId", 612731588);
        setIntField(term121140, term121140.getClass(), "frameId", -25079055);
        setIntField(term121140, term121140.getClass(), "characterId", 1160561511);
        setIntField(term121140, term121140.getClass(), "trophyId", -711337500);
        setIntField(term121140, term121140.getClass(), "totalMapNum", 341362925);
        setLongField(term121140, term121140.getClass(), "totalHiScore", 781303308630594465L);
        setLongField(term121140, term121140.getClass(), "totalBasicHighScore", 7907635136140347779L);
        setLongField(term121140, term121140.getClass(), "totalAdvancedHighScore", 8736615056458651519L);
        setLongField(term121140, term121140.getClass(), "totalExpertHighScore", -205013850356169564L);
        setLongField(term121140, term121140.getClass(), "totalMasterHighScore", 2567866333573355776L);
        setLongField(term121140, term121140.getClass(), "totalUltimaHighScore", -4237661676220857495L);
        setIntField(term121140, term121140.getClass(), "friendCount", -2084265426);
        setIntField(term121184, term121184.getClass(), "year", 2017);
        setShortField(term121184, term121184.getClass(), "month", (short) 3);
        setShortField(term121184, term121184.getClass(), "day", (short) 17);
        setField(term121183, term121183.getClass(), "date", term121184);
        setByteField(term121188, term121188.getClass(), "hour", (byte) 18);
        setByteField(term121188, term121188.getClass(), "minute", (byte) 18);
        setByteField(term121188, term121188.getClass(), "second", (byte) 2);
        setIntField(term121188, term121188.getClass(), "nano", 550459463);
        setField(term121183, term121183.getClass(), "time", term121188);
        setField(term121140, term121140.getClass(), "firstPlayDate", term121183);
        setIntField(term121194, term121194.getClass(), "year", 2027);
        setShortField(term121194, term121194.getClass(), "month", (short) 4);
        setShortField(term121194, term121194.getClass(), "day", (short) 18);
        setField(term121193, term121193.getClass(), "date", term121194);
        setByteField(term121198, term121198.getClass(), "hour", (byte) 17);
        setByteField(term121198, term121198.getClass(), "minute", (byte) 8);
        setByteField(term121198, term121198.getClass(), "second", (byte) 39);
        setIntField(term121198, term121198.getClass(), "nano", 448119880);
        setField(term121193, term121193.getClass(), "time", term121198);
        setField(term121140, term121140.getClass(), "lastPlayDate", term121193);
        setIntField(term121140, term121140.getClass(), "courseClass", 20281559);
        setIntField(term121140, term121140.getClass(), "overPowerPoint", -248111227);
        setIntField(term121140, term121140.getClass(), "overPowerRate", 119900888);
        setIntField(term121140, term121140.getClass(), "mapIconId", 1836451389);
        setIntField(term121140, term121140.getClass(), "voiceId", -115679238);
        setIntField(term121140, term121140.getClass(), "avatarWear", 490949581);
        setIntField(term121140, term121140.getClass(), "avatarHead", -222164691);
        setIntField(term121140, term121140.getClass(), "avatarFace", 1489599449);
        setIntField(term121140, term121140.getClass(), "avatarSkin", 1859799165);
        setIntField(term121140, term121140.getClass(), "avatarItem", -27334205);
        setIntField(term121140, term121140.getClass(), "avatarFront", 167127124);
        setIntField(term121140, term121140.getClass(), "avatarBack", 1122163226);
        term121215 = new Integer(-1453459867);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ProfileResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term121215;
        callMethod(klass, "setOverPowerPoint", argTypes, term121140, args);
    }

};


