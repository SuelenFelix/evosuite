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

public class UserData_getCardId_70713556720 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30378;

    public UserData_getCardId_70713556720() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term30382 = new Long(-8654565919063661957L);
        term30378 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term30380 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term30396 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term30397 = newInstance(Class.forName("java.time.LocalDate"));
        Object term30401 = newInstance(Class.forName("java.time.LocalTime"));
        Object term30406 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term30407 = newInstance(Class.forName("java.time.LocalDate"));
        Object term30411 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term30378, term30378.getClass(), "id", -6209056926999752933L);
        setLongField(term30380, term30380.getClass(), "id", 475071242551560384L);
        setField(term30380, term30380.getClass(), "extId", term30382);
        setField(term30380, term30380.getClass(), "luid", "PrHWfHydsG");
        setIntField(term30397, term30397.getClass(), "year", 2010);
        setShortField(term30397, term30397.getClass(), "month", (short) 3);
        setShortField(term30397, term30397.getClass(), "day", (short) 11);
        setField(term30396, term30396.getClass(), "date", term30397);
        setByteField(term30401, term30401.getClass(), "hour", (byte) 0);
        setByteField(term30401, term30401.getClass(), "minute", (byte) 21);
        setByteField(term30401, term30401.getClass(), "second", (byte) 25);
        setIntField(term30401, term30401.getClass(), "nano", 201315999);
        setField(term30396, term30396.getClass(), "time", term30401);
        setField(term30380, term30380.getClass(), "registerTime", term30396);
        setIntField(term30407, term30407.getClass(), "year", 2016);
        setShortField(term30407, term30407.getClass(), "month", (short) 8);
        setShortField(term30407, term30407.getClass(), "day", (short) 24);
        setField(term30406, term30406.getClass(), "date", term30407);
        setByteField(term30411, term30411.getClass(), "hour", (byte) 22);
        setByteField(term30411, term30411.getClass(), "minute", (byte) 25);
        setByteField(term30411, term30411.getClass(), "second", (byte) 3);
        setIntField(term30411, term30411.getClass(), "nano", 185613519);
        setField(term30406, term30406.getClass(), "time", term30411);
        setField(term30380, term30380.getClass(), "accessTime", term30406);
        setField(term30378, term30378.getClass(), "card", term30380);
        setField(term30378, term30378.getClass(), "userName", "igruEzTbBE");
        setIntField(term30378, term30378.getClass(), "level", 1961561878);
        setIntField(term30378, term30378.getClass(), "reincarnationNum", 1235809050);
        setLongField(term30378, term30378.getClass(), "exp", 279205148356106270L);
        setLongField(term30378, term30378.getClass(), "point", -3702098864254881563L);
        setLongField(term30378, term30378.getClass(), "totalPoint", 1787205862282614159L);
        setIntField(term30378, term30378.getClass(), "playCount", 1370082921);
        setIntField(term30378, term30378.getClass(), "jewelCount", 1966881264);
        setIntField(term30378, term30378.getClass(), "totalJewelCount", -1707655562);
        setIntField(term30378, term30378.getClass(), "medalCount", 1525815085);
        setIntField(term30378, term30378.getClass(), "playerRating", 1785476260);
        setIntField(term30378, term30378.getClass(), "highestRating", -655035002);
        setIntField(term30378, term30378.getClass(), "battlePoint", 1841475189);
        setIntField(term30378, term30378.getClass(), "bestBattlePoint", -456566581);
        setIntField(term30378, term30378.getClass(), "overDamageBattlePoint", 2114761003);
        setBooleanField(term30378, term30378.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term30378, term30378.getClass(), "nameplateId", -1128091158);
        setIntField(term30378, term30378.getClass(), "trophyId", 380526008);
        setIntField(term30378, term30378.getClass(), "cardId", -285065370);
        setIntField(term30378, term30378.getClass(), "characterId", -1542216721);
        setIntField(term30378, term30378.getClass(), "characterVoiceNo", -311300330);
        setIntField(term30378, term30378.getClass(), "tabSetting", 1160936971);
        setIntField(term30378, term30378.getClass(), "tabSortSetting", 1258846008);
        setIntField(term30378, term30378.getClass(), "cardCategorySetting", 702866958);
        setIntField(term30378, term30378.getClass(), "cardSortSetting", 622731276);
        setIntField(term30378, term30378.getClass(), "rivalScoreCategorySetting", -1302341502);
        setIntField(term30378, term30378.getClass(), "playedTutorialBit", 1113574554);
        setIntField(term30378, term30378.getClass(), "firstTutorialCancelNum", 1685800093);
        setLongField(term30378, term30378.getClass(), "sumTechHighScore", -7876013692629304244L);
        setLongField(term30378, term30378.getClass(), "sumTechBasicHighScore", 8129782425142702673L);
        setLongField(term30378, term30378.getClass(), "sumTechAdvancedHighScore", -1348078265481224468L);
        setLongField(term30378, term30378.getClass(), "sumTechExpertHighScore", 7007517375697316368L);
        setLongField(term30378, term30378.getClass(), "sumTechMasterHighScore", 8485924987529500210L);
        setLongField(term30378, term30378.getClass(), "sumTechLunaticHighScore", 1397546230296552361L);
        setLongField(term30378, term30378.getClass(), "sumBattleHighScore", 4531694455151993856L);
        setLongField(term30378, term30378.getClass(), "sumBattleBasicHighScore", 4543928187003669961L);
        setLongField(term30378, term30378.getClass(), "sumBattleAdvancedHighScore", -1536013261126093321L);
        setLongField(term30378, term30378.getClass(), "sumBattleExpertHighScore", 5953375436340093396L);
        setLongField(term30378, term30378.getClass(), "sumBattleMasterHighScore", -7089384741512135431L);
        setLongField(term30378, term30378.getClass(), "sumBattleLunaticHighScore", 7207062884131909895L);
        setField(term30378, term30378.getClass(), "eventWatchedDate", "LFjgROsRUV");
        setField(term30378, term30378.getClass(), "cmEventWatchedDate", "kHxujKiCsr");
        setField(term30378, term30378.getClass(), "firstGameId", "cseZveWowm");
        setField(term30378, term30378.getClass(), "firstRomVersion", "idfslIPhgx");
        setField(term30378, term30378.getClass(), "firstDataVersion", "HyFLOXeoDX");
        setField(term30378, term30378.getClass(), "firstPlayDate", "crkNabVaWs");
        setField(term30378, term30378.getClass(), "lastGameId", "qBcAJgrABE");
        setField(term30378, term30378.getClass(), "lastRomVersion", "JKdZuLFRwC");
        setField(term30378, term30378.getClass(), "lastDataVersion", "hfhLLoWnRU");
        setField(term30378, term30378.getClass(), "compatibleCmVersion", "RpofnOPYha");
        setField(term30378, term30378.getClass(), "lastPlayDate", "CQYmAsjvPU");
        setIntField(term30378, term30378.getClass(), "lastPlaceId", -318699441);
        setField(term30378, term30378.getClass(), "lastPlaceName", "NNkIIFpxiB");
        setIntField(term30378, term30378.getClass(), "lastRegionId", 1381027809);
        setField(term30378, term30378.getClass(), "lastRegionName", "sBmtvFPDso");
        setIntField(term30378, term30378.getClass(), "lastAllNetId", -371717995);
        setField(term30378, term30378.getClass(), "lastClientId", "qsUIxrLolr");
        setIntField(term30378, term30378.getClass(), "lastUsedDeckId", 1713005479);
        setIntField(term30378, term30378.getClass(), "lastPlayMusicLevel", -1948910444);
        setIntField(term30378, term30378.getClass(), "lastEmoneyBrand", -1099061955);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCardId", argTypes, term30378, args);
    }

};


