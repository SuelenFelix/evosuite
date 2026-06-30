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
import java.lang.Integer;

public class UserTechCount_setLevelId_4228531528 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term365534;
     Object term365802;

    public UserTechCount_setLevelId_4228531528() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term365540 = new Long(5307445998877056304L);
        term365534 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserTechCount"));
        Object term365536 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term365538 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term365554 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term365555 = newInstance(Class.forName("java.time.LocalDate"));
        Object term365559 = newInstance(Class.forName("java.time.LocalTime"));
        Object term365564 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term365565 = newInstance(Class.forName("java.time.LocalDate"));
        Object term365569 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term365534, term365534.getClass(), "id", 2352213306352646490L);
        setLongField(term365536, term365536.getClass(), "id", -2540949265212753908L);
        setLongField(term365538, term365538.getClass(), "id", -3557322630002747746L);
        setField(term365538, term365538.getClass(), "extId", term365540);
        setField(term365538, term365538.getClass(), "luid", "JaujPfAyUY");
        setIntField(term365555, term365555.getClass(), "year", 2023);
        setShortField(term365555, term365555.getClass(), "month", (short) 10);
        setShortField(term365555, term365555.getClass(), "day", (short) 31);
        setField(term365554, term365554.getClass(), "date", term365555);
        setByteField(term365559, term365559.getClass(), "hour", (byte) 17);
        setByteField(term365559, term365559.getClass(), "minute", (byte) 20);
        setByteField(term365559, term365559.getClass(), "second", (byte) 47);
        setIntField(term365559, term365559.getClass(), "nano", 15095856);
        setField(term365554, term365554.getClass(), "time", term365559);
        setField(term365538, term365538.getClass(), "registerTime", term365554);
        setIntField(term365565, term365565.getClass(), "year", 2020);
        setShortField(term365565, term365565.getClass(), "month", (short) 7);
        setShortField(term365565, term365565.getClass(), "day", (short) 18);
        setField(term365564, term365564.getClass(), "date", term365565);
        setByteField(term365569, term365569.getClass(), "hour", (byte) 22);
        setByteField(term365569, term365569.getClass(), "minute", (byte) 29);
        setByteField(term365569, term365569.getClass(), "second", (byte) 37);
        setIntField(term365569, term365569.getClass(), "nano", 168233039);
        setField(term365564, term365564.getClass(), "time", term365569);
        setField(term365538, term365538.getClass(), "accessTime", term365564);
        setField(term365536, term365536.getClass(), "card", term365538);
        setField(term365536, term365536.getClass(), "userName", "YzJSRePcMh");
        setIntField(term365536, term365536.getClass(), "level", 997519435);
        setIntField(term365536, term365536.getClass(), "reincarnationNum", -1349936589);
        setLongField(term365536, term365536.getClass(), "exp", -6873547056985422489L);
        setLongField(term365536, term365536.getClass(), "point", 5654017071912332767L);
        setLongField(term365536, term365536.getClass(), "totalPoint", 5291716147509729983L);
        setIntField(term365536, term365536.getClass(), "playCount", -1329827516);
        setIntField(term365536, term365536.getClass(), "jewelCount", -98890499);
        setIntField(term365536, term365536.getClass(), "totalJewelCount", -2005401920);
        setIntField(term365536, term365536.getClass(), "medalCount", 430198905);
        setIntField(term365536, term365536.getClass(), "playerRating", -1821862736);
        setIntField(term365536, term365536.getClass(), "highestRating", 1600015712);
        setIntField(term365536, term365536.getClass(), "battlePoint", 594540506);
        setIntField(term365536, term365536.getClass(), "bestBattlePoint", -520630932);
        setIntField(term365536, term365536.getClass(), "overDamageBattlePoint", 1112276814);
        setBooleanField(term365536, term365536.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term365536, term365536.getClass(), "nameplateId", 1597409766);
        setIntField(term365536, term365536.getClass(), "trophyId", -2023590004);
        setIntField(term365536, term365536.getClass(), "cardId", 109280542);
        setIntField(term365536, term365536.getClass(), "characterId", 1153213940);
        setIntField(term365536, term365536.getClass(), "characterVoiceNo", 561200238);
        setIntField(term365536, term365536.getClass(), "tabSetting", 1697560437);
        setIntField(term365536, term365536.getClass(), "tabSortSetting", -152916106);
        setIntField(term365536, term365536.getClass(), "cardCategorySetting", -166534244);
        setIntField(term365536, term365536.getClass(), "cardSortSetting", -781010266);
        setIntField(term365536, term365536.getClass(), "rivalScoreCategorySetting", -1375382170);
        setIntField(term365536, term365536.getClass(), "playedTutorialBit", 358004327);
        setIntField(term365536, term365536.getClass(), "firstTutorialCancelNum", -1073017461);
        setLongField(term365536, term365536.getClass(), "sumTechHighScore", 4524345384182398093L);
        setLongField(term365536, term365536.getClass(), "sumTechBasicHighScore", 2718017011961596051L);
        setLongField(term365536, term365536.getClass(), "sumTechAdvancedHighScore", 172703308702056657L);
        setLongField(term365536, term365536.getClass(), "sumTechExpertHighScore", 2766550267820891508L);
        setLongField(term365536, term365536.getClass(), "sumTechMasterHighScore", -849863439647677234L);
        setLongField(term365536, term365536.getClass(), "sumTechLunaticHighScore", 1761805276477525225L);
        setLongField(term365536, term365536.getClass(), "sumBattleHighScore", 5975716754790488617L);
        setLongField(term365536, term365536.getClass(), "sumBattleBasicHighScore", -2579505989503885162L);
        setLongField(term365536, term365536.getClass(), "sumBattleAdvancedHighScore", -3250677326169953845L);
        setLongField(term365536, term365536.getClass(), "sumBattleExpertHighScore", -1451971928225474662L);
        setLongField(term365536, term365536.getClass(), "sumBattleMasterHighScore", 8283846769865112549L);
        setLongField(term365536, term365536.getClass(), "sumBattleLunaticHighScore", 8044961420718086201L);
        setField(term365536, term365536.getClass(), "eventWatchedDate", "DaTdneamUE");
        setField(term365536, term365536.getClass(), "cmEventWatchedDate", "BkbgXOZbPN");
        setField(term365536, term365536.getClass(), "firstGameId", "DruRsKpLrG");
        setField(term365536, term365536.getClass(), "firstRomVersion", "cjILsvuKyp");
        setField(term365536, term365536.getClass(), "firstDataVersion", "btOJSkDGeO");
        setField(term365536, term365536.getClass(), "firstPlayDate", "IqvaAeFxrV");
        setField(term365536, term365536.getClass(), "lastGameId", "xtGWGduIRw");
        setField(term365536, term365536.getClass(), "lastRomVersion", "sFIIQjnSEH");
        setField(term365536, term365536.getClass(), "lastDataVersion", "FEfRUAsuKB");
        setField(term365536, term365536.getClass(), "compatibleCmVersion", "FhkpmQnwUC");
        setField(term365536, term365536.getClass(), "lastPlayDate", "dDuKuhPbBw");
        setIntField(term365536, term365536.getClass(), "lastPlaceId", -302603948);
        setField(term365536, term365536.getClass(), "lastPlaceName", "EDmBxLqpMt");
        setIntField(term365536, term365536.getClass(), "lastRegionId", 850886176);
        setField(term365536, term365536.getClass(), "lastRegionName", "uQvBRdwOFM");
        setIntField(term365536, term365536.getClass(), "lastAllNetId", 362296164);
        setField(term365536, term365536.getClass(), "lastClientId", "yoBYaDsQoE");
        setIntField(term365536, term365536.getClass(), "lastUsedDeckId", 1667868085);
        setIntField(term365536, term365536.getClass(), "lastPlayMusicLevel", -394059533);
        setIntField(term365536, term365536.getClass(), "lastEmoneyBrand", 243761249);
        setField(term365534, term365534.getClass(), "user", term365536);
        setIntField(term365534, term365534.getClass(), "levelId", -630503406);
        setIntField(term365534, term365534.getClass(), "allBreakCount", -557461665);
        setIntField(term365534, term365534.getClass(), "allBreakPlusCount", 227409793);
        term365802 = new Integer(1178668065);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserTechCount");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term365802;
        callMethod(klass, "setLevelId", argTypes, term365534, args);
    }

};


