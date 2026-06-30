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

public class UserCharacter_getIntimateCount_6050989858 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term171349;

    public UserCharacter_getIntimateCount_6050989858() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term171355 = new Long(-5587528177305224828L);
        term171349 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserCharacter"));
        Object term171351 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term171353 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term171369 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term171370 = newInstance(Class.forName("java.time.LocalDate"));
        Object term171374 = newInstance(Class.forName("java.time.LocalTime"));
        Object term171379 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term171380 = newInstance(Class.forName("java.time.LocalDate"));
        Object term171384 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term171349, term171349.getClass(), "id", 2498965757990557215L);
        setLongField(term171351, term171351.getClass(), "id", -5106579524454203545L);
        setLongField(term171353, term171353.getClass(), "id", -3215429352927471044L);
        setField(term171353, term171353.getClass(), "extId", term171355);
        setField(term171353, term171353.getClass(), "luid", "lglDabDaoB");
        setIntField(term171370, term171370.getClass(), "year", 2021);
        setShortField(term171370, term171370.getClass(), "month", (short) 3);
        setShortField(term171370, term171370.getClass(), "day", (short) 30);
        setField(term171369, term171369.getClass(), "date", term171370);
        setByteField(term171374, term171374.getClass(), "hour", (byte) 4);
        setByteField(term171374, term171374.getClass(), "minute", (byte) 19);
        setByteField(term171374, term171374.getClass(), "second", (byte) 24);
        setIntField(term171374, term171374.getClass(), "nano", 421494175);
        setField(term171369, term171369.getClass(), "time", term171374);
        setField(term171353, term171353.getClass(), "registerTime", term171369);
        setIntField(term171380, term171380.getClass(), "year", 2028);
        setShortField(term171380, term171380.getClass(), "month", (short) 1);
        setShortField(term171380, term171380.getClass(), "day", (short) 9);
        setField(term171379, term171379.getClass(), "date", term171380);
        setByteField(term171384, term171384.getClass(), "hour", (byte) 10);
        setByteField(term171384, term171384.getClass(), "minute", (byte) 17);
        setByteField(term171384, term171384.getClass(), "second", (byte) 24);
        setIntField(term171384, term171384.getClass(), "nano", 95983008);
        setField(term171379, term171379.getClass(), "time", term171384);
        setField(term171353, term171353.getClass(), "accessTime", term171379);
        setField(term171351, term171351.getClass(), "card", term171353);
        setField(term171351, term171351.getClass(), "userName", "stxLyVcHjz");
        setIntField(term171351, term171351.getClass(), "level", 1954267797);
        setIntField(term171351, term171351.getClass(), "reincarnationNum", 1329325699);
        setLongField(term171351, term171351.getClass(), "exp", 8159541472648236739L);
        setLongField(term171351, term171351.getClass(), "point", 2973404116146321671L);
        setLongField(term171351, term171351.getClass(), "totalPoint", -8841313716709034325L);
        setIntField(term171351, term171351.getClass(), "playCount", 851318857);
        setIntField(term171351, term171351.getClass(), "jewelCount", 72185115);
        setIntField(term171351, term171351.getClass(), "totalJewelCount", 2111617419);
        setIntField(term171351, term171351.getClass(), "medalCount", 1210867323);
        setIntField(term171351, term171351.getClass(), "playerRating", 27791137);
        setIntField(term171351, term171351.getClass(), "highestRating", 1963687417);
        setIntField(term171351, term171351.getClass(), "battlePoint", -965855146);
        setIntField(term171351, term171351.getClass(), "bestBattlePoint", 197583048);
        setIntField(term171351, term171351.getClass(), "overDamageBattlePoint", -1011618744);
        setBooleanField(term171351, term171351.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term171351, term171351.getClass(), "nameplateId", -1939207343);
        setIntField(term171351, term171351.getClass(), "trophyId", -1542332267);
        setIntField(term171351, term171351.getClass(), "cardId", 511979240);
        setIntField(term171351, term171351.getClass(), "characterId", 1453502162);
        setIntField(term171351, term171351.getClass(), "characterVoiceNo", -1053363959);
        setIntField(term171351, term171351.getClass(), "tabSetting", 1963496562);
        setIntField(term171351, term171351.getClass(), "tabSortSetting", -866469192);
        setIntField(term171351, term171351.getClass(), "cardCategorySetting", 681850120);
        setIntField(term171351, term171351.getClass(), "cardSortSetting", -106365496);
        setIntField(term171351, term171351.getClass(), "rivalScoreCategorySetting", -1705194235);
        setIntField(term171351, term171351.getClass(), "playedTutorialBit", -1378662649);
        setIntField(term171351, term171351.getClass(), "firstTutorialCancelNum", -892038297);
        setLongField(term171351, term171351.getClass(), "sumTechHighScore", -5690880664136761489L);
        setLongField(term171351, term171351.getClass(), "sumTechBasicHighScore", -4753867420073453718L);
        setLongField(term171351, term171351.getClass(), "sumTechAdvancedHighScore", 171443579884259369L);
        setLongField(term171351, term171351.getClass(), "sumTechExpertHighScore", -901797601509378536L);
        setLongField(term171351, term171351.getClass(), "sumTechMasterHighScore", -2240986930373678636L);
        setLongField(term171351, term171351.getClass(), "sumTechLunaticHighScore", 2133592839428936035L);
        setLongField(term171351, term171351.getClass(), "sumBattleHighScore", -2418391248513817762L);
        setLongField(term171351, term171351.getClass(), "sumBattleBasicHighScore", -4714635200532185455L);
        setLongField(term171351, term171351.getClass(), "sumBattleAdvancedHighScore", 5833833394744830629L);
        setLongField(term171351, term171351.getClass(), "sumBattleExpertHighScore", -7573479995177479483L);
        setLongField(term171351, term171351.getClass(), "sumBattleMasterHighScore", -2366286768847765151L);
        setLongField(term171351, term171351.getClass(), "sumBattleLunaticHighScore", -5097256644226032512L);
        setField(term171351, term171351.getClass(), "eventWatchedDate", "tNjZpgLeDy");
        setField(term171351, term171351.getClass(), "cmEventWatchedDate", "SchAyMDvff");
        setField(term171351, term171351.getClass(), "firstGameId", "XfpPgyrSZi");
        setField(term171351, term171351.getClass(), "firstRomVersion", "dhflWZXuXy");
        setField(term171351, term171351.getClass(), "firstDataVersion", "jFxoDTlToD");
        setField(term171351, term171351.getClass(), "firstPlayDate", "vAZKFtWauH");
        setField(term171351, term171351.getClass(), "lastGameId", "azvWIHsvKC");
        setField(term171351, term171351.getClass(), "lastRomVersion", "QPLSIucZPA");
        setField(term171351, term171351.getClass(), "lastDataVersion", "mvVbmMYfFm");
        setField(term171351, term171351.getClass(), "compatibleCmVersion", "vLfwVoIFml");
        setField(term171351, term171351.getClass(), "lastPlayDate", "LAPNjSXaif");
        setIntField(term171351, term171351.getClass(), "lastPlaceId", 916168616);
        setField(term171351, term171351.getClass(), "lastPlaceName", "nDIarxqfLP");
        setIntField(term171351, term171351.getClass(), "lastRegionId", -466521355);
        setField(term171351, term171351.getClass(), "lastRegionName", "efNwYWUuSu");
        setIntField(term171351, term171351.getClass(), "lastAllNetId", -1955693211);
        setField(term171351, term171351.getClass(), "lastClientId", "OooIjFKcWU");
        setIntField(term171351, term171351.getClass(), "lastUsedDeckId", -7776274);
        setIntField(term171351, term171351.getClass(), "lastPlayMusicLevel", 261333033);
        setIntField(term171351, term171351.getClass(), "lastEmoneyBrand", 2106793317);
        setField(term171349, term171349.getClass(), "user", term171351);
        setIntField(term171349, term171349.getClass(), "characterId", 1986891073);
        setIntField(term171349, term171349.getClass(), "costumeId", -2061943399);
        setIntField(term171349, term171349.getClass(), "attachmentId", 1790913385);
        setIntField(term171349, term171349.getClass(), "playCount", 115596044);
        setIntField(term171349, term171349.getClass(), "intimateLevel", -2070075342);
        setIntField(term171349, term171349.getClass(), "intimateCount", -546499544);
        setIntField(term171349, term171349.getClass(), "intimateCountRewarded", 546477713);
        setField(term171349, term171349.getClass(), "intimateCountDate", "vDSJcNmSup");
        setBooleanField(term171349, term171349.getClass(), "isNew", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserCharacter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getIntimateCount", argTypes, term171349, args);
    }

};


