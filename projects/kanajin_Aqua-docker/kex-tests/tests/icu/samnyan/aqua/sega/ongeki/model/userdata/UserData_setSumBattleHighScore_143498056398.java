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

public class UserData_setSumBattleHighScore_143498056398 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term63508;
     Object term63771;

    public UserData_setSumBattleHighScore_143498056398() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term63512 = new Long(138235087558060686L);
        term63508 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term63510 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term63526 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term63527 = newInstance(Class.forName("java.time.LocalDate"));
        Object term63531 = newInstance(Class.forName("java.time.LocalTime"));
        Object term63536 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term63537 = newInstance(Class.forName("java.time.LocalDate"));
        Object term63541 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term63508, term63508.getClass(), "id", 38977818512796233L);
        setLongField(term63510, term63510.getClass(), "id", 672879829116719924L);
        setField(term63510, term63510.getClass(), "extId", term63512);
        setField(term63510, term63510.getClass(), "luid", "nvXqvMSAjc");
        setIntField(term63527, term63527.getClass(), "year", 2020);
        setShortField(term63527, term63527.getClass(), "month", (short) 4);
        setShortField(term63527, term63527.getClass(), "day", (short) 16);
        setField(term63526, term63526.getClass(), "date", term63527);
        setByteField(term63531, term63531.getClass(), "hour", (byte) 7);
        setByteField(term63531, term63531.getClass(), "minute", (byte) 46);
        setByteField(term63531, term63531.getClass(), "second", (byte) 47);
        setIntField(term63531, term63531.getClass(), "nano", 687690824);
        setField(term63526, term63526.getClass(), "time", term63531);
        setField(term63510, term63510.getClass(), "registerTime", term63526);
        setIntField(term63537, term63537.getClass(), "year", 2010);
        setShortField(term63537, term63537.getClass(), "month", (short) 7);
        setShortField(term63537, term63537.getClass(), "day", (short) 15);
        setField(term63536, term63536.getClass(), "date", term63537);
        setByteField(term63541, term63541.getClass(), "hour", (byte) 11);
        setByteField(term63541, term63541.getClass(), "minute", (byte) 28);
        setByteField(term63541, term63541.getClass(), "second", (byte) 5);
        setIntField(term63541, term63541.getClass(), "nano", 471613968);
        setField(term63536, term63536.getClass(), "time", term63541);
        setField(term63510, term63510.getClass(), "accessTime", term63536);
        setField(term63508, term63508.getClass(), "card", term63510);
        setField(term63508, term63508.getClass(), "userName", "agbhgbQisl");
        setIntField(term63508, term63508.getClass(), "level", -1253063552);
        setIntField(term63508, term63508.getClass(), "reincarnationNum", 11874750);
        setLongField(term63508, term63508.getClass(), "exp", -6133230556162838255L);
        setLongField(term63508, term63508.getClass(), "point", -4333639116826995110L);
        setLongField(term63508, term63508.getClass(), "totalPoint", -7617231570937544003L);
        setIntField(term63508, term63508.getClass(), "playCount", -920088882);
        setIntField(term63508, term63508.getClass(), "jewelCount", -1963888580);
        setIntField(term63508, term63508.getClass(), "totalJewelCount", 885969140);
        setIntField(term63508, term63508.getClass(), "medalCount", -573115224);
        setIntField(term63508, term63508.getClass(), "playerRating", 716083613);
        setIntField(term63508, term63508.getClass(), "highestRating", 236114197);
        setIntField(term63508, term63508.getClass(), "battlePoint", -1633292626);
        setIntField(term63508, term63508.getClass(), "bestBattlePoint", 689769597);
        setIntField(term63508, term63508.getClass(), "overDamageBattlePoint", -1219602723);
        setBooleanField(term63508, term63508.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term63508, term63508.getClass(), "nameplateId", 1668201364);
        setIntField(term63508, term63508.getClass(), "trophyId", -548343635);
        setIntField(term63508, term63508.getClass(), "cardId", -590979324);
        setIntField(term63508, term63508.getClass(), "characterId", -1745427158);
        setIntField(term63508, term63508.getClass(), "characterVoiceNo", 1516032954);
        setIntField(term63508, term63508.getClass(), "tabSetting", -1945165354);
        setIntField(term63508, term63508.getClass(), "tabSortSetting", 14341670);
        setIntField(term63508, term63508.getClass(), "cardCategorySetting", -144022361);
        setIntField(term63508, term63508.getClass(), "cardSortSetting", -1419212893);
        setIntField(term63508, term63508.getClass(), "rivalScoreCategorySetting", -457189882);
        setIntField(term63508, term63508.getClass(), "playedTutorialBit", -1227023001);
        setIntField(term63508, term63508.getClass(), "firstTutorialCancelNum", -622827471);
        setLongField(term63508, term63508.getClass(), "sumTechHighScore", 2030200770029836292L);
        setLongField(term63508, term63508.getClass(), "sumTechBasicHighScore", -1050483041230879612L);
        setLongField(term63508, term63508.getClass(), "sumTechAdvancedHighScore", -6995916033829012295L);
        setLongField(term63508, term63508.getClass(), "sumTechExpertHighScore", 3927891930720164353L);
        setLongField(term63508, term63508.getClass(), "sumTechMasterHighScore", 3251061202419362457L);
        setLongField(term63508, term63508.getClass(), "sumTechLunaticHighScore", -4684671918758363337L);
        setLongField(term63508, term63508.getClass(), "sumBattleHighScore", -3816054957330703095L);
        setLongField(term63508, term63508.getClass(), "sumBattleBasicHighScore", 6773177296493870806L);
        setLongField(term63508, term63508.getClass(), "sumBattleAdvancedHighScore", 152811277002165908L);
        setLongField(term63508, term63508.getClass(), "sumBattleExpertHighScore", 858905884211038396L);
        setLongField(term63508, term63508.getClass(), "sumBattleMasterHighScore", -3998925841183367920L);
        setLongField(term63508, term63508.getClass(), "sumBattleLunaticHighScore", 397709034253708478L);
        setField(term63508, term63508.getClass(), "eventWatchedDate", "EZvlAVCXCm");
        setField(term63508, term63508.getClass(), "cmEventWatchedDate", "axtbmWOSRY");
        setField(term63508, term63508.getClass(), "firstGameId", "TLlyjzxJUz");
        setField(term63508, term63508.getClass(), "firstRomVersion", "YclIWGPKZY");
        setField(term63508, term63508.getClass(), "firstDataVersion", "gChBjLUhbg");
        setField(term63508, term63508.getClass(), "firstPlayDate", "enWkULOykY");
        setField(term63508, term63508.getClass(), "lastGameId", "BPdcafiAQX");
        setField(term63508, term63508.getClass(), "lastRomVersion", "GvmOxwMrOk");
        setField(term63508, term63508.getClass(), "lastDataVersion", "WXUKmhwFsK");
        setField(term63508, term63508.getClass(), "compatibleCmVersion", "OcfokBTzZZ");
        setField(term63508, term63508.getClass(), "lastPlayDate", "zeBhlhyhkL");
        setIntField(term63508, term63508.getClass(), "lastPlaceId", -1759579486);
        setField(term63508, term63508.getClass(), "lastPlaceName", "PxinRhWgwT");
        setIntField(term63508, term63508.getClass(), "lastRegionId", 147748970);
        setField(term63508, term63508.getClass(), "lastRegionName", "pZcEKUNIXL");
        setIntField(term63508, term63508.getClass(), "lastAllNetId", -459525196);
        setField(term63508, term63508.getClass(), "lastClientId", "QbRtvZIDtW");
        setIntField(term63508, term63508.getClass(), "lastUsedDeckId", 2129073623);
        setIntField(term63508, term63508.getClass(), "lastPlayMusicLevel", -1623896406);
        setIntField(term63508, term63508.getClass(), "lastEmoneyBrand", -1767855347);
        term63771 = new Long(1177841659738819583L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term63771;
        callMethod(klass, "setSumBattleHighScore", argTypes, term63508, args);
    }

};


