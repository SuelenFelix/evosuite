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

public class UserOption_setAbort_575461747 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term330600;
     Object term330902;

    public UserOption_setAbort_575461747() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term330606 = new Long(6921855906793748590L);
        term330600 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserOption"));
        Object term330602 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term330604 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term330620 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term330621 = newInstance(Class.forName("java.time.LocalDate"));
        Object term330625 = newInstance(Class.forName("java.time.LocalTime"));
        Object term330630 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term330631 = newInstance(Class.forName("java.time.LocalDate"));
        Object term330635 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term330600, term330600.getClass(), "id", -111122488548209839L);
        setLongField(term330602, term330602.getClass(), "id", -5097329586989070454L);
        setLongField(term330604, term330604.getClass(), "id", 3982396493425468179L);
        setField(term330604, term330604.getClass(), "extId", term330606);
        setField(term330604, term330604.getClass(), "luid", "mCLwpbFxDT");
        setIntField(term330621, term330621.getClass(), "year", 2010);
        setShortField(term330621, term330621.getClass(), "month", (short) 7);
        setShortField(term330621, term330621.getClass(), "day", (short) 30);
        setField(term330620, term330620.getClass(), "date", term330621);
        setByteField(term330625, term330625.getClass(), "hour", (byte) 12);
        setByteField(term330625, term330625.getClass(), "minute", (byte) 58);
        setByteField(term330625, term330625.getClass(), "second", (byte) 33);
        setIntField(term330625, term330625.getClass(), "nano", 370604002);
        setField(term330620, term330620.getClass(), "time", term330625);
        setField(term330604, term330604.getClass(), "registerTime", term330620);
        setIntField(term330631, term330631.getClass(), "year", 2025);
        setShortField(term330631, term330631.getClass(), "month", (short) 4);
        setShortField(term330631, term330631.getClass(), "day", (short) 22);
        setField(term330630, term330630.getClass(), "date", term330631);
        setByteField(term330635, term330635.getClass(), "hour", (byte) 11);
        setByteField(term330635, term330635.getClass(), "minute", (byte) 12);
        setByteField(term330635, term330635.getClass(), "second", (byte) 31);
        setIntField(term330635, term330635.getClass(), "nano", 501510240);
        setField(term330630, term330630.getClass(), "time", term330635);
        setField(term330604, term330604.getClass(), "accessTime", term330630);
        setField(term330602, term330602.getClass(), "card", term330604);
        setField(term330602, term330602.getClass(), "userName", "giTAluPDlF");
        setIntField(term330602, term330602.getClass(), "level", -936075827);
        setIntField(term330602, term330602.getClass(), "reincarnationNum", -1984895131);
        setLongField(term330602, term330602.getClass(), "exp", 9164835783669524369L);
        setLongField(term330602, term330602.getClass(), "point", 7627109929183931588L);
        setLongField(term330602, term330602.getClass(), "totalPoint", -8195699209724532359L);
        setIntField(term330602, term330602.getClass(), "playCount", 2043867906);
        setIntField(term330602, term330602.getClass(), "jewelCount", -1530948763);
        setIntField(term330602, term330602.getClass(), "totalJewelCount", 1444611292);
        setIntField(term330602, term330602.getClass(), "medalCount", -1073109453);
        setIntField(term330602, term330602.getClass(), "playerRating", -221689194);
        setIntField(term330602, term330602.getClass(), "highestRating", 1181534417);
        setIntField(term330602, term330602.getClass(), "battlePoint", 938718786);
        setIntField(term330602, term330602.getClass(), "bestBattlePoint", 1853375526);
        setIntField(term330602, term330602.getClass(), "overDamageBattlePoint", 257389395);
        setBooleanField(term330602, term330602.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term330602, term330602.getClass(), "nameplateId", -2069461138);
        setIntField(term330602, term330602.getClass(), "trophyId", 1337558872);
        setIntField(term330602, term330602.getClass(), "cardId", 1213295046);
        setIntField(term330602, term330602.getClass(), "characterId", 2109471016);
        setIntField(term330602, term330602.getClass(), "characterVoiceNo", 1173146006);
        setIntField(term330602, term330602.getClass(), "tabSetting", 1453240334);
        setIntField(term330602, term330602.getClass(), "tabSortSetting", -181940055);
        setIntField(term330602, term330602.getClass(), "cardCategorySetting", 1153346490);
        setIntField(term330602, term330602.getClass(), "cardSortSetting", 209125932);
        setIntField(term330602, term330602.getClass(), "rivalScoreCategorySetting", -260090114);
        setIntField(term330602, term330602.getClass(), "playedTutorialBit", -1126440972);
        setIntField(term330602, term330602.getClass(), "firstTutorialCancelNum", -828056931);
        setLongField(term330602, term330602.getClass(), "sumTechHighScore", 4603370484742947344L);
        setLongField(term330602, term330602.getClass(), "sumTechBasicHighScore", 4338783517314061511L);
        setLongField(term330602, term330602.getClass(), "sumTechAdvancedHighScore", -1458897220500085716L);
        setLongField(term330602, term330602.getClass(), "sumTechExpertHighScore", -4049114690914960799L);
        setLongField(term330602, term330602.getClass(), "sumTechMasterHighScore", 5612198224886547481L);
        setLongField(term330602, term330602.getClass(), "sumTechLunaticHighScore", -1102519141213159308L);
        setLongField(term330602, term330602.getClass(), "sumBattleHighScore", 2929088578902985513L);
        setLongField(term330602, term330602.getClass(), "sumBattleBasicHighScore", 3751555717926209688L);
        setLongField(term330602, term330602.getClass(), "sumBattleAdvancedHighScore", -721483711150577726L);
        setLongField(term330602, term330602.getClass(), "sumBattleExpertHighScore", -4367241315272371150L);
        setLongField(term330602, term330602.getClass(), "sumBattleMasterHighScore", 8984989224820613729L);
        setLongField(term330602, term330602.getClass(), "sumBattleLunaticHighScore", 1877241587245959962L);
        setField(term330602, term330602.getClass(), "eventWatchedDate", "RjsLyXIrbG");
        setField(term330602, term330602.getClass(), "cmEventWatchedDate", "NiWvKYejkA");
        setField(term330602, term330602.getClass(), "firstGameId", "mvgBkzjCBp");
        setField(term330602, term330602.getClass(), "firstRomVersion", "UkRkwfKVup");
        setField(term330602, term330602.getClass(), "firstDataVersion", "bfyvAfYyTn");
        setField(term330602, term330602.getClass(), "firstPlayDate", "ruVkEkqreV");
        setField(term330602, term330602.getClass(), "lastGameId", "EkCSQjEEEl");
        setField(term330602, term330602.getClass(), "lastRomVersion", "gxeDEismBK");
        setField(term330602, term330602.getClass(), "lastDataVersion", "tqorSQrdLA");
        setField(term330602, term330602.getClass(), "compatibleCmVersion", "LYyUZRevGC");
        setField(term330602, term330602.getClass(), "lastPlayDate", "bTNZUxJOeo");
        setIntField(term330602, term330602.getClass(), "lastPlaceId", -1506249031);
        setField(term330602, term330602.getClass(), "lastPlaceName", "HRfgCfrNFG");
        setIntField(term330602, term330602.getClass(), "lastRegionId", -672642370);
        setField(term330602, term330602.getClass(), "lastRegionName", "chlrtKJFbp");
        setIntField(term330602, term330602.getClass(), "lastAllNetId", 40504609);
        setField(term330602, term330602.getClass(), "lastClientId", "scDDLDWWaM");
        setIntField(term330602, term330602.getClass(), "lastUsedDeckId", -894394178);
        setIntField(term330602, term330602.getClass(), "lastPlayMusicLevel", -1261594665);
        setIntField(term330602, term330602.getClass(), "lastEmoneyBrand", 801078389);
        setField(term330600, term330600.getClass(), "user", term330602);
        setIntField(term330600, term330600.getClass(), "optionSet", -1086847742);
        setIntField(term330600, term330600.getClass(), "speed", 1199895332);
        setIntField(term330600, term330600.getClass(), "mirror", 1966865362);
        setIntField(term330600, term330600.getClass(), "judgeTiming", 1382092720);
        setIntField(term330600, term330600.getClass(), "judgeAdjustment", 1042080004);
        setIntField(term330600, term330600.getClass(), "abort", -936417577);
        setIntField(term330600, term330600.getClass(), "stealthField", -1847271541);
        setIntField(term330600, term330600.getClass(), "tapSound", -1612901514);
        setIntField(term330600, term330600.getClass(), "volGuide", 1449192632);
        setIntField(term330600, term330600.getClass(), "volAll", -1137450465);
        setIntField(term330600, term330600.getClass(), "volTap", 883184031);
        setIntField(term330600, term330600.getClass(), "volCrTap", 858732697);
        setIntField(term330600, term330600.getClass(), "volHold", -1883914353);
        setIntField(term330600, term330600.getClass(), "volSide", 1879420145);
        setIntField(term330600, term330600.getClass(), "volFlick", -233477175);
        setIntField(term330600, term330600.getClass(), "volBell", -99935922);
        setIntField(term330600, term330600.getClass(), "volEnemy", 552578789);
        setIntField(term330600, term330600.getClass(), "volSkill", -1306749786);
        setIntField(term330600, term330600.getClass(), "volDamage", 328613508);
        setIntField(term330600, term330600.getClass(), "colorField", 829220352);
        setIntField(term330600, term330600.getClass(), "colorLaneBright", 542497856);
        setIntField(term330600, term330600.getClass(), "colorWallBright", 1888229102);
        setIntField(term330600, term330600.getClass(), "colorLane", -1305718028);
        setIntField(term330600, term330600.getClass(), "colorSide", -1681421472);
        setIntField(term330600, term330600.getClass(), "effectDamage", 2112775128);
        setIntField(term330600, term330600.getClass(), "effectPos", 384681987);
        setIntField(term330600, term330600.getClass(), "judgeDisp", -1693128954);
        setIntField(term330600, term330600.getClass(), "judgePos", 296134080);
        setIntField(term330600, term330600.getClass(), "judgeBreak", 1115713370);
        setIntField(term330600, term330600.getClass(), "judgeHit", -2083559391);
        setIntField(term330600, term330600.getClass(), "platinumBreakDisp", 366626773);
        setIntField(term330600, term330600.getClass(), "judgeCriticalBreak", 338417057);
        setIntField(term330600, term330600.getClass(), "matching", -648138520);
        setIntField(term330600, term330600.getClass(), "dispPlayerLv", -890741708);
        setIntField(term330600, term330600.getClass(), "dispRating", -42340785);
        setIntField(term330600, term330600.getClass(), "dispBP", 1597262218);
        setIntField(term330600, term330600.getClass(), "headphone", -341505436);
        term330902 = new Integer(1566670291);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term330902;
        callMethod(klass, "setAbort", argTypes, term330600, args);
    }

};


