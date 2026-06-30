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

public class UserAct_setId_204263346610 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5726;
     Object term6080;

    public UserAct_setId_204263346610() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term5732 = new Long(-2813493605142626659L);
        Integer term5795 = new Integer(1063420942);
        Integer term5797 = new Integer(1375330971);
        ArrayList term5793 = new ArrayList();
        ((ArrayList) term5793).add(term5795);
        ((ArrayList) term5793).add(term5797);
        Integer term5803 = new Integer(-478195677);
        ArrayList term5801 = new ArrayList();
        ((ArrayList) term5801).add(term5803);
        term5726 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserAct"));
        Object term5728 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term5730 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term5746 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term5747 = newInstance(Class.forName("java.time.LocalDate"));
        Object term5751 = newInstance(Class.forName("java.time.LocalTime"));
        Object term5756 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term5757 = newInstance(Class.forName("java.time.LocalDate"));
        Object term5761 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term5726, term5726.getClass(), "id", 4199886998224701110L);
        setLongField(term5728, term5728.getClass(), "id", 8540994973773607992L);
        setLongField(term5730, term5730.getClass(), "id", -2338103433822116635L);
        setField(term5730, term5730.getClass(), "extId", term5732);
        setField(term5730, term5730.getClass(), "luid", "hOncybyCAH");
        setIntField(term5747, term5747.getClass(), "year", 2014);
        setShortField(term5747, term5747.getClass(), "month", (short) 7);
        setShortField(term5747, term5747.getClass(), "day", (short) 13);
        setField(term5746, term5746.getClass(), "date", term5747);
        setByteField(term5751, term5751.getClass(), "hour", (byte) 21);
        setByteField(term5751, term5751.getClass(), "minute", (byte) 46);
        setByteField(term5751, term5751.getClass(), "second", (byte) 0);
        setIntField(term5751, term5751.getClass(), "nano", 887884128);
        setField(term5746, term5746.getClass(), "time", term5751);
        setField(term5730, term5730.getClass(), "registerTime", term5746);
        setIntField(term5757, term5757.getClass(), "year", 2023);
        setShortField(term5757, term5757.getClass(), "month", (short) 3);
        setShortField(term5757, term5757.getClass(), "day", (short) 7);
        setField(term5756, term5756.getClass(), "date", term5757);
        setByteField(term5761, term5761.getClass(), "hour", (byte) 21);
        setByteField(term5761, term5761.getClass(), "minute", (byte) 15);
        setByteField(term5761, term5761.getClass(), "second", (byte) 43);
        setIntField(term5761, term5761.getClass(), "nano", 639721472);
        setField(term5756, term5756.getClass(), "time", term5761);
        setField(term5730, term5730.getClass(), "accessTime", term5756);
        setField(term5728, term5728.getClass(), "card", term5730);
        setField(term5728, term5728.getClass(), "userName", "QduALnDSVo");
        setIntField(term5728, term5728.getClass(), "isNetMember", -1792504217);
        setIntField(term5728, term5728.getClass(), "iconId", 1824538861);
        setIntField(term5728, term5728.getClass(), "plateId", 499519708);
        setIntField(term5728, term5728.getClass(), "titleId", 1501165033);
        setIntField(term5728, term5728.getClass(), "partnerId", 510162332);
        setIntField(term5728, term5728.getClass(), "frameId", 888506903);
        setIntField(term5728, term5728.getClass(), "selectMapId", 200252898);
        setIntField(term5728, term5728.getClass(), "totalAwake", -1831826725);
        setIntField(term5728, term5728.getClass(), "gradeRating", 752152965);
        setIntField(term5728, term5728.getClass(), "musicRating", -1577069773);
        setIntField(term5728, term5728.getClass(), "playerRating", -266625190);
        setIntField(term5728, term5728.getClass(), "highestRating", 489201218);
        setIntField(term5728, term5728.getClass(), "gradeRank", 464181937);
        setIntField(term5728, term5728.getClass(), "classRank", -1455526612);
        setIntField(term5728, term5728.getClass(), "courseRank", -941356098);
        setField(term5728, term5728.getClass(), "charaSlot", term5793);
        setField(term5728, term5728.getClass(), "charaLockSlot", term5801);
        setLongField(term5728, term5728.getClass(), "contentBit", -1885698929232124806L);
        setIntField(term5728, term5728.getClass(), "playCount", -201517446);
        setField(term5728, term5728.getClass(), "eventWatchedDate", "izPpKDErnQ");
        setField(term5728, term5728.getClass(), "lastGameId", "NnpwZBUTvx");
        setField(term5728, term5728.getClass(), "lastRomVersion", "tlQSNgTkQX");
        setField(term5728, term5728.getClass(), "lastDataVersion", "PCipZnmBOF");
        setField(term5728, term5728.getClass(), "lastLoginDate", "zcorEihhLK");
        setField(term5728, term5728.getClass(), "lastPlayDate", "GrqozDKFOk");
        setIntField(term5728, term5728.getClass(), "lastPlayCredit", -97742366);
        setIntField(term5728, term5728.getClass(), "lastPlayMode", 1638851942);
        setIntField(term5728, term5728.getClass(), "lastPlaceId", 1374790203);
        setField(term5728, term5728.getClass(), "lastPlaceName", "CFyoseFGLF");
        setIntField(term5728, term5728.getClass(), "lastAllNetId", 1160010161);
        setIntField(term5728, term5728.getClass(), "lastRegionId", -423900705);
        setField(term5728, term5728.getClass(), "lastRegionName", "SFqCrhEWLm");
        setField(term5728, term5728.getClass(), "lastClientId", "GZdcJyZntS");
        setField(term5728, term5728.getClass(), "lastCountryCode", "OIHoJeysUi");
        setIntField(term5728, term5728.getClass(), "lastSelectEMoney", -525570815);
        setIntField(term5728, term5728.getClass(), "lastSelectTicket", 754055848);
        setIntField(term5728, term5728.getClass(), "lastSelectCourse", -19246901);
        setIntField(term5728, term5728.getClass(), "lastCountCourse", -370828664);
        setField(term5728, term5728.getClass(), "firstGameId", "WXMWFDGcLB");
        setField(term5728, term5728.getClass(), "firstRomVersion", "wKWbJssZuG");
        setField(term5728, term5728.getClass(), "firstDataVersion", "NzBMMhkhpT");
        setField(term5728, term5728.getClass(), "firstPlayDate", "qCpEbQDHdF");
        setField(term5728, term5728.getClass(), "compatibleCmVersion", "AHbZyFOmlo");
        setField(term5728, term5728.getClass(), "dailyBonusDate", "TwfWVQGiIj");
        setField(term5728, term5728.getClass(), "dailyCourseBonusDate", "gUvcueTURF");
        setField(term5728, term5728.getClass(), "lastPairLoginDate", "EwQBhZjCIT");
        setField(term5728, term5728.getClass(), "lastTrialPlayDate", "aSkmSwTnEw");
        setIntField(term5728, term5728.getClass(), "playVsCount", 1168633950);
        setIntField(term5728, term5728.getClass(), "playSyncCount", 1607082164);
        setIntField(term5728, term5728.getClass(), "winCount", 1890399366);
        setIntField(term5728, term5728.getClass(), "helpCount", -1867239125);
        setIntField(term5728, term5728.getClass(), "comboCount", 952869601);
        setLongField(term5728, term5728.getClass(), "totalDeluxscore", 5731563613239387113L);
        setLongField(term5728, term5728.getClass(), "totalBasicDeluxscore", 3381333711768010594L);
        setLongField(term5728, term5728.getClass(), "totalAdvancedDeluxscore", 3580984732036213717L);
        setLongField(term5728, term5728.getClass(), "totalExpertDeluxscore", 5330761990446327930L);
        setLongField(term5728, term5728.getClass(), "totalMasterDeluxscore", -3954795081650780841L);
        setLongField(term5728, term5728.getClass(), "totalReMasterDeluxscore", 3288791194263207397L);
        setIntField(term5728, term5728.getClass(), "totalSync", 91958879);
        setIntField(term5728, term5728.getClass(), "totalBasicSync", -645429025);
        setIntField(term5728, term5728.getClass(), "totalAdvancedSync", -688213483);
        setIntField(term5728, term5728.getClass(), "totalExpertSync", 644154104);
        setIntField(term5728, term5728.getClass(), "totalMasterSync", 76650923);
        setIntField(term5728, term5728.getClass(), "totalReMasterSync", 1003743923);
        setLongField(term5728, term5728.getClass(), "totalAchievement", 3288941170644426558L);
        setLongField(term5728, term5728.getClass(), "totalBasicAchievement", -8338004844694486146L);
        setLongField(term5728, term5728.getClass(), "totalAdvancedAchievement", 6426732259596412988L);
        setLongField(term5728, term5728.getClass(), "totalExpertAchievement", 185793058502220865L);
        setLongField(term5728, term5728.getClass(), "totalMasterAchievement", -7698746988132548371L);
        setLongField(term5728, term5728.getClass(), "totalReMasterAchievement", 2145420811068634601L);
        setLongField(term5728, term5728.getClass(), "playerOldRating", 2191130532479601175L);
        setLongField(term5728, term5728.getClass(), "playerNewRating", 860079646007397083L);
        setIntField(term5728, term5728.getClass(), "banState", 1887772522);
        setLongField(term5728, term5728.getClass(), "dateTime", 3230472384687362867L);
        setField(term5726, term5726.getClass(), "user", term5728);
        setIntField(term5726, term5726.getClass(), "kind", 354196060);
        setIntField(term5726, term5726.getClass(), "activityId", -1840305774);
        setLongField(term5726, term5726.getClass(), "sortNumber", -1145146470850585022L);
        setIntField(term5726, term5726.getClass(), "param1", 1365087144);
        setIntField(term5726, term5726.getClass(), "param2", -1537255112);
        setIntField(term5726, term5726.getClass(), "param3", 934477462);
        setIntField(term5726, term5726.getClass(), "param4", 4900410);
        term6080 = new Long(1993646237353405740L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserAct");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term6080;
        callMethod(klass, "setId", argTypes, term5726, args);
    }

};


