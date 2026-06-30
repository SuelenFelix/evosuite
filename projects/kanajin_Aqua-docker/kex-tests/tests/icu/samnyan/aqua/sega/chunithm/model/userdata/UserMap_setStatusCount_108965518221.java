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

public class UserMap_setStatusCount_108965518221 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term288007;
     Object term288294;

    public UserMap_setStatusCount_108965518221() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term288013 = new Long(-1889784286465977825L);
        term288007 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserMap"));
        Object term288009 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term288011 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term288027 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term288028 = newInstance(Class.forName("java.time.LocalDate"));
        Object term288032 = newInstance(Class.forName("java.time.LocalTime"));
        Object term288037 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term288038 = newInstance(Class.forName("java.time.LocalDate"));
        Object term288042 = newInstance(Class.forName("java.time.LocalTime"));
        Object term288059 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term288060 = newInstance(Class.forName("java.time.LocalDate"));
        Object term288064 = newInstance(Class.forName("java.time.LocalTime"));
        Object term288120 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term288121 = newInstance(Class.forName("java.time.LocalDate"));
        Object term288125 = newInstance(Class.forName("java.time.LocalTime"));
        Object term288168 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term288169 = newInstance(Class.forName("java.time.LocalDate"));
        Object term288173 = newInstance(Class.forName("java.time.LocalTime"));
        Object term288214 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term288215 = newInstance(Class.forName("java.time.LocalDate"));
        Object term288219 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term288007, term288007.getClass(), "id", -2880696179980955672L);
        setLongField(term288009, term288009.getClass(), "id", -1549794059683791613L);
        setLongField(term288011, term288011.getClass(), "id", 5478152063012904859L);
        setField(term288011, term288011.getClass(), "extId", term288013);
        setField(term288011, term288011.getClass(), "luid", "vAYeBSSlRp");
        setIntField(term288028, term288028.getClass(), "year", 2027);
        setShortField(term288028, term288028.getClass(), "month", (short) 11);
        setShortField(term288028, term288028.getClass(), "day", (short) 18);
        setField(term288027, term288027.getClass(), "date", term288028);
        setByteField(term288032, term288032.getClass(), "hour", (byte) 7);
        setByteField(term288032, term288032.getClass(), "minute", (byte) 2);
        setByteField(term288032, term288032.getClass(), "second", (byte) 26);
        setIntField(term288032, term288032.getClass(), "nano", 85135198);
        setField(term288027, term288027.getClass(), "time", term288032);
        setField(term288011, term288011.getClass(), "registerTime", term288027);
        setIntField(term288038, term288038.getClass(), "year", 2019);
        setShortField(term288038, term288038.getClass(), "month", (short) 7);
        setShortField(term288038, term288038.getClass(), "day", (short) 18);
        setField(term288037, term288037.getClass(), "date", term288038);
        setByteField(term288042, term288042.getClass(), "hour", (byte) 20);
        setByteField(term288042, term288042.getClass(), "minute", (byte) 24);
        setByteField(term288042, term288042.getClass(), "second", (byte) 28);
        setIntField(term288042, term288042.getClass(), "nano", 797800764);
        setField(term288037, term288037.getClass(), "time", term288042);
        setField(term288011, term288011.getClass(), "accessTime", term288037);
        setField(term288009, term288009.getClass(), "card", term288011);
        setField(term288009, term288009.getClass(), "userName", "pvKNUuBUeT");
        setIntField(term288060, term288060.getClass(), "year", 2029);
        setShortField(term288060, term288060.getClass(), "month", (short) 4);
        setShortField(term288060, term288060.getClass(), "day", (short) 19);
        setField(term288059, term288059.getClass(), "date", term288060);
        setByteField(term288064, term288064.getClass(), "hour", (byte) 23);
        setByteField(term288064, term288064.getClass(), "minute", (byte) 45);
        setByteField(term288064, term288064.getClass(), "second", (byte) 31);
        setIntField(term288064, term288064.getClass(), "nano", 248753342);
        setField(term288059, term288059.getClass(), "time", term288064);
        setField(term288009, term288009.getClass(), "lastLoginDate", term288059);
        setBooleanField(term288009, term288009.getClass(), "isWebJoin", true);
        setField(term288009, term288009.getClass(), "webLimitDate", "paIiUFEXVG");
        setIntField(term288009, term288009.getClass(), "level", -1424346655);
        setIntField(term288009, term288009.getClass(), "reincarnationNum", 1992994085);
        setField(term288009, term288009.getClass(), "exp", "RhdoUtwGNW");
        setLongField(term288009, term288009.getClass(), "point", 7873468309001160488L);
        setLongField(term288009, term288009.getClass(), "totalPoint", -4872484045633343100L);
        setIntField(term288009, term288009.getClass(), "playCount", -1942011950);
        setIntField(term288009, term288009.getClass(), "multiPlayCount", -523308369);
        setIntField(term288009, term288009.getClass(), "multiWinCount", 1162627136);
        setIntField(term288009, term288009.getClass(), "requestResCount", -1275316800);
        setIntField(term288009, term288009.getClass(), "acceptResCount", 151380700);
        setIntField(term288009, term288009.getClass(), "successResCount", 1777983178);
        setIntField(term288009, term288009.getClass(), "playerRating", 823553858);
        setIntField(term288009, term288009.getClass(), "highestRating", -1875267671);
        setIntField(term288009, term288009.getClass(), "nameplateId", 1210180896);
        setIntField(term288009, term288009.getClass(), "frameId", -856709958);
        setIntField(term288009, term288009.getClass(), "characterId", 1421075755);
        setIntField(term288009, term288009.getClass(), "trophyId", 583296992);
        setIntField(term288009, term288009.getClass(), "playedTutorialBit", 303697112);
        setIntField(term288009, term288009.getClass(), "firstTutorialCancelNum", 555770564);
        setIntField(term288009, term288009.getClass(), "masterTutorialCancelNum", 715239982);
        setIntField(term288009, term288009.getClass(), "totalRepertoireCount", 615055377);
        setIntField(term288009, term288009.getClass(), "totalMapNum", -1316216263);
        setLongField(term288009, term288009.getClass(), "totalHiScore", 5054033979699834646L);
        setLongField(term288009, term288009.getClass(), "totalBasicHighScore", 658500236944944374L);
        setLongField(term288009, term288009.getClass(), "totalAdvancedHighScore", -2706892193113781197L);
        setLongField(term288009, term288009.getClass(), "totalExpertHighScore", -1192466301838383709L);
        setLongField(term288009, term288009.getClass(), "totalMasterHighScore", 1368557283066981343L);
        setIntField(term288121, term288121.getClass(), "year", 2026);
        setShortField(term288121, term288121.getClass(), "month", (short) 6);
        setShortField(term288121, term288121.getClass(), "day", (short) 15);
        setField(term288120, term288120.getClass(), "date", term288121);
        setByteField(term288125, term288125.getClass(), "hour", (byte) 14);
        setByteField(term288125, term288125.getClass(), "minute", (byte) 50);
        setByteField(term288125, term288125.getClass(), "second", (byte) 40);
        setIntField(term288125, term288125.getClass(), "nano", 637497157);
        setField(term288120, term288120.getClass(), "time", term288125);
        setField(term288009, term288009.getClass(), "eventWatchedDate", term288120);
        setIntField(term288009, term288009.getClass(), "friendCount", 1082693506);
        setBooleanField(term288009, term288009.getClass(), "isMaimai", false);
        setField(term288009, term288009.getClass(), "firstGameId", "TdPikAQSWD");
        setField(term288009, term288009.getClass(), "firstRomVersion", "czyIZPfIiS");
        setField(term288009, term288009.getClass(), "firstDataVersion", "WTSBaHJKIf");
        setIntField(term288169, term288169.getClass(), "year", 2022);
        setShortField(term288169, term288169.getClass(), "month", (short) 4);
        setShortField(term288169, term288169.getClass(), "day", (short) 19);
        setField(term288168, term288168.getClass(), "date", term288169);
        setByteField(term288173, term288173.getClass(), "hour", (byte) 21);
        setByteField(term288173, term288173.getClass(), "minute", (byte) 55);
        setByteField(term288173, term288173.getClass(), "second", (byte) 9);
        setIntField(term288173, term288173.getClass(), "nano", 654848542);
        setField(term288168, term288168.getClass(), "time", term288173);
        setField(term288009, term288009.getClass(), "firstPlayDate", term288168);
        setField(term288009, term288009.getClass(), "lastGameId", "RQXVNnHMfw");
        setField(term288009, term288009.getClass(), "lastRomVersion", "HEBNhULneC");
        setField(term288009, term288009.getClass(), "lastDataVersion", "PxUDJOUGKY");
        setIntField(term288215, term288215.getClass(), "year", 2010);
        setShortField(term288215, term288215.getClass(), "month", (short) 1);
        setShortField(term288215, term288215.getClass(), "day", (short) 27);
        setField(term288214, term288214.getClass(), "date", term288215);
        setByteField(term288219, term288219.getClass(), "hour", (byte) 8);
        setByteField(term288219, term288219.getClass(), "minute", (byte) 54);
        setByteField(term288219, term288219.getClass(), "second", (byte) 15);
        setIntField(term288219, term288219.getClass(), "nano", 850362578);
        setField(term288214, term288214.getClass(), "time", term288219);
        setField(term288009, term288009.getClass(), "lastPlayDate", term288214);
        setIntField(term288009, term288009.getClass(), "lastPlaceId", 1054381018);
        setField(term288009, term288009.getClass(), "lastPlaceName", "QHNYCCZevd");
        setField(term288009, term288009.getClass(), "lastRegionId", "jAMvrvDOhP");
        setField(term288009, term288009.getClass(), "lastRegionName", "yrDxYzmHMC");
        setField(term288009, term288009.getClass(), "lastAllNetId", "rDpoPFYXSz");
        setField(term288009, term288009.getClass(), "lastClientId", "JwCEdzoMPC");
        setField(term288007, term288007.getClass(), "user", term288009);
        setIntField(term288007, term288007.getClass(), "mapId", -220010763);
        setIntField(term288007, term288007.getClass(), "position", 1856047628);
        setBooleanField(term288007, term288007.getClass(), "isClear", true);
        setIntField(term288007, term288007.getClass(), "areaId", -2140050714);
        setIntField(term288007, term288007.getClass(), "routeNumber", 1643490260);
        setIntField(term288007, term288007.getClass(), "eventId", 160723704);
        setIntField(term288007, term288007.getClass(), "rate", 890205565);
        setIntField(term288007, term288007.getClass(), "statusCount", -1174535298);
        setBooleanField(term288007, term288007.getClass(), "isValid", false);
        term288294 = new Integer(-625809978);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserMap");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term288294;
        callMethod(klass, "setStatusCount", argTypes, term288007, args);
    }

};


