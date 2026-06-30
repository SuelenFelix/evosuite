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

public class UserDetail_setLastPlayMode_1155816525106 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4289861;
     Object term4290218;

    public UserDetail_setLastPlayMode_1155816525106() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4289865 = new Long(-5600163086356818263L);
        Integer term4289928 = new Integer(-84853525);
        Integer term4289930 = new Integer(-546326269);
        Integer term4289932 = new Integer(2053693297);
        ArrayList term4289926 = new ArrayList();
        ((ArrayList) term4289926).add(term4289928);
        ((ArrayList) term4289926).add(term4289930);
        ((ArrayList) term4289926).add(term4289932);
        Integer term4289938 = new Integer(-1629858755);
        Integer term4289940 = new Integer(357202791);
        Integer term4289942 = new Integer(752907570);
        Integer term4289944 = new Integer(-41191754);
        Integer term4289946 = new Integer(-298829219);
        Integer term4289948 = new Integer(-1327779796);
        ArrayList term4289936 = new ArrayList();
        ((ArrayList) term4289936).add(term4289938);
        ((ArrayList) term4289936).add(term4289940);
        ((ArrayList) term4289936).add(term4289942);
        ((ArrayList) term4289936).add(term4289944);
        ((ArrayList) term4289936).add(term4289946);
        ((ArrayList) term4289936).add(term4289948);
        term4289861 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term4289863 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term4289879 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4289880 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4289884 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4289889 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4289890 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4289894 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term4289861, term4289861.getClass(), "id", 6311391070588113179L);
        setLongField(term4289863, term4289863.getClass(), "id", -6597215525768495590L);
        setField(term4289863, term4289863.getClass(), "extId", term4289865);
        setField(term4289863, term4289863.getClass(), "luid", "GVyGbqMQwm");
        setIntField(term4289880, term4289880.getClass(), "year", 2010);
        setShortField(term4289880, term4289880.getClass(), "month", (short) 10);
        setShortField(term4289880, term4289880.getClass(), "day", (short) 6);
        setField(term4289879, term4289879.getClass(), "date", term4289880);
        setByteField(term4289884, term4289884.getClass(), "hour", (byte) 15);
        setByteField(term4289884, term4289884.getClass(), "minute", (byte) 0);
        setByteField(term4289884, term4289884.getClass(), "second", (byte) 25);
        setIntField(term4289884, term4289884.getClass(), "nano", 274155264);
        setField(term4289879, term4289879.getClass(), "time", term4289884);
        setField(term4289863, term4289863.getClass(), "registerTime", term4289879);
        setIntField(term4289890, term4289890.getClass(), "year", 2028);
        setShortField(term4289890, term4289890.getClass(), "month", (short) 7);
        setShortField(term4289890, term4289890.getClass(), "day", (short) 1);
        setField(term4289889, term4289889.getClass(), "date", term4289890);
        setByteField(term4289894, term4289894.getClass(), "hour", (byte) 18);
        setByteField(term4289894, term4289894.getClass(), "minute", (byte) 6);
        setByteField(term4289894, term4289894.getClass(), "second", (byte) 30);
        setIntField(term4289894, term4289894.getClass(), "nano", 1244960);
        setField(term4289889, term4289889.getClass(), "time", term4289894);
        setField(term4289863, term4289863.getClass(), "accessTime", term4289889);
        setField(term4289861, term4289861.getClass(), "card", term4289863);
        setField(term4289861, term4289861.getClass(), "userName", "rsKClYgyYI");
        setIntField(term4289861, term4289861.getClass(), "isNetMember", -1213731426);
        setIntField(term4289861, term4289861.getClass(), "iconId", 1208863358);
        setIntField(term4289861, term4289861.getClass(), "plateId", -720973510);
        setIntField(term4289861, term4289861.getClass(), "titleId", 152652446);
        setIntField(term4289861, term4289861.getClass(), "partnerId", -1103091797);
        setIntField(term4289861, term4289861.getClass(), "frameId", -254572777);
        setIntField(term4289861, term4289861.getClass(), "selectMapId", 1656869641);
        setIntField(term4289861, term4289861.getClass(), "totalAwake", -659485248);
        setIntField(term4289861, term4289861.getClass(), "gradeRating", -2100780831);
        setIntField(term4289861, term4289861.getClass(), "musicRating", -2305927);
        setIntField(term4289861, term4289861.getClass(), "playerRating", -2121920446);
        setIntField(term4289861, term4289861.getClass(), "highestRating", 186041224);
        setIntField(term4289861, term4289861.getClass(), "gradeRank", -1882779549);
        setIntField(term4289861, term4289861.getClass(), "classRank", -231853734);
        setIntField(term4289861, term4289861.getClass(), "courseRank", 689342045);
        setField(term4289861, term4289861.getClass(), "charaSlot", term4289926);
        setField(term4289861, term4289861.getClass(), "charaLockSlot", term4289936);
        setLongField(term4289861, term4289861.getClass(), "contentBit", -4252955253052671563L);
        setIntField(term4289861, term4289861.getClass(), "playCount", -170925143);
        setField(term4289861, term4289861.getClass(), "eventWatchedDate", "WQSXAKkYRD");
        setField(term4289861, term4289861.getClass(), "lastGameId", "zoNuvVxwhO");
        setField(term4289861, term4289861.getClass(), "lastRomVersion", "qkxeNuBbll");
        setField(term4289861, term4289861.getClass(), "lastDataVersion", "qHmSRJvdly");
        setField(term4289861, term4289861.getClass(), "lastLoginDate", "NPLsXHCdhy");
        setField(term4289861, term4289861.getClass(), "lastPlayDate", "bpwOGBrKTs");
        setIntField(term4289861, term4289861.getClass(), "lastPlayCredit", 1246470100);
        setIntField(term4289861, term4289861.getClass(), "lastPlayMode", -613660644);
        setIntField(term4289861, term4289861.getClass(), "lastPlaceId", -986701436);
        setField(term4289861, term4289861.getClass(), "lastPlaceName", "hYDAreaaxT");
        setIntField(term4289861, term4289861.getClass(), "lastAllNetId", -584661295);
        setIntField(term4289861, term4289861.getClass(), "lastRegionId", -1884009462);
        setField(term4289861, term4289861.getClass(), "lastRegionName", "SnVVLHxqzt");
        setField(term4289861, term4289861.getClass(), "lastClientId", "ngYdWIhSDA");
        setField(term4289861, term4289861.getClass(), "lastCountryCode", "SDiNcIDLpO");
        setIntField(term4289861, term4289861.getClass(), "lastSelectEMoney", 1490922358);
        setIntField(term4289861, term4289861.getClass(), "lastSelectTicket", 1609789029);
        setIntField(term4289861, term4289861.getClass(), "lastSelectCourse", -1067461147);
        setIntField(term4289861, term4289861.getClass(), "lastCountCourse", -75948799);
        setField(term4289861, term4289861.getClass(), "firstGameId", "tqghLzyjCm");
        setField(term4289861, term4289861.getClass(), "firstRomVersion", "edjeiChfjg");
        setField(term4289861, term4289861.getClass(), "firstDataVersion", "umuEgghqXa");
        setField(term4289861, term4289861.getClass(), "firstPlayDate", "ntMJTplPga");
        setField(term4289861, term4289861.getClass(), "compatibleCmVersion", "WcymcogMkx");
        setField(term4289861, term4289861.getClass(), "dailyBonusDate", "UshlzrXbCv");
        setField(term4289861, term4289861.getClass(), "dailyCourseBonusDate", "crKYBNPJMC");
        setField(term4289861, term4289861.getClass(), "lastPairLoginDate", "NeStQUshCU");
        setField(term4289861, term4289861.getClass(), "lastTrialPlayDate", "QAXVWlRQcU");
        setIntField(term4289861, term4289861.getClass(), "playVsCount", -258738861);
        setIntField(term4289861, term4289861.getClass(), "playSyncCount", -933817016);
        setIntField(term4289861, term4289861.getClass(), "winCount", 1635510673);
        setIntField(term4289861, term4289861.getClass(), "helpCount", 1550805265);
        setIntField(term4289861, term4289861.getClass(), "comboCount", 2036340730);
        setLongField(term4289861, term4289861.getClass(), "totalDeluxscore", -7161547745577003162L);
        setLongField(term4289861, term4289861.getClass(), "totalBasicDeluxscore", 4386665506593407982L);
        setLongField(term4289861, term4289861.getClass(), "totalAdvancedDeluxscore", -6432915728961206472L);
        setLongField(term4289861, term4289861.getClass(), "totalExpertDeluxscore", 1004067620656598581L);
        setLongField(term4289861, term4289861.getClass(), "totalMasterDeluxscore", -4717423890287255413L);
        setLongField(term4289861, term4289861.getClass(), "totalReMasterDeluxscore", 2451866189164268615L);
        setIntField(term4289861, term4289861.getClass(), "totalSync", 249459299);
        setIntField(term4289861, term4289861.getClass(), "totalBasicSync", -1321034241);
        setIntField(term4289861, term4289861.getClass(), "totalAdvancedSync", 757176163);
        setIntField(term4289861, term4289861.getClass(), "totalExpertSync", 198467950);
        setIntField(term4289861, term4289861.getClass(), "totalMasterSync", -894378131);
        setIntField(term4289861, term4289861.getClass(), "totalReMasterSync", 1387765477);
        setLongField(term4289861, term4289861.getClass(), "totalAchievement", 5009170441157624310L);
        setLongField(term4289861, term4289861.getClass(), "totalBasicAchievement", 8523526154200360404L);
        setLongField(term4289861, term4289861.getClass(), "totalAdvancedAchievement", 2058846940516421356L);
        setLongField(term4289861, term4289861.getClass(), "totalExpertAchievement", 3437782561545058L);
        setLongField(term4289861, term4289861.getClass(), "totalMasterAchievement", 4244806513282906431L);
        setLongField(term4289861, term4289861.getClass(), "totalReMasterAchievement", 9223023310107792754L);
        setLongField(term4289861, term4289861.getClass(), "playerOldRating", 7932027339276934886L);
        setLongField(term4289861, term4289861.getClass(), "playerNewRating", -8273199810123349536L);
        setIntField(term4289861, term4289861.getClass(), "banState", 2059146657);
        setLongField(term4289861, term4289861.getClass(), "dateTime", 3465079375335899135L);
        term4290218 = new Integer(-740765417);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term4290218;
        callMethod(klass, "setLastPlayMode", argTypes, term4289861, args);
    }

};


