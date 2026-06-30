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

public class UserWebOption_getId_14660004931 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37525;

    public UserWebOption_getId_14660004931() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term37531 = new Long(6273754186658578034L);
        term37525 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserWebOption"));
        Object term37527 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term37529 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term37545 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term37546 = newInstance(Class.forName("java.time.LocalDate"));
        Object term37550 = newInstance(Class.forName("java.time.LocalTime"));
        Object term37555 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term37556 = newInstance(Class.forName("java.time.LocalDate"));
        Object term37560 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term37525, term37525.getClass(), "id", 2209808079059619773L);
        setLongField(term37527, term37527.getClass(), "id", 8403492202041709902L);
        setLongField(term37529, term37529.getClass(), "id", -113028659747841511L);
        setField(term37529, term37529.getClass(), "extId", term37531);
        setField(term37529, term37529.getClass(), "luid", "cdZEcINJAM");
        setIntField(term37546, term37546.getClass(), "year", 2020);
        setShortField(term37546, term37546.getClass(), "month", (short) 7);
        setShortField(term37546, term37546.getClass(), "day", (short) 24);
        setField(term37545, term37545.getClass(), "date", term37546);
        setByteField(term37550, term37550.getClass(), "hour", (byte) 22);
        setByteField(term37550, term37550.getClass(), "minute", (byte) 16);
        setByteField(term37550, term37550.getClass(), "second", (byte) 59);
        setIntField(term37550, term37550.getClass(), "nano", 588569833);
        setField(term37545, term37545.getClass(), "time", term37550);
        setField(term37529, term37529.getClass(), "registerTime", term37545);
        setIntField(term37556, term37556.getClass(), "year", 2019);
        setShortField(term37556, term37556.getClass(), "month", (short) 8);
        setShortField(term37556, term37556.getClass(), "day", (short) 6);
        setField(term37555, term37555.getClass(), "date", term37556);
        setByteField(term37560, term37560.getClass(), "hour", (byte) 5);
        setByteField(term37560, term37560.getClass(), "minute", (byte) 32);
        setByteField(term37560, term37560.getClass(), "second", (byte) 47);
        setIntField(term37560, term37560.getClass(), "nano", 73220317);
        setField(term37555, term37555.getClass(), "time", term37560);
        setField(term37529, term37529.getClass(), "accessTime", term37555);
        setField(term37527, term37527.getClass(), "card", term37529);
        setIntField(term37527, term37527.getClass(), "lastDataVersion", 488730747);
        setField(term37527, term37527.getClass(), "userName", "qumYSwcWHz");
        setIntField(term37527, term37527.getClass(), "point", 1410439573);
        setIntField(term37527, term37527.getClass(), "totalPoint", -982945087);
        setIntField(term37527, term37527.getClass(), "iconId", 171057010);
        setIntField(term37527, term37527.getClass(), "nameplateId", -1039706080);
        setIntField(term37527, term37527.getClass(), "frameId", 1009893493);
        setIntField(term37527, term37527.getClass(), "trophyId", -1097846142);
        setIntField(term37527, term37527.getClass(), "playCount", 1026272483);
        setIntField(term37527, term37527.getClass(), "playVsCount", -48026838);
        setIntField(term37527, term37527.getClass(), "playSyncCount", 1557093855);
        setIntField(term37527, term37527.getClass(), "winCount", -445911899);
        setIntField(term37527, term37527.getClass(), "helpCount", -1254075402);
        setIntField(term37527, term37527.getClass(), "comboCount", -1886407162);
        setIntField(term37527, term37527.getClass(), "feverCount", -97996127);
        setIntField(term37527, term37527.getClass(), "totalHiScore", 668350997);
        setIntField(term37527, term37527.getClass(), "totalEasyHighScore", -1280690194);
        setIntField(term37527, term37527.getClass(), "totalBasicHighScore", -1825481062);
        setIntField(term37527, term37527.getClass(), "totalAdvancedHighScore", 662456234);
        setIntField(term37527, term37527.getClass(), "totalExpertHighScore", -1932565769);
        setIntField(term37527, term37527.getClass(), "totalMasterHighScore", 480924614);
        setIntField(term37527, term37527.getClass(), "totalReMasterHighScore", 1423620762);
        setIntField(term37527, term37527.getClass(), "totalHighSync", -182687795);
        setIntField(term37527, term37527.getClass(), "totalEasySync", -1965076703);
        setIntField(term37527, term37527.getClass(), "totalBasicSync", -1715006566);
        setIntField(term37527, term37527.getClass(), "totalAdvancedSync", 1190377243);
        setIntField(term37527, term37527.getClass(), "totalExpertSync", -1013321277);
        setIntField(term37527, term37527.getClass(), "totalMasterSync", -38762037);
        setIntField(term37527, term37527.getClass(), "totalReMasterSync", -200236986);
        setIntField(term37527, term37527.getClass(), "playerRating", -1078778523);
        setIntField(term37527, term37527.getClass(), "highestRating", -1573140874);
        setIntField(term37527, term37527.getClass(), "rankAuthTailId", 1252740231);
        setField(term37527, term37527.getClass(), "eventWatchedDate", "raNzcEorkV");
        setField(term37527, term37527.getClass(), "webLimitDate", "nEgozCeoUr");
        setIntField(term37527, term37527.getClass(), "challengeTrackPhase", -1494498996);
        setIntField(term37527, term37527.getClass(), "firstPlayBits", -1230782196);
        setField(term37527, term37527.getClass(), "lastPlayDate", "EWGMzlcOnW");
        setIntField(term37527, term37527.getClass(), "lastPlaceId", 1988646780);
        setField(term37527, term37527.getClass(), "lastPlaceName", "XeSDJYKMBf");
        setIntField(term37527, term37527.getClass(), "lastRegionId", -1505639058);
        setField(term37527, term37527.getClass(), "lastRegionName", "tIsFcOGTUX");
        setField(term37527, term37527.getClass(), "lastClientId", "XUVRcnELFP");
        setField(term37527, term37527.getClass(), "lastCountryCode", "xIeSbezmkD");
        setIntField(term37527, term37527.getClass(), "eventPoint", -1198622469);
        setIntField(term37527, term37527.getClass(), "totalLv", 254477121);
        setIntField(term37527, term37527.getClass(), "lastLoginBonusDay", -2097473055);
        setIntField(term37527, term37527.getClass(), "lastSurvivalBonusDay", 956173467);
        setIntField(term37527, term37527.getClass(), "loginBonusLv", -362299700);
        setField(term37525, term37525.getClass(), "user", term37527);
        setBooleanField(term37525, term37525.getClass(), "isNetMember", true);
        setIntField(term37525, term37525.getClass(), "dispRate", -229025947);
        setIntField(term37525, term37525.getClass(), "dispJudgeStyle", -2074615511);
        setIntField(term37525, term37525.getClass(), "dispRank", -545948451);
        setIntField(term37525, term37525.getClass(), "dispHomeRanker", -211944434);
        setIntField(term37525, term37525.getClass(), "dispTotalLv", -558856994);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserWebOption");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term37525, args);
    }

};


