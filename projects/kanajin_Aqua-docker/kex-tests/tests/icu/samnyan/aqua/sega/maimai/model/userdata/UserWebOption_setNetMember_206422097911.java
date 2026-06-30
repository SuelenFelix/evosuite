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
import java.lang.Boolean;

public class UserWebOption_setNetMember_206422097911 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40511;
     Object term40693;

    public UserWebOption_setNetMember_206422097911() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term40517 = new Long(855932984568615096L);
        term40511 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserWebOption"));
        Object term40513 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term40515 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term40531 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term40532 = newInstance(Class.forName("java.time.LocalDate"));
        Object term40536 = newInstance(Class.forName("java.time.LocalTime"));
        Object term40541 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term40542 = newInstance(Class.forName("java.time.LocalDate"));
        Object term40546 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term40511, term40511.getClass(), "id", -1481367303699139651L);
        setLongField(term40513, term40513.getClass(), "id", -7709317346333670618L);
        setLongField(term40515, term40515.getClass(), "id", -1964501434345816975L);
        setField(term40515, term40515.getClass(), "extId", term40517);
        setField(term40515, term40515.getClass(), "luid", "DbZKLwYBgy");
        setIntField(term40532, term40532.getClass(), "year", 2015);
        setShortField(term40532, term40532.getClass(), "month", (short) 4);
        setShortField(term40532, term40532.getClass(), "day", (short) 22);
        setField(term40531, term40531.getClass(), "date", term40532);
        setByteField(term40536, term40536.getClass(), "hour", (byte) 15);
        setByteField(term40536, term40536.getClass(), "minute", (byte) 23);
        setByteField(term40536, term40536.getClass(), "second", (byte) 42);
        setIntField(term40536, term40536.getClass(), "nano", 822658620);
        setField(term40531, term40531.getClass(), "time", term40536);
        setField(term40515, term40515.getClass(), "registerTime", term40531);
        setIntField(term40542, term40542.getClass(), "year", 2020);
        setShortField(term40542, term40542.getClass(), "month", (short) 4);
        setShortField(term40542, term40542.getClass(), "day", (short) 27);
        setField(term40541, term40541.getClass(), "date", term40542);
        setByteField(term40546, term40546.getClass(), "hour", (byte) 16);
        setByteField(term40546, term40546.getClass(), "minute", (byte) 48);
        setByteField(term40546, term40546.getClass(), "second", (byte) 39);
        setIntField(term40546, term40546.getClass(), "nano", 250909266);
        setField(term40541, term40541.getClass(), "time", term40546);
        setField(term40515, term40515.getClass(), "accessTime", term40541);
        setField(term40513, term40513.getClass(), "card", term40515);
        setIntField(term40513, term40513.getClass(), "lastDataVersion", -1214805826);
        setField(term40513, term40513.getClass(), "userName", "LnNRVsjmxw");
        setIntField(term40513, term40513.getClass(), "point", 1176296583);
        setIntField(term40513, term40513.getClass(), "totalPoint", 801043391);
        setIntField(term40513, term40513.getClass(), "iconId", 786322082);
        setIntField(term40513, term40513.getClass(), "nameplateId", -1051809896);
        setIntField(term40513, term40513.getClass(), "frameId", -1900546652);
        setIntField(term40513, term40513.getClass(), "trophyId", 729869031);
        setIntField(term40513, term40513.getClass(), "playCount", 79654623);
        setIntField(term40513, term40513.getClass(), "playVsCount", 539233848);
        setIntField(term40513, term40513.getClass(), "playSyncCount", -1368797597);
        setIntField(term40513, term40513.getClass(), "winCount", 2065515885);
        setIntField(term40513, term40513.getClass(), "helpCount", -765050200);
        setIntField(term40513, term40513.getClass(), "comboCount", 750639689);
        setIntField(term40513, term40513.getClass(), "feverCount", -281279750);
        setIntField(term40513, term40513.getClass(), "totalHiScore", 632971563);
        setIntField(term40513, term40513.getClass(), "totalEasyHighScore", 290690311);
        setIntField(term40513, term40513.getClass(), "totalBasicHighScore", -1215654854);
        setIntField(term40513, term40513.getClass(), "totalAdvancedHighScore", -1460137915);
        setIntField(term40513, term40513.getClass(), "totalExpertHighScore", 2048263826);
        setIntField(term40513, term40513.getClass(), "totalMasterHighScore", -1353079280);
        setIntField(term40513, term40513.getClass(), "totalReMasterHighScore", -1053470670);
        setIntField(term40513, term40513.getClass(), "totalHighSync", 421827493);
        setIntField(term40513, term40513.getClass(), "totalEasySync", 720401594);
        setIntField(term40513, term40513.getClass(), "totalBasicSync", -814068886);
        setIntField(term40513, term40513.getClass(), "totalAdvancedSync", -393844160);
        setIntField(term40513, term40513.getClass(), "totalExpertSync", -1396955867);
        setIntField(term40513, term40513.getClass(), "totalMasterSync", 1259575995);
        setIntField(term40513, term40513.getClass(), "totalReMasterSync", 1206636813);
        setIntField(term40513, term40513.getClass(), "playerRating", -1592307241);
        setIntField(term40513, term40513.getClass(), "highestRating", -92983331);
        setIntField(term40513, term40513.getClass(), "rankAuthTailId", -1635511750);
        setField(term40513, term40513.getClass(), "eventWatchedDate", "PlOnDkNrvX");
        setField(term40513, term40513.getClass(), "webLimitDate", "MltgFGldop");
        setIntField(term40513, term40513.getClass(), "challengeTrackPhase", -1920687540);
        setIntField(term40513, term40513.getClass(), "firstPlayBits", 1907562616);
        setField(term40513, term40513.getClass(), "lastPlayDate", "JCWSoxnBJs");
        setIntField(term40513, term40513.getClass(), "lastPlaceId", -1207669605);
        setField(term40513, term40513.getClass(), "lastPlaceName", "vAxcpvjEEa");
        setIntField(term40513, term40513.getClass(), "lastRegionId", 154054470);
        setField(term40513, term40513.getClass(), "lastRegionName", "FCkOgIBqXE");
        setField(term40513, term40513.getClass(), "lastClientId", "kadRHthQRD");
        setField(term40513, term40513.getClass(), "lastCountryCode", "cGbJSRSpNn");
        setIntField(term40513, term40513.getClass(), "eventPoint", 843710230);
        setIntField(term40513, term40513.getClass(), "totalLv", 547665841);
        setIntField(term40513, term40513.getClass(), "lastLoginBonusDay", -12983617);
        setIntField(term40513, term40513.getClass(), "lastSurvivalBonusDay", -1791051420);
        setIntField(term40513, term40513.getClass(), "loginBonusLv", 98451832);
        setField(term40511, term40511.getClass(), "user", term40513);
        setBooleanField(term40511, term40511.getClass(), "isNetMember", true);
        setIntField(term40511, term40511.getClass(), "dispRate", 584008261);
        setIntField(term40511, term40511.getClass(), "dispJudgeStyle", -881683610);
        setIntField(term40511, term40511.getClass(), "dispRank", -109698584);
        setIntField(term40511, term40511.getClass(), "dispHomeRanker", 2001696613);
        setIntField(term40511, term40511.getClass(), "dispTotalLv", -1753516884);
        term40693 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserWebOption");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term40693;
        callMethod(klass, "setNetMember", argTypes, term40511, args);
    }

};


