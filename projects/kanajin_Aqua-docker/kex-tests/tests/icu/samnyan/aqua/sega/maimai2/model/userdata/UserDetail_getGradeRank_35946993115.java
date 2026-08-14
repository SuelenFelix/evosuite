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

public class UserDetail_getGradeRank_35946993115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term204099;

    public UserDetail_getGradeRank_35946993115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term204103 = new Long(9214973322210954344L);
        Integer term204166 = new Integer(367237282);
        Integer term204168 = new Integer(1917343242);
        ArrayList term204164 = new ArrayList();
        ((ArrayList) term204164).add(term204166);
        ((ArrayList) term204164).add(term204168);
        Integer term204174 = new Integer(504552083);
        Integer term204176 = new Integer(-714955265);
        Integer term204178 = new Integer(1191317081);
        Integer term204180 = new Integer(-1321805207);
        Integer term204182 = new Integer(1827794411);
        Integer term204184 = new Integer(-1377700263);
        Integer term204186 = new Integer(-38722118);
        Integer term204188 = new Integer(1123663642);
        Integer term204190 = new Integer(404156777);
        ArrayList term204172 = new ArrayList();
        ((ArrayList) term204172).add(term204174);
        ((ArrayList) term204172).add(term204176);
        ((ArrayList) term204172).add(term204178);
        ((ArrayList) term204172).add(term204180);
        ((ArrayList) term204172).add(term204182);
        ((ArrayList) term204172).add(term204184);
        ((ArrayList) term204172).add(term204186);
        ((ArrayList) term204172).add(term204188);
        ((ArrayList) term204172).add(term204190);
        term204099 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term204101 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term204117 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term204118 = newInstance(Class.forName("java.time.LocalDate"));
        Object term204122 = newInstance(Class.forName("java.time.LocalTime"));
        Object term204127 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term204128 = newInstance(Class.forName("java.time.LocalDate"));
        Object term204132 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term204099, term204099.getClass(), "id", -8140269607962363771L);
        setLongField(term204101, term204101.getClass(), "id", -8951873110592455526L);
        setField(term204101, term204101.getClass(), "extId", term204103);
        setField(term204101, term204101.getClass(), "luid", "ycqCtfhzXb");
        setIntField(term204118, term204118.getClass(), "year", 2019);
        setShortField(term204118, term204118.getClass(), "month", (short) 4);
        setShortField(term204118, term204118.getClass(), "day", (short) 21);
        setField(term204117, term204117.getClass(), "date", term204118);
        setByteField(term204122, term204122.getClass(), "hour", (byte) 17);
        setByteField(term204122, term204122.getClass(), "minute", (byte) 1);
        setByteField(term204122, term204122.getClass(), "second", (byte) 1);
        setIntField(term204122, term204122.getClass(), "nano", 802156649);
        setField(term204117, term204117.getClass(), "time", term204122);
        setField(term204101, term204101.getClass(), "registerTime", term204117);
        setIntField(term204128, term204128.getClass(), "year", 2029);
        setShortField(term204128, term204128.getClass(), "month", (short) 8);
        setShortField(term204128, term204128.getClass(), "day", (short) 7);
        setField(term204127, term204127.getClass(), "date", term204128);
        setByteField(term204132, term204132.getClass(), "hour", (byte) 5);
        setByteField(term204132, term204132.getClass(), "minute", (byte) 54);
        setByteField(term204132, term204132.getClass(), "second", (byte) 5);
        setIntField(term204132, term204132.getClass(), "nano", 873009584);
        setField(term204127, term204127.getClass(), "time", term204132);
        setField(term204101, term204101.getClass(), "accessTime", term204127);
        setField(term204099, term204099.getClass(), "card", term204101);
        setField(term204099, term204099.getClass(), "userName", "hHEPUEjwue");
        setIntField(term204099, term204099.getClass(), "isNetMember", 1904125756);
        setIntField(term204099, term204099.getClass(), "iconId", -174814025);
        setIntField(term204099, term204099.getClass(), "plateId", 958303322);
        setIntField(term204099, term204099.getClass(), "titleId", 1228479658);
        setIntField(term204099, term204099.getClass(), "partnerId", 129520433);
        setIntField(term204099, term204099.getClass(), "frameId", 390437953);
        setIntField(term204099, term204099.getClass(), "selectMapId", -1928220499);
        setIntField(term204099, term204099.getClass(), "totalAwake", 1701541391);
        setIntField(term204099, term204099.getClass(), "gradeRating", -936192688);
        setIntField(term204099, term204099.getClass(), "musicRating", 938944057);
        setIntField(term204099, term204099.getClass(), "playerRating", 855364273);
        setIntField(term204099, term204099.getClass(), "highestRating", -519539376);
        setIntField(term204099, term204099.getClass(), "gradeRank", -651264831);
        setIntField(term204099, term204099.getClass(), "classRank", 801845409);
        setIntField(term204099, term204099.getClass(), "courseRank", -638292583);
        setField(term204099, term204099.getClass(), "charaSlot", term204164);
        setField(term204099, term204099.getClass(), "charaLockSlot", term204172);
        setLongField(term204099, term204099.getClass(), "contentBit", 593453002234887028L);
        setIntField(term204099, term204099.getClass(), "playCount", -1507192014);
        setField(term204099, term204099.getClass(), "eventWatchedDate", "AqvAgwgMuB");
        setField(term204099, term204099.getClass(), "lastGameId", "dvpcdqyFhJ");
        setField(term204099, term204099.getClass(), "lastRomVersion", "VJviCLWjOI");
        setField(term204099, term204099.getClass(), "lastDataVersion", "qGNmOJWXuG");
        setField(term204099, term204099.getClass(), "lastLoginDate", "DBFxRyHqcA");
        setField(term204099, term204099.getClass(), "lastPlayDate", "JrWDWJOfwP");
        setIntField(term204099, term204099.getClass(), "lastPlayCredit", -444046395);
        setIntField(term204099, term204099.getClass(), "lastPlayMode", -1931089223);
        setIntField(term204099, term204099.getClass(), "lastPlaceId", -1614199178);
        setField(term204099, term204099.getClass(), "lastPlaceName", "BJImAbrJEY");
        setIntField(term204099, term204099.getClass(), "lastAllNetId", 8500819);
        setIntField(term204099, term204099.getClass(), "lastRegionId", -84115449);
        setField(term204099, term204099.getClass(), "lastRegionName", "rHIDnzBHHl");
        setField(term204099, term204099.getClass(), "lastClientId", "vnrhTjOoxH");
        setField(term204099, term204099.getClass(), "lastCountryCode", "rblOltzpJS");
        setIntField(term204099, term204099.getClass(), "lastSelectEMoney", 1974081733);
        setIntField(term204099, term204099.getClass(), "lastSelectTicket", -29727064);
        setIntField(term204099, term204099.getClass(), "lastSelectCourse", -36303217);
        setIntField(term204099, term204099.getClass(), "lastCountCourse", -1425546184);
        setField(term204099, term204099.getClass(), "firstGameId", "cyAWsunQSB");
        setField(term204099, term204099.getClass(), "firstRomVersion", "zLnhtvrchF");
        setField(term204099, term204099.getClass(), "firstDataVersion", "BjBJGYddVv");
        setField(term204099, term204099.getClass(), "firstPlayDate", "sGGddIJPhE");
        setField(term204099, term204099.getClass(), "compatibleCmVersion", "eHTNUdKVTL");
        setField(term204099, term204099.getClass(), "dailyBonusDate", "JxzPgAmCIC");
        setField(term204099, term204099.getClass(), "dailyCourseBonusDate", "KegshKdpZe");
        setField(term204099, term204099.getClass(), "lastPairLoginDate", "uSUOJfFAeX");
        setField(term204099, term204099.getClass(), "lastTrialPlayDate", "KOOGHqzUDs");
        setIntField(term204099, term204099.getClass(), "playVsCount", -1133905901);
        setIntField(term204099, term204099.getClass(), "playSyncCount", -975779438);
        setIntField(term204099, term204099.getClass(), "winCount", -1141325147);
        setIntField(term204099, term204099.getClass(), "helpCount", 1102382810);
        setIntField(term204099, term204099.getClass(), "comboCount", -546054340);
        setLongField(term204099, term204099.getClass(), "totalDeluxscore", 4453491050716159630L);
        setLongField(term204099, term204099.getClass(), "totalBasicDeluxscore", -3941556871134552655L);
        setLongField(term204099, term204099.getClass(), "totalAdvancedDeluxscore", -1261353123094055721L);
        setLongField(term204099, term204099.getClass(), "totalExpertDeluxscore", 6162444134699410509L);
        setLongField(term204099, term204099.getClass(), "totalMasterDeluxscore", -9202887711706840371L);
        setLongField(term204099, term204099.getClass(), "totalReMasterDeluxscore", -762055079462169234L);
        setIntField(term204099, term204099.getClass(), "totalSync", 839496076);
        setIntField(term204099, term204099.getClass(), "totalBasicSync", -709438438);
        setIntField(term204099, term204099.getClass(), "totalAdvancedSync", -270196134);
        setIntField(term204099, term204099.getClass(), "totalExpertSync", -518906199);
        setIntField(term204099, term204099.getClass(), "totalMasterSync", 913561629);
        setIntField(term204099, term204099.getClass(), "totalReMasterSync", -82780836);
        setLongField(term204099, term204099.getClass(), "totalAchievement", 4628565500635907989L);
        setLongField(term204099, term204099.getClass(), "totalBasicAchievement", 3937878496290704721L);
        setLongField(term204099, term204099.getClass(), "totalAdvancedAchievement", -5148590456264489786L);
        setLongField(term204099, term204099.getClass(), "totalExpertAchievement", 6690184392200642449L);
        setLongField(term204099, term204099.getClass(), "totalMasterAchievement", 8386363903106304846L);
        setLongField(term204099, term204099.getClass(), "totalReMasterAchievement", 1755271321964447912L);
        setLongField(term204099, term204099.getClass(), "playerOldRating", -4338604278922562922L);
        setLongField(term204099, term204099.getClass(), "playerNewRating", -3212157865782021194L);
        setIntField(term204099, term204099.getClass(), "banState", -1538850204);
        setLongField(term204099, term204099.getClass(), "dateTime", 3418222245252980196L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getGradeRank", argTypes, term204099, args);
    }

};


