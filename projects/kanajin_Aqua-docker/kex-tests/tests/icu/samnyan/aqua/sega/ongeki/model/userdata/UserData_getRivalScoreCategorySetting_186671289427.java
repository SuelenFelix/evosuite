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

public class UserData_getRivalScoreCategorySetting_186671289427 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33339;

    public UserData_getRivalScoreCategorySetting_186671289427() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term33343 = new Long(-5963439350418910964L);
        term33339 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term33341 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term33357 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term33358 = newInstance(Class.forName("java.time.LocalDate"));
        Object term33362 = newInstance(Class.forName("java.time.LocalTime"));
        Object term33367 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term33368 = newInstance(Class.forName("java.time.LocalDate"));
        Object term33372 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term33339, term33339.getClass(), "id", -8165230786269861125L);
        setLongField(term33341, term33341.getClass(), "id", 7818214521807331044L);
        setField(term33341, term33341.getClass(), "extId", term33343);
        setField(term33341, term33341.getClass(), "luid", "zRnpRGaHlI");
        setIntField(term33358, term33358.getClass(), "year", 2026);
        setShortField(term33358, term33358.getClass(), "month", (short) 9);
        setShortField(term33358, term33358.getClass(), "day", (short) 18);
        setField(term33357, term33357.getClass(), "date", term33358);
        setByteField(term33362, term33362.getClass(), "hour", (byte) 14);
        setByteField(term33362, term33362.getClass(), "minute", (byte) 51);
        setByteField(term33362, term33362.getClass(), "second", (byte) 41);
        setIntField(term33362, term33362.getClass(), "nano", 830322169);
        setField(term33357, term33357.getClass(), "time", term33362);
        setField(term33341, term33341.getClass(), "registerTime", term33357);
        setIntField(term33368, term33368.getClass(), "year", 2024);
        setShortField(term33368, term33368.getClass(), "month", (short) 3);
        setShortField(term33368, term33368.getClass(), "day", (short) 17);
        setField(term33367, term33367.getClass(), "date", term33368);
        setByteField(term33372, term33372.getClass(), "hour", (byte) 5);
        setByteField(term33372, term33372.getClass(), "minute", (byte) 21);
        setByteField(term33372, term33372.getClass(), "second", (byte) 47);
        setIntField(term33372, term33372.getClass(), "nano", 798433252);
        setField(term33367, term33367.getClass(), "time", term33372);
        setField(term33341, term33341.getClass(), "accessTime", term33367);
        setField(term33339, term33339.getClass(), "card", term33341);
        setField(term33339, term33339.getClass(), "userName", "dVHfxjbMRK");
        setIntField(term33339, term33339.getClass(), "level", -2090918082);
        setIntField(term33339, term33339.getClass(), "reincarnationNum", 1505717672);
        setLongField(term33339, term33339.getClass(), "exp", 7027549200302660557L);
        setLongField(term33339, term33339.getClass(), "point", -4623233001658453008L);
        setLongField(term33339, term33339.getClass(), "totalPoint", -2816485221625714088L);
        setIntField(term33339, term33339.getClass(), "playCount", -1683274691);
        setIntField(term33339, term33339.getClass(), "jewelCount", -935900044);
        setIntField(term33339, term33339.getClass(), "totalJewelCount", 1747876558);
        setIntField(term33339, term33339.getClass(), "medalCount", 833477776);
        setIntField(term33339, term33339.getClass(), "playerRating", 2043960707);
        setIntField(term33339, term33339.getClass(), "highestRating", 272179554);
        setIntField(term33339, term33339.getClass(), "battlePoint", 1717711536);
        setIntField(term33339, term33339.getClass(), "bestBattlePoint", -606339607);
        setIntField(term33339, term33339.getClass(), "overDamageBattlePoint", 800440712);
        setBooleanField(term33339, term33339.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term33339, term33339.getClass(), "nameplateId", -1976407622);
        setIntField(term33339, term33339.getClass(), "trophyId", -552996061);
        setIntField(term33339, term33339.getClass(), "cardId", -153013117);
        setIntField(term33339, term33339.getClass(), "characterId", 712181359);
        setIntField(term33339, term33339.getClass(), "characterVoiceNo", -1943255435);
        setIntField(term33339, term33339.getClass(), "tabSetting", 868436312);
        setIntField(term33339, term33339.getClass(), "tabSortSetting", 1737963071);
        setIntField(term33339, term33339.getClass(), "cardCategorySetting", 6456997);
        setIntField(term33339, term33339.getClass(), "cardSortSetting", -797269627);
        setIntField(term33339, term33339.getClass(), "rivalScoreCategorySetting", -224331928);
        setIntField(term33339, term33339.getClass(), "playedTutorialBit", -587857163);
        setIntField(term33339, term33339.getClass(), "firstTutorialCancelNum", -2018093075);
        setLongField(term33339, term33339.getClass(), "sumTechHighScore", 2920715047797197542L);
        setLongField(term33339, term33339.getClass(), "sumTechBasicHighScore", -7084245215702303910L);
        setLongField(term33339, term33339.getClass(), "sumTechAdvancedHighScore", -2143540634259970953L);
        setLongField(term33339, term33339.getClass(), "sumTechExpertHighScore", -6779665610828821838L);
        setLongField(term33339, term33339.getClass(), "sumTechMasterHighScore", 7026184159827656720L);
        setLongField(term33339, term33339.getClass(), "sumTechLunaticHighScore", 432186805820232994L);
        setLongField(term33339, term33339.getClass(), "sumBattleHighScore", -2991029806121048772L);
        setLongField(term33339, term33339.getClass(), "sumBattleBasicHighScore", -1146200229133968810L);
        setLongField(term33339, term33339.getClass(), "sumBattleAdvancedHighScore", -7968999170526273722L);
        setLongField(term33339, term33339.getClass(), "sumBattleExpertHighScore", -391398551284253915L);
        setLongField(term33339, term33339.getClass(), "sumBattleMasterHighScore", -2791473406557466846L);
        setLongField(term33339, term33339.getClass(), "sumBattleLunaticHighScore", -3895780534600959979L);
        setField(term33339, term33339.getClass(), "eventWatchedDate", "LzwyLxKJpw");
        setField(term33339, term33339.getClass(), "cmEventWatchedDate", "ZhWJlplAVK");
        setField(term33339, term33339.getClass(), "firstGameId", "pnmjTuTojv");
        setField(term33339, term33339.getClass(), "firstRomVersion", "eMtshhmGEm");
        setField(term33339, term33339.getClass(), "firstDataVersion", "VJUbzHGOvg");
        setField(term33339, term33339.getClass(), "firstPlayDate", "SiwcigIrfD");
        setField(term33339, term33339.getClass(), "lastGameId", "MFIdGVLoDo");
        setField(term33339, term33339.getClass(), "lastRomVersion", "kbxgTcnXyU");
        setField(term33339, term33339.getClass(), "lastDataVersion", "lnJvDbbuwo");
        setField(term33339, term33339.getClass(), "compatibleCmVersion", "KExnWkKGvF");
        setField(term33339, term33339.getClass(), "lastPlayDate", "luGUNfvmKk");
        setIntField(term33339, term33339.getClass(), "lastPlaceId", 135879009);
        setField(term33339, term33339.getClass(), "lastPlaceName", "oOUHomyJff");
        setIntField(term33339, term33339.getClass(), "lastRegionId", 1923027847);
        setField(term33339, term33339.getClass(), "lastRegionName", "KnnoLMOuur");
        setIntField(term33339, term33339.getClass(), "lastAllNetId", -1652693609);
        setField(term33339, term33339.getClass(), "lastClientId", "buRpVghIvt");
        setIntField(term33339, term33339.getClass(), "lastUsedDeckId", -824893512);
        setIntField(term33339, term33339.getClass(), "lastPlayMusicLevel", -55435071);
        setIntField(term33339, term33339.getClass(), "lastEmoneyBrand", -673356166);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRivalScoreCategorySetting", argTypes, term33339, args);
    }

};


