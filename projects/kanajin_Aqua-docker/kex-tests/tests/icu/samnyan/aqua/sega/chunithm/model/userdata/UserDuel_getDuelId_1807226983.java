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

public class UserDuel_getDuelId_1807226983 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term76175;

    public UserDuel_getDuelId_1807226983() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term76181 = new Long(7495904023107549024L);
        term76175 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserDuel"));
        Object term76177 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term76179 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term76195 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term76196 = newInstance(Class.forName("java.time.LocalDate"));
        Object term76200 = newInstance(Class.forName("java.time.LocalTime"));
        Object term76205 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term76206 = newInstance(Class.forName("java.time.LocalDate"));
        Object term76210 = newInstance(Class.forName("java.time.LocalTime"));
        Object term76227 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term76228 = newInstance(Class.forName("java.time.LocalDate"));
        Object term76232 = newInstance(Class.forName("java.time.LocalTime"));
        Object term76288 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term76289 = newInstance(Class.forName("java.time.LocalDate"));
        Object term76293 = newInstance(Class.forName("java.time.LocalTime"));
        Object term76336 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term76337 = newInstance(Class.forName("java.time.LocalDate"));
        Object term76341 = newInstance(Class.forName("java.time.LocalTime"));
        Object term76382 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term76383 = newInstance(Class.forName("java.time.LocalDate"));
        Object term76387 = newInstance(Class.forName("java.time.LocalTime"));
        Object term76457 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term76458 = newInstance(Class.forName("java.time.LocalDate"));
        Object term76462 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term76175, term76175.getClass(), "id", -2509873143781504715L);
        setLongField(term76177, term76177.getClass(), "id", -4904759676997645613L);
        setLongField(term76179, term76179.getClass(), "id", -2640287313269620296L);
        setField(term76179, term76179.getClass(), "extId", term76181);
        setField(term76179, term76179.getClass(), "luid", "pSDSdAjceB");
        setIntField(term76196, term76196.getClass(), "year", 2029);
        setShortField(term76196, term76196.getClass(), "month", (short) 7);
        setShortField(term76196, term76196.getClass(), "day", (short) 8);
        setField(term76195, term76195.getClass(), "date", term76196);
        setByteField(term76200, term76200.getClass(), "hour", (byte) 17);
        setByteField(term76200, term76200.getClass(), "minute", (byte) 0);
        setByteField(term76200, term76200.getClass(), "second", (byte) 26);
        setIntField(term76200, term76200.getClass(), "nano", 789866170);
        setField(term76195, term76195.getClass(), "time", term76200);
        setField(term76179, term76179.getClass(), "registerTime", term76195);
        setIntField(term76206, term76206.getClass(), "year", 2010);
        setShortField(term76206, term76206.getClass(), "month", (short) 3);
        setShortField(term76206, term76206.getClass(), "day", (short) 28);
        setField(term76205, term76205.getClass(), "date", term76206);
        setByteField(term76210, term76210.getClass(), "hour", (byte) 22);
        setByteField(term76210, term76210.getClass(), "minute", (byte) 36);
        setByteField(term76210, term76210.getClass(), "second", (byte) 47);
        setIntField(term76210, term76210.getClass(), "nano", 84020683);
        setField(term76205, term76205.getClass(), "time", term76210);
        setField(term76179, term76179.getClass(), "accessTime", term76205);
        setField(term76177, term76177.getClass(), "card", term76179);
        setField(term76177, term76177.getClass(), "userName", "TGMaCYOqml");
        setIntField(term76228, term76228.getClass(), "year", 2011);
        setShortField(term76228, term76228.getClass(), "month", (short) 12);
        setShortField(term76228, term76228.getClass(), "day", (short) 6);
        setField(term76227, term76227.getClass(), "date", term76228);
        setByteField(term76232, term76232.getClass(), "hour", (byte) 21);
        setByteField(term76232, term76232.getClass(), "minute", (byte) 3);
        setByteField(term76232, term76232.getClass(), "second", (byte) 28);
        setIntField(term76232, term76232.getClass(), "nano", 650612376);
        setField(term76227, term76227.getClass(), "time", term76232);
        setField(term76177, term76177.getClass(), "lastLoginDate", term76227);
        setBooleanField(term76177, term76177.getClass(), "isWebJoin", false);
        setField(term76177, term76177.getClass(), "webLimitDate", "btqCBRPcNd");
        setIntField(term76177, term76177.getClass(), "level", -263665532);
        setIntField(term76177, term76177.getClass(), "reincarnationNum", -662026247);
        setField(term76177, term76177.getClass(), "exp", "LEbiLyVKDG");
        setLongField(term76177, term76177.getClass(), "point", -6079558432202737241L);
        setLongField(term76177, term76177.getClass(), "totalPoint", -3787130598270460761L);
        setIntField(term76177, term76177.getClass(), "playCount", -549576351);
        setIntField(term76177, term76177.getClass(), "multiPlayCount", 903450678);
        setIntField(term76177, term76177.getClass(), "multiWinCount", -923344894);
        setIntField(term76177, term76177.getClass(), "requestResCount", 1165279948);
        setIntField(term76177, term76177.getClass(), "acceptResCount", 842516803);
        setIntField(term76177, term76177.getClass(), "successResCount", -1562310043);
        setIntField(term76177, term76177.getClass(), "playerRating", 57936993);
        setIntField(term76177, term76177.getClass(), "highestRating", -1963541241);
        setIntField(term76177, term76177.getClass(), "nameplateId", 148495350);
        setIntField(term76177, term76177.getClass(), "frameId", 258478328);
        setIntField(term76177, term76177.getClass(), "characterId", 1079181683);
        setIntField(term76177, term76177.getClass(), "trophyId", 62795043);
        setIntField(term76177, term76177.getClass(), "playedTutorialBit", 700442161);
        setIntField(term76177, term76177.getClass(), "firstTutorialCancelNum", 1901393171);
        setIntField(term76177, term76177.getClass(), "masterTutorialCancelNum", -1708841585);
        setIntField(term76177, term76177.getClass(), "totalRepertoireCount", -704298059);
        setIntField(term76177, term76177.getClass(), "totalMapNum", 1963830726);
        setLongField(term76177, term76177.getClass(), "totalHiScore", 3458780357847556173L);
        setLongField(term76177, term76177.getClass(), "totalBasicHighScore", -252234842640503104L);
        setLongField(term76177, term76177.getClass(), "totalAdvancedHighScore", -4237738930912633869L);
        setLongField(term76177, term76177.getClass(), "totalExpertHighScore", -3539678318307233375L);
        setLongField(term76177, term76177.getClass(), "totalMasterHighScore", -256569768909962991L);
        setIntField(term76289, term76289.getClass(), "year", 2025);
        setShortField(term76289, term76289.getClass(), "month", (short) 1);
        setShortField(term76289, term76289.getClass(), "day", (short) 2);
        setField(term76288, term76288.getClass(), "date", term76289);
        setByteField(term76293, term76293.getClass(), "hour", (byte) 12);
        setByteField(term76293, term76293.getClass(), "minute", (byte) 18);
        setByteField(term76293, term76293.getClass(), "second", (byte) 4);
        setIntField(term76293, term76293.getClass(), "nano", 249732001);
        setField(term76288, term76288.getClass(), "time", term76293);
        setField(term76177, term76177.getClass(), "eventWatchedDate", term76288);
        setIntField(term76177, term76177.getClass(), "friendCount", -1467028089);
        setBooleanField(term76177, term76177.getClass(), "isMaimai", false);
        setField(term76177, term76177.getClass(), "firstGameId", "PzUzEwZhUT");
        setField(term76177, term76177.getClass(), "firstRomVersion", "bJKvwEFeLG");
        setField(term76177, term76177.getClass(), "firstDataVersion", "MQzXbKeQIa");
        setIntField(term76337, term76337.getClass(), "year", 2011);
        setShortField(term76337, term76337.getClass(), "month", (short) 4);
        setShortField(term76337, term76337.getClass(), "day", (short) 14);
        setField(term76336, term76336.getClass(), "date", term76337);
        setByteField(term76341, term76341.getClass(), "hour", (byte) 4);
        setByteField(term76341, term76341.getClass(), "minute", (byte) 35);
        setByteField(term76341, term76341.getClass(), "second", (byte) 21);
        setIntField(term76341, term76341.getClass(), "nano", 578174822);
        setField(term76336, term76336.getClass(), "time", term76341);
        setField(term76177, term76177.getClass(), "firstPlayDate", term76336);
        setField(term76177, term76177.getClass(), "lastGameId", "YHDwlXeRTi");
        setField(term76177, term76177.getClass(), "lastRomVersion", "WIJiLZqEqc");
        setField(term76177, term76177.getClass(), "lastDataVersion", "OuZMVgPpoE");
        setIntField(term76383, term76383.getClass(), "year", 2028);
        setShortField(term76383, term76383.getClass(), "month", (short) 2);
        setShortField(term76383, term76383.getClass(), "day", (short) 8);
        setField(term76382, term76382.getClass(), "date", term76383);
        setByteField(term76387, term76387.getClass(), "hour", (byte) 9);
        setByteField(term76387, term76387.getClass(), "minute", (byte) 51);
        setByteField(term76387, term76387.getClass(), "second", (byte) 30);
        setIntField(term76387, term76387.getClass(), "nano", 433905289);
        setField(term76382, term76382.getClass(), "time", term76387);
        setField(term76177, term76177.getClass(), "lastPlayDate", term76382);
        setIntField(term76177, term76177.getClass(), "lastPlaceId", -714190515);
        setField(term76177, term76177.getClass(), "lastPlaceName", "nDUyFfanYp");
        setField(term76177, term76177.getClass(), "lastRegionId", "hYmQxPxTFd");
        setField(term76177, term76177.getClass(), "lastRegionName", "Clkrygzvpw");
        setField(term76177, term76177.getClass(), "lastAllNetId", "TPzGOBNENK");
        setField(term76177, term76177.getClass(), "lastClientId", "ADhlvQDtuh");
        setField(term76175, term76175.getClass(), "user", term76177);
        setIntField(term76175, term76175.getClass(), "duelId", 492120544);
        setIntField(term76175, term76175.getClass(), "progress", -832143098);
        setIntField(term76175, term76175.getClass(), "point", 919518312);
        setBooleanField(term76175, term76175.getClass(), "isClear", false);
        setIntField(term76458, term76458.getClass(), "year", 2016);
        setShortField(term76458, term76458.getClass(), "month", (short) 6);
        setShortField(term76458, term76458.getClass(), "day", (short) 2);
        setField(term76457, term76457.getClass(), "date", term76458);
        setByteField(term76462, term76462.getClass(), "hour", (byte) 5);
        setByteField(term76462, term76462.getClass(), "minute", (byte) 24);
        setByteField(term76462, term76462.getClass(), "second", (byte) 28);
        setIntField(term76462, term76462.getClass(), "nano", 586692762);
        setField(term76457, term76457.getClass(), "time", term76462);
        setField(term76175, term76175.getClass(), "lastPlayDate", term76457);
        setIntField(term76175, term76175.getClass(), "param1", 363743117);
        setIntField(term76175, term76175.getClass(), "param2", -1659784438);
        setIntField(term76175, term76175.getClass(), "param3", -1912629150);
        setIntField(term76175, term76175.getClass(), "param4", 593205725);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserDuel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDuelId", argTypes, term76175, args);
    }

};


