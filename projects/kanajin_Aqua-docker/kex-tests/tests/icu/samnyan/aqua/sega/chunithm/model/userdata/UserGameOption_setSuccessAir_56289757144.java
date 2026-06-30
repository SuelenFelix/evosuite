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

public class UserGameOption_setSuccessAir_56289757144 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term68983;
     Object term69283;

    public UserGameOption_setSuccessAir_56289757144() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term68989 = new Long(6273754186658578034L);
        term68983 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGameOption"));
        Object term68985 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term68987 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term69003 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term69004 = newInstance(Class.forName("java.time.LocalDate"));
        Object term69008 = newInstance(Class.forName("java.time.LocalTime"));
        Object term69013 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term69014 = newInstance(Class.forName("java.time.LocalDate"));
        Object term69018 = newInstance(Class.forName("java.time.LocalTime"));
        Object term69035 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term69036 = newInstance(Class.forName("java.time.LocalDate"));
        Object term69040 = newInstance(Class.forName("java.time.LocalTime"));
        Object term69096 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term69097 = newInstance(Class.forName("java.time.LocalDate"));
        Object term69101 = newInstance(Class.forName("java.time.LocalTime"));
        Object term69144 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term69145 = newInstance(Class.forName("java.time.LocalDate"));
        Object term69149 = newInstance(Class.forName("java.time.LocalTime"));
        Object term69190 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term69191 = newInstance(Class.forName("java.time.LocalDate"));
        Object term69195 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term68983, term68983.getClass(), "id", 4680638415078495388L);
        setLongField(term68985, term68985.getClass(), "id", 7744119580121297988L);
        setLongField(term68987, term68987.getClass(), "id", 5705211845607271062L);
        setField(term68987, term68987.getClass(), "extId", term68989);
        setField(term68987, term68987.getClass(), "luid", "gzqokHWvLu");
        setIntField(term69004, term69004.getClass(), "year", 2012);
        setShortField(term69004, term69004.getClass(), "month", (short) 8);
        setShortField(term69004, term69004.getClass(), "day", (short) 31);
        setField(term69003, term69003.getClass(), "date", term69004);
        setByteField(term69008, term69008.getClass(), "hour", (byte) 17);
        setByteField(term69008, term69008.getClass(), "minute", (byte) 11);
        setByteField(term69008, term69008.getClass(), "second", (byte) 29);
        setIntField(term69008, term69008.getClass(), "nano", 462334388);
        setField(term69003, term69003.getClass(), "time", term69008);
        setField(term68987, term68987.getClass(), "registerTime", term69003);
        setIntField(term69014, term69014.getClass(), "year", 2027);
        setShortField(term69014, term69014.getClass(), "month", (short) 11);
        setShortField(term69014, term69014.getClass(), "day", (short) 28);
        setField(term69013, term69013.getClass(), "date", term69014);
        setByteField(term69018, term69018.getClass(), "hour", (byte) 23);
        setByteField(term69018, term69018.getClass(), "minute", (byte) 7);
        setByteField(term69018, term69018.getClass(), "second", (byte) 56);
        setIntField(term69018, term69018.getClass(), "nano", 948648524);
        setField(term69013, term69013.getClass(), "time", term69018);
        setField(term68987, term68987.getClass(), "accessTime", term69013);
        setField(term68985, term68985.getClass(), "card", term68987);
        setField(term68985, term68985.getClass(), "userName", "ANCcRsABGP");
        setIntField(term69036, term69036.getClass(), "year", 2028);
        setShortField(term69036, term69036.getClass(), "month", (short) 7);
        setShortField(term69036, term69036.getClass(), "day", (short) 24);
        setField(term69035, term69035.getClass(), "date", term69036);
        setByteField(term69040, term69040.getClass(), "hour", (byte) 11);
        setByteField(term69040, term69040.getClass(), "minute", (byte) 2);
        setByteField(term69040, term69040.getClass(), "second", (byte) 47);
        setIntField(term69040, term69040.getClass(), "nano", 875421060);
        setField(term69035, term69035.getClass(), "time", term69040);
        setField(term68985, term68985.getClass(), "lastLoginDate", term69035);
        setBooleanField(term68985, term68985.getClass(), "isWebJoin", false);
        setField(term68985, term68985.getClass(), "webLimitDate", "MBadwVIvwu");
        setIntField(term68985, term68985.getClass(), "level", 1848705396);
        setIntField(term68985, term68985.getClass(), "reincarnationNum", -748010406);
        setField(term68985, term68985.getClass(), "exp", "zTMIjtwMQL");
        setLongField(term68985, term68985.getClass(), "point", 4947168794582157385L);
        setLongField(term68985, term68985.getClass(), "totalPoint", -9079056015194933995L);
        setIntField(term68985, term68985.getClass(), "playCount", 904927355);
        setIntField(term68985, term68985.getClass(), "multiPlayCount", -2089541916);
        setIntField(term68985, term68985.getClass(), "multiWinCount", 1066893695);
        setIntField(term68985, term68985.getClass(), "requestResCount", -1058646936);
        setIntField(term68985, term68985.getClass(), "acceptResCount", 49685222);
        setIntField(term68985, term68985.getClass(), "successResCount", 298459181);
        setIntField(term68985, term68985.getClass(), "playerRating", -2122946984);
        setIntField(term68985, term68985.getClass(), "highestRating", -163004363);
        setIntField(term68985, term68985.getClass(), "nameplateId", 1165339838);
        setIntField(term68985, term68985.getClass(), "frameId", 1943234848);
        setIntField(term68985, term68985.getClass(), "characterId", -226052940);
        setIntField(term68985, term68985.getClass(), "trophyId", -541512295);
        setIntField(term68985, term68985.getClass(), "playedTutorialBit", 1961504413);
        setIntField(term68985, term68985.getClass(), "firstTutorialCancelNum", -818349758);
        setIntField(term68985, term68985.getClass(), "masterTutorialCancelNum", -328707642);
        setIntField(term68985, term68985.getClass(), "totalRepertoireCount", -1189408120);
        setIntField(term68985, term68985.getClass(), "totalMapNum", -211929036);
        setLongField(term68985, term68985.getClass(), "totalHiScore", -8867721217716506903L);
        setLongField(term68985, term68985.getClass(), "totalBasicHighScore", -1244148850479968082L);
        setLongField(term68985, term68985.getClass(), "totalAdvancedHighScore", 8346326079558512850L);
        setLongField(term68985, term68985.getClass(), "totalExpertHighScore", 4554910377138538493L);
        setLongField(term68985, term68985.getClass(), "totalMasterHighScore", -2306787824604312942L);
        setIntField(term69097, term69097.getClass(), "year", 2029);
        setShortField(term69097, term69097.getClass(), "month", (short) 12);
        setShortField(term69097, term69097.getClass(), "day", (short) 20);
        setField(term69096, term69096.getClass(), "date", term69097);
        setByteField(term69101, term69101.getClass(), "hour", (byte) 3);
        setByteField(term69101, term69101.getClass(), "minute", (byte) 1);
        setByteField(term69101, term69101.getClass(), "second", (byte) 52);
        setIntField(term69101, term69101.getClass(), "nano", 833458434);
        setField(term69096, term69096.getClass(), "time", term69101);
        setField(term68985, term68985.getClass(), "eventWatchedDate", term69096);
        setIntField(term68985, term68985.getClass(), "friendCount", 117783491);
        setBooleanField(term68985, term68985.getClass(), "isMaimai", false);
        setField(term68985, term68985.getClass(), "firstGameId", "cjJhlsbSLZ");
        setField(term68985, term68985.getClass(), "firstRomVersion", "BvcBilSFZf");
        setField(term68985, term68985.getClass(), "firstDataVersion", "ppUmoMssug");
        setIntField(term69145, term69145.getClass(), "year", 2029);
        setShortField(term69145, term69145.getClass(), "month", (short) 6);
        setShortField(term69145, term69145.getClass(), "day", (short) 2);
        setField(term69144, term69144.getClass(), "date", term69145);
        setByteField(term69149, term69149.getClass(), "hour", (byte) 7);
        setByteField(term69149, term69149.getClass(), "minute", (byte) 13);
        setByteField(term69149, term69149.getClass(), "second", (byte) 48);
        setIntField(term69149, term69149.getClass(), "nano", 642728132);
        setField(term69144, term69144.getClass(), "time", term69149);
        setField(term68985, term68985.getClass(), "firstPlayDate", term69144);
        setField(term68985, term68985.getClass(), "lastGameId", "FcponInvBb");
        setField(term68985, term68985.getClass(), "lastRomVersion", "IFOOxmFxbX");
        setField(term68985, term68985.getClass(), "lastDataVersion", "aDEuPKrSZt");
        setIntField(term69191, term69191.getClass(), "year", 2010);
        setShortField(term69191, term69191.getClass(), "month", (short) 10);
        setShortField(term69191, term69191.getClass(), "day", (short) 8);
        setField(term69190, term69190.getClass(), "date", term69191);
        setByteField(term69195, term69195.getClass(), "hour", (byte) 6);
        setByteField(term69195, term69195.getClass(), "minute", (byte) 12);
        setByteField(term69195, term69195.getClass(), "second", (byte) 51);
        setIntField(term69195, term69195.getClass(), "nano", 851312829);
        setField(term69190, term69190.getClass(), "time", term69195);
        setField(term68985, term68985.getClass(), "lastPlayDate", term69190);
        setIntField(term68985, term68985.getClass(), "lastPlaceId", -1289051383);
        setField(term68985, term68985.getClass(), "lastPlaceName", "aDhkmoCCUK");
        setField(term68985, term68985.getClass(), "lastRegionId", "ibnuoVVkVm");
        setField(term68985, term68985.getClass(), "lastRegionName", "mXVgkxjTjD");
        setField(term68985, term68985.getClass(), "lastAllNetId", "qodBmKUkev");
        setField(term68985, term68985.getClass(), "lastClientId", "QJuqwUQEyr");
        setField(term68983, term68983.getClass(), "user", term68985);
        setIntField(term68983, term68983.getClass(), "bgInfo", 1802752902);
        setIntField(term68983, term68983.getClass(), "fieldColor", -1137533005);
        setIntField(term68983, term68983.getClass(), "guideSound", -2093544170);
        setIntField(term68983, term68983.getClass(), "soundEffect", 39380540);
        setIntField(term68983, term68983.getClass(), "guideLine", 1307563354);
        setIntField(term68983, term68983.getClass(), "speed", -1960918162);
        setIntField(term68983, term68983.getClass(), "optionSet", -1039727165);
        setIntField(term68983, term68983.getClass(), "matching", -64649810);
        setIntField(term68983, term68983.getClass(), "judgePos", -1883605503);
        setIntField(term68983, term68983.getClass(), "rating", 264290749);
        setIntField(term68983, term68983.getClass(), "judgeJustice", 481697403);
        setIntField(term68983, term68983.getClass(), "judgeAttack", 926936251);
        setIntField(term68983, term68983.getClass(), "headphone", -1700257563);
        setIntField(term68983, term68983.getClass(), "playerLevel", 1981729571);
        setIntField(term68983, term68983.getClass(), "successTap", 127533420);
        setIntField(term68983, term68983.getClass(), "successExTap", -426467178);
        setIntField(term68983, term68983.getClass(), "successSlideHold", 1659957838);
        setIntField(term68983, term68983.getClass(), "successAir", 1323889329);
        setIntField(term68983, term68983.getClass(), "successFlick", -343106345);
        setIntField(term68983, term68983.getClass(), "successSkill", 602906952);
        setIntField(term68983, term68983.getClass(), "successTapTimbre", -114450920);
        setIntField(term68983, term68983.getClass(), "privacy", -1252187988);
        term69283 = new Integer(-81147170);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGameOption");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term69283;
        callMethod(klass, "setSuccessAir", argTypes, term68983, args);
    }

};


