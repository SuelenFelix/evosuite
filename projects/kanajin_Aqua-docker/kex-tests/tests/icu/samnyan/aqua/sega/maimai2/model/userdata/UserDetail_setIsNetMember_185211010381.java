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

public class UserDetail_setIsNetMember_185211010381 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term240917;
     Object term241270;

    public UserDetail_setIsNetMember_185211010381() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term240921 = new Long(2287449183416662404L);
        Integer term240984 = new Integer(-467618426);
        Integer term240986 = new Integer(1728446971);
        Integer term240988 = new Integer(871757481);
        Integer term240990 = new Integer(-866223414);
        Integer term240992 = new Integer(-914821646);
        ArrayList term240982 = new ArrayList();
        ((ArrayList) term240982).add(term240984);
        ((ArrayList) term240982).add(term240986);
        ((ArrayList) term240982).add(term240988);
        ((ArrayList) term240982).add(term240990);
        ((ArrayList) term240982).add(term240992);
        Integer term240998 = new Integer(-1420229744);
        Integer term241000 = new Integer(-2026011046);
        ArrayList term240996 = new ArrayList();
        ((ArrayList) term240996).add(term240998);
        ((ArrayList) term240996).add(term241000);
        term240917 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term240919 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term240935 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term240936 = newInstance(Class.forName("java.time.LocalDate"));
        Object term240940 = newInstance(Class.forName("java.time.LocalTime"));
        Object term240945 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term240946 = newInstance(Class.forName("java.time.LocalDate"));
        Object term240950 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term240917, term240917.getClass(), "id", 9021246435004265845L);
        setLongField(term240919, term240919.getClass(), "id", 6778552590643258245L);
        setField(term240919, term240919.getClass(), "extId", term240921);
        setField(term240919, term240919.getClass(), "luid", "PxUDJOUGKY");
        setIntField(term240936, term240936.getClass(), "year", 2016);
        setShortField(term240936, term240936.getClass(), "month", (short) 5);
        setShortField(term240936, term240936.getClass(), "day", (short) 5);
        setField(term240935, term240935.getClass(), "date", term240936);
        setByteField(term240940, term240940.getClass(), "hour", (byte) 17);
        setByteField(term240940, term240940.getClass(), "minute", (byte) 12);
        setByteField(term240940, term240940.getClass(), "second", (byte) 48);
        setIntField(term240940, term240940.getClass(), "nano", 651546858);
        setField(term240935, term240935.getClass(), "time", term240940);
        setField(term240919, term240919.getClass(), "registerTime", term240935);
        setIntField(term240946, term240946.getClass(), "year", 2025);
        setShortField(term240946, term240946.getClass(), "month", (short) 1);
        setShortField(term240946, term240946.getClass(), "day", (short) 28);
        setField(term240945, term240945.getClass(), "date", term240946);
        setByteField(term240950, term240950.getClass(), "hour", (byte) 5);
        setByteField(term240950, term240950.getClass(), "minute", (byte) 55);
        setByteField(term240950, term240950.getClass(), "second", (byte) 9);
        setIntField(term240950, term240950.getClass(), "nano", 554633353);
        setField(term240945, term240945.getClass(), "time", term240950);
        setField(term240919, term240919.getClass(), "accessTime", term240945);
        setField(term240917, term240917.getClass(), "card", term240919);
        setField(term240917, term240917.getClass(), "userName", "QHNYCCZevd");
        setIntField(term240917, term240917.getClass(), "isNetMember", -165829479);
        setIntField(term240917, term240917.getClass(), "iconId", -880324916);
        setIntField(term240917, term240917.getClass(), "plateId", -1918157839);
        setIntField(term240917, term240917.getClass(), "titleId", 2061957294);
        setIntField(term240917, term240917.getClass(), "partnerId", 988785008);
        setIntField(term240917, term240917.getClass(), "frameId", -587123214);
        setIntField(term240917, term240917.getClass(), "selectMapId", 1762759091);
        setIntField(term240917, term240917.getClass(), "totalAwake", -1702159860);
        setIntField(term240917, term240917.getClass(), "gradeRating", 923629657);
        setIntField(term240917, term240917.getClass(), "musicRating", 171332193);
        setIntField(term240917, term240917.getClass(), "playerRating", -466611857);
        setIntField(term240917, term240917.getClass(), "highestRating", -1873372086);
        setIntField(term240917, term240917.getClass(), "gradeRank", 269196378);
        setIntField(term240917, term240917.getClass(), "classRank", 751263861);
        setIntField(term240917, term240917.getClass(), "courseRank", 1839432186);
        setField(term240917, term240917.getClass(), "charaSlot", term240982);
        setField(term240917, term240917.getClass(), "charaLockSlot", term240996);
        setLongField(term240917, term240917.getClass(), "contentBit", 352340789523283657L);
        setIntField(term240917, term240917.getClass(), "playCount", 1182134291);
        setField(term240917, term240917.getClass(), "eventWatchedDate", "jAMvrvDOhP");
        setField(term240917, term240917.getClass(), "lastGameId", "yrDxYzmHMC");
        setField(term240917, term240917.getClass(), "lastRomVersion", "rDpoPFYXSz");
        setField(term240917, term240917.getClass(), "lastDataVersion", "JwCEdzoMPC");
        setField(term240917, term240917.getClass(), "lastLoginDate", "genTuEgRsd");
        setField(term240917, term240917.getClass(), "lastPlayDate", "XMgPdlQkhy");
        setIntField(term240917, term240917.getClass(), "lastPlayCredit", 2094623710);
        setIntField(term240917, term240917.getClass(), "lastPlayMode", 1151649725);
        setIntField(term240917, term240917.getClass(), "lastPlaceId", 1624244421);
        setField(term240917, term240917.getClass(), "lastPlaceName", "FagcUlRRig");
        setIntField(term240917, term240917.getClass(), "lastAllNetId", -450194188);
        setIntField(term240917, term240917.getClass(), "lastRegionId", -605883720);
        setField(term240917, term240917.getClass(), "lastRegionName", "eBoBopUIXv");
        setField(term240917, term240917.getClass(), "lastClientId", "oQrHpsHWfU");
        setField(term240917, term240917.getClass(), "lastCountryCode", "cRIqcVypqV");
        setIntField(term240917, term240917.getClass(), "lastSelectEMoney", -1871784280);
        setIntField(term240917, term240917.getClass(), "lastSelectTicket", -26335867);
        setIntField(term240917, term240917.getClass(), "lastSelectCourse", -2011652562);
        setIntField(term240917, term240917.getClass(), "lastCountCourse", 1440282728);
        setField(term240917, term240917.getClass(), "firstGameId", "HkjSosreWD");
        setField(term240917, term240917.getClass(), "firstRomVersion", "iwCfNJPqoQ");
        setField(term240917, term240917.getClass(), "firstDataVersion", "dFLZhdWnQQ");
        setField(term240917, term240917.getClass(), "firstPlayDate", "iviSqxxKri");
        setField(term240917, term240917.getClass(), "compatibleCmVersion", "DqctNOpAAG");
        setField(term240917, term240917.getClass(), "dailyBonusDate", "DueBxOSGin");
        setField(term240917, term240917.getClass(), "dailyCourseBonusDate", "yxnzHzIPTj");
        setField(term240917, term240917.getClass(), "lastPairLoginDate", "zcGiKFmqHK");
        setField(term240917, term240917.getClass(), "lastTrialPlayDate", "OmdQpmJnZl");
        setIntField(term240917, term240917.getClass(), "playVsCount", -789478016);
        setIntField(term240917, term240917.getClass(), "playSyncCount", -1437320170);
        setIntField(term240917, term240917.getClass(), "winCount", 1831284941);
        setIntField(term240917, term240917.getClass(), "helpCount", 385656475);
        setIntField(term240917, term240917.getClass(), "comboCount", -1616579432);
        setLongField(term240917, term240917.getClass(), "totalDeluxscore", -1389742897647499895L);
        setLongField(term240917, term240917.getClass(), "totalBasicDeluxscore", -4514685666838021557L);
        setLongField(term240917, term240917.getClass(), "totalAdvancedDeluxscore", -1524319921359252588L);
        setLongField(term240917, term240917.getClass(), "totalExpertDeluxscore", 3056150772313842329L);
        setLongField(term240917, term240917.getClass(), "totalMasterDeluxscore", -7964241973359208080L);
        setLongField(term240917, term240917.getClass(), "totalReMasterDeluxscore", 7493969068239760848L);
        setIntField(term240917, term240917.getClass(), "totalSync", -1585530724);
        setIntField(term240917, term240917.getClass(), "totalBasicSync", 1470254841);
        setIntField(term240917, term240917.getClass(), "totalAdvancedSync", 715166712);
        setIntField(term240917, term240917.getClass(), "totalExpertSync", -1191503423);
        setIntField(term240917, term240917.getClass(), "totalMasterSync", -437696021);
        setIntField(term240917, term240917.getClass(), "totalReMasterSync", -1369602933);
        setLongField(term240917, term240917.getClass(), "totalAchievement", -1548136159315598499L);
        setLongField(term240917, term240917.getClass(), "totalBasicAchievement", 1158498282680574220L);
        setLongField(term240917, term240917.getClass(), "totalAdvancedAchievement", 7959062947136513844L);
        setLongField(term240917, term240917.getClass(), "totalExpertAchievement", -6883642291310553041L);
        setLongField(term240917, term240917.getClass(), "totalMasterAchievement", -7172575525075313714L);
        setLongField(term240917, term240917.getClass(), "totalReMasterAchievement", 1068510258925618658L);
        setLongField(term240917, term240917.getClass(), "playerOldRating", -1991256394365279578L);
        setLongField(term240917, term240917.getClass(), "playerNewRating", -5324351583440048167L);
        setIntField(term240917, term240917.getClass(), "banState", -412535015);
        setLongField(term240917, term240917.getClass(), "dateTime", -73471837779728452L);
        term241270 = new Integer(2060865794);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term241270;
        callMethod(klass, "setIsNetMember", argTypes, term240917, args);
    }

};


