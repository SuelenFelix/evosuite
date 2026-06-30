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
import java.lang.Long;
import java.lang.Object;
import java.lang.Integer;
import java.lang.Boolean;

public class UserMemoryChapter_init_71575835532 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term402863;
     Object term402865;
     Object term403128;
     Object term403130;
     Object term403132;
     Object term403134;
     Object term403136;
     Object term403138;
     Object term403140;
     Object term403142;
     Object term403144;
     Object term403146;
     Object term403148;

    public UserMemoryChapter_init_71575835532() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term402863 = new Long(6503123965916922124L);
        Long term402869 = new Long(-1148001666040486410L);
        term402865 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term402867 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term402883 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term402884 = newInstance(Class.forName("java.time.LocalDate"));
        Object term402888 = newInstance(Class.forName("java.time.LocalTime"));
        Object term402893 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term402894 = newInstance(Class.forName("java.time.LocalDate"));
        Object term402898 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term402865, term402865.getClass(), "id", 6327725821083721747L);
        setLongField(term402867, term402867.getClass(), "id", -5582518474242199651L);
        setField(term402867, term402867.getClass(), "extId", term402869);
        setField(term402867, term402867.getClass(), "luid", "ApFSyhqdVG");
        setIntField(term402884, term402884.getClass(), "year", 2025);
        setShortField(term402884, term402884.getClass(), "month", (short) 1);
        setShortField(term402884, term402884.getClass(), "day", (short) 28);
        setField(term402883, term402883.getClass(), "date", term402884);
        setByteField(term402888, term402888.getClass(), "hour", (byte) 20);
        setByteField(term402888, term402888.getClass(), "minute", (byte) 16);
        setByteField(term402888, term402888.getClass(), "second", (byte) 20);
        setIntField(term402888, term402888.getClass(), "nano", 692625956);
        setField(term402883, term402883.getClass(), "time", term402888);
        setField(term402867, term402867.getClass(), "registerTime", term402883);
        setIntField(term402894, term402894.getClass(), "year", 2016);
        setShortField(term402894, term402894.getClass(), "month", (short) 8);
        setShortField(term402894, term402894.getClass(), "day", (short) 8);
        setField(term402893, term402893.getClass(), "date", term402894);
        setByteField(term402898, term402898.getClass(), "hour", (byte) 9);
        setByteField(term402898, term402898.getClass(), "minute", (byte) 15);
        setByteField(term402898, term402898.getClass(), "second", (byte) 42);
        setIntField(term402898, term402898.getClass(), "nano", 408668564);
        setField(term402893, term402893.getClass(), "time", term402898);
        setField(term402867, term402867.getClass(), "accessTime", term402893);
        setField(term402865, term402865.getClass(), "card", term402867);
        setField(term402865, term402865.getClass(), "userName", "fqXQjOsGFr");
        setIntField(term402865, term402865.getClass(), "level", 290253522);
        setIntField(term402865, term402865.getClass(), "reincarnationNum", -796007999);
        setLongField(term402865, term402865.getClass(), "exp", 6342518740270947222L);
        setLongField(term402865, term402865.getClass(), "point", 6463032031400501913L);
        setLongField(term402865, term402865.getClass(), "totalPoint", 2549967421376425235L);
        setIntField(term402865, term402865.getClass(), "playCount", -1292129868);
        setIntField(term402865, term402865.getClass(), "jewelCount", 368856623);
        setIntField(term402865, term402865.getClass(), "totalJewelCount", 1448355698);
        setIntField(term402865, term402865.getClass(), "medalCount", 1776956152);
        setIntField(term402865, term402865.getClass(), "playerRating", -904804796);
        setIntField(term402865, term402865.getClass(), "highestRating", 200015808);
        setIntField(term402865, term402865.getClass(), "battlePoint", -1207969425);
        setIntField(term402865, term402865.getClass(), "bestBattlePoint", 2112558383);
        setIntField(term402865, term402865.getClass(), "overDamageBattlePoint", -1731742067);
        setBooleanField(term402865, term402865.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term402865, term402865.getClass(), "nameplateId", 628973695);
        setIntField(term402865, term402865.getClass(), "trophyId", -973181303);
        setIntField(term402865, term402865.getClass(), "cardId", 194221768);
        setIntField(term402865, term402865.getClass(), "characterId", 1782287228);
        setIntField(term402865, term402865.getClass(), "characterVoiceNo", -573789663);
        setIntField(term402865, term402865.getClass(), "tabSetting", -445409070);
        setIntField(term402865, term402865.getClass(), "tabSortSetting", 565179855);
        setIntField(term402865, term402865.getClass(), "cardCategorySetting", -1234731674);
        setIntField(term402865, term402865.getClass(), "cardSortSetting", 1318016024);
        setIntField(term402865, term402865.getClass(), "rivalScoreCategorySetting", -130983057);
        setIntField(term402865, term402865.getClass(), "playedTutorialBit", 273164146);
        setIntField(term402865, term402865.getClass(), "firstTutorialCancelNum", -1937256333);
        setLongField(term402865, term402865.getClass(), "sumTechHighScore", -6098413057181517434L);
        setLongField(term402865, term402865.getClass(), "sumTechBasicHighScore", -5686652191625724579L);
        setLongField(term402865, term402865.getClass(), "sumTechAdvancedHighScore", 1340091358565624805L);
        setLongField(term402865, term402865.getClass(), "sumTechExpertHighScore", 6941396573792375146L);
        setLongField(term402865, term402865.getClass(), "sumTechMasterHighScore", -4091679009787304302L);
        setLongField(term402865, term402865.getClass(), "sumTechLunaticHighScore", -8945295960188420005L);
        setLongField(term402865, term402865.getClass(), "sumBattleHighScore", -5953362533731116176L);
        setLongField(term402865, term402865.getClass(), "sumBattleBasicHighScore", -2714236923061647943L);
        setLongField(term402865, term402865.getClass(), "sumBattleAdvancedHighScore", -7142980066972309692L);
        setLongField(term402865, term402865.getClass(), "sumBattleExpertHighScore", 252956363843220481L);
        setLongField(term402865, term402865.getClass(), "sumBattleMasterHighScore", -4543821661885369887L);
        setLongField(term402865, term402865.getClass(), "sumBattleLunaticHighScore", -6412638974259573918L);
        setField(term402865, term402865.getClass(), "eventWatchedDate", "wwguldydwH");
        setField(term402865, term402865.getClass(), "cmEventWatchedDate", "MzZiOZqMsS");
        setField(term402865, term402865.getClass(), "firstGameId", "KjMVgynLYt");
        setField(term402865, term402865.getClass(), "firstRomVersion", "UgkoUbTbwe");
        setField(term402865, term402865.getClass(), "firstDataVersion", "zPAFZXlKLR");
        setField(term402865, term402865.getClass(), "firstPlayDate", "LiqcRerIJM");
        setField(term402865, term402865.getClass(), "lastGameId", "YQHqvZGKOH");
        setField(term402865, term402865.getClass(), "lastRomVersion", "MVWlsxbCSm");
        setField(term402865, term402865.getClass(), "lastDataVersion", "VvmseJJHLX");
        setField(term402865, term402865.getClass(), "compatibleCmVersion", "ZFkZPtRcYl");
        setField(term402865, term402865.getClass(), "lastPlayDate", "TaydsqFPfJ");
        setIntField(term402865, term402865.getClass(), "lastPlaceId", 1289234985);
        setField(term402865, term402865.getClass(), "lastPlaceName", "awIkiNcuAH");
        setIntField(term402865, term402865.getClass(), "lastRegionId", -252797024);
        setField(term402865, term402865.getClass(), "lastRegionName", "MWLxFaorhg");
        setIntField(term402865, term402865.getClass(), "lastAllNetId", 1701765808);
        setField(term402865, term402865.getClass(), "lastClientId", "sVRKIySVFT");
        setIntField(term402865, term402865.getClass(), "lastUsedDeckId", 818944825);
        setIntField(term402865, term402865.getClass(), "lastPlayMusicLevel", -1007830981);
        setIntField(term402865, term402865.getClass(), "lastEmoneyBrand", 1692636669);
        term403128 = new Integer(250225233);
        term403130 = new Integer(987485095);
        term403132 = new Integer(1677401970);
        term403134 = new Integer(-1829476351);
        term403136 = new Integer(-527609323);
        term403138 = new Boolean(true);
        term403140 = new Boolean(true);
        term403142 = new Boolean(true);
        term403144 = new Boolean(false);
        term403146 = new Integer(-1834990044);
        term403148 = new Integer(-967792516);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMemoryChapter");
        Class<?>[] argTypes = new Class<?>[13];
        argTypes[0] = long.class;
        argTypes[1] = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        argTypes[4] = int.class;
        argTypes[5] = int.class;
        argTypes[6] = int.class;
        argTypes[7] = boolean.class;
        argTypes[8] = boolean.class;
        argTypes[9] = boolean.class;
        argTypes[10] = boolean.class;
        argTypes[11] = int.class;
        argTypes[12] = int.class;
        Object[] args = new Object[13];
        args[0] = term402863;
        args[1] = term402865;
        args[2] = term403128;
        args[3] = term403130;
        args[4] = term403132;
        args[5] = term403134;
        args[6] = term403136;
        args[7] = term403138;
        args[8] = term403140;
        args[9] = term403142;
        args[10] = term403144;
        args[11] = term403146;
        args[12] = term403148;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


