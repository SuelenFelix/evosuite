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

public class UserEventMusic_getLevel_5106434516 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term371748;

    public UserEventMusic_getLevel_5106434516() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term371754 = new Long(-4475453924678388077L);
        term371748 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserEventMusic"));
        Object term371750 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term371752 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term371768 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term371769 = newInstance(Class.forName("java.time.LocalDate"));
        Object term371773 = newInstance(Class.forName("java.time.LocalTime"));
        Object term371778 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term371779 = newInstance(Class.forName("java.time.LocalDate"));
        Object term371783 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term371748, term371748.getClass(), "id", -3854166874193525913L);
        setLongField(term371750, term371750.getClass(), "id", -7929557176646282178L);
        setLongField(term371752, term371752.getClass(), "id", 7831841544213485343L);
        setField(term371752, term371752.getClass(), "extId", term371754);
        setField(term371752, term371752.getClass(), "luid", "ATEOAhPVCd");
        setIntField(term371769, term371769.getClass(), "year", 2029);
        setShortField(term371769, term371769.getClass(), "month", (short) 3);
        setShortField(term371769, term371769.getClass(), "day", (short) 1);
        setField(term371768, term371768.getClass(), "date", term371769);
        setByteField(term371773, term371773.getClass(), "hour", (byte) 8);
        setByteField(term371773, term371773.getClass(), "minute", (byte) 38);
        setByteField(term371773, term371773.getClass(), "second", (byte) 43);
        setIntField(term371773, term371773.getClass(), "nano", 711609754);
        setField(term371768, term371768.getClass(), "time", term371773);
        setField(term371752, term371752.getClass(), "registerTime", term371768);
        setIntField(term371779, term371779.getClass(), "year", 2023);
        setShortField(term371779, term371779.getClass(), "month", (short) 3);
        setShortField(term371779, term371779.getClass(), "day", (short) 12);
        setField(term371778, term371778.getClass(), "date", term371779);
        setByteField(term371783, term371783.getClass(), "hour", (byte) 3);
        setByteField(term371783, term371783.getClass(), "minute", (byte) 34);
        setByteField(term371783, term371783.getClass(), "second", (byte) 59);
        setIntField(term371783, term371783.getClass(), "nano", 301826860);
        setField(term371778, term371778.getClass(), "time", term371783);
        setField(term371752, term371752.getClass(), "accessTime", term371778);
        setField(term371750, term371750.getClass(), "card", term371752);
        setField(term371750, term371750.getClass(), "userName", "gJpniBhcDl");
        setIntField(term371750, term371750.getClass(), "level", -19801089);
        setIntField(term371750, term371750.getClass(), "reincarnationNum", -1573943690);
        setLongField(term371750, term371750.getClass(), "exp", 5675560831753917364L);
        setLongField(term371750, term371750.getClass(), "point", -4018119386694110372L);
        setLongField(term371750, term371750.getClass(), "totalPoint", 3877142016477683762L);
        setIntField(term371750, term371750.getClass(), "playCount", 2131611351);
        setIntField(term371750, term371750.getClass(), "jewelCount", 2052142179);
        setIntField(term371750, term371750.getClass(), "totalJewelCount", -1043354428);
        setIntField(term371750, term371750.getClass(), "medalCount", 1501686181);
        setIntField(term371750, term371750.getClass(), "playerRating", 1006876673);
        setIntField(term371750, term371750.getClass(), "highestRating", 730872576);
        setIntField(term371750, term371750.getClass(), "battlePoint", -1822680598);
        setIntField(term371750, term371750.getClass(), "bestBattlePoint", -1533682926);
        setIntField(term371750, term371750.getClass(), "overDamageBattlePoint", 1040551424);
        setBooleanField(term371750, term371750.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term371750, term371750.getClass(), "nameplateId", 1847042001);
        setIntField(term371750, term371750.getClass(), "trophyId", 444313560);
        setIntField(term371750, term371750.getClass(), "cardId", 511366390);
        setIntField(term371750, term371750.getClass(), "characterId", -980132283);
        setIntField(term371750, term371750.getClass(), "characterVoiceNo", 769143800);
        setIntField(term371750, term371750.getClass(), "tabSetting", 1406591800);
        setIntField(term371750, term371750.getClass(), "tabSortSetting", -1995477372);
        setIntField(term371750, term371750.getClass(), "cardCategorySetting", 1702244138);
        setIntField(term371750, term371750.getClass(), "cardSortSetting", -1804630387);
        setIntField(term371750, term371750.getClass(), "rivalScoreCategorySetting", -1680783346);
        setIntField(term371750, term371750.getClass(), "playedTutorialBit", 315606897);
        setIntField(term371750, term371750.getClass(), "firstTutorialCancelNum", -975020255);
        setLongField(term371750, term371750.getClass(), "sumTechHighScore", 4133176658765240159L);
        setLongField(term371750, term371750.getClass(), "sumTechBasicHighScore", -4003292740263333467L);
        setLongField(term371750, term371750.getClass(), "sumTechAdvancedHighScore", -7330432634732436657L);
        setLongField(term371750, term371750.getClass(), "sumTechExpertHighScore", 5729261459220593895L);
        setLongField(term371750, term371750.getClass(), "sumTechMasterHighScore", -6704122597980301219L);
        setLongField(term371750, term371750.getClass(), "sumTechLunaticHighScore", 2749632091371448968L);
        setLongField(term371750, term371750.getClass(), "sumBattleHighScore", -1966759614312171735L);
        setLongField(term371750, term371750.getClass(), "sumBattleBasicHighScore", -104485700098574895L);
        setLongField(term371750, term371750.getClass(), "sumBattleAdvancedHighScore", 1792977159463624803L);
        setLongField(term371750, term371750.getClass(), "sumBattleExpertHighScore", -2693210977282902011L);
        setLongField(term371750, term371750.getClass(), "sumBattleMasterHighScore", 3459821363028040629L);
        setLongField(term371750, term371750.getClass(), "sumBattleLunaticHighScore", -7641639475166845974L);
        setField(term371750, term371750.getClass(), "eventWatchedDate", "euImildoTH");
        setField(term371750, term371750.getClass(), "cmEventWatchedDate", "lSzyYtPXva");
        setField(term371750, term371750.getClass(), "firstGameId", "pctbRTsNHf");
        setField(term371750, term371750.getClass(), "firstRomVersion", "ITWFHjBHKK");
        setField(term371750, term371750.getClass(), "firstDataVersion", "jlMONtFMdU");
        setField(term371750, term371750.getClass(), "firstPlayDate", "yhqTsCzhGr");
        setField(term371750, term371750.getClass(), "lastGameId", "wfVccGKwtx");
        setField(term371750, term371750.getClass(), "lastRomVersion", "vTzuskcrOw");
        setField(term371750, term371750.getClass(), "lastDataVersion", "kyzlJwMraL");
        setField(term371750, term371750.getClass(), "compatibleCmVersion", "rcGVvlcpyI");
        setField(term371750, term371750.getClass(), "lastPlayDate", "yNTpPLrRxy");
        setIntField(term371750, term371750.getClass(), "lastPlaceId", -595253821);
        setField(term371750, term371750.getClass(), "lastPlaceName", "uGPYzCYNcK");
        setIntField(term371750, term371750.getClass(), "lastRegionId", -1158371828);
        setField(term371750, term371750.getClass(), "lastRegionName", "rfrQURPggv");
        setIntField(term371750, term371750.getClass(), "lastAllNetId", 1780524982);
        setField(term371750, term371750.getClass(), "lastClientId", "LcEYyzFTnY");
        setIntField(term371750, term371750.getClass(), "lastUsedDeckId", -1699200208);
        setIntField(term371750, term371750.getClass(), "lastPlayMusicLevel", -463974839);
        setIntField(term371750, term371750.getClass(), "lastEmoneyBrand", 556579);
        setField(term371748, term371748.getClass(), "user", term371750);
        setIntField(term371748, term371748.getClass(), "eventId", 2009487252);
        setIntField(term371748, term371748.getClass(), "type", 1776072860);
        setIntField(term371748, term371748.getClass(), "musicId", 510569714);
        setIntField(term371748, term371748.getClass(), "level", 2007225693);
        setIntField(term371748, term371748.getClass(), "techScoreMax", -677219368);
        setIntField(term371748, term371748.getClass(), "platinumScoreMax", 661822948);
        setField(term371748, term371748.getClass(), "techRecordDate", "UwbEHLqxSO");
        setBooleanField(term371748, term371748.getClass(), "isTechNewRecord", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserEventMusic");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLevel", argTypes, term371748, args);
    }

};


