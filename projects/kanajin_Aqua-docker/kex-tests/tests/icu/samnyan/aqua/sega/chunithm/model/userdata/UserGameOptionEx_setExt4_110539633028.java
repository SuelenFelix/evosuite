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

public class UserGameOptionEx_setExt4_110539633028 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term322561;
     Object term322859;

    public UserGameOptionEx_setExt4_110539633028() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term322567 = new Long(2243864141567980599L);
        term322561 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGameOptionEx"));
        Object term322563 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term322565 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term322581 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term322582 = newInstance(Class.forName("java.time.LocalDate"));
        Object term322586 = newInstance(Class.forName("java.time.LocalTime"));
        Object term322591 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term322592 = newInstance(Class.forName("java.time.LocalDate"));
        Object term322596 = newInstance(Class.forName("java.time.LocalTime"));
        Object term322613 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term322614 = newInstance(Class.forName("java.time.LocalDate"));
        Object term322618 = newInstance(Class.forName("java.time.LocalTime"));
        Object term322674 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term322675 = newInstance(Class.forName("java.time.LocalDate"));
        Object term322679 = newInstance(Class.forName("java.time.LocalTime"));
        Object term322722 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term322723 = newInstance(Class.forName("java.time.LocalDate"));
        Object term322727 = newInstance(Class.forName("java.time.LocalTime"));
        Object term322768 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term322769 = newInstance(Class.forName("java.time.LocalDate"));
        Object term322773 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term322561, term322561.getClass(), "id", 4718014703042298733L);
        setLongField(term322563, term322563.getClass(), "id", -4136071709153486481L);
        setLongField(term322565, term322565.getClass(), "id", -7434060125622887962L);
        setField(term322565, term322565.getClass(), "extId", term322567);
        setField(term322565, term322565.getClass(), "luid", "OfFpMTyLVK");
        setIntField(term322582, term322582.getClass(), "year", 2023);
        setShortField(term322582, term322582.getClass(), "month", (short) 1);
        setShortField(term322582, term322582.getClass(), "day", (short) 20);
        setField(term322581, term322581.getClass(), "date", term322582);
        setByteField(term322586, term322586.getClass(), "hour", (byte) 1);
        setByteField(term322586, term322586.getClass(), "minute", (byte) 28);
        setByteField(term322586, term322586.getClass(), "second", (byte) 32);
        setIntField(term322586, term322586.getClass(), "nano", 438731145);
        setField(term322581, term322581.getClass(), "time", term322586);
        setField(term322565, term322565.getClass(), "registerTime", term322581);
        setIntField(term322592, term322592.getClass(), "year", 2018);
        setShortField(term322592, term322592.getClass(), "month", (short) 2);
        setShortField(term322592, term322592.getClass(), "day", (short) 3);
        setField(term322591, term322591.getClass(), "date", term322592);
        setByteField(term322596, term322596.getClass(), "hour", (byte) 12);
        setByteField(term322596, term322596.getClass(), "minute", (byte) 29);
        setByteField(term322596, term322596.getClass(), "second", (byte) 20);
        setIntField(term322596, term322596.getClass(), "nano", 438524016);
        setField(term322591, term322591.getClass(), "time", term322596);
        setField(term322565, term322565.getClass(), "accessTime", term322591);
        setField(term322563, term322563.getClass(), "card", term322565);
        setField(term322563, term322563.getClass(), "userName", "WqeYNMSjhf");
        setIntField(term322614, term322614.getClass(), "year", 2025);
        setShortField(term322614, term322614.getClass(), "month", (short) 4);
        setShortField(term322614, term322614.getClass(), "day", (short) 24);
        setField(term322613, term322613.getClass(), "date", term322614);
        setByteField(term322618, term322618.getClass(), "hour", (byte) 0);
        setByteField(term322618, term322618.getClass(), "minute", (byte) 57);
        setByteField(term322618, term322618.getClass(), "second", (byte) 2);
        setIntField(term322618, term322618.getClass(), "nano", 211135857);
        setField(term322613, term322613.getClass(), "time", term322618);
        setField(term322563, term322563.getClass(), "lastLoginDate", term322613);
        setBooleanField(term322563, term322563.getClass(), "isWebJoin", false);
        setField(term322563, term322563.getClass(), "webLimitDate", "yeKFEzsyvy");
        setIntField(term322563, term322563.getClass(), "level", -1979379044);
        setIntField(term322563, term322563.getClass(), "reincarnationNum", -819678964);
        setField(term322563, term322563.getClass(), "exp", "QdKvoTHPsd");
        setLongField(term322563, term322563.getClass(), "point", 3061844783583932944L);
        setLongField(term322563, term322563.getClass(), "totalPoint", 579647697066713042L);
        setIntField(term322563, term322563.getClass(), "playCount", 789003717);
        setIntField(term322563, term322563.getClass(), "multiPlayCount", -1194710271);
        setIntField(term322563, term322563.getClass(), "multiWinCount", 1397618451);
        setIntField(term322563, term322563.getClass(), "requestResCount", -781404647);
        setIntField(term322563, term322563.getClass(), "acceptResCount", 184970542);
        setIntField(term322563, term322563.getClass(), "successResCount", -1573176387);
        setIntField(term322563, term322563.getClass(), "playerRating", -46543611);
        setIntField(term322563, term322563.getClass(), "highestRating", -210290916);
        setIntField(term322563, term322563.getClass(), "nameplateId", 475578696);
        setIntField(term322563, term322563.getClass(), "frameId", 736182747);
        setIntField(term322563, term322563.getClass(), "characterId", -1570132066);
        setIntField(term322563, term322563.getClass(), "trophyId", 269052692);
        setIntField(term322563, term322563.getClass(), "playedTutorialBit", -1128288920);
        setIntField(term322563, term322563.getClass(), "firstTutorialCancelNum", 47526027);
        setIntField(term322563, term322563.getClass(), "masterTutorialCancelNum", -78594996);
        setIntField(term322563, term322563.getClass(), "totalRepertoireCount", 792357631);
        setIntField(term322563, term322563.getClass(), "totalMapNum", -779223318);
        setLongField(term322563, term322563.getClass(), "totalHiScore", 8047197957641770490L);
        setLongField(term322563, term322563.getClass(), "totalBasicHighScore", 390732796135404621L);
        setLongField(term322563, term322563.getClass(), "totalAdvancedHighScore", -1313429829170420807L);
        setLongField(term322563, term322563.getClass(), "totalExpertHighScore", 4646468012048228694L);
        setLongField(term322563, term322563.getClass(), "totalMasterHighScore", 1076765182729234215L);
        setIntField(term322675, term322675.getClass(), "year", 2024);
        setShortField(term322675, term322675.getClass(), "month", (short) 10);
        setShortField(term322675, term322675.getClass(), "day", (short) 15);
        setField(term322674, term322674.getClass(), "date", term322675);
        setByteField(term322679, term322679.getClass(), "hour", (byte) 1);
        setByteField(term322679, term322679.getClass(), "minute", (byte) 9);
        setByteField(term322679, term322679.getClass(), "second", (byte) 15);
        setIntField(term322679, term322679.getClass(), "nano", 83349065);
        setField(term322674, term322674.getClass(), "time", term322679);
        setField(term322563, term322563.getClass(), "eventWatchedDate", term322674);
        setIntField(term322563, term322563.getClass(), "friendCount", 1058126335);
        setBooleanField(term322563, term322563.getClass(), "isMaimai", false);
        setField(term322563, term322563.getClass(), "firstGameId", "aglgSCaSUZ");
        setField(term322563, term322563.getClass(), "firstRomVersion", "CBcAPJulAJ");
        setField(term322563, term322563.getClass(), "firstDataVersion", "OvhWHNceRd");
        setIntField(term322723, term322723.getClass(), "year", 2028);
        setShortField(term322723, term322723.getClass(), "month", (short) 6);
        setShortField(term322723, term322723.getClass(), "day", (short) 10);
        setField(term322722, term322722.getClass(), "date", term322723);
        setByteField(term322727, term322727.getClass(), "hour", (byte) 10);
        setByteField(term322727, term322727.getClass(), "minute", (byte) 20);
        setByteField(term322727, term322727.getClass(), "second", (byte) 44);
        setIntField(term322727, term322727.getClass(), "nano", 342208289);
        setField(term322722, term322722.getClass(), "time", term322727);
        setField(term322563, term322563.getClass(), "firstPlayDate", term322722);
        setField(term322563, term322563.getClass(), "lastGameId", "HklBHhsDkb");
        setField(term322563, term322563.getClass(), "lastRomVersion", "ZUfzXzppnP");
        setField(term322563, term322563.getClass(), "lastDataVersion", "JArWBUFihn");
        setIntField(term322769, term322769.getClass(), "year", 2017);
        setShortField(term322769, term322769.getClass(), "month", (short) 5);
        setShortField(term322769, term322769.getClass(), "day", (short) 13);
        setField(term322768, term322768.getClass(), "date", term322769);
        setByteField(term322773, term322773.getClass(), "hour", (byte) 7);
        setByteField(term322773, term322773.getClass(), "minute", (byte) 17);
        setByteField(term322773, term322773.getClass(), "second", (byte) 9);
        setIntField(term322773, term322773.getClass(), "nano", 439608724);
        setField(term322768, term322768.getClass(), "time", term322773);
        setField(term322563, term322563.getClass(), "lastPlayDate", term322768);
        setIntField(term322563, term322563.getClass(), "lastPlaceId", 1016877148);
        setField(term322563, term322563.getClass(), "lastPlaceName", "mxKkHWbIdc");
        setField(term322563, term322563.getClass(), "lastRegionId", "DXZXekQqdI");
        setField(term322563, term322563.getClass(), "lastRegionName", "tShkCaETwQ");
        setField(term322563, term322563.getClass(), "lastAllNetId", "wxocsXiNGF");
        setField(term322563, term322563.getClass(), "lastClientId", "EAGSkuusTi");
        setField(term322561, term322561.getClass(), "user", term322563);
        setIntField(term322561, term322561.getClass(), "ext1", -345585488);
        setIntField(term322561, term322561.getClass(), "ext2", -2075030152);
        setIntField(term322561, term322561.getClass(), "ext3", -289377183);
        setIntField(term322561, term322561.getClass(), "ext4", 1596980453);
        setIntField(term322561, term322561.getClass(), "ext5", 46546661);
        setIntField(term322561, term322561.getClass(), "ext6", 1714498443);
        setIntField(term322561, term322561.getClass(), "ext7", -1124083193);
        setIntField(term322561, term322561.getClass(), "ext8", 1318212836);
        setIntField(term322561, term322561.getClass(), "ext9", 505663128);
        setIntField(term322561, term322561.getClass(), "ext10", 1478138673);
        setIntField(term322561, term322561.getClass(), "ext11", -1274242843);
        setIntField(term322561, term322561.getClass(), "ext12", -1999242840);
        setIntField(term322561, term322561.getClass(), "ext13", 1818877333);
        setIntField(term322561, term322561.getClass(), "ext14", 827624209);
        setIntField(term322561, term322561.getClass(), "ext15", 174843203);
        setIntField(term322561, term322561.getClass(), "ext16", -706967184);
        setIntField(term322561, term322561.getClass(), "ext17", 62466636);
        setIntField(term322561, term322561.getClass(), "ext18", 1422188460);
        setIntField(term322561, term322561.getClass(), "ext19", 1515963311);
        setIntField(term322561, term322561.getClass(), "ext20", -1987619758);
        term322859 = new Integer(1289398504);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGameOptionEx");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term322859;
        callMethod(klass, "setExt4", argTypes, term322561, args);
    }

};


