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

public class UserGameOptionEx_setExt11_36869072035 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term325711;
     Object term326009;

    public UserGameOptionEx_setExt11_36869072035() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term325717 = new Long(-4825509285016265943L);
        term325711 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGameOptionEx"));
        Object term325713 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term325715 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term325731 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term325732 = newInstance(Class.forName("java.time.LocalDate"));
        Object term325736 = newInstance(Class.forName("java.time.LocalTime"));
        Object term325741 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term325742 = newInstance(Class.forName("java.time.LocalDate"));
        Object term325746 = newInstance(Class.forName("java.time.LocalTime"));
        Object term325763 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term325764 = newInstance(Class.forName("java.time.LocalDate"));
        Object term325768 = newInstance(Class.forName("java.time.LocalTime"));
        Object term325824 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term325825 = newInstance(Class.forName("java.time.LocalDate"));
        Object term325829 = newInstance(Class.forName("java.time.LocalTime"));
        Object term325872 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term325873 = newInstance(Class.forName("java.time.LocalDate"));
        Object term325877 = newInstance(Class.forName("java.time.LocalTime"));
        Object term325918 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term325919 = newInstance(Class.forName("java.time.LocalDate"));
        Object term325923 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term325711, term325711.getClass(), "id", -1604620902518591106L);
        setLongField(term325713, term325713.getClass(), "id", 7040225765523952201L);
        setLongField(term325715, term325715.getClass(), "id", -2781983210471273168L);
        setField(term325715, term325715.getClass(), "extId", term325717);
        setField(term325715, term325715.getClass(), "luid", "cjzZzvSdbp");
        setIntField(term325732, term325732.getClass(), "year", 2012);
        setShortField(term325732, term325732.getClass(), "month", (short) 9);
        setShortField(term325732, term325732.getClass(), "day", (short) 21);
        setField(term325731, term325731.getClass(), "date", term325732);
        setByteField(term325736, term325736.getClass(), "hour", (byte) 1);
        setByteField(term325736, term325736.getClass(), "minute", (byte) 15);
        setByteField(term325736, term325736.getClass(), "second", (byte) 20);
        setIntField(term325736, term325736.getClass(), "nano", 180876636);
        setField(term325731, term325731.getClass(), "time", term325736);
        setField(term325715, term325715.getClass(), "registerTime", term325731);
        setIntField(term325742, term325742.getClass(), "year", 2023);
        setShortField(term325742, term325742.getClass(), "month", (short) 6);
        setShortField(term325742, term325742.getClass(), "day", (short) 6);
        setField(term325741, term325741.getClass(), "date", term325742);
        setByteField(term325746, term325746.getClass(), "hour", (byte) 10);
        setByteField(term325746, term325746.getClass(), "minute", (byte) 4);
        setByteField(term325746, term325746.getClass(), "second", (byte) 46);
        setIntField(term325746, term325746.getClass(), "nano", 18249455);
        setField(term325741, term325741.getClass(), "time", term325746);
        setField(term325715, term325715.getClass(), "accessTime", term325741);
        setField(term325713, term325713.getClass(), "card", term325715);
        setField(term325713, term325713.getClass(), "userName", "IySBbmolVR");
        setIntField(term325764, term325764.getClass(), "year", 2028);
        setShortField(term325764, term325764.getClass(), "month", (short) 9);
        setShortField(term325764, term325764.getClass(), "day", (short) 3);
        setField(term325763, term325763.getClass(), "date", term325764);
        setByteField(term325768, term325768.getClass(), "hour", (byte) 6);
        setByteField(term325768, term325768.getClass(), "minute", (byte) 31);
        setByteField(term325768, term325768.getClass(), "second", (byte) 59);
        setIntField(term325768, term325768.getClass(), "nano", 806650572);
        setField(term325763, term325763.getClass(), "time", term325768);
        setField(term325713, term325713.getClass(), "lastLoginDate", term325763);
        setBooleanField(term325713, term325713.getClass(), "isWebJoin", true);
        setField(term325713, term325713.getClass(), "webLimitDate", "TZacooIYfu");
        setIntField(term325713, term325713.getClass(), "level", -1949936263);
        setIntField(term325713, term325713.getClass(), "reincarnationNum", 2135782931);
        setField(term325713, term325713.getClass(), "exp", "tYRyfLlFwR");
        setLongField(term325713, term325713.getClass(), "point", -3906523385150190041L);
        setLongField(term325713, term325713.getClass(), "totalPoint", 5260599369554276149L);
        setIntField(term325713, term325713.getClass(), "playCount", -682620155);
        setIntField(term325713, term325713.getClass(), "multiPlayCount", 1540269372);
        setIntField(term325713, term325713.getClass(), "multiWinCount", 2079727503);
        setIntField(term325713, term325713.getClass(), "requestResCount", 162800610);
        setIntField(term325713, term325713.getClass(), "acceptResCount", -130685400);
        setIntField(term325713, term325713.getClass(), "successResCount", 733495333);
        setIntField(term325713, term325713.getClass(), "playerRating", 224926338);
        setIntField(term325713, term325713.getClass(), "highestRating", -1994228985);
        setIntField(term325713, term325713.getClass(), "nameplateId", 1359678788);
        setIntField(term325713, term325713.getClass(), "frameId", 1234464848);
        setIntField(term325713, term325713.getClass(), "characterId", 1342592274);
        setIntField(term325713, term325713.getClass(), "trophyId", 1594888304);
        setIntField(term325713, term325713.getClass(), "playedTutorialBit", -472612133);
        setIntField(term325713, term325713.getClass(), "firstTutorialCancelNum", 580127194);
        setIntField(term325713, term325713.getClass(), "masterTutorialCancelNum", 763714666);
        setIntField(term325713, term325713.getClass(), "totalRepertoireCount", 1091341986);
        setIntField(term325713, term325713.getClass(), "totalMapNum", 1965907538);
        setLongField(term325713, term325713.getClass(), "totalHiScore", 8512409455428516754L);
        setLongField(term325713, term325713.getClass(), "totalBasicHighScore", -156417672044938044L);
        setLongField(term325713, term325713.getClass(), "totalAdvancedHighScore", 1518829869108528527L);
        setLongField(term325713, term325713.getClass(), "totalExpertHighScore", 4613871478217348324L);
        setLongField(term325713, term325713.getClass(), "totalMasterHighScore", 87727912509233981L);
        setIntField(term325825, term325825.getClass(), "year", 2021);
        setShortField(term325825, term325825.getClass(), "month", (short) 1);
        setShortField(term325825, term325825.getClass(), "day", (short) 11);
        setField(term325824, term325824.getClass(), "date", term325825);
        setByteField(term325829, term325829.getClass(), "hour", (byte) 19);
        setByteField(term325829, term325829.getClass(), "minute", (byte) 40);
        setByteField(term325829, term325829.getClass(), "second", (byte) 17);
        setIntField(term325829, term325829.getClass(), "nano", 620117342);
        setField(term325824, term325824.getClass(), "time", term325829);
        setField(term325713, term325713.getClass(), "eventWatchedDate", term325824);
        setIntField(term325713, term325713.getClass(), "friendCount", 72918123);
        setBooleanField(term325713, term325713.getClass(), "isMaimai", true);
        setField(term325713, term325713.getClass(), "firstGameId", "cyzJelnZnf");
        setField(term325713, term325713.getClass(), "firstRomVersion", "fsOzUshnsb");
        setField(term325713, term325713.getClass(), "firstDataVersion", "GPQHPXZvWo");
        setIntField(term325873, term325873.getClass(), "year", 2012);
        setShortField(term325873, term325873.getClass(), "month", (short) 4);
        setShortField(term325873, term325873.getClass(), "day", (short) 3);
        setField(term325872, term325872.getClass(), "date", term325873);
        setByteField(term325877, term325877.getClass(), "hour", (byte) 13);
        setByteField(term325877, term325877.getClass(), "minute", (byte) 7);
        setByteField(term325877, term325877.getClass(), "second", (byte) 57);
        setIntField(term325877, term325877.getClass(), "nano", 477603110);
        setField(term325872, term325872.getClass(), "time", term325877);
        setField(term325713, term325713.getClass(), "firstPlayDate", term325872);
        setField(term325713, term325713.getClass(), "lastGameId", "ryfICfuPmW");
        setField(term325713, term325713.getClass(), "lastRomVersion", "MvedeYpPGN");
        setField(term325713, term325713.getClass(), "lastDataVersion", "qAHfvXErtw");
        setIntField(term325919, term325919.getClass(), "year", 2029);
        setShortField(term325919, term325919.getClass(), "month", (short) 12);
        setShortField(term325919, term325919.getClass(), "day", (short) 8);
        setField(term325918, term325918.getClass(), "date", term325919);
        setByteField(term325923, term325923.getClass(), "hour", (byte) 12);
        setByteField(term325923, term325923.getClass(), "minute", (byte) 58);
        setByteField(term325923, term325923.getClass(), "second", (byte) 53);
        setIntField(term325923, term325923.getClass(), "nano", 285281980);
        setField(term325918, term325918.getClass(), "time", term325923);
        setField(term325713, term325713.getClass(), "lastPlayDate", term325918);
        setIntField(term325713, term325713.getClass(), "lastPlaceId", -145666395);
        setField(term325713, term325713.getClass(), "lastPlaceName", "pQXxjfMbVr");
        setField(term325713, term325713.getClass(), "lastRegionId", "yvzxlTzslz");
        setField(term325713, term325713.getClass(), "lastRegionName", "WWKYyzWBuQ");
        setField(term325713, term325713.getClass(), "lastAllNetId", "JiQhYekDeJ");
        setField(term325713, term325713.getClass(), "lastClientId", "tEBKFtmwsy");
        setField(term325711, term325711.getClass(), "user", term325713);
        setIntField(term325711, term325711.getClass(), "ext1", 788738026);
        setIntField(term325711, term325711.getClass(), "ext2", -960721893);
        setIntField(term325711, term325711.getClass(), "ext3", 619168390);
        setIntField(term325711, term325711.getClass(), "ext4", 1473974676);
        setIntField(term325711, term325711.getClass(), "ext5", 83830744);
        setIntField(term325711, term325711.getClass(), "ext6", -310121450);
        setIntField(term325711, term325711.getClass(), "ext7", 869833249);
        setIntField(term325711, term325711.getClass(), "ext8", -2051296834);
        setIntField(term325711, term325711.getClass(), "ext9", 407416813);
        setIntField(term325711, term325711.getClass(), "ext10", 513307188);
        setIntField(term325711, term325711.getClass(), "ext11", 1094537848);
        setIntField(term325711, term325711.getClass(), "ext12", -100651609);
        setIntField(term325711, term325711.getClass(), "ext13", 1224321939);
        setIntField(term325711, term325711.getClass(), "ext14", 1940467037);
        setIntField(term325711, term325711.getClass(), "ext15", -847131875);
        setIntField(term325711, term325711.getClass(), "ext16", 928002389);
        setIntField(term325711, term325711.getClass(), "ext17", -274458803);
        setIntField(term325711, term325711.getClass(), "ext18", 1052072083);
        setIntField(term325711, term325711.getClass(), "ext19", 109527123);
        setIntField(term325711, term325711.getClass(), "ext20", -104430065);
        term326009 = new Integer(-1315719378);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGameOptionEx");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term326009;
        callMethod(klass, "setExt11", argTypes, term325711, args);
    }

};


