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

public class UserMusicItem_getUser_9712820482 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term851;

    public UserMusicItem_getUser_9712820482() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term857 = new Long(-8257434502486459194L);
        term851 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMusicItem"));
        Object term853 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term855 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term871 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term872 = newInstance(Class.forName("java.time.LocalDate"));
        Object term876 = newInstance(Class.forName("java.time.LocalTime"));
        Object term881 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term882 = newInstance(Class.forName("java.time.LocalDate"));
        Object term886 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term851, term851.getClass(), "id", 1233889271256172047L);
        setLongField(term853, term853.getClass(), "id", 6617340557564669657L);
        setLongField(term855, term855.getClass(), "id", 1439298019805881866L);
        setField(term855, term855.getClass(), "extId", term857);
        setField(term855, term855.getClass(), "luid", "AijpHYOFuy");
        setIntField(term872, term872.getClass(), "year", 2022);
        setShortField(term872, term872.getClass(), "month", (short) 2);
        setShortField(term872, term872.getClass(), "day", (short) 26);
        setField(term871, term871.getClass(), "date", term872);
        setByteField(term876, term876.getClass(), "hour", (byte) 11);
        setByteField(term876, term876.getClass(), "minute", (byte) 42);
        setByteField(term876, term876.getClass(), "second", (byte) 15);
        setIntField(term876, term876.getClass(), "nano", 377731937);
        setField(term871, term871.getClass(), "time", term876);
        setField(term855, term855.getClass(), "registerTime", term871);
        setIntField(term882, term882.getClass(), "year", 2026);
        setShortField(term882, term882.getClass(), "month", (short) 12);
        setShortField(term882, term882.getClass(), "day", (short) 14);
        setField(term881, term881.getClass(), "date", term882);
        setByteField(term886, term886.getClass(), "hour", (byte) 16);
        setByteField(term886, term886.getClass(), "minute", (byte) 34);
        setByteField(term886, term886.getClass(), "second", (byte) 9);
        setIntField(term886, term886.getClass(), "nano", 518326996);
        setField(term881, term881.getClass(), "time", term886);
        setField(term855, term855.getClass(), "accessTime", term881);
        setField(term853, term853.getClass(), "card", term855);
        setField(term853, term853.getClass(), "userName", "SbAoxhfrkn");
        setIntField(term853, term853.getClass(), "level", 1596070772);
        setIntField(term853, term853.getClass(), "reincarnationNum", 97029295);
        setLongField(term853, term853.getClass(), "exp", -8708192233349544946L);
        setLongField(term853, term853.getClass(), "point", 5907001541142728739L);
        setLongField(term853, term853.getClass(), "totalPoint", 4178434741742309755L);
        setIntField(term853, term853.getClass(), "playCount", -1371869594);
        setIntField(term853, term853.getClass(), "jewelCount", -2095575670);
        setIntField(term853, term853.getClass(), "totalJewelCount", 1225272962);
        setIntField(term853, term853.getClass(), "medalCount", 1324040357);
        setIntField(term853, term853.getClass(), "playerRating", -1588772968);
        setIntField(term853, term853.getClass(), "highestRating", -93135961);
        setIntField(term853, term853.getClass(), "battlePoint", -112921587);
        setIntField(term853, term853.getClass(), "bestBattlePoint", 933028652);
        setIntField(term853, term853.getClass(), "overDamageBattlePoint", 287287233);
        setBooleanField(term853, term853.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term853, term853.getClass(), "nameplateId", 962840079);
        setIntField(term853, term853.getClass(), "trophyId", 1540719661);
        setIntField(term853, term853.getClass(), "cardId", 1265463001);
        setIntField(term853, term853.getClass(), "characterId", 335112684);
        setIntField(term853, term853.getClass(), "characterVoiceNo", 1551099402);
        setIntField(term853, term853.getClass(), "tabSetting", -2027534003);
        setIntField(term853, term853.getClass(), "tabSortSetting", 1063420942);
        setIntField(term853, term853.getClass(), "cardCategorySetting", 1375330971);
        setIntField(term853, term853.getClass(), "cardSortSetting", -478195677);
        setIntField(term853, term853.getClass(), "rivalScoreCategorySetting", 972867650);
        setIntField(term853, term853.getClass(), "playedTutorialBit", 1655935355);
        setIntField(term853, term853.getClass(), "firstTutorialCancelNum", -481533957);
        setLongField(term853, term853.getClass(), "sumTechHighScore", -2068172595987555756L);
        setLongField(term853, term853.getClass(), "sumTechBasicHighScore", -6292278961887936280L);
        setLongField(term853, term853.getClass(), "sumTechAdvancedHighScore", -6645965768855543712L);
        setLongField(term853, term853.getClass(), "sumTechExpertHighScore", 4784595517102746672L);
        setLongField(term853, term853.getClass(), "sumTechMasterHighScore", -7612550318181586304L);
        setLongField(term853, term853.getClass(), "sumTechLunaticHighScore", -2170847986967241072L);
        setLongField(term853, term853.getClass(), "sumBattleHighScore", 4044358158040652353L);
        setLongField(term853, term853.getClass(), "sumBattleBasicHighScore", -4443169559037975007L);
        setLongField(term853, term853.getClass(), "sumBattleAdvancedHighScore", -3842548265506930260L);
        setLongField(term853, term853.getClass(), "sumBattleExpertHighScore", -5788180182343976541L);
        setLongField(term853, term853.getClass(), "sumBattleMasterHighScore", 2936323121573284007L);
        setLongField(term853, term853.getClass(), "sumBattleLunaticHighScore", -1154553077993834885L);
        setField(term853, term853.getClass(), "eventWatchedDate", "kuTXqwMtDB");
        setField(term853, term853.getClass(), "cmEventWatchedDate", "Ghbwtircqb");
        setField(term853, term853.getClass(), "firstGameId", "xrwlQZdwCp");
        setField(term853, term853.getClass(), "firstRomVersion", "IDCWpPLRkE");
        setField(term853, term853.getClass(), "firstDataVersion", "nyiiPDVjAc");
        setField(term853, term853.getClass(), "firstPlayDate", "aKnKipADSo");
        setField(term853, term853.getClass(), "lastGameId", "wSQxaModmm");
        setField(term853, term853.getClass(), "lastRomVersion", "UlajhuVLaP");
        setField(term853, term853.getClass(), "lastDataVersion", "gGSMzuGICf");
        setField(term853, term853.getClass(), "compatibleCmVersion", "hxCBltsObl");
        setField(term853, term853.getClass(), "lastPlayDate", "BndsHwAFMv");
        setIntField(term853, term853.getClass(), "lastPlaceId", 1240914516);
        setField(term853, term853.getClass(), "lastPlaceName", "GzFkzHGYFt");
        setIntField(term853, term853.getClass(), "lastRegionId", -1465035361);
        setField(term853, term853.getClass(), "lastRegionName", "tShwQLRGNe");
        setIntField(term853, term853.getClass(), "lastAllNetId", 1090617576);
        setField(term853, term853.getClass(), "lastClientId", "LvtrsXUliU");
        setIntField(term853, term853.getClass(), "lastUsedDeckId", -1547384488);
        setIntField(term853, term853.getClass(), "lastPlayMusicLevel", 1442160736);
        setIntField(term853, term853.getClass(), "lastEmoneyBrand", 1114000454);
        setField(term851, term851.getClass(), "user", term853);
        setIntField(term851, term851.getClass(), "musicId", -556405712);
        setIntField(term851, term851.getClass(), "status", -1772434990);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMusicItem");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUser", argTypes, term851, args);
    }

};


