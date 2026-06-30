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

public class UserKop_getTotalPlatinumScore_14624249747 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term274009;

    public UserKop_getTotalPlatinumScore_14624249747() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term274015 = new Long(6381166215871562039L);
        term274009 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserKop"));
        Object term274011 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term274013 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term274029 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term274030 = newInstance(Class.forName("java.time.LocalDate"));
        Object term274034 = newInstance(Class.forName("java.time.LocalTime"));
        Object term274039 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term274040 = newInstance(Class.forName("java.time.LocalDate"));
        Object term274044 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term274009, term274009.getClass(), "id", 5220246767286316328L);
        setLongField(term274011, term274011.getClass(), "id", 5753478902711184187L);
        setLongField(term274013, term274013.getClass(), "id", 7764588813531114119L);
        setField(term274013, term274013.getClass(), "extId", term274015);
        setField(term274013, term274013.getClass(), "luid", "wYIvugRJpW");
        setIntField(term274030, term274030.getClass(), "year", 2017);
        setShortField(term274030, term274030.getClass(), "month", (short) 1);
        setShortField(term274030, term274030.getClass(), "day", (short) 5);
        setField(term274029, term274029.getClass(), "date", term274030);
        setByteField(term274034, term274034.getClass(), "hour", (byte) 3);
        setByteField(term274034, term274034.getClass(), "minute", (byte) 28);
        setByteField(term274034, term274034.getClass(), "second", (byte) 15);
        setIntField(term274034, term274034.getClass(), "nano", 137685825);
        setField(term274029, term274029.getClass(), "time", term274034);
        setField(term274013, term274013.getClass(), "registerTime", term274029);
        setIntField(term274040, term274040.getClass(), "year", 2012);
        setShortField(term274040, term274040.getClass(), "month", (short) 5);
        setShortField(term274040, term274040.getClass(), "day", (short) 31);
        setField(term274039, term274039.getClass(), "date", term274040);
        setByteField(term274044, term274044.getClass(), "hour", (byte) 7);
        setByteField(term274044, term274044.getClass(), "minute", (byte) 30);
        setByteField(term274044, term274044.getClass(), "second", (byte) 4);
        setIntField(term274044, term274044.getClass(), "nano", 424757551);
        setField(term274039, term274039.getClass(), "time", term274044);
        setField(term274013, term274013.getClass(), "accessTime", term274039);
        setField(term274011, term274011.getClass(), "card", term274013);
        setField(term274011, term274011.getClass(), "userName", "DRgRlMubyd");
        setIntField(term274011, term274011.getClass(), "level", 1518458868);
        setIntField(term274011, term274011.getClass(), "reincarnationNum", 102665908);
        setLongField(term274011, term274011.getClass(), "exp", 5798396191805323323L);
        setLongField(term274011, term274011.getClass(), "point", 75013683347246204L);
        setLongField(term274011, term274011.getClass(), "totalPoint", 1657746606572126325L);
        setIntField(term274011, term274011.getClass(), "playCount", 285235008);
        setIntField(term274011, term274011.getClass(), "jewelCount", -1345450442);
        setIntField(term274011, term274011.getClass(), "totalJewelCount", 1422151864);
        setIntField(term274011, term274011.getClass(), "medalCount", -509282716);
        setIntField(term274011, term274011.getClass(), "playerRating", -9134510);
        setIntField(term274011, term274011.getClass(), "highestRating", 1178675259);
        setIntField(term274011, term274011.getClass(), "battlePoint", 435909030);
        setIntField(term274011, term274011.getClass(), "bestBattlePoint", 663569895);
        setIntField(term274011, term274011.getClass(), "overDamageBattlePoint", -308690623);
        setBooleanField(term274011, term274011.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term274011, term274011.getClass(), "nameplateId", -1499435550);
        setIntField(term274011, term274011.getClass(), "trophyId", 953179902);
        setIntField(term274011, term274011.getClass(), "cardId", 1376611138);
        setIntField(term274011, term274011.getClass(), "characterId", 1432720232);
        setIntField(term274011, term274011.getClass(), "characterVoiceNo", -220448129);
        setIntField(term274011, term274011.getClass(), "tabSetting", 1764740473);
        setIntField(term274011, term274011.getClass(), "tabSortSetting", 1947047031);
        setIntField(term274011, term274011.getClass(), "cardCategorySetting", 409008942);
        setIntField(term274011, term274011.getClass(), "cardSortSetting", -682037881);
        setIntField(term274011, term274011.getClass(), "rivalScoreCategorySetting", 319801026);
        setIntField(term274011, term274011.getClass(), "playedTutorialBit", -53670685);
        setIntField(term274011, term274011.getClass(), "firstTutorialCancelNum", -1141764709);
        setLongField(term274011, term274011.getClass(), "sumTechHighScore", 1952804153016882556L);
        setLongField(term274011, term274011.getClass(), "sumTechBasicHighScore", 6609103050224210651L);
        setLongField(term274011, term274011.getClass(), "sumTechAdvancedHighScore", -585688649648579520L);
        setLongField(term274011, term274011.getClass(), "sumTechExpertHighScore", -6871181610954082082L);
        setLongField(term274011, term274011.getClass(), "sumTechMasterHighScore", -629358270252686392L);
        setLongField(term274011, term274011.getClass(), "sumTechLunaticHighScore", -1493688352767330288L);
        setLongField(term274011, term274011.getClass(), "sumBattleHighScore", -1903298675980750941L);
        setLongField(term274011, term274011.getClass(), "sumBattleBasicHighScore", -7091072290937533942L);
        setLongField(term274011, term274011.getClass(), "sumBattleAdvancedHighScore", 4440747220548229229L);
        setLongField(term274011, term274011.getClass(), "sumBattleExpertHighScore", 2500873604963348111L);
        setLongField(term274011, term274011.getClass(), "sumBattleMasterHighScore", 5217198968737211545L);
        setLongField(term274011, term274011.getClass(), "sumBattleLunaticHighScore", -3780966725992104975L);
        setField(term274011, term274011.getClass(), "eventWatchedDate", "IuKHVDtAZk");
        setField(term274011, term274011.getClass(), "cmEventWatchedDate", "HmynvbqVMU");
        setField(term274011, term274011.getClass(), "firstGameId", "WdCGTBlIAP");
        setField(term274011, term274011.getClass(), "firstRomVersion", "iVUpDfebIC");
        setField(term274011, term274011.getClass(), "firstDataVersion", "zPvXjjgNMX");
        setField(term274011, term274011.getClass(), "firstPlayDate", "sdwmwidvzL");
        setField(term274011, term274011.getClass(), "lastGameId", "chMmILhjdD");
        setField(term274011, term274011.getClass(), "lastRomVersion", "alatWSHAtR");
        setField(term274011, term274011.getClass(), "lastDataVersion", "TazhZNYNKv");
        setField(term274011, term274011.getClass(), "compatibleCmVersion", "BWFimCbVSH");
        setField(term274011, term274011.getClass(), "lastPlayDate", "eSdRlAUiRy");
        setIntField(term274011, term274011.getClass(), "lastPlaceId", -1884053350);
        setField(term274011, term274011.getClass(), "lastPlaceName", "oPbrBDThmz");
        setIntField(term274011, term274011.getClass(), "lastRegionId", 1432928549);
        setField(term274011, term274011.getClass(), "lastRegionName", "ZODtqxzDCW");
        setIntField(term274011, term274011.getClass(), "lastAllNetId", 1831668967);
        setField(term274011, term274011.getClass(), "lastClientId", "zkZJHDoPhw");
        setIntField(term274011, term274011.getClass(), "lastUsedDeckId", 1945358126);
        setIntField(term274011, term274011.getClass(), "lastPlayMusicLevel", 1544403394);
        setIntField(term274011, term274011.getClass(), "lastEmoneyBrand", -1417937275);
        setField(term274009, term274009.getClass(), "user", term274011);
        setField(term274009, term274009.getClass(), "authKey", "HQgXhFPwUc");
        setIntField(term274009, term274009.getClass(), "kopId", 283533258);
        setIntField(term274009, term274009.getClass(), "areaId", -674714132);
        setIntField(term274009, term274009.getClass(), "totalTechScore", 369679869);
        setIntField(term274009, term274009.getClass(), "totalPlatinumScore", -1045666157);
        setField(term274009, term274009.getClass(), "techRecordDate", "aMWamnhwTr");
        setBooleanField(term274009, term274009.getClass(), "isTotalTechNewRecord", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserKop");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotalPlatinumScore", argTypes, term274009, args);
    }

};


