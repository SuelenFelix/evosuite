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

public class UserDetail_setGradeRank_212757888192 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4281764;
     Object term4282127;

    public UserDetail_setGradeRank_212757888192() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4281768 = new Long(4804264407297537936L);
        Integer term4281831 = new Integer(-1367168675);
        Integer term4281833 = new Integer(1207815248);
        Integer term4281835 = new Integer(-574020974);
        Integer term4281837 = new Integer(1971932785);
        Integer term4281839 = new Integer(2069110501);
        Integer term4281841 = new Integer(620342422);
        ArrayList term4281829 = new ArrayList();
        ((ArrayList) term4281829).add(term4281831);
        ((ArrayList) term4281829).add(term4281833);
        ((ArrayList) term4281829).add(term4281835);
        ((ArrayList) term4281829).add(term4281837);
        ((ArrayList) term4281829).add(term4281839);
        ((ArrayList) term4281829).add(term4281841);
        Integer term4281847 = new Integer(-839533151);
        Integer term4281849 = new Integer(-1395988897);
        Integer term4281851 = new Integer(-1572616912);
        Integer term4281853 = new Integer(637817122);
        Integer term4281855 = new Integer(-1666967856);
        Integer term4281857 = new Integer(288878731);
        ArrayList term4281845 = new ArrayList();
        ((ArrayList) term4281845).add(term4281847);
        ((ArrayList) term4281845).add(term4281849);
        ((ArrayList) term4281845).add(term4281851);
        ((ArrayList) term4281845).add(term4281853);
        ((ArrayList) term4281845).add(term4281855);
        ((ArrayList) term4281845).add(term4281857);
        term4281764 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term4281766 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term4281782 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4281783 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4281787 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4281792 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4281793 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4281797 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term4281764, term4281764.getClass(), "id", -5207062712074196848L);
        setLongField(term4281766, term4281766.getClass(), "id", -2992687128831201249L);
        setField(term4281766, term4281766.getClass(), "extId", term4281768);
        setField(term4281766, term4281766.getClass(), "luid", "qnbKpFeTZD");
        setIntField(term4281783, term4281783.getClass(), "year", 2014);
        setShortField(term4281783, term4281783.getClass(), "month", (short) 8);
        setShortField(term4281783, term4281783.getClass(), "day", (short) 27);
        setField(term4281782, term4281782.getClass(), "date", term4281783);
        setByteField(term4281787, term4281787.getClass(), "hour", (byte) 6);
        setByteField(term4281787, term4281787.getClass(), "minute", (byte) 4);
        setByteField(term4281787, term4281787.getClass(), "second", (byte) 10);
        setIntField(term4281787, term4281787.getClass(), "nano", 556291693);
        setField(term4281782, term4281782.getClass(), "time", term4281787);
        setField(term4281766, term4281766.getClass(), "registerTime", term4281782);
        setIntField(term4281793, term4281793.getClass(), "year", 2025);
        setShortField(term4281793, term4281793.getClass(), "month", (short) 8);
        setShortField(term4281793, term4281793.getClass(), "day", (short) 20);
        setField(term4281792, term4281792.getClass(), "date", term4281793);
        setByteField(term4281797, term4281797.getClass(), "hour", (byte) 22);
        setByteField(term4281797, term4281797.getClass(), "minute", (byte) 53);
        setByteField(term4281797, term4281797.getClass(), "second", (byte) 34);
        setIntField(term4281797, term4281797.getClass(), "nano", 857620067);
        setField(term4281792, term4281792.getClass(), "time", term4281797);
        setField(term4281766, term4281766.getClass(), "accessTime", term4281792);
        setField(term4281764, term4281764.getClass(), "card", term4281766);
        setField(term4281764, term4281764.getClass(), "userName", "toTaNVPqYT");
        setIntField(term4281764, term4281764.getClass(), "isNetMember", -1258461009);
        setIntField(term4281764, term4281764.getClass(), "iconId", -1577387812);
        setIntField(term4281764, term4281764.getClass(), "plateId", -1630723277);
        setIntField(term4281764, term4281764.getClass(), "titleId", 1175908424);
        setIntField(term4281764, term4281764.getClass(), "partnerId", -1228324275);
        setIntField(term4281764, term4281764.getClass(), "frameId", 961120950);
        setIntField(term4281764, term4281764.getClass(), "selectMapId", -1313737973);
        setIntField(term4281764, term4281764.getClass(), "totalAwake", -863533952);
        setIntField(term4281764, term4281764.getClass(), "gradeRating", -1813408928);
        setIntField(term4281764, term4281764.getClass(), "musicRating", 1621511479);
        setIntField(term4281764, term4281764.getClass(), "playerRating", 1394028261);
        setIntField(term4281764, term4281764.getClass(), "highestRating", 1770815999);
        setIntField(term4281764, term4281764.getClass(), "gradeRank", 275176651);
        setIntField(term4281764, term4281764.getClass(), "classRank", 1256699547);
        setIntField(term4281764, term4281764.getClass(), "courseRank", 1119357827);
        setField(term4281764, term4281764.getClass(), "charaSlot", term4281829);
        setField(term4281764, term4281764.getClass(), "charaLockSlot", term4281845);
        setLongField(term4281764, term4281764.getClass(), "contentBit", -9026232349232720272L);
        setIntField(term4281764, term4281764.getClass(), "playCount", -964541083);
        setField(term4281764, term4281764.getClass(), "eventWatchedDate", "EjudZTqrsz");
        setField(term4281764, term4281764.getClass(), "lastGameId", "YyhuIIugmj");
        setField(term4281764, term4281764.getClass(), "lastRomVersion", "nJPBNMpehz");
        setField(term4281764, term4281764.getClass(), "lastDataVersion", "MZiJCWLrZp");
        setField(term4281764, term4281764.getClass(), "lastLoginDate", "AurAtiHfen");
        setField(term4281764, term4281764.getClass(), "lastPlayDate", "rtCMdcCYIi");
        setIntField(term4281764, term4281764.getClass(), "lastPlayCredit", -2012553038);
        setIntField(term4281764, term4281764.getClass(), "lastPlayMode", 1164020691);
        setIntField(term4281764, term4281764.getClass(), "lastPlaceId", 418912343);
        setField(term4281764, term4281764.getClass(), "lastPlaceName", "EmHWRGlyhn");
        setIntField(term4281764, term4281764.getClass(), "lastAllNetId", 1144358955);
        setIntField(term4281764, term4281764.getClass(), "lastRegionId", -456176544);
        setField(term4281764, term4281764.getClass(), "lastRegionName", "CjnkeQpmQg");
        setField(term4281764, term4281764.getClass(), "lastClientId", "yThBuMDajm");
        setField(term4281764, term4281764.getClass(), "lastCountryCode", "AlmIMEKyEP");
        setIntField(term4281764, term4281764.getClass(), "lastSelectEMoney", 1742081690);
        setIntField(term4281764, term4281764.getClass(), "lastSelectTicket", -1301686786);
        setIntField(term4281764, term4281764.getClass(), "lastSelectCourse", -400814382);
        setIntField(term4281764, term4281764.getClass(), "lastCountCourse", 1014144106);
        setField(term4281764, term4281764.getClass(), "firstGameId", "NJRdwWRMKy");
        setField(term4281764, term4281764.getClass(), "firstRomVersion", "xuQIELAagS");
        setField(term4281764, term4281764.getClass(), "firstDataVersion", "AeTEnXNEHl");
        setField(term4281764, term4281764.getClass(), "firstPlayDate", "VciDqFmtkJ");
        setField(term4281764, term4281764.getClass(), "compatibleCmVersion", "LKgeRClAIp");
        setField(term4281764, term4281764.getClass(), "dailyBonusDate", "tpZvwhClfU");
        setField(term4281764, term4281764.getClass(), "dailyCourseBonusDate", "VvSANscwTW");
        setField(term4281764, term4281764.getClass(), "lastPairLoginDate", "AXdrBIdgOa");
        setField(term4281764, term4281764.getClass(), "lastTrialPlayDate", "pSVTyLvVTq");
        setIntField(term4281764, term4281764.getClass(), "playVsCount", -83658551);
        setIntField(term4281764, term4281764.getClass(), "playSyncCount", -2142654196);
        setIntField(term4281764, term4281764.getClass(), "winCount", 1118668383);
        setIntField(term4281764, term4281764.getClass(), "helpCount", 2050268949);
        setIntField(term4281764, term4281764.getClass(), "comboCount", 121460970);
        setLongField(term4281764, term4281764.getClass(), "totalDeluxscore", -1359390389615557824L);
        setLongField(term4281764, term4281764.getClass(), "totalBasicDeluxscore", -2346713773358378015L);
        setLongField(term4281764, term4281764.getClass(), "totalAdvancedDeluxscore", -4795867065879416342L);
        setLongField(term4281764, term4281764.getClass(), "totalExpertDeluxscore", 6388565178913985111L);
        setLongField(term4281764, term4281764.getClass(), "totalMasterDeluxscore", 2160718212481261997L);
        setLongField(term4281764, term4281764.getClass(), "totalReMasterDeluxscore", -7776605195183974874L);
        setIntField(term4281764, term4281764.getClass(), "totalSync", -1184406258);
        setIntField(term4281764, term4281764.getClass(), "totalBasicSync", -1318566650);
        setIntField(term4281764, term4281764.getClass(), "totalAdvancedSync", 2112764148);
        setIntField(term4281764, term4281764.getClass(), "totalExpertSync", 1801888780);
        setIntField(term4281764, term4281764.getClass(), "totalMasterSync", 370412492);
        setIntField(term4281764, term4281764.getClass(), "totalReMasterSync", 1335157284);
        setLongField(term4281764, term4281764.getClass(), "totalAchievement", 581859491754168047L);
        setLongField(term4281764, term4281764.getClass(), "totalBasicAchievement", 5132727281445806079L);
        setLongField(term4281764, term4281764.getClass(), "totalAdvancedAchievement", -8617967753876571120L);
        setLongField(term4281764, term4281764.getClass(), "totalExpertAchievement", -738856487437587781L);
        setLongField(term4281764, term4281764.getClass(), "totalMasterAchievement", -4179818854121771313L);
        setLongField(term4281764, term4281764.getClass(), "totalReMasterAchievement", -6916482635603164841L);
        setLongField(term4281764, term4281764.getClass(), "playerOldRating", -3423416290400165908L);
        setLongField(term4281764, term4281764.getClass(), "playerNewRating", -7532051698576625345L);
        setIntField(term4281764, term4281764.getClass(), "banState", 114184149);
        setLongField(term4281764, term4281764.getClass(), "dateTime", -1749663697237655283L);
        term4282127 = new Integer(-862285611);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term4282127;
        callMethod(klass, "setGradeRank", argTypes, term4281764, args);
    }

};


