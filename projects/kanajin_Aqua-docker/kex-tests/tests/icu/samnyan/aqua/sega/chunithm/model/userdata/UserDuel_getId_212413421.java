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

public class UserDuel_getId_212413421 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term75283;

    public UserDuel_getId_212413421() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term75289 = new Long(855932984568615096L);
        term75283 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserDuel"));
        Object term75285 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term75287 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term75303 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term75304 = newInstance(Class.forName("java.time.LocalDate"));
        Object term75308 = newInstance(Class.forName("java.time.LocalTime"));
        Object term75313 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term75314 = newInstance(Class.forName("java.time.LocalDate"));
        Object term75318 = newInstance(Class.forName("java.time.LocalTime"));
        Object term75335 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term75336 = newInstance(Class.forName("java.time.LocalDate"));
        Object term75340 = newInstance(Class.forName("java.time.LocalTime"));
        Object term75396 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term75397 = newInstance(Class.forName("java.time.LocalDate"));
        Object term75401 = newInstance(Class.forName("java.time.LocalTime"));
        Object term75444 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term75445 = newInstance(Class.forName("java.time.LocalDate"));
        Object term75449 = newInstance(Class.forName("java.time.LocalTime"));
        Object term75490 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term75491 = newInstance(Class.forName("java.time.LocalDate"));
        Object term75495 = newInstance(Class.forName("java.time.LocalTime"));
        Object term75565 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term75566 = newInstance(Class.forName("java.time.LocalDate"));
        Object term75570 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term75283, term75283.getClass(), "id", -3822804973679381574L);
        setLongField(term75285, term75285.getClass(), "id", 8503915599730893579L);
        setLongField(term75287, term75287.getClass(), "id", 995860001169768274L);
        setField(term75287, term75287.getClass(), "extId", term75289);
        setField(term75287, term75287.getClass(), "luid", "XhnCbWwpIr");
        setIntField(term75304, term75304.getClass(), "year", 2019);
        setShortField(term75304, term75304.getClass(), "month", (short) 10);
        setShortField(term75304, term75304.getClass(), "day", (short) 19);
        setField(term75303, term75303.getClass(), "date", term75304);
        setByteField(term75308, term75308.getClass(), "hour", (byte) 13);
        setByteField(term75308, term75308.getClass(), "minute", (byte) 22);
        setByteField(term75308, term75308.getClass(), "second", (byte) 53);
        setIntField(term75308, term75308.getClass(), "nano", 628070727);
        setField(term75303, term75303.getClass(), "time", term75308);
        setField(term75287, term75287.getClass(), "registerTime", term75303);
        setIntField(term75314, term75314.getClass(), "year", 2018);
        setShortField(term75314, term75314.getClass(), "month", (short) 3);
        setShortField(term75314, term75314.getClass(), "day", (short) 4);
        setField(term75313, term75313.getClass(), "date", term75314);
        setByteField(term75318, term75318.getClass(), "hour", (byte) 20);
        setByteField(term75318, term75318.getClass(), "minute", (byte) 47);
        setByteField(term75318, term75318.getClass(), "second", (byte) 55);
        setIntField(term75318, term75318.getClass(), "nano", 479898286);
        setField(term75313, term75313.getClass(), "time", term75318);
        setField(term75287, term75287.getClass(), "accessTime", term75313);
        setField(term75285, term75285.getClass(), "card", term75287);
        setField(term75285, term75285.getClass(), "userName", "BVMUadSiyU");
        setIntField(term75336, term75336.getClass(), "year", 2020);
        setShortField(term75336, term75336.getClass(), "month", (short) 10);
        setShortField(term75336, term75336.getClass(), "day", (short) 22);
        setField(term75335, term75335.getClass(), "date", term75336);
        setByteField(term75340, term75340.getClass(), "hour", (byte) 22);
        setByteField(term75340, term75340.getClass(), "minute", (byte) 10);
        setByteField(term75340, term75340.getClass(), "second", (byte) 45);
        setIntField(term75340, term75340.getClass(), "nano", 397845140);
        setField(term75335, term75335.getClass(), "time", term75340);
        setField(term75285, term75285.getClass(), "lastLoginDate", term75335);
        setBooleanField(term75285, term75285.getClass(), "isWebJoin", false);
        setField(term75285, term75285.getClass(), "webLimitDate", "OhWrgFwvJi");
        setIntField(term75285, term75285.getClass(), "level", -1053825347);
        setIntField(term75285, term75285.getClass(), "reincarnationNum", 2141886355);
        setField(term75285, term75285.getClass(), "exp", "DfKWXfTINQ");
        setLongField(term75285, term75285.getClass(), "point", 1369830788516662006L);
        setLongField(term75285, term75285.getClass(), "totalPoint", 6127011005231905639L);
        setIntField(term75285, term75285.getClass(), "playCount", -979489727);
        setIntField(term75285, term75285.getClass(), "multiPlayCount", -1339607020);
        setIntField(term75285, term75285.getClass(), "multiWinCount", 21710763);
        setIntField(term75285, term75285.getClass(), "requestResCount", -1638359261);
        setIntField(term75285, term75285.getClass(), "acceptResCount", -1738702221);
        setIntField(term75285, term75285.getClass(), "successResCount", 949696394);
        setIntField(term75285, term75285.getClass(), "playerRating", 366195895);
        setIntField(term75285, term75285.getClass(), "highestRating", 513276394);
        setIntField(term75285, term75285.getClass(), "nameplateId", -867492502);
        setIntField(term75285, term75285.getClass(), "frameId", 1315160763);
        setIntField(term75285, term75285.getClass(), "characterId", -806163944);
        setIntField(term75285, term75285.getClass(), "trophyId", -1528700295);
        setIntField(term75285, term75285.getClass(), "playedTutorialBit", -92750221);
        setIntField(term75285, term75285.getClass(), "firstTutorialCancelNum", 1994324228);
        setIntField(term75285, term75285.getClass(), "masterTutorialCancelNum", 1551084552);
        setIntField(term75285, term75285.getClass(), "totalRepertoireCount", 1435658339);
        setIntField(term75285, term75285.getClass(), "totalMapNum", 1802290366);
        setLongField(term75285, term75285.getClass(), "totalHiScore", -8925131548818125405L);
        setLongField(term75285, term75285.getClass(), "totalBasicHighScore", 5793505030039838427L);
        setLongField(term75285, term75285.getClass(), "totalAdvancedHighScore", 104869345921695905L);
        setLongField(term75285, term75285.getClass(), "totalExpertHighScore", -5803631481953709495L);
        setLongField(term75285, term75285.getClass(), "totalMasterHighScore", -4983190578576857758L);
        setIntField(term75397, term75397.getClass(), "year", 2023);
        setShortField(term75397, term75397.getClass(), "month", (short) 3);
        setShortField(term75397, term75397.getClass(), "day", (short) 11);
        setField(term75396, term75396.getClass(), "date", term75397);
        setByteField(term75401, term75401.getClass(), "hour", (byte) 2);
        setByteField(term75401, term75401.getClass(), "minute", (byte) 18);
        setByteField(term75401, term75401.getClass(), "second", (byte) 39);
        setIntField(term75401, term75401.getClass(), "nano", 701112042);
        setField(term75396, term75396.getClass(), "time", term75401);
        setField(term75285, term75285.getClass(), "eventWatchedDate", term75396);
        setIntField(term75285, term75285.getClass(), "friendCount", -1308723047);
        setBooleanField(term75285, term75285.getClass(), "isMaimai", true);
        setField(term75285, term75285.getClass(), "firstGameId", "KqusFIxuyo");
        setField(term75285, term75285.getClass(), "firstRomVersion", "CDpvEYMuDg");
        setField(term75285, term75285.getClass(), "firstDataVersion", "YaZCAiIUPe");
        setIntField(term75445, term75445.getClass(), "year", 2015);
        setShortField(term75445, term75445.getClass(), "month", (short) 1);
        setShortField(term75445, term75445.getClass(), "day", (short) 28);
        setField(term75444, term75444.getClass(), "date", term75445);
        setByteField(term75449, term75449.getClass(), "hour", (byte) 19);
        setByteField(term75449, term75449.getClass(), "minute", (byte) 25);
        setByteField(term75449, term75449.getClass(), "second", (byte) 21);
        setIntField(term75449, term75449.getClass(), "nano", 419809555);
        setField(term75444, term75444.getClass(), "time", term75449);
        setField(term75285, term75285.getClass(), "firstPlayDate", term75444);
        setField(term75285, term75285.getClass(), "lastGameId", "KsCWHUcJDd");
        setField(term75285, term75285.getClass(), "lastRomVersion", "zkYsnzzwJu");
        setField(term75285, term75285.getClass(), "lastDataVersion", "hxHKgOYyQD");
        setIntField(term75491, term75491.getClass(), "year", 2016);
        setShortField(term75491, term75491.getClass(), "month", (short) 3);
        setShortField(term75491, term75491.getClass(), "day", (short) 9);
        setField(term75490, term75490.getClass(), "date", term75491);
        setByteField(term75495, term75495.getClass(), "hour", (byte) 14);
        setByteField(term75495, term75495.getClass(), "minute", (byte) 25);
        setByteField(term75495, term75495.getClass(), "second", (byte) 3);
        setIntField(term75495, term75495.getClass(), "nano", 268186564);
        setField(term75490, term75490.getClass(), "time", term75495);
        setField(term75285, term75285.getClass(), "lastPlayDate", term75490);
        setIntField(term75285, term75285.getClass(), "lastPlaceId", -1225238765);
        setField(term75285, term75285.getClass(), "lastPlaceName", "opEyNuSzgs");
        setField(term75285, term75285.getClass(), "lastRegionId", "YTnlgdIqfA");
        setField(term75285, term75285.getClass(), "lastRegionName", "gcKmFclftu");
        setField(term75285, term75285.getClass(), "lastAllNetId", "lfREOBPEuD");
        setField(term75285, term75285.getClass(), "lastClientId", "JAGjDlTwTa");
        setField(term75283, term75283.getClass(), "user", term75285);
        setIntField(term75283, term75283.getClass(), "duelId", -546245327);
        setIntField(term75283, term75283.getClass(), "progress", 1671823678);
        setIntField(term75283, term75283.getClass(), "point", -1929941351);
        setBooleanField(term75283, term75283.getClass(), "isClear", true);
        setIntField(term75566, term75566.getClass(), "year", 2020);
        setShortField(term75566, term75566.getClass(), "month", (short) 2);
        setShortField(term75566, term75566.getClass(), "day", (short) 28);
        setField(term75565, term75565.getClass(), "date", term75566);
        setByteField(term75570, term75570.getClass(), "hour", (byte) 3);
        setByteField(term75570, term75570.getClass(), "minute", (byte) 46);
        setByteField(term75570, term75570.getClass(), "second", (byte) 58);
        setIntField(term75570, term75570.getClass(), "nano", 519279868);
        setField(term75565, term75565.getClass(), "time", term75570);
        setField(term75283, term75283.getClass(), "lastPlayDate", term75565);
        setIntField(term75283, term75283.getClass(), "param1", -137121647);
        setIntField(term75283, term75283.getClass(), "param2", 503819416);
        setIntField(term75283, term75283.getClass(), "param3", -1959893804);
        setIntField(term75283, term75283.getClass(), "param4", -983886756);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserDuel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term75283, args);
    }

};


