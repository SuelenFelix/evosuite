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

public class UserEventPoint_canEqual_93948021312 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term387109;
     Object term387377;

    public UserEventPoint_canEqual_93948021312() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term387115 = new Long(-6367418587326372844L);
        term387109 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserEventPoint"));
        Object term387111 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term387113 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term387129 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term387130 = newInstance(Class.forName("java.time.LocalDate"));
        Object term387134 = newInstance(Class.forName("java.time.LocalTime"));
        Object term387139 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term387140 = newInstance(Class.forName("java.time.LocalDate"));
        Object term387144 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term387109, term387109.getClass(), "id", 8875992813668346682L);
        setLongField(term387111, term387111.getClass(), "id", -6800686316738777033L);
        setLongField(term387113, term387113.getClass(), "id", 2387127268433520006L);
        setField(term387113, term387113.getClass(), "extId", term387115);
        setField(term387113, term387113.getClass(), "luid", "LfLpXxPgGC");
        setIntField(term387130, term387130.getClass(), "year", 2017);
        setShortField(term387130, term387130.getClass(), "month", (short) 2);
        setShortField(term387130, term387130.getClass(), "day", (short) 9);
        setField(term387129, term387129.getClass(), "date", term387130);
        setByteField(term387134, term387134.getClass(), "hour", (byte) 18);
        setByteField(term387134, term387134.getClass(), "minute", (byte) 29);
        setByteField(term387134, term387134.getClass(), "second", (byte) 21);
        setIntField(term387134, term387134.getClass(), "nano", 675008333);
        setField(term387129, term387129.getClass(), "time", term387134);
        setField(term387113, term387113.getClass(), "registerTime", term387129);
        setIntField(term387140, term387140.getClass(), "year", 2010);
        setShortField(term387140, term387140.getClass(), "month", (short) 2);
        setShortField(term387140, term387140.getClass(), "day", (short) 7);
        setField(term387139, term387139.getClass(), "date", term387140);
        setByteField(term387144, term387144.getClass(), "hour", (byte) 18);
        setByteField(term387144, term387144.getClass(), "minute", (byte) 12);
        setByteField(term387144, term387144.getClass(), "second", (byte) 57);
        setIntField(term387144, term387144.getClass(), "nano", 601841566);
        setField(term387139, term387139.getClass(), "time", term387144);
        setField(term387113, term387113.getClass(), "accessTime", term387139);
        setField(term387111, term387111.getClass(), "card", term387113);
        setField(term387111, term387111.getClass(), "userName", "YYPmbpDuHX");
        setIntField(term387111, term387111.getClass(), "level", 22406941);
        setIntField(term387111, term387111.getClass(), "reincarnationNum", -1183704260);
        setLongField(term387111, term387111.getClass(), "exp", 5817012489612145311L);
        setLongField(term387111, term387111.getClass(), "point", 5947528337765676249L);
        setLongField(term387111, term387111.getClass(), "totalPoint", 243245692601956590L);
        setIntField(term387111, term387111.getClass(), "playCount", 1877178274);
        setIntField(term387111, term387111.getClass(), "jewelCount", 878853055);
        setIntField(term387111, term387111.getClass(), "totalJewelCount", 1990357984);
        setIntField(term387111, term387111.getClass(), "medalCount", 1541210593);
        setIntField(term387111, term387111.getClass(), "playerRating", 1522506722);
        setIntField(term387111, term387111.getClass(), "highestRating", 12625927);
        setIntField(term387111, term387111.getClass(), "battlePoint", -1917982598);
        setIntField(term387111, term387111.getClass(), "bestBattlePoint", 791737453);
        setIntField(term387111, term387111.getClass(), "overDamageBattlePoint", -496713452);
        setBooleanField(term387111, term387111.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term387111, term387111.getClass(), "nameplateId", -1348991468);
        setIntField(term387111, term387111.getClass(), "trophyId", -1865781818);
        setIntField(term387111, term387111.getClass(), "cardId", 2094503336);
        setIntField(term387111, term387111.getClass(), "characterId", -25321362);
        setIntField(term387111, term387111.getClass(), "characterVoiceNo", 1094812035);
        setIntField(term387111, term387111.getClass(), "tabSetting", 1483055316);
        setIntField(term387111, term387111.getClass(), "tabSortSetting", -996314050);
        setIntField(term387111, term387111.getClass(), "cardCategorySetting", -654714076);
        setIntField(term387111, term387111.getClass(), "cardSortSetting", 49792877);
        setIntField(term387111, term387111.getClass(), "rivalScoreCategorySetting", -1283975867);
        setIntField(term387111, term387111.getClass(), "playedTutorialBit", 1622409341);
        setIntField(term387111, term387111.getClass(), "firstTutorialCancelNum", -295586089);
        setLongField(term387111, term387111.getClass(), "sumTechHighScore", 2419464100717917361L);
        setLongField(term387111, term387111.getClass(), "sumTechBasicHighScore", 3602901188047186834L);
        setLongField(term387111, term387111.getClass(), "sumTechAdvancedHighScore", 2228924328415579351L);
        setLongField(term387111, term387111.getClass(), "sumTechExpertHighScore", 8580571644502898880L);
        setLongField(term387111, term387111.getClass(), "sumTechMasterHighScore", 6531893058208481765L);
        setLongField(term387111, term387111.getClass(), "sumTechLunaticHighScore", 5249076585814934166L);
        setLongField(term387111, term387111.getClass(), "sumBattleHighScore", 5431131335512181255L);
        setLongField(term387111, term387111.getClass(), "sumBattleBasicHighScore", 7619008445161261955L);
        setLongField(term387111, term387111.getClass(), "sumBattleAdvancedHighScore", -4153892891216909819L);
        setLongField(term387111, term387111.getClass(), "sumBattleExpertHighScore", 1932327643507049702L);
        setLongField(term387111, term387111.getClass(), "sumBattleMasterHighScore", -8249315852913631616L);
        setLongField(term387111, term387111.getClass(), "sumBattleLunaticHighScore", -6550328034889915403L);
        setField(term387111, term387111.getClass(), "eventWatchedDate", "YwWAwLOaEz");
        setField(term387111, term387111.getClass(), "cmEventWatchedDate", "SzkHqVuDKI");
        setField(term387111, term387111.getClass(), "firstGameId", "LxMolUgpvD");
        setField(term387111, term387111.getClass(), "firstRomVersion", "hymEyhasvk");
        setField(term387111, term387111.getClass(), "firstDataVersion", "FLrZcKAMNq");
        setField(term387111, term387111.getClass(), "firstPlayDate", "ZrzUXbqDqZ");
        setField(term387111, term387111.getClass(), "lastGameId", "PNsZLpOGme");
        setField(term387111, term387111.getClass(), "lastRomVersion", "qMKSkoOAAZ");
        setField(term387111, term387111.getClass(), "lastDataVersion", "sXKsHHKdMG");
        setField(term387111, term387111.getClass(), "compatibleCmVersion", "HNPHDtTQgF");
        setField(term387111, term387111.getClass(), "lastPlayDate", "iXWKefRpyo");
        setIntField(term387111, term387111.getClass(), "lastPlaceId", -524387384);
        setField(term387111, term387111.getClass(), "lastPlaceName", "mEtRHdNLcb");
        setIntField(term387111, term387111.getClass(), "lastRegionId", 716843225);
        setField(term387111, term387111.getClass(), "lastRegionName", "DualgfapNt");
        setIntField(term387111, term387111.getClass(), "lastAllNetId", 2109119068);
        setField(term387111, term387111.getClass(), "lastClientId", "NIcWDkOTnB");
        setIntField(term387111, term387111.getClass(), "lastUsedDeckId", -1773884085);
        setIntField(term387111, term387111.getClass(), "lastPlayMusicLevel", 1669406988);
        setIntField(term387111, term387111.getClass(), "lastEmoneyBrand", -1155924922);
        setField(term387109, term387109.getClass(), "user", term387111);
        setIntField(term387109, term387109.getClass(), "eventId", -1209795650);
        setLongField(term387109, term387109.getClass(), "point", -643826168745519749L);
        setBooleanField(term387109, term387109.getClass(), "isRankingRewarded", false);
        term387377 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserEventPoint");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term387377;
        callMethod(klass, "canEqual", argTypes, term387109, args);
    }

};


