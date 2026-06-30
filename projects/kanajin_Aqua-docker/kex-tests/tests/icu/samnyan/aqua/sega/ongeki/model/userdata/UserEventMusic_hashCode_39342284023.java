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

public class UserEventMusic_hashCode_39342284023 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term379929;

    public UserEventMusic_hashCode_39342284023() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term379935 = new Long(2201264121669950608L);
        term379929 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserEventMusic"));
        Object term379931 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term379933 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term379949 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term379950 = newInstance(Class.forName("java.time.LocalDate"));
        Object term379954 = newInstance(Class.forName("java.time.LocalTime"));
        Object term379959 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term379960 = newInstance(Class.forName("java.time.LocalDate"));
        Object term379964 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term379929, term379929.getClass(), "id", -5614698698827530600L);
        setLongField(term379931, term379931.getClass(), "id", -6033434466559622001L);
        setLongField(term379933, term379933.getClass(), "id", 8827872111337197370L);
        setField(term379933, term379933.getClass(), "extId", term379935);
        setField(term379933, term379933.getClass(), "luid", "bmJqqZktWg");
        setIntField(term379950, term379950.getClass(), "year", 2017);
        setShortField(term379950, term379950.getClass(), "month", (short) 11);
        setShortField(term379950, term379950.getClass(), "day", (short) 10);
        setField(term379949, term379949.getClass(), "date", term379950);
        setByteField(term379954, term379954.getClass(), "hour", (byte) 12);
        setByteField(term379954, term379954.getClass(), "minute", (byte) 10);
        setByteField(term379954, term379954.getClass(), "second", (byte) 3);
        setIntField(term379954, term379954.getClass(), "nano", 17839199);
        setField(term379949, term379949.getClass(), "time", term379954);
        setField(term379933, term379933.getClass(), "registerTime", term379949);
        setIntField(term379960, term379960.getClass(), "year", 2021);
        setShortField(term379960, term379960.getClass(), "month", (short) 2);
        setShortField(term379960, term379960.getClass(), "day", (short) 8);
        setField(term379959, term379959.getClass(), "date", term379960);
        setByteField(term379964, term379964.getClass(), "hour", (byte) 23);
        setByteField(term379964, term379964.getClass(), "minute", (byte) 30);
        setByteField(term379964, term379964.getClass(), "second", (byte) 59);
        setIntField(term379964, term379964.getClass(), "nano", 870549958);
        setField(term379959, term379959.getClass(), "time", term379964);
        setField(term379933, term379933.getClass(), "accessTime", term379959);
        setField(term379931, term379931.getClass(), "card", term379933);
        setField(term379931, term379931.getClass(), "userName", "iMkleCzkRF");
        setIntField(term379931, term379931.getClass(), "level", 84171120);
        setIntField(term379931, term379931.getClass(), "reincarnationNum", 413777504);
        setLongField(term379931, term379931.getClass(), "exp", -139914885888420444L);
        setLongField(term379931, term379931.getClass(), "point", -414876751514807797L);
        setLongField(term379931, term379931.getClass(), "totalPoint", 2847803762862190288L);
        setIntField(term379931, term379931.getClass(), "playCount", 1854215714);
        setIntField(term379931, term379931.getClass(), "jewelCount", 1501759174);
        setIntField(term379931, term379931.getClass(), "totalJewelCount", 1235873414);
        setIntField(term379931, term379931.getClass(), "medalCount", 2099522122);
        setIntField(term379931, term379931.getClass(), "playerRating", 337253688);
        setIntField(term379931, term379931.getClass(), "highestRating", -1160017560);
        setIntField(term379931, term379931.getClass(), "battlePoint", 723948852);
        setIntField(term379931, term379931.getClass(), "bestBattlePoint", -1328618435);
        setIntField(term379931, term379931.getClass(), "overDamageBattlePoint", -1301713427);
        setBooleanField(term379931, term379931.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term379931, term379931.getClass(), "nameplateId", -1749274405);
        setIntField(term379931, term379931.getClass(), "trophyId", -20108875);
        setIntField(term379931, term379931.getClass(), "cardId", 1118600949);
        setIntField(term379931, term379931.getClass(), "characterId", -1022014368);
        setIntField(term379931, term379931.getClass(), "characterVoiceNo", 1909727828);
        setIntField(term379931, term379931.getClass(), "tabSetting", -476939376);
        setIntField(term379931, term379931.getClass(), "tabSortSetting", -416759875);
        setIntField(term379931, term379931.getClass(), "cardCategorySetting", -337275123);
        setIntField(term379931, term379931.getClass(), "cardSortSetting", 1741268025);
        setIntField(term379931, term379931.getClass(), "rivalScoreCategorySetting", 19164941);
        setIntField(term379931, term379931.getClass(), "playedTutorialBit", -1947200307);
        setIntField(term379931, term379931.getClass(), "firstTutorialCancelNum", -502059166);
        setLongField(term379931, term379931.getClass(), "sumTechHighScore", 6972954603960326629L);
        setLongField(term379931, term379931.getClass(), "sumTechBasicHighScore", -1625655466874550647L);
        setLongField(term379931, term379931.getClass(), "sumTechAdvancedHighScore", -8623216346947834994L);
        setLongField(term379931, term379931.getClass(), "sumTechExpertHighScore", -7493067860221961088L);
        setLongField(term379931, term379931.getClass(), "sumTechMasterHighScore", -8346981226682022302L);
        setLongField(term379931, term379931.getClass(), "sumTechLunaticHighScore", -5859627873255183135L);
        setLongField(term379931, term379931.getClass(), "sumBattleHighScore", -2119255528814111953L);
        setLongField(term379931, term379931.getClass(), "sumBattleBasicHighScore", 5563292846324880345L);
        setLongField(term379931, term379931.getClass(), "sumBattleAdvancedHighScore", 3424871585462213983L);
        setLongField(term379931, term379931.getClass(), "sumBattleExpertHighScore", 761469670960358744L);
        setLongField(term379931, term379931.getClass(), "sumBattleMasterHighScore", 8037206927748119132L);
        setLongField(term379931, term379931.getClass(), "sumBattleLunaticHighScore", -910078322836030184L);
        setField(term379931, term379931.getClass(), "eventWatchedDate", "QmhWJdcFsE");
        setField(term379931, term379931.getClass(), "cmEventWatchedDate", "bSTOabrbCe");
        setField(term379931, term379931.getClass(), "firstGameId", "aumLrHdQcU");
        setField(term379931, term379931.getClass(), "firstRomVersion", "AtmgJeEIVk");
        setField(term379931, term379931.getClass(), "firstDataVersion", "NmALCMwbdV");
        setField(term379931, term379931.getClass(), "firstPlayDate", "GPKnMfrdoi");
        setField(term379931, term379931.getClass(), "lastGameId", "tRqGmjfkhY");
        setField(term379931, term379931.getClass(), "lastRomVersion", "CNylzkbkqX");
        setField(term379931, term379931.getClass(), "lastDataVersion", "MZOvhvkbNL");
        setField(term379931, term379931.getClass(), "compatibleCmVersion", "QpTiKNQuKE");
        setField(term379931, term379931.getClass(), "lastPlayDate", "PiqFzmVzrH");
        setIntField(term379931, term379931.getClass(), "lastPlaceId", 2025428267);
        setField(term379931, term379931.getClass(), "lastPlaceName", "xGooBAPjZs");
        setIntField(term379931, term379931.getClass(), "lastRegionId", -103988764);
        setField(term379931, term379931.getClass(), "lastRegionName", "iAEyqLNmqO");
        setIntField(term379931, term379931.getClass(), "lastAllNetId", 1935511020);
        setField(term379931, term379931.getClass(), "lastClientId", "ibnxqMQtwd");
        setIntField(term379931, term379931.getClass(), "lastUsedDeckId", 1420699538);
        setIntField(term379931, term379931.getClass(), "lastPlayMusicLevel", -1651978426);
        setIntField(term379931, term379931.getClass(), "lastEmoneyBrand", 1274668856);
        setField(term379929, term379929.getClass(), "user", term379931);
        setIntField(term379929, term379929.getClass(), "eventId", -834847907);
        setIntField(term379929, term379929.getClass(), "type", 936444328);
        setIntField(term379929, term379929.getClass(), "musicId", 1456602023);
        setIntField(term379929, term379929.getClass(), "level", -499798333);
        setIntField(term379929, term379929.getClass(), "techScoreMax", 1578833656);
        setIntField(term379929, term379929.getClass(), "platinumScoreMax", -354399266);
        setField(term379929, term379929.getClass(), "techRecordDate", "pUpVBWjpJC");
        setBooleanField(term379929, term379929.getClass(), "isTechNewRecord", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserEventMusic");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term379929, args);
    }

};


