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

public class UserCourse_isSuccess_48108649311 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1918520;

    public UserCourse_isSuccess_48108649311() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1918526 = new Long(7667843194609869185L);
        term1918520 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserCourse"));
        Object term1918522 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term1918524 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term1918540 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1918541 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1918545 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1918550 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1918551 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1918555 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1918572 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1918573 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1918577 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1918633 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1918634 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1918638 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1918681 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1918682 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1918686 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1918727 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1918728 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1918732 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1918807 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1918808 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1918812 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term1918520, term1918520.getClass(), "id", 69967434617087053L);
        setLongField(term1918522, term1918522.getClass(), "id", 4979383918995514763L);
        setLongField(term1918524, term1918524.getClass(), "id", -5603910229481319184L);
        setField(term1918524, term1918524.getClass(), "extId", term1918526);
        setField(term1918524, term1918524.getClass(), "luid", "MALIGOeJiw");
        setIntField(term1918541, term1918541.getClass(), "year", 2017);
        setShortField(term1918541, term1918541.getClass(), "month", (short) 3);
        setShortField(term1918541, term1918541.getClass(), "day", (short) 12);
        setField(term1918540, term1918540.getClass(), "date", term1918541);
        setByteField(term1918545, term1918545.getClass(), "hour", (byte) 2);
        setByteField(term1918545, term1918545.getClass(), "minute", (byte) 20);
        setByteField(term1918545, term1918545.getClass(), "second", (byte) 25);
        setIntField(term1918545, term1918545.getClass(), "nano", 686491179);
        setField(term1918540, term1918540.getClass(), "time", term1918545);
        setField(term1918524, term1918524.getClass(), "registerTime", term1918540);
        setIntField(term1918551, term1918551.getClass(), "year", 2011);
        setShortField(term1918551, term1918551.getClass(), "month", (short) 6);
        setShortField(term1918551, term1918551.getClass(), "day", (short) 5);
        setField(term1918550, term1918550.getClass(), "date", term1918551);
        setByteField(term1918555, term1918555.getClass(), "hour", (byte) 13);
        setByteField(term1918555, term1918555.getClass(), "minute", (byte) 40);
        setByteField(term1918555, term1918555.getClass(), "second", (byte) 24);
        setIntField(term1918555, term1918555.getClass(), "nano", 242105491);
        setField(term1918550, term1918550.getClass(), "time", term1918555);
        setField(term1918524, term1918524.getClass(), "accessTime", term1918550);
        setField(term1918522, term1918522.getClass(), "card", term1918524);
        setField(term1918522, term1918522.getClass(), "userName", "pHRzMprqWP");
        setIntField(term1918573, term1918573.getClass(), "year", 2029);
        setShortField(term1918573, term1918573.getClass(), "month", (short) 1);
        setShortField(term1918573, term1918573.getClass(), "day", (short) 4);
        setField(term1918572, term1918572.getClass(), "date", term1918573);
        setByteField(term1918577, term1918577.getClass(), "hour", (byte) 15);
        setByteField(term1918577, term1918577.getClass(), "minute", (byte) 50);
        setByteField(term1918577, term1918577.getClass(), "second", (byte) 23);
        setIntField(term1918577, term1918577.getClass(), "nano", 532761934);
        setField(term1918572, term1918572.getClass(), "time", term1918577);
        setField(term1918522, term1918522.getClass(), "lastLoginDate", term1918572);
        setBooleanField(term1918522, term1918522.getClass(), "isWebJoin", true);
        setField(term1918522, term1918522.getClass(), "webLimitDate", "UwSiTvaovh");
        setIntField(term1918522, term1918522.getClass(), "level", -1702867822);
        setIntField(term1918522, term1918522.getClass(), "reincarnationNum", 975801571);
        setField(term1918522, term1918522.getClass(), "exp", "UeyjziSPZA");
        setLongField(term1918522, term1918522.getClass(), "point", 2279954235442225506L);
        setLongField(term1918522, term1918522.getClass(), "totalPoint", 4226655888106433035L);
        setIntField(term1918522, term1918522.getClass(), "playCount", 1384692707);
        setIntField(term1918522, term1918522.getClass(), "multiPlayCount", 1723222171);
        setIntField(term1918522, term1918522.getClass(), "multiWinCount", 1117785455);
        setIntField(term1918522, term1918522.getClass(), "requestResCount", -540021448);
        setIntField(term1918522, term1918522.getClass(), "acceptResCount", -531082471);
        setIntField(term1918522, term1918522.getClass(), "successResCount", -554688251);
        setIntField(term1918522, term1918522.getClass(), "playerRating", 253275772);
        setIntField(term1918522, term1918522.getClass(), "highestRating", -226279617);
        setIntField(term1918522, term1918522.getClass(), "nameplateId", -652581931);
        setIntField(term1918522, term1918522.getClass(), "frameId", 1220987728);
        setIntField(term1918522, term1918522.getClass(), "characterId", -1911636972);
        setIntField(term1918522, term1918522.getClass(), "trophyId", 1970466424);
        setIntField(term1918522, term1918522.getClass(), "playedTutorialBit", -1350993726);
        setIntField(term1918522, term1918522.getClass(), "firstTutorialCancelNum", -1292643971);
        setIntField(term1918522, term1918522.getClass(), "masterTutorialCancelNum", -332578660);
        setIntField(term1918522, term1918522.getClass(), "totalRepertoireCount", -753134825);
        setIntField(term1918522, term1918522.getClass(), "totalMapNum", -36812271);
        setLongField(term1918522, term1918522.getClass(), "totalHiScore", 4599554228098486387L);
        setLongField(term1918522, term1918522.getClass(), "totalBasicHighScore", 417598308250262235L);
        setLongField(term1918522, term1918522.getClass(), "totalAdvancedHighScore", -4776218698520016067L);
        setLongField(term1918522, term1918522.getClass(), "totalExpertHighScore", -6314350196654790239L);
        setLongField(term1918522, term1918522.getClass(), "totalMasterHighScore", 2848438548866008235L);
        setIntField(term1918634, term1918634.getClass(), "year", 2012);
        setShortField(term1918634, term1918634.getClass(), "month", (short) 8);
        setShortField(term1918634, term1918634.getClass(), "day", (short) 22);
        setField(term1918633, term1918633.getClass(), "date", term1918634);
        setByteField(term1918638, term1918638.getClass(), "hour", (byte) 0);
        setByteField(term1918638, term1918638.getClass(), "minute", (byte) 23);
        setByteField(term1918638, term1918638.getClass(), "second", (byte) 20);
        setIntField(term1918638, term1918638.getClass(), "nano", 985829034);
        setField(term1918633, term1918633.getClass(), "time", term1918638);
        setField(term1918522, term1918522.getClass(), "eventWatchedDate", term1918633);
        setIntField(term1918522, term1918522.getClass(), "friendCount", 830717235);
        setBooleanField(term1918522, term1918522.getClass(), "isMaimai", false);
        setField(term1918522, term1918522.getClass(), "firstGameId", "OXzxXWlIGN");
        setField(term1918522, term1918522.getClass(), "firstRomVersion", "QIHkGsifmd");
        setField(term1918522, term1918522.getClass(), "firstDataVersion", "dZpDSSNnDB");
        setIntField(term1918682, term1918682.getClass(), "year", 2020);
        setShortField(term1918682, term1918682.getClass(), "month", (short) 2);
        setShortField(term1918682, term1918682.getClass(), "day", (short) 18);
        setField(term1918681, term1918681.getClass(), "date", term1918682);
        setByteField(term1918686, term1918686.getClass(), "hour", (byte) 13);
        setByteField(term1918686, term1918686.getClass(), "minute", (byte) 15);
        setByteField(term1918686, term1918686.getClass(), "second", (byte) 35);
        setIntField(term1918686, term1918686.getClass(), "nano", 316105510);
        setField(term1918681, term1918681.getClass(), "time", term1918686);
        setField(term1918522, term1918522.getClass(), "firstPlayDate", term1918681);
        setField(term1918522, term1918522.getClass(), "lastGameId", "MYeoZGGAvn");
        setField(term1918522, term1918522.getClass(), "lastRomVersion", "AOvzHUZDeS");
        setField(term1918522, term1918522.getClass(), "lastDataVersion", "ONSxOrXyBo");
        setIntField(term1918728, term1918728.getClass(), "year", 2018);
        setShortField(term1918728, term1918728.getClass(), "month", (short) 7);
        setShortField(term1918728, term1918728.getClass(), "day", (short) 25);
        setField(term1918727, term1918727.getClass(), "date", term1918728);
        setByteField(term1918732, term1918732.getClass(), "hour", (byte) 13);
        setByteField(term1918732, term1918732.getClass(), "minute", (byte) 13);
        setByteField(term1918732, term1918732.getClass(), "second", (byte) 54);
        setIntField(term1918732, term1918732.getClass(), "nano", 790553110);
        setField(term1918727, term1918727.getClass(), "time", term1918732);
        setField(term1918522, term1918522.getClass(), "lastPlayDate", term1918727);
        setIntField(term1918522, term1918522.getClass(), "lastPlaceId", -508612343);
        setField(term1918522, term1918522.getClass(), "lastPlaceName", "tYsZvqxhbc");
        setField(term1918522, term1918522.getClass(), "lastRegionId", "HEZFJLWraV");
        setField(term1918522, term1918522.getClass(), "lastRegionName", "jVMMeJiuWq");
        setField(term1918522, term1918522.getClass(), "lastAllNetId", "OhGbbuISYl");
        setField(term1918522, term1918522.getClass(), "lastClientId", "YJEvTvzqHh");
        setField(term1918520, term1918520.getClass(), "user", term1918522);
        setIntField(term1918520, term1918520.getClass(), "courseId", -1015333313);
        setIntField(term1918520, term1918520.getClass(), "classId", -1631950948);
        setIntField(term1918520, term1918520.getClass(), "playCount", 1572659483);
        setIntField(term1918520, term1918520.getClass(), "scoreMax", -235627100);
        setBooleanField(term1918520, term1918520.getClass(), "isFullCombo", true);
        setBooleanField(term1918520, term1918520.getClass(), "isAllJustice", false);
        setBooleanField(term1918520, term1918520.getClass(), "isSuccess", false);
        setIntField(term1918520, term1918520.getClass(), "scoreRank", 1427264880);
        setIntField(term1918520, term1918520.getClass(), "eventId", -1363091122);
        setIntField(term1918808, term1918808.getClass(), "year", 2017);
        setShortField(term1918808, term1918808.getClass(), "month", (short) 12);
        setShortField(term1918808, term1918808.getClass(), "day", (short) 8);
        setField(term1918807, term1918807.getClass(), "date", term1918808);
        setByteField(term1918812, term1918812.getClass(), "hour", (byte) 23);
        setByteField(term1918812, term1918812.getClass(), "minute", (byte) 12);
        setByteField(term1918812, term1918812.getClass(), "second", (byte) 22);
        setIntField(term1918812, term1918812.getClass(), "nano", 646791947);
        setField(term1918807, term1918807.getClass(), "time", term1918812);
        setField(term1918520, term1918520.getClass(), "lastPlayDate", term1918807);
        setIntField(term1918520, term1918520.getClass(), "param1", 530113387);
        setIntField(term1918520, term1918520.getClass(), "param2", 2134092561);
        setIntField(term1918520, term1918520.getClass(), "param3", 1454125372);
        setIntField(term1918520, term1918520.getClass(), "param4", -1156148799);
        setBooleanField(term1918520, term1918520.getClass(), "isClear", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserCourse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isSuccess", argTypes, term1918520, args);
    }

};


