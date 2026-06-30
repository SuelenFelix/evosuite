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

public class UserDetail_setPlaySyncCount_538431612129 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term268573;
     Object term268942;

    public UserDetail_setPlaySyncCount_538431612129() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term268577 = new Long(-4663904610228258188L);
        Integer term268640 = new Integer(-1360145510);
        Integer term268642 = new Integer(-1122695171);
        Integer term268644 = new Integer(-1304945951);
        Integer term268646 = new Integer(1324880713);
        Integer term268648 = new Integer(-331841554);
        Integer term268650 = new Integer(913848623);
        Integer term268652 = new Integer(1449221084);
        ArrayList term268638 = new ArrayList();
        ((ArrayList) term268638).add(term268640);
        ((ArrayList) term268638).add(term268642);
        ((ArrayList) term268638).add(term268644);
        ((ArrayList) term268638).add(term268646);
        ((ArrayList) term268638).add(term268648);
        ((ArrayList) term268638).add(term268650);
        ((ArrayList) term268638).add(term268652);
        Integer term268658 = new Integer(-217809217);
        Integer term268660 = new Integer(-473949548);
        Integer term268662 = new Integer(1898831696);
        Integer term268664 = new Integer(1811064455);
        Integer term268666 = new Integer(1183674366);
        Integer term268668 = new Integer(2120314865);
        Integer term268670 = new Integer(-1783088801);
        Integer term268672 = new Integer(353452001);
        ArrayList term268656 = new ArrayList();
        ((ArrayList) term268656).add(term268658);
        ((ArrayList) term268656).add(term268660);
        ((ArrayList) term268656).add(term268662);
        ((ArrayList) term268656).add(term268664);
        ((ArrayList) term268656).add(term268666);
        ((ArrayList) term268656).add(term268668);
        ((ArrayList) term268656).add(term268670);
        ((ArrayList) term268656).add(term268672);
        term268573 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term268575 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term268591 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term268592 = newInstance(Class.forName("java.time.LocalDate"));
        Object term268596 = newInstance(Class.forName("java.time.LocalTime"));
        Object term268601 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term268602 = newInstance(Class.forName("java.time.LocalDate"));
        Object term268606 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term268573, term268573.getClass(), "id", 3009385010476388466L);
        setLongField(term268575, term268575.getClass(), "id", 5336136273200788894L);
        setField(term268575, term268575.getClass(), "extId", term268577);
        setField(term268575, term268575.getClass(), "luid", "nirCEPCEzD");
        setIntField(term268592, term268592.getClass(), "year", 2022);
        setShortField(term268592, term268592.getClass(), "month", (short) 6);
        setShortField(term268592, term268592.getClass(), "day", (short) 15);
        setField(term268591, term268591.getClass(), "date", term268592);
        setByteField(term268596, term268596.getClass(), "hour", (byte) 22);
        setByteField(term268596, term268596.getClass(), "minute", (byte) 45);
        setByteField(term268596, term268596.getClass(), "second", (byte) 15);
        setIntField(term268596, term268596.getClass(), "nano", 210438417);
        setField(term268591, term268591.getClass(), "time", term268596);
        setField(term268575, term268575.getClass(), "registerTime", term268591);
        setIntField(term268602, term268602.getClass(), "year", 2028);
        setShortField(term268602, term268602.getClass(), "month", (short) 5);
        setShortField(term268602, term268602.getClass(), "day", (short) 11);
        setField(term268601, term268601.getClass(), "date", term268602);
        setByteField(term268606, term268606.getClass(), "hour", (byte) 1);
        setByteField(term268606, term268606.getClass(), "minute", (byte) 18);
        setByteField(term268606, term268606.getClass(), "second", (byte) 27);
        setIntField(term268606, term268606.getClass(), "nano", 514067112);
        setField(term268601, term268601.getClass(), "time", term268606);
        setField(term268575, term268575.getClass(), "accessTime", term268601);
        setField(term268573, term268573.getClass(), "card", term268575);
        setField(term268573, term268573.getClass(), "userName", "wPRvAQKTop");
        setIntField(term268573, term268573.getClass(), "isNetMember", 564331);
        setIntField(term268573, term268573.getClass(), "iconId", -631621459);
        setIntField(term268573, term268573.getClass(), "plateId", -896986933);
        setIntField(term268573, term268573.getClass(), "titleId", -272073305);
        setIntField(term268573, term268573.getClass(), "partnerId", 1586776007);
        setIntField(term268573, term268573.getClass(), "frameId", 416678466);
        setIntField(term268573, term268573.getClass(), "selectMapId", -505598314);
        setIntField(term268573, term268573.getClass(), "totalAwake", -1431423805);
        setIntField(term268573, term268573.getClass(), "gradeRating", -1119901942);
        setIntField(term268573, term268573.getClass(), "musicRating", 174305035);
        setIntField(term268573, term268573.getClass(), "playerRating", 681540406);
        setIntField(term268573, term268573.getClass(), "highestRating", 1248693910);
        setIntField(term268573, term268573.getClass(), "gradeRank", -195386022);
        setIntField(term268573, term268573.getClass(), "classRank", 1447852280);
        setIntField(term268573, term268573.getClass(), "courseRank", -405514470);
        setField(term268573, term268573.getClass(), "charaSlot", term268638);
        setField(term268573, term268573.getClass(), "charaLockSlot", term268656);
        setLongField(term268573, term268573.getClass(), "contentBit", 2888276482356009431L);
        setIntField(term268573, term268573.getClass(), "playCount", -1944960616);
        setField(term268573, term268573.getClass(), "eventWatchedDate", "OhnhYqFRhK");
        setField(term268573, term268573.getClass(), "lastGameId", "muqzcvKPzU");
        setField(term268573, term268573.getClass(), "lastRomVersion", "LIfRcijYBP");
        setField(term268573, term268573.getClass(), "lastDataVersion", "UWfjAouyWX");
        setField(term268573, term268573.getClass(), "lastLoginDate", "lXEruUZEjX");
        setField(term268573, term268573.getClass(), "lastPlayDate", "BMZYmMvpIa");
        setIntField(term268573, term268573.getClass(), "lastPlayCredit", 134129921);
        setIntField(term268573, term268573.getClass(), "lastPlayMode", 1074423492);
        setIntField(term268573, term268573.getClass(), "lastPlaceId", 1347101666);
        setField(term268573, term268573.getClass(), "lastPlaceName", "vpVENawnlE");
        setIntField(term268573, term268573.getClass(), "lastAllNetId", 1898176333);
        setIntField(term268573, term268573.getClass(), "lastRegionId", 1538029461);
        setField(term268573, term268573.getClass(), "lastRegionName", "dgciCbbLcm");
        setField(term268573, term268573.getClass(), "lastClientId", "MaoZhZpQjB");
        setField(term268573, term268573.getClass(), "lastCountryCode", "geQbYhZCon");
        setIntField(term268573, term268573.getClass(), "lastSelectEMoney", 95078217);
        setIntField(term268573, term268573.getClass(), "lastSelectTicket", -1362477279);
        setIntField(term268573, term268573.getClass(), "lastSelectCourse", 509325750);
        setIntField(term268573, term268573.getClass(), "lastCountCourse", -1449019304);
        setField(term268573, term268573.getClass(), "firstGameId", "csWAyLZbkB");
        setField(term268573, term268573.getClass(), "firstRomVersion", "LLoBZeTRNx");
        setField(term268573, term268573.getClass(), "firstDataVersion", "LZXzTxEMXE");
        setField(term268573, term268573.getClass(), "firstPlayDate", "DTixVvtuBb");
        setField(term268573, term268573.getClass(), "compatibleCmVersion", "HZRpEXkRHd");
        setField(term268573, term268573.getClass(), "dailyBonusDate", "xbjtwqetFF");
        setField(term268573, term268573.getClass(), "dailyCourseBonusDate", "lPeJoACpkg");
        setField(term268573, term268573.getClass(), "lastPairLoginDate", "NOaxSWPYxb");
        setField(term268573, term268573.getClass(), "lastTrialPlayDate", "tJAeYhYvPl");
        setIntField(term268573, term268573.getClass(), "playVsCount", -292778481);
        setIntField(term268573, term268573.getClass(), "playSyncCount", 1790535012);
        setIntField(term268573, term268573.getClass(), "winCount", 517372938);
        setIntField(term268573, term268573.getClass(), "helpCount", 270121185);
        setIntField(term268573, term268573.getClass(), "comboCount", -1613798107);
        setLongField(term268573, term268573.getClass(), "totalDeluxscore", -2899742477235888514L);
        setLongField(term268573, term268573.getClass(), "totalBasicDeluxscore", 1456050377961927969L);
        setLongField(term268573, term268573.getClass(), "totalAdvancedDeluxscore", 3276226064209080327L);
        setLongField(term268573, term268573.getClass(), "totalExpertDeluxscore", -6112475796213844665L);
        setLongField(term268573, term268573.getClass(), "totalMasterDeluxscore", -4765706057786455710L);
        setLongField(term268573, term268573.getClass(), "totalReMasterDeluxscore", -5743938879529454475L);
        setIntField(term268573, term268573.getClass(), "totalSync", 182501747);
        setIntField(term268573, term268573.getClass(), "totalBasicSync", 466948774);
        setIntField(term268573, term268573.getClass(), "totalAdvancedSync", 63133691);
        setIntField(term268573, term268573.getClass(), "totalExpertSync", -1950250956);
        setIntField(term268573, term268573.getClass(), "totalMasterSync", -1468847146);
        setIntField(term268573, term268573.getClass(), "totalReMasterSync", 316276289);
        setLongField(term268573, term268573.getClass(), "totalAchievement", -8581042680392065672L);
        setLongField(term268573, term268573.getClass(), "totalBasicAchievement", 5873007084205222191L);
        setLongField(term268573, term268573.getClass(), "totalAdvancedAchievement", -3452496885728491852L);
        setLongField(term268573, term268573.getClass(), "totalExpertAchievement", 6590477605408975292L);
        setLongField(term268573, term268573.getClass(), "totalMasterAchievement", 4873581149688877837L);
        setLongField(term268573, term268573.getClass(), "totalReMasterAchievement", 6767810565797855681L);
        setLongField(term268573, term268573.getClass(), "playerOldRating", 2236639777814973507L);
        setLongField(term268573, term268573.getClass(), "playerNewRating", 6934172739843259947L);
        setIntField(term268573, term268573.getClass(), "banState", -2031076660);
        setLongField(term268573, term268573.getClass(), "dateTime", 1834765450238984296L);
        term268942 = new Integer(266845392);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term268942;
        callMethod(klass, "setPlaySyncCount", argTypes, term268573, args);
    }

};


