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

public class UserDetail_getGradeRank_35946993116 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term204154;

    public UserDetail_getGradeRank_35946993116() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term204158 = new Long(9214973322210954344L);
        Integer term204221 = new Integer(367237282);
        Integer term204223 = new Integer(1917343242);
        ArrayList term204219 = new ArrayList();
        ((ArrayList) term204219).add(term204221);
        ((ArrayList) term204219).add(term204223);
        Integer term204229 = new Integer(504552083);
        Integer term204231 = new Integer(-714955265);
        Integer term204233 = new Integer(1191317081);
        Integer term204235 = new Integer(-1321805207);
        Integer term204237 = new Integer(1827794411);
        Integer term204239 = new Integer(-1377700263);
        Integer term204241 = new Integer(-38722118);
        Integer term204243 = new Integer(1123663642);
        Integer term204245 = new Integer(404156777);
        ArrayList term204227 = new ArrayList();
        ((ArrayList) term204227).add(term204229);
        ((ArrayList) term204227).add(term204231);
        ((ArrayList) term204227).add(term204233);
        ((ArrayList) term204227).add(term204235);
        ((ArrayList) term204227).add(term204237);
        ((ArrayList) term204227).add(term204239);
        ((ArrayList) term204227).add(term204241);
        ((ArrayList) term204227).add(term204243);
        ((ArrayList) term204227).add(term204245);
        term204154 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term204156 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term204172 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term204173 = newInstance(Class.forName("java.time.LocalDate"));
        Object term204177 = newInstance(Class.forName("java.time.LocalTime"));
        Object term204182 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term204183 = newInstance(Class.forName("java.time.LocalDate"));
        Object term204187 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term204154, term204154.getClass(), "id", -8140269607962363771L);
        setLongField(term204156, term204156.getClass(), "id", -8951873110592455526L);
        setField(term204156, term204156.getClass(), "extId", term204158);
        setField(term204156, term204156.getClass(), "luid", "ycqCtfhzXb");
        setIntField(term204173, term204173.getClass(), "year", 2019);
        setShortField(term204173, term204173.getClass(), "month", (short) 4);
        setShortField(term204173, term204173.getClass(), "day", (short) 21);
        setField(term204172, term204172.getClass(), "date", term204173);
        setByteField(term204177, term204177.getClass(), "hour", (byte) 17);
        setByteField(term204177, term204177.getClass(), "minute", (byte) 1);
        setByteField(term204177, term204177.getClass(), "second", (byte) 1);
        setIntField(term204177, term204177.getClass(), "nano", 802156649);
        setField(term204172, term204172.getClass(), "time", term204177);
        setField(term204156, term204156.getClass(), "registerTime", term204172);
        setIntField(term204183, term204183.getClass(), "year", 2029);
        setShortField(term204183, term204183.getClass(), "month", (short) 8);
        setShortField(term204183, term204183.getClass(), "day", (short) 7);
        setField(term204182, term204182.getClass(), "date", term204183);
        setByteField(term204187, term204187.getClass(), "hour", (byte) 5);
        setByteField(term204187, term204187.getClass(), "minute", (byte) 54);
        setByteField(term204187, term204187.getClass(), "second", (byte) 5);
        setIntField(term204187, term204187.getClass(), "nano", 873009584);
        setField(term204182, term204182.getClass(), "time", term204187);
        setField(term204156, term204156.getClass(), "accessTime", term204182);
        setField(term204154, term204154.getClass(), "card", term204156);
        setField(term204154, term204154.getClass(), "userName", "hHEPUEjwue");
        setIntField(term204154, term204154.getClass(), "isNetMember", 1904125756);
        setIntField(term204154, term204154.getClass(), "iconId", -174814025);
        setIntField(term204154, term204154.getClass(), "plateId", 958303322);
        setIntField(term204154, term204154.getClass(), "titleId", 1228479658);
        setIntField(term204154, term204154.getClass(), "partnerId", 129520433);
        setIntField(term204154, term204154.getClass(), "frameId", 390437953);
        setIntField(term204154, term204154.getClass(), "selectMapId", -1928220499);
        setIntField(term204154, term204154.getClass(), "totalAwake", 1701541391);
        setIntField(term204154, term204154.getClass(), "gradeRating", -936192688);
        setIntField(term204154, term204154.getClass(), "musicRating", 938944057);
        setIntField(term204154, term204154.getClass(), "playerRating", 855364273);
        setIntField(term204154, term204154.getClass(), "highestRating", -519539376);
        setIntField(term204154, term204154.getClass(), "gradeRank", -651264831);
        setIntField(term204154, term204154.getClass(), "classRank", 801845409);
        setIntField(term204154, term204154.getClass(), "courseRank", -638292583);
        setField(term204154, term204154.getClass(), "charaSlot", term204219);
        setField(term204154, term204154.getClass(), "charaLockSlot", term204227);
        setLongField(term204154, term204154.getClass(), "contentBit", 593453002234887028L);
        setIntField(term204154, term204154.getClass(), "playCount", -1507192014);
        setField(term204154, term204154.getClass(), "eventWatchedDate", "AqvAgwgMuB");
        setField(term204154, term204154.getClass(), "lastGameId", "dvpcdqyFhJ");
        setField(term204154, term204154.getClass(), "lastRomVersion", "VJviCLWjOI");
        setField(term204154, term204154.getClass(), "lastDataVersion", "qGNmOJWXuG");
        setField(term204154, term204154.getClass(), "lastLoginDate", "DBFxRyHqcA");
        setField(term204154, term204154.getClass(), "lastPlayDate", "JrWDWJOfwP");
        setIntField(term204154, term204154.getClass(), "lastPlayCredit", -444046395);
        setIntField(term204154, term204154.getClass(), "lastPlayMode", -1931089223);
        setIntField(term204154, term204154.getClass(), "lastPlaceId", -1614199178);
        setField(term204154, term204154.getClass(), "lastPlaceName", "BJImAbrJEY");
        setIntField(term204154, term204154.getClass(), "lastAllNetId", 8500819);
        setIntField(term204154, term204154.getClass(), "lastRegionId", -84115449);
        setField(term204154, term204154.getClass(), "lastRegionName", "rHIDnzBHHl");
        setField(term204154, term204154.getClass(), "lastClientId", "vnrhTjOoxH");
        setField(term204154, term204154.getClass(), "lastCountryCode", "rblOltzpJS");
        setIntField(term204154, term204154.getClass(), "lastSelectEMoney", 1974081733);
        setIntField(term204154, term204154.getClass(), "lastSelectTicket", -29727064);
        setIntField(term204154, term204154.getClass(), "lastSelectCourse", -36303217);
        setIntField(term204154, term204154.getClass(), "lastCountCourse", -1425546184);
        setField(term204154, term204154.getClass(), "firstGameId", "cyAWsunQSB");
        setField(term204154, term204154.getClass(), "firstRomVersion", "zLnhtvrchF");
        setField(term204154, term204154.getClass(), "firstDataVersion", "BjBJGYddVv");
        setField(term204154, term204154.getClass(), "firstPlayDate", "sGGddIJPhE");
        setField(term204154, term204154.getClass(), "compatibleCmVersion", "eHTNUdKVTL");
        setField(term204154, term204154.getClass(), "dailyBonusDate", "JxzPgAmCIC");
        setField(term204154, term204154.getClass(), "dailyCourseBonusDate", "KegshKdpZe");
        setField(term204154, term204154.getClass(), "lastPairLoginDate", "uSUOJfFAeX");
        setField(term204154, term204154.getClass(), "lastTrialPlayDate", "KOOGHqzUDs");
        setIntField(term204154, term204154.getClass(), "playVsCount", -1133905901);
        setIntField(term204154, term204154.getClass(), "playSyncCount", -975779438);
        setIntField(term204154, term204154.getClass(), "winCount", -1141325147);
        setIntField(term204154, term204154.getClass(), "helpCount", 1102382810);
        setIntField(term204154, term204154.getClass(), "comboCount", -546054340);
        setLongField(term204154, term204154.getClass(), "totalDeluxscore", 4453491050716159630L);
        setLongField(term204154, term204154.getClass(), "totalBasicDeluxscore", -3941556871134552655L);
        setLongField(term204154, term204154.getClass(), "totalAdvancedDeluxscore", -1261353123094055721L);
        setLongField(term204154, term204154.getClass(), "totalExpertDeluxscore", 6162444134699410509L);
        setLongField(term204154, term204154.getClass(), "totalMasterDeluxscore", -9202887711706840371L);
        setLongField(term204154, term204154.getClass(), "totalReMasterDeluxscore", -762055079462169234L);
        setIntField(term204154, term204154.getClass(), "totalSync", 839496076);
        setIntField(term204154, term204154.getClass(), "totalBasicSync", -709438438);
        setIntField(term204154, term204154.getClass(), "totalAdvancedSync", -270196134);
        setIntField(term204154, term204154.getClass(), "totalExpertSync", -518906199);
        setIntField(term204154, term204154.getClass(), "totalMasterSync", 913561629);
        setIntField(term204154, term204154.getClass(), "totalReMasterSync", -82780836);
        setLongField(term204154, term204154.getClass(), "totalAchievement", 4628565500635907989L);
        setLongField(term204154, term204154.getClass(), "totalBasicAchievement", 3937878496290704721L);
        setLongField(term204154, term204154.getClass(), "totalAdvancedAchievement", -5148590456264489786L);
        setLongField(term204154, term204154.getClass(), "totalExpertAchievement", 6690184392200642449L);
        setLongField(term204154, term204154.getClass(), "totalMasterAchievement", 8386363903106304846L);
        setLongField(term204154, term204154.getClass(), "totalReMasterAchievement", 1755271321964447912L);
        setLongField(term204154, term204154.getClass(), "playerOldRating", -4338604278922562922L);
        setLongField(term204154, term204154.getClass(), "playerNewRating", -3212157865782021194L);
        setIntField(term204154, term204154.getClass(), "banState", -1538850204);
        setLongField(term204154, term204154.getClass(), "dateTime", 3418222245252980196L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getGradeRank", argTypes, term204154, args);
    }

};


