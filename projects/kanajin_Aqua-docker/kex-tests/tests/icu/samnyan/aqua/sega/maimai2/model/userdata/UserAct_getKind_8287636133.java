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

public class UserAct_getKind_8287636133 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1712;

    public UserAct_getKind_8287636133() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1718 = new Long(-8400487765614892086L);
        Integer term1781 = new Integer(-117576464);
        Integer term1783 = new Integer(-1007160944);
        ArrayList term1779 = new ArrayList();
        ((ArrayList) term1779).add(term1781);
        ((ArrayList) term1779).add(term1783);
        Integer term1789 = new Integer(1135664017);
        Integer term1791 = new Integer(590364439);
        Integer term1793 = new Integer(865208305);
        Integer term1795 = new Integer(-1275173084);
        Integer term1797 = new Integer(-244121226);
        Integer term1799 = new Integer(-203030934);
        ArrayList term1787 = new ArrayList();
        ((ArrayList) term1787).add(term1789);
        ((ArrayList) term1787).add(term1791);
        ((ArrayList) term1787).add(term1793);
        ((ArrayList) term1787).add(term1795);
        ((ArrayList) term1787).add(term1797);
        ((ArrayList) term1787).add(term1799);
        term1712 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserAct"));
        Object term1714 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term1716 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term1732 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1733 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1737 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1742 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1743 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1747 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term1712, term1712.getClass(), "id", -3838084482494604218L);
        setLongField(term1714, term1714.getClass(), "id", 3892018155439224435L);
        setLongField(term1716, term1716.getClass(), "id", 5953383087795962419L);
        setField(term1716, term1716.getClass(), "extId", term1718);
        setField(term1716, term1716.getClass(), "luid", "eqJfYWRaEL");
        setIntField(term1733, term1733.getClass(), "year", 2025);
        setShortField(term1733, term1733.getClass(), "month", (short) 4);
        setShortField(term1733, term1733.getClass(), "day", (short) 24);
        setField(term1732, term1732.getClass(), "date", term1733);
        setByteField(term1737, term1737.getClass(), "hour", (byte) 18);
        setByteField(term1737, term1737.getClass(), "minute", (byte) 11);
        setByteField(term1737, term1737.getClass(), "second", (byte) 40);
        setIntField(term1737, term1737.getClass(), "nano", 137454929);
        setField(term1732, term1732.getClass(), "time", term1737);
        setField(term1716, term1716.getClass(), "registerTime", term1732);
        setIntField(term1743, term1743.getClass(), "year", 2024);
        setShortField(term1743, term1743.getClass(), "month", (short) 1);
        setShortField(term1743, term1743.getClass(), "day", (short) 24);
        setField(term1742, term1742.getClass(), "date", term1743);
        setByteField(term1747, term1747.getClass(), "hour", (byte) 20);
        setByteField(term1747, term1747.getClass(), "minute", (byte) 28);
        setByteField(term1747, term1747.getClass(), "second", (byte) 39);
        setIntField(term1747, term1747.getClass(), "nano", 952728177);
        setField(term1742, term1742.getClass(), "time", term1747);
        setField(term1716, term1716.getClass(), "accessTime", term1742);
        setField(term1714, term1714.getClass(), "card", term1716);
        setField(term1714, term1714.getClass(), "userName", "fhkbdRViHi");
        setIntField(term1714, term1714.getClass(), "isNetMember", 1474524152);
        setIntField(term1714, term1714.getClass(), "iconId", 568954359);
        setIntField(term1714, term1714.getClass(), "plateId", 53410913);
        setIntField(term1714, term1714.getClass(), "titleId", -375014958);
        setIntField(term1714, term1714.getClass(), "partnerId", 1107176718);
        setIntField(term1714, term1714.getClass(), "frameId", 480137250);
        setIntField(term1714, term1714.getClass(), "selectMapId", -341152642);
        setIntField(term1714, term1714.getClass(), "totalAwake", -2015854073);
        setIntField(term1714, term1714.getClass(), "gradeRating", 538259104);
        setIntField(term1714, term1714.getClass(), "musicRating", 96566506);
        setIntField(term1714, term1714.getClass(), "playerRating", -343325701);
        setIntField(term1714, term1714.getClass(), "highestRating", 107945604);
        setIntField(term1714, term1714.getClass(), "gradeRank", -1963464809);
        setIntField(term1714, term1714.getClass(), "classRank", 71190297);
        setIntField(term1714, term1714.getClass(), "courseRank", 1202361360);
        setField(term1714, term1714.getClass(), "charaSlot", term1779);
        setField(term1714, term1714.getClass(), "charaLockSlot", term1787);
        setLongField(term1714, term1714.getClass(), "contentBit", 7994303628307559416L);
        setIntField(term1714, term1714.getClass(), "playCount", -2015048153);
        setField(term1714, term1714.getClass(), "eventWatchedDate", "uWHnvSvaPl");
        setField(term1714, term1714.getClass(), "lastGameId", "kBdSllIBVz");
        setField(term1714, term1714.getClass(), "lastRomVersion", "TJmVBGfTML");
        setField(term1714, term1714.getClass(), "lastDataVersion", "tPlsykYBqO");
        setField(term1714, term1714.getClass(), "lastLoginDate", "bLPjGVBhlX");
        setField(term1714, term1714.getClass(), "lastPlayDate", "whBvTVIIlC");
        setIntField(term1714, term1714.getClass(), "lastPlayCredit", -2063457669);
        setIntField(term1714, term1714.getClass(), "lastPlayMode", -1222006000);
        setIntField(term1714, term1714.getClass(), "lastPlaceId", 2095798786);
        setField(term1714, term1714.getClass(), "lastPlaceName", "IgRJUzaCwW");
        setIntField(term1714, term1714.getClass(), "lastAllNetId", -1565502840);
        setIntField(term1714, term1714.getClass(), "lastRegionId", 344323424);
        setField(term1714, term1714.getClass(), "lastRegionName", "JUmudUmaaV");
        setField(term1714, term1714.getClass(), "lastClientId", "KoyGrUJeJW");
        setField(term1714, term1714.getClass(), "lastCountryCode", "HqBOwkVqjD");
        setIntField(term1714, term1714.getClass(), "lastSelectEMoney", 9726679);
        setIntField(term1714, term1714.getClass(), "lastSelectTicket", -25637976);
        setIntField(term1714, term1714.getClass(), "lastSelectCourse", 1555897383);
        setIntField(term1714, term1714.getClass(), "lastCountCourse", 202001407);
        setField(term1714, term1714.getClass(), "firstGameId", "MAcUBcBckh");
        setField(term1714, term1714.getClass(), "firstRomVersion", "oVgzLbrsFr");
        setField(term1714, term1714.getClass(), "firstDataVersion", "vQVyKLdtaz");
        setField(term1714, term1714.getClass(), "firstPlayDate", "OWKQODBLzb");
        setField(term1714, term1714.getClass(), "compatibleCmVersion", "wGmYcqUkgE");
        setField(term1714, term1714.getClass(), "dailyBonusDate", "idgaQsnJpQ");
        setField(term1714, term1714.getClass(), "dailyCourseBonusDate", "VgZnGoIFwQ");
        setField(term1714, term1714.getClass(), "lastPairLoginDate", "jUbSRrkrYZ");
        setField(term1714, term1714.getClass(), "lastTrialPlayDate", "bWWfajKbEX");
        setIntField(term1714, term1714.getClass(), "playVsCount", 158873461);
        setIntField(term1714, term1714.getClass(), "playSyncCount", -430151637);
        setIntField(term1714, term1714.getClass(), "winCount", -1697741339);
        setIntField(term1714, term1714.getClass(), "helpCount", 98922530);
        setIntField(term1714, term1714.getClass(), "comboCount", -1388471422);
        setLongField(term1714, term1714.getClass(), "totalDeluxscore", 2443640364875054177L);
        setLongField(term1714, term1714.getClass(), "totalBasicDeluxscore", -1610676979013636850L);
        setLongField(term1714, term1714.getClass(), "totalAdvancedDeluxscore", 2062173786000223358L);
        setLongField(term1714, term1714.getClass(), "totalExpertDeluxscore", -8658027316505137504L);
        setLongField(term1714, term1714.getClass(), "totalMasterDeluxscore", 414749984815662075L);
        setLongField(term1714, term1714.getClass(), "totalReMasterDeluxscore", 463622836963501975L);
        setIntField(term1714, term1714.getClass(), "totalSync", -1498296052);
        setIntField(term1714, term1714.getClass(), "totalBasicSync", 2098647989);
        setIntField(term1714, term1714.getClass(), "totalAdvancedSync", 1598895173);
        setIntField(term1714, term1714.getClass(), "totalExpertSync", 1830648570);
        setIntField(term1714, term1714.getClass(), "totalMasterSync", -227365013);
        setIntField(term1714, term1714.getClass(), "totalReMasterSync", 11724947);
        setLongField(term1714, term1714.getClass(), "totalAchievement", 305759998609888272L);
        setLongField(term1714, term1714.getClass(), "totalBasicAchievement", -8654565919063661957L);
        setLongField(term1714, term1714.getClass(), "totalAdvancedAchievement", -5248475803419977214L);
        setLongField(term1714, term1714.getClass(), "totalExpertAchievement", -6723783499250797216L);
        setLongField(term1714, term1714.getClass(), "totalMasterAchievement", 41775768178052008L);
        setLongField(term1714, term1714.getClass(), "totalReMasterAchievement", 6682528376118987775L);
        setLongField(term1714, term1714.getClass(), "playerOldRating", 682356318767179819L);
        setLongField(term1714, term1714.getClass(), "playerNewRating", -7291743527973326814L);
        setIntField(term1714, term1714.getClass(), "banState", 1953277050);
        setLongField(term1714, term1714.getClass(), "dateTime", -5963439350418910964L);
        setField(term1712, term1712.getClass(), "user", term1714);
        setIntField(term1712, term1712.getClass(), "kind", 1283079251);
        setIntField(term1712, term1712.getClass(), "activityId", -523949691);
        setLongField(term1712, term1712.getClass(), "sortNumber", 9013624480170062917L);
        setIntField(term1712, term1712.getClass(), "param1", 1398204340);
        setIntField(term1712, term1712.getClass(), "param2", 229204365);
        setIntField(term1712, term1712.getClass(), "param3", -461771056);
        setIntField(term1712, term1712.getClass(), "param4", -243422082);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserAct");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getKind", argTypes, term1712, args);
    }

};


