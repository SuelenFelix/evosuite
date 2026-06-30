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

public class UserGameOptionEx_setExt18_36869744742 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term328861;
     Object term329159;

    public UserGameOptionEx_setExt18_36869744742() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term328867 = new Long(6921855906793748590L);
        term328861 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGameOptionEx"));
        Object term328863 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term328865 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term328881 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term328882 = newInstance(Class.forName("java.time.LocalDate"));
        Object term328886 = newInstance(Class.forName("java.time.LocalTime"));
        Object term328891 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term328892 = newInstance(Class.forName("java.time.LocalDate"));
        Object term328896 = newInstance(Class.forName("java.time.LocalTime"));
        Object term328913 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term328914 = newInstance(Class.forName("java.time.LocalDate"));
        Object term328918 = newInstance(Class.forName("java.time.LocalTime"));
        Object term328974 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term328975 = newInstance(Class.forName("java.time.LocalDate"));
        Object term328979 = newInstance(Class.forName("java.time.LocalTime"));
        Object term329022 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term329023 = newInstance(Class.forName("java.time.LocalDate"));
        Object term329027 = newInstance(Class.forName("java.time.LocalTime"));
        Object term329068 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term329069 = newInstance(Class.forName("java.time.LocalDate"));
        Object term329073 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term328861, term328861.getClass(), "id", 1308491220938257201L);
        setLongField(term328863, term328863.getClass(), "id", -7505572726357621067L);
        setLongField(term328865, term328865.getClass(), "id", -6106805783768810845L);
        setField(term328865, term328865.getClass(), "extId", term328867);
        setField(term328865, term328865.getClass(), "luid", "wrLXJeWMsL");
        setIntField(term328882, term328882.getClass(), "year", 2016);
        setShortField(term328882, term328882.getClass(), "month", (short) 10);
        setShortField(term328882, term328882.getClass(), "day", (short) 17);
        setField(term328881, term328881.getClass(), "date", term328882);
        setByteField(term328886, term328886.getClass(), "hour", (byte) 14);
        setByteField(term328886, term328886.getClass(), "minute", (byte) 6);
        setByteField(term328886, term328886.getClass(), "second", (byte) 37);
        setIntField(term328886, term328886.getClass(), "nano", 951891416);
        setField(term328881, term328881.getClass(), "time", term328886);
        setField(term328865, term328865.getClass(), "registerTime", term328881);
        setIntField(term328892, term328892.getClass(), "year", 2015);
        setShortField(term328892, term328892.getClass(), "month", (short) 5);
        setShortField(term328892, term328892.getClass(), "day", (short) 5);
        setField(term328891, term328891.getClass(), "date", term328892);
        setByteField(term328896, term328896.getClass(), "hour", (byte) 22);
        setByteField(term328896, term328896.getClass(), "minute", (byte) 29);
        setByteField(term328896, term328896.getClass(), "second", (byte) 27);
        setIntField(term328896, term328896.getClass(), "nano", 90039577);
        setField(term328891, term328891.getClass(), "time", term328896);
        setField(term328865, term328865.getClass(), "accessTime", term328891);
        setField(term328863, term328863.getClass(), "card", term328865);
        setField(term328863, term328863.getClass(), "userName", "VhckgJdJBP");
        setIntField(term328914, term328914.getClass(), "year", 2022);
        setShortField(term328914, term328914.getClass(), "month", (short) 7);
        setShortField(term328914, term328914.getClass(), "day", (short) 4);
        setField(term328913, term328913.getClass(), "date", term328914);
        setByteField(term328918, term328918.getClass(), "hour", (byte) 3);
        setByteField(term328918, term328918.getClass(), "minute", (byte) 23);
        setByteField(term328918, term328918.getClass(), "second", (byte) 21);
        setIntField(term328918, term328918.getClass(), "nano", 680961755);
        setField(term328913, term328913.getClass(), "time", term328918);
        setField(term328863, term328863.getClass(), "lastLoginDate", term328913);
        setBooleanField(term328863, term328863.getClass(), "isWebJoin", false);
        setField(term328863, term328863.getClass(), "webLimitDate", "hYCtzoYTvH");
        setIntField(term328863, term328863.getClass(), "level", -1389883682);
        setIntField(term328863, term328863.getClass(), "reincarnationNum", -1743258736);
        setField(term328863, term328863.getClass(), "exp", "kfRcItQbtN");
        setLongField(term328863, term328863.getClass(), "point", 3214381382665107801L);
        setLongField(term328863, term328863.getClass(), "totalPoint", -7106226430278364620L);
        setIntField(term328863, term328863.getClass(), "playCount", 101489027);
        setIntField(term328863, term328863.getClass(), "multiPlayCount", 1052491077);
        setIntField(term328863, term328863.getClass(), "multiWinCount", -1816019806);
        setIntField(term328863, term328863.getClass(), "requestResCount", -256727488);
        setIntField(term328863, term328863.getClass(), "acceptResCount", -1392027006);
        setIntField(term328863, term328863.getClass(), "successResCount", 1896515313);
        setIntField(term328863, term328863.getClass(), "playerRating", -1908708729);
        setIntField(term328863, term328863.getClass(), "highestRating", -482802376);
        setIntField(term328863, term328863.getClass(), "nameplateId", -1498723051);
        setIntField(term328863, term328863.getClass(), "frameId", -1976039154);
        setIntField(term328863, term328863.getClass(), "characterId", 259116870);
        setIntField(term328863, term328863.getClass(), "trophyId", -537316856);
        setIntField(term328863, term328863.getClass(), "playedTutorialBit", -1270342663);
        setIntField(term328863, term328863.getClass(), "firstTutorialCancelNum", -1077679386);
        setIntField(term328863, term328863.getClass(), "masterTutorialCancelNum", 1168038339);
        setIntField(term328863, term328863.getClass(), "totalRepertoireCount", -1998903871);
        setIntField(term328863, term328863.getClass(), "totalMapNum", -646766143);
        setLongField(term328863, term328863.getClass(), "totalHiScore", 1387221881631678771L);
        setLongField(term328863, term328863.getClass(), "totalBasicHighScore", 5916238721449000892L);
        setLongField(term328863, term328863.getClass(), "totalAdvancedHighScore", -6635895019836817944L);
        setLongField(term328863, term328863.getClass(), "totalExpertHighScore", 313937491655292425L);
        setLongField(term328863, term328863.getClass(), "totalMasterHighScore", 2395306803372361789L);
        setIntField(term328975, term328975.getClass(), "year", 2022);
        setShortField(term328975, term328975.getClass(), "month", (short) 12);
        setShortField(term328975, term328975.getClass(), "day", (short) 28);
        setField(term328974, term328974.getClass(), "date", term328975);
        setByteField(term328979, term328979.getClass(), "hour", (byte) 12);
        setByteField(term328979, term328979.getClass(), "minute", (byte) 28);
        setByteField(term328979, term328979.getClass(), "second", (byte) 57);
        setIntField(term328979, term328979.getClass(), "nano", 175286557);
        setField(term328974, term328974.getClass(), "time", term328979);
        setField(term328863, term328863.getClass(), "eventWatchedDate", term328974);
        setIntField(term328863, term328863.getClass(), "friendCount", -2114100575);
        setBooleanField(term328863, term328863.getClass(), "isMaimai", false);
        setField(term328863, term328863.getClass(), "firstGameId", "fYaxUKcsVQ");
        setField(term328863, term328863.getClass(), "firstRomVersion", "eWZDcRfvlB");
        setField(term328863, term328863.getClass(), "firstDataVersion", "FcOqUdaewM");
        setIntField(term329023, term329023.getClass(), "year", 2024);
        setShortField(term329023, term329023.getClass(), "month", (short) 5);
        setShortField(term329023, term329023.getClass(), "day", (short) 10);
        setField(term329022, term329022.getClass(), "date", term329023);
        setByteField(term329027, term329027.getClass(), "hour", (byte) 14);
        setByteField(term329027, term329027.getClass(), "minute", (byte) 52);
        setByteField(term329027, term329027.getClass(), "second", (byte) 57);
        setIntField(term329027, term329027.getClass(), "nano", 627812202);
        setField(term329022, term329022.getClass(), "time", term329027);
        setField(term328863, term328863.getClass(), "firstPlayDate", term329022);
        setField(term328863, term328863.getClass(), "lastGameId", "nCMWfNNKRI");
        setField(term328863, term328863.getClass(), "lastRomVersion", "RNOGCUJUXh");
        setField(term328863, term328863.getClass(), "lastDataVersion", "XmTFjIFbur");
        setIntField(term329069, term329069.getClass(), "year", 2010);
        setShortField(term329069, term329069.getClass(), "month", (short) 4);
        setShortField(term329069, term329069.getClass(), "day", (short) 28);
        setField(term329068, term329068.getClass(), "date", term329069);
        setByteField(term329073, term329073.getClass(), "hour", (byte) 4);
        setByteField(term329073, term329073.getClass(), "minute", (byte) 52);
        setByteField(term329073, term329073.getClass(), "second", (byte) 42);
        setIntField(term329073, term329073.getClass(), "nano", 51177635);
        setField(term329068, term329068.getClass(), "time", term329073);
        setField(term328863, term328863.getClass(), "lastPlayDate", term329068);
        setIntField(term328863, term328863.getClass(), "lastPlaceId", 1929896302);
        setField(term328863, term328863.getClass(), "lastPlaceName", "dTboFubXEV");
        setField(term328863, term328863.getClass(), "lastRegionId", "zWYdDhOIUq");
        setField(term328863, term328863.getClass(), "lastRegionName", "kHZZLOQmnm");
        setField(term328863, term328863.getClass(), "lastAllNetId", "oshqKCgvpB");
        setField(term328863, term328863.getClass(), "lastClientId", "HJDtyPLFgE");
        setField(term328861, term328861.getClass(), "user", term328863);
        setIntField(term328861, term328861.getClass(), "ext1", 1194666880);
        setIntField(term328861, term328861.getClass(), "ext2", -19060265);
        setIntField(term328861, term328861.getClass(), "ext3", 1142946811);
        setIntField(term328861, term328861.getClass(), "ext4", 1119090923);
        setIntField(term328861, term328861.getClass(), "ext5", -1831049142);
        setIntField(term328861, term328861.getClass(), "ext6", 500481472);
        setIntField(term328861, term328861.getClass(), "ext7", 1189713463);
        setIntField(term328861, term328861.getClass(), "ext8", -2124265740);
        setIntField(term328861, term328861.getClass(), "ext9", -1323987937);
        setIntField(term328861, term328861.getClass(), "ext10", 1648984739);
        setIntField(term328861, term328861.getClass(), "ext11", -943862445);
        setIntField(term328861, term328861.getClass(), "ext12", 336759166);
        setIntField(term328861, term328861.getClass(), "ext13", 1874264137);
        setIntField(term328861, term328861.getClass(), "ext14", 459893515);
        setIntField(term328861, term328861.getClass(), "ext15", -2030419332);
        setIntField(term328861, term328861.getClass(), "ext16", 1173366554);
        setIntField(term328861, term328861.getClass(), "ext17", 1141843700);
        setIntField(term328861, term328861.getClass(), "ext18", -1254571797);
        setIntField(term328861, term328861.getClass(), "ext19", 1516402627);
        setIntField(term328861, term328861.getClass(), "ext20", -1450020194);
        term329159 = new Integer(-2093580285);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGameOptionEx");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term329159;
        callMethod(klass, "setExt18", argTypes, term328861, args);
    }

};


