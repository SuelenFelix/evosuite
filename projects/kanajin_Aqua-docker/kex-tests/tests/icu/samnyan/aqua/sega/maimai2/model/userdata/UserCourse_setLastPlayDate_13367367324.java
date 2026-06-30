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

public class UserCourse_setLastPlayDate_13367367324 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term87251;

    public UserCourse_setLastPlayDate_13367367324() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term87257 = new Long(8802866251294305945L);
        Integer term87320 = new Integer(852281447);
        Integer term87322 = new Integer(1248430530);
        Integer term87324 = new Integer(-1911828505);
        Integer term87326 = new Integer(241725499);
        Integer term87328 = new Integer(823179298);
        Integer term87330 = new Integer(1174484848);
        ArrayList term87318 = new ArrayList();
        ((ArrayList) term87318).add(term87320);
        ((ArrayList) term87318).add(term87322);
        ((ArrayList) term87318).add(term87324);
        ((ArrayList) term87318).add(term87326);
        ((ArrayList) term87318).add(term87328);
        ((ArrayList) term87318).add(term87330);
        Integer term87336 = new Integer(939889496);
        Integer term87338 = new Integer(-495242269);
        Integer term87340 = new Integer(932810106);
        Integer term87342 = new Integer(-2138801137);
        ArrayList term87334 = new ArrayList();
        ((ArrayList) term87334).add(term87336);
        ((ArrayList) term87334).add(term87338);
        ((ArrayList) term87334).add(term87340);
        ((ArrayList) term87334).add(term87342);
        term87251 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserCourse"));
        Object term87253 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term87255 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term87271 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term87272 = newInstance(Class.forName("java.time.LocalDate"));
        Object term87276 = newInstance(Class.forName("java.time.LocalTime"));
        Object term87281 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term87282 = newInstance(Class.forName("java.time.LocalDate"));
        Object term87286 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term87251, term87251.getClass(), "id", -4277660344437377425L);
        setLongField(term87253, term87253.getClass(), "id", -3580500087222234204L);
        setLongField(term87255, term87255.getClass(), "id", 5608996079421235543L);
        setField(term87255, term87255.getClass(), "extId", term87257);
        setField(term87255, term87255.getClass(), "luid", "PCttFvFDzJ");
        setIntField(term87272, term87272.getClass(), "year", 2017);
        setShortField(term87272, term87272.getClass(), "month", (short) 2);
        setShortField(term87272, term87272.getClass(), "day", (short) 5);
        setField(term87271, term87271.getClass(), "date", term87272);
        setByteField(term87276, term87276.getClass(), "hour", (byte) 5);
        setByteField(term87276, term87276.getClass(), "minute", (byte) 46);
        setByteField(term87276, term87276.getClass(), "second", (byte) 38);
        setIntField(term87276, term87276.getClass(), "nano", 214202896);
        setField(term87271, term87271.getClass(), "time", term87276);
        setField(term87255, term87255.getClass(), "registerTime", term87271);
        setIntField(term87282, term87282.getClass(), "year", 2025);
        setShortField(term87282, term87282.getClass(), "month", (short) 6);
        setShortField(term87282, term87282.getClass(), "day", (short) 18);
        setField(term87281, term87281.getClass(), "date", term87282);
        setByteField(term87286, term87286.getClass(), "hour", (byte) 14);
        setByteField(term87286, term87286.getClass(), "minute", (byte) 17);
        setByteField(term87286, term87286.getClass(), "second", (byte) 34);
        setIntField(term87286, term87286.getClass(), "nano", 564527758);
        setField(term87281, term87281.getClass(), "time", term87286);
        setField(term87255, term87255.getClass(), "accessTime", term87281);
        setField(term87253, term87253.getClass(), "card", term87255);
        setField(term87253, term87253.getClass(), "userName", "fwAMmjMsDq");
        setIntField(term87253, term87253.getClass(), "isNetMember", 1980524877);
        setIntField(term87253, term87253.getClass(), "iconId", 1572487602);
        setIntField(term87253, term87253.getClass(), "plateId", 354453982);
        setIntField(term87253, term87253.getClass(), "titleId", 791608608);
        setIntField(term87253, term87253.getClass(), "partnerId", 832068739);
        setIntField(term87253, term87253.getClass(), "frameId", -1109536397);
        setIntField(term87253, term87253.getClass(), "selectMapId", -356798505);
        setIntField(term87253, term87253.getClass(), "totalAwake", 1298263326);
        setIntField(term87253, term87253.getClass(), "gradeRating", 1534262946);
        setIntField(term87253, term87253.getClass(), "musicRating", -732512836);
        setIntField(term87253, term87253.getClass(), "playerRating", -583097103);
        setIntField(term87253, term87253.getClass(), "highestRating", 390772759);
        setIntField(term87253, term87253.getClass(), "gradeRank", 121280572);
        setIntField(term87253, term87253.getClass(), "classRank", 683645623);
        setIntField(term87253, term87253.getClass(), "courseRank", -1807588897);
        setField(term87253, term87253.getClass(), "charaSlot", term87318);
        setField(term87253, term87253.getClass(), "charaLockSlot", term87334);
        setLongField(term87253, term87253.getClass(), "contentBit", 8528484863342605856L);
        setIntField(term87253, term87253.getClass(), "playCount", 702237858);
        setField(term87253, term87253.getClass(), "eventWatchedDate", "aqdKzesECj");
        setField(term87253, term87253.getClass(), "lastGameId", "voSygcVEYO");
        setField(term87253, term87253.getClass(), "lastRomVersion", "LfcceVKtWg");
        setField(term87253, term87253.getClass(), "lastDataVersion", "CNkueZBdYF");
        setField(term87253, term87253.getClass(), "lastLoginDate", "ZAjjJEUomV");
        setField(term87253, term87253.getClass(), "lastPlayDate", "cHwZbezfEu");
        setIntField(term87253, term87253.getClass(), "lastPlayCredit", -70803343);
        setIntField(term87253, term87253.getClass(), "lastPlayMode", -2147305933);
        setIntField(term87253, term87253.getClass(), "lastPlaceId", 1174830017);
        setField(term87253, term87253.getClass(), "lastPlaceName", "GuQzOBxsNv");
        setIntField(term87253, term87253.getClass(), "lastAllNetId", 2140219446);
        setIntField(term87253, term87253.getClass(), "lastRegionId", -417525632);
        setField(term87253, term87253.getClass(), "lastRegionName", "YxcYXGDyZx");
        setField(term87253, term87253.getClass(), "lastClientId", "dubNMHmdjy");
        setField(term87253, term87253.getClass(), "lastCountryCode", "vYzdCPfleW");
        setIntField(term87253, term87253.getClass(), "lastSelectEMoney", 1228187048);
        setIntField(term87253, term87253.getClass(), "lastSelectTicket", -809028643);
        setIntField(term87253, term87253.getClass(), "lastSelectCourse", -1322926388);
        setIntField(term87253, term87253.getClass(), "lastCountCourse", 701619360);
        setField(term87253, term87253.getClass(), "firstGameId", "AXVMtieJQT");
        setField(term87253, term87253.getClass(), "firstRomVersion", "BKaXfQaGqm");
        setField(term87253, term87253.getClass(), "firstDataVersion", "OpadJlQqJc");
        setField(term87253, term87253.getClass(), "firstPlayDate", "ZXdFbwHLvQ");
        setField(term87253, term87253.getClass(), "compatibleCmVersion", "VEastYHDbF");
        setField(term87253, term87253.getClass(), "dailyBonusDate", "CVrxrIRbBP");
        setField(term87253, term87253.getClass(), "dailyCourseBonusDate", "qMveUiByVL");
        setField(term87253, term87253.getClass(), "lastPairLoginDate", "VfhPQKCIrE");
        setField(term87253, term87253.getClass(), "lastTrialPlayDate", "RUgpUeqcGS");
        setIntField(term87253, term87253.getClass(), "playVsCount", 930820216);
        setIntField(term87253, term87253.getClass(), "playSyncCount", -1573368178);
        setIntField(term87253, term87253.getClass(), "winCount", -1007994686);
        setIntField(term87253, term87253.getClass(), "helpCount", -849828336);
        setIntField(term87253, term87253.getClass(), "comboCount", 184687223);
        setLongField(term87253, term87253.getClass(), "totalDeluxscore", -5895312352966511908L);
        setLongField(term87253, term87253.getClass(), "totalBasicDeluxscore", -9221881606533616155L);
        setLongField(term87253, term87253.getClass(), "totalAdvancedDeluxscore", -478523971987034249L);
        setLongField(term87253, term87253.getClass(), "totalExpertDeluxscore", -1224531332957849467L);
        setLongField(term87253, term87253.getClass(), "totalMasterDeluxscore", -1754875963776707251L);
        setLongField(term87253, term87253.getClass(), "totalReMasterDeluxscore", -8762863231523446946L);
        setIntField(term87253, term87253.getClass(), "totalSync", 1768023420);
        setIntField(term87253, term87253.getClass(), "totalBasicSync", -409163006);
        setIntField(term87253, term87253.getClass(), "totalAdvancedSync", 1632107117);
        setIntField(term87253, term87253.getClass(), "totalExpertSync", -351038803);
        setIntField(term87253, term87253.getClass(), "totalMasterSync", 1899735308);
        setIntField(term87253, term87253.getClass(), "totalReMasterSync", -1204343453);
        setLongField(term87253, term87253.getClass(), "totalAchievement", -1440107863491666180L);
        setLongField(term87253, term87253.getClass(), "totalBasicAchievement", -794666317429849604L);
        setLongField(term87253, term87253.getClass(), "totalAdvancedAchievement", 8252743985077808790L);
        setLongField(term87253, term87253.getClass(), "totalExpertAchievement", 7266188540048777915L);
        setLongField(term87253, term87253.getClass(), "totalMasterAchievement", 5879881453700146413L);
        setLongField(term87253, term87253.getClass(), "totalReMasterAchievement", 1992717981382367665L);
        setLongField(term87253, term87253.getClass(), "playerOldRating", -2089468866117654256L);
        setLongField(term87253, term87253.getClass(), "playerNewRating", 4709510901953794506L);
        setIntField(term87253, term87253.getClass(), "banState", 1796650051);
        setLongField(term87253, term87253.getClass(), "dateTime", 5365925708045689878L);
        setField(term87251, term87251.getClass(), "user", term87253);
        setIntField(term87251, term87251.getClass(), "courseId", -1736291750);
        setBooleanField(term87251, term87251.getClass(), "isLastClear", true);
        setIntField(term87251, term87251.getClass(), "totalRestlife", 490095898);
        setIntField(term87251, term87251.getClass(), "totalAchievement", -2115800242);
        setIntField(term87251, term87251.getClass(), "totalDeluxscore", 518344933);
        setIntField(term87251, term87251.getClass(), "playCount", -168855495);
        setField(term87251, term87251.getClass(), "clearDate", "ufopOhWQkB");
        setField(term87251, term87251.getClass(), "lastPlayDate", "RqVPcaMpxk");
        setIntField(term87251, term87251.getClass(), "bestAchievement", -810951451);
        setField(term87251, term87251.getClass(), "bestAchievementDate", "zOsnJKDwhL");
        setIntField(term87251, term87251.getClass(), "bestDeluxscore", -347223388);
        setField(term87251, term87251.getClass(), "bestDeluxscoreDate", "VCOuRNQveV");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserCourse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "wOBUMePcSQ";
        callMethod(klass, "setLastPlayDate", argTypes, term87251, args);
    }

};


