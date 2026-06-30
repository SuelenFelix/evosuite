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

public class UserGameOptionEx_getExt19_157173408221 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term318991;

    public UserGameOptionEx_getExt19_157173408221() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term318997 = new Long(8499930868919012909L);
        term318991 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGameOptionEx"));
        Object term318993 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term318995 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term319011 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term319012 = newInstance(Class.forName("java.time.LocalDate"));
        Object term319016 = newInstance(Class.forName("java.time.LocalTime"));
        Object term319021 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term319022 = newInstance(Class.forName("java.time.LocalDate"));
        Object term319026 = newInstance(Class.forName("java.time.LocalTime"));
        Object term319043 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term319044 = newInstance(Class.forName("java.time.LocalDate"));
        Object term319048 = newInstance(Class.forName("java.time.LocalTime"));
        Object term319104 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term319105 = newInstance(Class.forName("java.time.LocalDate"));
        Object term319109 = newInstance(Class.forName("java.time.LocalTime"));
        Object term319152 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term319153 = newInstance(Class.forName("java.time.LocalDate"));
        Object term319157 = newInstance(Class.forName("java.time.LocalTime"));
        Object term319198 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term319199 = newInstance(Class.forName("java.time.LocalDate"));
        Object term319203 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term318991, term318991.getClass(), "id", -7493334279992579335L);
        setLongField(term318993, term318993.getClass(), "id", 2722843198104900882L);
        setLongField(term318995, term318995.getClass(), "id", -8245205007746937712L);
        setField(term318995, term318995.getClass(), "extId", term318997);
        setField(term318995, term318995.getClass(), "luid", "LLoBZeTRNx");
        setIntField(term319012, term319012.getClass(), "year", 2021);
        setShortField(term319012, term319012.getClass(), "month", (short) 5);
        setShortField(term319012, term319012.getClass(), "day", (short) 8);
        setField(term319011, term319011.getClass(), "date", term319012);
        setByteField(term319016, term319016.getClass(), "hour", (byte) 3);
        setByteField(term319016, term319016.getClass(), "minute", (byte) 54);
        setByteField(term319016, term319016.getClass(), "second", (byte) 42);
        setIntField(term319016, term319016.getClass(), "nano", 6149447);
        setField(term319011, term319011.getClass(), "time", term319016);
        setField(term318995, term318995.getClass(), "registerTime", term319011);
        setIntField(term319022, term319022.getClass(), "year", 2022);
        setShortField(term319022, term319022.getClass(), "month", (short) 3);
        setShortField(term319022, term319022.getClass(), "day", (short) 29);
        setField(term319021, term319021.getClass(), "date", term319022);
        setByteField(term319026, term319026.getClass(), "hour", (byte) 8);
        setByteField(term319026, term319026.getClass(), "minute", (byte) 26);
        setByteField(term319026, term319026.getClass(), "second", (byte) 15);
        setIntField(term319026, term319026.getClass(), "nano", 81091168);
        setField(term319021, term319021.getClass(), "time", term319026);
        setField(term318995, term318995.getClass(), "accessTime", term319021);
        setField(term318993, term318993.getClass(), "card", term318995);
        setField(term318993, term318993.getClass(), "userName", "LZXzTxEMXE");
        setIntField(term319044, term319044.getClass(), "year", 2015);
        setShortField(term319044, term319044.getClass(), "month", (short) 5);
        setShortField(term319044, term319044.getClass(), "day", (short) 4);
        setField(term319043, term319043.getClass(), "date", term319044);
        setByteField(term319048, term319048.getClass(), "hour", (byte) 4);
        setByteField(term319048, term319048.getClass(), "minute", (byte) 34);
        setByteField(term319048, term319048.getClass(), "second", (byte) 13);
        setIntField(term319048, term319048.getClass(), "nano", 87488055);
        setField(term319043, term319043.getClass(), "time", term319048);
        setField(term318993, term318993.getClass(), "lastLoginDate", term319043);
        setBooleanField(term318993, term318993.getClass(), "isWebJoin", false);
        setField(term318993, term318993.getClass(), "webLimitDate", "DTixVvtuBb");
        setIntField(term318993, term318993.getClass(), "level", 1773024551);
        setIntField(term318993, term318993.getClass(), "reincarnationNum", -1168008314);
        setField(term318993, term318993.getClass(), "exp", "HZRpEXkRHd");
        setLongField(term318993, term318993.getClass(), "point", 1527163968002418174L);
        setLongField(term318993, term318993.getClass(), "totalPoint", -1295904325279195649L);
        setIntField(term318993, term318993.getClass(), "playCount", -1880112250);
        setIntField(term318993, term318993.getClass(), "multiPlayCount", -84187747);
        setIntField(term318993, term318993.getClass(), "multiWinCount", -674794156);
        setIntField(term318993, term318993.getClass(), "requestResCount", -321760913);
        setIntField(term318993, term318993.getClass(), "acceptResCount", -99070568);
        setIntField(term318993, term318993.getClass(), "successResCount", 597463097);
        setIntField(term318993, term318993.getClass(), "playerRating", 639141268);
        setIntField(term318993, term318993.getClass(), "highestRating", 2102047934);
        setIntField(term318993, term318993.getClass(), "nameplateId", -2040700684);
        setIntField(term318993, term318993.getClass(), "frameId", -1560806486);
        setIntField(term318993, term318993.getClass(), "characterId", 1221263863);
        setIntField(term318993, term318993.getClass(), "trophyId", -2144870229);
        setIntField(term318993, term318993.getClass(), "playedTutorialBit", 552083040);
        setIntField(term318993, term318993.getClass(), "firstTutorialCancelNum", -1642633870);
        setIntField(term318993, term318993.getClass(), "masterTutorialCancelNum", -1311729867);
        setIntField(term318993, term318993.getClass(), "totalRepertoireCount", -1200285703);
        setIntField(term318993, term318993.getClass(), "totalMapNum", 1578047630);
        setLongField(term318993, term318993.getClass(), "totalHiScore", 2593739595519795592L);
        setLongField(term318993, term318993.getClass(), "totalBasicHighScore", -8080309515657845927L);
        setLongField(term318993, term318993.getClass(), "totalAdvancedHighScore", -2970858677561070814L);
        setLongField(term318993, term318993.getClass(), "totalExpertHighScore", 1629913363654370546L);
        setLongField(term318993, term318993.getClass(), "totalMasterHighScore", -7475670834842534934L);
        setIntField(term319105, term319105.getClass(), "year", 2019);
        setShortField(term319105, term319105.getClass(), "month", (short) 12);
        setShortField(term319105, term319105.getClass(), "day", (short) 2);
        setField(term319104, term319104.getClass(), "date", term319105);
        setByteField(term319109, term319109.getClass(), "hour", (byte) 14);
        setByteField(term319109, term319109.getClass(), "minute", (byte) 35);
        setByteField(term319109, term319109.getClass(), "second", (byte) 31);
        setIntField(term319109, term319109.getClass(), "nano", 115618643);
        setField(term319104, term319104.getClass(), "time", term319109);
        setField(term318993, term318993.getClass(), "eventWatchedDate", term319104);
        setIntField(term318993, term318993.getClass(), "friendCount", -266967108);
        setBooleanField(term318993, term318993.getClass(), "isMaimai", false);
        setField(term318993, term318993.getClass(), "firstGameId", "xbjtwqetFF");
        setField(term318993, term318993.getClass(), "firstRomVersion", "lPeJoACpkg");
        setField(term318993, term318993.getClass(), "firstDataVersion", "NOaxSWPYxb");
        setIntField(term319153, term319153.getClass(), "year", 2022);
        setShortField(term319153, term319153.getClass(), "month", (short) 12);
        setShortField(term319153, term319153.getClass(), "day", (short) 26);
        setField(term319152, term319152.getClass(), "date", term319153);
        setByteField(term319157, term319157.getClass(), "hour", (byte) 2);
        setByteField(term319157, term319157.getClass(), "minute", (byte) 48);
        setByteField(term319157, term319157.getClass(), "second", (byte) 16);
        setIntField(term319157, term319157.getClass(), "nano", 453174809);
        setField(term319152, term319152.getClass(), "time", term319157);
        setField(term318993, term318993.getClass(), "firstPlayDate", term319152);
        setField(term318993, term318993.getClass(), "lastGameId", "tJAeYhYvPl");
        setField(term318993, term318993.getClass(), "lastRomVersion", "PwerdBbWmr");
        setField(term318993, term318993.getClass(), "lastDataVersion", "QoaNPXGspI");
        setIntField(term319199, term319199.getClass(), "year", 2022);
        setShortField(term319199, term319199.getClass(), "month", (short) 9);
        setShortField(term319199, term319199.getClass(), "day", (short) 29);
        setField(term319198, term319198.getClass(), "date", term319199);
        setByteField(term319203, term319203.getClass(), "hour", (byte) 16);
        setByteField(term319203, term319203.getClass(), "minute", (byte) 50);
        setByteField(term319203, term319203.getClass(), "second", (byte) 40);
        setIntField(term319203, term319203.getClass(), "nano", 143469068);
        setField(term319198, term319198.getClass(), "time", term319203);
        setField(term318993, term318993.getClass(), "lastPlayDate", term319198);
        setIntField(term318993, term318993.getClass(), "lastPlaceId", -1251353595);
        setField(term318993, term318993.getClass(), "lastPlaceName", "HGsYknyqnw");
        setField(term318993, term318993.getClass(), "lastRegionId", "nSSaTIcgNB");
        setField(term318993, term318993.getClass(), "lastRegionName", "XjDbTjwIhO");
        setField(term318993, term318993.getClass(), "lastAllNetId", "zcTaqvZYPD");
        setField(term318993, term318993.getClass(), "lastClientId", "VcPYeZWbaV");
        setField(term318991, term318991.getClass(), "user", term318993);
        setIntField(term318991, term318991.getClass(), "ext1", -1106786876);
        setIntField(term318991, term318991.getClass(), "ext2", -1985822835);
        setIntField(term318991, term318991.getClass(), "ext3", -47812160);
        setIntField(term318991, term318991.getClass(), "ext4", -1473188946);
        setIntField(term318991, term318991.getClass(), "ext5", 659834492);
        setIntField(term318991, term318991.getClass(), "ext6", 1792053121);
        setIntField(term318991, term318991.getClass(), "ext7", 1546609260);
        setIntField(term318991, term318991.getClass(), "ext8", 714773981);
        setIntField(term318991, term318991.getClass(), "ext9", -1344815823);
        setIntField(term318991, term318991.getClass(), "ext10", 1199437462);
        setIntField(term318991, term318991.getClass(), "ext11", -2079545024);
        setIntField(term318991, term318991.getClass(), "ext12", -507889735);
        setIntField(term318991, term318991.getClass(), "ext13", 1324579088);
        setIntField(term318991, term318991.getClass(), "ext14", -896063951);
        setIntField(term318991, term318991.getClass(), "ext15", -1627319943);
        setIntField(term318991, term318991.getClass(), "ext16", 88183349);
        setIntField(term318991, term318991.getClass(), "ext17", -170217683);
        setIntField(term318991, term318991.getClass(), "ext18", -1344453784);
        setIntField(term318991, term318991.getClass(), "ext19", 871996273);
        setIntField(term318991, term318991.getClass(), "ext20", -1602801244);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGameOptionEx");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getExt19", argTypes, term318991, args);
    }

};


