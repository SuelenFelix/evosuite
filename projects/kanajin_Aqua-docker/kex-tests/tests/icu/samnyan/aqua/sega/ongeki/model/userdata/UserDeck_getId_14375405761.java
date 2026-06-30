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

public class UserDeck_getId_14375405761 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term142421;

    public UserDeck_getId_14375405761() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term142427 = new Long(2022482096970820459L);
        term142421 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserDeck"));
        Object term142423 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term142425 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term142441 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term142442 = newInstance(Class.forName("java.time.LocalDate"));
        Object term142446 = newInstance(Class.forName("java.time.LocalTime"));
        Object term142451 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term142452 = newInstance(Class.forName("java.time.LocalDate"));
        Object term142456 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term142421, term142421.getClass(), "id", -888051358165446377L);
        setLongField(term142423, term142423.getClass(), "id", 8244545673201444133L);
        setLongField(term142425, term142425.getClass(), "id", 4918324862220184367L);
        setField(term142425, term142425.getClass(), "extId", term142427);
        setField(term142425, term142425.getClass(), "luid", "kNaBBhwssd");
        setIntField(term142442, term142442.getClass(), "year", 2018);
        setShortField(term142442, term142442.getClass(), "month", (short) 12);
        setShortField(term142442, term142442.getClass(), "day", (short) 31);
        setField(term142441, term142441.getClass(), "date", term142442);
        setByteField(term142446, term142446.getClass(), "hour", (byte) 21);
        setByteField(term142446, term142446.getClass(), "minute", (byte) 20);
        setByteField(term142446, term142446.getClass(), "second", (byte) 32);
        setIntField(term142446, term142446.getClass(), "nano", 236426663);
        setField(term142441, term142441.getClass(), "time", term142446);
        setField(term142425, term142425.getClass(), "registerTime", term142441);
        setIntField(term142452, term142452.getClass(), "year", 2027);
        setShortField(term142452, term142452.getClass(), "month", (short) 10);
        setShortField(term142452, term142452.getClass(), "day", (short) 22);
        setField(term142451, term142451.getClass(), "date", term142452);
        setByteField(term142456, term142456.getClass(), "hour", (byte) 22);
        setByteField(term142456, term142456.getClass(), "minute", (byte) 49);
        setByteField(term142456, term142456.getClass(), "second", (byte) 17);
        setIntField(term142456, term142456.getClass(), "nano", 698349746);
        setField(term142451, term142451.getClass(), "time", term142456);
        setField(term142425, term142425.getClass(), "accessTime", term142451);
        setField(term142423, term142423.getClass(), "card", term142425);
        setField(term142423, term142423.getClass(), "userName", "zqGoMwjPjA");
        setIntField(term142423, term142423.getClass(), "level", -1924640207);
        setIntField(term142423, term142423.getClass(), "reincarnationNum", -1337500518);
        setLongField(term142423, term142423.getClass(), "exp", -510249168685978288L);
        setLongField(term142423, term142423.getClass(), "point", -5679925402138282168L);
        setLongField(term142423, term142423.getClass(), "totalPoint", -9184963461676182807L);
        setIntField(term142423, term142423.getClass(), "playCount", 1075950264);
        setIntField(term142423, term142423.getClass(), "jewelCount", 2023667585);
        setIntField(term142423, term142423.getClass(), "totalJewelCount", -1457367270);
        setIntField(term142423, term142423.getClass(), "medalCount", 599933959);
        setIntField(term142423, term142423.getClass(), "playerRating", 1546898322);
        setIntField(term142423, term142423.getClass(), "highestRating", 1681670795);
        setIntField(term142423, term142423.getClass(), "battlePoint", 371953556);
        setIntField(term142423, term142423.getClass(), "bestBattlePoint", 1627368933);
        setIntField(term142423, term142423.getClass(), "overDamageBattlePoint", -976378630);
        setBooleanField(term142423, term142423.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term142423, term142423.getClass(), "nameplateId", -1198631435);
        setIntField(term142423, term142423.getClass(), "trophyId", 243073628);
        setIntField(term142423, term142423.getClass(), "cardId", 12526162);
        setIntField(term142423, term142423.getClass(), "characterId", 1392375010);
        setIntField(term142423, term142423.getClass(), "characterVoiceNo", -1993971761);
        setIntField(term142423, term142423.getClass(), "tabSetting", 1389251335);
        setIntField(term142423, term142423.getClass(), "tabSortSetting", -921428041);
        setIntField(term142423, term142423.getClass(), "cardCategorySetting", 61264180);
        setIntField(term142423, term142423.getClass(), "cardSortSetting", -1036194324);
        setIntField(term142423, term142423.getClass(), "rivalScoreCategorySetting", -486471150);
        setIntField(term142423, term142423.getClass(), "playedTutorialBit", 837208909);
        setIntField(term142423, term142423.getClass(), "firstTutorialCancelNum", 1016033285);
        setLongField(term142423, term142423.getClass(), "sumTechHighScore", -5850683100983447638L);
        setLongField(term142423, term142423.getClass(), "sumTechBasicHighScore", -969248940075427831L);
        setLongField(term142423, term142423.getClass(), "sumTechAdvancedHighScore", 3189381325376535466L);
        setLongField(term142423, term142423.getClass(), "sumTechExpertHighScore", 7800590755931124562L);
        setLongField(term142423, term142423.getClass(), "sumTechMasterHighScore", 2630842583870688303L);
        setLongField(term142423, term142423.getClass(), "sumTechLunaticHighScore", 7753750434146855439L);
        setLongField(term142423, term142423.getClass(), "sumBattleHighScore", -4478220735678972814L);
        setLongField(term142423, term142423.getClass(), "sumBattleBasicHighScore", -4676429852031489895L);
        setLongField(term142423, term142423.getClass(), "sumBattleAdvancedHighScore", 8184501842173410052L);
        setLongField(term142423, term142423.getClass(), "sumBattleExpertHighScore", 4178947274170907900L);
        setLongField(term142423, term142423.getClass(), "sumBattleMasterHighScore", -2564845102147518699L);
        setLongField(term142423, term142423.getClass(), "sumBattleLunaticHighScore", -5094566830858430503L);
        setField(term142423, term142423.getClass(), "eventWatchedDate", "qvrLYIqpRM");
        setField(term142423, term142423.getClass(), "cmEventWatchedDate", "IoPixEbkAS");
        setField(term142423, term142423.getClass(), "firstGameId", "aUBGFyjAFZ");
        setField(term142423, term142423.getClass(), "firstRomVersion", "hLGRczvgrI");
        setField(term142423, term142423.getClass(), "firstDataVersion", "ENiUwgffeV");
        setField(term142423, term142423.getClass(), "firstPlayDate", "KfyRZmwblA");
        setField(term142423, term142423.getClass(), "lastGameId", "uBFesOdlOQ");
        setField(term142423, term142423.getClass(), "lastRomVersion", "mhZDVyKkRQ");
        setField(term142423, term142423.getClass(), "lastDataVersion", "gUjPlBJpBX");
        setField(term142423, term142423.getClass(), "compatibleCmVersion", "XsbZWCULaM");
        setField(term142423, term142423.getClass(), "lastPlayDate", "SVgzmJdpqR");
        setIntField(term142423, term142423.getClass(), "lastPlaceId", -1981879284);
        setField(term142423, term142423.getClass(), "lastPlaceName", "iPeJOiWzhg");
        setIntField(term142423, term142423.getClass(), "lastRegionId", -1922383305);
        setField(term142423, term142423.getClass(), "lastRegionName", "munlTtNamQ");
        setIntField(term142423, term142423.getClass(), "lastAllNetId", -1515149854);
        setField(term142423, term142423.getClass(), "lastClientId", "DUpJkfRxDT");
        setIntField(term142423, term142423.getClass(), "lastUsedDeckId", 2127902475);
        setIntField(term142423, term142423.getClass(), "lastPlayMusicLevel", -974929860);
        setIntField(term142423, term142423.getClass(), "lastEmoneyBrand", -229722367);
        setField(term142421, term142421.getClass(), "user", term142423);
        setIntField(term142421, term142421.getClass(), "deckId", 46745820);
        setIntField(term142421, term142421.getClass(), "cardId1", 521784908);
        setIntField(term142421, term142421.getClass(), "cardId2", -716648067);
        setIntField(term142421, term142421.getClass(), "cardId3", 100573346);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserDeck");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term142421, args);
    }

};


