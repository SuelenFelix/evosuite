package icu.samnyan.aqua.sega.maimai2.model.userdata;

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
import static icu.samnyan.aqua.sega.maimai2.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;
import java.util.ArrayList;
import java.lang.Integer;

public class UserDetail_getTotalExpertDeluxscore_207758594858 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4262356;

    public UserDetail_getTotalExpertDeluxscore_207758594858() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4262360 = new Long(-4989200430370185264L);
        Integer term4262423 = new Integer(1007007632);
        Integer term4262425 = new Integer(-885454757);
        Integer term4262427 = new Integer(-1232749539);
        ArrayList term4262421 = new ArrayList();
        ((ArrayList) term4262421).add(term4262423);
        ((ArrayList) term4262421).add(term4262425);
        ((ArrayList) term4262421).add(term4262427);
        ArrayList term4262431 = new ArrayList();
        term4262356 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term4262358 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term4262374 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4262375 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4262379 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4262384 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4262385 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4262389 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term4262356, term4262356.getClass(), "id", -1892475492291047885L);
        setLongField(term4262358, term4262358.getClass(), "id", -5286119258799717614L);
        setField(term4262358, term4262358.getClass(), "extId", term4262360);
        setField(term4262358, term4262358.getClass(), "luid", "cvWDwPkeYL");
        setIntField(term4262375, term4262375.getClass(), "year", 2027);
        setShortField(term4262375, term4262375.getClass(), "month", (short) 4);
        setShortField(term4262375, term4262375.getClass(), "day", (short) 29);
        setField(term4262374, term4262374.getClass(), "date", term4262375);
        setByteField(term4262379, term4262379.getClass(), "hour", (byte) 4);
        setByteField(term4262379, term4262379.getClass(), "minute", (byte) 41);
        setByteField(term4262379, term4262379.getClass(), "second", (byte) 9);
        setIntField(term4262379, term4262379.getClass(), "nano", 334034107);
        setField(term4262374, term4262374.getClass(), "time", term4262379);
        setField(term4262358, term4262358.getClass(), "registerTime", term4262374);
        setIntField(term4262385, term4262385.getClass(), "year", 2010);
        setShortField(term4262385, term4262385.getClass(), "month", (short) 4);
        setShortField(term4262385, term4262385.getClass(), "day", (short) 10);
        setField(term4262384, term4262384.getClass(), "date", term4262385);
        setByteField(term4262389, term4262389.getClass(), "hour", (byte) 2);
        setByteField(term4262389, term4262389.getClass(), "minute", (byte) 21);
        setByteField(term4262389, term4262389.getClass(), "second", (byte) 1);
        setIntField(term4262389, term4262389.getClass(), "nano", 337891973);
        setField(term4262384, term4262384.getClass(), "time", term4262389);
        setField(term4262358, term4262358.getClass(), "accessTime", term4262384);
        setField(term4262356, term4262356.getClass(), "card", term4262358);
        setField(term4262356, term4262356.getClass(), "userName", "gQKQZUXANS");
        setIntField(term4262356, term4262356.getClass(), "isNetMember", 614711858);
        setIntField(term4262356, term4262356.getClass(), "iconId", 1017855616);
        setIntField(term4262356, term4262356.getClass(), "plateId", -1266061311);
        setIntField(term4262356, term4262356.getClass(), "titleId", -294474933);
        setIntField(term4262356, term4262356.getClass(), "partnerId", 1624549160);
        setIntField(term4262356, term4262356.getClass(), "frameId", -697097179);
        setIntField(term4262356, term4262356.getClass(), "selectMapId", -1576646774);
        setIntField(term4262356, term4262356.getClass(), "totalAwake", -2097346840);
        setIntField(term4262356, term4262356.getClass(), "gradeRating", -972432234);
        setIntField(term4262356, term4262356.getClass(), "musicRating", -2000193615);
        setIntField(term4262356, term4262356.getClass(), "playerRating", -662675370);
        setIntField(term4262356, term4262356.getClass(), "highestRating", 1465068403);
        setIntField(term4262356, term4262356.getClass(), "gradeRank", -1901804470);
        setIntField(term4262356, term4262356.getClass(), "classRank", 1623523094);
        setIntField(term4262356, term4262356.getClass(), "courseRank", 777810857);
        setField(term4262356, term4262356.getClass(), "charaSlot", term4262421);
        setField(term4262356, term4262356.getClass(), "charaLockSlot", term4262431);
        setLongField(term4262356, term4262356.getClass(), "contentBit", 4923300701383117506L);
        setIntField(term4262356, term4262356.getClass(), "playCount", -1480504906);
        setField(term4262356, term4262356.getClass(), "eventWatchedDate", "DhKIAnGBay");
        setField(term4262356, term4262356.getClass(), "lastGameId", "fTDelEyHFM");
        setField(term4262356, term4262356.getClass(), "lastRomVersion", "qFgDtUaCSR");
        setField(term4262356, term4262356.getClass(), "lastDataVersion", "NtMZFXtUWF");
        setField(term4262356, term4262356.getClass(), "lastLoginDate", "cydiTuotQQ");
        setField(term4262356, term4262356.getClass(), "lastPlayDate", "dBbNZxZSiX");
        setIntField(term4262356, term4262356.getClass(), "lastPlayCredit", 812617480);
        setIntField(term4262356, term4262356.getClass(), "lastPlayMode", -1178398777);
        setIntField(term4262356, term4262356.getClass(), "lastPlaceId", 1219078007);
        setField(term4262356, term4262356.getClass(), "lastPlaceName", "oCnIAAivat");
        setIntField(term4262356, term4262356.getClass(), "lastAllNetId", 1491822120);
        setIntField(term4262356, term4262356.getClass(), "lastRegionId", -743321714);
        setField(term4262356, term4262356.getClass(), "lastRegionName", "VrofQnQgSY");
        setField(term4262356, term4262356.getClass(), "lastClientId", "mLapybTwXH");
        setField(term4262356, term4262356.getClass(), "lastCountryCode", "VVeVvMqwKw");
        setIntField(term4262356, term4262356.getClass(), "lastSelectEMoney", 1826340713);
        setIntField(term4262356, term4262356.getClass(), "lastSelectTicket", 835715846);
        setIntField(term4262356, term4262356.getClass(), "lastSelectCourse", -1676649781);
        setIntField(term4262356, term4262356.getClass(), "lastCountCourse", -20137519);
        setField(term4262356, term4262356.getClass(), "firstGameId", "QyCDbZQuzL");
        setField(term4262356, term4262356.getClass(), "firstRomVersion", "EtNPWkTwFt");
        setField(term4262356, term4262356.getClass(), "firstDataVersion", "pbjfjwFMZX");
        setField(term4262356, term4262356.getClass(), "firstPlayDate", "aGqjmcloez");
        setField(term4262356, term4262356.getClass(), "compatibleCmVersion", "QDeBCKADHz");
        setField(term4262356, term4262356.getClass(), "dailyBonusDate", "wGodlAUmsB");
        setField(term4262356, term4262356.getClass(), "dailyCourseBonusDate", "zVvSkxlWCv");
        setField(term4262356, term4262356.getClass(), "lastPairLoginDate", "wmhMcLMOwE");
        setField(term4262356, term4262356.getClass(), "lastTrialPlayDate", "tQnTEPSyYw");
        setIntField(term4262356, term4262356.getClass(), "playVsCount", -1913001014);
        setIntField(term4262356, term4262356.getClass(), "playSyncCount", 1621035472);
        setIntField(term4262356, term4262356.getClass(), "winCount", -1852136908);
        setIntField(term4262356, term4262356.getClass(), "helpCount", 1925550733);
        setIntField(term4262356, term4262356.getClass(), "comboCount", -122991087);
        setLongField(term4262356, term4262356.getClass(), "totalDeluxscore", 6436312922261170008L);
        setLongField(term4262356, term4262356.getClass(), "totalBasicDeluxscore", -2140297087537284666L);
        setLongField(term4262356, term4262356.getClass(), "totalAdvancedDeluxscore", 1687129671339091453L);
        setLongField(term4262356, term4262356.getClass(), "totalExpertDeluxscore", 2317039390999579084L);
        setLongField(term4262356, term4262356.getClass(), "totalMasterDeluxscore", -5645784654371775590L);
        setLongField(term4262356, term4262356.getClass(), "totalReMasterDeluxscore", 7381392742863171185L);
        setIntField(term4262356, term4262356.getClass(), "totalSync", 921739437);
        setIntField(term4262356, term4262356.getClass(), "totalBasicSync", 59391979);
        setIntField(term4262356, term4262356.getClass(), "totalAdvancedSync", -1232530692);
        setIntField(term4262356, term4262356.getClass(), "totalExpertSync", 405015863);
        setIntField(term4262356, term4262356.getClass(), "totalMasterSync", -72179407);
        setIntField(term4262356, term4262356.getClass(), "totalReMasterSync", 237263348);
        setLongField(term4262356, term4262356.getClass(), "totalAchievement", 2943545445405661938L);
        setLongField(term4262356, term4262356.getClass(), "totalBasicAchievement", 4308319959013226792L);
        setLongField(term4262356, term4262356.getClass(), "totalAdvancedAchievement", 742884673021082967L);
        setLongField(term4262356, term4262356.getClass(), "totalExpertAchievement", 5152223873684208186L);
        setLongField(term4262356, term4262356.getClass(), "totalMasterAchievement", -2764348214253939380L);
        setLongField(term4262356, term4262356.getClass(), "totalReMasterAchievement", 4623933915337584142L);
        setLongField(term4262356, term4262356.getClass(), "playerOldRating", -6815909480988842133L);
        setLongField(term4262356, term4262356.getClass(), "playerNewRating", -7672713422164346198L);
        setIntField(term4262356, term4262356.getClass(), "banState", -1709521692);
        setLongField(term4262356, term4262356.getClass(), "dateTime", 4330246790114381193L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotalExpertDeluxscore", argTypes, term4262356, args);
    }

};


