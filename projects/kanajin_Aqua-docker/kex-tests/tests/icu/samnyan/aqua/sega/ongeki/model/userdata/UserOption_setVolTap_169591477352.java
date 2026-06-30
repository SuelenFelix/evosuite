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

public class UserOption_setVolTap_169591477352 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term332920;
     Object term333222;

    public UserOption_setVolTap_169591477352() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term332926 = new Long(8734518435788772658L);
        term332920 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserOption"));
        Object term332922 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term332924 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term332940 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term332941 = newInstance(Class.forName("java.time.LocalDate"));
        Object term332945 = newInstance(Class.forName("java.time.LocalTime"));
        Object term332950 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term332951 = newInstance(Class.forName("java.time.LocalDate"));
        Object term332955 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term332920, term332920.getClass(), "id", -7532097688003358397L);
        setLongField(term332922, term332922.getClass(), "id", -4209780718220203124L);
        setLongField(term332924, term332924.getClass(), "id", -7106164094466908961L);
        setField(term332924, term332924.getClass(), "extId", term332926);
        setField(term332924, term332924.getClass(), "luid", "dJaKJxTWBS");
        setIntField(term332941, term332941.getClass(), "year", 2018);
        setShortField(term332941, term332941.getClass(), "month", (short) 2);
        setShortField(term332941, term332941.getClass(), "day", (short) 1);
        setField(term332940, term332940.getClass(), "date", term332941);
        setByteField(term332945, term332945.getClass(), "hour", (byte) 16);
        setByteField(term332945, term332945.getClass(), "minute", (byte) 0);
        setByteField(term332945, term332945.getClass(), "second", (byte) 45);
        setIntField(term332945, term332945.getClass(), "nano", 920431415);
        setField(term332940, term332940.getClass(), "time", term332945);
        setField(term332924, term332924.getClass(), "registerTime", term332940);
        setIntField(term332951, term332951.getClass(), "year", 2023);
        setShortField(term332951, term332951.getClass(), "month", (short) 12);
        setShortField(term332951, term332951.getClass(), "day", (short) 12);
        setField(term332950, term332950.getClass(), "date", term332951);
        setByteField(term332955, term332955.getClass(), "hour", (byte) 17);
        setByteField(term332955, term332955.getClass(), "minute", (byte) 33);
        setByteField(term332955, term332955.getClass(), "second", (byte) 4);
        setIntField(term332955, term332955.getClass(), "nano", 217741311);
        setField(term332950, term332950.getClass(), "time", term332955);
        setField(term332924, term332924.getClass(), "accessTime", term332950);
        setField(term332922, term332922.getClass(), "card", term332924);
        setField(term332922, term332922.getClass(), "userName", "BgetyXGMRl");
        setIntField(term332922, term332922.getClass(), "level", 1672431879);
        setIntField(term332922, term332922.getClass(), "reincarnationNum", 2141281709);
        setLongField(term332922, term332922.getClass(), "exp", 5928720094138648464L);
        setLongField(term332922, term332922.getClass(), "point", 2459162245940536487L);
        setLongField(term332922, term332922.getClass(), "totalPoint", 414836339248276583L);
        setIntField(term332922, term332922.getClass(), "playCount", -157519516);
        setIntField(term332922, term332922.getClass(), "jewelCount", -2045726191);
        setIntField(term332922, term332922.getClass(), "totalJewelCount", 1880420925);
        setIntField(term332922, term332922.getClass(), "medalCount", -142496268);
        setIntField(term332922, term332922.getClass(), "playerRating", -1677756333);
        setIntField(term332922, term332922.getClass(), "highestRating", 1239563212);
        setIntField(term332922, term332922.getClass(), "battlePoint", -124131233);
        setIntField(term332922, term332922.getClass(), "bestBattlePoint", -1232282889);
        setIntField(term332922, term332922.getClass(), "overDamageBattlePoint", -468900292);
        setBooleanField(term332922, term332922.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term332922, term332922.getClass(), "nameplateId", 1388158765);
        setIntField(term332922, term332922.getClass(), "trophyId", -158487011);
        setIntField(term332922, term332922.getClass(), "cardId", 462782562);
        setIntField(term332922, term332922.getClass(), "characterId", -1764599260);
        setIntField(term332922, term332922.getClass(), "characterVoiceNo", 1132521819);
        setIntField(term332922, term332922.getClass(), "tabSetting", 1426028820);
        setIntField(term332922, term332922.getClass(), "tabSortSetting", -106557307);
        setIntField(term332922, term332922.getClass(), "cardCategorySetting", -1865298195);
        setIntField(term332922, term332922.getClass(), "cardSortSetting", 1196139974);
        setIntField(term332922, term332922.getClass(), "rivalScoreCategorySetting", 1300514491);
        setIntField(term332922, term332922.getClass(), "playedTutorialBit", 156012906);
        setIntField(term332922, term332922.getClass(), "firstTutorialCancelNum", -1298950949);
        setLongField(term332922, term332922.getClass(), "sumTechHighScore", -6989680391801842764L);
        setLongField(term332922, term332922.getClass(), "sumTechBasicHighScore", -4736318548725670126L);
        setLongField(term332922, term332922.getClass(), "sumTechAdvancedHighScore", -8572813557857525735L);
        setLongField(term332922, term332922.getClass(), "sumTechExpertHighScore", 1336719177276665993L);
        setLongField(term332922, term332922.getClass(), "sumTechMasterHighScore", -517463432976165269L);
        setLongField(term332922, term332922.getClass(), "sumTechLunaticHighScore", 2521752100420456158L);
        setLongField(term332922, term332922.getClass(), "sumBattleHighScore", -7487239259484808829L);
        setLongField(term332922, term332922.getClass(), "sumBattleBasicHighScore", 4520414753230797986L);
        setLongField(term332922, term332922.getClass(), "sumBattleAdvancedHighScore", -1102636166336259454L);
        setLongField(term332922, term332922.getClass(), "sumBattleExpertHighScore", 8145471243789494919L);
        setLongField(term332922, term332922.getClass(), "sumBattleMasterHighScore", -2073620416849818347L);
        setLongField(term332922, term332922.getClass(), "sumBattleLunaticHighScore", -8487023541786390714L);
        setField(term332922, term332922.getClass(), "eventWatchedDate", "cQiqDkEHVs");
        setField(term332922, term332922.getClass(), "cmEventWatchedDate", "ptKqGuWZsH");
        setField(term332922, term332922.getClass(), "firstGameId", "XkTNEurJQL");
        setField(term332922, term332922.getClass(), "firstRomVersion", "tezowBMpld");
        setField(term332922, term332922.getClass(), "firstDataVersion", "PMIbmOolnB");
        setField(term332922, term332922.getClass(), "firstPlayDate", "XeFNMRMveb");
        setField(term332922, term332922.getClass(), "lastGameId", "KsiodhUSDg");
        setField(term332922, term332922.getClass(), "lastRomVersion", "nxOfLyskFj");
        setField(term332922, term332922.getClass(), "lastDataVersion", "aMitZqshGh");
        setField(term332922, term332922.getClass(), "compatibleCmVersion", "qlRGLOZEPX");
        setField(term332922, term332922.getClass(), "lastPlayDate", "nAqFsdejYG");
        setIntField(term332922, term332922.getClass(), "lastPlaceId", 1987195736);
        setField(term332922, term332922.getClass(), "lastPlaceName", "AmFzmSdDAb");
        setIntField(term332922, term332922.getClass(), "lastRegionId", -1504781438);
        setField(term332922, term332922.getClass(), "lastRegionName", "pTNWEFxAEU");
        setIntField(term332922, term332922.getClass(), "lastAllNetId", 1430034218);
        setField(term332922, term332922.getClass(), "lastClientId", "BpPPzDdRNi");
        setIntField(term332922, term332922.getClass(), "lastUsedDeckId", 1173626707);
        setIntField(term332922, term332922.getClass(), "lastPlayMusicLevel", -1472939798);
        setIntField(term332922, term332922.getClass(), "lastEmoneyBrand", 1336283191);
        setField(term332920, term332920.getClass(), "user", term332922);
        setIntField(term332920, term332920.getClass(), "optionSet", -1620701316);
        setIntField(term332920, term332920.getClass(), "speed", -2010125595);
        setIntField(term332920, term332920.getClass(), "mirror", 881618169);
        setIntField(term332920, term332920.getClass(), "judgeTiming", -2002251348);
        setIntField(term332920, term332920.getClass(), "judgeAdjustment", 1450488462);
        setIntField(term332920, term332920.getClass(), "abort", -1946878069);
        setIntField(term332920, term332920.getClass(), "stealthField", -10935143);
        setIntField(term332920, term332920.getClass(), "tapSound", -250644841);
        setIntField(term332920, term332920.getClass(), "volGuide", 513092887);
        setIntField(term332920, term332920.getClass(), "volAll", -1147940046);
        setIntField(term332920, term332920.getClass(), "volTap", 476339625);
        setIntField(term332920, term332920.getClass(), "volCrTap", -1718005832);
        setIntField(term332920, term332920.getClass(), "volHold", -1734715475);
        setIntField(term332920, term332920.getClass(), "volSide", -318943110);
        setIntField(term332920, term332920.getClass(), "volFlick", -1051838393);
        setIntField(term332920, term332920.getClass(), "volBell", 2096731713);
        setIntField(term332920, term332920.getClass(), "volEnemy", -110227629);
        setIntField(term332920, term332920.getClass(), "volSkill", 1070859706);
        setIntField(term332920, term332920.getClass(), "volDamage", 315364230);
        setIntField(term332920, term332920.getClass(), "colorField", -1304585103);
        setIntField(term332920, term332920.getClass(), "colorLaneBright", -27360426);
        setIntField(term332920, term332920.getClass(), "colorWallBright", 766689350);
        setIntField(term332920, term332920.getClass(), "colorLane", -1662533282);
        setIntField(term332920, term332920.getClass(), "colorSide", -447585151);
        setIntField(term332920, term332920.getClass(), "effectDamage", -1030615976);
        setIntField(term332920, term332920.getClass(), "effectPos", 506140659);
        setIntField(term332920, term332920.getClass(), "judgeDisp", 493454819);
        setIntField(term332920, term332920.getClass(), "judgePos", 492765636);
        setIntField(term332920, term332920.getClass(), "judgeBreak", 737730732);
        setIntField(term332920, term332920.getClass(), "judgeHit", 119713499);
        setIntField(term332920, term332920.getClass(), "platinumBreakDisp", 1401312698);
        setIntField(term332920, term332920.getClass(), "judgeCriticalBreak", -520001527);
        setIntField(term332920, term332920.getClass(), "matching", -474662427);
        setIntField(term332920, term332920.getClass(), "dispPlayerLv", -1084348067);
        setIntField(term332920, term332920.getClass(), "dispRating", 462358472);
        setIntField(term332920, term332920.getClass(), "dispBP", 1350454595);
        setIntField(term332920, term332920.getClass(), "headphone", -1134051415);
        term333222 = new Integer(-2005589401);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term333222;
        callMethod(klass, "setVolTap", argTypes, term332920, args);
    }

};


