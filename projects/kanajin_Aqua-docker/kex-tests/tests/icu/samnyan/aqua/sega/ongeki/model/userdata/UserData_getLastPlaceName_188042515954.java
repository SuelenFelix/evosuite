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

public class UserData_getLastPlaceName_188042515954 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44760;

    public UserData_getLastPlaceName_188042515954() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term44764 = new Long(-9040825890007374809L);
        term44760 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term44762 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term44778 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term44779 = newInstance(Class.forName("java.time.LocalDate"));
        Object term44783 = newInstance(Class.forName("java.time.LocalTime"));
        Object term44788 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term44789 = newInstance(Class.forName("java.time.LocalDate"));
        Object term44793 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term44760, term44760.getClass(), "id", 2167034694898722303L);
        setLongField(term44762, term44762.getClass(), "id", 5116667900739377769L);
        setField(term44762, term44762.getClass(), "extId", term44764);
        setField(term44762, term44762.getClass(), "luid", "wxAHQRVgKc");
        setIntField(term44779, term44779.getClass(), "year", 2022);
        setShortField(term44779, term44779.getClass(), "month", (short) 8);
        setShortField(term44779, term44779.getClass(), "day", (short) 30);
        setField(term44778, term44778.getClass(), "date", term44779);
        setByteField(term44783, term44783.getClass(), "hour", (byte) 3);
        setByteField(term44783, term44783.getClass(), "minute", (byte) 13);
        setByteField(term44783, term44783.getClass(), "second", (byte) 34);
        setIntField(term44783, term44783.getClass(), "nano", 69286341);
        setField(term44778, term44778.getClass(), "time", term44783);
        setField(term44762, term44762.getClass(), "registerTime", term44778);
        setIntField(term44789, term44789.getClass(), "year", 2013);
        setShortField(term44789, term44789.getClass(), "month", (short) 5);
        setShortField(term44789, term44789.getClass(), "day", (short) 14);
        setField(term44788, term44788.getClass(), "date", term44789);
        setByteField(term44793, term44793.getClass(), "hour", (byte) 12);
        setByteField(term44793, term44793.getClass(), "minute", (byte) 8);
        setByteField(term44793, term44793.getClass(), "second", (byte) 12);
        setIntField(term44793, term44793.getClass(), "nano", 597594916);
        setField(term44788, term44788.getClass(), "time", term44793);
        setField(term44762, term44762.getClass(), "accessTime", term44788);
        setField(term44760, term44760.getClass(), "card", term44762);
        setField(term44760, term44760.getClass(), "userName", "bYsZEHeoeV");
        setIntField(term44760, term44760.getClass(), "level", 1819563159);
        setIntField(term44760, term44760.getClass(), "reincarnationNum", -131038479);
        setLongField(term44760, term44760.getClass(), "exp", 7850317217678882393L);
        setLongField(term44760, term44760.getClass(), "point", -166310229318189286L);
        setLongField(term44760, term44760.getClass(), "totalPoint", 1735840139746449096L);
        setIntField(term44760, term44760.getClass(), "playCount", 1690337049);
        setIntField(term44760, term44760.getClass(), "jewelCount", 254984950);
        setIntField(term44760, term44760.getClass(), "totalJewelCount", 491595035);
        setIntField(term44760, term44760.getClass(), "medalCount", 2111929590);
        setIntField(term44760, term44760.getClass(), "playerRating", 1984033465);
        setIntField(term44760, term44760.getClass(), "highestRating", 415386900);
        setIntField(term44760, term44760.getClass(), "battlePoint", -80119579);
        setIntField(term44760, term44760.getClass(), "bestBattlePoint", -725563031);
        setIntField(term44760, term44760.getClass(), "overDamageBattlePoint", 228070072);
        setBooleanField(term44760, term44760.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term44760, term44760.getClass(), "nameplateId", 1918578349);
        setIntField(term44760, term44760.getClass(), "trophyId", -1585377443);
        setIntField(term44760, term44760.getClass(), "cardId", -1293961217);
        setIntField(term44760, term44760.getClass(), "characterId", -1715210057);
        setIntField(term44760, term44760.getClass(), "characterVoiceNo", 118463203);
        setIntField(term44760, term44760.getClass(), "tabSetting", -2062733514);
        setIntField(term44760, term44760.getClass(), "tabSortSetting", 901520301);
        setIntField(term44760, term44760.getClass(), "cardCategorySetting", -1536684680);
        setIntField(term44760, term44760.getClass(), "cardSortSetting", -322159635);
        setIntField(term44760, term44760.getClass(), "rivalScoreCategorySetting", 366996139);
        setIntField(term44760, term44760.getClass(), "playedTutorialBit", 806187937);
        setIntField(term44760, term44760.getClass(), "firstTutorialCancelNum", -1646415676);
        setLongField(term44760, term44760.getClass(), "sumTechHighScore", 2159730973728155805L);
        setLongField(term44760, term44760.getClass(), "sumTechBasicHighScore", -1486135171566437695L);
        setLongField(term44760, term44760.getClass(), "sumTechAdvancedHighScore", 5383609177501042021L);
        setLongField(term44760, term44760.getClass(), "sumTechExpertHighScore", 2779814845687231848L);
        setLongField(term44760, term44760.getClass(), "sumTechMasterHighScore", -6273351477363617569L);
        setLongField(term44760, term44760.getClass(), "sumTechLunaticHighScore", -5620682754269520333L);
        setLongField(term44760, term44760.getClass(), "sumBattleHighScore", 9215348305313170099L);
        setLongField(term44760, term44760.getClass(), "sumBattleBasicHighScore", -785087035950801971L);
        setLongField(term44760, term44760.getClass(), "sumBattleAdvancedHighScore", 3850790119182839369L);
        setLongField(term44760, term44760.getClass(), "sumBattleExpertHighScore", -405127137367295684L);
        setLongField(term44760, term44760.getClass(), "sumBattleMasterHighScore", 3093905091334313614L);
        setLongField(term44760, term44760.getClass(), "sumBattleLunaticHighScore", 6031696788173482309L);
        setField(term44760, term44760.getClass(), "eventWatchedDate", "IwvwrQylib");
        setField(term44760, term44760.getClass(), "cmEventWatchedDate", "ZWJgSttNjg");
        setField(term44760, term44760.getClass(), "firstGameId", "LQTIjJLkXH");
        setField(term44760, term44760.getClass(), "firstRomVersion", "RvkBwedFKx");
        setField(term44760, term44760.getClass(), "firstDataVersion", "DYzWJljbaE");
        setField(term44760, term44760.getClass(), "firstPlayDate", "idwbHVHUcz");
        setField(term44760, term44760.getClass(), "lastGameId", "sWJHIWZMuX");
        setField(term44760, term44760.getClass(), "lastRomVersion", "PwMdJRwzDW");
        setField(term44760, term44760.getClass(), "lastDataVersion", "sMiHxgXUuN");
        setField(term44760, term44760.getClass(), "compatibleCmVersion", "oVChCWWDag");
        setField(term44760, term44760.getClass(), "lastPlayDate", "EteTxkDxin");
        setIntField(term44760, term44760.getClass(), "lastPlaceId", 1016563502);
        setField(term44760, term44760.getClass(), "lastPlaceName", "mKgLwPdYbY");
        setIntField(term44760, term44760.getClass(), "lastRegionId", -1845173237);
        setField(term44760, term44760.getClass(), "lastRegionName", "zqykonsLIo");
        setIntField(term44760, term44760.getClass(), "lastAllNetId", -326684811);
        setField(term44760, term44760.getClass(), "lastClientId", "KoPzTuvIeK");
        setIntField(term44760, term44760.getClass(), "lastUsedDeckId", 1260583823);
        setIntField(term44760, term44760.getClass(), "lastPlayMusicLevel", -1368801661);
        setIntField(term44760, term44760.getClass(), "lastEmoneyBrand", -2094311816);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastPlaceName", argTypes, term44760, args);
    }

};


