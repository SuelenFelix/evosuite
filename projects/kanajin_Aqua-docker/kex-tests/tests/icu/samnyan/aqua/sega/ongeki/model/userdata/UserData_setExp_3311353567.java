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

public class UserData_setExp_3311353567 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term50333;
     Object term50596;

    public UserData_setExp_3311353567() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term50337 = new Long(-4822736661741380518L);
        term50333 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term50335 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term50351 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term50352 = newInstance(Class.forName("java.time.LocalDate"));
        Object term50356 = newInstance(Class.forName("java.time.LocalTime"));
        Object term50361 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term50362 = newInstance(Class.forName("java.time.LocalDate"));
        Object term50366 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term50333, term50333.getClass(), "id", -356179638846982179L);
        setLongField(term50335, term50335.getClass(), "id", 1394860434350482902L);
        setField(term50335, term50335.getClass(), "extId", term50337);
        setField(term50335, term50335.getClass(), "luid", "PdeSzTcBgY");
        setIntField(term50352, term50352.getClass(), "year", 2016);
        setShortField(term50352, term50352.getClass(), "month", (short) 4);
        setShortField(term50352, term50352.getClass(), "day", (short) 23);
        setField(term50351, term50351.getClass(), "date", term50352);
        setByteField(term50356, term50356.getClass(), "hour", (byte) 13);
        setByteField(term50356, term50356.getClass(), "minute", (byte) 34);
        setByteField(term50356, term50356.getClass(), "second", (byte) 22);
        setIntField(term50356, term50356.getClass(), "nano", 20103660);
        setField(term50351, term50351.getClass(), "time", term50356);
        setField(term50335, term50335.getClass(), "registerTime", term50351);
        setIntField(term50362, term50362.getClass(), "year", 2023);
        setShortField(term50362, term50362.getClass(), "month", (short) 1);
        setShortField(term50362, term50362.getClass(), "day", (short) 24);
        setField(term50361, term50361.getClass(), "date", term50362);
        setByteField(term50366, term50366.getClass(), "hour", (byte) 10);
        setByteField(term50366, term50366.getClass(), "minute", (byte) 26);
        setByteField(term50366, term50366.getClass(), "second", (byte) 14);
        setIntField(term50366, term50366.getClass(), "nano", 736807866);
        setField(term50361, term50361.getClass(), "time", term50366);
        setField(term50335, term50335.getClass(), "accessTime", term50361);
        setField(term50333, term50333.getClass(), "card", term50335);
        setField(term50333, term50333.getClass(), "userName", "PmSvMYNoIS");
        setIntField(term50333, term50333.getClass(), "level", 1541808857);
        setIntField(term50333, term50333.getClass(), "reincarnationNum", 2007310608);
        setLongField(term50333, term50333.getClass(), "exp", 828765974823196503L);
        setLongField(term50333, term50333.getClass(), "point", 2517346858311378765L);
        setLongField(term50333, term50333.getClass(), "totalPoint", 8227165037887933407L);
        setIntField(term50333, term50333.getClass(), "playCount", 462157519);
        setIntField(term50333, term50333.getClass(), "jewelCount", -875956888);
        setIntField(term50333, term50333.getClass(), "totalJewelCount", 65647821);
        setIntField(term50333, term50333.getClass(), "medalCount", -1289614562);
        setIntField(term50333, term50333.getClass(), "playerRating", 201090501);
        setIntField(term50333, term50333.getClass(), "highestRating", -1397182025);
        setIntField(term50333, term50333.getClass(), "battlePoint", -899619534);
        setIntField(term50333, term50333.getClass(), "bestBattlePoint", 1638508595);
        setIntField(term50333, term50333.getClass(), "overDamageBattlePoint", -114151747);
        setBooleanField(term50333, term50333.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term50333, term50333.getClass(), "nameplateId", -2025145756);
        setIntField(term50333, term50333.getClass(), "trophyId", -1865692813);
        setIntField(term50333, term50333.getClass(), "cardId", 1996398924);
        setIntField(term50333, term50333.getClass(), "characterId", -400305198);
        setIntField(term50333, term50333.getClass(), "characterVoiceNo", 1551023146);
        setIntField(term50333, term50333.getClass(), "tabSetting", 545151275);
        setIntField(term50333, term50333.getClass(), "tabSortSetting", -125397975);
        setIntField(term50333, term50333.getClass(), "cardCategorySetting", -595763151);
        setIntField(term50333, term50333.getClass(), "cardSortSetting", -1927187775);
        setIntField(term50333, term50333.getClass(), "rivalScoreCategorySetting", -246129741);
        setIntField(term50333, term50333.getClass(), "playedTutorialBit", -1681312941);
        setIntField(term50333, term50333.getClass(), "firstTutorialCancelNum", -2026593848);
        setLongField(term50333, term50333.getClass(), "sumTechHighScore", -689231427687092388L);
        setLongField(term50333, term50333.getClass(), "sumTechBasicHighScore", 8373979822629220849L);
        setLongField(term50333, term50333.getClass(), "sumTechAdvancedHighScore", 1118204947601768403L);
        setLongField(term50333, term50333.getClass(), "sumTechExpertHighScore", -59812931280292932L);
        setLongField(term50333, term50333.getClass(), "sumTechMasterHighScore", 2152337427888260081L);
        setLongField(term50333, term50333.getClass(), "sumTechLunaticHighScore", 5626125546253518889L);
        setLongField(term50333, term50333.getClass(), "sumBattleHighScore", -9087544875525123832L);
        setLongField(term50333, term50333.getClass(), "sumBattleBasicHighScore", -5307421637859729894L);
        setLongField(term50333, term50333.getClass(), "sumBattleAdvancedHighScore", -7052314256530764447L);
        setLongField(term50333, term50333.getClass(), "sumBattleExpertHighScore", -5504583784484702218L);
        setLongField(term50333, term50333.getClass(), "sumBattleMasterHighScore", -717218840624209572L);
        setLongField(term50333, term50333.getClass(), "sumBattleLunaticHighScore", -2831937652710360219L);
        setField(term50333, term50333.getClass(), "eventWatchedDate", "zejWtMxJdV");
        setField(term50333, term50333.getClass(), "cmEventWatchedDate", "YUIUZeZiMK");
        setField(term50333, term50333.getClass(), "firstGameId", "rrPETbKRef");
        setField(term50333, term50333.getClass(), "firstRomVersion", "viZRlrisPY");
        setField(term50333, term50333.getClass(), "firstDataVersion", "VSfRsPLslq");
        setField(term50333, term50333.getClass(), "firstPlayDate", "dwygneuBjP");
        setField(term50333, term50333.getClass(), "lastGameId", "LfKgkzPZpX");
        setField(term50333, term50333.getClass(), "lastRomVersion", "belyXxMqFm");
        setField(term50333, term50333.getClass(), "lastDataVersion", "LPotuCwkwB");
        setField(term50333, term50333.getClass(), "compatibleCmVersion", "zpCKXLOzse");
        setField(term50333, term50333.getClass(), "lastPlayDate", "qhlWSiHAHt");
        setIntField(term50333, term50333.getClass(), "lastPlaceId", -1523977596);
        setField(term50333, term50333.getClass(), "lastPlaceName", "XrKIhxpIJD");
        setIntField(term50333, term50333.getClass(), "lastRegionId", -1036117253);
        setField(term50333, term50333.getClass(), "lastRegionName", "RSuRSjiLvm");
        setIntField(term50333, term50333.getClass(), "lastAllNetId", -697114016);
        setField(term50333, term50333.getClass(), "lastClientId", "aoeNWgMpNx");
        setIntField(term50333, term50333.getClass(), "lastUsedDeckId", 1991952957);
        setIntField(term50333, term50333.getClass(), "lastPlayMusicLevel", 1877895251);
        setIntField(term50333, term50333.getClass(), "lastEmoneyBrand", 962916253);
        term50596 = new Long(5283775914828093148L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term50596;
        callMethod(klass, "setExp", argTypes, term50333, args);
    }

};


