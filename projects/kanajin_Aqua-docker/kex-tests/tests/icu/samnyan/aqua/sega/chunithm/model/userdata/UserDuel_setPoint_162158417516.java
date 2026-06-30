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

public class UserDuel_setPoint_162158417516 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term82405;
     Object term82701;

    public UserDuel_setPoint_162158417516() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term82411 = new Long(-4360569253593381888L);
        term82405 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserDuel"));
        Object term82407 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term82409 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term82425 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term82426 = newInstance(Class.forName("java.time.LocalDate"));
        Object term82430 = newInstance(Class.forName("java.time.LocalTime"));
        Object term82435 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term82436 = newInstance(Class.forName("java.time.LocalDate"));
        Object term82440 = newInstance(Class.forName("java.time.LocalTime"));
        Object term82457 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term82458 = newInstance(Class.forName("java.time.LocalDate"));
        Object term82462 = newInstance(Class.forName("java.time.LocalTime"));
        Object term82518 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term82519 = newInstance(Class.forName("java.time.LocalDate"));
        Object term82523 = newInstance(Class.forName("java.time.LocalTime"));
        Object term82566 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term82567 = newInstance(Class.forName("java.time.LocalDate"));
        Object term82571 = newInstance(Class.forName("java.time.LocalTime"));
        Object term82612 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term82613 = newInstance(Class.forName("java.time.LocalDate"));
        Object term82617 = newInstance(Class.forName("java.time.LocalTime"));
        Object term82687 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term82688 = newInstance(Class.forName("java.time.LocalDate"));
        Object term82692 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term82405, term82405.getClass(), "id", 9165671796313176705L);
        setLongField(term82407, term82407.getClass(), "id", 8104096721239680583L);
        setLongField(term82409, term82409.getClass(), "id", 1132566737750531256L);
        setField(term82409, term82409.getClass(), "extId", term82411);
        setField(term82409, term82409.getClass(), "luid", "ljtopXMcRl");
        setIntField(term82426, term82426.getClass(), "year", 2028);
        setShortField(term82426, term82426.getClass(), "month", (short) 2);
        setShortField(term82426, term82426.getClass(), "day", (short) 2);
        setField(term82425, term82425.getClass(), "date", term82426);
        setByteField(term82430, term82430.getClass(), "hour", (byte) 17);
        setByteField(term82430, term82430.getClass(), "minute", (byte) 55);
        setByteField(term82430, term82430.getClass(), "second", (byte) 40);
        setIntField(term82430, term82430.getClass(), "nano", 907692691);
        setField(term82425, term82425.getClass(), "time", term82430);
        setField(term82409, term82409.getClass(), "registerTime", term82425);
        setIntField(term82436, term82436.getClass(), "year", 2015);
        setShortField(term82436, term82436.getClass(), "month", (short) 4);
        setShortField(term82436, term82436.getClass(), "day", (short) 6);
        setField(term82435, term82435.getClass(), "date", term82436);
        setByteField(term82440, term82440.getClass(), "hour", (byte) 6);
        setByteField(term82440, term82440.getClass(), "minute", (byte) 39);
        setByteField(term82440, term82440.getClass(), "second", (byte) 45);
        setIntField(term82440, term82440.getClass(), "nano", 97858819);
        setField(term82435, term82435.getClass(), "time", term82440);
        setField(term82409, term82409.getClass(), "accessTime", term82435);
        setField(term82407, term82407.getClass(), "card", term82409);
        setField(term82407, term82407.getClass(), "userName", "HHtcAGkfuz");
        setIntField(term82458, term82458.getClass(), "year", 2019);
        setShortField(term82458, term82458.getClass(), "month", (short) 3);
        setShortField(term82458, term82458.getClass(), "day", (short) 3);
        setField(term82457, term82457.getClass(), "date", term82458);
        setByteField(term82462, term82462.getClass(), "hour", (byte) 2);
        setByteField(term82462, term82462.getClass(), "minute", (byte) 9);
        setByteField(term82462, term82462.getClass(), "second", (byte) 44);
        setIntField(term82462, term82462.getClass(), "nano", 690452555);
        setField(term82457, term82457.getClass(), "time", term82462);
        setField(term82407, term82407.getClass(), "lastLoginDate", term82457);
        setBooleanField(term82407, term82407.getClass(), "isWebJoin", false);
        setField(term82407, term82407.getClass(), "webLimitDate", "QZCuYHcIBC");
        setIntField(term82407, term82407.getClass(), "level", 1595800712);
        setIntField(term82407, term82407.getClass(), "reincarnationNum", -1315471137);
        setField(term82407, term82407.getClass(), "exp", "hpvoFaAyIu");
        setLongField(term82407, term82407.getClass(), "point", -3777136467668448199L);
        setLongField(term82407, term82407.getClass(), "totalPoint", 6995079656219021769L);
        setIntField(term82407, term82407.getClass(), "playCount", 307541055);
        setIntField(term82407, term82407.getClass(), "multiPlayCount", -664242488);
        setIntField(term82407, term82407.getClass(), "multiWinCount", 1562272299);
        setIntField(term82407, term82407.getClass(), "requestResCount", 961476617);
        setIntField(term82407, term82407.getClass(), "acceptResCount", -1978217643);
        setIntField(term82407, term82407.getClass(), "successResCount", 53489031);
        setIntField(term82407, term82407.getClass(), "playerRating", -1349596098);
        setIntField(term82407, term82407.getClass(), "highestRating", 490711502);
        setIntField(term82407, term82407.getClass(), "nameplateId", -1967126524);
        setIntField(term82407, term82407.getClass(), "frameId", -803436050);
        setIntField(term82407, term82407.getClass(), "characterId", 1382240540);
        setIntField(term82407, term82407.getClass(), "trophyId", -894941864);
        setIntField(term82407, term82407.getClass(), "playedTutorialBit", -1796952360);
        setIntField(term82407, term82407.getClass(), "firstTutorialCancelNum", -29580694);
        setIntField(term82407, term82407.getClass(), "masterTutorialCancelNum", -1774385073);
        setIntField(term82407, term82407.getClass(), "totalRepertoireCount", -1095327334);
        setIntField(term82407, term82407.getClass(), "totalMapNum", -401456020);
        setLongField(term82407, term82407.getClass(), "totalHiScore", 9105367613914646956L);
        setLongField(term82407, term82407.getClass(), "totalBasicHighScore", -2619427369277959894L);
        setLongField(term82407, term82407.getClass(), "totalAdvancedHighScore", -6961214062026278685L);
        setLongField(term82407, term82407.getClass(), "totalExpertHighScore", 3881903610132068684L);
        setLongField(term82407, term82407.getClass(), "totalMasterHighScore", -1517313114689915067L);
        setIntField(term82519, term82519.getClass(), "year", 2013);
        setShortField(term82519, term82519.getClass(), "month", (short) 9);
        setShortField(term82519, term82519.getClass(), "day", (short) 18);
        setField(term82518, term82518.getClass(), "date", term82519);
        setByteField(term82523, term82523.getClass(), "hour", (byte) 0);
        setByteField(term82523, term82523.getClass(), "minute", (byte) 40);
        setByteField(term82523, term82523.getClass(), "second", (byte) 5);
        setIntField(term82523, term82523.getClass(), "nano", 735661180);
        setField(term82518, term82518.getClass(), "time", term82523);
        setField(term82407, term82407.getClass(), "eventWatchedDate", term82518);
        setIntField(term82407, term82407.getClass(), "friendCount", 333219682);
        setBooleanField(term82407, term82407.getClass(), "isMaimai", false);
        setField(term82407, term82407.getClass(), "firstGameId", "dyqukIBJxC");
        setField(term82407, term82407.getClass(), "firstRomVersion", "MVMiGQdgnX");
        setField(term82407, term82407.getClass(), "firstDataVersion", "cQnJIENJHe");
        setIntField(term82567, term82567.getClass(), "year", 2024);
        setShortField(term82567, term82567.getClass(), "month", (short) 4);
        setShortField(term82567, term82567.getClass(), "day", (short) 18);
        setField(term82566, term82566.getClass(), "date", term82567);
        setByteField(term82571, term82571.getClass(), "hour", (byte) 16);
        setByteField(term82571, term82571.getClass(), "minute", (byte) 24);
        setByteField(term82571, term82571.getClass(), "second", (byte) 38);
        setIntField(term82571, term82571.getClass(), "nano", 339757581);
        setField(term82566, term82566.getClass(), "time", term82571);
        setField(term82407, term82407.getClass(), "firstPlayDate", term82566);
        setField(term82407, term82407.getClass(), "lastGameId", "ExjdCvAxlG");
        setField(term82407, term82407.getClass(), "lastRomVersion", "moMySSiBuB");
        setField(term82407, term82407.getClass(), "lastDataVersion", "iuuazALDWB");
        setIntField(term82613, term82613.getClass(), "year", 2013);
        setShortField(term82613, term82613.getClass(), "month", (short) 3);
        setShortField(term82613, term82613.getClass(), "day", (short) 23);
        setField(term82612, term82612.getClass(), "date", term82613);
        setByteField(term82617, term82617.getClass(), "hour", (byte) 11);
        setByteField(term82617, term82617.getClass(), "minute", (byte) 19);
        setByteField(term82617, term82617.getClass(), "second", (byte) 49);
        setIntField(term82617, term82617.getClass(), "nano", 671462460);
        setField(term82612, term82612.getClass(), "time", term82617);
        setField(term82407, term82407.getClass(), "lastPlayDate", term82612);
        setIntField(term82407, term82407.getClass(), "lastPlaceId", -1691293662);
        setField(term82407, term82407.getClass(), "lastPlaceName", "GqehccUels");
        setField(term82407, term82407.getClass(), "lastRegionId", "llbDGujrPe");
        setField(term82407, term82407.getClass(), "lastRegionName", "QEoeITwBfz");
        setField(term82407, term82407.getClass(), "lastAllNetId", "rWOKjAUIvS");
        setField(term82407, term82407.getClass(), "lastClientId", "IcpfsIGlDf");
        setField(term82405, term82405.getClass(), "user", term82407);
        setIntField(term82405, term82405.getClass(), "duelId", 347540813);
        setIntField(term82405, term82405.getClass(), "progress", -897042657);
        setIntField(term82405, term82405.getClass(), "point", 1519205600);
        setBooleanField(term82405, term82405.getClass(), "isClear", true);
        setIntField(term82688, term82688.getClass(), "year", 2025);
        setShortField(term82688, term82688.getClass(), "month", (short) 5);
        setShortField(term82688, term82688.getClass(), "day", (short) 12);
        setField(term82687, term82687.getClass(), "date", term82688);
        setByteField(term82692, term82692.getClass(), "hour", (byte) 14);
        setByteField(term82692, term82692.getClass(), "minute", (byte) 27);
        setByteField(term82692, term82692.getClass(), "second", (byte) 18);
        setIntField(term82692, term82692.getClass(), "nano", 530044969);
        setField(term82687, term82687.getClass(), "time", term82692);
        setField(term82405, term82405.getClass(), "lastPlayDate", term82687);
        setIntField(term82405, term82405.getClass(), "param1", 631662709);
        setIntField(term82405, term82405.getClass(), "param2", 580524853);
        setIntField(term82405, term82405.getClass(), "param3", -1436225528);
        setIntField(term82405, term82405.getClass(), "param4", -1249891722);
        term82701 = new Integer(-402850097);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserDuel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term82701;
        callMethod(klass, "setPoint", argTypes, term82405, args);
    }

};


