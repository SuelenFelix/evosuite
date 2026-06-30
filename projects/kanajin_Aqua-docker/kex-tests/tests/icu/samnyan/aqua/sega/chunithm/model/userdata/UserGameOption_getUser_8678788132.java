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

public class UserGameOption_getUser_8678788132 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49621;

    public UserGameOption_getUser_8678788132() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term49627 = new Long(6005241913654469005L);
        term49621 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGameOption"));
        Object term49623 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term49625 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term49641 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term49642 = newInstance(Class.forName("java.time.LocalDate"));
        Object term49646 = newInstance(Class.forName("java.time.LocalTime"));
        Object term49651 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term49652 = newInstance(Class.forName("java.time.LocalDate"));
        Object term49656 = newInstance(Class.forName("java.time.LocalTime"));
        Object term49673 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term49674 = newInstance(Class.forName("java.time.LocalDate"));
        Object term49678 = newInstance(Class.forName("java.time.LocalTime"));
        Object term49734 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term49735 = newInstance(Class.forName("java.time.LocalDate"));
        Object term49739 = newInstance(Class.forName("java.time.LocalTime"));
        Object term49782 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term49783 = newInstance(Class.forName("java.time.LocalDate"));
        Object term49787 = newInstance(Class.forName("java.time.LocalTime"));
        Object term49828 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term49829 = newInstance(Class.forName("java.time.LocalDate"));
        Object term49833 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term49621, term49621.getClass(), "id", 1721306000453653222L);
        setLongField(term49623, term49623.getClass(), "id", -8538252445590221089L);
        setLongField(term49625, term49625.getClass(), "id", -6690821836959514088L);
        setField(term49625, term49625.getClass(), "extId", term49627);
        setField(term49625, term49625.getClass(), "luid", "JiSIFtJnYv");
        setIntField(term49642, term49642.getClass(), "year", 2016);
        setShortField(term49642, term49642.getClass(), "month", (short) 12);
        setShortField(term49642, term49642.getClass(), "day", (short) 20);
        setField(term49641, term49641.getClass(), "date", term49642);
        setByteField(term49646, term49646.getClass(), "hour", (byte) 20);
        setByteField(term49646, term49646.getClass(), "minute", (byte) 42);
        setByteField(term49646, term49646.getClass(), "second", (byte) 4);
        setIntField(term49646, term49646.getClass(), "nano", 499637837);
        setField(term49641, term49641.getClass(), "time", term49646);
        setField(term49625, term49625.getClass(), "registerTime", term49641);
        setIntField(term49652, term49652.getClass(), "year", 2017);
        setShortField(term49652, term49652.getClass(), "month", (short) 1);
        setShortField(term49652, term49652.getClass(), "day", (short) 2);
        setField(term49651, term49651.getClass(), "date", term49652);
        setByteField(term49656, term49656.getClass(), "hour", (byte) 17);
        setByteField(term49656, term49656.getClass(), "minute", (byte) 7);
        setByteField(term49656, term49656.getClass(), "second", (byte) 40);
        setIntField(term49656, term49656.getClass(), "nano", 688544705);
        setField(term49651, term49651.getClass(), "time", term49656);
        setField(term49625, term49625.getClass(), "accessTime", term49651);
        setField(term49623, term49623.getClass(), "card", term49625);
        setField(term49623, term49623.getClass(), "userName", "wxAHQRVgKc");
        setIntField(term49674, term49674.getClass(), "year", 2017);
        setShortField(term49674, term49674.getClass(), "month", (short) 8);
        setShortField(term49674, term49674.getClass(), "day", (short) 31);
        setField(term49673, term49673.getClass(), "date", term49674);
        setByteField(term49678, term49678.getClass(), "hour", (byte) 12);
        setByteField(term49678, term49678.getClass(), "minute", (byte) 32);
        setByteField(term49678, term49678.getClass(), "second", (byte) 28);
        setIntField(term49678, term49678.getClass(), "nano", 428210685);
        setField(term49673, term49673.getClass(), "time", term49678);
        setField(term49623, term49623.getClass(), "lastLoginDate", term49673);
        setBooleanField(term49623, term49623.getClass(), "isWebJoin", false);
        setField(term49623, term49623.getClass(), "webLimitDate", "bYsZEHeoeV");
        setIntField(term49623, term49623.getClass(), "level", 1877297875);
        setIntField(term49623, term49623.getClass(), "reincarnationNum", -614739795);
        setField(term49623, term49623.getClass(), "exp", "IwvwrQylib");
        setLongField(term49623, term49623.getClass(), "point", 5914687538634916345L);
        setLongField(term49623, term49623.getClass(), "totalPoint", -1596611740124054468L);
        setIntField(term49623, term49623.getClass(), "playCount", 1805124024);
        setIntField(term49623, term49623.getClass(), "multiPlayCount", -1415507503);
        setIntField(term49623, term49623.getClass(), "multiWinCount", 424884647);
        setIntField(term49623, term49623.getClass(), "requestResCount", -881760055);
        setIntField(term49623, term49623.getClass(), "acceptResCount", 873700519);
        setIntField(term49623, term49623.getClass(), "successResCount", 805310057);
        setIntField(term49623, term49623.getClass(), "playerRating", -107339699);
        setIntField(term49623, term49623.getClass(), "highestRating", -58728001);
        setIntField(term49623, term49623.getClass(), "nameplateId", 1013952192);
        setIntField(term49623, term49623.getClass(), "frameId", -986675483);
        setIntField(term49623, term49623.getClass(), "characterId", 337370099);
        setIntField(term49623, term49623.getClass(), "trophyId", -824145581);
        setIntField(term49623, term49623.getClass(), "playedTutorialBit", -769314399);
        setIntField(term49623, term49623.getClass(), "firstTutorialCancelNum", -59737304);
        setIntField(term49623, term49623.getClass(), "masterTutorialCancelNum", -1878753007);
        setIntField(term49623, term49623.getClass(), "totalRepertoireCount", -411059650);
        setIntField(term49623, term49623.getClass(), "totalMapNum", 811517871);
        setLongField(term49623, term49623.getClass(), "totalHiScore", -7304801244306393588L);
        setLongField(term49623, term49623.getClass(), "totalBasicHighScore", 1676018795123486151L);
        setLongField(term49623, term49623.getClass(), "totalAdvancedHighScore", 8578275227150470673L);
        setLongField(term49623, term49623.getClass(), "totalExpertHighScore", -2637969624924642017L);
        setLongField(term49623, term49623.getClass(), "totalMasterHighScore", 1486119760230388070L);
        setIntField(term49735, term49735.getClass(), "year", 2013);
        setShortField(term49735, term49735.getClass(), "month", (short) 8);
        setShortField(term49735, term49735.getClass(), "day", (short) 27);
        setField(term49734, term49734.getClass(), "date", term49735);
        setByteField(term49739, term49739.getClass(), "hour", (byte) 16);
        setByteField(term49739, term49739.getClass(), "minute", (byte) 55);
        setByteField(term49739, term49739.getClass(), "second", (byte) 23);
        setIntField(term49739, term49739.getClass(), "nano", 979193613);
        setField(term49734, term49734.getClass(), "time", term49739);
        setField(term49623, term49623.getClass(), "eventWatchedDate", term49734);
        setIntField(term49623, term49623.getClass(), "friendCount", -74980095);
        setBooleanField(term49623, term49623.getClass(), "isMaimai", false);
        setField(term49623, term49623.getClass(), "firstGameId", "ZWJgSttNjg");
        setField(term49623, term49623.getClass(), "firstRomVersion", "LQTIjJLkXH");
        setField(term49623, term49623.getClass(), "firstDataVersion", "RvkBwedFKx");
        setIntField(term49783, term49783.getClass(), "year", 2015);
        setShortField(term49783, term49783.getClass(), "month", (short) 1);
        setShortField(term49783, term49783.getClass(), "day", (short) 10);
        setField(term49782, term49782.getClass(), "date", term49783);
        setByteField(term49787, term49787.getClass(), "hour", (byte) 2);
        setByteField(term49787, term49787.getClass(), "minute", (byte) 48);
        setByteField(term49787, term49787.getClass(), "second", (byte) 41);
        setIntField(term49787, term49787.getClass(), "nano", 572611941);
        setField(term49782, term49782.getClass(), "time", term49787);
        setField(term49623, term49623.getClass(), "firstPlayDate", term49782);
        setField(term49623, term49623.getClass(), "lastGameId", "DYzWJljbaE");
        setField(term49623, term49623.getClass(), "lastRomVersion", "idwbHVHUcz");
        setField(term49623, term49623.getClass(), "lastDataVersion", "sWJHIWZMuX");
        setIntField(term49829, term49829.getClass(), "year", 2013);
        setShortField(term49829, term49829.getClass(), "month", (short) 10);
        setShortField(term49829, term49829.getClass(), "day", (short) 23);
        setField(term49828, term49828.getClass(), "date", term49829);
        setByteField(term49833, term49833.getClass(), "hour", (byte) 4);
        setByteField(term49833, term49833.getClass(), "minute", (byte) 33);
        setByteField(term49833, term49833.getClass(), "second", (byte) 51);
        setIntField(term49833, term49833.getClass(), "nano", 626320293);
        setField(term49828, term49828.getClass(), "time", term49833);
        setField(term49623, term49623.getClass(), "lastPlayDate", term49828);
        setIntField(term49623, term49623.getClass(), "lastPlaceId", -1303503886);
        setField(term49623, term49623.getClass(), "lastPlaceName", "PwMdJRwzDW");
        setField(term49623, term49623.getClass(), "lastRegionId", "sMiHxgXUuN");
        setField(term49623, term49623.getClass(), "lastRegionName", "oVChCWWDag");
        setField(term49623, term49623.getClass(), "lastAllNetId", "EteTxkDxin");
        setField(term49623, term49623.getClass(), "lastClientId", "mKgLwPdYbY");
        setField(term49621, term49621.getClass(), "user", term49623);
        setIntField(term49621, term49621.getClass(), "bgInfo", -199463835);
        setIntField(term49621, term49621.getClass(), "fieldColor", 847764025);
        setIntField(term49621, term49621.getClass(), "guideSound", 436004216);
        setIntField(term49621, term49621.getClass(), "soundEffect", 1327592820);
        setIntField(term49621, term49621.getClass(), "guideLine", 1056183374);
        setIntField(term49621, term49621.getClass(), "speed", 908916188);
        setIntField(term49621, term49621.getClass(), "optionSet", -2066943126);
        setIntField(term49621, term49621.getClass(), "matching", 670556171);
        setIntField(term49621, term49621.getClass(), "judgePos", -1727494705);
        setIntField(term49621, term49621.getClass(), "rating", -1168439000);
        setIntField(term49621, term49621.getClass(), "judgeJustice", -1552818345);
        setIntField(term49621, term49621.getClass(), "judgeAttack", -811708149);
        setIntField(term49621, term49621.getClass(), "headphone", 2060766727);
        setIntField(term49621, term49621.getClass(), "playerLevel", 1298229635);
        setIntField(term49621, term49621.getClass(), "successTap", -569196422);
        setIntField(term49621, term49621.getClass(), "successExTap", -394638810);
        setIntField(term49621, term49621.getClass(), "successSlideHold", 790706322);
        setIntField(term49621, term49621.getClass(), "successAir", 699712077);
        setIntField(term49621, term49621.getClass(), "successFlick", -97640679);
        setIntField(term49621, term49621.getClass(), "successSkill", 1484085042);
        setIntField(term49621, term49621.getClass(), "successTapTimbre", 1777726456);
        setIntField(term49621, term49621.getClass(), "privacy", -1376824764);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGameOption");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUser", argTypes, term49621, args);
    }

};


