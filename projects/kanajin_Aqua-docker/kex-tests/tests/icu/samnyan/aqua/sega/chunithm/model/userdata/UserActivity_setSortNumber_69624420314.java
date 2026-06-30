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
import java.lang.Integer;

public class UserActivity_setSortNumber_69624420314 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term297920;
     Object term298205;

    public UserActivity_setSortNumber_69624420314() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term297926 = new Long(-823085399570394644L);
        term297920 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserActivity"));
        Object term297922 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term297924 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term297940 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term297941 = newInstance(Class.forName("java.time.LocalDate"));
        Object term297945 = newInstance(Class.forName("java.time.LocalTime"));
        Object term297950 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term297951 = newInstance(Class.forName("java.time.LocalDate"));
        Object term297955 = newInstance(Class.forName("java.time.LocalTime"));
        Object term297972 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term297973 = newInstance(Class.forName("java.time.LocalDate"));
        Object term297977 = newInstance(Class.forName("java.time.LocalTime"));
        Object term298033 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term298034 = newInstance(Class.forName("java.time.LocalDate"));
        Object term298038 = newInstance(Class.forName("java.time.LocalTime"));
        Object term298081 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term298082 = newInstance(Class.forName("java.time.LocalDate"));
        Object term298086 = newInstance(Class.forName("java.time.LocalTime"));
        Object term298127 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term298128 = newInstance(Class.forName("java.time.LocalDate"));
        Object term298132 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term297920, term297920.getClass(), "id", -8997711710645180964L);
        setLongField(term297922, term297922.getClass(), "id", -8713996910880132871L);
        setLongField(term297924, term297924.getClass(), "id", 6959832148690893218L);
        setField(term297924, term297924.getClass(), "extId", term297926);
        setField(term297924, term297924.getClass(), "luid", "AcpKKvffPO");
        setIntField(term297941, term297941.getClass(), "year", 2021);
        setShortField(term297941, term297941.getClass(), "month", (short) 10);
        setShortField(term297941, term297941.getClass(), "day", (short) 29);
        setField(term297940, term297940.getClass(), "date", term297941);
        setByteField(term297945, term297945.getClass(), "hour", (byte) 11);
        setByteField(term297945, term297945.getClass(), "minute", (byte) 52);
        setByteField(term297945, term297945.getClass(), "second", (byte) 19);
        setIntField(term297945, term297945.getClass(), "nano", 621303082);
        setField(term297940, term297940.getClass(), "time", term297945);
        setField(term297924, term297924.getClass(), "registerTime", term297940);
        setIntField(term297951, term297951.getClass(), "year", 2028);
        setShortField(term297951, term297951.getClass(), "month", (short) 3);
        setShortField(term297951, term297951.getClass(), "day", (short) 19);
        setField(term297950, term297950.getClass(), "date", term297951);
        setByteField(term297955, term297955.getClass(), "hour", (byte) 6);
        setByteField(term297955, term297955.getClass(), "minute", (byte) 8);
        setByteField(term297955, term297955.getClass(), "second", (byte) 54);
        setIntField(term297955, term297955.getClass(), "nano", 25042144);
        setField(term297950, term297950.getClass(), "time", term297955);
        setField(term297924, term297924.getClass(), "accessTime", term297950);
        setField(term297922, term297922.getClass(), "card", term297924);
        setField(term297922, term297922.getClass(), "userName", "nxXgwkBjIn");
        setIntField(term297973, term297973.getClass(), "year", 2012);
        setShortField(term297973, term297973.getClass(), "month", (short) 10);
        setShortField(term297973, term297973.getClass(), "day", (short) 14);
        setField(term297972, term297972.getClass(), "date", term297973);
        setByteField(term297977, term297977.getClass(), "hour", (byte) 12);
        setByteField(term297977, term297977.getClass(), "minute", (byte) 10);
        setByteField(term297977, term297977.getClass(), "second", (byte) 46);
        setIntField(term297977, term297977.getClass(), "nano", 966631708);
        setField(term297972, term297972.getClass(), "time", term297977);
        setField(term297922, term297922.getClass(), "lastLoginDate", term297972);
        setBooleanField(term297922, term297922.getClass(), "isWebJoin", true);
        setField(term297922, term297922.getClass(), "webLimitDate", "BlUKdVLBNm");
        setIntField(term297922, term297922.getClass(), "level", 1940738905);
        setIntField(term297922, term297922.getClass(), "reincarnationNum", 351961548);
        setField(term297922, term297922.getClass(), "exp", "CldhEgXvQf");
        setLongField(term297922, term297922.getClass(), "point", 9054174532870356727L);
        setLongField(term297922, term297922.getClass(), "totalPoint", -8406317975085380712L);
        setIntField(term297922, term297922.getClass(), "playCount", 1827213743);
        setIntField(term297922, term297922.getClass(), "multiPlayCount", 342376736);
        setIntField(term297922, term297922.getClass(), "multiWinCount", 385187012);
        setIntField(term297922, term297922.getClass(), "requestResCount", 1711124007);
        setIntField(term297922, term297922.getClass(), "acceptResCount", -259263754);
        setIntField(term297922, term297922.getClass(), "successResCount", -544100653);
        setIntField(term297922, term297922.getClass(), "playerRating", -1003987169);
        setIntField(term297922, term297922.getClass(), "highestRating", -712530596);
        setIntField(term297922, term297922.getClass(), "nameplateId", 1421637009);
        setIntField(term297922, term297922.getClass(), "frameId", 1360807458);
        setIntField(term297922, term297922.getClass(), "characterId", -317598611);
        setIntField(term297922, term297922.getClass(), "trophyId", -1206911737);
        setIntField(term297922, term297922.getClass(), "playedTutorialBit", -265778643);
        setIntField(term297922, term297922.getClass(), "firstTutorialCancelNum", 1311510289);
        setIntField(term297922, term297922.getClass(), "masterTutorialCancelNum", 377078676);
        setIntField(term297922, term297922.getClass(), "totalRepertoireCount", -1162238383);
        setIntField(term297922, term297922.getClass(), "totalMapNum", 1991797348);
        setLongField(term297922, term297922.getClass(), "totalHiScore", 5138173289133094895L);
        setLongField(term297922, term297922.getClass(), "totalBasicHighScore", -8603569983034188953L);
        setLongField(term297922, term297922.getClass(), "totalAdvancedHighScore", 1673910834994391163L);
        setLongField(term297922, term297922.getClass(), "totalExpertHighScore", 6420416810130314697L);
        setLongField(term297922, term297922.getClass(), "totalMasterHighScore", -1949964620904962419L);
        setIntField(term298034, term298034.getClass(), "year", 2010);
        setShortField(term298034, term298034.getClass(), "month", (short) 5);
        setShortField(term298034, term298034.getClass(), "day", (short) 27);
        setField(term298033, term298033.getClass(), "date", term298034);
        setByteField(term298038, term298038.getClass(), "hour", (byte) 21);
        setByteField(term298038, term298038.getClass(), "minute", (byte) 58);
        setByteField(term298038, term298038.getClass(), "second", (byte) 52);
        setIntField(term298038, term298038.getClass(), "nano", 189777614);
        setField(term298033, term298033.getClass(), "time", term298038);
        setField(term297922, term297922.getClass(), "eventWatchedDate", term298033);
        setIntField(term297922, term297922.getClass(), "friendCount", -1606878866);
        setBooleanField(term297922, term297922.getClass(), "isMaimai", false);
        setField(term297922, term297922.getClass(), "firstGameId", "WgctHDcsib");
        setField(term297922, term297922.getClass(), "firstRomVersion", "gIhnDwhYPA");
        setField(term297922, term297922.getClass(), "firstDataVersion", "CHKxCaDYeL");
        setIntField(term298082, term298082.getClass(), "year", 2025);
        setShortField(term298082, term298082.getClass(), "month", (short) 12);
        setShortField(term298082, term298082.getClass(), "day", (short) 11);
        setField(term298081, term298081.getClass(), "date", term298082);
        setByteField(term298086, term298086.getClass(), "hour", (byte) 13);
        setByteField(term298086, term298086.getClass(), "minute", (byte) 27);
        setByteField(term298086, term298086.getClass(), "second", (byte) 42);
        setIntField(term298086, term298086.getClass(), "nano", 320045871);
        setField(term298081, term298081.getClass(), "time", term298086);
        setField(term297922, term297922.getClass(), "firstPlayDate", term298081);
        setField(term297922, term297922.getClass(), "lastGameId", "pltMgQSnCb");
        setField(term297922, term297922.getClass(), "lastRomVersion", "RiGoJoBvZO");
        setField(term297922, term297922.getClass(), "lastDataVersion", "xjNArFEvAJ");
        setIntField(term298128, term298128.getClass(), "year", 2027);
        setShortField(term298128, term298128.getClass(), "month", (short) 4);
        setShortField(term298128, term298128.getClass(), "day", (short) 18);
        setField(term298127, term298127.getClass(), "date", term298128);
        setByteField(term298132, term298132.getClass(), "hour", (byte) 12);
        setByteField(term298132, term298132.getClass(), "minute", (byte) 50);
        setByteField(term298132, term298132.getClass(), "second", (byte) 38);
        setIntField(term298132, term298132.getClass(), "nano", 960683109);
        setField(term298127, term298127.getClass(), "time", term298132);
        setField(term297922, term297922.getClass(), "lastPlayDate", term298127);
        setIntField(term297922, term297922.getClass(), "lastPlaceId", -1878957947);
        setField(term297922, term297922.getClass(), "lastPlaceName", "cNAlXBcuBR");
        setField(term297922, term297922.getClass(), "lastRegionId", "zhTrQcOfmZ");
        setField(term297922, term297922.getClass(), "lastRegionName", "QPQvZYsKyp");
        setField(term297922, term297922.getClass(), "lastAllNetId", "DcKnNHFkHB");
        setField(term297922, term297922.getClass(), "lastClientId", "ItJTfGujtZ");
        setField(term297920, term297920.getClass(), "user", term297922);
        setIntField(term297920, term297920.getClass(), "kind", 1297585470);
        setIntField(term297920, term297920.getClass(), "activityId", 1699696518);
        setIntField(term297920, term297920.getClass(), "sortNumber", 1862321738);
        setIntField(term297920, term297920.getClass(), "param1", -2033071457);
        setIntField(term297920, term297920.getClass(), "param2", 893651267);
        setIntField(term297920, term297920.getClass(), "param3", 857362843);
        setIntField(term297920, term297920.getClass(), "param4", 724145317);
        term298205 = new Integer(-986993323);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserActivity");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term298205;
        callMethod(klass, "setSortNumber", argTypes, term297920, args);
    }

};


