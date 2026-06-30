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

public class UserItem_getItemKind_1062007063 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term103869;

    public UserItem_getItemKind_1062007063() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term103875 = new Long(-8019730974733786399L);
        term103869 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserItem"));
        Object term103871 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term103873 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term103889 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term103890 = newInstance(Class.forName("java.time.LocalDate"));
        Object term103894 = newInstance(Class.forName("java.time.LocalTime"));
        Object term103899 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term103900 = newInstance(Class.forName("java.time.LocalDate"));
        Object term103904 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term103869, term103869.getClass(), "id", -5648810601072873062L);
        setLongField(term103871, term103871.getClass(), "id", -8417415277600307810L);
        setLongField(term103873, term103873.getClass(), "id", 2306272618983280437L);
        setField(term103873, term103873.getClass(), "extId", term103875);
        setField(term103873, term103873.getClass(), "luid", "xXscNmBGLP");
        setIntField(term103890, term103890.getClass(), "year", 2018);
        setShortField(term103890, term103890.getClass(), "month", (short) 9);
        setShortField(term103890, term103890.getClass(), "day", (short) 10);
        setField(term103889, term103889.getClass(), "date", term103890);
        setByteField(term103894, term103894.getClass(), "hour", (byte) 11);
        setByteField(term103894, term103894.getClass(), "minute", (byte) 50);
        setByteField(term103894, term103894.getClass(), "second", (byte) 3);
        setIntField(term103894, term103894.getClass(), "nano", 33779151);
        setField(term103889, term103889.getClass(), "time", term103894);
        setField(term103873, term103873.getClass(), "registerTime", term103889);
        setIntField(term103900, term103900.getClass(), "year", 2022);
        setShortField(term103900, term103900.getClass(), "month", (short) 6);
        setShortField(term103900, term103900.getClass(), "day", (short) 29);
        setField(term103899, term103899.getClass(), "date", term103900);
        setByteField(term103904, term103904.getClass(), "hour", (byte) 1);
        setByteField(term103904, term103904.getClass(), "minute", (byte) 29);
        setByteField(term103904, term103904.getClass(), "second", (byte) 33);
        setIntField(term103904, term103904.getClass(), "nano", 714362758);
        setField(term103899, term103899.getClass(), "time", term103904);
        setField(term103873, term103873.getClass(), "accessTime", term103899);
        setField(term103871, term103871.getClass(), "card", term103873);
        setField(term103871, term103871.getClass(), "userName", "DOvWosNzCd");
        setIntField(term103871, term103871.getClass(), "level", -1916736881);
        setIntField(term103871, term103871.getClass(), "reincarnationNum", -1918049413);
        setLongField(term103871, term103871.getClass(), "exp", -9094752485899589376L);
        setLongField(term103871, term103871.getClass(), "point", -6711948475097303582L);
        setLongField(term103871, term103871.getClass(), "totalPoint", 5774915302900468418L);
        setIntField(term103871, term103871.getClass(), "playCount", 786449451);
        setIntField(term103871, term103871.getClass(), "jewelCount", -1221698112);
        setIntField(term103871, term103871.getClass(), "totalJewelCount", 1551007948);
        setIntField(term103871, term103871.getClass(), "medalCount", -823083171);
        setIntField(term103871, term103871.getClass(), "playerRating", 267756518);
        setIntField(term103871, term103871.getClass(), "highestRating", -2130068890);
        setIntField(term103871, term103871.getClass(), "battlePoint", -111157494);
        setIntField(term103871, term103871.getClass(), "bestBattlePoint", 1356632069);
        setIntField(term103871, term103871.getClass(), "overDamageBattlePoint", -497887292);
        setBooleanField(term103871, term103871.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term103871, term103871.getClass(), "nameplateId", 738235414);
        setIntField(term103871, term103871.getClass(), "trophyId", -573957070);
        setIntField(term103871, term103871.getClass(), "cardId", -1100140077);
        setIntField(term103871, term103871.getClass(), "characterId", -301805097);
        setIntField(term103871, term103871.getClass(), "characterVoiceNo", 496142964);
        setIntField(term103871, term103871.getClass(), "tabSetting", 520268147);
        setIntField(term103871, term103871.getClass(), "tabSortSetting", 702608636);
        setIntField(term103871, term103871.getClass(), "cardCategorySetting", 352605161);
        setIntField(term103871, term103871.getClass(), "cardSortSetting", -1191829886);
        setIntField(term103871, term103871.getClass(), "rivalScoreCategorySetting", -1544525961);
        setIntField(term103871, term103871.getClass(), "playedTutorialBit", 190733490);
        setIntField(term103871, term103871.getClass(), "firstTutorialCancelNum", 2100537808);
        setLongField(term103871, term103871.getClass(), "sumTechHighScore", -4904507060301412126L);
        setLongField(term103871, term103871.getClass(), "sumTechBasicHighScore", -8246636795914519979L);
        setLongField(term103871, term103871.getClass(), "sumTechAdvancedHighScore", -3256734753788428643L);
        setLongField(term103871, term103871.getClass(), "sumTechExpertHighScore", 4394161522374413189L);
        setLongField(term103871, term103871.getClass(), "sumTechMasterHighScore", 5816710834835162786L);
        setLongField(term103871, term103871.getClass(), "sumTechLunaticHighScore", 5066678935810397733L);
        setLongField(term103871, term103871.getClass(), "sumBattleHighScore", 8934306105227103211L);
        setLongField(term103871, term103871.getClass(), "sumBattleBasicHighScore", -2777220491617137686L);
        setLongField(term103871, term103871.getClass(), "sumBattleAdvancedHighScore", 1472591148702619494L);
        setLongField(term103871, term103871.getClass(), "sumBattleExpertHighScore", -6796384202573936489L);
        setLongField(term103871, term103871.getClass(), "sumBattleMasterHighScore", 5424129034789508784L);
        setLongField(term103871, term103871.getClass(), "sumBattleLunaticHighScore", -8840200505573654438L);
        setField(term103871, term103871.getClass(), "eventWatchedDate", "bIZNWEzBTe");
        setField(term103871, term103871.getClass(), "cmEventWatchedDate", "CVhsNqYDrO");
        setField(term103871, term103871.getClass(), "firstGameId", "dMpUbtHwly");
        setField(term103871, term103871.getClass(), "firstRomVersion", "bxEEJVIcPG");
        setField(term103871, term103871.getClass(), "firstDataVersion", "UttOGDGpEr");
        setField(term103871, term103871.getClass(), "firstPlayDate", "aPScTdSsoS");
        setField(term103871, term103871.getClass(), "lastGameId", "CZYngwdoHw");
        setField(term103871, term103871.getClass(), "lastRomVersion", "ZbWZNiPrBA");
        setField(term103871, term103871.getClass(), "lastDataVersion", "ilMWoyWLja");
        setField(term103871, term103871.getClass(), "compatibleCmVersion", "DejzaVMRwf");
        setField(term103871, term103871.getClass(), "lastPlayDate", "vpcvPRFXOI");
        setIntField(term103871, term103871.getClass(), "lastPlaceId", 1383366759);
        setField(term103871, term103871.getClass(), "lastPlaceName", "LpBQSpICQX");
        setIntField(term103871, term103871.getClass(), "lastRegionId", -424387882);
        setField(term103871, term103871.getClass(), "lastRegionName", "uPhRdRCFnR");
        setIntField(term103871, term103871.getClass(), "lastAllNetId", -1591399293);
        setField(term103871, term103871.getClass(), "lastClientId", "HdiCCAVvaY");
        setIntField(term103871, term103871.getClass(), "lastUsedDeckId", -1486539515);
        setIntField(term103871, term103871.getClass(), "lastPlayMusicLevel", -477235854);
        setIntField(term103871, term103871.getClass(), "lastEmoneyBrand", -545213489);
        setField(term103869, term103869.getClass(), "user", term103871);
        setIntField(term103869, term103869.getClass(), "itemKind", 1341679614);
        setIntField(term103869, term103869.getClass(), "itemId", -1687904905);
        setIntField(term103869, term103869.getClass(), "stock", -403695011);
        setBooleanField(term103869, term103869.getClass(), "isValid", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserItem");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getItemKind", argTypes, term103869, args);
    }

};


