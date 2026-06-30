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

public class UserDetail_getComboCount_207955244954 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4260080;

    public UserDetail_getComboCount_207955244954() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4260084 = new Long(703577619581573832L);
        Integer term4260147 = new Integer(1368012856);
        Integer term4260149 = new Integer(1989958895);
        ArrayList term4260145 = new ArrayList();
        ((ArrayList) term4260145).add(term4260147);
        ((ArrayList) term4260145).add(term4260149);
        Integer term4260155 = new Integer(1509008640);
        Integer term4260157 = new Integer(-534740768);
        Integer term4260159 = new Integer(1760958066);
        Integer term4260161 = new Integer(26818439);
        Integer term4260163 = new Integer(1721802598);
        Integer term4260165 = new Integer(-1208938714);
        ArrayList term4260153 = new ArrayList();
        ((ArrayList) term4260153).add(term4260155);
        ((ArrayList) term4260153).add(term4260157);
        ((ArrayList) term4260153).add(term4260159);
        ((ArrayList) term4260153).add(term4260161);
        ((ArrayList) term4260153).add(term4260163);
        ((ArrayList) term4260153).add(term4260165);
        term4260080 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term4260082 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term4260098 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4260099 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4260103 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4260108 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4260109 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4260113 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term4260080, term4260080.getClass(), "id", -7200070022170609514L);
        setLongField(term4260082, term4260082.getClass(), "id", -8074047929512911370L);
        setField(term4260082, term4260082.getClass(), "extId", term4260084);
        setField(term4260082, term4260082.getClass(), "luid", "sIxnMFNEuJ");
        setIntField(term4260099, term4260099.getClass(), "year", 2023);
        setShortField(term4260099, term4260099.getClass(), "month", (short) 3);
        setShortField(term4260099, term4260099.getClass(), "day", (short) 30);
        setField(term4260098, term4260098.getClass(), "date", term4260099);
        setByteField(term4260103, term4260103.getClass(), "hour", (byte) 3);
        setByteField(term4260103, term4260103.getClass(), "minute", (byte) 9);
        setByteField(term4260103, term4260103.getClass(), "second", (byte) 14);
        setIntField(term4260103, term4260103.getClass(), "nano", 845359342);
        setField(term4260098, term4260098.getClass(), "time", term4260103);
        setField(term4260082, term4260082.getClass(), "registerTime", term4260098);
        setIntField(term4260109, term4260109.getClass(), "year", 2023);
        setShortField(term4260109, term4260109.getClass(), "month", (short) 8);
        setShortField(term4260109, term4260109.getClass(), "day", (short) 1);
        setField(term4260108, term4260108.getClass(), "date", term4260109);
        setByteField(term4260113, term4260113.getClass(), "hour", (byte) 18);
        setByteField(term4260113, term4260113.getClass(), "minute", (byte) 24);
        setByteField(term4260113, term4260113.getClass(), "second", (byte) 39);
        setIntField(term4260113, term4260113.getClass(), "nano", 712019459);
        setField(term4260108, term4260108.getClass(), "time", term4260113);
        setField(term4260082, term4260082.getClass(), "accessTime", term4260108);
        setField(term4260080, term4260080.getClass(), "card", term4260082);
        setField(term4260080, term4260080.getClass(), "userName", "qAKJLiDEBU");
        setIntField(term4260080, term4260080.getClass(), "isNetMember", 50136425);
        setIntField(term4260080, term4260080.getClass(), "iconId", 1943216313);
        setIntField(term4260080, term4260080.getClass(), "plateId", -2032450570);
        setIntField(term4260080, term4260080.getClass(), "titleId", -36271252);
        setIntField(term4260080, term4260080.getClass(), "partnerId", 1033601262);
        setIntField(term4260080, term4260080.getClass(), "frameId", -855811499);
        setIntField(term4260080, term4260080.getClass(), "selectMapId", 898497133);
        setIntField(term4260080, term4260080.getClass(), "totalAwake", -659300652);
        setIntField(term4260080, term4260080.getClass(), "gradeRating", 1106195036);
        setIntField(term4260080, term4260080.getClass(), "musicRating", 203187142);
        setIntField(term4260080, term4260080.getClass(), "playerRating", 1985150590);
        setIntField(term4260080, term4260080.getClass(), "highestRating", 42398777);
        setIntField(term4260080, term4260080.getClass(), "gradeRank", 621449585);
        setIntField(term4260080, term4260080.getClass(), "classRank", 2013321765);
        setIntField(term4260080, term4260080.getClass(), "courseRank", -711697446);
        setField(term4260080, term4260080.getClass(), "charaSlot", term4260145);
        setField(term4260080, term4260080.getClass(), "charaLockSlot", term4260153);
        setLongField(term4260080, term4260080.getClass(), "contentBit", 2234368819528227881L);
        setIntField(term4260080, term4260080.getClass(), "playCount", 179226929);
        setField(term4260080, term4260080.getClass(), "eventWatchedDate", "nsoHaFFiqj");
        setField(term4260080, term4260080.getClass(), "lastGameId", "gfCNJCfkvY");
        setField(term4260080, term4260080.getClass(), "lastRomVersion", "gDGAjeoVeK");
        setField(term4260080, term4260080.getClass(), "lastDataVersion", "ADKHqoYNqr");
        setField(term4260080, term4260080.getClass(), "lastLoginDate", "CUALpvkTII");
        setField(term4260080, term4260080.getClass(), "lastPlayDate", "fbkiunYhgD");
        setIntField(term4260080, term4260080.getClass(), "lastPlayCredit", -1712923380);
        setIntField(term4260080, term4260080.getClass(), "lastPlayMode", -1293935414);
        setIntField(term4260080, term4260080.getClass(), "lastPlaceId", 4394222);
        setField(term4260080, term4260080.getClass(), "lastPlaceName", "QDISjVpBWw");
        setIntField(term4260080, term4260080.getClass(), "lastAllNetId", 1806456352);
        setIntField(term4260080, term4260080.getClass(), "lastRegionId", 1795196143);
        setField(term4260080, term4260080.getClass(), "lastRegionName", "lsIyMVPwCJ");
        setField(term4260080, term4260080.getClass(), "lastClientId", "NBsnxOSIsi");
        setField(term4260080, term4260080.getClass(), "lastCountryCode", "FZNuYEVFOG");
        setIntField(term4260080, term4260080.getClass(), "lastSelectEMoney", -2119995974);
        setIntField(term4260080, term4260080.getClass(), "lastSelectTicket", 983565380);
        setIntField(term4260080, term4260080.getClass(), "lastSelectCourse", 492529098);
        setIntField(term4260080, term4260080.getClass(), "lastCountCourse", -492180538);
        setField(term4260080, term4260080.getClass(), "firstGameId", "TSySITcLbi");
        setField(term4260080, term4260080.getClass(), "firstRomVersion", "KkBvDdvUpH");
        setField(term4260080, term4260080.getClass(), "firstDataVersion", "NAxBMjlmTh");
        setField(term4260080, term4260080.getClass(), "firstPlayDate", "KGoQUcyPEz");
        setField(term4260080, term4260080.getClass(), "compatibleCmVersion", "mMVxfZSeDS");
        setField(term4260080, term4260080.getClass(), "dailyBonusDate", "gBZsrplvDT");
        setField(term4260080, term4260080.getClass(), "dailyCourseBonusDate", "TvCHoocfyo");
        setField(term4260080, term4260080.getClass(), "lastPairLoginDate", "oDSSaAlALk");
        setField(term4260080, term4260080.getClass(), "lastTrialPlayDate", "kOWCSuvzJt");
        setIntField(term4260080, term4260080.getClass(), "playVsCount", -450615970);
        setIntField(term4260080, term4260080.getClass(), "playSyncCount", -146675671);
        setIntField(term4260080, term4260080.getClass(), "winCount", 1009308201);
        setIntField(term4260080, term4260080.getClass(), "helpCount", -1556495000);
        setIntField(term4260080, term4260080.getClass(), "comboCount", -1387598474);
        setLongField(term4260080, term4260080.getClass(), "totalDeluxscore", 4346675940339697056L);
        setLongField(term4260080, term4260080.getClass(), "totalBasicDeluxscore", -1093430726909345143L);
        setLongField(term4260080, term4260080.getClass(), "totalAdvancedDeluxscore", 8275491657742726533L);
        setLongField(term4260080, term4260080.getClass(), "totalExpertDeluxscore", -34412738325159709L);
        setLongField(term4260080, term4260080.getClass(), "totalMasterDeluxscore", 544003574214653811L);
        setLongField(term4260080, term4260080.getClass(), "totalReMasterDeluxscore", -3162687229631734684L);
        setIntField(term4260080, term4260080.getClass(), "totalSync", 2068341904);
        setIntField(term4260080, term4260080.getClass(), "totalBasicSync", 1152334464);
        setIntField(term4260080, term4260080.getClass(), "totalAdvancedSync", 113939804);
        setIntField(term4260080, term4260080.getClass(), "totalExpertSync", 1660106572);
        setIntField(term4260080, term4260080.getClass(), "totalMasterSync", -531089610);
        setIntField(term4260080, term4260080.getClass(), "totalReMasterSync", -937392465);
        setLongField(term4260080, term4260080.getClass(), "totalAchievement", 2848446433142441940L);
        setLongField(term4260080, term4260080.getClass(), "totalBasicAchievement", -1450078978076548612L);
        setLongField(term4260080, term4260080.getClass(), "totalAdvancedAchievement", 4765136204817513746L);
        setLongField(term4260080, term4260080.getClass(), "totalExpertAchievement", 2736564025291273828L);
        setLongField(term4260080, term4260080.getClass(), "totalMasterAchievement", -925922572597903050L);
        setLongField(term4260080, term4260080.getClass(), "totalReMasterAchievement", 3024830686915150434L);
        setLongField(term4260080, term4260080.getClass(), "playerOldRating", -5735929401001836078L);
        setLongField(term4260080, term4260080.getClass(), "playerNewRating", -1148928746765787317L);
        setIntField(term4260080, term4260080.getClass(), "banState", -1516957282);
        setLongField(term4260080, term4260080.getClass(), "dateTime", 4694225212518513185L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getComboCount", argTypes, term4260080, args);
    }

};


