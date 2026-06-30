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

public class UserData_setMedalCount_142688822273 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52883;
     Object term53146;

    public UserData_setMedalCount_142688822273() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term52887 = new Long(1084801489398441516L);
        term52883 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term52885 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term52901 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term52902 = newInstance(Class.forName("java.time.LocalDate"));
        Object term52906 = newInstance(Class.forName("java.time.LocalTime"));
        Object term52911 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term52912 = newInstance(Class.forName("java.time.LocalDate"));
        Object term52916 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term52883, term52883.getClass(), "id", -3745055287608698860L);
        setLongField(term52885, term52885.getClass(), "id", -2505520083946785927L);
        setField(term52885, term52885.getClass(), "extId", term52887);
        setField(term52885, term52885.getClass(), "luid", "voDQuoTpgt");
        setIntField(term52902, term52902.getClass(), "year", 2019);
        setShortField(term52902, term52902.getClass(), "month", (short) 9);
        setShortField(term52902, term52902.getClass(), "day", (short) 3);
        setField(term52901, term52901.getClass(), "date", term52902);
        setByteField(term52906, term52906.getClass(), "hour", (byte) 2);
        setByteField(term52906, term52906.getClass(), "minute", (byte) 32);
        setByteField(term52906, term52906.getClass(), "second", (byte) 30);
        setIntField(term52906, term52906.getClass(), "nano", 339846128);
        setField(term52901, term52901.getClass(), "time", term52906);
        setField(term52885, term52885.getClass(), "registerTime", term52901);
        setIntField(term52912, term52912.getClass(), "year", 2029);
        setShortField(term52912, term52912.getClass(), "month", (short) 11);
        setShortField(term52912, term52912.getClass(), "day", (short) 6);
        setField(term52911, term52911.getClass(), "date", term52912);
        setByteField(term52916, term52916.getClass(), "hour", (byte) 2);
        setByteField(term52916, term52916.getClass(), "minute", (byte) 55);
        setByteField(term52916, term52916.getClass(), "second", (byte) 43);
        setIntField(term52916, term52916.getClass(), "nano", 109400580);
        setField(term52911, term52911.getClass(), "time", term52916);
        setField(term52885, term52885.getClass(), "accessTime", term52911);
        setField(term52883, term52883.getClass(), "card", term52885);
        setField(term52883, term52883.getClass(), "userName", "wgwSIKAsrj");
        setIntField(term52883, term52883.getClass(), "level", 1917343242);
        setIntField(term52883, term52883.getClass(), "reincarnationNum", 504552083);
        setLongField(term52883, term52883.getClass(), "exp", 3830634993165746272L);
        setLongField(term52883, term52883.getClass(), "point", -7432340314800293983L);
        setLongField(term52883, term52883.getClass(), "totalPoint", 6550654434780156893L);
        setIntField(term52883, term52883.getClass(), "playCount", -714955265);
        setIntField(term52883, term52883.getClass(), "jewelCount", 1191317081);
        setIntField(term52883, term52883.getClass(), "totalJewelCount", -1321805207);
        setIntField(term52883, term52883.getClass(), "medalCount", 1827794411);
        setIntField(term52883, term52883.getClass(), "playerRating", -1377700263);
        setIntField(term52883, term52883.getClass(), "highestRating", -38722118);
        setIntField(term52883, term52883.getClass(), "battlePoint", 1123663642);
        setIntField(term52883, term52883.getClass(), "bestBattlePoint", 404156777);
        setIntField(term52883, term52883.getClass(), "overDamageBattlePoint", 74684104);
        setBooleanField(term52883, term52883.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term52883, term52883.getClass(), "nameplateId", 502851553);
        setIntField(term52883, term52883.getClass(), "trophyId", -1149654883);
        setIntField(term52883, term52883.getClass(), "cardId", -346017809);
        setIntField(term52883, term52883.getClass(), "characterId", 1922136769);
        setIntField(term52883, term52883.getClass(), "characterVoiceNo", 1253469190);
        setIntField(term52883, term52883.getClass(), "tabSetting", -92568219);
        setIntField(term52883, term52883.getClass(), "tabSortSetting", 647226080);
        setIntField(term52883, term52883.getClass(), "cardCategorySetting", -1031047832);
        setIntField(term52883, term52883.getClass(), "cardSortSetting", -1460628462);
        setIntField(term52883, term52883.getClass(), "rivalScoreCategorySetting", -1466838817);
        setIntField(term52883, term52883.getClass(), "playedTutorialBit", -1308667183);
        setIntField(term52883, term52883.getClass(), "firstTutorialCancelNum", -1936073165);
        setLongField(term52883, term52883.getClass(), "sumTechHighScore", 2915324594222120179L);
        setLongField(term52883, term52883.getClass(), "sumTechBasicHighScore", 6230221287187976505L);
        setLongField(term52883, term52883.getClass(), "sumTechAdvancedHighScore", 3693671303799195202L);
        setLongField(term52883, term52883.getClass(), "sumTechExpertHighScore", 5122767787240845667L);
        setLongField(term52883, term52883.getClass(), "sumTechMasterHighScore", -1856029526365001621L);
        setLongField(term52883, term52883.getClass(), "sumTechLunaticHighScore", 6951543447963559207L);
        setLongField(term52883, term52883.getClass(), "sumBattleHighScore", -5708751122198529383L);
        setLongField(term52883, term52883.getClass(), "sumBattleBasicHighScore", 3684413141105346843L);
        setLongField(term52883, term52883.getClass(), "sumBattleAdvancedHighScore", 808630420020053699L);
        setLongField(term52883, term52883.getClass(), "sumBattleExpertHighScore", 5295754745722713022L);
        setLongField(term52883, term52883.getClass(), "sumBattleMasterHighScore", -3637086174445011335L);
        setLongField(term52883, term52883.getClass(), "sumBattleLunaticHighScore", -7862819468419399203L);
        setField(term52883, term52883.getClass(), "eventWatchedDate", "aGJCHRHyCe");
        setField(term52883, term52883.getClass(), "cmEventWatchedDate", "WingwhSgfc");
        setField(term52883, term52883.getClass(), "firstGameId", "YEcmxINfnL");
        setField(term52883, term52883.getClass(), "firstRomVersion", "EGytMwlDVe");
        setField(term52883, term52883.getClass(), "firstDataVersion", "GFQCmYZmcg");
        setField(term52883, term52883.getClass(), "firstPlayDate", "qPgbFtsgtk");
        setField(term52883, term52883.getClass(), "lastGameId", "nkmiePLZgp");
        setField(term52883, term52883.getClass(), "lastRomVersion", "VoCvDpwwFr");
        setField(term52883, term52883.getClass(), "lastDataVersion", "zYOmoQqDOd");
        setField(term52883, term52883.getClass(), "compatibleCmVersion", "kmgEVEqTGa");
        setField(term52883, term52883.getClass(), "lastPlayDate", "qakIqInzyM");
        setIntField(term52883, term52883.getClass(), "lastPlaceId", 2145615477);
        setField(term52883, term52883.getClass(), "lastPlaceName", "EOsBgwlmva");
        setIntField(term52883, term52883.getClass(), "lastRegionId", 1806729907);
        setField(term52883, term52883.getClass(), "lastRegionName", "qcSJruZuJy");
        setIntField(term52883, term52883.getClass(), "lastAllNetId", -182792320);
        setField(term52883, term52883.getClass(), "lastClientId", "NOSJtfgqAs");
        setIntField(term52883, term52883.getClass(), "lastUsedDeckId", 409164749);
        setIntField(term52883, term52883.getClass(), "lastPlayMusicLevel", 896581942);
        setIntField(term52883, term52883.getClass(), "lastEmoneyBrand", 108670537);
        term53146 = new Integer(-94326012);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term53146;
        callMethod(klass, "setMedalCount", argTypes, term52883, args);
    }

};


