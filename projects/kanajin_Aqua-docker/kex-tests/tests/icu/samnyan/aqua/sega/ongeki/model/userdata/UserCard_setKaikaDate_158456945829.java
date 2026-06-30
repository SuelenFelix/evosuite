package icu.samnyan.aqua.sega.ongeki.model.userdata;

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
import static icu.samnyan.aqua.sega.ongeki.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;

public class UserCard_setKaikaDate_158456945829 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term127510;

    public UserCard_setKaikaDate_158456945829() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term127516 = new Long(-5656664340499957324L);
        term127510 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserCard"));
        Object term127512 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term127514 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term127530 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term127531 = newInstance(Class.forName("java.time.LocalDate"));
        Object term127535 = newInstance(Class.forName("java.time.LocalTime"));
        Object term127540 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term127541 = newInstance(Class.forName("java.time.LocalDate"));
        Object term127545 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term127510, term127510.getClass(), "id", -3982258599740853724L);
        setLongField(term127512, term127512.getClass(), "id", -2804545249633416262L);
        setLongField(term127514, term127514.getClass(), "id", 5592947525472221721L);
        setField(term127514, term127514.getClass(), "extId", term127516);
        setField(term127514, term127514.getClass(), "luid", "YsUKZpMHKF");
        setIntField(term127531, term127531.getClass(), "year", 2013);
        setShortField(term127531, term127531.getClass(), "month", (short) 12);
        setShortField(term127531, term127531.getClass(), "day", (short) 7);
        setField(term127530, term127530.getClass(), "date", term127531);
        setByteField(term127535, term127535.getClass(), "hour", (byte) 15);
        setByteField(term127535, term127535.getClass(), "minute", (byte) 56);
        setByteField(term127535, term127535.getClass(), "second", (byte) 2);
        setIntField(term127535, term127535.getClass(), "nano", 550722676);
        setField(term127530, term127530.getClass(), "time", term127535);
        setField(term127514, term127514.getClass(), "registerTime", term127530);
        setIntField(term127541, term127541.getClass(), "year", 2014);
        setShortField(term127541, term127541.getClass(), "month", (short) 7);
        setShortField(term127541, term127541.getClass(), "day", (short) 18);
        setField(term127540, term127540.getClass(), "date", term127541);
        setByteField(term127545, term127545.getClass(), "hour", (byte) 19);
        setByteField(term127545, term127545.getClass(), "minute", (byte) 34);
        setByteField(term127545, term127545.getClass(), "second", (byte) 55);
        setIntField(term127545, term127545.getClass(), "nano", 945082868);
        setField(term127540, term127540.getClass(), "time", term127545);
        setField(term127514, term127514.getClass(), "accessTime", term127540);
        setField(term127512, term127512.getClass(), "card", term127514);
        setField(term127512, term127512.getClass(), "userName", "sPGChMFTge");
        setIntField(term127512, term127512.getClass(), "level", -939472836);
        setIntField(term127512, term127512.getClass(), "reincarnationNum", 924950442);
        setLongField(term127512, term127512.getClass(), "exp", -5062773658983070560L);
        setLongField(term127512, term127512.getClass(), "point", -6620150753372646285L);
        setLongField(term127512, term127512.getClass(), "totalPoint", 1852152909570858002L);
        setIntField(term127512, term127512.getClass(), "playCount", 154444104);
        setIntField(term127512, term127512.getClass(), "jewelCount", 1812340862);
        setIntField(term127512, term127512.getClass(), "totalJewelCount", 1048628494);
        setIntField(term127512, term127512.getClass(), "medalCount", -1259863856);
        setIntField(term127512, term127512.getClass(), "playerRating", 259620797);
        setIntField(term127512, term127512.getClass(), "highestRating", 592523230);
        setIntField(term127512, term127512.getClass(), "battlePoint", 729128701);
        setIntField(term127512, term127512.getClass(), "bestBattlePoint", -1990251566);
        setIntField(term127512, term127512.getClass(), "overDamageBattlePoint", 234165066);
        setBooleanField(term127512, term127512.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term127512, term127512.getClass(), "nameplateId", 1223931792);
        setIntField(term127512, term127512.getClass(), "trophyId", 1032967382);
        setIntField(term127512, term127512.getClass(), "cardId", 832942795);
        setIntField(term127512, term127512.getClass(), "characterId", 1812644002);
        setIntField(term127512, term127512.getClass(), "characterVoiceNo", -701090454);
        setIntField(term127512, term127512.getClass(), "tabSetting", -1986771984);
        setIntField(term127512, term127512.getClass(), "tabSortSetting", -1975052346);
        setIntField(term127512, term127512.getClass(), "cardCategorySetting", -619909309);
        setIntField(term127512, term127512.getClass(), "cardSortSetting", 277279565);
        setIntField(term127512, term127512.getClass(), "rivalScoreCategorySetting", -1030236289);
        setIntField(term127512, term127512.getClass(), "playedTutorialBit", -568331388);
        setIntField(term127512, term127512.getClass(), "firstTutorialCancelNum", 1558553325);
        setLongField(term127512, term127512.getClass(), "sumTechHighScore", -7508661649392926519L);
        setLongField(term127512, term127512.getClass(), "sumTechBasicHighScore", 5345162585257263140L);
        setLongField(term127512, term127512.getClass(), "sumTechAdvancedHighScore", 6981295457309326280L);
        setLongField(term127512, term127512.getClass(), "sumTechExpertHighScore", 6090702045418987615L);
        setLongField(term127512, term127512.getClass(), "sumTechMasterHighScore", -7221227647270629252L);
        setLongField(term127512, term127512.getClass(), "sumTechLunaticHighScore", 702377151909325473L);
        setLongField(term127512, term127512.getClass(), "sumBattleHighScore", -2505070346702997042L);
        setLongField(term127512, term127512.getClass(), "sumBattleBasicHighScore", -2280714044365409727L);
        setLongField(term127512, term127512.getClass(), "sumBattleAdvancedHighScore", -4523337691268229043L);
        setLongField(term127512, term127512.getClass(), "sumBattleExpertHighScore", 1793595070224541046L);
        setLongField(term127512, term127512.getClass(), "sumBattleMasterHighScore", -4971115993947209680L);
        setLongField(term127512, term127512.getClass(), "sumBattleLunaticHighScore", -8422750569803860744L);
        setField(term127512, term127512.getClass(), "eventWatchedDate", "DYmBIVURjz");
        setField(term127512, term127512.getClass(), "cmEventWatchedDate", "BotFhHNSzH");
        setField(term127512, term127512.getClass(), "firstGameId", "LcLfqpnOTW");
        setField(term127512, term127512.getClass(), "firstRomVersion", "hGwBHMBbGw");
        setField(term127512, term127512.getClass(), "firstDataVersion", "CzTiZXTrcB");
        setField(term127512, term127512.getClass(), "firstPlayDate", "HOEmWmVnLk");
        setField(term127512, term127512.getClass(), "lastGameId", "LxSzRiSUke");
        setField(term127512, term127512.getClass(), "lastRomVersion", "NxbQJWSXQu");
        setField(term127512, term127512.getClass(), "lastDataVersion", "ByfIvofaQE");
        setField(term127512, term127512.getClass(), "compatibleCmVersion", "xvhHgJLoQS");
        setField(term127512, term127512.getClass(), "lastPlayDate", "bKSYtrrxDp");
        setIntField(term127512, term127512.getClass(), "lastPlaceId", -401500792);
        setField(term127512, term127512.getClass(), "lastPlaceName", "fQYVEGPLIF");
        setIntField(term127512, term127512.getClass(), "lastRegionId", -1497822933);
        setField(term127512, term127512.getClass(), "lastRegionName", "qRwTBVZctS");
        setIntField(term127512, term127512.getClass(), "lastAllNetId", 1402422395);
        setField(term127512, term127512.getClass(), "lastClientId", "BRBDbdsahC");
        setIntField(term127512, term127512.getClass(), "lastUsedDeckId", -1842694062);
        setIntField(term127512, term127512.getClass(), "lastPlayMusicLevel", 1926671230);
        setIntField(term127512, term127512.getClass(), "lastEmoneyBrand", 591515356);
        setField(term127510, term127510.getClass(), "user", term127512);
        setIntField(term127510, term127510.getClass(), "cardId", -1);
        setIntField(term127510, term127510.getClass(), "digitalStock", 1);
        setIntField(term127510, term127510.getClass(), "analogStock", -496031198);
        setIntField(term127510, term127510.getClass(), "level", -2031306487);
        setIntField(term127510, term127510.getClass(), "maxLevel", 10);
        setIntField(term127510, term127510.getClass(), "exp", -266787195);
        setIntField(term127510, term127510.getClass(), "printCount", 1967526359);
        setIntField(term127510, term127510.getClass(), "useCount", -405827477);
        setBooleanField(term127510, term127510.getClass(), "isNew", true);
        setField(term127510, term127510.getClass(), "kaikaDate", "0000-00-00 00:00:00.0");
        setField(term127510, term127510.getClass(), "choKaikaDate", "0000-00-00 00:00:00.0");
        setIntField(term127510, term127510.getClass(), "skillId", -418743608);
        setBooleanField(term127510, term127510.getClass(), "isAcquired", true);
        setField(term127510, term127510.getClass(), "created", "0000-00-00 00:00:00.0");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserCard");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "TQAFOeWgvq";
        callMethod(klass, "setKaikaDate", argTypes, term127510, args);
    }

};


