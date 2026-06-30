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

public class UserDeck_getCardId1_16375794574 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term143708;

    public UserDeck_getCardId1_16375794574() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term143714 = new Long(-3130003589475815807L);
        term143708 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserDeck"));
        Object term143710 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term143712 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term143728 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term143729 = newInstance(Class.forName("java.time.LocalDate"));
        Object term143733 = newInstance(Class.forName("java.time.LocalTime"));
        Object term143738 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term143739 = newInstance(Class.forName("java.time.LocalDate"));
        Object term143743 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term143708, term143708.getClass(), "id", 2201602253869610768L);
        setLongField(term143710, term143710.getClass(), "id", -2820584216575941815L);
        setLongField(term143712, term143712.getClass(), "id", 2397718102151609853L);
        setField(term143712, term143712.getClass(), "extId", term143714);
        setField(term143712, term143712.getClass(), "luid", "rWuFJIaxKU");
        setIntField(term143729, term143729.getClass(), "year", 2019);
        setShortField(term143729, term143729.getClass(), "month", (short) 7);
        setShortField(term143729, term143729.getClass(), "day", (short) 10);
        setField(term143728, term143728.getClass(), "date", term143729);
        setByteField(term143733, term143733.getClass(), "hour", (byte) 4);
        setByteField(term143733, term143733.getClass(), "minute", (byte) 6);
        setByteField(term143733, term143733.getClass(), "second", (byte) 6);
        setIntField(term143733, term143733.getClass(), "nano", 210255351);
        setField(term143728, term143728.getClass(), "time", term143733);
        setField(term143712, term143712.getClass(), "registerTime", term143728);
        setIntField(term143739, term143739.getClass(), "year", 2027);
        setShortField(term143739, term143739.getClass(), "month", (short) 10);
        setShortField(term143739, term143739.getClass(), "day", (short) 8);
        setField(term143738, term143738.getClass(), "date", term143739);
        setByteField(term143743, term143743.getClass(), "hour", (byte) 8);
        setByteField(term143743, term143743.getClass(), "minute", (byte) 53);
        setByteField(term143743, term143743.getClass(), "second", (byte) 13);
        setIntField(term143743, term143743.getClass(), "nano", 464148999);
        setField(term143738, term143738.getClass(), "time", term143743);
        setField(term143712, term143712.getClass(), "accessTime", term143738);
        setField(term143710, term143710.getClass(), "card", term143712);
        setField(term143710, term143710.getClass(), "userName", "YfhWIhudfM");
        setIntField(term143710, term143710.getClass(), "level", 713171221);
        setIntField(term143710, term143710.getClass(), "reincarnationNum", -922412655);
        setLongField(term143710, term143710.getClass(), "exp", 3645580588979496158L);
        setLongField(term143710, term143710.getClass(), "point", 4506144800298677277L);
        setLongField(term143710, term143710.getClass(), "totalPoint", 2950768168445402516L);
        setIntField(term143710, term143710.getClass(), "playCount", 422773242);
        setIntField(term143710, term143710.getClass(), "jewelCount", 1756235049);
        setIntField(term143710, term143710.getClass(), "totalJewelCount", 1252714657);
        setIntField(term143710, term143710.getClass(), "medalCount", 279120793);
        setIntField(term143710, term143710.getClass(), "playerRating", 1198494389);
        setIntField(term143710, term143710.getClass(), "highestRating", -1775188050);
        setIntField(term143710, term143710.getClass(), "battlePoint", -1883712310);
        setIntField(term143710, term143710.getClass(), "bestBattlePoint", -209552412);
        setIntField(term143710, term143710.getClass(), "overDamageBattlePoint", -128147837);
        setBooleanField(term143710, term143710.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term143710, term143710.getClass(), "nameplateId", -628985630);
        setIntField(term143710, term143710.getClass(), "trophyId", -448657659);
        setIntField(term143710, term143710.getClass(), "cardId", -732060555);
        setIntField(term143710, term143710.getClass(), "characterId", -1192629086);
        setIntField(term143710, term143710.getClass(), "characterVoiceNo", -2079826481);
        setIntField(term143710, term143710.getClass(), "tabSetting", 720449771);
        setIntField(term143710, term143710.getClass(), "tabSortSetting", -889881321);
        setIntField(term143710, term143710.getClass(), "cardCategorySetting", -210771326);
        setIntField(term143710, term143710.getClass(), "cardSortSetting", 281911175);
        setIntField(term143710, term143710.getClass(), "rivalScoreCategorySetting", 1704970339);
        setIntField(term143710, term143710.getClass(), "playedTutorialBit", 1614956209);
        setIntField(term143710, term143710.getClass(), "firstTutorialCancelNum", -151499130);
        setLongField(term143710, term143710.getClass(), "sumTechHighScore", -1883703292057603007L);
        setLongField(term143710, term143710.getClass(), "sumTechBasicHighScore", -7757343143113790900L);
        setLongField(term143710, term143710.getClass(), "sumTechAdvancedHighScore", 7140439527813222384L);
        setLongField(term143710, term143710.getClass(), "sumTechExpertHighScore", -2922062958064432137L);
        setLongField(term143710, term143710.getClass(), "sumTechMasterHighScore", -8800999826532869458L);
        setLongField(term143710, term143710.getClass(), "sumTechLunaticHighScore", 4824667538051001981L);
        setLongField(term143710, term143710.getClass(), "sumBattleHighScore", 5874341572546274689L);
        setLongField(term143710, term143710.getClass(), "sumBattleBasicHighScore", -6377486251340711456L);
        setLongField(term143710, term143710.getClass(), "sumBattleAdvancedHighScore", 2518058547438022320L);
        setLongField(term143710, term143710.getClass(), "sumBattleExpertHighScore", 3544880174466994593L);
        setLongField(term143710, term143710.getClass(), "sumBattleMasterHighScore", 8501384228243884494L);
        setLongField(term143710, term143710.getClass(), "sumBattleLunaticHighScore", 5988506569855641186L);
        setField(term143710, term143710.getClass(), "eventWatchedDate", "GMoKHTpxln");
        setField(term143710, term143710.getClass(), "cmEventWatchedDate", "XkAqnfOCnI");
        setField(term143710, term143710.getClass(), "firstGameId", "gmQYVeuejX");
        setField(term143710, term143710.getClass(), "firstRomVersion", "lKfOnfrbRD");
        setField(term143710, term143710.getClass(), "firstDataVersion", "nYzGCEYbnO");
        setField(term143710, term143710.getClass(), "firstPlayDate", "pmcRudWxTC");
        setField(term143710, term143710.getClass(), "lastGameId", "LJueGMncZI");
        setField(term143710, term143710.getClass(), "lastRomVersion", "MzACPCdnZu");
        setField(term143710, term143710.getClass(), "lastDataVersion", "orKYnrPZUK");
        setField(term143710, term143710.getClass(), "compatibleCmVersion", "cnXmohyKKG");
        setField(term143710, term143710.getClass(), "lastPlayDate", "GUOUoghpWj");
        setIntField(term143710, term143710.getClass(), "lastPlaceId", -1822594915);
        setField(term143710, term143710.getClass(), "lastPlaceName", "mwFuZUIQyt");
        setIntField(term143710, term143710.getClass(), "lastRegionId", 1838995967);
        setField(term143710, term143710.getClass(), "lastRegionName", "vjEoebAxYI");
        setIntField(term143710, term143710.getClass(), "lastAllNetId", 265353182);
        setField(term143710, term143710.getClass(), "lastClientId", "yigFKTPrsp");
        setIntField(term143710, term143710.getClass(), "lastUsedDeckId", 1812110091);
        setIntField(term143710, term143710.getClass(), "lastPlayMusicLevel", 802315735);
        setIntField(term143710, term143710.getClass(), "lastEmoneyBrand", 1856249254);
        setField(term143708, term143708.getClass(), "user", term143710);
        setIntField(term143708, term143708.getClass(), "deckId", -5087555);
        setIntField(term143708, term143708.getClass(), "cardId1", -2060866136);
        setIntField(term143708, term143708.getClass(), "cardId2", -1547846111);
        setIntField(term143708, term143708.getClass(), "cardId3", -534826636);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserDeck");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCardId1", argTypes, term143708, args);
    }

};


