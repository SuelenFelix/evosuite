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

public class UserCard_getKaikaDate_174732689813 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term117979;

    public UserCard_getKaikaDate_174732689813() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term117985 = new Long(-88538481937688851L);
        term117979 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserCard"));
        Object term117981 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term117983 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term117999 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term118000 = newInstance(Class.forName("java.time.LocalDate"));
        Object term118004 = newInstance(Class.forName("java.time.LocalTime"));
        Object term118009 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term118010 = newInstance(Class.forName("java.time.LocalDate"));
        Object term118014 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term117979, term117979.getClass(), "id", 2293978650158859539L);
        setLongField(term117981, term117981.getClass(), "id", -3211895931243279160L);
        setLongField(term117983, term117983.getClass(), "id", 3589887434564854802L);
        setField(term117983, term117983.getClass(), "extId", term117985);
        setField(term117983, term117983.getClass(), "luid", "GZygAttIuk");
        setIntField(term118000, term118000.getClass(), "year", 2012);
        setShortField(term118000, term118000.getClass(), "month", (short) 7);
        setShortField(term118000, term118000.getClass(), "day", (short) 23);
        setField(term117999, term117999.getClass(), "date", term118000);
        setByteField(term118004, term118004.getClass(), "hour", (byte) 8);
        setByteField(term118004, term118004.getClass(), "minute", (byte) 33);
        setByteField(term118004, term118004.getClass(), "second", (byte) 50);
        setIntField(term118004, term118004.getClass(), "nano", 663997596);
        setField(term117999, term117999.getClass(), "time", term118004);
        setField(term117983, term117983.getClass(), "registerTime", term117999);
        setIntField(term118010, term118010.getClass(), "year", 2018);
        setShortField(term118010, term118010.getClass(), "month", (short) 5);
        setShortField(term118010, term118010.getClass(), "day", (short) 18);
        setField(term118009, term118009.getClass(), "date", term118010);
        setByteField(term118014, term118014.getClass(), "hour", (byte) 22);
        setByteField(term118014, term118014.getClass(), "minute", (byte) 7);
        setByteField(term118014, term118014.getClass(), "second", (byte) 58);
        setIntField(term118014, term118014.getClass(), "nano", 802311880);
        setField(term118009, term118009.getClass(), "time", term118014);
        setField(term117983, term117983.getClass(), "accessTime", term118009);
        setField(term117981, term117981.getClass(), "card", term117983);
        setField(term117981, term117981.getClass(), "userName", "WSDrFHxHqO");
        setIntField(term117981, term117981.getClass(), "level", 1688150689);
        setIntField(term117981, term117981.getClass(), "reincarnationNum", -1900819498);
        setLongField(term117981, term117981.getClass(), "exp", 3832614676568803980L);
        setLongField(term117981, term117981.getClass(), "point", -9022297844673196614L);
        setLongField(term117981, term117981.getClass(), "totalPoint", -9219229738152044167L);
        setIntField(term117981, term117981.getClass(), "playCount", -1374608663);
        setIntField(term117981, term117981.getClass(), "jewelCount", -1618100560);
        setIntField(term117981, term117981.getClass(), "totalJewelCount", 751804772);
        setIntField(term117981, term117981.getClass(), "medalCount", 1423413334);
        setIntField(term117981, term117981.getClass(), "playerRating", -1579434672);
        setIntField(term117981, term117981.getClass(), "highestRating", 609266606);
        setIntField(term117981, term117981.getClass(), "battlePoint", 1221933023);
        setIntField(term117981, term117981.getClass(), "bestBattlePoint", -216688430);
        setIntField(term117981, term117981.getClass(), "overDamageBattlePoint", 456466881);
        setBooleanField(term117981, term117981.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term117981, term117981.getClass(), "nameplateId", -106998943);
        setIntField(term117981, term117981.getClass(), "trophyId", 1961013692);
        setIntField(term117981, term117981.getClass(), "cardId", -957809597);
        setIntField(term117981, term117981.getClass(), "characterId", 1086125728);
        setIntField(term117981, term117981.getClass(), "characterVoiceNo", 1992510749);
        setIntField(term117981, term117981.getClass(), "tabSetting", -1803247273);
        setIntField(term117981, term117981.getClass(), "tabSortSetting", -1755475707);
        setIntField(term117981, term117981.getClass(), "cardCategorySetting", -1233102871);
        setIntField(term117981, term117981.getClass(), "cardSortSetting", -573135556);
        setIntField(term117981, term117981.getClass(), "rivalScoreCategorySetting", 995946657);
        setIntField(term117981, term117981.getClass(), "playedTutorialBit", -1689684498);
        setIntField(term117981, term117981.getClass(), "firstTutorialCancelNum", -1408160580);
        setLongField(term117981, term117981.getClass(), "sumTechHighScore", -5441503566272414410L);
        setLongField(term117981, term117981.getClass(), "sumTechBasicHighScore", 4469226428781556114L);
        setLongField(term117981, term117981.getClass(), "sumTechAdvancedHighScore", -9201976981313046937L);
        setLongField(term117981, term117981.getClass(), "sumTechExpertHighScore", -3746697811395336378L);
        setLongField(term117981, term117981.getClass(), "sumTechMasterHighScore", 4721016240026367204L);
        setLongField(term117981, term117981.getClass(), "sumTechLunaticHighScore", -6733831402487604203L);
        setLongField(term117981, term117981.getClass(), "sumBattleHighScore", 1643405476807051074L);
        setLongField(term117981, term117981.getClass(), "sumBattleBasicHighScore", 2633886100159321465L);
        setLongField(term117981, term117981.getClass(), "sumBattleAdvancedHighScore", -2199549335846151532L);
        setLongField(term117981, term117981.getClass(), "sumBattleExpertHighScore", -4078270228750639613L);
        setLongField(term117981, term117981.getClass(), "sumBattleMasterHighScore", 9161067875811424821L);
        setLongField(term117981, term117981.getClass(), "sumBattleLunaticHighScore", -582572885387389757L);
        setField(term117981, term117981.getClass(), "eventWatchedDate", "kbdjWUKDix");
        setField(term117981, term117981.getClass(), "cmEventWatchedDate", "jhXmnsQIUw");
        setField(term117981, term117981.getClass(), "firstGameId", "qTRnuuLERk");
        setField(term117981, term117981.getClass(), "firstRomVersion", "ieCQQDUgWu");
        setField(term117981, term117981.getClass(), "firstDataVersion", "tIHHXpuCOh");
        setField(term117981, term117981.getClass(), "firstPlayDate", "oCLpbAHyax");
        setField(term117981, term117981.getClass(), "lastGameId", "nKWQlKSRtt");
        setField(term117981, term117981.getClass(), "lastRomVersion", "PiyYqhsqYA");
        setField(term117981, term117981.getClass(), "lastDataVersion", "awpFkVwkVc");
        setField(term117981, term117981.getClass(), "compatibleCmVersion", "mfjXySIEmZ");
        setField(term117981, term117981.getClass(), "lastPlayDate", "IGtYdNRgoQ");
        setIntField(term117981, term117981.getClass(), "lastPlaceId", -1606951340);
        setField(term117981, term117981.getClass(), "lastPlaceName", "bQNBqTrhUF");
        setIntField(term117981, term117981.getClass(), "lastRegionId", 1066146888);
        setField(term117981, term117981.getClass(), "lastRegionName", "pNNhlLiKcO");
        setIntField(term117981, term117981.getClass(), "lastAllNetId", 409835682);
        setField(term117981, term117981.getClass(), "lastClientId", "hyXBBcBogW");
        setIntField(term117981, term117981.getClass(), "lastUsedDeckId", -2088840932);
        setIntField(term117981, term117981.getClass(), "lastPlayMusicLevel", 1470124459);
        setIntField(term117981, term117981.getClass(), "lastEmoneyBrand", 1708162324);
        setField(term117979, term117979.getClass(), "user", term117981);
        setIntField(term117979, term117979.getClass(), "cardId", -1);
        setIntField(term117979, term117979.getClass(), "digitalStock", 1);
        setIntField(term117979, term117979.getClass(), "analogStock", 686279974);
        setIntField(term117979, term117979.getClass(), "level", 2022250483);
        setIntField(term117979, term117979.getClass(), "maxLevel", 10);
        setIntField(term117979, term117979.getClass(), "exp", 509321963);
        setIntField(term117979, term117979.getClass(), "printCount", -2063187052);
        setIntField(term117979, term117979.getClass(), "useCount", 133581490);
        setBooleanField(term117979, term117979.getClass(), "isNew", true);
        setField(term117979, term117979.getClass(), "kaikaDate", "0000-00-00 00:00:00.0");
        setField(term117979, term117979.getClass(), "choKaikaDate", "0000-00-00 00:00:00.0");
        setIntField(term117979, term117979.getClass(), "skillId", -579671719);
        setBooleanField(term117979, term117979.getClass(), "isAcquired", true);
        setField(term117979, term117979.getClass(), "created", "0000-00-00 00:00:00.0");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserCard");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getKaikaDate", argTypes, term117979, args);
    }

};


