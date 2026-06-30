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

public class UserGameOptionEx_setExt8_110539248632 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term324361;
     Object term324659;

    public UserGameOptionEx_setExt8_110539248632() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term324367 = new Long(-8792567429538693571L);
        term324361 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGameOptionEx"));
        Object term324363 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term324365 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term324381 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term324382 = newInstance(Class.forName("java.time.LocalDate"));
        Object term324386 = newInstance(Class.forName("java.time.LocalTime"));
        Object term324391 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term324392 = newInstance(Class.forName("java.time.LocalDate"));
        Object term324396 = newInstance(Class.forName("java.time.LocalTime"));
        Object term324413 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term324414 = newInstance(Class.forName("java.time.LocalDate"));
        Object term324418 = newInstance(Class.forName("java.time.LocalTime"));
        Object term324474 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term324475 = newInstance(Class.forName("java.time.LocalDate"));
        Object term324479 = newInstance(Class.forName("java.time.LocalTime"));
        Object term324522 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term324523 = newInstance(Class.forName("java.time.LocalDate"));
        Object term324527 = newInstance(Class.forName("java.time.LocalTime"));
        Object term324568 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term324569 = newInstance(Class.forName("java.time.LocalDate"));
        Object term324573 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term324361, term324361.getClass(), "id", 8851868500913360L);
        setLongField(term324363, term324363.getClass(), "id", -3707459543384493521L);
        setLongField(term324365, term324365.getClass(), "id", -5137330388030558994L);
        setField(term324365, term324365.getClass(), "extId", term324367);
        setField(term324365, term324365.getClass(), "luid", "yROeoulaqm");
        setIntField(term324382, term324382.getClass(), "year", 2021);
        setShortField(term324382, term324382.getClass(), "month", (short) 12);
        setShortField(term324382, term324382.getClass(), "day", (short) 2);
        setField(term324381, term324381.getClass(), "date", term324382);
        setByteField(term324386, term324386.getClass(), "hour", (byte) 23);
        setByteField(term324386, term324386.getClass(), "minute", (byte) 45);
        setByteField(term324386, term324386.getClass(), "second", (byte) 48);
        setIntField(term324386, term324386.getClass(), "nano", 843098169);
        setField(term324381, term324381.getClass(), "time", term324386);
        setField(term324365, term324365.getClass(), "registerTime", term324381);
        setIntField(term324392, term324392.getClass(), "year", 2019);
        setShortField(term324392, term324392.getClass(), "month", (short) 7);
        setShortField(term324392, term324392.getClass(), "day", (short) 12);
        setField(term324391, term324391.getClass(), "date", term324392);
        setByteField(term324396, term324396.getClass(), "hour", (byte) 9);
        setByteField(term324396, term324396.getClass(), "minute", (byte) 18);
        setByteField(term324396, term324396.getClass(), "second", (byte) 27);
        setIntField(term324396, term324396.getClass(), "nano", 493388503);
        setField(term324391, term324391.getClass(), "time", term324396);
        setField(term324365, term324365.getClass(), "accessTime", term324391);
        setField(term324363, term324363.getClass(), "card", term324365);
        setField(term324363, term324363.getClass(), "userName", "CIUmcsCIbb");
        setIntField(term324414, term324414.getClass(), "year", 2024);
        setShortField(term324414, term324414.getClass(), "month", (short) 4);
        setShortField(term324414, term324414.getClass(), "day", (short) 9);
        setField(term324413, term324413.getClass(), "date", term324414);
        setByteField(term324418, term324418.getClass(), "hour", (byte) 1);
        setByteField(term324418, term324418.getClass(), "minute", (byte) 0);
        setByteField(term324418, term324418.getClass(), "second", (byte) 39);
        setIntField(term324418, term324418.getClass(), "nano", 627966879);
        setField(term324413, term324413.getClass(), "time", term324418);
        setField(term324363, term324363.getClass(), "lastLoginDate", term324413);
        setBooleanField(term324363, term324363.getClass(), "isWebJoin", false);
        setField(term324363, term324363.getClass(), "webLimitDate", "cxyEfrqGrT");
        setIntField(term324363, term324363.getClass(), "level", 803063031);
        setIntField(term324363, term324363.getClass(), "reincarnationNum", 832802103);
        setField(term324363, term324363.getClass(), "exp", "iNWlplKXbV");
        setLongField(term324363, term324363.getClass(), "point", 739264413560387302L);
        setLongField(term324363, term324363.getClass(), "totalPoint", -3816220264218624205L);
        setIntField(term324363, term324363.getClass(), "playCount", 2091427121);
        setIntField(term324363, term324363.getClass(), "multiPlayCount", -1709658772);
        setIntField(term324363, term324363.getClass(), "multiWinCount", -1850646714);
        setIntField(term324363, term324363.getClass(), "requestResCount", 1704468960);
        setIntField(term324363, term324363.getClass(), "acceptResCount", -299710958);
        setIntField(term324363, term324363.getClass(), "successResCount", -1806570782);
        setIntField(term324363, term324363.getClass(), "playerRating", 598628574);
        setIntField(term324363, term324363.getClass(), "highestRating", 64811427);
        setIntField(term324363, term324363.getClass(), "nameplateId", 1227631914);
        setIntField(term324363, term324363.getClass(), "frameId", 1333652434);
        setIntField(term324363, term324363.getClass(), "characterId", -1093703240);
        setIntField(term324363, term324363.getClass(), "trophyId", 468378808);
        setIntField(term324363, term324363.getClass(), "playedTutorialBit", -1470659106);
        setIntField(term324363, term324363.getClass(), "firstTutorialCancelNum", 1250265239);
        setIntField(term324363, term324363.getClass(), "masterTutorialCancelNum", -1795670477);
        setIntField(term324363, term324363.getClass(), "totalRepertoireCount", 499241052);
        setIntField(term324363, term324363.getClass(), "totalMapNum", 1118287873);
        setLongField(term324363, term324363.getClass(), "totalHiScore", -4407024508993584240L);
        setLongField(term324363, term324363.getClass(), "totalBasicHighScore", 6873819782995916960L);
        setLongField(term324363, term324363.getClass(), "totalAdvancedHighScore", 6346125030799197098L);
        setLongField(term324363, term324363.getClass(), "totalExpertHighScore", -2863919787219340696L);
        setLongField(term324363, term324363.getClass(), "totalMasterHighScore", -4732637787958111800L);
        setIntField(term324475, term324475.getClass(), "year", 2024);
        setShortField(term324475, term324475.getClass(), "month", (short) 2);
        setShortField(term324475, term324475.getClass(), "day", (short) 19);
        setField(term324474, term324474.getClass(), "date", term324475);
        setByteField(term324479, term324479.getClass(), "hour", (byte) 10);
        setByteField(term324479, term324479.getClass(), "minute", (byte) 35);
        setByteField(term324479, term324479.getClass(), "second", (byte) 42);
        setIntField(term324479, term324479.getClass(), "nano", 853824408);
        setField(term324474, term324474.getClass(), "time", term324479);
        setField(term324363, term324363.getClass(), "eventWatchedDate", term324474);
        setIntField(term324363, term324363.getClass(), "friendCount", 1164127961);
        setBooleanField(term324363, term324363.getClass(), "isMaimai", false);
        setField(term324363, term324363.getClass(), "firstGameId", "fBfqYGNHMg");
        setField(term324363, term324363.getClass(), "firstRomVersion", "EhJBVHJugj");
        setField(term324363, term324363.getClass(), "firstDataVersion", "pXLxrqAmzp");
        setIntField(term324523, term324523.getClass(), "year", 2022);
        setShortField(term324523, term324523.getClass(), "month", (short) 1);
        setShortField(term324523, term324523.getClass(), "day", (short) 14);
        setField(term324522, term324522.getClass(), "date", term324523);
        setByteField(term324527, term324527.getClass(), "hour", (byte) 16);
        setByteField(term324527, term324527.getClass(), "minute", (byte) 56);
        setByteField(term324527, term324527.getClass(), "second", (byte) 30);
        setIntField(term324527, term324527.getClass(), "nano", 413347185);
        setField(term324522, term324522.getClass(), "time", term324527);
        setField(term324363, term324363.getClass(), "firstPlayDate", term324522);
        setField(term324363, term324363.getClass(), "lastGameId", "LhWpueIEqM");
        setField(term324363, term324363.getClass(), "lastRomVersion", "ELkVeustOS");
        setField(term324363, term324363.getClass(), "lastDataVersion", "NXUwdcgoJG");
        setIntField(term324569, term324569.getClass(), "year", 2023);
        setShortField(term324569, term324569.getClass(), "month", (short) 9);
        setShortField(term324569, term324569.getClass(), "day", (short) 20);
        setField(term324568, term324568.getClass(), "date", term324569);
        setByteField(term324573, term324573.getClass(), "hour", (byte) 1);
        setByteField(term324573, term324573.getClass(), "minute", (byte) 23);
        setByteField(term324573, term324573.getClass(), "second", (byte) 43);
        setIntField(term324573, term324573.getClass(), "nano", 522878570);
        setField(term324568, term324568.getClass(), "time", term324573);
        setField(term324363, term324363.getClass(), "lastPlayDate", term324568);
        setIntField(term324363, term324363.getClass(), "lastPlaceId", 2072620854);
        setField(term324363, term324363.getClass(), "lastPlaceName", "CtWqGIvLXM");
        setField(term324363, term324363.getClass(), "lastRegionId", "Pafhaztesm");
        setField(term324363, term324363.getClass(), "lastRegionName", "mlCfQttDxD");
        setField(term324363, term324363.getClass(), "lastAllNetId", "NfgCMMnVsi");
        setField(term324363, term324363.getClass(), "lastClientId", "iDkTzOynIZ");
        setField(term324361, term324361.getClass(), "user", term324363);
        setIntField(term324361, term324361.getClass(), "ext1", -1096501716);
        setIntField(term324361, term324361.getClass(), "ext2", 705451675);
        setIntField(term324361, term324361.getClass(), "ext3", 1012015870);
        setIntField(term324361, term324361.getClass(), "ext4", 1111414939);
        setIntField(term324361, term324361.getClass(), "ext5", -209050442);
        setIntField(term324361, term324361.getClass(), "ext6", 1148172012);
        setIntField(term324361, term324361.getClass(), "ext7", -886315809);
        setIntField(term324361, term324361.getClass(), "ext8", -665144885);
        setIntField(term324361, term324361.getClass(), "ext9", -1411805876);
        setIntField(term324361, term324361.getClass(), "ext10", -522128464);
        setIntField(term324361, term324361.getClass(), "ext11", 1776987071);
        setIntField(term324361, term324361.getClass(), "ext12", 679742629);
        setIntField(term324361, term324361.getClass(), "ext13", -951606500);
        setIntField(term324361, term324361.getClass(), "ext14", 1648648355);
        setIntField(term324361, term324361.getClass(), "ext15", -1757205128);
        setIntField(term324361, term324361.getClass(), "ext16", 556277411);
        setIntField(term324361, term324361.getClass(), "ext17", -734980227);
        setIntField(term324361, term324361.getClass(), "ext18", 1184444999);
        setIntField(term324361, term324361.getClass(), "ext19", 649536758);
        setIntField(term324361, term324361.getClass(), "ext20", 572127295);
        term324659 = new Integer(-906737781);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGameOptionEx");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term324659;
        callMethod(klass, "setExt8", argTypes, term324361, args);
    }

};


