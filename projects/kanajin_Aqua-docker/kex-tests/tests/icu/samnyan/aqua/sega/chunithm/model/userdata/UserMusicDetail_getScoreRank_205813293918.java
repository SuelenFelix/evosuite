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

public class UserMusicDetail_getScoreRank_205813293918 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term95647;

    public UserMusicDetail_getScoreRank_205813293918() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term95653 = new Long(3090901538358721367L);
        term95647 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserMusicDetail"));
        Object term95649 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term95651 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term95667 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term95668 = newInstance(Class.forName("java.time.LocalDate"));
        Object term95672 = newInstance(Class.forName("java.time.LocalTime"));
        Object term95677 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term95678 = newInstance(Class.forName("java.time.LocalDate"));
        Object term95682 = newInstance(Class.forName("java.time.LocalTime"));
        Object term95699 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term95700 = newInstance(Class.forName("java.time.LocalDate"));
        Object term95704 = newInstance(Class.forName("java.time.LocalTime"));
        Object term95760 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term95761 = newInstance(Class.forName("java.time.LocalDate"));
        Object term95765 = newInstance(Class.forName("java.time.LocalTime"));
        Object term95808 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term95809 = newInstance(Class.forName("java.time.LocalDate"));
        Object term95813 = newInstance(Class.forName("java.time.LocalTime"));
        Object term95854 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term95855 = newInstance(Class.forName("java.time.LocalDate"));
        Object term95859 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term95647, term95647.getClass(), "id", -7014938412778189699L);
        setLongField(term95649, term95649.getClass(), "id", -5238153807729345644L);
        setLongField(term95651, term95651.getClass(), "id", -2355117979885740284L);
        setField(term95651, term95651.getClass(), "extId", term95653);
        setField(term95651, term95651.getClass(), "luid", "lfirJwUftT");
        setIntField(term95668, term95668.getClass(), "year", 2023);
        setShortField(term95668, term95668.getClass(), "month", (short) 7);
        setShortField(term95668, term95668.getClass(), "day", (short) 23);
        setField(term95667, term95667.getClass(), "date", term95668);
        setByteField(term95672, term95672.getClass(), "hour", (byte) 14);
        setByteField(term95672, term95672.getClass(), "minute", (byte) 20);
        setByteField(term95672, term95672.getClass(), "second", (byte) 6);
        setIntField(term95672, term95672.getClass(), "nano", 595815701);
        setField(term95667, term95667.getClass(), "time", term95672);
        setField(term95651, term95651.getClass(), "registerTime", term95667);
        setIntField(term95678, term95678.getClass(), "year", 2010);
        setShortField(term95678, term95678.getClass(), "month", (short) 7);
        setShortField(term95678, term95678.getClass(), "day", (short) 20);
        setField(term95677, term95677.getClass(), "date", term95678);
        setByteField(term95682, term95682.getClass(), "hour", (byte) 6);
        setByteField(term95682, term95682.getClass(), "minute", (byte) 46);
        setByteField(term95682, term95682.getClass(), "second", (byte) 28);
        setIntField(term95682, term95682.getClass(), "nano", 655649977);
        setField(term95677, term95677.getClass(), "time", term95682);
        setField(term95651, term95651.getClass(), "accessTime", term95677);
        setField(term95649, term95649.getClass(), "card", term95651);
        setField(term95649, term95649.getClass(), "userName", "oiIvvyhWbf");
        setIntField(term95700, term95700.getClass(), "year", 2024);
        setShortField(term95700, term95700.getClass(), "month", (short) 6);
        setShortField(term95700, term95700.getClass(), "day", (short) 3);
        setField(term95699, term95699.getClass(), "date", term95700);
        setByteField(term95704, term95704.getClass(), "hour", (byte) 12);
        setByteField(term95704, term95704.getClass(), "minute", (byte) 29);
        setByteField(term95704, term95704.getClass(), "second", (byte) 23);
        setIntField(term95704, term95704.getClass(), "nano", 147581455);
        setField(term95699, term95699.getClass(), "time", term95704);
        setField(term95649, term95649.getClass(), "lastLoginDate", term95699);
        setBooleanField(term95649, term95649.getClass(), "isWebJoin", true);
        setField(term95649, term95649.getClass(), "webLimitDate", "EhCoIxBpMd");
        setIntField(term95649, term95649.getClass(), "level", -743417086);
        setIntField(term95649, term95649.getClass(), "reincarnationNum", 2040843352);
        setField(term95649, term95649.getClass(), "exp", "bUOSwRmGmB");
        setLongField(term95649, term95649.getClass(), "point", -7496552559644191814L);
        setLongField(term95649, term95649.getClass(), "totalPoint", -8354421580727921114L);
        setIntField(term95649, term95649.getClass(), "playCount", 1204883248);
        setIntField(term95649, term95649.getClass(), "multiPlayCount", -388281703);
        setIntField(term95649, term95649.getClass(), "multiWinCount", 565641932);
        setIntField(term95649, term95649.getClass(), "requestResCount", -648267047);
        setIntField(term95649, term95649.getClass(), "acceptResCount", -2094100197);
        setIntField(term95649, term95649.getClass(), "successResCount", 1058557611);
        setIntField(term95649, term95649.getClass(), "playerRating", 43971669);
        setIntField(term95649, term95649.getClass(), "highestRating", 1611498185);
        setIntField(term95649, term95649.getClass(), "nameplateId", 2091252305);
        setIntField(term95649, term95649.getClass(), "frameId", 263368957);
        setIntField(term95649, term95649.getClass(), "characterId", 1664066639);
        setIntField(term95649, term95649.getClass(), "trophyId", -1987739959);
        setIntField(term95649, term95649.getClass(), "playedTutorialBit", -1921996045);
        setIntField(term95649, term95649.getClass(), "firstTutorialCancelNum", 1689248062);
        setIntField(term95649, term95649.getClass(), "masterTutorialCancelNum", -155559246);
        setIntField(term95649, term95649.getClass(), "totalRepertoireCount", -2121439077);
        setIntField(term95649, term95649.getClass(), "totalMapNum", 1640516155);
        setLongField(term95649, term95649.getClass(), "totalHiScore", -618571331806918749L);
        setLongField(term95649, term95649.getClass(), "totalBasicHighScore", -1963615592479122073L);
        setLongField(term95649, term95649.getClass(), "totalAdvancedHighScore", -2675023620754967902L);
        setLongField(term95649, term95649.getClass(), "totalExpertHighScore", 634576993708159924L);
        setLongField(term95649, term95649.getClass(), "totalMasterHighScore", 9144301579937337002L);
        setIntField(term95761, term95761.getClass(), "year", 2010);
        setShortField(term95761, term95761.getClass(), "month", (short) 6);
        setShortField(term95761, term95761.getClass(), "day", (short) 12);
        setField(term95760, term95760.getClass(), "date", term95761);
        setByteField(term95765, term95765.getClass(), "hour", (byte) 12);
        setByteField(term95765, term95765.getClass(), "minute", (byte) 48);
        setByteField(term95765, term95765.getClass(), "second", (byte) 35);
        setIntField(term95765, term95765.getClass(), "nano", 211694735);
        setField(term95760, term95760.getClass(), "time", term95765);
        setField(term95649, term95649.getClass(), "eventWatchedDate", term95760);
        setIntField(term95649, term95649.getClass(), "friendCount", 338143917);
        setBooleanField(term95649, term95649.getClass(), "isMaimai", false);
        setField(term95649, term95649.getClass(), "firstGameId", "jJzyVCBtLl");
        setField(term95649, term95649.getClass(), "firstRomVersion", "MZPPOYZzth");
        setField(term95649, term95649.getClass(), "firstDataVersion", "pxFICtkwAB");
        setIntField(term95809, term95809.getClass(), "year", 2024);
        setShortField(term95809, term95809.getClass(), "month", (short) 7);
        setShortField(term95809, term95809.getClass(), "day", (short) 11);
        setField(term95808, term95808.getClass(), "date", term95809);
        setByteField(term95813, term95813.getClass(), "hour", (byte) 9);
        setByteField(term95813, term95813.getClass(), "minute", (byte) 13);
        setByteField(term95813, term95813.getClass(), "second", (byte) 50);
        setIntField(term95813, term95813.getClass(), "nano", 434939078);
        setField(term95808, term95808.getClass(), "time", term95813);
        setField(term95649, term95649.getClass(), "firstPlayDate", term95808);
        setField(term95649, term95649.getClass(), "lastGameId", "MrgAxXXbMg");
        setField(term95649, term95649.getClass(), "lastRomVersion", "ZmwRRoQNPl");
        setField(term95649, term95649.getClass(), "lastDataVersion", "prNciwKNKW");
        setIntField(term95855, term95855.getClass(), "year", 2013);
        setShortField(term95855, term95855.getClass(), "month", (short) 7);
        setShortField(term95855, term95855.getClass(), "day", (short) 3);
        setField(term95854, term95854.getClass(), "date", term95855);
        setByteField(term95859, term95859.getClass(), "hour", (byte) 4);
        setByteField(term95859, term95859.getClass(), "minute", (byte) 51);
        setByteField(term95859, term95859.getClass(), "second", (byte) 27);
        setIntField(term95859, term95859.getClass(), "nano", 911930585);
        setField(term95854, term95854.getClass(), "time", term95859);
        setField(term95649, term95649.getClass(), "lastPlayDate", term95854);
        setIntField(term95649, term95649.getClass(), "lastPlaceId", 392977323);
        setField(term95649, term95649.getClass(), "lastPlaceName", "VtfNPRNIuG");
        setField(term95649, term95649.getClass(), "lastRegionId", "ttqikiUUcN");
        setField(term95649, term95649.getClass(), "lastRegionName", "NiLxAEvTVO");
        setField(term95649, term95649.getClass(), "lastAllNetId", "SffiObxUZK");
        setField(term95649, term95649.getClass(), "lastClientId", "uzPbXEJVpP");
        setField(term95647, term95647.getClass(), "user", term95649);
        setIntField(term95647, term95647.getClass(), "musicId", -794722040);
        setIntField(term95647, term95647.getClass(), "level", 464722569);
        setIntField(term95647, term95647.getClass(), "playCount", -12715882);
        setIntField(term95647, term95647.getClass(), "scoreMax", -1629082667);
        setIntField(term95647, term95647.getClass(), "resRequestCount", 1938805252);
        setIntField(term95647, term95647.getClass(), "resAcceptCount", 892926651);
        setIntField(term95647, term95647.getClass(), "resSuccessCount", 324394779);
        setIntField(term95647, term95647.getClass(), "missCount", 1334207398);
        setIntField(term95647, term95647.getClass(), "maxComboCount", 1899917071);
        setBooleanField(term95647, term95647.getClass(), "isFullCombo", false);
        setBooleanField(term95647, term95647.getClass(), "isAllJustice", false);
        setBooleanField(term95647, term95647.getClass(), "isSuccess", false);
        setIntField(term95647, term95647.getClass(), "fullChain", 2010556609);
        setIntField(term95647, term95647.getClass(), "maxChain", -328864713);
        setIntField(term95647, term95647.getClass(), "scoreRank", -624310741);
        setBooleanField(term95647, term95647.getClass(), "isLock", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserMusicDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getScoreRank", argTypes, term95647, args);
    }

};


