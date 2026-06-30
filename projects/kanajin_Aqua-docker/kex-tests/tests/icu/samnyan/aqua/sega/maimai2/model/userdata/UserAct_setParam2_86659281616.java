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

public class UserAct_setParam2_86659281616 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9757;
     Object term10121;

    public UserAct_setParam2_86659281616() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term9763 = new Long(5127676408959197577L);
        Integer term9826 = new Integer(-2063457669);
        Integer term9828 = new Integer(-1222006000);
        Integer term9830 = new Integer(2095798786);
        ArrayList term9824 = new ArrayList();
        ((ArrayList) term9824).add(term9826);
        ((ArrayList) term9824).add(term9828);
        ((ArrayList) term9824).add(term9830);
        Integer term9836 = new Integer(-1565502840);
        Integer term9838 = new Integer(344323424);
        Integer term9840 = new Integer(9726679);
        Integer term9842 = new Integer(-25637976);
        Integer term9844 = new Integer(1555897383);
        ArrayList term9834 = new ArrayList();
        ((ArrayList) term9834).add(term9836);
        ((ArrayList) term9834).add(term9838);
        ((ArrayList) term9834).add(term9840);
        ((ArrayList) term9834).add(term9842);
        ((ArrayList) term9834).add(term9844);
        term9757 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserAct"));
        Object term9759 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term9761 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term9777 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term9778 = newInstance(Class.forName("java.time.LocalDate"));
        Object term9782 = newInstance(Class.forName("java.time.LocalTime"));
        Object term9787 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term9788 = newInstance(Class.forName("java.time.LocalDate"));
        Object term9792 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term9757, term9757.getClass(), "id", -7205236974351118210L);
        setLongField(term9759, term9759.getClass(), "id", -2136893352275781569L);
        setLongField(term9761, term9761.getClass(), "id", -9147545274054597570L);
        setField(term9761, term9761.getClass(), "extId", term9763);
        setField(term9761, term9761.getClass(), "luid", "hulYxtowxw");
        setIntField(term9778, term9778.getClass(), "year", 2010);
        setShortField(term9778, term9778.getClass(), "month", (short) 5);
        setShortField(term9778, term9778.getClass(), "day", (short) 2);
        setField(term9777, term9777.getClass(), "date", term9778);
        setByteField(term9782, term9782.getClass(), "hour", (byte) 2);
        setByteField(term9782, term9782.getClass(), "minute", (byte) 22);
        setByteField(term9782, term9782.getClass(), "second", (byte) 33);
        setIntField(term9782, term9782.getClass(), "nano", 530835039);
        setField(term9777, term9777.getClass(), "time", term9782);
        setField(term9761, term9761.getClass(), "registerTime", term9777);
        setIntField(term9788, term9788.getClass(), "year", 2024);
        setShortField(term9788, term9788.getClass(), "month", (short) 4);
        setShortField(term9788, term9788.getClass(), "day", (short) 24);
        setField(term9787, term9787.getClass(), "date", term9788);
        setByteField(term9792, term9792.getClass(), "hour", (byte) 7);
        setByteField(term9792, term9792.getClass(), "minute", (byte) 2);
        setByteField(term9792, term9792.getClass(), "second", (byte) 51);
        setIntField(term9792, term9792.getClass(), "nano", 635502964);
        setField(term9787, term9787.getClass(), "time", term9792);
        setField(term9761, term9761.getClass(), "accessTime", term9787);
        setField(term9759, term9759.getClass(), "card", term9761);
        setField(term9759, term9759.getClass(), "userName", "GNEmuHPNcU");
        setIntField(term9759, term9759.getClass(), "isNetMember", 868908117);
        setIntField(term9759, term9759.getClass(), "iconId", 1789351397);
        setIntField(term9759, term9759.getClass(), "plateId", 2145528170);
        setIntField(term9759, term9759.getClass(), "titleId", -585773976);
        setIntField(term9759, term9759.getClass(), "partnerId", 852806940);
        setIntField(term9759, term9759.getClass(), "frameId", 698551724);
        setIntField(term9759, term9759.getClass(), "selectMapId", -1631048635);
        setIntField(term9759, term9759.getClass(), "totalAwake", 1342808731);
        setIntField(term9759, term9759.getClass(), "gradeRating", -64893740);
        setIntField(term9759, term9759.getClass(), "musicRating", -222012928);
        setIntField(term9759, term9759.getClass(), "playerRating", -146564963);
        setIntField(term9759, term9759.getClass(), "highestRating", -83178716);
        setIntField(term9759, term9759.getClass(), "gradeRank", -1292704466);
        setIntField(term9759, term9759.getClass(), "classRank", 1991858584);
        setIntField(term9759, term9759.getClass(), "courseRank", -1300947782);
        setField(term9759, term9759.getClass(), "charaSlot", term9824);
        setField(term9759, term9759.getClass(), "charaLockSlot", term9834);
        setLongField(term9759, term9759.getClass(), "contentBit", -8398381579707958144L);
        setIntField(term9759, term9759.getClass(), "playCount", 188512644);
        setField(term9759, term9759.getClass(), "eventWatchedDate", "IoSfuKDFRe");
        setField(term9759, term9759.getClass(), "lastGameId", "AWYyZiNfsm");
        setField(term9759, term9759.getClass(), "lastRomVersion", "ITRRYiuDwH");
        setField(term9759, term9759.getClass(), "lastDataVersion", "llRfwANcVF");
        setField(term9759, term9759.getClass(), "lastLoginDate", "sUEeHQTWkA");
        setField(term9759, term9759.getClass(), "lastPlayDate", "BDIRCxAWLA");
        setIntField(term9759, term9759.getClass(), "lastPlayCredit", 1851127634);
        setIntField(term9759, term9759.getClass(), "lastPlayMode", 783730213);
        setIntField(term9759, term9759.getClass(), "lastPlaceId", 1815951606);
        setField(term9759, term9759.getClass(), "lastPlaceName", "eOJfbiZLnb");
        setIntField(term9759, term9759.getClass(), "lastAllNetId", 1105016932);
        setIntField(term9759, term9759.getClass(), "lastRegionId", -365784998);
        setField(term9759, term9759.getClass(), "lastRegionName", "nKZKnxWYCK");
        setField(term9759, term9759.getClass(), "lastClientId", "JOqQxuzRuZ");
        setField(term9759, term9759.getClass(), "lastCountryCode", "RSaoipUlsg");
        setIntField(term9759, term9759.getClass(), "lastSelectEMoney", -1893236300);
        setIntField(term9759, term9759.getClass(), "lastSelectTicket", -1858909368);
        setIntField(term9759, term9759.getClass(), "lastSelectCourse", -280113263);
        setIntField(term9759, term9759.getClass(), "lastCountCourse", 529625347);
        setField(term9759, term9759.getClass(), "firstGameId", "cSHGbqKqlN");
        setField(term9759, term9759.getClass(), "firstRomVersion", "pFAfANnxup");
        setField(term9759, term9759.getClass(), "firstDataVersion", "FbSIUZyBXZ");
        setField(term9759, term9759.getClass(), "firstPlayDate", "mhQDwIyrRi");
        setField(term9759, term9759.getClass(), "compatibleCmVersion", "HpZXWDPhlg");
        setField(term9759, term9759.getClass(), "dailyBonusDate", "lBOokzEPfe");
        setField(term9759, term9759.getClass(), "dailyCourseBonusDate", "dtGZCsKXbW");
        setField(term9759, term9759.getClass(), "lastPairLoginDate", "bdyhHbDAmJ");
        setField(term9759, term9759.getClass(), "lastTrialPlayDate", "BBXiTNHqGE");
        setIntField(term9759, term9759.getClass(), "playVsCount", 1409095253);
        setIntField(term9759, term9759.getClass(), "playSyncCount", 315179039);
        setIntField(term9759, term9759.getClass(), "winCount", -1835923897);
        setIntField(term9759, term9759.getClass(), "helpCount", -341287775);
        setIntField(term9759, term9759.getClass(), "comboCount", -1651110911);
        setLongField(term9759, term9759.getClass(), "totalDeluxscore", -2195061939206930224L);
        setLongField(term9759, term9759.getClass(), "totalBasicDeluxscore", 4525924047960478347L);
        setLongField(term9759, term9759.getClass(), "totalAdvancedDeluxscore", -3225860270104198596L);
        setLongField(term9759, term9759.getClass(), "totalExpertDeluxscore", -1164342036939643746L);
        setLongField(term9759, term9759.getClass(), "totalMasterDeluxscore", -7013378340043571457L);
        setLongField(term9759, term9759.getClass(), "totalReMasterDeluxscore", -3279534582096707294L);
        setIntField(term9759, term9759.getClass(), "totalSync", -1934033808);
        setIntField(term9759, term9759.getClass(), "totalBasicSync", 950322609);
        setIntField(term9759, term9759.getClass(), "totalAdvancedSync", -2023791789);
        setIntField(term9759, term9759.getClass(), "totalExpertSync", 353974456);
        setIntField(term9759, term9759.getClass(), "totalMasterSync", -485108462);
        setIntField(term9759, term9759.getClass(), "totalReMasterSync", 1418551216);
        setLongField(term9759, term9759.getClass(), "totalAchievement", -6490254947459640565L);
        setLongField(term9759, term9759.getClass(), "totalBasicAchievement", -7001094993638840490L);
        setLongField(term9759, term9759.getClass(), "totalAdvancedAchievement", 3077284143733577490L);
        setLongField(term9759, term9759.getClass(), "totalExpertAchievement", 4458302820344896046L);
        setLongField(term9759, term9759.getClass(), "totalMasterAchievement", -432424084523104253L);
        setLongField(term9759, term9759.getClass(), "totalReMasterAchievement", 6150186973473930616L);
        setLongField(term9759, term9759.getClass(), "playerOldRating", -3850323135468805420L);
        setLongField(term9759, term9759.getClass(), "playerNewRating", -5207216109884759743L);
        setIntField(term9759, term9759.getClass(), "banState", -626779272);
        setLongField(term9759, term9759.getClass(), "dateTime", 8765880103547975810L);
        setField(term9757, term9757.getClass(), "user", term9759);
        setIntField(term9757, term9757.getClass(), "kind", -1150062870);
        setIntField(term9757, term9757.getClass(), "activityId", -886200503);
        setLongField(term9757, term9757.getClass(), "sortNumber", 4552367707739103094L);
        setIntField(term9757, term9757.getClass(), "param1", 1136393691);
        setIntField(term9757, term9757.getClass(), "param2", -1288536479);
        setIntField(term9757, term9757.getClass(), "param3", 1092038167);
        setIntField(term9757, term9757.getClass(), "param4", 1879729823);
        term10121 = new Integer(1443855558);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserAct");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term10121;
        callMethod(klass, "setParam2", argTypes, term9757, args);
    }

};


