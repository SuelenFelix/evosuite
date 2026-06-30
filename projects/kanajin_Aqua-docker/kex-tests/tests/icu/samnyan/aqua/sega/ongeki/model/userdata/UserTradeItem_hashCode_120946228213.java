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

public class UserTradeItem_hashCode_120946228213 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term156261;

    public UserTradeItem_hashCode_120946228213() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term156267 = new Long(2722004046017350471L);
        term156261 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserTradeItem"));
        Object term156263 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term156265 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term156281 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term156282 = newInstance(Class.forName("java.time.LocalDate"));
        Object term156286 = newInstance(Class.forName("java.time.LocalTime"));
        Object term156291 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term156292 = newInstance(Class.forName("java.time.LocalDate"));
        Object term156296 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term156261, term156261.getClass(), "id", -6512802381597662009L);
        setLongField(term156263, term156263.getClass(), "id", -2194383482869570162L);
        setLongField(term156265, term156265.getClass(), "id", 6272509896964660741L);
        setField(term156265, term156265.getClass(), "extId", term156267);
        setField(term156265, term156265.getClass(), "luid", "hKmKbZReWq");
        setIntField(term156282, term156282.getClass(), "year", 2023);
        setShortField(term156282, term156282.getClass(), "month", (short) 5);
        setShortField(term156282, term156282.getClass(), "day", (short) 24);
        setField(term156281, term156281.getClass(), "date", term156282);
        setByteField(term156286, term156286.getClass(), "hour", (byte) 7);
        setByteField(term156286, term156286.getClass(), "minute", (byte) 37);
        setByteField(term156286, term156286.getClass(), "second", (byte) 7);
        setIntField(term156286, term156286.getClass(), "nano", 648887020);
        setField(term156281, term156281.getClass(), "time", term156286);
        setField(term156265, term156265.getClass(), "registerTime", term156281);
        setIntField(term156292, term156292.getClass(), "year", 2029);
        setShortField(term156292, term156292.getClass(), "month", (short) 8);
        setShortField(term156292, term156292.getClass(), "day", (short) 9);
        setField(term156291, term156291.getClass(), "date", term156292);
        setByteField(term156296, term156296.getClass(), "hour", (byte) 15);
        setByteField(term156296, term156296.getClass(), "minute", (byte) 45);
        setByteField(term156296, term156296.getClass(), "second", (byte) 28);
        setIntField(term156296, term156296.getClass(), "nano", 584909169);
        setField(term156291, term156291.getClass(), "time", term156296);
        setField(term156265, term156265.getClass(), "accessTime", term156291);
        setField(term156263, term156263.getClass(), "card", term156265);
        setField(term156263, term156263.getClass(), "userName", "dVNQlaRjno");
        setIntField(term156263, term156263.getClass(), "level", 345548771);
        setIntField(term156263, term156263.getClass(), "reincarnationNum", 1092807671);
        setLongField(term156263, term156263.getClass(), "exp", -8854434162914610061L);
        setLongField(term156263, term156263.getClass(), "point", -5968601817421624476L);
        setLongField(term156263, term156263.getClass(), "totalPoint", 7520988637380790424L);
        setIntField(term156263, term156263.getClass(), "playCount", -1828014109);
        setIntField(term156263, term156263.getClass(), "jewelCount", 1241624050);
        setIntField(term156263, term156263.getClass(), "totalJewelCount", 21533705);
        setIntField(term156263, term156263.getClass(), "medalCount", -1838381563);
        setIntField(term156263, term156263.getClass(), "playerRating", -1277391013);
        setIntField(term156263, term156263.getClass(), "highestRating", 68174233);
        setIntField(term156263, term156263.getClass(), "battlePoint", -1037932427);
        setIntField(term156263, term156263.getClass(), "bestBattlePoint", 1911553569);
        setIntField(term156263, term156263.getClass(), "overDamageBattlePoint", -2021373513);
        setBooleanField(term156263, term156263.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term156263, term156263.getClass(), "nameplateId", -451056248);
        setIntField(term156263, term156263.getClass(), "trophyId", 1245561718);
        setIntField(term156263, term156263.getClass(), "cardId", -1727696105);
        setIntField(term156263, term156263.getClass(), "characterId", -164210021);
        setIntField(term156263, term156263.getClass(), "characterVoiceNo", -1813428473);
        setIntField(term156263, term156263.getClass(), "tabSetting", 2092175435);
        setIntField(term156263, term156263.getClass(), "tabSortSetting", -759305129);
        setIntField(term156263, term156263.getClass(), "cardCategorySetting", -1698841717);
        setIntField(term156263, term156263.getClass(), "cardSortSetting", -1541815388);
        setIntField(term156263, term156263.getClass(), "rivalScoreCategorySetting", 1831746570);
        setIntField(term156263, term156263.getClass(), "playedTutorialBit", 1122907916);
        setIntField(term156263, term156263.getClass(), "firstTutorialCancelNum", -349436567);
        setLongField(term156263, term156263.getClass(), "sumTechHighScore", 3026771141762351269L);
        setLongField(term156263, term156263.getClass(), "sumTechBasicHighScore", -5644277598782586928L);
        setLongField(term156263, term156263.getClass(), "sumTechAdvancedHighScore", 8775279542599344811L);
        setLongField(term156263, term156263.getClass(), "sumTechExpertHighScore", 1472742204877182326L);
        setLongField(term156263, term156263.getClass(), "sumTechMasterHighScore", 4220981015637651293L);
        setLongField(term156263, term156263.getClass(), "sumTechLunaticHighScore", 3340166480123086586L);
        setLongField(term156263, term156263.getClass(), "sumBattleHighScore", 8645399904701489103L);
        setLongField(term156263, term156263.getClass(), "sumBattleBasicHighScore", -1787167769341199205L);
        setLongField(term156263, term156263.getClass(), "sumBattleAdvancedHighScore", 3803233753524357284L);
        setLongField(term156263, term156263.getClass(), "sumBattleExpertHighScore", -3179090767436662155L);
        setLongField(term156263, term156263.getClass(), "sumBattleMasterHighScore", 5386517547679128749L);
        setLongField(term156263, term156263.getClass(), "sumBattleLunaticHighScore", -5306698981173846594L);
        setField(term156263, term156263.getClass(), "eventWatchedDate", "heuePoxaMW");
        setField(term156263, term156263.getClass(), "cmEventWatchedDate", "MxqYtTLyvM");
        setField(term156263, term156263.getClass(), "firstGameId", "FuAWIrUgQq");
        setField(term156263, term156263.getClass(), "firstRomVersion", "GMuFrECYuC");
        setField(term156263, term156263.getClass(), "firstDataVersion", "sgrKLUdnej");
        setField(term156263, term156263.getClass(), "firstPlayDate", "COSohDlJwZ");
        setField(term156263, term156263.getClass(), "lastGameId", "mnrQVzZjuq");
        setField(term156263, term156263.getClass(), "lastRomVersion", "SwynsBLJcI");
        setField(term156263, term156263.getClass(), "lastDataVersion", "yXgTitaDXW");
        setField(term156263, term156263.getClass(), "compatibleCmVersion", "qiYIlJidwz");
        setField(term156263, term156263.getClass(), "lastPlayDate", "bTxEkaNhzD");
        setIntField(term156263, term156263.getClass(), "lastPlaceId", 500313706);
        setField(term156263, term156263.getClass(), "lastPlaceName", "GJhlvPIEzj");
        setIntField(term156263, term156263.getClass(), "lastRegionId", 1386108098);
        setField(term156263, term156263.getClass(), "lastRegionName", "JxjbIphmRX");
        setIntField(term156263, term156263.getClass(), "lastAllNetId", 1902248044);
        setField(term156263, term156263.getClass(), "lastClientId", "igspPNkvLc");
        setIntField(term156263, term156263.getClass(), "lastUsedDeckId", 78847548);
        setIntField(term156263, term156263.getClass(), "lastPlayMusicLevel", 70270034);
        setIntField(term156263, term156263.getClass(), "lastEmoneyBrand", -1647216925);
        setField(term156261, term156261.getClass(), "user", term156263);
        setIntField(term156261, term156261.getClass(), "chapterId", -1854553775);
        setIntField(term156261, term156261.getClass(), "tradeItemId", -163217614);
        setIntField(term156261, term156261.getClass(), "tradeCount", 505508857);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserTradeItem");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term156261, args);
    }

};


