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

public class UserDetail_getUserName_1807533512 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term196700;

    public UserDetail_getUserName_1807533512() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term196704 = new Long(-7001094993638840490L);
        Integer term196767 = new Integer(1333624993);
        Integer term196769 = new Integer(-1351263253);
        Integer term196771 = new Integer(-2032135607);
        Integer term196773 = new Integer(-1160239470);
        Integer term196775 = new Integer(601515362);
        ArrayList term196765 = new ArrayList();
        ((ArrayList) term196765).add(term196767);
        ((ArrayList) term196765).add(term196769);
        ((ArrayList) term196765).add(term196771);
        ((ArrayList) term196765).add(term196773);
        ((ArrayList) term196765).add(term196775);
        Integer term196781 = new Integer(361169760);
        Integer term196783 = new Integer(1796450668);
        Integer term196785 = new Integer(-1052517959);
        ArrayList term196779 = new ArrayList();
        ((ArrayList) term196779).add(term196781);
        ((ArrayList) term196779).add(term196783);
        ((ArrayList) term196779).add(term196785);
        term196700 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term196702 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term196718 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term196719 = newInstance(Class.forName("java.time.LocalDate"));
        Object term196723 = newInstance(Class.forName("java.time.LocalTime"));
        Object term196728 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term196729 = newInstance(Class.forName("java.time.LocalDate"));
        Object term196733 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term196700, term196700.getClass(), "id", 7968389197388339392L);
        setLongField(term196702, term196702.getClass(), "id", 7481016473114257898L);
        setField(term196702, term196702.getClass(), "extId", term196704);
        setField(term196702, term196702.getClass(), "luid", "WMaQyrwGdO");
        setIntField(term196719, term196719.getClass(), "year", 2010);
        setShortField(term196719, term196719.getClass(), "month", (short) 3);
        setShortField(term196719, term196719.getClass(), "day", (short) 19);
        setField(term196718, term196718.getClass(), "date", term196719);
        setByteField(term196723, term196723.getClass(), "hour", (byte) 8);
        setByteField(term196723, term196723.getClass(), "minute", (byte) 38);
        setByteField(term196723, term196723.getClass(), "second", (byte) 34);
        setIntField(term196723, term196723.getClass(), "nano", 473897267);
        setField(term196718, term196718.getClass(), "time", term196723);
        setField(term196702, term196702.getClass(), "registerTime", term196718);
        setIntField(term196729, term196729.getClass(), "year", 2023);
        setShortField(term196729, term196729.getClass(), "month", (short) 3);
        setShortField(term196729, term196729.getClass(), "day", (short) 17);
        setField(term196728, term196728.getClass(), "date", term196729);
        setByteField(term196733, term196733.getClass(), "hour", (byte) 13);
        setByteField(term196733, term196733.getClass(), "minute", (byte) 18);
        setByteField(term196733, term196733.getClass(), "second", (byte) 12);
        setIntField(term196733, term196733.getClass(), "nano", 422255508);
        setField(term196728, term196728.getClass(), "time", term196733);
        setField(term196702, term196702.getClass(), "accessTime", term196728);
        setField(term196700, term196700.getClass(), "card", term196702);
        setField(term196700, term196700.getClass(), "userName", "ZnZODAPebz");
        setIntField(term196700, term196700.getClass(), "isNetMember", -551112117);
        setIntField(term196700, term196700.getClass(), "iconId", -1391764319);
        setIntField(term196700, term196700.getClass(), "plateId", -37130270);
        setIntField(term196700, term196700.getClass(), "titleId", -1868643949);
        setIntField(term196700, term196700.getClass(), "partnerId", -83450776);
        setIntField(term196700, term196700.getClass(), "frameId", -1598054225);
        setIntField(term196700, term196700.getClass(), "selectMapId", 2121939630);
        setIntField(term196700, term196700.getClass(), "totalAwake", 1336739947);
        setIntField(term196700, term196700.getClass(), "gradeRating", 1393305038);
        setIntField(term196700, term196700.getClass(), "musicRating", 2110534824);
        setIntField(term196700, term196700.getClass(), "playerRating", -67895231);
        setIntField(term196700, term196700.getClass(), "highestRating", 275822795);
        setIntField(term196700, term196700.getClass(), "gradeRank", 1508399117);
        setIntField(term196700, term196700.getClass(), "classRank", -228155380);
        setIntField(term196700, term196700.getClass(), "courseRank", -2124766997);
        setField(term196700, term196700.getClass(), "charaSlot", term196765);
        setField(term196700, term196700.getClass(), "charaLockSlot", term196779);
        setLongField(term196700, term196700.getClass(), "contentBit", -2195609154813833144L);
        setIntField(term196700, term196700.getClass(), "playCount", 1133047506);
        setField(term196700, term196700.getClass(), "eventWatchedDate", "sZasilHTLD");
        setField(term196700, term196700.getClass(), "lastGameId", "fzGHTtdbZF");
        setField(term196700, term196700.getClass(), "lastRomVersion", "PseWsKPNnq");
        setField(term196700, term196700.getClass(), "lastDataVersion", "bTUqKPrsQc");
        setField(term196700, term196700.getClass(), "lastLoginDate", "hYtVnMoMQS");
        setField(term196700, term196700.getClass(), "lastPlayDate", "iVctvCjlkg");
        setIntField(term196700, term196700.getClass(), "lastPlayCredit", 2126443403);
        setIntField(term196700, term196700.getClass(), "lastPlayMode", 907419926);
        setIntField(term196700, term196700.getClass(), "lastPlaceId", 1410218337);
        setField(term196700, term196700.getClass(), "lastPlaceName", "LNrZSgEmMs");
        setIntField(term196700, term196700.getClass(), "lastAllNetId", -1548487396);
        setIntField(term196700, term196700.getClass(), "lastRegionId", -1092864344);
        setField(term196700, term196700.getClass(), "lastRegionName", "hhqCyYNKnb");
        setField(term196700, term196700.getClass(), "lastClientId", "ysTbjBRFqY");
        setField(term196700, term196700.getClass(), "lastCountryCode", "CvxoLXuHEl");
        setIntField(term196700, term196700.getClass(), "lastSelectEMoney", 909432589);
        setIntField(term196700, term196700.getClass(), "lastSelectTicket", -803102599);
        setIntField(term196700, term196700.getClass(), "lastSelectCourse", 1911613745);
        setIntField(term196700, term196700.getClass(), "lastCountCourse", -1397218525);
        setField(term196700, term196700.getClass(), "firstGameId", "eRCmaTGfAT");
        setField(term196700, term196700.getClass(), "firstRomVersion", "cJJYfvfkeW");
        setField(term196700, term196700.getClass(), "firstDataVersion", "rzQICgtUoG");
        setField(term196700, term196700.getClass(), "firstPlayDate", "OzrTIIogYX");
        setField(term196700, term196700.getClass(), "compatibleCmVersion", "FiuHTXYxCq");
        setField(term196700, term196700.getClass(), "dailyBonusDate", "GxjxMIDnAd");
        setField(term196700, term196700.getClass(), "dailyCourseBonusDate", "vFiRYSOyUM");
        setField(term196700, term196700.getClass(), "lastPairLoginDate", "ujXbNycUcd");
        setField(term196700, term196700.getClass(), "lastTrialPlayDate", "gAbvtKhiTv");
        setIntField(term196700, term196700.getClass(), "playVsCount", -878133799);
        setIntField(term196700, term196700.getClass(), "playSyncCount", -1097564879);
        setIntField(term196700, term196700.getClass(), "winCount", 531804989);
        setIntField(term196700, term196700.getClass(), "helpCount", 606449083);
        setIntField(term196700, term196700.getClass(), "comboCount", -84390184);
        setLongField(term196700, term196700.getClass(), "totalDeluxscore", -4870790849054926111L);
        setLongField(term196700, term196700.getClass(), "totalBasicDeluxscore", 903724671589694521L);
        setLongField(term196700, term196700.getClass(), "totalAdvancedDeluxscore", 7585258225423451405L);
        setLongField(term196700, term196700.getClass(), "totalExpertDeluxscore", -175474244919865471L);
        setLongField(term196700, term196700.getClass(), "totalMasterDeluxscore", -5671896210054445569L);
        setLongField(term196700, term196700.getClass(), "totalReMasterDeluxscore", 4341871498922510604L);
        setIntField(term196700, term196700.getClass(), "totalSync", 1107966197);
        setIntField(term196700, term196700.getClass(), "totalBasicSync", -987871994);
        setIntField(term196700, term196700.getClass(), "totalAdvancedSync", 810730521);
        setIntField(term196700, term196700.getClass(), "totalExpertSync", 231201522);
        setIntField(term196700, term196700.getClass(), "totalMasterSync", -1299754463);
        setIntField(term196700, term196700.getClass(), "totalReMasterSync", 1383683097);
        setLongField(term196700, term196700.getClass(), "totalAchievement", -1045165329910814240L);
        setLongField(term196700, term196700.getClass(), "totalBasicAchievement", -3331844424181822582L);
        setLongField(term196700, term196700.getClass(), "totalAdvancedAchievement", 5635233698057523929L);
        setLongField(term196700, term196700.getClass(), "totalExpertAchievement", -8043974053102621324L);
        setLongField(term196700, term196700.getClass(), "totalMasterAchievement", -5361818889594522955L);
        setLongField(term196700, term196700.getClass(), "totalReMasterAchievement", 3199971317374960975L);
        setLongField(term196700, term196700.getClass(), "playerOldRating", 6108766008294079173L);
        setLongField(term196700, term196700.getClass(), "playerNewRating", 567756631408113202L);
        setIntField(term196700, term196700.getClass(), "banState", 1395150060);
        setLongField(term196700, term196700.getClass(), "dateTime", -3691842816362174972L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUserName", argTypes, term196700, args);
    }

};


