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

public class UserActivity_canEqual_72261683620 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term291802;
     Object term292074;

    public UserActivity_canEqual_72261683620() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term291808 = new Long(6848008460134431064L);
        term291802 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserActivity"));
        Object term291804 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term291806 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term291822 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term291823 = newInstance(Class.forName("java.time.LocalDate"));
        Object term291827 = newInstance(Class.forName("java.time.LocalTime"));
        Object term291832 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term291833 = newInstance(Class.forName("java.time.LocalDate"));
        Object term291837 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term291802, term291802.getClass(), "id", 358962680530561413L);
        setLongField(term291804, term291804.getClass(), "id", -6800878328809547776L);
        setLongField(term291806, term291806.getClass(), "id", -5126727058453996321L);
        setField(term291806, term291806.getClass(), "extId", term291808);
        setField(term291806, term291806.getClass(), "luid", "nFsigFFmWc");
        setIntField(term291823, term291823.getClass(), "year", 2027);
        setShortField(term291823, term291823.getClass(), "month", (short) 5);
        setShortField(term291823, term291823.getClass(), "day", (short) 1);
        setField(term291822, term291822.getClass(), "date", term291823);
        setByteField(term291827, term291827.getClass(), "hour", (byte) 12);
        setByteField(term291827, term291827.getClass(), "minute", (byte) 23);
        setByteField(term291827, term291827.getClass(), "second", (byte) 5);
        setIntField(term291827, term291827.getClass(), "nano", 208185716);
        setField(term291822, term291822.getClass(), "time", term291827);
        setField(term291806, term291806.getClass(), "registerTime", term291822);
        setIntField(term291833, term291833.getClass(), "year", 2015);
        setShortField(term291833, term291833.getClass(), "month", (short) 6);
        setShortField(term291833, term291833.getClass(), "day", (short) 3);
        setField(term291832, term291832.getClass(), "date", term291833);
        setByteField(term291837, term291837.getClass(), "hour", (byte) 20);
        setByteField(term291837, term291837.getClass(), "minute", (byte) 50);
        setByteField(term291837, term291837.getClass(), "second", (byte) 48);
        setIntField(term291837, term291837.getClass(), "nano", 150842847);
        setField(term291832, term291832.getClass(), "time", term291837);
        setField(term291806, term291806.getClass(), "accessTime", term291832);
        setField(term291804, term291804.getClass(), "card", term291806);
        setField(term291804, term291804.getClass(), "userName", "qehgMPhJMU");
        setIntField(term291804, term291804.getClass(), "level", 1194181835);
        setIntField(term291804, term291804.getClass(), "reincarnationNum", 1632400306);
        setLongField(term291804, term291804.getClass(), "exp", -503244679635596512L);
        setLongField(term291804, term291804.getClass(), "point", 3359268957937268144L);
        setLongField(term291804, term291804.getClass(), "totalPoint", -4558444660406857835L);
        setIntField(term291804, term291804.getClass(), "playCount", 982516945);
        setIntField(term291804, term291804.getClass(), "jewelCount", 204667016);
        setIntField(term291804, term291804.getClass(), "totalJewelCount", 1802575126);
        setIntField(term291804, term291804.getClass(), "medalCount", 27548674);
        setIntField(term291804, term291804.getClass(), "playerRating", 534250372);
        setIntField(term291804, term291804.getClass(), "highestRating", -844433028);
        setIntField(term291804, term291804.getClass(), "battlePoint", 176212160);
        setIntField(term291804, term291804.getClass(), "bestBattlePoint", 528422554);
        setIntField(term291804, term291804.getClass(), "overDamageBattlePoint", 2135164524);
        setBooleanField(term291804, term291804.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term291804, term291804.getClass(), "nameplateId", 1763724087);
        setIntField(term291804, term291804.getClass(), "trophyId", -2068967312);
        setIntField(term291804, term291804.getClass(), "cardId", 1090298719);
        setIntField(term291804, term291804.getClass(), "characterId", -1389701023);
        setIntField(term291804, term291804.getClass(), "characterVoiceNo", 710754133);
        setIntField(term291804, term291804.getClass(), "tabSetting", -1685837203);
        setIntField(term291804, term291804.getClass(), "tabSortSetting", -1533007635);
        setIntField(term291804, term291804.getClass(), "cardCategorySetting", -351928967);
        setIntField(term291804, term291804.getClass(), "cardSortSetting", 210918082);
        setIntField(term291804, term291804.getClass(), "rivalScoreCategorySetting", 434146400);
        setIntField(term291804, term291804.getClass(), "playedTutorialBit", 97574163);
        setIntField(term291804, term291804.getClass(), "firstTutorialCancelNum", -971185051);
        setLongField(term291804, term291804.getClass(), "sumTechHighScore", 3454919876955785135L);
        setLongField(term291804, term291804.getClass(), "sumTechBasicHighScore", 7986122272879328489L);
        setLongField(term291804, term291804.getClass(), "sumTechAdvancedHighScore", 6207269506854467087L);
        setLongField(term291804, term291804.getClass(), "sumTechExpertHighScore", -3138776567613759318L);
        setLongField(term291804, term291804.getClass(), "sumTechMasterHighScore", -8918069587726906216L);
        setLongField(term291804, term291804.getClass(), "sumTechLunaticHighScore", 3795472888522602025L);
        setLongField(term291804, term291804.getClass(), "sumBattleHighScore", 6381276862060693267L);
        setLongField(term291804, term291804.getClass(), "sumBattleBasicHighScore", -6261679690960628098L);
        setLongField(term291804, term291804.getClass(), "sumBattleAdvancedHighScore", -3249180463442711830L);
        setLongField(term291804, term291804.getClass(), "sumBattleExpertHighScore", 3495870965343708366L);
        setLongField(term291804, term291804.getClass(), "sumBattleMasterHighScore", -2558604038341126384L);
        setLongField(term291804, term291804.getClass(), "sumBattleLunaticHighScore", -6455173644026725680L);
        setField(term291804, term291804.getClass(), "eventWatchedDate", "IjpmHZDGJg");
        setField(term291804, term291804.getClass(), "cmEventWatchedDate", "kNKLoDsbIJ");
        setField(term291804, term291804.getClass(), "firstGameId", "QETULvuUfM");
        setField(term291804, term291804.getClass(), "firstRomVersion", "erGLJPrSFu");
        setField(term291804, term291804.getClass(), "firstDataVersion", "hClrkDuclb");
        setField(term291804, term291804.getClass(), "firstPlayDate", "RQGjkjoJid");
        setField(term291804, term291804.getClass(), "lastGameId", "fqFCsfbRxM");
        setField(term291804, term291804.getClass(), "lastRomVersion", "VxtdFZGhCL");
        setField(term291804, term291804.getClass(), "lastDataVersion", "NdCqWFAKtC");
        setField(term291804, term291804.getClass(), "compatibleCmVersion", "brggoDHwgJ");
        setField(term291804, term291804.getClass(), "lastPlayDate", "mDOxbNsMUA");
        setIntField(term291804, term291804.getClass(), "lastPlaceId", 399127883);
        setField(term291804, term291804.getClass(), "lastPlaceName", "wmcOIwaOzF");
        setIntField(term291804, term291804.getClass(), "lastRegionId", 764941661);
        setField(term291804, term291804.getClass(), "lastRegionName", "tvKxAKjRmt");
        setIntField(term291804, term291804.getClass(), "lastAllNetId", 1604092033);
        setField(term291804, term291804.getClass(), "lastClientId", "YqKucvfPsH");
        setIntField(term291804, term291804.getClass(), "lastUsedDeckId", -513324517);
        setIntField(term291804, term291804.getClass(), "lastPlayMusicLevel", -821870990);
        setIntField(term291804, term291804.getClass(), "lastEmoneyBrand", -1162456029);
        setField(term291802, term291802.getClass(), "user", term291804);
        setIntField(term291802, term291802.getClass(), "kind", -159817281);
        setIntField(term291802, term291802.getClass(), "activityId", -1128287307);
        setIntField(term291802, term291802.getClass(), "sortNumber", 1885371265);
        setIntField(term291802, term291802.getClass(), "param1", 225734051);
        setIntField(term291802, term291802.getClass(), "param2", -349103263);
        setIntField(term291802, term291802.getClass(), "param3", -1716968807);
        setIntField(term291802, term291802.getClass(), "param4", 1180668641);
        term292074 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserActivity");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term292074;
        callMethod(klass, "canEqual", argTypes, term291802, args);
    }

};


