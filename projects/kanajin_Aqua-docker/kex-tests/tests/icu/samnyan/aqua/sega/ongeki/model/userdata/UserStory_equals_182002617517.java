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

public class UserStory_equals_182002617517 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term165390;
     Object term165661;

    public UserStory_equals_182002617517() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term165396 = new Long(-5207216109884759743L);
        term165390 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserStory"));
        Object term165392 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term165394 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term165410 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term165411 = newInstance(Class.forName("java.time.LocalDate"));
        Object term165415 = newInstance(Class.forName("java.time.LocalTime"));
        Object term165420 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term165421 = newInstance(Class.forName("java.time.LocalDate"));
        Object term165425 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term165390, term165390.getClass(), "id", 2927460958159387652L);
        setLongField(term165392, term165392.getClass(), "id", -8974647646643503706L);
        setLongField(term165394, term165394.getClass(), "id", 3578386851701281032L);
        setField(term165394, term165394.getClass(), "extId", term165396);
        setField(term165394, term165394.getClass(), "luid", "cKYpQTvxsS");
        setIntField(term165411, term165411.getClass(), "year", 2015);
        setShortField(term165411, term165411.getClass(), "month", (short) 5);
        setShortField(term165411, term165411.getClass(), "day", (short) 30);
        setField(term165410, term165410.getClass(), "date", term165411);
        setByteField(term165415, term165415.getClass(), "hour", (byte) 6);
        setByteField(term165415, term165415.getClass(), "minute", (byte) 20);
        setByteField(term165415, term165415.getClass(), "second", (byte) 29);
        setIntField(term165415, term165415.getClass(), "nano", 871322714);
        setField(term165410, term165410.getClass(), "time", term165415);
        setField(term165394, term165394.getClass(), "registerTime", term165410);
        setIntField(term165421, term165421.getClass(), "year", 2029);
        setShortField(term165421, term165421.getClass(), "month", (short) 9);
        setShortField(term165421, term165421.getClass(), "day", (short) 21);
        setField(term165420, term165420.getClass(), "date", term165421);
        setByteField(term165425, term165425.getClass(), "hour", (byte) 3);
        setByteField(term165425, term165425.getClass(), "minute", (byte) 36);
        setByteField(term165425, term165425.getClass(), "second", (byte) 11);
        setIntField(term165425, term165425.getClass(), "nano", 295278203);
        setField(term165420, term165420.getClass(), "time", term165425);
        setField(term165394, term165394.getClass(), "accessTime", term165420);
        setField(term165392, term165392.getClass(), "card", term165394);
        setField(term165392, term165392.getClass(), "userName", "HLsUyMzuDC");
        setIntField(term165392, term165392.getClass(), "level", 762125008);
        setIntField(term165392, term165392.getClass(), "reincarnationNum", -828578391);
        setLongField(term165392, term165392.getClass(), "exp", 5767384862412441914L);
        setLongField(term165392, term165392.getClass(), "point", 623442675398489183L);
        setLongField(term165392, term165392.getClass(), "totalPoint", -6054733688650022090L);
        setIntField(term165392, term165392.getClass(), "playCount", 1227082809);
        setIntField(term165392, term165392.getClass(), "jewelCount", -830464254);
        setIntField(term165392, term165392.getClass(), "totalJewelCount", -1633113382);
        setIntField(term165392, term165392.getClass(), "medalCount", 1665043120);
        setIntField(term165392, term165392.getClass(), "playerRating", -1816157328);
        setIntField(term165392, term165392.getClass(), "highestRating", -1918609852);
        setIntField(term165392, term165392.getClass(), "battlePoint", -1410223524);
        setIntField(term165392, term165392.getClass(), "bestBattlePoint", 1492158172);
        setIntField(term165392, term165392.getClass(), "overDamageBattlePoint", 705497880);
        setBooleanField(term165392, term165392.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term165392, term165392.getClass(), "nameplateId", -540039355);
        setIntField(term165392, term165392.getClass(), "trophyId", -319029519);
        setIntField(term165392, term165392.getClass(), "cardId", 856050368);
        setIntField(term165392, term165392.getClass(), "characterId", 1929961324);
        setIntField(term165392, term165392.getClass(), "characterVoiceNo", 342396095);
        setIntField(term165392, term165392.getClass(), "tabSetting", 352957175);
        setIntField(term165392, term165392.getClass(), "tabSortSetting", -416881882);
        setIntField(term165392, term165392.getClass(), "cardCategorySetting", 272127700);
        setIntField(term165392, term165392.getClass(), "cardSortSetting", -1473075262);
        setIntField(term165392, term165392.getClass(), "rivalScoreCategorySetting", 443000686);
        setIntField(term165392, term165392.getClass(), "playedTutorialBit", 1667596064);
        setIntField(term165392, term165392.getClass(), "firstTutorialCancelNum", -251654040);
        setLongField(term165392, term165392.getClass(), "sumTechHighScore", 1507754414072122752L);
        setLongField(term165392, term165392.getClass(), "sumTechBasicHighScore", -7334137679892509699L);
        setLongField(term165392, term165392.getClass(), "sumTechAdvancedHighScore", 4560964817296143583L);
        setLongField(term165392, term165392.getClass(), "sumTechExpertHighScore", 9143674073036977637L);
        setLongField(term165392, term165392.getClass(), "sumTechMasterHighScore", 6052534560716480370L);
        setLongField(term165392, term165392.getClass(), "sumTechLunaticHighScore", 2175456273310844514L);
        setLongField(term165392, term165392.getClass(), "sumBattleHighScore", -1600316146749079952L);
        setLongField(term165392, term165392.getClass(), "sumBattleBasicHighScore", 7337716616309286243L);
        setLongField(term165392, term165392.getClass(), "sumBattleAdvancedHighScore", -6634067216088918181L);
        setLongField(term165392, term165392.getClass(), "sumBattleExpertHighScore", 1329799884512173819L);
        setLongField(term165392, term165392.getClass(), "sumBattleMasterHighScore", 934727387934758977L);
        setLongField(term165392, term165392.getClass(), "sumBattleLunaticHighScore", -5846231543152567484L);
        setField(term165392, term165392.getClass(), "eventWatchedDate", "iHgKzDjHmx");
        setField(term165392, term165392.getClass(), "cmEventWatchedDate", "lcUHIQRWLS");
        setField(term165392, term165392.getClass(), "firstGameId", "chsXPLmgYZ");
        setField(term165392, term165392.getClass(), "firstRomVersion", "oBXyKERtMw");
        setField(term165392, term165392.getClass(), "firstDataVersion", "bJOmNlfxjj");
        setField(term165392, term165392.getClass(), "firstPlayDate", "JSmvZTKhYV");
        setField(term165392, term165392.getClass(), "lastGameId", "jznZimNLoY");
        setField(term165392, term165392.getClass(), "lastRomVersion", "DbfCXKwAyh");
        setField(term165392, term165392.getClass(), "lastDataVersion", "QihtmYbuXW");
        setField(term165392, term165392.getClass(), "compatibleCmVersion", "qNPBjOrBfH");
        setField(term165392, term165392.getClass(), "lastPlayDate", "fPMPFECIlh");
        setIntField(term165392, term165392.getClass(), "lastPlaceId", -1843755543);
        setField(term165392, term165392.getClass(), "lastPlaceName", "IzCXTvJGuk");
        setIntField(term165392, term165392.getClass(), "lastRegionId", -852260826);
        setField(term165392, term165392.getClass(), "lastRegionName", "oKmmNJRrKQ");
        setIntField(term165392, term165392.getClass(), "lastAllNetId", -418135199);
        setField(term165392, term165392.getClass(), "lastClientId", "KRbaZxXHuA");
        setIntField(term165392, term165392.getClass(), "lastUsedDeckId", -998308174);
        setIntField(term165392, term165392.getClass(), "lastPlayMusicLevel", 943396558);
        setIntField(term165392, term165392.getClass(), "lastEmoneyBrand", -249229799);
        setField(term165390, term165390.getClass(), "user", term165392);
        setIntField(term165390, term165390.getClass(), "storyId", 1410694856);
        setIntField(term165390, term165390.getClass(), "lastChapterId", -1629525320);
        setIntField(term165390, term165390.getClass(), "jewelCount", -675248961);
        setIntField(term165390, term165390.getClass(), "lastPlayMusicId", 633732117);
        setIntField(term165390, term165390.getClass(), "lastPlayMusicCategory", 2061669437);
        setIntField(term165390, term165390.getClass(), "lastPlayMusicLevel", 1974184760);
        term165661 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserStory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term165661;
        callMethod(klass, "equals", argTypes, term165390, args);
    }

};


