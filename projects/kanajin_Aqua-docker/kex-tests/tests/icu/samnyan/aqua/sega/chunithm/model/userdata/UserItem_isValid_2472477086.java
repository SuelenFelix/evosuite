package icu.samnyan.aqua.sega.chunithm.model.userdata;

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
import static icu.samnyan.aqua.sega.chunithm.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;

public class UserItem_isValid_2472477086 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term123639;

    public UserItem_isValid_2472477086() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term123645 = new Long(1253549421411622358L);
        term123639 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserItem"));
        Object term123641 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term123643 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term123659 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term123660 = newInstance(Class.forName("java.time.LocalDate"));
        Object term123664 = newInstance(Class.forName("java.time.LocalTime"));
        Object term123669 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term123670 = newInstance(Class.forName("java.time.LocalDate"));
        Object term123674 = newInstance(Class.forName("java.time.LocalTime"));
        Object term123691 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term123692 = newInstance(Class.forName("java.time.LocalDate"));
        Object term123696 = newInstance(Class.forName("java.time.LocalTime"));
        Object term123752 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term123753 = newInstance(Class.forName("java.time.LocalDate"));
        Object term123757 = newInstance(Class.forName("java.time.LocalTime"));
        Object term123800 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term123801 = newInstance(Class.forName("java.time.LocalDate"));
        Object term123805 = newInstance(Class.forName("java.time.LocalTime"));
        Object term123846 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term123847 = newInstance(Class.forName("java.time.LocalDate"));
        Object term123851 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term123639, term123639.getClass(), "id", -3485196582845968771L);
        setLongField(term123641, term123641.getClass(), "id", -5312023077883044689L);
        setLongField(term123643, term123643.getClass(), "id", 3628199752798604009L);
        setField(term123643, term123643.getClass(), "extId", term123645);
        setField(term123643, term123643.getClass(), "luid", "OqSicVymRV");
        setIntField(term123660, term123660.getClass(), "year", 2014);
        setShortField(term123660, term123660.getClass(), "month", (short) 4);
        setShortField(term123660, term123660.getClass(), "day", (short) 14);
        setField(term123659, term123659.getClass(), "date", term123660);
        setByteField(term123664, term123664.getClass(), "hour", (byte) 3);
        setByteField(term123664, term123664.getClass(), "minute", (byte) 45);
        setByteField(term123664, term123664.getClass(), "second", (byte) 11);
        setIntField(term123664, term123664.getClass(), "nano", 613551326);
        setField(term123659, term123659.getClass(), "time", term123664);
        setField(term123643, term123643.getClass(), "registerTime", term123659);
        setIntField(term123670, term123670.getClass(), "year", 2012);
        setShortField(term123670, term123670.getClass(), "month", (short) 10);
        setShortField(term123670, term123670.getClass(), "day", (short) 6);
        setField(term123669, term123669.getClass(), "date", term123670);
        setByteField(term123674, term123674.getClass(), "hour", (byte) 1);
        setByteField(term123674, term123674.getClass(), "minute", (byte) 53);
        setByteField(term123674, term123674.getClass(), "second", (byte) 43);
        setIntField(term123674, term123674.getClass(), "nano", 662627574);
        setField(term123669, term123669.getClass(), "time", term123674);
        setField(term123643, term123643.getClass(), "accessTime", term123669);
        setField(term123641, term123641.getClass(), "card", term123643);
        setField(term123641, term123641.getClass(), "userName", "wiCYSRXKPQ");
        setIntField(term123692, term123692.getClass(), "year", 2012);
        setShortField(term123692, term123692.getClass(), "month", (short) 5);
        setShortField(term123692, term123692.getClass(), "day", (short) 11);
        setField(term123691, term123691.getClass(), "date", term123692);
        setByteField(term123696, term123696.getClass(), "hour", (byte) 0);
        setByteField(term123696, term123696.getClass(), "minute", (byte) 25);
        setByteField(term123696, term123696.getClass(), "second", (byte) 40);
        setIntField(term123696, term123696.getClass(), "nano", 417312645);
        setField(term123691, term123691.getClass(), "time", term123696);
        setField(term123641, term123641.getClass(), "lastLoginDate", term123691);
        setBooleanField(term123641, term123641.getClass(), "isWebJoin", false);
        setField(term123641, term123641.getClass(), "webLimitDate", "pZsKceaypG");
        setIntField(term123641, term123641.getClass(), "level", -88552248);
        setIntField(term123641, term123641.getClass(), "reincarnationNum", 835835802);
        setField(term123641, term123641.getClass(), "exp", "XZfWiBghln");
        setLongField(term123641, term123641.getClass(), "point", -76742459051684573L);
        setLongField(term123641, term123641.getClass(), "totalPoint", -480849831745649018L);
        setIntField(term123641, term123641.getClass(), "playCount", 148923410);
        setIntField(term123641, term123641.getClass(), "multiPlayCount", 892350142);
        setIntField(term123641, term123641.getClass(), "multiWinCount", 97847948);
        setIntField(term123641, term123641.getClass(), "requestResCount", -2100667414);
        setIntField(term123641, term123641.getClass(), "acceptResCount", -1770304070);
        setIntField(term123641, term123641.getClass(), "successResCount", -2146519194);
        setIntField(term123641, term123641.getClass(), "playerRating", 314235257);
        setIntField(term123641, term123641.getClass(), "highestRating", -1266948778);
        setIntField(term123641, term123641.getClass(), "nameplateId", 944749878);
        setIntField(term123641, term123641.getClass(), "frameId", 1040572866);
        setIntField(term123641, term123641.getClass(), "characterId", 206565778);
        setIntField(term123641, term123641.getClass(), "trophyId", -2142502223);
        setIntField(term123641, term123641.getClass(), "playedTutorialBit", -1920747929);
        setIntField(term123641, term123641.getClass(), "firstTutorialCancelNum", -872346063);
        setIntField(term123641, term123641.getClass(), "masterTutorialCancelNum", -15980730);
        setIntField(term123641, term123641.getClass(), "totalRepertoireCount", 1099197250);
        setIntField(term123641, term123641.getClass(), "totalMapNum", -576768796);
        setLongField(term123641, term123641.getClass(), "totalHiScore", 2663952840595678383L);
        setLongField(term123641, term123641.getClass(), "totalBasicHighScore", -5909178556872079483L);
        setLongField(term123641, term123641.getClass(), "totalAdvancedHighScore", 6482532353438050098L);
        setLongField(term123641, term123641.getClass(), "totalExpertHighScore", -6626335919437093314L);
        setLongField(term123641, term123641.getClass(), "totalMasterHighScore", 557973204177777642L);
        setIntField(term123753, term123753.getClass(), "year", 2026);
        setShortField(term123753, term123753.getClass(), "month", (short) 1);
        setShortField(term123753, term123753.getClass(), "day", (short) 28);
        setField(term123752, term123752.getClass(), "date", term123753);
        setByteField(term123757, term123757.getClass(), "hour", (byte) 8);
        setByteField(term123757, term123757.getClass(), "minute", (byte) 24);
        setByteField(term123757, term123757.getClass(), "second", (byte) 10);
        setIntField(term123757, term123757.getClass(), "nano", 782731715);
        setField(term123752, term123752.getClass(), "time", term123757);
        setField(term123641, term123641.getClass(), "eventWatchedDate", term123752);
        setIntField(term123641, term123641.getClass(), "friendCount", -1567842300);
        setBooleanField(term123641, term123641.getClass(), "isMaimai", false);
        setField(term123641, term123641.getClass(), "firstGameId", "mzCiczKZrz");
        setField(term123641, term123641.getClass(), "firstRomVersion", "KHTorTPpue");
        setField(term123641, term123641.getClass(), "firstDataVersion", "UZGFzJfIBQ");
        setIntField(term123801, term123801.getClass(), "year", 2022);
        setShortField(term123801, term123801.getClass(), "month", (short) 10);
        setShortField(term123801, term123801.getClass(), "day", (short) 7);
        setField(term123800, term123800.getClass(), "date", term123801);
        setByteField(term123805, term123805.getClass(), "hour", (byte) 20);
        setByteField(term123805, term123805.getClass(), "minute", (byte) 29);
        setByteField(term123805, term123805.getClass(), "second", (byte) 17);
        setIntField(term123805, term123805.getClass(), "nano", 860585295);
        setField(term123800, term123800.getClass(), "time", term123805);
        setField(term123641, term123641.getClass(), "firstPlayDate", term123800);
        setField(term123641, term123641.getClass(), "lastGameId", "HVZdePgPWv");
        setField(term123641, term123641.getClass(), "lastRomVersion", "VhpcclRPZX");
        setField(term123641, term123641.getClass(), "lastDataVersion", "jecnsmPrVs");
        setIntField(term123847, term123847.getClass(), "year", 2011);
        setShortField(term123847, term123847.getClass(), "month", (short) 4);
        setShortField(term123847, term123847.getClass(), "day", (short) 8);
        setField(term123846, term123846.getClass(), "date", term123847);
        setByteField(term123851, term123851.getClass(), "hour", (byte) 9);
        setByteField(term123851, term123851.getClass(), "minute", (byte) 48);
        setByteField(term123851, term123851.getClass(), "second", (byte) 12);
        setIntField(term123851, term123851.getClass(), "nano", 273623249);
        setField(term123846, term123846.getClass(), "time", term123851);
        setField(term123641, term123641.getClass(), "lastPlayDate", term123846);
        setIntField(term123641, term123641.getClass(), "lastPlaceId", 1297816597);
        setField(term123641, term123641.getClass(), "lastPlaceName", "QkdgrEdqYo");
        setField(term123641, term123641.getClass(), "lastRegionId", "oqAIcYaMFy");
        setField(term123641, term123641.getClass(), "lastRegionName", "eMJZEUCuiE");
        setField(term123641, term123641.getClass(), "lastAllNetId", "psNXkIHjLW");
        setField(term123641, term123641.getClass(), "lastClientId", "DeWUQxbivp");
        setField(term123639, term123639.getClass(), "user", term123641);
        setIntField(term123639, term123639.getClass(), "itemKind", 382635155);
        setIntField(term123639, term123639.getClass(), "itemId", -217839806);
        setIntField(term123639, term123639.getClass(), "stock", 1);
        setBooleanField(term123639, term123639.getClass(), "isValid", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserItem");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isValid", argTypes, term123639, args);
    }

};


