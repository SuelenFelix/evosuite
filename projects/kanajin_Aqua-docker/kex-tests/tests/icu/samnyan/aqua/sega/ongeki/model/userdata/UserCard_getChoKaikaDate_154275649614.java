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

public class UserCard_getChoKaikaDate_154275649614 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term118547;

    public UserCard_getChoKaikaDate_154275649614() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term118553 = new Long(4069264186851023313L);
        term118547 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserCard"));
        Object term118549 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term118551 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term118567 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term118568 = newInstance(Class.forName("java.time.LocalDate"));
        Object term118572 = newInstance(Class.forName("java.time.LocalTime"));
        Object term118577 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term118578 = newInstance(Class.forName("java.time.LocalDate"));
        Object term118582 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term118547, term118547.getClass(), "id", -290834134358456380L);
        setLongField(term118549, term118549.getClass(), "id", 8577245396068175597L);
        setLongField(term118551, term118551.getClass(), "id", -3585460109412323473L);
        setField(term118551, term118551.getClass(), "extId", term118553);
        setField(term118551, term118551.getClass(), "luid", "ZkdrWdXgOr");
        setIntField(term118568, term118568.getClass(), "year", 2012);
        setShortField(term118568, term118568.getClass(), "month", (short) 12);
        setShortField(term118568, term118568.getClass(), "day", (short) 5);
        setField(term118567, term118567.getClass(), "date", term118568);
        setByteField(term118572, term118572.getClass(), "hour", (byte) 23);
        setByteField(term118572, term118572.getClass(), "minute", (byte) 26);
        setByteField(term118572, term118572.getClass(), "second", (byte) 26);
        setIntField(term118572, term118572.getClass(), "nano", 226998623);
        setField(term118567, term118567.getClass(), "time", term118572);
        setField(term118551, term118551.getClass(), "registerTime", term118567);
        setIntField(term118578, term118578.getClass(), "year", 2020);
        setShortField(term118578, term118578.getClass(), "month", (short) 4);
        setShortField(term118578, term118578.getClass(), "day", (short) 20);
        setField(term118577, term118577.getClass(), "date", term118578);
        setByteField(term118582, term118582.getClass(), "hour", (byte) 6);
        setByteField(term118582, term118582.getClass(), "minute", (byte) 10);
        setByteField(term118582, term118582.getClass(), "second", (byte) 52);
        setIntField(term118582, term118582.getClass(), "nano", 872227966);
        setField(term118577, term118577.getClass(), "time", term118582);
        setField(term118551, term118551.getClass(), "accessTime", term118577);
        setField(term118549, term118549.getClass(), "card", term118551);
        setField(term118549, term118549.getClass(), "userName", "MaBKpYpsjS");
        setIntField(term118549, term118549.getClass(), "level", -1915340015);
        setIntField(term118549, term118549.getClass(), "reincarnationNum", -600241671);
        setLongField(term118549, term118549.getClass(), "exp", 5755635274828361656L);
        setLongField(term118549, term118549.getClass(), "point", 2910693334335298676L);
        setLongField(term118549, term118549.getClass(), "totalPoint", 8755288460008217225L);
        setIntField(term118549, term118549.getClass(), "playCount", -1229610550);
        setIntField(term118549, term118549.getClass(), "jewelCount", 493486357);
        setIntField(term118549, term118549.getClass(), "totalJewelCount", 329514667);
        setIntField(term118549, term118549.getClass(), "medalCount", 1579294785);
        setIntField(term118549, term118549.getClass(), "playerRating", 41910159);
        setIntField(term118549, term118549.getClass(), "highestRating", 2144178531);
        setIntField(term118549, term118549.getClass(), "battlePoint", -1853902014);
        setIntField(term118549, term118549.getClass(), "bestBattlePoint", 1694299799);
        setIntField(term118549, term118549.getClass(), "overDamageBattlePoint", -1172188590);
        setBooleanField(term118549, term118549.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term118549, term118549.getClass(), "nameplateId", 1811271159);
        setIntField(term118549, term118549.getClass(), "trophyId", 534169620);
        setIntField(term118549, term118549.getClass(), "cardId", 1011698169);
        setIntField(term118549, term118549.getClass(), "characterId", -1031068823);
        setIntField(term118549, term118549.getClass(), "characterVoiceNo", -1229282495);
        setIntField(term118549, term118549.getClass(), "tabSetting", 58488326);
        setIntField(term118549, term118549.getClass(), "tabSortSetting", -1178011877);
        setIntField(term118549, term118549.getClass(), "cardCategorySetting", 1744976454);
        setIntField(term118549, term118549.getClass(), "cardSortSetting", -501735949);
        setIntField(term118549, term118549.getClass(), "rivalScoreCategorySetting", 1633315544);
        setIntField(term118549, term118549.getClass(), "playedTutorialBit", 1699846026);
        setIntField(term118549, term118549.getClass(), "firstTutorialCancelNum", -1144234812);
        setLongField(term118549, term118549.getClass(), "sumTechHighScore", 2493585568664728037L);
        setLongField(term118549, term118549.getClass(), "sumTechBasicHighScore", -6843345036415016112L);
        setLongField(term118549, term118549.getClass(), "sumTechAdvancedHighScore", -8536264410511389781L);
        setLongField(term118549, term118549.getClass(), "sumTechExpertHighScore", 2278753731601146162L);
        setLongField(term118549, term118549.getClass(), "sumTechMasterHighScore", -437841662957220916L);
        setLongField(term118549, term118549.getClass(), "sumTechLunaticHighScore", 6551035127004284776L);
        setLongField(term118549, term118549.getClass(), "sumBattleHighScore", 2466322345106159600L);
        setLongField(term118549, term118549.getClass(), "sumBattleBasicHighScore", -8623104319921854362L);
        setLongField(term118549, term118549.getClass(), "sumBattleAdvancedHighScore", 7573781195243219744L);
        setLongField(term118549, term118549.getClass(), "sumBattleExpertHighScore", 4940171539291834175L);
        setLongField(term118549, term118549.getClass(), "sumBattleMasterHighScore", 4816320856471117777L);
        setLongField(term118549, term118549.getClass(), "sumBattleLunaticHighScore", -7314994900652238009L);
        setField(term118549, term118549.getClass(), "eventWatchedDate", "kojhIAlLyo");
        setField(term118549, term118549.getClass(), "cmEventWatchedDate", "qbdOdimzOh");
        setField(term118549, term118549.getClass(), "firstGameId", "DMjvFejbDc");
        setField(term118549, term118549.getClass(), "firstRomVersion", "LsszPdpMvX");
        setField(term118549, term118549.getClass(), "firstDataVersion", "YJYOluXjkb");
        setField(term118549, term118549.getClass(), "firstPlayDate", "NRsURcfaWn");
        setField(term118549, term118549.getClass(), "lastGameId", "ykYKNlqHwA");
        setField(term118549, term118549.getClass(), "lastRomVersion", "CaYUiktPks");
        setField(term118549, term118549.getClass(), "lastDataVersion", "xSNRqymNqF");
        setField(term118549, term118549.getClass(), "compatibleCmVersion", "rswcpmelQS");
        setField(term118549, term118549.getClass(), "lastPlayDate", "OyCqSonMpX");
        setIntField(term118549, term118549.getClass(), "lastPlaceId", -2144123201);
        setField(term118549, term118549.getClass(), "lastPlaceName", "iUUqZhloeC");
        setIntField(term118549, term118549.getClass(), "lastRegionId", 1436840858);
        setField(term118549, term118549.getClass(), "lastRegionName", "HGSlDwqOUA");
        setIntField(term118549, term118549.getClass(), "lastAllNetId", -2146939628);
        setField(term118549, term118549.getClass(), "lastClientId", "snPorJFlwz");
        setIntField(term118549, term118549.getClass(), "lastUsedDeckId", -1735999292);
        setIntField(term118549, term118549.getClass(), "lastPlayMusicLevel", 1978300005);
        setIntField(term118549, term118549.getClass(), "lastEmoneyBrand", -495461794);
        setField(term118547, term118547.getClass(), "user", term118549);
        setIntField(term118547, term118547.getClass(), "cardId", -1);
        setIntField(term118547, term118547.getClass(), "digitalStock", 1);
        setIntField(term118547, term118547.getClass(), "analogStock", 1179148135);
        setIntField(term118547, term118547.getClass(), "level", 1856832248);
        setIntField(term118547, term118547.getClass(), "maxLevel", 10);
        setIntField(term118547, term118547.getClass(), "exp", 1112040940);
        setIntField(term118547, term118547.getClass(), "printCount", -1289327826);
        setIntField(term118547, term118547.getClass(), "useCount", -1510240264);
        setBooleanField(term118547, term118547.getClass(), "isNew", true);
        setField(term118547, term118547.getClass(), "kaikaDate", "0000-00-00 00:00:00.0");
        setField(term118547, term118547.getClass(), "choKaikaDate", "0000-00-00 00:00:00.0");
        setIntField(term118547, term118547.getClass(), "skillId", -1206929666);
        setBooleanField(term118547, term118547.getClass(), "isAcquired", true);
        setField(term118547, term118547.getClass(), "created", "0000-00-00 00:00:00.0");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserCard");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getChoKaikaDate", argTypes, term118547, args);
    }

};


