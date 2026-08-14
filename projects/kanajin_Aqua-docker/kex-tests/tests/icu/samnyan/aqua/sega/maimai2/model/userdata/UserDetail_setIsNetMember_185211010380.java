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

public class UserDetail_setIsNetMember_185211010380 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term240862;
     Object term241215;

    public UserDetail_setIsNetMember_185211010380() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term240866 = new Long(2287449183416662404L);
        Integer term240929 = new Integer(-467618426);
        Integer term240931 = new Integer(1728446971);
        Integer term240933 = new Integer(871757481);
        Integer term240935 = new Integer(-866223414);
        Integer term240937 = new Integer(-914821646);
        ArrayList term240927 = new ArrayList();
        ((ArrayList) term240927).add(term240929);
        ((ArrayList) term240927).add(term240931);
        ((ArrayList) term240927).add(term240933);
        ((ArrayList) term240927).add(term240935);
        ((ArrayList) term240927).add(term240937);
        Integer term240943 = new Integer(-1420229744);
        Integer term240945 = new Integer(-2026011046);
        ArrayList term240941 = new ArrayList();
        ((ArrayList) term240941).add(term240943);
        ((ArrayList) term240941).add(term240945);
        term240862 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term240864 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term240880 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term240881 = newInstance(Class.forName("java.time.LocalDate"));
        Object term240885 = newInstance(Class.forName("java.time.LocalTime"));
        Object term240890 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term240891 = newInstance(Class.forName("java.time.LocalDate"));
        Object term240895 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term240862, term240862.getClass(), "id", 9021246435004265845L);
        setLongField(term240864, term240864.getClass(), "id", 6778552590643258245L);
        setField(term240864, term240864.getClass(), "extId", term240866);
        setField(term240864, term240864.getClass(), "luid", "PxUDJOUGKY");
        setIntField(term240881, term240881.getClass(), "year", 2016);
        setShortField(term240881, term240881.getClass(), "month", (short) 5);
        setShortField(term240881, term240881.getClass(), "day", (short) 5);
        setField(term240880, term240880.getClass(), "date", term240881);
        setByteField(term240885, term240885.getClass(), "hour", (byte) 17);
        setByteField(term240885, term240885.getClass(), "minute", (byte) 12);
        setByteField(term240885, term240885.getClass(), "second", (byte) 48);
        setIntField(term240885, term240885.getClass(), "nano", 651546858);
        setField(term240880, term240880.getClass(), "time", term240885);
        setField(term240864, term240864.getClass(), "registerTime", term240880);
        setIntField(term240891, term240891.getClass(), "year", 2025);
        setShortField(term240891, term240891.getClass(), "month", (short) 1);
        setShortField(term240891, term240891.getClass(), "day", (short) 28);
        setField(term240890, term240890.getClass(), "date", term240891);
        setByteField(term240895, term240895.getClass(), "hour", (byte) 5);
        setByteField(term240895, term240895.getClass(), "minute", (byte) 55);
        setByteField(term240895, term240895.getClass(), "second", (byte) 9);
        setIntField(term240895, term240895.getClass(), "nano", 554633353);
        setField(term240890, term240890.getClass(), "time", term240895);
        setField(term240864, term240864.getClass(), "accessTime", term240890);
        setField(term240862, term240862.getClass(), "card", term240864);
        setField(term240862, term240862.getClass(), "userName", "QHNYCCZevd");
        setIntField(term240862, term240862.getClass(), "isNetMember", -165829479);
        setIntField(term240862, term240862.getClass(), "iconId", -880324916);
        setIntField(term240862, term240862.getClass(), "plateId", -1918157839);
        setIntField(term240862, term240862.getClass(), "titleId", 2061957294);
        setIntField(term240862, term240862.getClass(), "partnerId", 988785008);
        setIntField(term240862, term240862.getClass(), "frameId", -587123214);
        setIntField(term240862, term240862.getClass(), "selectMapId", 1762759091);
        setIntField(term240862, term240862.getClass(), "totalAwake", -1702159860);
        setIntField(term240862, term240862.getClass(), "gradeRating", 923629657);
        setIntField(term240862, term240862.getClass(), "musicRating", 171332193);
        setIntField(term240862, term240862.getClass(), "playerRating", -466611857);
        setIntField(term240862, term240862.getClass(), "highestRating", -1873372086);
        setIntField(term240862, term240862.getClass(), "gradeRank", 269196378);
        setIntField(term240862, term240862.getClass(), "classRank", 751263861);
        setIntField(term240862, term240862.getClass(), "courseRank", 1839432186);
        setField(term240862, term240862.getClass(), "charaSlot", term240927);
        setField(term240862, term240862.getClass(), "charaLockSlot", term240941);
        setLongField(term240862, term240862.getClass(), "contentBit", 352340789523283657L);
        setIntField(term240862, term240862.getClass(), "playCount", 1182134291);
        setField(term240862, term240862.getClass(), "eventWatchedDate", "jAMvrvDOhP");
        setField(term240862, term240862.getClass(), "lastGameId", "yrDxYzmHMC");
        setField(term240862, term240862.getClass(), "lastRomVersion", "rDpoPFYXSz");
        setField(term240862, term240862.getClass(), "lastDataVersion", "JwCEdzoMPC");
        setField(term240862, term240862.getClass(), "lastLoginDate", "genTuEgRsd");
        setField(term240862, term240862.getClass(), "lastPlayDate", "XMgPdlQkhy");
        setIntField(term240862, term240862.getClass(), "lastPlayCredit", 2094623710);
        setIntField(term240862, term240862.getClass(), "lastPlayMode", 1151649725);
        setIntField(term240862, term240862.getClass(), "lastPlaceId", 1624244421);
        setField(term240862, term240862.getClass(), "lastPlaceName", "FagcUlRRig");
        setIntField(term240862, term240862.getClass(), "lastAllNetId", -450194188);
        setIntField(term240862, term240862.getClass(), "lastRegionId", -605883720);
        setField(term240862, term240862.getClass(), "lastRegionName", "eBoBopUIXv");
        setField(term240862, term240862.getClass(), "lastClientId", "oQrHpsHWfU");
        setField(term240862, term240862.getClass(), "lastCountryCode", "cRIqcVypqV");
        setIntField(term240862, term240862.getClass(), "lastSelectEMoney", -1871784280);
        setIntField(term240862, term240862.getClass(), "lastSelectTicket", -26335867);
        setIntField(term240862, term240862.getClass(), "lastSelectCourse", -2011652562);
        setIntField(term240862, term240862.getClass(), "lastCountCourse", 1440282728);
        setField(term240862, term240862.getClass(), "firstGameId", "HkjSosreWD");
        setField(term240862, term240862.getClass(), "firstRomVersion", "iwCfNJPqoQ");
        setField(term240862, term240862.getClass(), "firstDataVersion", "dFLZhdWnQQ");
        setField(term240862, term240862.getClass(), "firstPlayDate", "iviSqxxKri");
        setField(term240862, term240862.getClass(), "compatibleCmVersion", "DqctNOpAAG");
        setField(term240862, term240862.getClass(), "dailyBonusDate", "DueBxOSGin");
        setField(term240862, term240862.getClass(), "dailyCourseBonusDate", "yxnzHzIPTj");
        setField(term240862, term240862.getClass(), "lastPairLoginDate", "zcGiKFmqHK");
        setField(term240862, term240862.getClass(), "lastTrialPlayDate", "OmdQpmJnZl");
        setIntField(term240862, term240862.getClass(), "playVsCount", -789478016);
        setIntField(term240862, term240862.getClass(), "playSyncCount", -1437320170);
        setIntField(term240862, term240862.getClass(), "winCount", 1831284941);
        setIntField(term240862, term240862.getClass(), "helpCount", 385656475);
        setIntField(term240862, term240862.getClass(), "comboCount", -1616579432);
        setLongField(term240862, term240862.getClass(), "totalDeluxscore", -1389742897647499895L);
        setLongField(term240862, term240862.getClass(), "totalBasicDeluxscore", -4514685666838021557L);
        setLongField(term240862, term240862.getClass(), "totalAdvancedDeluxscore", -1524319921359252588L);
        setLongField(term240862, term240862.getClass(), "totalExpertDeluxscore", 3056150772313842329L);
        setLongField(term240862, term240862.getClass(), "totalMasterDeluxscore", -7964241973359208080L);
        setLongField(term240862, term240862.getClass(), "totalReMasterDeluxscore", 7493969068239760848L);
        setIntField(term240862, term240862.getClass(), "totalSync", -1585530724);
        setIntField(term240862, term240862.getClass(), "totalBasicSync", 1470254841);
        setIntField(term240862, term240862.getClass(), "totalAdvancedSync", 715166712);
        setIntField(term240862, term240862.getClass(), "totalExpertSync", -1191503423);
        setIntField(term240862, term240862.getClass(), "totalMasterSync", -437696021);
        setIntField(term240862, term240862.getClass(), "totalReMasterSync", -1369602933);
        setLongField(term240862, term240862.getClass(), "totalAchievement", -1548136159315598499L);
        setLongField(term240862, term240862.getClass(), "totalBasicAchievement", 1158498282680574220L);
        setLongField(term240862, term240862.getClass(), "totalAdvancedAchievement", 7959062947136513844L);
        setLongField(term240862, term240862.getClass(), "totalExpertAchievement", -6883642291310553041L);
        setLongField(term240862, term240862.getClass(), "totalMasterAchievement", -7172575525075313714L);
        setLongField(term240862, term240862.getClass(), "totalReMasterAchievement", 1068510258925618658L);
        setLongField(term240862, term240862.getClass(), "playerOldRating", -1991256394365279578L);
        setLongField(term240862, term240862.getClass(), "playerNewRating", -5324351583440048167L);
        setIntField(term240862, term240862.getClass(), "banState", -412535015);
        setLongField(term240862, term240862.getClass(), "dateTime", -73471837779728452L);
        term241215 = new Integer(2060865794);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term241215;
        callMethod(klass, "setIsNetMember", argTypes, term240862, args);
    }

};


