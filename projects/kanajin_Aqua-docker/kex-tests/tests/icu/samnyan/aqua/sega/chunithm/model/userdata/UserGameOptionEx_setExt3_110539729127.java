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

public class UserGameOptionEx_setExt3_110539729127 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term322111;
     Object term322409;

    public UserGameOptionEx_setExt3_110539729127() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term322117 = new Long(7065003857377879971L);
        term322111 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGameOptionEx"));
        Object term322113 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term322115 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term322131 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term322132 = newInstance(Class.forName("java.time.LocalDate"));
        Object term322136 = newInstance(Class.forName("java.time.LocalTime"));
        Object term322141 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term322142 = newInstance(Class.forName("java.time.LocalDate"));
        Object term322146 = newInstance(Class.forName("java.time.LocalTime"));
        Object term322163 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term322164 = newInstance(Class.forName("java.time.LocalDate"));
        Object term322168 = newInstance(Class.forName("java.time.LocalTime"));
        Object term322224 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term322225 = newInstance(Class.forName("java.time.LocalDate"));
        Object term322229 = newInstance(Class.forName("java.time.LocalTime"));
        Object term322272 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term322273 = newInstance(Class.forName("java.time.LocalDate"));
        Object term322277 = newInstance(Class.forName("java.time.LocalTime"));
        Object term322318 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term322319 = newInstance(Class.forName("java.time.LocalDate"));
        Object term322323 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term322111, term322111.getClass(), "id", 7962515123506514446L);
        setLongField(term322113, term322113.getClass(), "id", -930420705295888219L);
        setLongField(term322115, term322115.getClass(), "id", 7690162881822430684L);
        setField(term322115, term322115.getClass(), "extId", term322117);
        setField(term322115, term322115.getClass(), "luid", "CZZYeaxqjs");
        setIntField(term322132, term322132.getClass(), "year", 2028);
        setShortField(term322132, term322132.getClass(), "month", (short) 10);
        setShortField(term322132, term322132.getClass(), "day", (short) 2);
        setField(term322131, term322131.getClass(), "date", term322132);
        setByteField(term322136, term322136.getClass(), "hour", (byte) 2);
        setByteField(term322136, term322136.getClass(), "minute", (byte) 17);
        setByteField(term322136, term322136.getClass(), "second", (byte) 21);
        setIntField(term322136, term322136.getClass(), "nano", 126916367);
        setField(term322131, term322131.getClass(), "time", term322136);
        setField(term322115, term322115.getClass(), "registerTime", term322131);
        setIntField(term322142, term322142.getClass(), "year", 2025);
        setShortField(term322142, term322142.getClass(), "month", (short) 7);
        setShortField(term322142, term322142.getClass(), "day", (short) 13);
        setField(term322141, term322141.getClass(), "date", term322142);
        setByteField(term322146, term322146.getClass(), "hour", (byte) 14);
        setByteField(term322146, term322146.getClass(), "minute", (byte) 3);
        setByteField(term322146, term322146.getClass(), "second", (byte) 3);
        setIntField(term322146, term322146.getClass(), "nano", 351323520);
        setField(term322141, term322141.getClass(), "time", term322146);
        setField(term322115, term322115.getClass(), "accessTime", term322141);
        setField(term322113, term322113.getClass(), "card", term322115);
        setField(term322113, term322113.getClass(), "userName", "KaNkKUHQsw");
        setIntField(term322164, term322164.getClass(), "year", 2028);
        setShortField(term322164, term322164.getClass(), "month", (short) 7);
        setShortField(term322164, term322164.getClass(), "day", (short) 18);
        setField(term322163, term322163.getClass(), "date", term322164);
        setByteField(term322168, term322168.getClass(), "hour", (byte) 21);
        setByteField(term322168, term322168.getClass(), "minute", (byte) 17);
        setByteField(term322168, term322168.getClass(), "second", (byte) 49);
        setIntField(term322168, term322168.getClass(), "nano", 52477764);
        setField(term322163, term322163.getClass(), "time", term322168);
        setField(term322113, term322113.getClass(), "lastLoginDate", term322163);
        setBooleanField(term322113, term322113.getClass(), "isWebJoin", true);
        setField(term322113, term322113.getClass(), "webLimitDate", "LCbzYYPHVk");
        setIntField(term322113, term322113.getClass(), "level", 1405001659);
        setIntField(term322113, term322113.getClass(), "reincarnationNum", 1027930801);
        setField(term322113, term322113.getClass(), "exp", "KbJoSNqLbc");
        setLongField(term322113, term322113.getClass(), "point", -4703984451566281143L);
        setLongField(term322113, term322113.getClass(), "totalPoint", 7061398109330753060L);
        setIntField(term322113, term322113.getClass(), "playCount", 1644151814);
        setIntField(term322113, term322113.getClass(), "multiPlayCount", -423363909);
        setIntField(term322113, term322113.getClass(), "multiWinCount", -71168686);
        setIntField(term322113, term322113.getClass(), "requestResCount", -2020932828);
        setIntField(term322113, term322113.getClass(), "acceptResCount", 72343475);
        setIntField(term322113, term322113.getClass(), "successResCount", -1729704168);
        setIntField(term322113, term322113.getClass(), "playerRating", 1241252702);
        setIntField(term322113, term322113.getClass(), "highestRating", 882120045);
        setIntField(term322113, term322113.getClass(), "nameplateId", -1734009796);
        setIntField(term322113, term322113.getClass(), "frameId", -1222260900);
        setIntField(term322113, term322113.getClass(), "characterId", -1352047391);
        setIntField(term322113, term322113.getClass(), "trophyId", -1386981120);
        setIntField(term322113, term322113.getClass(), "playedTutorialBit", 1663576476);
        setIntField(term322113, term322113.getClass(), "firstTutorialCancelNum", 2099451652);
        setIntField(term322113, term322113.getClass(), "masterTutorialCancelNum", 625456249);
        setIntField(term322113, term322113.getClass(), "totalRepertoireCount", 1362447449);
        setIntField(term322113, term322113.getClass(), "totalMapNum", -933803674);
        setLongField(term322113, term322113.getClass(), "totalHiScore", -6015122649143491231L);
        setLongField(term322113, term322113.getClass(), "totalBasicHighScore", 1515578634841292597L);
        setLongField(term322113, term322113.getClass(), "totalAdvancedHighScore", -8712808583689900808L);
        setLongField(term322113, term322113.getClass(), "totalExpertHighScore", 2407935088272718472L);
        setLongField(term322113, term322113.getClass(), "totalMasterHighScore", -5822579006187144558L);
        setIntField(term322225, term322225.getClass(), "year", 2028);
        setShortField(term322225, term322225.getClass(), "month", (short) 12);
        setShortField(term322225, term322225.getClass(), "day", (short) 12);
        setField(term322224, term322224.getClass(), "date", term322225);
        setByteField(term322229, term322229.getClass(), "hour", (byte) 17);
        setByteField(term322229, term322229.getClass(), "minute", (byte) 31);
        setByteField(term322229, term322229.getClass(), "second", (byte) 1);
        setIntField(term322229, term322229.getClass(), "nano", 304128121);
        setField(term322224, term322224.getClass(), "time", term322229);
        setField(term322113, term322113.getClass(), "eventWatchedDate", term322224);
        setIntField(term322113, term322113.getClass(), "friendCount", -1916802044);
        setBooleanField(term322113, term322113.getClass(), "isMaimai", false);
        setField(term322113, term322113.getClass(), "firstGameId", "XizyspPIEi");
        setField(term322113, term322113.getClass(), "firstRomVersion", "JKuMejdhzA");
        setField(term322113, term322113.getClass(), "firstDataVersion", "suLlbdYAIy");
        setIntField(term322273, term322273.getClass(), "year", 2012);
        setShortField(term322273, term322273.getClass(), "month", (short) 8);
        setShortField(term322273, term322273.getClass(), "day", (short) 11);
        setField(term322272, term322272.getClass(), "date", term322273);
        setByteField(term322277, term322277.getClass(), "hour", (byte) 4);
        setByteField(term322277, term322277.getClass(), "minute", (byte) 5);
        setByteField(term322277, term322277.getClass(), "second", (byte) 26);
        setIntField(term322277, term322277.getClass(), "nano", 644735421);
        setField(term322272, term322272.getClass(), "time", term322277);
        setField(term322113, term322113.getClass(), "firstPlayDate", term322272);
        setField(term322113, term322113.getClass(), "lastGameId", "wDDbneJdEB");
        setField(term322113, term322113.getClass(), "lastRomVersion", "DbAALmmBfw");
        setField(term322113, term322113.getClass(), "lastDataVersion", "iMsKpObxTr");
        setIntField(term322319, term322319.getClass(), "year", 2028);
        setShortField(term322319, term322319.getClass(), "month", (short) 3);
        setShortField(term322319, term322319.getClass(), "day", (short) 29);
        setField(term322318, term322318.getClass(), "date", term322319);
        setByteField(term322323, term322323.getClass(), "hour", (byte) 20);
        setByteField(term322323, term322323.getClass(), "minute", (byte) 42);
        setByteField(term322323, term322323.getClass(), "second", (byte) 24);
        setIntField(term322323, term322323.getClass(), "nano", 691000162);
        setField(term322318, term322318.getClass(), "time", term322323);
        setField(term322113, term322113.getClass(), "lastPlayDate", term322318);
        setIntField(term322113, term322113.getClass(), "lastPlaceId", 2096433637);
        setField(term322113, term322113.getClass(), "lastPlaceName", "aIYplUbvHO");
        setField(term322113, term322113.getClass(), "lastRegionId", "JkaZHJDhYZ");
        setField(term322113, term322113.getClass(), "lastRegionName", "roZerEuiZa");
        setField(term322113, term322113.getClass(), "lastAllNetId", "COZVMMcYKc");
        setField(term322113, term322113.getClass(), "lastClientId", "gaGndEorGU");
        setField(term322111, term322111.getClass(), "user", term322113);
        setIntField(term322111, term322111.getClass(), "ext1", 2092295726);
        setIntField(term322111, term322111.getClass(), "ext2", -1325848090);
        setIntField(term322111, term322111.getClass(), "ext3", -275376863);
        setIntField(term322111, term322111.getClass(), "ext4", 1486576583);
        setIntField(term322111, term322111.getClass(), "ext5", 1196365284);
        setIntField(term322111, term322111.getClass(), "ext6", -1296052345);
        setIntField(term322111, term322111.getClass(), "ext7", -1741342336);
        setIntField(term322111, term322111.getClass(), "ext8", 144712107);
        setIntField(term322111, term322111.getClass(), "ext9", -348432573);
        setIntField(term322111, term322111.getClass(), "ext10", -790220684);
        setIntField(term322111, term322111.getClass(), "ext11", -1136429703);
        setIntField(term322111, term322111.getClass(), "ext12", 1641910855);
        setIntField(term322111, term322111.getClass(), "ext13", -931705492);
        setIntField(term322111, term322111.getClass(), "ext14", -1080465792);
        setIntField(term322111, term322111.getClass(), "ext15", -1135972176);
        setIntField(term322111, term322111.getClass(), "ext16", -2059730428);
        setIntField(term322111, term322111.getClass(), "ext17", -549676791);
        setIntField(term322111, term322111.getClass(), "ext18", -156722358);
        setIntField(term322111, term322111.getClass(), "ext19", 284639590);
        setIntField(term322111, term322111.getClass(), "ext20", 1183720893);
        term322409 = new Integer(-2070454841);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGameOptionEx");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term322409;
        callMethod(klass, "setExt3", argTypes, term322111, args);
    }

};


