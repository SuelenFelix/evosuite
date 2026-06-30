package icu.samnyan.aqua.sega.maimai.model.userdata;

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
import static icu.samnyan.aqua.sega.maimai.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;

public class UserData_getFeverCount_106709370616 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4225;

    public UserData_getFeverCount_106709370616() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4229 = new Long(-316468845751588286L);
        term4225 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term4227 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term4243 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4244 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4248 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4253 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4254 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4258 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term4225, term4225.getClass(), "id", 5262507301787091109L);
        setLongField(term4227, term4227.getClass(), "id", -6823727938421990489L);
        setField(term4227, term4227.getClass(), "extId", term4229);
        setField(term4227, term4227.getClass(), "luid", "GgZWSjxjyE");
        setIntField(term4244, term4244.getClass(), "year", 2012);
        setShortField(term4244, term4244.getClass(), "month", (short) 3);
        setShortField(term4244, term4244.getClass(), "day", (short) 27);
        setField(term4243, term4243.getClass(), "date", term4244);
        setByteField(term4248, term4248.getClass(), "hour", (byte) 17);
        setByteField(term4248, term4248.getClass(), "minute", (byte) 49);
        setByteField(term4248, term4248.getClass(), "second", (byte) 24);
        setIntField(term4248, term4248.getClass(), "nano", 530647398);
        setField(term4243, term4243.getClass(), "time", term4248);
        setField(term4227, term4227.getClass(), "registerTime", term4243);
        setIntField(term4254, term4254.getClass(), "year", 2010);
        setShortField(term4254, term4254.getClass(), "month", (short) 6);
        setShortField(term4254, term4254.getClass(), "day", (short) 14);
        setField(term4253, term4253.getClass(), "date", term4254);
        setByteField(term4258, term4258.getClass(), "hour", (byte) 6);
        setByteField(term4258, term4258.getClass(), "minute", (byte) 22);
        setByteField(term4258, term4258.getClass(), "second", (byte) 20);
        setIntField(term4258, term4258.getClass(), "nano", 25133051);
        setField(term4253, term4253.getClass(), "time", term4258);
        setField(term4227, term4227.getClass(), "accessTime", term4253);
        setField(term4225, term4225.getClass(), "card", term4227);
        setIntField(term4225, term4225.getClass(), "lastDataVersion", -573608449);
        setField(term4225, term4225.getClass(), "userName", "EeBVbzjcCI");
        setIntField(term4225, term4225.getClass(), "point", -1660057757);
        setIntField(term4225, term4225.getClass(), "totalPoint", 1816273440);
        setIntField(term4225, term4225.getClass(), "iconId", -96541009);
        setIntField(term4225, term4225.getClass(), "nameplateId", -43719302);
        setIntField(term4225, term4225.getClass(), "frameId", 1024134939);
        setIntField(term4225, term4225.getClass(), "trophyId", 109078154);
        setIntField(term4225, term4225.getClass(), "playCount", -314165467);
        setIntField(term4225, term4225.getClass(), "playVsCount", 963694071);
        setIntField(term4225, term4225.getClass(), "playSyncCount", -995785731);
        setIntField(term4225, term4225.getClass(), "winCount", 1349815364);
        setIntField(term4225, term4225.getClass(), "helpCount", 2128383340);
        setIntField(term4225, term4225.getClass(), "comboCount", 1238598518);
        setIntField(term4225, term4225.getClass(), "feverCount", -558146961);
        setIntField(term4225, term4225.getClass(), "totalHiScore", 1505480070);
        setIntField(term4225, term4225.getClass(), "totalEasyHighScore", -829088844);
        setIntField(term4225, term4225.getClass(), "totalBasicHighScore", -31751777);
        setIntField(term4225, term4225.getClass(), "totalAdvancedHighScore", -246967963);
        setIntField(term4225, term4225.getClass(), "totalExpertHighScore", -1777140369);
        setIntField(term4225, term4225.getClass(), "totalMasterHighScore", 993627098);
        setIntField(term4225, term4225.getClass(), "totalReMasterHighScore", 872295704);
        setIntField(term4225, term4225.getClass(), "totalHighSync", 86041387);
        setIntField(term4225, term4225.getClass(), "totalEasySync", 1010721666);
        setIntField(term4225, term4225.getClass(), "totalBasicSync", 27043781);
        setIntField(term4225, term4225.getClass(), "totalAdvancedSync", -1367122405);
        setIntField(term4225, term4225.getClass(), "totalExpertSync", -1703625118);
        setIntField(term4225, term4225.getClass(), "totalMasterSync", 1104108112);
        setIntField(term4225, term4225.getClass(), "totalReMasterSync", 1648665618);
        setIntField(term4225, term4225.getClass(), "playerRating", 633765954);
        setIntField(term4225, term4225.getClass(), "highestRating", 269110087);
        setIntField(term4225, term4225.getClass(), "rankAuthTailId", 1545119095);
        setField(term4225, term4225.getClass(), "eventWatchedDate", "UfQtPRyWRC");
        setField(term4225, term4225.getClass(), "webLimitDate", "FPvxVzzSvD");
        setIntField(term4225, term4225.getClass(), "challengeTrackPhase", 1671229683);
        setIntField(term4225, term4225.getClass(), "firstPlayBits", 34167717);
        setField(term4225, term4225.getClass(), "lastPlayDate", "WHcwFgsGFC");
        setIntField(term4225, term4225.getClass(), "lastPlaceId", -514195141);
        setField(term4225, term4225.getClass(), "lastPlaceName", "HzqpegHiRq");
        setIntField(term4225, term4225.getClass(), "lastRegionId", -297946422);
        setField(term4225, term4225.getClass(), "lastRegionName", "jwsfVjMoJT");
        setField(term4225, term4225.getClass(), "lastClientId", "ZfdXfCCFDf");
        setField(term4225, term4225.getClass(), "lastCountryCode", "MwwjNtdOFT");
        setIntField(term4225, term4225.getClass(), "eventPoint", 385463636);
        setIntField(term4225, term4225.getClass(), "totalLv", -1677599962);
        setIntField(term4225, term4225.getClass(), "lastLoginBonusDay", -1790275458);
        setIntField(term4225, term4225.getClass(), "lastSurvivalBonusDay", -497534255);
        setIntField(term4225, term4225.getClass(), "loginBonusLv", 1588942911);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFeverCount", argTypes, term4225, args);
    }

};


