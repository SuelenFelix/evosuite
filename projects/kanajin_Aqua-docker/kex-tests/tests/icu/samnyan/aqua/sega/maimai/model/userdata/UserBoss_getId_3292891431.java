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

public class UserBoss_getId_3292891431 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term89221;

    public UserBoss_getId_3292891431() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term89227 = new Long(24067105862153728L);
        term89221 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserBoss"));
        Object term89223 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term89225 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term89241 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term89242 = newInstance(Class.forName("java.time.LocalDate"));
        Object term89246 = newInstance(Class.forName("java.time.LocalTime"));
        Object term89251 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term89252 = newInstance(Class.forName("java.time.LocalDate"));
        Object term89256 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term89221, term89221.getClass(), "id", 2315395988604904502L);
        setLongField(term89223, term89223.getClass(), "id", 4337555582321907177L);
        setLongField(term89225, term89225.getClass(), "id", -6367418587326372844L);
        setField(term89225, term89225.getClass(), "extId", term89227);
        setField(term89225, term89225.getClass(), "luid", "EAKcPFEKbX");
        setIntField(term89242, term89242.getClass(), "year", 2023);
        setShortField(term89242, term89242.getClass(), "month", (short) 8);
        setShortField(term89242, term89242.getClass(), "day", (short) 30);
        setField(term89241, term89241.getClass(), "date", term89242);
        setByteField(term89246, term89246.getClass(), "hour", (byte) 6);
        setByteField(term89246, term89246.getClass(), "minute", (byte) 55);
        setByteField(term89246, term89246.getClass(), "second", (byte) 45);
        setIntField(term89246, term89246.getClass(), "nano", 174033);
        setField(term89241, term89241.getClass(), "time", term89246);
        setField(term89225, term89225.getClass(), "registerTime", term89241);
        setIntField(term89252, term89252.getClass(), "year", 2017);
        setShortField(term89252, term89252.getClass(), "month", (short) 3);
        setShortField(term89252, term89252.getClass(), "day", (short) 13);
        setField(term89251, term89251.getClass(), "date", term89252);
        setByteField(term89256, term89256.getClass(), "hour", (byte) 20);
        setByteField(term89256, term89256.getClass(), "minute", (byte) 41);
        setByteField(term89256, term89256.getClass(), "second", (byte) 9);
        setIntField(term89256, term89256.getClass(), "nano", 698449623);
        setField(term89251, term89251.getClass(), "time", term89256);
        setField(term89225, term89225.getClass(), "accessTime", term89251);
        setField(term89223, term89223.getClass(), "card", term89225);
        setIntField(term89223, term89223.getClass(), "lastDataVersion", -220172762);
        setField(term89223, term89223.getClass(), "userName", "uPdAMNFhdG");
        setIntField(term89223, term89223.getClass(), "point", -91583035);
        setIntField(term89223, term89223.getClass(), "totalPoint", 1118579974);
        setIntField(term89223, term89223.getClass(), "iconId", 1007007632);
        setIntField(term89223, term89223.getClass(), "nameplateId", -885454757);
        setIntField(term89223, term89223.getClass(), "frameId", -1232749539);
        setIntField(term89223, term89223.getClass(), "trophyId", -381558021);
        setIntField(term89223, term89223.getClass(), "playCount", 1819668222);
        setIntField(term89223, term89223.getClass(), "playVsCount", 655578194);
        setIntField(term89223, term89223.getClass(), "playSyncCount", 132693406);
        setIntField(term89223, term89223.getClass(), "winCount", -1100588127);
        setIntField(term89223, term89223.getClass(), "helpCount", 1035089895);
        setIntField(term89223, term89223.getClass(), "comboCount", 4217888);
        setIntField(term89223, term89223.getClass(), "feverCount", -1453563811);
        setIntField(term89223, term89223.getClass(), "totalHiScore", -1548291822);
        setIntField(term89223, term89223.getClass(), "totalEasyHighScore", 1083791914);
        setIntField(term89223, term89223.getClass(), "totalBasicHighScore", 1266062345);
        setIntField(term89223, term89223.getClass(), "totalAdvancedHighScore", -547310147);
        setIntField(term89223, term89223.getClass(), "totalExpertHighScore", 893881579);
        setIntField(term89223, term89223.getClass(), "totalMasterHighScore", 198045917);
        setIntField(term89223, term89223.getClass(), "totalReMasterHighScore", -1667202438);
        setIntField(term89223, term89223.getClass(), "totalHighSync", -2053124772);
        setIntField(term89223, term89223.getClass(), "totalEasySync", -873131161);
        setIntField(term89223, term89223.getClass(), "totalBasicSync", 1399978457);
        setIntField(term89223, term89223.getClass(), "totalAdvancedSync", -1973849284);
        setIntField(term89223, term89223.getClass(), "totalExpertSync", -1074349521);
        setIntField(term89223, term89223.getClass(), "totalMasterSync", -301274199);
        setIntField(term89223, term89223.getClass(), "totalReMasterSync", 495802747);
        setIntField(term89223, term89223.getClass(), "playerRating", -2002408985);
        setIntField(term89223, term89223.getClass(), "highestRating", -1289271829);
        setIntField(term89223, term89223.getClass(), "rankAuthTailId", -1303889576);
        setField(term89223, term89223.getClass(), "eventWatchedDate", "VjXPlvOnMK");
        setField(term89223, term89223.getClass(), "webLimitDate", "VVfwcKWfYk");
        setIntField(term89223, term89223.getClass(), "challengeTrackPhase", 158488233);
        setIntField(term89223, term89223.getClass(), "firstPlayBits", 1641465748);
        setField(term89223, term89223.getClass(), "lastPlayDate", "tsYXZxQtLG");
        setIntField(term89223, term89223.getClass(), "lastPlaceId", 191297190);
        setField(term89223, term89223.getClass(), "lastPlaceName", "JUAWRJdehl");
        setIntField(term89223, term89223.getClass(), "lastRegionId", -184116368);
        setField(term89223, term89223.getClass(), "lastRegionName", "fFslDwqqzQ");
        setField(term89223, term89223.getClass(), "lastClientId", "oyTybTkTFd");
        setField(term89223, term89223.getClass(), "lastCountryCode", "NNjMZLPIcc");
        setIntField(term89223, term89223.getClass(), "eventPoint", -2078321901);
        setIntField(term89223, term89223.getClass(), "totalLv", 644110294);
        setIntField(term89223, term89223.getClass(), "lastLoginBonusDay", 858147518);
        setIntField(term89223, term89223.getClass(), "lastSurvivalBonusDay", -1727167401);
        setIntField(term89223, term89223.getClass(), "loginBonusLv", -842185797);
        setField(term89221, term89221.getClass(), "user", term89223);
        setLongField(term89221, term89221.getClass(), "pandoraFlagList0", 6371581018571997173L);
        setLongField(term89221, term89221.getClass(), "pandoraFlagList1", 6604328992663797314L);
        setLongField(term89221, term89221.getClass(), "pandoraFlagList2", -5133307284441518726L);
        setLongField(term89221, term89221.getClass(), "pandoraFlagList3", 7921404547326630089L);
        setLongField(term89221, term89221.getClass(), "pandoraFlagList4", 2155219577693802424L);
        setLongField(term89221, term89221.getClass(), "pandoraFlagList5", -4033544645261759750L);
        setLongField(term89221, term89221.getClass(), "pandoraFlagList6", 593230449611047187L);
        setLongField(term89221, term89221.getClass(), "emblemFlagList", -3355167737637002830L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserBoss");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term89221, args);
    }

};


