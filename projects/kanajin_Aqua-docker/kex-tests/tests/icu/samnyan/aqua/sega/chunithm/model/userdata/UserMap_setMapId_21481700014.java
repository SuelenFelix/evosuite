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

public class UserMap_setMapId_21481700014 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term284934;
     Object term285221;

    public UserMap_setMapId_21481700014() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term284940 = new Long(6545086285386938562L);
        term284934 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserMap"));
        Object term284936 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term284938 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term284954 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term284955 = newInstance(Class.forName("java.time.LocalDate"));
        Object term284959 = newInstance(Class.forName("java.time.LocalTime"));
        Object term284964 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term284965 = newInstance(Class.forName("java.time.LocalDate"));
        Object term284969 = newInstance(Class.forName("java.time.LocalTime"));
        Object term284986 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term284987 = newInstance(Class.forName("java.time.LocalDate"));
        Object term284991 = newInstance(Class.forName("java.time.LocalTime"));
        Object term285047 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term285048 = newInstance(Class.forName("java.time.LocalDate"));
        Object term285052 = newInstance(Class.forName("java.time.LocalTime"));
        Object term285095 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term285096 = newInstance(Class.forName("java.time.LocalDate"));
        Object term285100 = newInstance(Class.forName("java.time.LocalTime"));
        Object term285141 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term285142 = newInstance(Class.forName("java.time.LocalDate"));
        Object term285146 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term284934, term284934.getClass(), "id", 6654919972937561484L);
        setLongField(term284936, term284936.getClass(), "id", -8728361429528711927L);
        setLongField(term284938, term284938.getClass(), "id", 6121525178540002640L);
        setField(term284938, term284938.getClass(), "extId", term284940);
        setField(term284938, term284938.getClass(), "luid", "eeXAgrClVJ");
        setIntField(term284955, term284955.getClass(), "year", 2014);
        setShortField(term284955, term284955.getClass(), "month", (short) 4);
        setShortField(term284955, term284955.getClass(), "day", (short) 14);
        setField(term284954, term284954.getClass(), "date", term284955);
        setByteField(term284959, term284959.getClass(), "hour", (byte) 10);
        setByteField(term284959, term284959.getClass(), "minute", (byte) 55);
        setByteField(term284959, term284959.getClass(), "second", (byte) 31);
        setIntField(term284959, term284959.getClass(), "nano", 253717396);
        setField(term284954, term284954.getClass(), "time", term284959);
        setField(term284938, term284938.getClass(), "registerTime", term284954);
        setIntField(term284965, term284965.getClass(), "year", 2021);
        setShortField(term284965, term284965.getClass(), "month", (short) 3);
        setShortField(term284965, term284965.getClass(), "day", (short) 30);
        setField(term284964, term284964.getClass(), "date", term284965);
        setByteField(term284969, term284969.getClass(), "hour", (byte) 0);
        setByteField(term284969, term284969.getClass(), "minute", (byte) 38);
        setByteField(term284969, term284969.getClass(), "second", (byte) 29);
        setIntField(term284969, term284969.getClass(), "nano", 336849885);
        setField(term284964, term284964.getClass(), "time", term284969);
        setField(term284938, term284938.getClass(), "accessTime", term284964);
        setField(term284936, term284936.getClass(), "card", term284938);
        setField(term284936, term284936.getClass(), "userName", "tRRSLRxoVF");
        setIntField(term284987, term284987.getClass(), "year", 2013);
        setShortField(term284987, term284987.getClass(), "month", (short) 3);
        setShortField(term284987, term284987.getClass(), "day", (short) 11);
        setField(term284986, term284986.getClass(), "date", term284987);
        setByteField(term284991, term284991.getClass(), "hour", (byte) 0);
        setByteField(term284991, term284991.getClass(), "minute", (byte) 17);
        setByteField(term284991, term284991.getClass(), "second", (byte) 38);
        setIntField(term284991, term284991.getClass(), "nano", 449518669);
        setField(term284986, term284986.getClass(), "time", term284991);
        setField(term284936, term284936.getClass(), "lastLoginDate", term284986);
        setBooleanField(term284936, term284936.getClass(), "isWebJoin", false);
        setField(term284936, term284936.getClass(), "webLimitDate", "rogVlsxmoq");
        setIntField(term284936, term284936.getClass(), "level", -84743336);
        setIntField(term284936, term284936.getClass(), "reincarnationNum", -1199014315);
        setField(term284936, term284936.getClass(), "exp", "PcMQxtTThd");
        setLongField(term284936, term284936.getClass(), "point", -4483971702455014477L);
        setLongField(term284936, term284936.getClass(), "totalPoint", 2256815315800053441L);
        setIntField(term284936, term284936.getClass(), "playCount", -910275560);
        setIntField(term284936, term284936.getClass(), "multiPlayCount", 1648183622);
        setIntField(term284936, term284936.getClass(), "multiWinCount", -1008570265);
        setIntField(term284936, term284936.getClass(), "requestResCount", -1462411830);
        setIntField(term284936, term284936.getClass(), "acceptResCount", 186052697);
        setIntField(term284936, term284936.getClass(), "successResCount", 554356747);
        setIntField(term284936, term284936.getClass(), "playerRating", -1090542678);
        setIntField(term284936, term284936.getClass(), "highestRating", 174422614);
        setIntField(term284936, term284936.getClass(), "nameplateId", 433230186);
        setIntField(term284936, term284936.getClass(), "frameId", -1345691314);
        setIntField(term284936, term284936.getClass(), "characterId", 705683968);
        setIntField(term284936, term284936.getClass(), "trophyId", -1433294930);
        setIntField(term284936, term284936.getClass(), "playedTutorialBit", -208376998);
        setIntField(term284936, term284936.getClass(), "firstTutorialCancelNum", -1110875685);
        setIntField(term284936, term284936.getClass(), "masterTutorialCancelNum", 1354426438);
        setIntField(term284936, term284936.getClass(), "totalRepertoireCount", 2029894030);
        setIntField(term284936, term284936.getClass(), "totalMapNum", 17901373);
        setLongField(term284936, term284936.getClass(), "totalHiScore", -4184721762429461078L);
        setLongField(term284936, term284936.getClass(), "totalBasicHighScore", -7830901670802129440L);
        setLongField(term284936, term284936.getClass(), "totalAdvancedHighScore", 7499440582286286516L);
        setLongField(term284936, term284936.getClass(), "totalExpertHighScore", 7767765320353951427L);
        setLongField(term284936, term284936.getClass(), "totalMasterHighScore", -8445460864939401881L);
        setIntField(term285048, term285048.getClass(), "year", 2026);
        setShortField(term285048, term285048.getClass(), "month", (short) 10);
        setShortField(term285048, term285048.getClass(), "day", (short) 25);
        setField(term285047, term285047.getClass(), "date", term285048);
        setByteField(term285052, term285052.getClass(), "hour", (byte) 9);
        setByteField(term285052, term285052.getClass(), "minute", (byte) 15);
        setByteField(term285052, term285052.getClass(), "second", (byte) 21);
        setIntField(term285052, term285052.getClass(), "nano", 159324862);
        setField(term285047, term285047.getClass(), "time", term285052);
        setField(term284936, term284936.getClass(), "eventWatchedDate", term285047);
        setIntField(term284936, term284936.getClass(), "friendCount", -919565215);
        setBooleanField(term284936, term284936.getClass(), "isMaimai", true);
        setField(term284936, term284936.getClass(), "firstGameId", "tlNezuIPME");
        setField(term284936, term284936.getClass(), "firstRomVersion", "tEciBFrLbF");
        setField(term284936, term284936.getClass(), "firstDataVersion", "HABvqoZbct");
        setIntField(term285096, term285096.getClass(), "year", 2026);
        setShortField(term285096, term285096.getClass(), "month", (short) 1);
        setShortField(term285096, term285096.getClass(), "day", (short) 13);
        setField(term285095, term285095.getClass(), "date", term285096);
        setByteField(term285100, term285100.getClass(), "hour", (byte) 11);
        setByteField(term285100, term285100.getClass(), "minute", (byte) 31);
        setByteField(term285100, term285100.getClass(), "second", (byte) 45);
        setIntField(term285100, term285100.getClass(), "nano", 370584621);
        setField(term285095, term285095.getClass(), "time", term285100);
        setField(term284936, term284936.getClass(), "firstPlayDate", term285095);
        setField(term284936, term284936.getClass(), "lastGameId", "CzDfpcxVwI");
        setField(term284936, term284936.getClass(), "lastRomVersion", "sUKfpEKBAS");
        setField(term284936, term284936.getClass(), "lastDataVersion", "anfAMeVVsC");
        setIntField(term285142, term285142.getClass(), "year", 2019);
        setShortField(term285142, term285142.getClass(), "month", (short) 8);
        setShortField(term285142, term285142.getClass(), "day", (short) 6);
        setField(term285141, term285141.getClass(), "date", term285142);
        setByteField(term285146, term285146.getClass(), "hour", (byte) 12);
        setByteField(term285146, term285146.getClass(), "minute", (byte) 41);
        setByteField(term285146, term285146.getClass(), "second", (byte) 22);
        setIntField(term285146, term285146.getClass(), "nano", 511421086);
        setField(term285141, term285141.getClass(), "time", term285146);
        setField(term284936, term284936.getClass(), "lastPlayDate", term285141);
        setIntField(term284936, term284936.getClass(), "lastPlaceId", 1095256626);
        setField(term284936, term284936.getClass(), "lastPlaceName", "GlIWuwNnwL");
        setField(term284936, term284936.getClass(), "lastRegionId", "HDsXonVTyY");
        setField(term284936, term284936.getClass(), "lastRegionName", "BusZaRriAA");
        setField(term284936, term284936.getClass(), "lastAllNetId", "imlbrmsABR");
        setField(term284936, term284936.getClass(), "lastClientId", "VozwaeTzwB");
        setField(term284934, term284934.getClass(), "user", term284936);
        setIntField(term284934, term284934.getClass(), "mapId", 410424321);
        setIntField(term284934, term284934.getClass(), "position", 1038671901);
        setBooleanField(term284934, term284934.getClass(), "isClear", true);
        setIntField(term284934, term284934.getClass(), "areaId", 540755284);
        setIntField(term284934, term284934.getClass(), "routeNumber", 347931231);
        setIntField(term284934, term284934.getClass(), "eventId", 1298824158);
        setIntField(term284934, term284934.getClass(), "rate", 199754542);
        setIntField(term284934, term284934.getClass(), "statusCount", -449459947);
        setBooleanField(term284934, term284934.getClass(), "isValid", true);
        term285221 = new Integer(-1061589081);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserMap");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term285221;
        callMethod(klass, "setMapId", argTypes, term284934, args);
    }

};


