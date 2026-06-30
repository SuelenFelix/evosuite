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

public class UserLoginBonus_getBonusId_18431313993 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45609;

    public UserLoginBonus_getBonusId_18431313993() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term45615 = new Long(-5248475803419977214L);
        Integer term45678 = new Integer(-1244386281);
        Integer term45680 = new Integer(-885788574);
        Integer term45682 = new Integer(-865722613);
        Integer term45684 = new Integer(-1551355284);
        Integer term45686 = new Integer(-1381970335);
        ArrayList term45676 = new ArrayList();
        ((ArrayList) term45676).add(term45678);
        ((ArrayList) term45676).add(term45680);
        ((ArrayList) term45676).add(term45682);
        ((ArrayList) term45676).add(term45684);
        ((ArrayList) term45676).add(term45686);
        Integer term45692 = new Integer(1213549815);
        ArrayList term45690 = new ArrayList();
        ((ArrayList) term45690).add(term45692);
        term45609 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserLoginBonus"));
        Object term45611 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term45613 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term45629 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term45630 = newInstance(Class.forName("java.time.LocalDate"));
        Object term45634 = newInstance(Class.forName("java.time.LocalTime"));
        Object term45639 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term45640 = newInstance(Class.forName("java.time.LocalDate"));
        Object term45644 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term45609, term45609.getClass(), "id", -519044061680044865L);
        setLongField(term45611, term45611.getClass(), "id", -5615015000728170842L);
        setLongField(term45613, term45613.getClass(), "id", -8165230786269861125L);
        setField(term45613, term45613.getClass(), "extId", term45615);
        setField(term45613, term45613.getClass(), "luid", "VUVgiQvSYa");
        setIntField(term45630, term45630.getClass(), "year", 2029);
        setShortField(term45630, term45630.getClass(), "month", (short) 5);
        setShortField(term45630, term45630.getClass(), "day", (short) 11);
        setField(term45629, term45629.getClass(), "date", term45630);
        setByteField(term45634, term45634.getClass(), "hour", (byte) 20);
        setByteField(term45634, term45634.getClass(), "minute", (byte) 17);
        setByteField(term45634, term45634.getClass(), "second", (byte) 32);
        setIntField(term45634, term45634.getClass(), "nano", 327503582);
        setField(term45629, term45629.getClass(), "time", term45634);
        setField(term45613, term45613.getClass(), "registerTime", term45629);
        setIntField(term45640, term45640.getClass(), "year", 2012);
        setShortField(term45640, term45640.getClass(), "month", (short) 10);
        setShortField(term45640, term45640.getClass(), "day", (short) 1);
        setField(term45639, term45639.getClass(), "date", term45640);
        setByteField(term45644, term45644.getClass(), "hour", (byte) 9);
        setByteField(term45644, term45644.getClass(), "minute", (byte) 27);
        setByteField(term45644, term45644.getClass(), "second", (byte) 33);
        setIntField(term45644, term45644.getClass(), "nano", 714912000);
        setField(term45639, term45639.getClass(), "time", term45644);
        setField(term45613, term45613.getClass(), "accessTime", term45639);
        setField(term45611, term45611.getClass(), "card", term45613);
        setField(term45611, term45611.getClass(), "userName", "sEGgJJplmE");
        setIntField(term45611, term45611.getClass(), "isNetMember", -1985017499);
        setIntField(term45611, term45611.getClass(), "iconId", 1959598890);
        setIntField(term45611, term45611.getClass(), "plateId", -920963609);
        setIntField(term45611, term45611.getClass(), "titleId", -724930680);
        setIntField(term45611, term45611.getClass(), "partnerId", -1859413089);
        setIntField(term45611, term45611.getClass(), "frameId", -288823387);
        setIntField(term45611, term45611.getClass(), "selectMapId", 1565022809);
        setIntField(term45611, term45611.getClass(), "totalAwake", 286088345);
        setIntField(term45611, term45611.getClass(), "gradeRating", -1958895309);
        setIntField(term45611, term45611.getClass(), "musicRating", -639022235);
        setIntField(term45611, term45611.getClass(), "playerRating", -1063872965);
        setIntField(term45611, term45611.getClass(), "highestRating", 804907633);
        setIntField(term45611, term45611.getClass(), "gradeRank", -937521678);
        setIntField(term45611, term45611.getClass(), "classRank", 194707851);
        setIntField(term45611, term45611.getClass(), "courseRank", 806877632);
        setField(term45611, term45611.getClass(), "charaSlot", term45676);
        setField(term45611, term45611.getClass(), "charaLockSlot", term45690);
        setLongField(term45611, term45611.getClass(), "contentBit", 7818214521807331044L);
        setIntField(term45611, term45611.getClass(), "playCount", -1198681384);
        setField(term45611, term45611.getClass(), "eventWatchedDate", "jyexiarswN");
        setField(term45611, term45611.getClass(), "lastGameId", "ZBLFNFVEHD");
        setField(term45611, term45611.getClass(), "lastRomVersion", "miNxpUfOyL");
        setField(term45611, term45611.getClass(), "lastDataVersion", "BAPTojeHRU");
        setField(term45611, term45611.getClass(), "lastLoginDate", "uqDEIRoVVf");
        setField(term45611, term45611.getClass(), "lastPlayDate", "HnLeZhnLzz");
        setIntField(term45611, term45611.getClass(), "lastPlayCredit", 1224777627);
        setIntField(term45611, term45611.getClass(), "lastPlayMode", -1771549367);
        setIntField(term45611, term45611.getClass(), "lastPlaceId", -83563931);
        setField(term45611, term45611.getClass(), "lastPlaceName", "ziYEsRkZmD");
        setIntField(term45611, term45611.getClass(), "lastAllNetId", 1175147923);
        setIntField(term45611, term45611.getClass(), "lastRegionId", -1424244263);
        setField(term45611, term45611.getClass(), "lastRegionName", "RFbJNwiLtv");
        setField(term45611, term45611.getClass(), "lastClientId", "eCxWMOpomA");
        setField(term45611, term45611.getClass(), "lastCountryCode", "pkQawlBtEF");
        setIntField(term45611, term45611.getClass(), "lastSelectEMoney", 808665285);
        setIntField(term45611, term45611.getClass(), "lastSelectTicket", 2003642877);
        setIntField(term45611, term45611.getClass(), "lastSelectCourse", -1574456346);
        setIntField(term45611, term45611.getClass(), "lastCountCourse", 638598511);
        setField(term45611, term45611.getClass(), "firstGameId", "rdKTcvHHnV");
        setField(term45611, term45611.getClass(), "firstRomVersion", "ELfUfLbXZf");
        setField(term45611, term45611.getClass(), "firstDataVersion", "SAglaHkagn");
        setField(term45611, term45611.getClass(), "firstPlayDate", "eZGxUfdoFn");
        setField(term45611, term45611.getClass(), "compatibleCmVersion", "yCWSlaOrSv");
        setField(term45611, term45611.getClass(), "dailyBonusDate", "PFpWKxDIRz");
        setField(term45611, term45611.getClass(), "dailyCourseBonusDate", "qePuOCwoCf");
        setField(term45611, term45611.getClass(), "lastPairLoginDate", "vJPujDInGq");
        setField(term45611, term45611.getClass(), "lastTrialPlayDate", "cHZGcMhatT");
        setIntField(term45611, term45611.getClass(), "playVsCount", -946663870);
        setIntField(term45611, term45611.getClass(), "playSyncCount", 1997126409);
        setIntField(term45611, term45611.getClass(), "winCount", 1794793561);
        setIntField(term45611, term45611.getClass(), "helpCount", 1483253425);
        setIntField(term45611, term45611.getClass(), "comboCount", -1101871231);
        setLongField(term45611, term45611.getClass(), "totalDeluxscore", 7027549200302660557L);
        setLongField(term45611, term45611.getClass(), "totalBasicDeluxscore", -4623233001658453008L);
        setLongField(term45611, term45611.getClass(), "totalAdvancedDeluxscore", -2816485221625714088L);
        setLongField(term45611, term45611.getClass(), "totalExpertDeluxscore", 2920715047797197542L);
        setLongField(term45611, term45611.getClass(), "totalMasterDeluxscore", -7084245215702303910L);
        setLongField(term45611, term45611.getClass(), "totalReMasterDeluxscore", -2143540634259970953L);
        setIntField(term45611, term45611.getClass(), "totalSync", 928527949);
        setIntField(term45611, term45611.getClass(), "totalBasicSync", 435463871);
        setIntField(term45611, term45611.getClass(), "totalAdvancedSync", -72892619);
        setIntField(term45611, term45611.getClass(), "totalExpertSync", 907161445);
        setIntField(term45611, term45611.getClass(), "totalMasterSync", -107125345);
        setIntField(term45611, term45611.getClass(), "totalReMasterSync", -1484271501);
        setLongField(term45611, term45611.getClass(), "totalAchievement", -6779665610828821838L);
        setLongField(term45611, term45611.getClass(), "totalBasicAchievement", 7026184159827656720L);
        setLongField(term45611, term45611.getClass(), "totalAdvancedAchievement", 432186805820232994L);
        setLongField(term45611, term45611.getClass(), "totalExpertAchievement", -2991029806121048772L);
        setLongField(term45611, term45611.getClass(), "totalMasterAchievement", -1146200229133968810L);
        setLongField(term45611, term45611.getClass(), "totalReMasterAchievement", -7968999170526273722L);
        setLongField(term45611, term45611.getClass(), "playerOldRating", -391398551284253915L);
        setLongField(term45611, term45611.getClass(), "playerNewRating", -2791473406557466846L);
        setIntField(term45611, term45611.getClass(), "banState", 1994800842);
        setLongField(term45611, term45611.getClass(), "dateTime", -3895780534600959979L);
        setField(term45609, term45609.getClass(), "user", term45611);
        setIntField(term45609, term45609.getClass(), "bonusId", 418349525);
        setIntField(term45609, term45609.getClass(), "point", 989214721);
        setBooleanField(term45609, term45609.getClass(), "isCurrent", false);
        setBooleanField(term45609, term45609.getClass(), "isComplete", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserLoginBonus");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBonusId", argTypes, term45609, args);
    }

};


