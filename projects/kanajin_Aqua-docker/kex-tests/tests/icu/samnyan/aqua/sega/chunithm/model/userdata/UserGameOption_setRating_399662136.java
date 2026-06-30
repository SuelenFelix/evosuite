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

public class UserGameOption_setRating_399662136 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term65367;
     Object term65667;

    public UserGameOption_setRating_399662136() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term65373 = new Long(-4393710401270724527L);
        term65367 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGameOption"));
        Object term65369 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term65371 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term65387 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term65388 = newInstance(Class.forName("java.time.LocalDate"));
        Object term65392 = newInstance(Class.forName("java.time.LocalTime"));
        Object term65397 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term65398 = newInstance(Class.forName("java.time.LocalDate"));
        Object term65402 = newInstance(Class.forName("java.time.LocalTime"));
        Object term65419 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term65420 = newInstance(Class.forName("java.time.LocalDate"));
        Object term65424 = newInstance(Class.forName("java.time.LocalTime"));
        Object term65480 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term65481 = newInstance(Class.forName("java.time.LocalDate"));
        Object term65485 = newInstance(Class.forName("java.time.LocalTime"));
        Object term65528 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term65529 = newInstance(Class.forName("java.time.LocalDate"));
        Object term65533 = newInstance(Class.forName("java.time.LocalTime"));
        Object term65574 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term65575 = newInstance(Class.forName("java.time.LocalDate"));
        Object term65579 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term65367, term65367.getClass(), "id", 7022012163884672746L);
        setLongField(term65369, term65369.getClass(), "id", -5668489101686002218L);
        setLongField(term65371, term65371.getClass(), "id", 8713229483070783866L);
        setField(term65371, term65371.getClass(), "extId", term65373);
        setField(term65371, term65371.getClass(), "luid", "yfHcOCDrGy");
        setIntField(term65388, term65388.getClass(), "year", 2014);
        setShortField(term65388, term65388.getClass(), "month", (short) 1);
        setShortField(term65388, term65388.getClass(), "day", (short) 6);
        setField(term65387, term65387.getClass(), "date", term65388);
        setByteField(term65392, term65392.getClass(), "hour", (byte) 13);
        setByteField(term65392, term65392.getClass(), "minute", (byte) 4);
        setByteField(term65392, term65392.getClass(), "second", (byte) 34);
        setIntField(term65392, term65392.getClass(), "nano", 465558975);
        setField(term65387, term65387.getClass(), "time", term65392);
        setField(term65371, term65371.getClass(), "registerTime", term65387);
        setIntField(term65398, term65398.getClass(), "year", 2016);
        setShortField(term65398, term65398.getClass(), "month", (short) 8);
        setShortField(term65398, term65398.getClass(), "day", (short) 23);
        setField(term65397, term65397.getClass(), "date", term65398);
        setByteField(term65402, term65402.getClass(), "hour", (byte) 15);
        setByteField(term65402, term65402.getClass(), "minute", (byte) 21);
        setByteField(term65402, term65402.getClass(), "second", (byte) 10);
        setIntField(term65402, term65402.getClass(), "nano", 549669034);
        setField(term65397, term65397.getClass(), "time", term65402);
        setField(term65371, term65371.getClass(), "accessTime", term65397);
        setField(term65369, term65369.getClass(), "card", term65371);
        setField(term65369, term65369.getClass(), "userName", "juKqILstcn");
        setIntField(term65420, term65420.getClass(), "year", 2010);
        setShortField(term65420, term65420.getClass(), "month", (short) 3);
        setShortField(term65420, term65420.getClass(), "day", (short) 19);
        setField(term65419, term65419.getClass(), "date", term65420);
        setByteField(term65424, term65424.getClass(), "hour", (byte) 8);
        setByteField(term65424, term65424.getClass(), "minute", (byte) 38);
        setByteField(term65424, term65424.getClass(), "second", (byte) 34);
        setIntField(term65424, term65424.getClass(), "nano", 473897267);
        setField(term65419, term65419.getClass(), "time", term65424);
        setField(term65369, term65369.getClass(), "lastLoginDate", term65419);
        setBooleanField(term65369, term65369.getClass(), "isWebJoin", true);
        setField(term65369, term65369.getClass(), "webLimitDate", "QSCQJRyiPa");
        setIntField(term65369, term65369.getClass(), "level", 1410439573);
        setIntField(term65369, term65369.getClass(), "reincarnationNum", -982945087);
        setField(term65369, term65369.getClass(), "exp", "jPPOVoAOLQ");
        setLongField(term65369, term65369.getClass(), "point", 7598786125321910224L);
        setLongField(term65369, term65369.getClass(), "totalPoint", 2008211696778135261L);
        setIntField(term65369, term65369.getClass(), "playCount", 171057010);
        setIntField(term65369, term65369.getClass(), "multiPlayCount", -1039706080);
        setIntField(term65369, term65369.getClass(), "multiWinCount", 1009893493);
        setIntField(term65369, term65369.getClass(), "requestResCount", -1097846142);
        setIntField(term65369, term65369.getClass(), "acceptResCount", 1026272483);
        setIntField(term65369, term65369.getClass(), "successResCount", -48026838);
        setIntField(term65369, term65369.getClass(), "playerRating", 1557093855);
        setIntField(term65369, term65369.getClass(), "highestRating", -445911899);
        setIntField(term65369, term65369.getClass(), "nameplateId", -1254075402);
        setIntField(term65369, term65369.getClass(), "frameId", -1886407162);
        setIntField(term65369, term65369.getClass(), "characterId", -97996127);
        setIntField(term65369, term65369.getClass(), "trophyId", 668350997);
        setIntField(term65369, term65369.getClass(), "playedTutorialBit", -1280690194);
        setIntField(term65369, term65369.getClass(), "firstTutorialCancelNum", -1825481062);
        setIntField(term65369, term65369.getClass(), "masterTutorialCancelNum", 662456234);
        setIntField(term65369, term65369.getClass(), "totalRepertoireCount", -1932565769);
        setIntField(term65369, term65369.getClass(), "totalMapNum", 480924614);
        setLongField(term65369, term65369.getClass(), "totalHiScore", 915665059113544268L);
        setLongField(term65369, term65369.getClass(), "totalBasicHighScore", -3380318205328241107L);
        setLongField(term65369, term65369.getClass(), "totalAdvancedHighScore", -3551818295265883412L);
        setLongField(term65369, term65369.getClass(), "totalExpertHighScore", -8031780876521881873L);
        setLongField(term65369, term65369.getClass(), "totalMasterHighScore", -8015150842907349869L);
        setIntField(term65481, term65481.getClass(), "year", 2023);
        setShortField(term65481, term65481.getClass(), "month", (short) 3);
        setShortField(term65481, term65481.getClass(), "day", (short) 17);
        setField(term65480, term65480.getClass(), "date", term65481);
        setByteField(term65485, term65485.getClass(), "hour", (byte) 13);
        setByteField(term65485, term65485.getClass(), "minute", (byte) 18);
        setByteField(term65485, term65485.getClass(), "second", (byte) 12);
        setIntField(term65485, term65485.getClass(), "nano", 422255508);
        setField(term65480, term65480.getClass(), "time", term65485);
        setField(term65369, term65369.getClass(), "eventWatchedDate", term65480);
        setIntField(term65369, term65369.getClass(), "friendCount", 1423620762);
        setBooleanField(term65369, term65369.getClass(), "isMaimai", false);
        setField(term65369, term65369.getClass(), "firstGameId", "kZKzEkUFFI");
        setField(term65369, term65369.getClass(), "firstRomVersion", "dnYvoLZjCf");
        setField(term65369, term65369.getClass(), "firstDataVersion", "ZsvLlzqETk");
        setIntField(term65529, term65529.getClass(), "year", 2017);
        setShortField(term65529, term65529.getClass(), "month", (short) 10);
        setShortField(term65529, term65529.getClass(), "day", (short) 2);
        setField(term65528, term65528.getClass(), "date", term65529);
        setByteField(term65533, term65533.getClass(), "hour", (byte) 4);
        setByteField(term65533, term65533.getClass(), "minute", (byte) 40);
        setByteField(term65533, term65533.getClass(), "second", (byte) 56);
        setIntField(term65533, term65533.getClass(), "nano", 701221907);
        setField(term65528, term65528.getClass(), "time", term65533);
        setField(term65369, term65369.getClass(), "firstPlayDate", term65528);
        setField(term65369, term65369.getClass(), "lastGameId", "DqrZwuHriF");
        setField(term65369, term65369.getClass(), "lastRomVersion", "daaMmTkwOR");
        setField(term65369, term65369.getClass(), "lastDataVersion", "WfJKDOFrUv");
        setIntField(term65575, term65575.getClass(), "year", 2017);
        setShortField(term65575, term65575.getClass(), "month", (short) 8);
        setShortField(term65575, term65575.getClass(), "day", (short) 6);
        setField(term65574, term65574.getClass(), "date", term65575);
        setByteField(term65579, term65579.getClass(), "hour", (byte) 8);
        setByteField(term65579, term65579.getClass(), "minute", (byte) 40);
        setByteField(term65579, term65579.getClass(), "second", (byte) 43);
        setIntField(term65579, term65579.getClass(), "nano", 384847912);
        setField(term65574, term65574.getClass(), "time", term65579);
        setField(term65369, term65369.getClass(), "lastPlayDate", term65574);
        setIntField(term65369, term65369.getClass(), "lastPlaceId", -182687795);
        setField(term65369, term65369.getClass(), "lastPlaceName", "CbwfWaINrF");
        setField(term65369, term65369.getClass(), "lastRegionId", "AVCzSfXhGU");
        setField(term65369, term65369.getClass(), "lastRegionName", "nTUCmQGFDE");
        setField(term65369, term65369.getClass(), "lastAllNetId", "rfFTBanxEx");
        setField(term65369, term65369.getClass(), "lastClientId", "MQJTCGewxT");
        setField(term65367, term65367.getClass(), "user", term65369);
        setIntField(term65367, term65367.getClass(), "bgInfo", -1965076703);
        setIntField(term65367, term65367.getClass(), "fieldColor", -1715006566);
        setIntField(term65367, term65367.getClass(), "guideSound", 1190377243);
        setIntField(term65367, term65367.getClass(), "soundEffect", -1013321277);
        setIntField(term65367, term65367.getClass(), "guideLine", -38762037);
        setIntField(term65367, term65367.getClass(), "speed", -200236986);
        setIntField(term65367, term65367.getClass(), "optionSet", -1078778523);
        setIntField(term65367, term65367.getClass(), "matching", -1573140874);
        setIntField(term65367, term65367.getClass(), "judgePos", 1252740231);
        setIntField(term65367, term65367.getClass(), "rating", -1494498996);
        setIntField(term65367, term65367.getClass(), "judgeJustice", -1230782196);
        setIntField(term65367, term65367.getClass(), "judgeAttack", 1988646780);
        setIntField(term65367, term65367.getClass(), "headphone", -1505639058);
        setIntField(term65367, term65367.getClass(), "playerLevel", -1198622469);
        setIntField(term65367, term65367.getClass(), "successTap", 254477121);
        setIntField(term65367, term65367.getClass(), "successExTap", -2097473055);
        setIntField(term65367, term65367.getClass(), "successSlideHold", 956173467);
        setIntField(term65367, term65367.getClass(), "successAir", -362299700);
        setIntField(term65367, term65367.getClass(), "successFlick", -229025947);
        setIntField(term65367, term65367.getClass(), "successSkill", -2074615511);
        setIntField(term65367, term65367.getClass(), "successTapTimbre", -545948451);
        setIntField(term65367, term65367.getClass(), "privacy", -211944434);
        term65667 = new Integer(-558856994);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGameOption");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term65667;
        callMethod(klass, "setRating", argTypes, term65367, args);
    }

};


