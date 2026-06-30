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

public class UserBoss_getUser_6861232992 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term134579;

    public UserBoss_getUser_6861232992() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term134585 = new Long(24067105862153728L);
        term134579 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserBoss"));
        Object term134581 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term134583 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term134599 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term134600 = newInstance(Class.forName("java.time.LocalDate"));
        Object term134604 = newInstance(Class.forName("java.time.LocalTime"));
        Object term134609 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term134610 = newInstance(Class.forName("java.time.LocalDate"));
        Object term134614 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term134579, term134579.getClass(), "id", 7851783128334434417L);
        setLongField(term134581, term134581.getClass(), "id", -433423767732749595L);
        setLongField(term134583, term134583.getClass(), "id", 8462022734241193461L);
        setField(term134583, term134583.getClass(), "extId", term134585);
        setField(term134583, term134583.getClass(), "luid", "rnkTocCEbH");
        setIntField(term134600, term134600.getClass(), "year", 2023);
        setShortField(term134600, term134600.getClass(), "month", (short) 8);
        setShortField(term134600, term134600.getClass(), "day", (short) 30);
        setField(term134599, term134599.getClass(), "date", term134600);
        setByteField(term134604, term134604.getClass(), "hour", (byte) 6);
        setByteField(term134604, term134604.getClass(), "minute", (byte) 55);
        setByteField(term134604, term134604.getClass(), "second", (byte) 45);
        setIntField(term134604, term134604.getClass(), "nano", 174033);
        setField(term134599, term134599.getClass(), "time", term134604);
        setField(term134583, term134583.getClass(), "registerTime", term134599);
        setIntField(term134610, term134610.getClass(), "year", 2017);
        setShortField(term134610, term134610.getClass(), "month", (short) 3);
        setShortField(term134610, term134610.getClass(), "day", (short) 13);
        setField(term134609, term134609.getClass(), "date", term134610);
        setByteField(term134614, term134614.getClass(), "hour", (byte) 20);
        setByteField(term134614, term134614.getClass(), "minute", (byte) 41);
        setByteField(term134614, term134614.getClass(), "second", (byte) 9);
        setIntField(term134614, term134614.getClass(), "nano", 698449623);
        setField(term134609, term134609.getClass(), "time", term134614);
        setField(term134583, term134583.getClass(), "accessTime", term134609);
        setField(term134581, term134581.getClass(), "card", term134583);
        setField(term134581, term134581.getClass(), "userName", "wsDKWECjHf");
        setIntField(term134581, term134581.getClass(), "level", 890902750);
        setIntField(term134581, term134581.getClass(), "reincarnationNum", 1085935180);
        setLongField(term134581, term134581.getClass(), "exp", 690971526671747505L);
        setLongField(term134581, term134581.getClass(), "point", -2851483650189136111L);
        setLongField(term134581, term134581.getClass(), "totalPoint", -3527643583530137066L);
        setIntField(term134581, term134581.getClass(), "playCount", -1085733328);
        setIntField(term134581, term134581.getClass(), "jewelCount", -631444937);
        setIntField(term134581, term134581.getClass(), "totalJewelCount", 520481809);
        setIntField(term134581, term134581.getClass(), "medalCount", 590207234);
        setIntField(term134581, term134581.getClass(), "playerRating", 472783258);
        setIntField(term134581, term134581.getClass(), "highestRating", 248223082);
        setIntField(term134581, term134581.getClass(), "battlePoint", 591035529);
        setIntField(term134581, term134581.getClass(), "bestBattlePoint", 349687385);
        setIntField(term134581, term134581.getClass(), "overDamageBattlePoint", -594025650);
        setBooleanField(term134581, term134581.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term134581, term134581.getClass(), "nameplateId", 483624079);
        setIntField(term134581, term134581.getClass(), "trophyId", -1846882062);
        setIntField(term134581, term134581.getClass(), "cardId", 1727415377);
        setIntField(term134581, term134581.getClass(), "characterId", -553367118);
        setIntField(term134581, term134581.getClass(), "characterVoiceNo", 1734441946);
        setIntField(term134581, term134581.getClass(), "tabSetting", -1316758147);
        setIntField(term134581, term134581.getClass(), "tabSortSetting", -266645356);
        setIntField(term134581, term134581.getClass(), "cardCategorySetting", -1168974406);
        setIntField(term134581, term134581.getClass(), "cardSortSetting", 649099374);
        setIntField(term134581, term134581.getClass(), "rivalScoreCategorySetting", -1673318908);
        setIntField(term134581, term134581.getClass(), "playedTutorialBit", -748711480);
        setIntField(term134581, term134581.getClass(), "firstTutorialCancelNum", -1598682190);
        setLongField(term134581, term134581.getClass(), "sumTechHighScore", 6482428503650773655L);
        setLongField(term134581, term134581.getClass(), "sumTechBasicHighScore", -6603641637625778772L);
        setLongField(term134581, term134581.getClass(), "sumTechAdvancedHighScore", 1298331847053385688L);
        setLongField(term134581, term134581.getClass(), "sumTechExpertHighScore", -1476522923614789546L);
        setLongField(term134581, term134581.getClass(), "sumTechMasterHighScore", 4561004925420001349L);
        setLongField(term134581, term134581.getClass(), "sumTechLunaticHighScore", 4175133631682821248L);
        setLongField(term134581, term134581.getClass(), "sumBattleHighScore", -79629254280335527L);
        setLongField(term134581, term134581.getClass(), "sumBattleBasicHighScore", 7077702931644858279L);
        setLongField(term134581, term134581.getClass(), "sumBattleAdvancedHighScore", -6879190842881522506L);
        setLongField(term134581, term134581.getClass(), "sumBattleExpertHighScore", 7224494234908164894L);
        setLongField(term134581, term134581.getClass(), "sumBattleMasterHighScore", -3661162601311802226L);
        setLongField(term134581, term134581.getClass(), "sumBattleLunaticHighScore", -8300560139112481522L);
        setField(term134581, term134581.getClass(), "eventWatchedDate", "FBPRmfNDEr");
        setField(term134581, term134581.getClass(), "cmEventWatchedDate", "qOEJpzrzgF");
        setField(term134581, term134581.getClass(), "firstGameId", "ExvDwmtNdV");
        setField(term134581, term134581.getClass(), "firstRomVersion", "MmhamxEBqw");
        setField(term134581, term134581.getClass(), "firstDataVersion", "heEXeIaieQ");
        setField(term134581, term134581.getClass(), "firstPlayDate", "MhsNUxKgPP");
        setField(term134581, term134581.getClass(), "lastGameId", "cGLyrLlynk");
        setField(term134581, term134581.getClass(), "lastRomVersion", "mMpSzaWkTz");
        setField(term134581, term134581.getClass(), "lastDataVersion", "leDgyXJudi");
        setField(term134581, term134581.getClass(), "compatibleCmVersion", "YgSDrWcUog");
        setField(term134581, term134581.getClass(), "lastPlayDate", "GnJMoyfrTK");
        setIntField(term134581, term134581.getClass(), "lastPlaceId", -1485075510);
        setField(term134581, term134581.getClass(), "lastPlaceName", "sDreXejQef");
        setIntField(term134581, term134581.getClass(), "lastRegionId", -628388239);
        setField(term134581, term134581.getClass(), "lastRegionName", "hKwivnVeCZ");
        setIntField(term134581, term134581.getClass(), "lastAllNetId", 971487780);
        setField(term134581, term134581.getClass(), "lastClientId", "fvxDfGibVS");
        setIntField(term134581, term134581.getClass(), "lastUsedDeckId", 1887441979);
        setIntField(term134581, term134581.getClass(), "lastPlayMusicLevel", -1582466429);
        setIntField(term134581, term134581.getClass(), "lastEmoneyBrand", 2050053472);
        setField(term134579, term134579.getClass(), "user", term134581);
        setIntField(term134579, term134579.getClass(), "musicId", -794841275);
        setIntField(term134579, term134579.getClass(), "damage", -1965551214);
        setBooleanField(term134579, term134579.getClass(), "isClear", false);
        setIntField(term134579, term134579.getClass(), "eventId", 417272371);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserBoss");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUser", argTypes, term134579, args);
    }

};


