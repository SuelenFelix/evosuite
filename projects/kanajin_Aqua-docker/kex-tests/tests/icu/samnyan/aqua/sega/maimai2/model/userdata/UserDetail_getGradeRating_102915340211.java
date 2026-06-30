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

public class UserDetail_getGradeRating_102915340211 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4235723;

    public UserDetail_getGradeRating_102915340211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4235727 = new Long(-1485620458269241848L);
        Integer term4235790 = new Integer(-2106459386);
        Integer term4235792 = new Integer(412901715);
        Integer term4235794 = new Integer(63312590);
        Integer term4235796 = new Integer(1065136159);
        Integer term4235798 = new Integer(235554079);
        Integer term4235800 = new Integer(-1928935865);
        Integer term4235802 = new Integer(36720539);
        Integer term4235804 = new Integer(1238203454);
        ArrayList term4235788 = new ArrayList();
        ((ArrayList) term4235788).add(term4235790);
        ((ArrayList) term4235788).add(term4235792);
        ((ArrayList) term4235788).add(term4235794);
        ((ArrayList) term4235788).add(term4235796);
        ((ArrayList) term4235788).add(term4235798);
        ((ArrayList) term4235788).add(term4235800);
        ((ArrayList) term4235788).add(term4235802);
        ((ArrayList) term4235788).add(term4235804);
        Integer term4235810 = new Integer(1392215933);
        Integer term4235812 = new Integer(-1780970662);
        Integer term4235814 = new Integer(1092997590);
        Integer term4235816 = new Integer(-1321843634);
        Integer term4235818 = new Integer(1529348485);
        Integer term4235820 = new Integer(391918007);
        ArrayList term4235808 = new ArrayList();
        ((ArrayList) term4235808).add(term4235810);
        ((ArrayList) term4235808).add(term4235812);
        ((ArrayList) term4235808).add(term4235814);
        ((ArrayList) term4235808).add(term4235816);
        ((ArrayList) term4235808).add(term4235818);
        ((ArrayList) term4235808).add(term4235820);
        term4235723 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term4235725 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term4235741 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4235742 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4235746 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4235751 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4235752 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4235756 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term4235723, term4235723.getClass(), "id", -2182558837653777462L);
        setLongField(term4235725, term4235725.getClass(), "id", -1838178551749766698L);
        setField(term4235725, term4235725.getClass(), "extId", term4235727);
        setField(term4235725, term4235725.getClass(), "luid", "VwRpEYAeAa");
        setIntField(term4235742, term4235742.getClass(), "year", 2010);
        setShortField(term4235742, term4235742.getClass(), "month", (short) 4);
        setShortField(term4235742, term4235742.getClass(), "day", (short) 8);
        setField(term4235741, term4235741.getClass(), "date", term4235742);
        setByteField(term4235746, term4235746.getClass(), "hour", (byte) 5);
        setByteField(term4235746, term4235746.getClass(), "minute", (byte) 49);
        setByteField(term4235746, term4235746.getClass(), "second", (byte) 52);
        setIntField(term4235746, term4235746.getClass(), "nano", 89158440);
        setField(term4235741, term4235741.getClass(), "time", term4235746);
        setField(term4235725, term4235725.getClass(), "registerTime", term4235741);
        setIntField(term4235752, term4235752.getClass(), "year", 2015);
        setShortField(term4235752, term4235752.getClass(), "month", (short) 5);
        setShortField(term4235752, term4235752.getClass(), "day", (short) 16);
        setField(term4235751, term4235751.getClass(), "date", term4235752);
        setByteField(term4235756, term4235756.getClass(), "hour", (byte) 12);
        setByteField(term4235756, term4235756.getClass(), "minute", (byte) 35);
        setByteField(term4235756, term4235756.getClass(), "second", (byte) 39);
        setIntField(term4235756, term4235756.getClass(), "nano", 715769006);
        setField(term4235751, term4235751.getClass(), "time", term4235756);
        setField(term4235725, term4235725.getClass(), "accessTime", term4235751);
        setField(term4235723, term4235723.getClass(), "card", term4235725);
        setField(term4235723, term4235723.getClass(), "userName", "vpTONCoiqD");
        setIntField(term4235723, term4235723.getClass(), "isNetMember", -543380259);
        setIntField(term4235723, term4235723.getClass(), "iconId", 1827533357);
        setIntField(term4235723, term4235723.getClass(), "plateId", -1231182763);
        setIntField(term4235723, term4235723.getClass(), "titleId", 1509657405);
        setIntField(term4235723, term4235723.getClass(), "partnerId", 2075604164);
        setIntField(term4235723, term4235723.getClass(), "frameId", 1742416594);
        setIntField(term4235723, term4235723.getClass(), "selectMapId", -1464438743);
        setIntField(term4235723, term4235723.getClass(), "totalAwake", -845145981);
        setIntField(term4235723, term4235723.getClass(), "gradeRating", -931606827);
        setIntField(term4235723, term4235723.getClass(), "musicRating", -1732510188);
        setIntField(term4235723, term4235723.getClass(), "playerRating", 1255181894);
        setIntField(term4235723, term4235723.getClass(), "highestRating", -1367207986);
        setIntField(term4235723, term4235723.getClass(), "gradeRank", 739245730);
        setIntField(term4235723, term4235723.getClass(), "classRank", -62779622);
        setIntField(term4235723, term4235723.getClass(), "courseRank", 1933517789);
        setField(term4235723, term4235723.getClass(), "charaSlot", term4235788);
        setField(term4235723, term4235723.getClass(), "charaLockSlot", term4235808);
        setLongField(term4235723, term4235723.getClass(), "contentBit", -9090428628214310913L);
        setIntField(term4235723, term4235723.getClass(), "playCount", 1049779139);
        setField(term4235723, term4235723.getClass(), "eventWatchedDate", "MTkwgabYqm");
        setField(term4235723, term4235723.getClass(), "lastGameId", "dDSeCYEoHz");
        setField(term4235723, term4235723.getClass(), "lastRomVersion", "TtePkieuNg");
        setField(term4235723, term4235723.getClass(), "lastDataVersion", "WltUFnalTX");
        setField(term4235723, term4235723.getClass(), "lastLoginDate", "LGTuEtQjvK");
        setField(term4235723, term4235723.getClass(), "lastPlayDate", "LhZqQTyvlk");
        setIntField(term4235723, term4235723.getClass(), "lastPlayCredit", 1750231775);
        setIntField(term4235723, term4235723.getClass(), "lastPlayMode", -187063668);
        setIntField(term4235723, term4235723.getClass(), "lastPlaceId", 226107413);
        setField(term4235723, term4235723.getClass(), "lastPlaceName", "uRhWVrExpE");
        setIntField(term4235723, term4235723.getClass(), "lastAllNetId", -378192904);
        setIntField(term4235723, term4235723.getClass(), "lastRegionId", -2012732328);
        setField(term4235723, term4235723.getClass(), "lastRegionName", "wBDyEAMpli");
        setField(term4235723, term4235723.getClass(), "lastClientId", "nMbfZQOERK");
        setField(term4235723, term4235723.getClass(), "lastCountryCode", "CWyYgomCmt");
        setIntField(term4235723, term4235723.getClass(), "lastSelectEMoney", -161084294);
        setIntField(term4235723, term4235723.getClass(), "lastSelectTicket", -1975263717);
        setIntField(term4235723, term4235723.getClass(), "lastSelectCourse", -1768538258);
        setIntField(term4235723, term4235723.getClass(), "lastCountCourse", 774891558);
        setField(term4235723, term4235723.getClass(), "firstGameId", "MfvxSqFlup");
        setField(term4235723, term4235723.getClass(), "firstRomVersion", "HNLEECFgOB");
        setField(term4235723, term4235723.getClass(), "firstDataVersion", "BEwHmizoyL");
        setField(term4235723, term4235723.getClass(), "firstPlayDate", "jrsVqclKpl");
        setField(term4235723, term4235723.getClass(), "compatibleCmVersion", "ZdgrIVxcKl");
        setField(term4235723, term4235723.getClass(), "dailyBonusDate", "JnPHHISCZK");
        setField(term4235723, term4235723.getClass(), "dailyCourseBonusDate", "UQlvhWRGSa");
        setField(term4235723, term4235723.getClass(), "lastPairLoginDate", "UIGOGRgqaP");
        setField(term4235723, term4235723.getClass(), "lastTrialPlayDate", "LsLqFdELtN");
        setIntField(term4235723, term4235723.getClass(), "playVsCount", -1178822531);
        setIntField(term4235723, term4235723.getClass(), "playSyncCount", 1891521660);
        setIntField(term4235723, term4235723.getClass(), "winCount", -249371810);
        setIntField(term4235723, term4235723.getClass(), "helpCount", -1157050083);
        setIntField(term4235723, term4235723.getClass(), "comboCount", -433893349);
        setLongField(term4235723, term4235723.getClass(), "totalDeluxscore", 2715132483188419539L);
        setLongField(term4235723, term4235723.getClass(), "totalBasicDeluxscore", 7433529282005256576L);
        setLongField(term4235723, term4235723.getClass(), "totalAdvancedDeluxscore", -4930457456005468408L);
        setLongField(term4235723, term4235723.getClass(), "totalExpertDeluxscore", -7486240016052176335L);
        setLongField(term4235723, term4235723.getClass(), "totalMasterDeluxscore", -456646766892264207L);
        setLongField(term4235723, term4235723.getClass(), "totalReMasterDeluxscore", 1543482195000752170L);
        setIntField(term4235723, term4235723.getClass(), "totalSync", 198403510);
        setIntField(term4235723, term4235723.getClass(), "totalBasicSync", -1773544904);
        setIntField(term4235723, term4235723.getClass(), "totalAdvancedSync", -964612984);
        setIntField(term4235723, term4235723.getClass(), "totalExpertSync", -208977041);
        setIntField(term4235723, term4235723.getClass(), "totalMasterSync", 1232676363);
        setIntField(term4235723, term4235723.getClass(), "totalReMasterSync", -1283899672);
        setLongField(term4235723, term4235723.getClass(), "totalAchievement", -3797904279291358477L);
        setLongField(term4235723, term4235723.getClass(), "totalBasicAchievement", -8170213754319375173L);
        setLongField(term4235723, term4235723.getClass(), "totalAdvancedAchievement", -572738122231905527L);
        setLongField(term4235723, term4235723.getClass(), "totalExpertAchievement", -8692334296332626000L);
        setLongField(term4235723, term4235723.getClass(), "totalMasterAchievement", 9105812086374412963L);
        setLongField(term4235723, term4235723.getClass(), "totalReMasterAchievement", -4834290109567778091L);
        setLongField(term4235723, term4235723.getClass(), "playerOldRating", -3447347998546641974L);
        setLongField(term4235723, term4235723.getClass(), "playerNewRating", -6765241405719377476L);
        setIntField(term4235723, term4235723.getClass(), "banState", -1653512681);
        setLongField(term4235723, term4235723.getClass(), "dateTime", 6388906584621337735L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getGradeRating", argTypes, term4235723, args);
    }

};


