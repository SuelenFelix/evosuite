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

public class UserData_getTotalPoint_4187580327 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24879;

    public UserData_getTotalPoint_4187580327() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term24883 = new Long(-7738503207562305297L);
        term24879 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term24881 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term24897 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term24898 = newInstance(Class.forName("java.time.LocalDate"));
        Object term24902 = newInstance(Class.forName("java.time.LocalTime"));
        Object term24907 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term24908 = newInstance(Class.forName("java.time.LocalDate"));
        Object term24912 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term24879, term24879.getClass(), "id", 60910260492008727L);
        setLongField(term24881, term24881.getClass(), "id", 1696831840206676000L);
        setField(term24881, term24881.getClass(), "extId", term24883);
        setField(term24881, term24881.getClass(), "luid", "KyGbLglqbW");
        setIntField(term24898, term24898.getClass(), "year", 2028);
        setShortField(term24898, term24898.getClass(), "month", (short) 4);
        setShortField(term24898, term24898.getClass(), "day", (short) 11);
        setField(term24897, term24897.getClass(), "date", term24898);
        setByteField(term24902, term24902.getClass(), "hour", (byte) 4);
        setByteField(term24902, term24902.getClass(), "minute", (byte) 45);
        setByteField(term24902, term24902.getClass(), "second", (byte) 2);
        setIntField(term24902, term24902.getClass(), "nano", 374177968);
        setField(term24897, term24897.getClass(), "time", term24902);
        setField(term24881, term24881.getClass(), "registerTime", term24897);
        setIntField(term24908, term24908.getClass(), "year", 2021);
        setShortField(term24908, term24908.getClass(), "month", (short) 4);
        setShortField(term24908, term24908.getClass(), "day", (short) 22);
        setField(term24907, term24907.getClass(), "date", term24908);
        setByteField(term24912, term24912.getClass(), "hour", (byte) 17);
        setByteField(term24912, term24912.getClass(), "minute", (byte) 6);
        setByteField(term24912, term24912.getClass(), "second", (byte) 33);
        setIntField(term24912, term24912.getClass(), "nano", 21410850);
        setField(term24907, term24907.getClass(), "time", term24912);
        setField(term24881, term24881.getClass(), "accessTime", term24907);
        setField(term24879, term24879.getClass(), "card", term24881);
        setField(term24879, term24879.getClass(), "userName", "ZKVeStsSNT");
        setIntField(term24879, term24879.getClass(), "level", 1302075623);
        setIntField(term24879, term24879.getClass(), "reincarnationNum", 1238707613);
        setLongField(term24879, term24879.getClass(), "exp", 6079978726138581731L);
        setLongField(term24879, term24879.getClass(), "point", 2001497540145118L);
        setLongField(term24879, term24879.getClass(), "totalPoint", -9048797705753068816L);
        setIntField(term24879, term24879.getClass(), "playCount", 1961351136);
        setIntField(term24879, term24879.getClass(), "jewelCount", -1546528470);
        setIntField(term24879, term24879.getClass(), "totalJewelCount", -1518971561);
        setIntField(term24879, term24879.getClass(), "medalCount", 1513663171);
        setIntField(term24879, term24879.getClass(), "playerRating", 1527034193);
        setIntField(term24879, term24879.getClass(), "highestRating", 1309545946);
        setIntField(term24879, term24879.getClass(), "battlePoint", -1457812682);
        setIntField(term24879, term24879.getClass(), "bestBattlePoint", -161850441);
        setIntField(term24879, term24879.getClass(), "overDamageBattlePoint", 1486351894);
        setBooleanField(term24879, term24879.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term24879, term24879.getClass(), "nameplateId", 1352463113);
        setIntField(term24879, term24879.getClass(), "trophyId", 897269648);
        setIntField(term24879, term24879.getClass(), "cardId", -1020664075);
        setIntField(term24879, term24879.getClass(), "characterId", -1412100145);
        setIntField(term24879, term24879.getClass(), "characterVoiceNo", -1702355599);
        setIntField(term24879, term24879.getClass(), "tabSetting", -1477091217);
        setIntField(term24879, term24879.getClass(), "tabSortSetting", 2023226154);
        setIntField(term24879, term24879.getClass(), "cardCategorySetting", 2111611214);
        setIntField(term24879, term24879.getClass(), "cardSortSetting", -2031129784);
        setIntField(term24879, term24879.getClass(), "rivalScoreCategorySetting", 251039122);
        setIntField(term24879, term24879.getClass(), "playedTutorialBit", 459471826);
        setIntField(term24879, term24879.getClass(), "firstTutorialCancelNum", -1054011286);
        setLongField(term24879, term24879.getClass(), "sumTechHighScore", -5796564556566273156L);
        setLongField(term24879, term24879.getClass(), "sumTechBasicHighScore", 4376251358600000238L);
        setLongField(term24879, term24879.getClass(), "sumTechAdvancedHighScore", -3708632729138387526L);
        setLongField(term24879, term24879.getClass(), "sumTechExpertHighScore", 2359134970522271046L);
        setLongField(term24879, term24879.getClass(), "sumTechMasterHighScore", -6198150397627694231L);
        setLongField(term24879, term24879.getClass(), "sumTechLunaticHighScore", 7725924092701084764L);
        setLongField(term24879, term24879.getClass(), "sumBattleHighScore", -3646702249834556847L);
        setLongField(term24879, term24879.getClass(), "sumBattleBasicHighScore", 2701558556303760915L);
        setLongField(term24879, term24879.getClass(), "sumBattleAdvancedHighScore", 4187385369384657492L);
        setLongField(term24879, term24879.getClass(), "sumBattleExpertHighScore", -8947510185810654315L);
        setLongField(term24879, term24879.getClass(), "sumBattleMasterHighScore", -2356977949142999853L);
        setLongField(term24879, term24879.getClass(), "sumBattleLunaticHighScore", 3410627884495049043L);
        setField(term24879, term24879.getClass(), "eventWatchedDate", "cqCXYaAnFB");
        setField(term24879, term24879.getClass(), "cmEventWatchedDate", "UPLNFZHXjw");
        setField(term24879, term24879.getClass(), "firstGameId", "CwrrJlrGmg");
        setField(term24879, term24879.getClass(), "firstRomVersion", "HejzvyejjG");
        setField(term24879, term24879.getClass(), "firstDataVersion", "pbqJjeooBM");
        setField(term24879, term24879.getClass(), "firstPlayDate", "ccnotFfPXt");
        setField(term24879, term24879.getClass(), "lastGameId", "plWlgdgIhn");
        setField(term24879, term24879.getClass(), "lastRomVersion", "RZaKVKWtND");
        setField(term24879, term24879.getClass(), "lastDataVersion", "vXiaNiquft");
        setField(term24879, term24879.getClass(), "compatibleCmVersion", "lucCeiVnYe");
        setField(term24879, term24879.getClass(), "lastPlayDate", "iYwkCLMsbJ");
        setIntField(term24879, term24879.getClass(), "lastPlaceId", -1640361091);
        setField(term24879, term24879.getClass(), "lastPlaceName", "MXLsVQWrwc");
        setIntField(term24879, term24879.getClass(), "lastRegionId", -1908164516);
        setField(term24879, term24879.getClass(), "lastRegionName", "lRaSlqzqNY");
        setIntField(term24879, term24879.getClass(), "lastAllNetId", -1343269854);
        setField(term24879, term24879.getClass(), "lastClientId", "TiEyxWXsra");
        setIntField(term24879, term24879.getClass(), "lastUsedDeckId", -731459309);
        setIntField(term24879, term24879.getClass(), "lastPlayMusicLevel", -913468095);
        setIntField(term24879, term24879.getClass(), "lastEmoneyBrand", 38489871);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotalPoint", argTypes, term24879, args);
    }

};


