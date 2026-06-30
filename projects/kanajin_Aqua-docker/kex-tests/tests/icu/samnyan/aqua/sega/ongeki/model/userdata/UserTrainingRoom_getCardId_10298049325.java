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

public class UserTrainingRoom_getCardId_10298049325 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15242;

    public UserTrainingRoom_getCardId_10298049325() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term15248 = new Long(1233889271256172047L);
        term15242 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserTrainingRoom"));
        Object term15244 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term15246 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term15262 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term15263 = newInstance(Class.forName("java.time.LocalDate"));
        Object term15267 = newInstance(Class.forName("java.time.LocalTime"));
        Object term15272 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term15273 = newInstance(Class.forName("java.time.LocalDate"));
        Object term15277 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term15242, term15242.getClass(), "id", 8965244485590834147L);
        setLongField(term15244, term15244.getClass(), "id", -4825509285016265943L);
        setLongField(term15246, term15246.getClass(), "id", -1283563319051310751L);
        setField(term15246, term15246.getClass(), "extId", term15248);
        setField(term15246, term15246.getClass(), "luid", "FftYCNbnks");
        setIntField(term15263, term15263.getClass(), "year", 2022);
        setShortField(term15263, term15263.getClass(), "month", (short) 4);
        setShortField(term15263, term15263.getClass(), "day", (short) 15);
        setField(term15262, term15262.getClass(), "date", term15263);
        setByteField(term15267, term15267.getClass(), "hour", (byte) 20);
        setByteField(term15267, term15267.getClass(), "minute", (byte) 58);
        setByteField(term15267, term15267.getClass(), "second", (byte) 46);
        setIntField(term15267, term15267.getClass(), "nano", 435562727);
        setField(term15262, term15262.getClass(), "time", term15267);
        setField(term15246, term15246.getClass(), "registerTime", term15262);
        setIntField(term15273, term15273.getClass(), "year", 2026);
        setShortField(term15273, term15273.getClass(), "month", (short) 10);
        setShortField(term15273, term15273.getClass(), "day", (short) 31);
        setField(term15272, term15272.getClass(), "date", term15273);
        setByteField(term15277, term15277.getClass(), "hour", (byte) 17);
        setByteField(term15277, term15277.getClass(), "minute", (byte) 6);
        setByteField(term15277, term15277.getClass(), "second", (byte) 30);
        setIntField(term15277, term15277.getClass(), "nano", 785931660);
        setField(term15272, term15272.getClass(), "time", term15277);
        setField(term15246, term15246.getClass(), "accessTime", term15272);
        setField(term15244, term15244.getClass(), "card", term15246);
        setField(term15244, term15244.getClass(), "userName", "lJoltmsadS");
        setIntField(term15244, term15244.getClass(), "level", 811839399);
        setIntField(term15244, term15244.getClass(), "reincarnationNum", 593962063);
        setLongField(term15244, term15244.getClass(), "exp", -1413653349314156044L);
        setLongField(term15244, term15244.getClass(), "point", 742593745847006219L);
        setLongField(term15244, term15244.getClass(), "totalPoint", 6801904611028883308L);
        setIntField(term15244, term15244.getClass(), "playCount", -1485826786);
        setIntField(term15244, term15244.getClass(), "jewelCount", -1549952664);
        setIntField(term15244, term15244.getClass(), "totalJewelCount", 148394188);
        setIntField(term15244, term15244.getClass(), "medalCount", 504525721);
        setIntField(term15244, term15244.getClass(), "playerRating", 1835568392);
        setIntField(term15244, term15244.getClass(), "highestRating", 457470807);
        setIntField(term15244, term15244.getClass(), "battlePoint", -994742871);
        setIntField(term15244, term15244.getClass(), "bestBattlePoint", -222412326);
        setIntField(term15244, term15244.getClass(), "overDamageBattlePoint", -299497261);
        setBooleanField(term15244, term15244.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term15244, term15244.getClass(), "nameplateId", -23054366);
        setIntField(term15244, term15244.getClass(), "trophyId", 153009426);
        setIntField(term15244, term15244.getClass(), "cardId", 185751892);
        setIntField(term15244, term15244.getClass(), "characterId", 1068256001);
        setIntField(term15244, term15244.getClass(), "characterVoiceNo", 1139078354);
        setIntField(term15244, term15244.getClass(), "tabSetting", -691164974);
        setIntField(term15244, term15244.getClass(), "tabSortSetting", -761675396);
        setIntField(term15244, term15244.getClass(), "cardCategorySetting", -1954860951);
        setIntField(term15244, term15244.getClass(), "cardSortSetting", -2078879114);
        setIntField(term15244, term15244.getClass(), "rivalScoreCategorySetting", -1186882318);
        setIntField(term15244, term15244.getClass(), "playedTutorialBit", 1077647088);
        setIntField(term15244, term15244.getClass(), "firstTutorialCancelNum", -705176810);
        setLongField(term15244, term15244.getClass(), "sumTechHighScore", -7717027128782374599L);
        setLongField(term15244, term15244.getClass(), "sumTechBasicHighScore", 4872921045907555824L);
        setLongField(term15244, term15244.getClass(), "sumTechAdvancedHighScore", 6921855906793748590L);
        setLongField(term15244, term15244.getClass(), "sumTechExpertHighScore", 7450182989722198450L);
        setLongField(term15244, term15244.getClass(), "sumTechMasterHighScore", 675601558105654203L);
        setLongField(term15244, term15244.getClass(), "sumTechLunaticHighScore", -6481933642917183045L);
        setLongField(term15244, term15244.getClass(), "sumBattleHighScore", 2054808971423494757L);
        setLongField(term15244, term15244.getClass(), "sumBattleBasicHighScore", 8734518435788772658L);
        setLongField(term15244, term15244.getClass(), "sumBattleAdvancedHighScore", 2289954139848415685L);
        setLongField(term15244, term15244.getClass(), "sumBattleExpertHighScore", -6137280723045949220L);
        setLongField(term15244, term15244.getClass(), "sumBattleMasterHighScore", -7787918913179897745L);
        setLongField(term15244, term15244.getClass(), "sumBattleLunaticHighScore", 9173715346996433126L);
        setField(term15244, term15244.getClass(), "eventWatchedDate", "mvfDtZNEHr");
        setField(term15244, term15244.getClass(), "cmEventWatchedDate", "bvSgmFUDOU");
        setField(term15244, term15244.getClass(), "firstGameId", "XMHwbfiHRl");
        setField(term15244, term15244.getClass(), "firstRomVersion", "bucTnYicnp");
        setField(term15244, term15244.getClass(), "firstDataVersion", "EkgprvqZlM");
        setField(term15244, term15244.getClass(), "firstPlayDate", "fbnKvthhOz");
        setField(term15244, term15244.getClass(), "lastGameId", "PGfCDJTBek");
        setField(term15244, term15244.getClass(), "lastRomVersion", "ZwjARhAtHC");
        setField(term15244, term15244.getClass(), "lastDataVersion", "XXvscsYBWv");
        setField(term15244, term15244.getClass(), "compatibleCmVersion", "uePedtiAfL");
        setField(term15244, term15244.getClass(), "lastPlayDate", "AdSHvysxQB");
        setIntField(term15244, term15244.getClass(), "lastPlaceId", -1584779593);
        setField(term15244, term15244.getClass(), "lastPlaceName", "jlraKkBWFA");
        setIntField(term15244, term15244.getClass(), "lastRegionId", 303007547);
        setField(term15244, term15244.getClass(), "lastRegionName", "mRBtFTxVdE");
        setIntField(term15244, term15244.getClass(), "lastAllNetId", 1498738343);
        setField(term15244, term15244.getClass(), "lastClientId", "IVacFDAZcj");
        setIntField(term15244, term15244.getClass(), "lastUsedDeckId", -1635571857);
        setIntField(term15244, term15244.getClass(), "lastPlayMusicLevel", 1407309162);
        setIntField(term15244, term15244.getClass(), "lastEmoneyBrand", -534033672);
        setField(term15242, term15242.getClass(), "user", term15244);
        setField(term15242, term15242.getClass(), "authKey", "EEYmuwyVDP");
        setIntField(term15242, term15242.getClass(), "roomId", -1162790806);
        setIntField(term15242, term15242.getClass(), "cardId", -1264595049);
        setField(term15242, term15242.getClass(), "valueDate", "EWFbEDAVrE");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserTrainingRoom");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCardId", argTypes, term15242, args);
    }

};


