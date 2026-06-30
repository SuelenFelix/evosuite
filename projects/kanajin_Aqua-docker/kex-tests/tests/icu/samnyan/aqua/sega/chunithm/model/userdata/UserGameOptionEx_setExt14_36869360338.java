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

public class UserGameOptionEx_setExt14_36869360338 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term327061;
     Object term327359;

    public UserGameOptionEx_setExt14_36869360338() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term327067 = new Long(742593745847006219L);
        term327061 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGameOptionEx"));
        Object term327063 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term327065 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term327081 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term327082 = newInstance(Class.forName("java.time.LocalDate"));
        Object term327086 = newInstance(Class.forName("java.time.LocalTime"));
        Object term327091 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term327092 = newInstance(Class.forName("java.time.LocalDate"));
        Object term327096 = newInstance(Class.forName("java.time.LocalTime"));
        Object term327113 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term327114 = newInstance(Class.forName("java.time.LocalDate"));
        Object term327118 = newInstance(Class.forName("java.time.LocalTime"));
        Object term327174 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term327175 = newInstance(Class.forName("java.time.LocalDate"));
        Object term327179 = newInstance(Class.forName("java.time.LocalTime"));
        Object term327222 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term327223 = newInstance(Class.forName("java.time.LocalDate"));
        Object term327227 = newInstance(Class.forName("java.time.LocalTime"));
        Object term327268 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term327269 = newInstance(Class.forName("java.time.LocalDate"));
        Object term327273 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term327061, term327061.getClass(), "id", -1045165329910814240L);
        setLongField(term327063, term327063.getClass(), "id", -3331844424181822582L);
        setLongField(term327065, term327065.getClass(), "id", 5635233698057523929L);
        setField(term327065, term327065.getClass(), "extId", term327067);
        setField(term327065, term327065.getClass(), "luid", "UwaZEvHuEW");
        setIntField(term327082, term327082.getClass(), "year", 2021);
        setShortField(term327082, term327082.getClass(), "month", (short) 5);
        setShortField(term327082, term327082.getClass(), "day", (short) 17);
        setField(term327081, term327081.getClass(), "date", term327082);
        setByteField(term327086, term327086.getClass(), "hour", (byte) 12);
        setByteField(term327086, term327086.getClass(), "minute", (byte) 10);
        setByteField(term327086, term327086.getClass(), "second", (byte) 11);
        setIntField(term327086, term327086.getClass(), "nano", 470325772);
        setField(term327081, term327081.getClass(), "time", term327086);
        setField(term327065, term327065.getClass(), "registerTime", term327081);
        setIntField(term327092, term327092.getClass(), "year", 2011);
        setShortField(term327092, term327092.getClass(), "month", (short) 1);
        setShortField(term327092, term327092.getClass(), "day", (short) 6);
        setField(term327091, term327091.getClass(), "date", term327092);
        setByteField(term327096, term327096.getClass(), "hour", (byte) 13);
        setByteField(term327096, term327096.getClass(), "minute", (byte) 48);
        setByteField(term327096, term327096.getClass(), "second", (byte) 11);
        setIntField(term327096, term327096.getClass(), "nano", 145328080);
        setField(term327091, term327091.getClass(), "time", term327096);
        setField(term327065, term327065.getClass(), "accessTime", term327091);
        setField(term327063, term327063.getClass(), "card", term327065);
        setField(term327063, term327063.getClass(), "userName", "DgPLwibCes");
        setIntField(term327114, term327114.getClass(), "year", 2013);
        setShortField(term327114, term327114.getClass(), "month", (short) 7);
        setShortField(term327114, term327114.getClass(), "day", (short) 19);
        setField(term327113, term327113.getClass(), "date", term327114);
        setByteField(term327118, term327118.getClass(), "hour", (byte) 6);
        setByteField(term327118, term327118.getClass(), "minute", (byte) 45);
        setByteField(term327118, term327118.getClass(), "second", (byte) 18);
        setIntField(term327118, term327118.getClass(), "nano", 834533320);
        setField(term327113, term327113.getClass(), "time", term327118);
        setField(term327063, term327063.getClass(), "lastLoginDate", term327113);
        setBooleanField(term327063, term327063.getClass(), "isWebJoin", false);
        setField(term327063, term327063.getClass(), "webLimitDate", "MPlJZtSIPY");
        setIntField(term327063, term327063.getClass(), "level", 224578330);
        setIntField(term327063, term327063.getClass(), "reincarnationNum", 1069993938);
        setField(term327063, term327063.getClass(), "exp", "lXAoNyaPgl");
        setLongField(term327063, term327063.getClass(), "point", -8043974053102621324L);
        setLongField(term327063, term327063.getClass(), "totalPoint", -5361818889594522955L);
        setIntField(term327063, term327063.getClass(), "playCount", -197919007);
        setIntField(term327063, term327063.getClass(), "multiPlayCount", -581814935);
        setIntField(term327063, term327063.getClass(), "multiWinCount", -884782980);
        setIntField(term327063, term327063.getClass(), "requestResCount", 435645173);
        setIntField(term327063, term327063.getClass(), "acceptResCount", -2127352323);
        setIntField(term327063, term327063.getClass(), "successResCount", 2097474452);
        setIntField(term327063, term327063.getClass(), "playerRating", -1540959741);
        setIntField(term327063, term327063.getClass(), "highestRating", -415034768);
        setIntField(term327063, term327063.getClass(), "nameplateId", -747334893);
        setIntField(term327063, term327063.getClass(), "frameId", 1470042937);
        setIntField(term327063, term327063.getClass(), "characterId", 1843322163);
        setIntField(term327063, term327063.getClass(), "trophyId", -1207189934);
        setIntField(term327063, term327063.getClass(), "playedTutorialBit", -584179158);
        setIntField(term327063, term327063.getClass(), "firstTutorialCancelNum", 659001580);
        setIntField(term327063, term327063.getClass(), "masterTutorialCancelNum", -1920579818);
        setIntField(term327063, term327063.getClass(), "totalRepertoireCount", 830897826);
        setIntField(term327063, term327063.getClass(), "totalMapNum", -1718330826);
        setLongField(term327063, term327063.getClass(), "totalHiScore", 3199971317374960975L);
        setLongField(term327063, term327063.getClass(), "totalBasicHighScore", 6108766008294079173L);
        setLongField(term327063, term327063.getClass(), "totalAdvancedHighScore", 567756631408113202L);
        setLongField(term327063, term327063.getClass(), "totalExpertHighScore", -3691842816362174972L);
        setLongField(term327063, term327063.getClass(), "totalMasterHighScore", 5875644536140988550L);
        setIntField(term327175, term327175.getClass(), "year", 2018);
        setShortField(term327175, term327175.getClass(), "month", (short) 8);
        setShortField(term327175, term327175.getClass(), "day", (short) 25);
        setField(term327174, term327174.getClass(), "date", term327175);
        setByteField(term327179, term327179.getClass(), "hour", (byte) 2);
        setByteField(term327179, term327179.getClass(), "minute", (byte) 50);
        setByteField(term327179, term327179.getClass(), "second", (byte) 48);
        setIntField(term327179, term327179.getClass(), "nano", 383076233);
        setField(term327174, term327174.getClass(), "time", term327179);
        setField(term327063, term327063.getClass(), "eventWatchedDate", term327174);
        setIntField(term327063, term327063.getClass(), "friendCount", 1554100569);
        setBooleanField(term327063, term327063.getClass(), "isMaimai", true);
        setField(term327063, term327063.getClass(), "firstGameId", "nltplwQYWi");
        setField(term327063, term327063.getClass(), "firstRomVersion", "lNObKuUwLW");
        setField(term327063, term327063.getClass(), "firstDataVersion", "YiMvbxuceI");
        setIntField(term327223, term327223.getClass(), "year", 2011);
        setShortField(term327223, term327223.getClass(), "month", (short) 6);
        setShortField(term327223, term327223.getClass(), "day", (short) 1);
        setField(term327222, term327222.getClass(), "date", term327223);
        setByteField(term327227, term327227.getClass(), "hour", (byte) 18);
        setByteField(term327227, term327227.getClass(), "minute", (byte) 44);
        setByteField(term327227, term327227.getClass(), "second", (byte) 34);
        setIntField(term327227, term327227.getClass(), "nano", 650428286);
        setField(term327222, term327222.getClass(), "time", term327227);
        setField(term327063, term327063.getClass(), "firstPlayDate", term327222);
        setField(term327063, term327063.getClass(), "lastGameId", "itdajcOwPM");
        setField(term327063, term327063.getClass(), "lastRomVersion", "iNatfbDqSr");
        setField(term327063, term327063.getClass(), "lastDataVersion", "nvFBEPJXDP");
        setIntField(term327269, term327269.getClass(), "year", 2025);
        setShortField(term327269, term327269.getClass(), "month", (short) 12);
        setShortField(term327269, term327269.getClass(), "day", (short) 21);
        setField(term327268, term327268.getClass(), "date", term327269);
        setByteField(term327273, term327273.getClass(), "hour", (byte) 11);
        setByteField(term327273, term327273.getClass(), "minute", (byte) 51);
        setByteField(term327273, term327273.getClass(), "second", (byte) 4);
        setIntField(term327273, term327273.getClass(), "nano", 215133779);
        setField(term327268, term327268.getClass(), "time", term327273);
        setField(term327063, term327063.getClass(), "lastPlayDate", term327268);
        setIntField(term327063, term327063.getClass(), "lastPlaceId", 1067721242);
        setField(term327063, term327063.getClass(), "lastPlaceName", "mUquGBKYgP");
        setField(term327063, term327063.getClass(), "lastRegionId", "kWvUnnYkTB");
        setField(term327063, term327063.getClass(), "lastRegionName", "xUdwyFAEKn");
        setField(term327063, term327063.getClass(), "lastAllNetId", "SKPObQHnYm");
        setField(term327063, term327063.getClass(), "lastClientId", "ZcUGgeWFzY");
        setField(term327061, term327061.getClass(), "user", term327063);
        setIntField(term327061, term327061.getClass(), "ext1", 263716207);
        setIntField(term327061, term327061.getClass(), "ext2", -2069127270);
        setIntField(term327061, term327061.getClass(), "ext3", 603147128);
        setIntField(term327061, term327061.getClass(), "ext4", -1408041415);
        setIntField(term327061, term327061.getClass(), "ext5", 586059301);
        setIntField(term327061, term327061.getClass(), "ext6", 729168621);
        setIntField(term327061, term327061.getClass(), "ext7", -263302657);
        setIntField(term327061, term327061.getClass(), "ext8", 777129818);
        setIntField(term327061, term327061.getClass(), "ext9", 519921186);
        setIntField(term327061, term327061.getClass(), "ext10", -1237516288);
        setIntField(term327061, term327061.getClass(), "ext11", 306022424);
        setIntField(term327061, term327061.getClass(), "ext12", 1431819767);
        setIntField(term327061, term327061.getClass(), "ext13", 2057411208);
        setIntField(term327061, term327061.getClass(), "ext14", -1643323104);
        setIntField(term327061, term327061.getClass(), "ext15", -1959047852);
        setIntField(term327061, term327061.getClass(), "ext16", 1163144703);
        setIntField(term327061, term327061.getClass(), "ext17", -625762476);
        setIntField(term327061, term327061.getClass(), "ext18", 1063514775);
        setIntField(term327061, term327061.getClass(), "ext19", -1472940834);
        setIntField(term327061, term327061.getClass(), "ext20", -1001789444);
        term327359 = new Integer(-732724305);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGameOptionEx");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term327359;
        callMethod(klass, "setExt14", argTypes, term327061, args);
    }

};


