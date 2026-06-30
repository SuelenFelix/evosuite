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

public class UserActivity_setParam3_182150350817 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term299231;
     Object term299516;

    public UserActivity_setParam3_182150350817() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term299237 = new Long(204473662283899955L);
        term299231 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserActivity"));
        Object term299233 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term299235 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term299251 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term299252 = newInstance(Class.forName("java.time.LocalDate"));
        Object term299256 = newInstance(Class.forName("java.time.LocalTime"));
        Object term299261 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term299262 = newInstance(Class.forName("java.time.LocalDate"));
        Object term299266 = newInstance(Class.forName("java.time.LocalTime"));
        Object term299283 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term299284 = newInstance(Class.forName("java.time.LocalDate"));
        Object term299288 = newInstance(Class.forName("java.time.LocalTime"));
        Object term299344 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term299345 = newInstance(Class.forName("java.time.LocalDate"));
        Object term299349 = newInstance(Class.forName("java.time.LocalTime"));
        Object term299392 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term299393 = newInstance(Class.forName("java.time.LocalDate"));
        Object term299397 = newInstance(Class.forName("java.time.LocalTime"));
        Object term299438 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term299439 = newInstance(Class.forName("java.time.LocalDate"));
        Object term299443 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term299231, term299231.getClass(), "id", -3674362961748634415L);
        setLongField(term299233, term299233.getClass(), "id", 30900343565357110L);
        setLongField(term299235, term299235.getClass(), "id", -7435576953442701299L);
        setField(term299235, term299235.getClass(), "extId", term299237);
        setField(term299235, term299235.getClass(), "luid", "HheeaUYjPr");
        setIntField(term299252, term299252.getClass(), "year", 2029);
        setShortField(term299252, term299252.getClass(), "month", (short) 3);
        setShortField(term299252, term299252.getClass(), "day", (short) 22);
        setField(term299251, term299251.getClass(), "date", term299252);
        setByteField(term299256, term299256.getClass(), "hour", (byte) 14);
        setByteField(term299256, term299256.getClass(), "minute", (byte) 58);
        setByteField(term299256, term299256.getClass(), "second", (byte) 9);
        setIntField(term299256, term299256.getClass(), "nano", 509049730);
        setField(term299251, term299251.getClass(), "time", term299256);
        setField(term299235, term299235.getClass(), "registerTime", term299251);
        setIntField(term299262, term299262.getClass(), "year", 2021);
        setShortField(term299262, term299262.getClass(), "month", (short) 9);
        setShortField(term299262, term299262.getClass(), "day", (short) 2);
        setField(term299261, term299261.getClass(), "date", term299262);
        setByteField(term299266, term299266.getClass(), "hour", (byte) 0);
        setByteField(term299266, term299266.getClass(), "minute", (byte) 24);
        setByteField(term299266, term299266.getClass(), "second", (byte) 44);
        setIntField(term299266, term299266.getClass(), "nano", 404767598);
        setField(term299261, term299261.getClass(), "time", term299266);
        setField(term299235, term299235.getClass(), "accessTime", term299261);
        setField(term299233, term299233.getClass(), "card", term299235);
        setField(term299233, term299233.getClass(), "userName", "nyKmTaUwFt");
        setIntField(term299284, term299284.getClass(), "year", 2020);
        setShortField(term299284, term299284.getClass(), "month", (short) 6);
        setShortField(term299284, term299284.getClass(), "day", (short) 3);
        setField(term299283, term299283.getClass(), "date", term299284);
        setByteField(term299288, term299288.getClass(), "hour", (byte) 14);
        setByteField(term299288, term299288.getClass(), "minute", (byte) 53);
        setByteField(term299288, term299288.getClass(), "second", (byte) 8);
        setIntField(term299288, term299288.getClass(), "nano", 729658253);
        setField(term299283, term299283.getClass(), "time", term299288);
        setField(term299233, term299233.getClass(), "lastLoginDate", term299283);
        setBooleanField(term299233, term299233.getClass(), "isWebJoin", false);
        setField(term299233, term299233.getClass(), "webLimitDate", "rzqaoonvCb");
        setIntField(term299233, term299233.getClass(), "level", 1476111788);
        setIntField(term299233, term299233.getClass(), "reincarnationNum", -718941728);
        setField(term299233, term299233.getClass(), "exp", "DHAcIlnUmH");
        setLongField(term299233, term299233.getClass(), "point", 9011364716758687771L);
        setLongField(term299233, term299233.getClass(), "totalPoint", -5390664323916679150L);
        setIntField(term299233, term299233.getClass(), "playCount", 840842536);
        setIntField(term299233, term299233.getClass(), "multiPlayCount", -1271403609);
        setIntField(term299233, term299233.getClass(), "multiWinCount", 1884294543);
        setIntField(term299233, term299233.getClass(), "requestResCount", -1914952733);
        setIntField(term299233, term299233.getClass(), "acceptResCount", -1988952578);
        setIntField(term299233, term299233.getClass(), "successResCount", -345409524);
        setIntField(term299233, term299233.getClass(), "playerRating", -1574633469);
        setIntField(term299233, term299233.getClass(), "highestRating", 1036189177);
        setIntField(term299233, term299233.getClass(), "nameplateId", 1117995815);
        setIntField(term299233, term299233.getClass(), "frameId", -2022511335);
        setIntField(term299233, term299233.getClass(), "characterId", 51832928);
        setIntField(term299233, term299233.getClass(), "trophyId", -1340482712);
        setIntField(term299233, term299233.getClass(), "playedTutorialBit", 475577815);
        setIntField(term299233, term299233.getClass(), "firstTutorialCancelNum", 1808537592);
        setIntField(term299233, term299233.getClass(), "masterTutorialCancelNum", -625276209);
        setIntField(term299233, term299233.getClass(), "totalRepertoireCount", -912186570);
        setIntField(term299233, term299233.getClass(), "totalMapNum", 332491973);
        setLongField(term299233, term299233.getClass(), "totalHiScore", 2199487095678847563L);
        setLongField(term299233, term299233.getClass(), "totalBasicHighScore", 1844082564287253862L);
        setLongField(term299233, term299233.getClass(), "totalAdvancedHighScore", -7135318849262922193L);
        setLongField(term299233, term299233.getClass(), "totalExpertHighScore", 649959317544851831L);
        setLongField(term299233, term299233.getClass(), "totalMasterHighScore", 6097677615781763525L);
        setIntField(term299345, term299345.getClass(), "year", 2015);
        setShortField(term299345, term299345.getClass(), "month", (short) 7);
        setShortField(term299345, term299345.getClass(), "day", (short) 5);
        setField(term299344, term299344.getClass(), "date", term299345);
        setByteField(term299349, term299349.getClass(), "hour", (byte) 6);
        setByteField(term299349, term299349.getClass(), "minute", (byte) 13);
        setByteField(term299349, term299349.getClass(), "second", (byte) 38);
        setIntField(term299349, term299349.getClass(), "nano", 784005782);
        setField(term299344, term299344.getClass(), "time", term299349);
        setField(term299233, term299233.getClass(), "eventWatchedDate", term299344);
        setIntField(term299233, term299233.getClass(), "friendCount", 660268383);
        setBooleanField(term299233, term299233.getClass(), "isMaimai", false);
        setField(term299233, term299233.getClass(), "firstGameId", "PXpuIQuvxu");
        setField(term299233, term299233.getClass(), "firstRomVersion", "RGuievXeWF");
        setField(term299233, term299233.getClass(), "firstDataVersion", "RNWAfuYVdn");
        setIntField(term299393, term299393.getClass(), "year", 2014);
        setShortField(term299393, term299393.getClass(), "month", (short) 11);
        setShortField(term299393, term299393.getClass(), "day", (short) 19);
        setField(term299392, term299392.getClass(), "date", term299393);
        setByteField(term299397, term299397.getClass(), "hour", (byte) 7);
        setByteField(term299397, term299397.getClass(), "minute", (byte) 2);
        setByteField(term299397, term299397.getClass(), "second", (byte) 45);
        setIntField(term299397, term299397.getClass(), "nano", 314411305);
        setField(term299392, term299392.getClass(), "time", term299397);
        setField(term299233, term299233.getClass(), "firstPlayDate", term299392);
        setField(term299233, term299233.getClass(), "lastGameId", "hZuxPbhKHd");
        setField(term299233, term299233.getClass(), "lastRomVersion", "owuVENinAF");
        setField(term299233, term299233.getClass(), "lastDataVersion", "wrEbOqtEzd");
        setIntField(term299439, term299439.getClass(), "year", 2025);
        setShortField(term299439, term299439.getClass(), "month", (short) 8);
        setShortField(term299439, term299439.getClass(), "day", (short) 12);
        setField(term299438, term299438.getClass(), "date", term299439);
        setByteField(term299443, term299443.getClass(), "hour", (byte) 5);
        setByteField(term299443, term299443.getClass(), "minute", (byte) 13);
        setByteField(term299443, term299443.getClass(), "second", (byte) 10);
        setIntField(term299443, term299443.getClass(), "nano", 301210344);
        setField(term299438, term299438.getClass(), "time", term299443);
        setField(term299233, term299233.getClass(), "lastPlayDate", term299438);
        setIntField(term299233, term299233.getClass(), "lastPlaceId", -671514118);
        setField(term299233, term299233.getClass(), "lastPlaceName", "wnmgduZOMm");
        setField(term299233, term299233.getClass(), "lastRegionId", "CunxEcVQZW");
        setField(term299233, term299233.getClass(), "lastRegionName", "SNbQDPikGp");
        setField(term299233, term299233.getClass(), "lastAllNetId", "dCxylRMRqf");
        setField(term299233, term299233.getClass(), "lastClientId", "MSwWSxHYib");
        setField(term299231, term299231.getClass(), "user", term299233);
        setIntField(term299231, term299231.getClass(), "kind", -1399358009);
        setIntField(term299231, term299231.getClass(), "activityId", 2111728382);
        setIntField(term299231, term299231.getClass(), "sortNumber", 171174352);
        setIntField(term299231, term299231.getClass(), "param1", -450601982);
        setIntField(term299231, term299231.getClass(), "param2", 327442634);
        setIntField(term299231, term299231.getClass(), "param3", 1459640309);
        setIntField(term299231, term299231.getClass(), "param4", 296004124);
        term299516 = new Integer(925831861);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserActivity");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term299516;
        callMethod(klass, "setParam3", argTypes, term299231, args);
    }

};


