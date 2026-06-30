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

public class UserGameOptionEx_getExt17_157173600419 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term318095;

    public UserGameOptionEx_getExt17_157173600419() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term318101 = new Long(-5304831679802174866L);
        term318095 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGameOptionEx"));
        Object term318097 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term318099 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term318115 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term318116 = newInstance(Class.forName("java.time.LocalDate"));
        Object term318120 = newInstance(Class.forName("java.time.LocalTime"));
        Object term318125 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term318126 = newInstance(Class.forName("java.time.LocalDate"));
        Object term318130 = newInstance(Class.forName("java.time.LocalTime"));
        Object term318147 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term318148 = newInstance(Class.forName("java.time.LocalDate"));
        Object term318152 = newInstance(Class.forName("java.time.LocalTime"));
        Object term318208 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term318209 = newInstance(Class.forName("java.time.LocalDate"));
        Object term318213 = newInstance(Class.forName("java.time.LocalTime"));
        Object term318256 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term318257 = newInstance(Class.forName("java.time.LocalDate"));
        Object term318261 = newInstance(Class.forName("java.time.LocalTime"));
        Object term318302 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term318303 = newInstance(Class.forName("java.time.LocalDate"));
        Object term318307 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term318095, term318095.getClass(), "id", -7660606501487991809L);
        setLongField(term318097, term318097.getClass(), "id", -875185413198895165L);
        setLongField(term318099, term318099.getClass(), "id", -5708499938823947916L);
        setField(term318099, term318099.getClass(), "extId", term318101);
        setField(term318099, term318099.getClass(), "luid", "gcqWfMAFPK");
        setIntField(term318116, term318116.getClass(), "year", 2010);
        setShortField(term318116, term318116.getClass(), "month", (short) 6);
        setShortField(term318116, term318116.getClass(), "day", (short) 20);
        setField(term318115, term318115.getClass(), "date", term318116);
        setByteField(term318120, term318120.getClass(), "hour", (byte) 21);
        setByteField(term318120, term318120.getClass(), "minute", (byte) 58);
        setByteField(term318120, term318120.getClass(), "second", (byte) 48);
        setIntField(term318120, term318120.getClass(), "nano", 542338434);
        setField(term318115, term318115.getClass(), "time", term318120);
        setField(term318099, term318099.getClass(), "registerTime", term318115);
        setIntField(term318126, term318126.getClass(), "year", 2018);
        setShortField(term318126, term318126.getClass(), "month", (short) 7);
        setShortField(term318126, term318126.getClass(), "day", (short) 15);
        setField(term318125, term318125.getClass(), "date", term318126);
        setByteField(term318130, term318130.getClass(), "hour", (byte) 6);
        setByteField(term318130, term318130.getClass(), "minute", (byte) 23);
        setByteField(term318130, term318130.getClass(), "second", (byte) 22);
        setIntField(term318130, term318130.getClass(), "nano", 315021332);
        setField(term318125, term318125.getClass(), "time", term318130);
        setField(term318099, term318099.getClass(), "accessTime", term318125);
        setField(term318097, term318097.getClass(), "card", term318099);
        setField(term318097, term318097.getClass(), "userName", "ScxLRRGgyT");
        setIntField(term318148, term318148.getClass(), "year", 2015);
        setShortField(term318148, term318148.getClass(), "month", (short) 8);
        setShortField(term318148, term318148.getClass(), "day", (short) 22);
        setField(term318147, term318147.getClass(), "date", term318148);
        setByteField(term318152, term318152.getClass(), "hour", (byte) 18);
        setByteField(term318152, term318152.getClass(), "minute", (byte) 18);
        setByteField(term318152, term318152.getClass(), "second", (byte) 35);
        setIntField(term318152, term318152.getClass(), "nano", 361791054);
        setField(term318147, term318147.getClass(), "time", term318152);
        setField(term318097, term318097.getClass(), "lastLoginDate", term318147);
        setBooleanField(term318097, term318097.getClass(), "isWebJoin", false);
        setField(term318097, term318097.getClass(), "webLimitDate", "CkxvejcJwL");
        setIntField(term318097, term318097.getClass(), "level", 523331108);
        setIntField(term318097, term318097.getClass(), "reincarnationNum", -775698607);
        setField(term318097, term318097.getClass(), "exp", "xbTYhfucaY");
        setLongField(term318097, term318097.getClass(), "point", -9187541981442771351L);
        setLongField(term318097, term318097.getClass(), "totalPoint", 378406636775614740L);
        setIntField(term318097, term318097.getClass(), "playCount", 1440414800);
        setIntField(term318097, term318097.getClass(), "multiPlayCount", -1057338580);
        setIntField(term318097, term318097.getClass(), "multiWinCount", -482687562);
        setIntField(term318097, term318097.getClass(), "requestResCount", 614734386);
        setIntField(term318097, term318097.getClass(), "acceptResCount", 1969128557);
        setIntField(term318097, term318097.getClass(), "successResCount", -735661938);
        setIntField(term318097, term318097.getClass(), "playerRating", -2094281568);
        setIntField(term318097, term318097.getClass(), "highestRating", -1335091031);
        setIntField(term318097, term318097.getClass(), "nameplateId", -99232346);
        setIntField(term318097, term318097.getClass(), "frameId", 699136563);
        setIntField(term318097, term318097.getClass(), "characterId", 147252551);
        setIntField(term318097, term318097.getClass(), "trophyId", 341079997);
        setIntField(term318097, term318097.getClass(), "playedTutorialBit", 1704594619);
        setIntField(term318097, term318097.getClass(), "firstTutorialCancelNum", -1621997613);
        setIntField(term318097, term318097.getClass(), "masterTutorialCancelNum", 194498105);
        setIntField(term318097, term318097.getClass(), "totalRepertoireCount", 228119722);
        setIntField(term318097, term318097.getClass(), "totalMapNum", 1712935684);
        setLongField(term318097, term318097.getClass(), "totalHiScore", 5961074363136430719L);
        setLongField(term318097, term318097.getClass(), "totalBasicHighScore", -1263670869958452903L);
        setLongField(term318097, term318097.getClass(), "totalAdvancedHighScore", -5356866490534317541L);
        setLongField(term318097, term318097.getClass(), "totalExpertHighScore", 4109319711713641940L);
        setLongField(term318097, term318097.getClass(), "totalMasterHighScore", 8066632021341976980L);
        setIntField(term318209, term318209.getClass(), "year", 2017);
        setShortField(term318209, term318209.getClass(), "month", (short) 9);
        setShortField(term318209, term318209.getClass(), "day", (short) 9);
        setField(term318208, term318208.getClass(), "date", term318209);
        setByteField(term318213, term318213.getClass(), "hour", (byte) 1);
        setByteField(term318213, term318213.getClass(), "minute", (byte) 6);
        setByteField(term318213, term318213.getClass(), "second", (byte) 0);
        setIntField(term318213, term318213.getClass(), "nano", 572436831);
        setField(term318208, term318208.getClass(), "time", term318213);
        setField(term318097, term318097.getClass(), "eventWatchedDate", term318208);
        setIntField(term318097, term318097.getClass(), "friendCount", -1167014426);
        setBooleanField(term318097, term318097.getClass(), "isMaimai", true);
        setField(term318097, term318097.getClass(), "firstGameId", "oOhYSsilyF");
        setField(term318097, term318097.getClass(), "firstRomVersion", "ptFtBxcggt");
        setField(term318097, term318097.getClass(), "firstDataVersion", "CNPbNDYCYT");
        setIntField(term318257, term318257.getClass(), "year", 2024);
        setShortField(term318257, term318257.getClass(), "month", (short) 3);
        setShortField(term318257, term318257.getClass(), "day", (short) 23);
        setField(term318256, term318256.getClass(), "date", term318257);
        setByteField(term318261, term318261.getClass(), "hour", (byte) 23);
        setByteField(term318261, term318261.getClass(), "minute", (byte) 39);
        setByteField(term318261, term318261.getClass(), "second", (byte) 55);
        setIntField(term318261, term318261.getClass(), "nano", 256667698);
        setField(term318256, term318256.getClass(), "time", term318261);
        setField(term318097, term318097.getClass(), "firstPlayDate", term318256);
        setField(term318097, term318097.getClass(), "lastGameId", "CmSBEaXuvA");
        setField(term318097, term318097.getClass(), "lastRomVersion", "MzZzTPvXwn");
        setField(term318097, term318097.getClass(), "lastDataVersion", "XzOajjTxbc");
        setIntField(term318303, term318303.getClass(), "year", 2016);
        setShortField(term318303, term318303.getClass(), "month", (short) 1);
        setShortField(term318303, term318303.getClass(), "day", (short) 25);
        setField(term318302, term318302.getClass(), "date", term318303);
        setByteField(term318307, term318307.getClass(), "hour", (byte) 22);
        setByteField(term318307, term318307.getClass(), "minute", (byte) 44);
        setByteField(term318307, term318307.getClass(), "second", (byte) 14);
        setIntField(term318307, term318307.getClass(), "nano", 972748409);
        setField(term318302, term318302.getClass(), "time", term318307);
        setField(term318097, term318097.getClass(), "lastPlayDate", term318302);
        setIntField(term318097, term318097.getClass(), "lastPlaceId", -1186828963);
        setField(term318097, term318097.getClass(), "lastPlaceName", "EJFxVoQvCT");
        setField(term318097, term318097.getClass(), "lastRegionId", "mrXdIpiGAF");
        setField(term318097, term318097.getClass(), "lastRegionName", "uTxhnRMNZt");
        setField(term318097, term318097.getClass(), "lastAllNetId", "qaqujvBPtP");
        setField(term318097, term318097.getClass(), "lastClientId", "ZIFZsMkyty");
        setField(term318095, term318095.getClass(), "user", term318097);
        setIntField(term318095, term318095.getClass(), "ext1", -1632065019);
        setIntField(term318095, term318095.getClass(), "ext2", 376145605);
        setIntField(term318095, term318095.getClass(), "ext3", -2056990359);
        setIntField(term318095, term318095.getClass(), "ext4", 470753899);
        setIntField(term318095, term318095.getClass(), "ext5", -969245918);
        setIntField(term318095, term318095.getClass(), "ext6", -463956795);
        setIntField(term318095, term318095.getClass(), "ext7", -1133440031);
        setIntField(term318095, term318095.getClass(), "ext8", -188396386);
        setIntField(term318095, term318095.getClass(), "ext9", -288980551);
        setIntField(term318095, term318095.getClass(), "ext10", 670193441);
        setIntField(term318095, term318095.getClass(), "ext11", 1084480415);
        setIntField(term318095, term318095.getClass(), "ext12", -256116824);
        setIntField(term318095, term318095.getClass(), "ext13", -124548665);
        setIntField(term318095, term318095.getClass(), "ext14", 1655508317);
        setIntField(term318095, term318095.getClass(), "ext15", -74173370);
        setIntField(term318095, term318095.getClass(), "ext16", -1760304154);
        setIntField(term318095, term318095.getClass(), "ext17", 107685809);
        setIntField(term318095, term318095.getClass(), "ext18", 1946075579);
        setIntField(term318095, term318095.getClass(), "ext19", -1111915638);
        setIntField(term318095, term318095.getClass(), "ext20", 663576021);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGameOptionEx");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getExt17", argTypes, term318095, args);
    }

};


