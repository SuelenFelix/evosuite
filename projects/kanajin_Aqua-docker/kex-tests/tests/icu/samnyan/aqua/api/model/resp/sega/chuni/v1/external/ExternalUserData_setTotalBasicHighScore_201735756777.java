package icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external;

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
import static icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;

public class ExternalUserData_setTotalBasicHighScore_201735756777 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31022;
     Object term31273;

    public ExternalUserData_setTotalBasicHighScore_201735756777() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31022 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external.ExternalUserData"));
        Object term31047 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term31048 = newInstance(Class.forName("java.time.LocalDate"));
        Object term31052 = newInstance(Class.forName("java.time.LocalTime"));
        Object term31108 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term31109 = newInstance(Class.forName("java.time.LocalDate"));
        Object term31113 = newInstance(Class.forName("java.time.LocalTime"));
        Object term31156 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term31157 = newInstance(Class.forName("java.time.LocalDate"));
        Object term31161 = newInstance(Class.forName("java.time.LocalTime"));
        Object term31202 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term31203 = newInstance(Class.forName("java.time.LocalDate"));
        Object term31207 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term31022, term31022.getClass(), "accessCode", "PsTQDxNIld");
        setField(term31022, term31022.getClass(), "userName", "uoBijJjvaj");
        setIntField(term31048, term31048.getClass(), "year", 2021);
        setShortField(term31048, term31048.getClass(), "month", (short) 2);
        setShortField(term31048, term31048.getClass(), "day", (short) 5);
        setField(term31047, term31047.getClass(), "date", term31048);
        setByteField(term31052, term31052.getClass(), "hour", (byte) 20);
        setByteField(term31052, term31052.getClass(), "minute", (byte) 43);
        setByteField(term31052, term31052.getClass(), "second", (byte) 37);
        setIntField(term31052, term31052.getClass(), "nano", 191661361);
        setField(term31047, term31047.getClass(), "time", term31052);
        setField(term31022, term31022.getClass(), "lastLoginDate", term31047);
        setBooleanField(term31022, term31022.getClass(), "isWebJoin", false);
        setField(term31022, term31022.getClass(), "webLimitDate", "BdsLFSRWda");
        setIntField(term31022, term31022.getClass(), "level", 1471619998);
        setIntField(term31022, term31022.getClass(), "reincarnationNum", -1623489521);
        setField(term31022, term31022.getClass(), "exp", "tMhhBYonAI");
        setLongField(term31022, term31022.getClass(), "point", -8928717808154338062L);
        setLongField(term31022, term31022.getClass(), "totalPoint", 4628458998884457238L);
        setIntField(term31022, term31022.getClass(), "playCount", 1179937517);
        setIntField(term31022, term31022.getClass(), "multiPlayCount", 200150950);
        setIntField(term31022, term31022.getClass(), "multiWinCount", -366198044);
        setIntField(term31022, term31022.getClass(), "requestResCount", -1350380769);
        setIntField(term31022, term31022.getClass(), "acceptResCount", -1432215030);
        setIntField(term31022, term31022.getClass(), "successResCount", 1233186320);
        setIntField(term31022, term31022.getClass(), "playerRating", -1303269101);
        setIntField(term31022, term31022.getClass(), "highestRating", 1435572720);
        setIntField(term31022, term31022.getClass(), "nameplateId", 1437618365);
        setIntField(term31022, term31022.getClass(), "frameId", 1122535239);
        setIntField(term31022, term31022.getClass(), "characterId", 1158923260);
        setIntField(term31022, term31022.getClass(), "trophyId", 1633508772);
        setIntField(term31022, term31022.getClass(), "playedTutorialBit", -545275970);
        setIntField(term31022, term31022.getClass(), "firstTutorialCancelNum", 1355471365);
        setIntField(term31022, term31022.getClass(), "masterTutorialCancelNum", -1746962742);
        setIntField(term31022, term31022.getClass(), "totalRepertoireCount", -575810668);
        setIntField(term31022, term31022.getClass(), "totalMapNum", 256028547);
        setLongField(term31022, term31022.getClass(), "totalHiScore", -6806576523000182981L);
        setLongField(term31022, term31022.getClass(), "totalBasicHighScore", 6437032166810658671L);
        setLongField(term31022, term31022.getClass(), "totalAdvancedHighScore", 6044346825617132280L);
        setLongField(term31022, term31022.getClass(), "totalExpertHighScore", -4994148485124075625L);
        setLongField(term31022, term31022.getClass(), "totalMasterHighScore", -8842842172497711872L);
        setIntField(term31109, term31109.getClass(), "year", 2014);
        setShortField(term31109, term31109.getClass(), "month", (short) 5);
        setShortField(term31109, term31109.getClass(), "day", (short) 18);
        setField(term31108, term31108.getClass(), "date", term31109);
        setByteField(term31113, term31113.getClass(), "hour", (byte) 19);
        setByteField(term31113, term31113.getClass(), "minute", (byte) 25);
        setByteField(term31113, term31113.getClass(), "second", (byte) 8);
        setIntField(term31113, term31113.getClass(), "nano", 217186771);
        setField(term31108, term31108.getClass(), "time", term31113);
        setField(term31022, term31022.getClass(), "eventWatchedDate", term31108);
        setIntField(term31022, term31022.getClass(), "friendCount", -750603024);
        setBooleanField(term31022, term31022.getClass(), "isMaimai", false);
        setField(term31022, term31022.getClass(), "firstGameId", "AaQRshwIQC");
        setField(term31022, term31022.getClass(), "firstRomVersion", "rHgKCfgCsg");
        setField(term31022, term31022.getClass(), "firstDataVersion", "AWtIUOuutt");
        setIntField(term31157, term31157.getClass(), "year", 2023);
        setShortField(term31157, term31157.getClass(), "month", (short) 2);
        setShortField(term31157, term31157.getClass(), "day", (short) 27);
        setField(term31156, term31156.getClass(), "date", term31157);
        setByteField(term31161, term31161.getClass(), "hour", (byte) 5);
        setByteField(term31161, term31161.getClass(), "minute", (byte) 50);
        setByteField(term31161, term31161.getClass(), "second", (byte) 50);
        setIntField(term31161, term31161.getClass(), "nano", 528521692);
        setField(term31156, term31156.getClass(), "time", term31161);
        setField(term31022, term31022.getClass(), "firstPlayDate", term31156);
        setField(term31022, term31022.getClass(), "lastGameId", "jBgJZpHifl");
        setField(term31022, term31022.getClass(), "lastRomVersion", "azMTTmEXnh");
        setField(term31022, term31022.getClass(), "lastDataVersion", "BjJtxwsIpt");
        setIntField(term31203, term31203.getClass(), "year", 2017);
        setShortField(term31203, term31203.getClass(), "month", (short) 1);
        setShortField(term31203, term31203.getClass(), "day", (short) 4);
        setField(term31202, term31202.getClass(), "date", term31203);
        setByteField(term31207, term31207.getClass(), "hour", (byte) 17);
        setByteField(term31207, term31207.getClass(), "minute", (byte) 39);
        setByteField(term31207, term31207.getClass(), "second", (byte) 5);
        setIntField(term31207, term31207.getClass(), "nano", 712424493);
        setField(term31202, term31202.getClass(), "time", term31207);
        setField(term31022, term31022.getClass(), "lastPlayDate", term31202);
        setIntField(term31022, term31022.getClass(), "lastPlaceId", 1255234202);
        setField(term31022, term31022.getClass(), "lastPlaceName", "gUQhOyGfzF");
        setField(term31022, term31022.getClass(), "lastRegionId", "IqDObvPBZX");
        setField(term31022, term31022.getClass(), "lastRegionName", "NITCrIISoC");
        setField(term31022, term31022.getClass(), "lastAllNetId", "nSzzeexTDI");
        setField(term31022, term31022.getClass(), "lastClientId", "WBrpvMhmsz");
        term31273 = new Long(-5367775625638780650L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term31273;
        callMethod(klass, "setTotalBasicHighScore", argTypes, term31022, args);
    }

};


