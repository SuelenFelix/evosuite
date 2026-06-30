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

public class UserBoss_equals_71235338313 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term139731;
     Object term140000;

    public UserBoss_equals_71235338313() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term139737 = new Long(7998051124369147543L);
        term139731 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserBoss"));
        Object term139733 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term139735 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term139751 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term139752 = newInstance(Class.forName("java.time.LocalDate"));
        Object term139756 = newInstance(Class.forName("java.time.LocalTime"));
        Object term139761 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term139762 = newInstance(Class.forName("java.time.LocalDate"));
        Object term139766 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term139731, term139731.getClass(), "id", -3184779567383070184L);
        setLongField(term139733, term139733.getClass(), "id", 1942417535418042777L);
        setLongField(term139735, term139735.getClass(), "id", 969386192103972946L);
        setField(term139735, term139735.getClass(), "extId", term139737);
        setField(term139735, term139735.getClass(), "luid", "mDPZZCKeJW");
        setIntField(term139752, term139752.getClass(), "year", 2027);
        setShortField(term139752, term139752.getClass(), "month", (short) 4);
        setShortField(term139752, term139752.getClass(), "day", (short) 25);
        setField(term139751, term139751.getClass(), "date", term139752);
        setByteField(term139756, term139756.getClass(), "hour", (byte) 18);
        setByteField(term139756, term139756.getClass(), "minute", (byte) 2);
        setByteField(term139756, term139756.getClass(), "second", (byte) 53);
        setIntField(term139756, term139756.getClass(), "nano", 468233333);
        setField(term139751, term139751.getClass(), "time", term139756);
        setField(term139735, term139735.getClass(), "registerTime", term139751);
        setIntField(term139762, term139762.getClass(), "year", 2020);
        setShortField(term139762, term139762.getClass(), "month", (short) 1);
        setShortField(term139762, term139762.getClass(), "day", (short) 9);
        setField(term139761, term139761.getClass(), "date", term139762);
        setByteField(term139766, term139766.getClass(), "hour", (byte) 15);
        setByteField(term139766, term139766.getClass(), "minute", (byte) 54);
        setByteField(term139766, term139766.getClass(), "second", (byte) 0);
        setIntField(term139766, term139766.getClass(), "nano", 449352072);
        setField(term139761, term139761.getClass(), "time", term139766);
        setField(term139735, term139735.getClass(), "accessTime", term139761);
        setField(term139733, term139733.getClass(), "card", term139735);
        setField(term139733, term139733.getClass(), "userName", "fLUSgXlneP");
        setIntField(term139733, term139733.getClass(), "level", -1921696663);
        setIntField(term139733, term139733.getClass(), "reincarnationNum", 687014558);
        setLongField(term139733, term139733.getClass(), "exp", -8656756077408802613L);
        setLongField(term139733, term139733.getClass(), "point", -8155705336221645956L);
        setLongField(term139733, term139733.getClass(), "totalPoint", -2025347939685401748L);
        setIntField(term139733, term139733.getClass(), "playCount", -217279729);
        setIntField(term139733, term139733.getClass(), "jewelCount", -1559780022);
        setIntField(term139733, term139733.getClass(), "totalJewelCount", 767848530);
        setIntField(term139733, term139733.getClass(), "medalCount", 1958684579);
        setIntField(term139733, term139733.getClass(), "playerRating", -1479249075);
        setIntField(term139733, term139733.getClass(), "highestRating", -1222677001);
        setIntField(term139733, term139733.getClass(), "battlePoint", 931155794);
        setIntField(term139733, term139733.getClass(), "bestBattlePoint", 869921404);
        setIntField(term139733, term139733.getClass(), "overDamageBattlePoint", 431473602);
        setBooleanField(term139733, term139733.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term139733, term139733.getClass(), "nameplateId", 284886453);
        setIntField(term139733, term139733.getClass(), "trophyId", 81623981);
        setIntField(term139733, term139733.getClass(), "cardId", -1407481630);
        setIntField(term139733, term139733.getClass(), "characterId", -1963906003);
        setIntField(term139733, term139733.getClass(), "characterVoiceNo", -1380281551);
        setIntField(term139733, term139733.getClass(), "tabSetting", -2059295062);
        setIntField(term139733, term139733.getClass(), "tabSortSetting", 1107432374);
        setIntField(term139733, term139733.getClass(), "cardCategorySetting", 1623768155);
        setIntField(term139733, term139733.getClass(), "cardSortSetting", -919788156);
        setIntField(term139733, term139733.getClass(), "rivalScoreCategorySetting", 29020862);
        setIntField(term139733, term139733.getClass(), "playedTutorialBit", 1981104215);
        setIntField(term139733, term139733.getClass(), "firstTutorialCancelNum", 2123592941);
        setLongField(term139733, term139733.getClass(), "sumTechHighScore", 4345342879841286707L);
        setLongField(term139733, term139733.getClass(), "sumTechBasicHighScore", 8621039118853450586L);
        setLongField(term139733, term139733.getClass(), "sumTechAdvancedHighScore", 5131948127189534017L);
        setLongField(term139733, term139733.getClass(), "sumTechExpertHighScore", -6461615955532169752L);
        setLongField(term139733, term139733.getClass(), "sumTechMasterHighScore", -2861530151045276602L);
        setLongField(term139733, term139733.getClass(), "sumTechLunaticHighScore", -2097213308622607578L);
        setLongField(term139733, term139733.getClass(), "sumBattleHighScore", 6900587659650670741L);
        setLongField(term139733, term139733.getClass(), "sumBattleBasicHighScore", 5074360752952747365L);
        setLongField(term139733, term139733.getClass(), "sumBattleAdvancedHighScore", -8422133961892079013L);
        setLongField(term139733, term139733.getClass(), "sumBattleExpertHighScore", -2173971598671342343L);
        setLongField(term139733, term139733.getClass(), "sumBattleMasterHighScore", 3236847100191630342L);
        setLongField(term139733, term139733.getClass(), "sumBattleLunaticHighScore", 3554472587072736320L);
        setField(term139733, term139733.getClass(), "eventWatchedDate", "hKDHCIiSuI");
        setField(term139733, term139733.getClass(), "cmEventWatchedDate", "ZDvGrpCzSc");
        setField(term139733, term139733.getClass(), "firstGameId", "OseqIIMKlG");
        setField(term139733, term139733.getClass(), "firstRomVersion", "qOsyLpoLDX");
        setField(term139733, term139733.getClass(), "firstDataVersion", "ieESeaonzX");
        setField(term139733, term139733.getClass(), "firstPlayDate", "MiDxSLYCkN");
        setField(term139733, term139733.getClass(), "lastGameId", "olwpoCLMLH");
        setField(term139733, term139733.getClass(), "lastRomVersion", "aigtpfubEk");
        setField(term139733, term139733.getClass(), "lastDataVersion", "VkDDJVqlRm");
        setField(term139733, term139733.getClass(), "compatibleCmVersion", "SUGqIJvCrc");
        setField(term139733, term139733.getClass(), "lastPlayDate", "TrQnxgLKzu");
        setIntField(term139733, term139733.getClass(), "lastPlaceId", 1043204008);
        setField(term139733, term139733.getClass(), "lastPlaceName", "MsenaDqyDy");
        setIntField(term139733, term139733.getClass(), "lastRegionId", -2069490710);
        setField(term139733, term139733.getClass(), "lastRegionName", "rKQXUHZdfd");
        setIntField(term139733, term139733.getClass(), "lastAllNetId", -336592077);
        setField(term139733, term139733.getClass(), "lastClientId", "gBuTBlOYRS");
        setIntField(term139733, term139733.getClass(), "lastUsedDeckId", -1038346147);
        setIntField(term139733, term139733.getClass(), "lastPlayMusicLevel", -759212248);
        setIntField(term139733, term139733.getClass(), "lastEmoneyBrand", 710373985);
        setField(term139731, term139731.getClass(), "user", term139733);
        setIntField(term139731, term139731.getClass(), "musicId", -1098158176);
        setIntField(term139731, term139731.getClass(), "damage", -187070398);
        setBooleanField(term139731, term139731.getClass(), "isClear", false);
        setIntField(term139731, term139731.getClass(), "eventId", -1230319081);
        term140000 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserBoss");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term140000;
        callMethod(klass, "equals", argTypes, term139731, args);
    }

};


