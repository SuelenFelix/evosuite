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

public class UserCharacter_getUser_20749361172 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term108908;

    public UserCharacter_getUser_20749361172() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term108914 = new Long(3288941170644426558L);
        term108908 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserCharacter"));
        Object term108910 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term108912 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term108928 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term108929 = newInstance(Class.forName("java.time.LocalDate"));
        Object term108933 = newInstance(Class.forName("java.time.LocalTime"));
        Object term108938 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term108939 = newInstance(Class.forName("java.time.LocalDate"));
        Object term108943 = newInstance(Class.forName("java.time.LocalTime"));
        Object term108960 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term108961 = newInstance(Class.forName("java.time.LocalDate"));
        Object term108965 = newInstance(Class.forName("java.time.LocalTime"));
        Object term109021 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term109022 = newInstance(Class.forName("java.time.LocalDate"));
        Object term109026 = newInstance(Class.forName("java.time.LocalTime"));
        Object term109069 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term109070 = newInstance(Class.forName("java.time.LocalDate"));
        Object term109074 = newInstance(Class.forName("java.time.LocalTime"));
        Object term109115 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term109116 = newInstance(Class.forName("java.time.LocalDate"));
        Object term109120 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term108908, term108908.getClass(), "id", -5948221629490346744L);
        setLongField(term108910, term108910.getClass(), "id", 2627983048324581551L);
        setLongField(term108912, term108912.getClass(), "id", -4490723442670837407L);
        setField(term108912, term108912.getClass(), "extId", term108914);
        setField(term108912, term108912.getClass(), "luid", "UasONzOTXn");
        setIntField(term108929, term108929.getClass(), "year", 2011);
        setShortField(term108929, term108929.getClass(), "month", (short) 12);
        setShortField(term108929, term108929.getClass(), "day", (short) 15);
        setField(term108928, term108928.getClass(), "date", term108929);
        setByteField(term108933, term108933.getClass(), "hour", (byte) 12);
        setByteField(term108933, term108933.getClass(), "minute", (byte) 11);
        setByteField(term108933, term108933.getClass(), "second", (byte) 32);
        setIntField(term108933, term108933.getClass(), "nano", 144358710);
        setField(term108928, term108928.getClass(), "time", term108933);
        setField(term108912, term108912.getClass(), "registerTime", term108928);
        setIntField(term108939, term108939.getClass(), "year", 2012);
        setShortField(term108939, term108939.getClass(), "month", (short) 9);
        setShortField(term108939, term108939.getClass(), "day", (short) 16);
        setField(term108938, term108938.getClass(), "date", term108939);
        setByteField(term108943, term108943.getClass(), "hour", (byte) 17);
        setByteField(term108943, term108943.getClass(), "minute", (byte) 56);
        setByteField(term108943, term108943.getClass(), "second", (byte) 20);
        setIntField(term108943, term108943.getClass(), "nano", 87689227);
        setField(term108938, term108938.getClass(), "time", term108943);
        setField(term108912, term108912.getClass(), "accessTime", term108938);
        setField(term108910, term108910.getClass(), "card", term108912);
        setField(term108910, term108910.getClass(), "userName", "gRkWWojcfo");
        setIntField(term108961, term108961.getClass(), "year", 2011);
        setShortField(term108961, term108961.getClass(), "month", (short) 12);
        setShortField(term108961, term108961.getClass(), "day", (short) 20);
        setField(term108960, term108960.getClass(), "date", term108961);
        setByteField(term108965, term108965.getClass(), "hour", (byte) 19);
        setByteField(term108965, term108965.getClass(), "minute", (byte) 23);
        setByteField(term108965, term108965.getClass(), "second", (byte) 21);
        setIntField(term108965, term108965.getClass(), "nano", 283781067);
        setField(term108960, term108960.getClass(), "time", term108965);
        setField(term108910, term108910.getClass(), "lastLoginDate", term108960);
        setBooleanField(term108910, term108910.getClass(), "isWebJoin", true);
        setField(term108910, term108910.getClass(), "webLimitDate", "FHujUNXIxu");
        setIntField(term108910, term108910.getClass(), "level", 1217456071);
        setIntField(term108910, term108910.getClass(), "reincarnationNum", 651030320);
        setField(term108910, term108910.getClass(), "exp", "OMWsPUFcoJ");
        setLongField(term108910, term108910.getClass(), "point", 6625707209740450857L);
        setLongField(term108910, term108910.getClass(), "totalPoint", 5760483545030857520L);
        setIntField(term108910, term108910.getClass(), "playCount", -1538279121);
        setIntField(term108910, term108910.getClass(), "multiPlayCount", -64171030);
        setIntField(term108910, term108910.getClass(), "multiWinCount", -1799451766);
        setIntField(term108910, term108910.getClass(), "requestResCount", -1576640496);
        setIntField(term108910, term108910.getClass(), "acceptResCount", 12609042);
        setIntField(term108910, term108910.getClass(), "successResCount", -184191841);
        setIntField(term108910, term108910.getClass(), "playerRating", -238927593);
        setIntField(term108910, term108910.getClass(), "highestRating", -2130505195);
        setIntField(term108910, term108910.getClass(), "nameplateId", 80166636);
        setIntField(term108910, term108910.getClass(), "frameId", -142617740);
        setIntField(term108910, term108910.getClass(), "characterId", 1932617639);
        setIntField(term108910, term108910.getClass(), "trophyId", -102676348);
        setIntField(term108910, term108910.getClass(), "playedTutorialBit", -438825744);
        setIntField(term108910, term108910.getClass(), "firstTutorialCancelNum", -182534382);
        setIntField(term108910, term108910.getClass(), "masterTutorialCancelNum", 375976050);
        setIntField(term108910, term108910.getClass(), "totalRepertoireCount", -1932003593);
        setIntField(term108910, term108910.getClass(), "totalMapNum", 1475174061);
        setLongField(term108910, term108910.getClass(), "totalHiScore", -3208114130046571707L);
        setLongField(term108910, term108910.getClass(), "totalBasicHighScore", -8287536218807948751L);
        setLongField(term108910, term108910.getClass(), "totalAdvancedHighScore", -6474751610534417563L);
        setLongField(term108910, term108910.getClass(), "totalExpertHighScore", -6514211337869837684L);
        setLongField(term108910, term108910.getClass(), "totalMasterHighScore", -4691514781327472641L);
        setIntField(term109022, term109022.getClass(), "year", 2026);
        setShortField(term109022, term109022.getClass(), "month", (short) 2);
        setShortField(term109022, term109022.getClass(), "day", (short) 15);
        setField(term109021, term109021.getClass(), "date", term109022);
        setByteField(term109026, term109026.getClass(), "hour", (byte) 8);
        setByteField(term109026, term109026.getClass(), "minute", (byte) 30);
        setByteField(term109026, term109026.getClass(), "second", (byte) 47);
        setIntField(term109026, term109026.getClass(), "nano", 206898289);
        setField(term109021, term109021.getClass(), "time", term109026);
        setField(term108910, term108910.getClass(), "eventWatchedDate", term109021);
        setIntField(term108910, term108910.getClass(), "friendCount", -1586912461);
        setBooleanField(term108910, term108910.getClass(), "isMaimai", false);
        setField(term108910, term108910.getClass(), "firstGameId", "oWooJBZOyh");
        setField(term108910, term108910.getClass(), "firstRomVersion", "iNnWLGJCBN");
        setField(term108910, term108910.getClass(), "firstDataVersion", "jYJrGEVHCD");
        setIntField(term109070, term109070.getClass(), "year", 2010);
        setShortField(term109070, term109070.getClass(), "month", (short) 11);
        setShortField(term109070, term109070.getClass(), "day", (short) 10);
        setField(term109069, term109069.getClass(), "date", term109070);
        setByteField(term109074, term109074.getClass(), "hour", (byte) 17);
        setByteField(term109074, term109074.getClass(), "minute", (byte) 50);
        setByteField(term109074, term109074.getClass(), "second", (byte) 49);
        setIntField(term109074, term109074.getClass(), "nano", 742462177);
        setField(term109069, term109069.getClass(), "time", term109074);
        setField(term108910, term108910.getClass(), "firstPlayDate", term109069);
        setField(term108910, term108910.getClass(), "lastGameId", "wlBPkhpzWH");
        setField(term108910, term108910.getClass(), "lastRomVersion", "aBZsgezjug");
        setField(term108910, term108910.getClass(), "lastDataVersion", "hvlXhuKNfP");
        setIntField(term109116, term109116.getClass(), "year", 2023);
        setShortField(term109116, term109116.getClass(), "month", (short) 1);
        setShortField(term109116, term109116.getClass(), "day", (short) 20);
        setField(term109115, term109115.getClass(), "date", term109116);
        setByteField(term109120, term109120.getClass(), "hour", (byte) 17);
        setByteField(term109120, term109120.getClass(), "minute", (byte) 32);
        setByteField(term109120, term109120.getClass(), "second", (byte) 59);
        setIntField(term109120, term109120.getClass(), "nano", 187414621);
        setField(term109115, term109115.getClass(), "time", term109120);
        setField(term108910, term108910.getClass(), "lastPlayDate", term109115);
        setIntField(term108910, term108910.getClass(), "lastPlaceId", -25528003);
        setField(term108910, term108910.getClass(), "lastPlaceName", "csdpRGUrjJ");
        setField(term108910, term108910.getClass(), "lastRegionId", "FtOpFdJBak");
        setField(term108910, term108910.getClass(), "lastRegionName", "mqiIwoVVkU");
        setField(term108910, term108910.getClass(), "lastAllNetId", "LYcLrQMkAA");
        setField(term108910, term108910.getClass(), "lastClientId", "XhbGnImmgd");
        setField(term108908, term108908.getClass(), "user", term108910);
        setIntField(term108908, term108908.getClass(), "characterId", 1719470688);
        setIntField(term108908, term108908.getClass(), "playCount", 1817327304);
        setIntField(term108908, term108908.getClass(), "level", 1);
        setIntField(term108908, term108908.getClass(), "skillId", -1498307773);
        setIntField(term108908, term108908.getClass(), "friendshipExp", -919077833);
        setBooleanField(term108908, term108908.getClass(), "isValid", true);
        setBooleanField(term108908, term108908.getClass(), "isNewMark", true);
        setIntField(term108908, term108908.getClass(), "param1", 86490701);
        setIntField(term108908, term108908.getClass(), "param2", -406097429);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserCharacter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUser", argTypes, term108908, args);
    }

};


