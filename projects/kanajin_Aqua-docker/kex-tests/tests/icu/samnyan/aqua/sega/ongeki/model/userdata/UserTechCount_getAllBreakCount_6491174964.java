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

public class UserTechCount_getAllBreakCount_6491174964 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term363397;

    public UserTechCount_getAllBreakCount_6491174964() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term363403 = new Long(-575923088526116016L);
        term363397 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserTechCount"));
        Object term363399 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term363401 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term363417 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term363418 = newInstance(Class.forName("java.time.LocalDate"));
        Object term363422 = newInstance(Class.forName("java.time.LocalTime"));
        Object term363427 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term363428 = newInstance(Class.forName("java.time.LocalDate"));
        Object term363432 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term363397, term363397.getClass(), "id", -6057543648799095425L);
        setLongField(term363399, term363399.getClass(), "id", -5200600246958563816L);
        setLongField(term363401, term363401.getClass(), "id", 7003624636778380802L);
        setField(term363401, term363401.getClass(), "extId", term363403);
        setField(term363401, term363401.getClass(), "luid", "BSybZnyoXb");
        setIntField(term363418, term363418.getClass(), "year", 2023);
        setShortField(term363418, term363418.getClass(), "month", (short) 8);
        setShortField(term363418, term363418.getClass(), "day", (short) 19);
        setField(term363417, term363417.getClass(), "date", term363418);
        setByteField(term363422, term363422.getClass(), "hour", (byte) 12);
        setByteField(term363422, term363422.getClass(), "minute", (byte) 42);
        setByteField(term363422, term363422.getClass(), "second", (byte) 29);
        setIntField(term363422, term363422.getClass(), "nano", 465730414);
        setField(term363417, term363417.getClass(), "time", term363422);
        setField(term363401, term363401.getClass(), "registerTime", term363417);
        setIntField(term363428, term363428.getClass(), "year", 2011);
        setShortField(term363428, term363428.getClass(), "month", (short) 11);
        setShortField(term363428, term363428.getClass(), "day", (short) 1);
        setField(term363427, term363427.getClass(), "date", term363428);
        setByteField(term363432, term363432.getClass(), "hour", (byte) 18);
        setByteField(term363432, term363432.getClass(), "minute", (byte) 2);
        setByteField(term363432, term363432.getClass(), "second", (byte) 52);
        setIntField(term363432, term363432.getClass(), "nano", 411501611);
        setField(term363427, term363427.getClass(), "time", term363432);
        setField(term363401, term363401.getClass(), "accessTime", term363427);
        setField(term363399, term363399.getClass(), "card", term363401);
        setField(term363399, term363399.getClass(), "userName", "FtBTdccLAQ");
        setIntField(term363399, term363399.getClass(), "level", -1980802142);
        setIntField(term363399, term363399.getClass(), "reincarnationNum", -1890558619);
        setLongField(term363399, term363399.getClass(), "exp", -6992982325409734135L);
        setLongField(term363399, term363399.getClass(), "point", -5545825518179544659L);
        setLongField(term363399, term363399.getClass(), "totalPoint", 3736813022643234014L);
        setIntField(term363399, term363399.getClass(), "playCount", 246151413);
        setIntField(term363399, term363399.getClass(), "jewelCount", 265927007);
        setIntField(term363399, term363399.getClass(), "totalJewelCount", -186428617);
        setIntField(term363399, term363399.getClass(), "medalCount", -500999944);
        setIntField(term363399, term363399.getClass(), "playerRating", 993904340);
        setIntField(term363399, term363399.getClass(), "highestRating", 2068062684);
        setIntField(term363399, term363399.getClass(), "battlePoint", -1566493723);
        setIntField(term363399, term363399.getClass(), "bestBattlePoint", -232590355);
        setIntField(term363399, term363399.getClass(), "overDamageBattlePoint", -76372004);
        setBooleanField(term363399, term363399.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term363399, term363399.getClass(), "nameplateId", -282863325);
        setIntField(term363399, term363399.getClass(), "trophyId", 1978778413);
        setIntField(term363399, term363399.getClass(), "cardId", -1075081686);
        setIntField(term363399, term363399.getClass(), "characterId", -1671816253);
        setIntField(term363399, term363399.getClass(), "characterVoiceNo", 1898227939);
        setIntField(term363399, term363399.getClass(), "tabSetting", -117899720);
        setIntField(term363399, term363399.getClass(), "tabSortSetting", -679917019);
        setIntField(term363399, term363399.getClass(), "cardCategorySetting", -2146299094);
        setIntField(term363399, term363399.getClass(), "cardSortSetting", 1374341752);
        setIntField(term363399, term363399.getClass(), "rivalScoreCategorySetting", -1435999445);
        setIntField(term363399, term363399.getClass(), "playedTutorialBit", -840778330);
        setIntField(term363399, term363399.getClass(), "firstTutorialCancelNum", 1304709906);
        setLongField(term363399, term363399.getClass(), "sumTechHighScore", -8130039709998304329L);
        setLongField(term363399, term363399.getClass(), "sumTechBasicHighScore", -5629935660043182611L);
        setLongField(term363399, term363399.getClass(), "sumTechAdvancedHighScore", 7819471799085904860L);
        setLongField(term363399, term363399.getClass(), "sumTechExpertHighScore", -4779011676235505332L);
        setLongField(term363399, term363399.getClass(), "sumTechMasterHighScore", -7807702172182504861L);
        setLongField(term363399, term363399.getClass(), "sumTechLunaticHighScore", 8582681312638125423L);
        setLongField(term363399, term363399.getClass(), "sumBattleHighScore", -5641317056559169443L);
        setLongField(term363399, term363399.getClass(), "sumBattleBasicHighScore", 7336752726488432406L);
        setLongField(term363399, term363399.getClass(), "sumBattleAdvancedHighScore", 7363619369823283242L);
        setLongField(term363399, term363399.getClass(), "sumBattleExpertHighScore", 5450923425156962149L);
        setLongField(term363399, term363399.getClass(), "sumBattleMasterHighScore", -5833733197354018239L);
        setLongField(term363399, term363399.getClass(), "sumBattleLunaticHighScore", 202794081351458900L);
        setField(term363399, term363399.getClass(), "eventWatchedDate", "rHmLJyEYmZ");
        setField(term363399, term363399.getClass(), "cmEventWatchedDate", "tigJNweXMN");
        setField(term363399, term363399.getClass(), "firstGameId", "CBAuoOPQLk");
        setField(term363399, term363399.getClass(), "firstRomVersion", "UMceVhSAUg");
        setField(term363399, term363399.getClass(), "firstDataVersion", "ZXXTHSAYBb");
        setField(term363399, term363399.getClass(), "firstPlayDate", "VBWbEmjxRb");
        setField(term363399, term363399.getClass(), "lastGameId", "LKrcKuVLVI");
        setField(term363399, term363399.getClass(), "lastRomVersion", "mUNHplmJbZ");
        setField(term363399, term363399.getClass(), "lastDataVersion", "yxcEKhJUJL");
        setField(term363399, term363399.getClass(), "compatibleCmVersion", "uFBUbkrzdC");
        setField(term363399, term363399.getClass(), "lastPlayDate", "wVaRVdJJAr");
        setIntField(term363399, term363399.getClass(), "lastPlaceId", 588058443);
        setField(term363399, term363399.getClass(), "lastPlaceName", "ioBaaAQCDB");
        setIntField(term363399, term363399.getClass(), "lastRegionId", 1836841919);
        setField(term363399, term363399.getClass(), "lastRegionName", "FSGbYvpjdC");
        setIntField(term363399, term363399.getClass(), "lastAllNetId", 1611098832);
        setField(term363399, term363399.getClass(), "lastClientId", "NeJHSHrGrh");
        setIntField(term363399, term363399.getClass(), "lastUsedDeckId", -900109426);
        setIntField(term363399, term363399.getClass(), "lastPlayMusicLevel", 1323215735);
        setIntField(term363399, term363399.getClass(), "lastEmoneyBrand", 2116353295);
        setField(term363397, term363397.getClass(), "user", term363399);
        setIntField(term363397, term363397.getClass(), "levelId", -474069663);
        setIntField(term363397, term363397.getClass(), "allBreakCount", -1481450054);
        setIntField(term363397, term363397.getClass(), "allBreakPlusCount", 523798192);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserTechCount");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAllBreakCount", argTypes, term363397, args);
    }

};


