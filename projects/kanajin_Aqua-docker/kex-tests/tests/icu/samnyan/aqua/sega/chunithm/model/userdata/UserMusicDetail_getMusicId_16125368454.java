package icu.samnyan.aqua.sega.chunithm.model.userdata;

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
import static icu.samnyan.aqua.sega.chunithm.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;

public class UserMusicDetail_getMusicId_16125368454 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term89431;

    public UserMusicDetail_getMusicId_16125368454() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term89437 = new Long(-8471550651709805183L);
        term89431 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserMusicDetail"));
        Object term89433 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term89435 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term89451 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term89452 = newInstance(Class.forName("java.time.LocalDate"));
        Object term89456 = newInstance(Class.forName("java.time.LocalTime"));
        Object term89461 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term89462 = newInstance(Class.forName("java.time.LocalDate"));
        Object term89466 = newInstance(Class.forName("java.time.LocalTime"));
        Object term89483 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term89484 = newInstance(Class.forName("java.time.LocalDate"));
        Object term89488 = newInstance(Class.forName("java.time.LocalTime"));
        Object term89544 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term89545 = newInstance(Class.forName("java.time.LocalDate"));
        Object term89549 = newInstance(Class.forName("java.time.LocalTime"));
        Object term89592 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term89593 = newInstance(Class.forName("java.time.LocalDate"));
        Object term89597 = newInstance(Class.forName("java.time.LocalTime"));
        Object term89638 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term89639 = newInstance(Class.forName("java.time.LocalDate"));
        Object term89643 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term89431, term89431.getClass(), "id", -5307421637859729894L);
        setLongField(term89433, term89433.getClass(), "id", -7052314256530764447L);
        setLongField(term89435, term89435.getClass(), "id", -5504583784484702218L);
        setField(term89435, term89435.getClass(), "extId", term89437);
        setField(term89435, term89435.getClass(), "luid", "XfdYCOWEXZ");
        setIntField(term89452, term89452.getClass(), "year", 2024);
        setShortField(term89452, term89452.getClass(), "month", (short) 1);
        setShortField(term89452, term89452.getClass(), "day", (short) 13);
        setField(term89451, term89451.getClass(), "date", term89452);
        setByteField(term89456, term89456.getClass(), "hour", (byte) 20);
        setByteField(term89456, term89456.getClass(), "minute", (byte) 37);
        setByteField(term89456, term89456.getClass(), "second", (byte) 58);
        setIntField(term89456, term89456.getClass(), "nano", 961119497);
        setField(term89451, term89451.getClass(), "time", term89456);
        setField(term89435, term89435.getClass(), "registerTime", term89451);
        setIntField(term89462, term89462.getClass(), "year", 2026);
        setShortField(term89462, term89462.getClass(), "month", (short) 12);
        setShortField(term89462, term89462.getClass(), "day", (short) 7);
        setField(term89461, term89461.getClass(), "date", term89462);
        setByteField(term89466, term89466.getClass(), "hour", (byte) 9);
        setByteField(term89466, term89466.getClass(), "minute", (byte) 14);
        setByteField(term89466, term89466.getClass(), "second", (byte) 59);
        setIntField(term89466, term89466.getClass(), "nano", 286434056);
        setField(term89461, term89461.getClass(), "time", term89466);
        setField(term89435, term89435.getClass(), "accessTime", term89461);
        setField(term89433, term89433.getClass(), "card", term89435);
        setField(term89433, term89433.getClass(), "userName", "aPbJKoMxFL");
        setIntField(term89484, term89484.getClass(), "year", 2024);
        setShortField(term89484, term89484.getClass(), "month", (short) 4);
        setShortField(term89484, term89484.getClass(), "day", (short) 4);
        setField(term89483, term89483.getClass(), "date", term89484);
        setByteField(term89488, term89488.getClass(), "hour", (byte) 21);
        setByteField(term89488, term89488.getClass(), "minute", (byte) 32);
        setByteField(term89488, term89488.getClass(), "second", (byte) 44);
        setIntField(term89488, term89488.getClass(), "nano", 890583556);
        setField(term89483, term89483.getClass(), "time", term89488);
        setField(term89433, term89433.getClass(), "lastLoginDate", term89483);
        setBooleanField(term89433, term89433.getClass(), "isWebJoin", false);
        setField(term89433, term89433.getClass(), "webLimitDate", "FgtqUFBPnP");
        setIntField(term89433, term89433.getClass(), "level", 13355218);
        setIntField(term89433, term89433.getClass(), "reincarnationNum", -904535263);
        setField(term89433, term89433.getClass(), "exp", "NUkHqaKZhA");
        setLongField(term89433, term89433.getClass(), "point", -717218840624209572L);
        setLongField(term89433, term89433.getClass(), "totalPoint", -2831937652710360219L);
        setIntField(term89433, term89433.getClass(), "playCount", 842353151);
        setIntField(term89433, term89433.getClass(), "multiPlayCount", -1777916559);
        setIntField(term89433, term89433.getClass(), "multiWinCount", 70751907);
        setIntField(term89433, term89433.getClass(), "requestResCount", 275138155);
        setIntField(term89433, term89433.getClass(), "acceptResCount", 1382281892);
        setIntField(term89433, term89433.getClass(), "successResCount", -51331217);
        setIntField(term89433, term89433.getClass(), "playerRating", -803545267);
        setIntField(term89433, term89433.getClass(), "highestRating", -388367706);
        setIntField(term89433, term89433.getClass(), "nameplateId", 183138801);
        setIntField(term89433, term89433.getClass(), "frameId", 688821159);
        setIntField(term89433, term89433.getClass(), "characterId", -150882692);
        setIntField(term89433, term89433.getClass(), "trophyId", -1519638017);
        setIntField(term89433, term89433.getClass(), "playedTutorialBit", 195629114);
        setIntField(term89433, term89433.getClass(), "firstTutorialCancelNum", -849598898);
        setIntField(term89433, term89433.getClass(), "masterTutorialCancelNum", 1081526364);
        setIntField(term89433, term89433.getClass(), "totalRepertoireCount", 1306371805);
        setIntField(term89433, term89433.getClass(), "totalMapNum", -1780897540);
        setLongField(term89433, term89433.getClass(), "totalHiScore", 5283775914828093148L);
        setLongField(term89433, term89433.getClass(), "totalBasicHighScore", -5297448090819479208L);
        setLongField(term89433, term89433.getClass(), "totalAdvancedHighScore", -2018377284090852639L);
        setLongField(term89433, term89433.getClass(), "totalExpertHighScore", -5415594352357248437L);
        setLongField(term89433, term89433.getClass(), "totalMasterHighScore", -9020854345282284171L);
        setIntField(term89545, term89545.getClass(), "year", 2024);
        setShortField(term89545, term89545.getClass(), "month", (short) 2);
        setShortField(term89545, term89545.getClass(), "day", (short) 18);
        setField(term89544, term89544.getClass(), "date", term89545);
        setByteField(term89549, term89549.getClass(), "hour", (byte) 2);
        setByteField(term89549, term89549.getClass(), "minute", (byte) 30);
        setByteField(term89549, term89549.getClass(), "second", (byte) 53);
        setIntField(term89549, term89549.getClass(), "nano", 510978511);
        setField(term89544, term89544.getClass(), "time", term89549);
        setField(term89433, term89433.getClass(), "eventWatchedDate", term89544);
        setIntField(term89433, term89433.getClass(), "friendCount", 1460754129);
        setBooleanField(term89433, term89433.getClass(), "isMaimai", true);
        setField(term89433, term89433.getClass(), "firstGameId", "kHSkpGasYO");
        setField(term89433, term89433.getClass(), "firstRomVersion", "OvTdHngAsq");
        setField(term89433, term89433.getClass(), "firstDataVersion", "dlLhtWVZjw");
        setIntField(term89593, term89593.getClass(), "year", 2029);
        setShortField(term89593, term89593.getClass(), "month", (short) 12);
        setShortField(term89593, term89593.getClass(), "day", (short) 20);
        setField(term89592, term89592.getClass(), "date", term89593);
        setByteField(term89597, term89597.getClass(), "hour", (byte) 12);
        setByteField(term89597, term89597.getClass(), "minute", (byte) 40);
        setByteField(term89597, term89597.getClass(), "second", (byte) 30);
        setIntField(term89597, term89597.getClass(), "nano", 927903151);
        setField(term89592, term89592.getClass(), "time", term89597);
        setField(term89433, term89433.getClass(), "firstPlayDate", term89592);
        setField(term89433, term89433.getClass(), "lastGameId", "bGfglrDSXT");
        setField(term89433, term89433.getClass(), "lastRomVersion", "sIrqbajnbs");
        setField(term89433, term89433.getClass(), "lastDataVersion", "AaxFofoThl");
        setIntField(term89639, term89639.getClass(), "year", 2011);
        setShortField(term89639, term89639.getClass(), "month", (short) 9);
        setShortField(term89639, term89639.getClass(), "day", (short) 13);
        setField(term89638, term89638.getClass(), "date", term89639);
        setByteField(term89643, term89643.getClass(), "hour", (byte) 23);
        setByteField(term89643, term89643.getClass(), "minute", (byte) 46);
        setByteField(term89643, term89643.getClass(), "second", (byte) 54);
        setIntField(term89643, term89643.getClass(), "nano", 701561816);
        setField(term89638, term89638.getClass(), "time", term89643);
        setField(term89433, term89433.getClass(), "lastPlayDate", term89638);
        setIntField(term89433, term89433.getClass(), "lastPlaceId", 1529697463);
        setField(term89433, term89433.getClass(), "lastPlaceName", "ukaqYcLsKW");
        setField(term89433, term89433.getClass(), "lastRegionId", "EZLBboYbhD");
        setField(term89433, term89433.getClass(), "lastRegionName", "bZISImXSTe");
        setField(term89433, term89433.getClass(), "lastAllNetId", "yrKoMMHHHY");
        setField(term89433, term89433.getClass(), "lastClientId", "JqDCwLjqnp");
        setField(term89431, term89431.getClass(), "user", term89433);
        setIntField(term89431, term89431.getClass(), "musicId", 26790762);
        setIntField(term89431, term89431.getClass(), "level", 1788263953);
        setIntField(term89431, term89431.getClass(), "playCount", -1672203019);
        setIntField(term89431, term89431.getClass(), "scoreMax", -1184413887);
        setIntField(term89431, term89431.getClass(), "resRequestCount", -831173295);
        setIntField(term89431, term89431.getClass(), "resAcceptCount", 1563333150);
        setIntField(term89431, term89431.getClass(), "resSuccessCount", -766475202);
        setIntField(term89431, term89431.getClass(), "missCount", 1362362674);
        setIntField(term89431, term89431.getClass(), "maxComboCount", 553585097);
        setBooleanField(term89431, term89431.getClass(), "isFullCombo", false);
        setBooleanField(term89431, term89431.getClass(), "isAllJustice", false);
        setBooleanField(term89431, term89431.getClass(), "isSuccess", true);
        setIntField(term89431, term89431.getClass(), "fullChain", 1212393039);
        setIntField(term89431, term89431.getClass(), "maxChain", -1346793067);
        setIntField(term89431, term89431.getClass(), "scoreRank", 517580821);
        setBooleanField(term89431, term89431.getClass(), "isLock", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserMusicDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMusicId", argTypes, term89431, args);
    }

};


