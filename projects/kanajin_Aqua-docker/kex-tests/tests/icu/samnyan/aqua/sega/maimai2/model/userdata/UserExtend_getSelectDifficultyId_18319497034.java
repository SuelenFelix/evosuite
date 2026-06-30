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

public class UserExtend_getSelectDifficultyId_18319497034 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term143772;

    public UserExtend_getSelectDifficultyId_18319497034() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term143778 = new Long(329213208496958131L);
        Integer term143841 = new Integer(-168406824);
        ArrayList term143839 = new ArrayList();
        ((ArrayList) term143839).add(term143841);
        Integer term143847 = new Integer(2063577636);
        Integer term143849 = new Integer(1680632578);
        Integer term143851 = new Integer(511399994);
        Integer term143853 = new Integer(2094923086);
        Integer term143855 = new Integer(1532355365);
        ArrayList term143845 = new ArrayList();
        ((ArrayList) term143845).add(term143847);
        ((ArrayList) term143845).add(term143849);
        ((ArrayList) term143845).add(term143851);
        ((ArrayList) term143845).add(term143853);
        ((ArrayList) term143845).add(term143855);
        ArrayList term144137 = new ArrayList();
        ArrayList term144141 = new ArrayList();
        term143772 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserExtend"));
        Object term143774 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term143776 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term143792 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term143793 = newInstance(Class.forName("java.time.LocalDate"));
        Object term143797 = newInstance(Class.forName("java.time.LocalTime"));
        Object term143802 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term143803 = newInstance(Class.forName("java.time.LocalDate"));
        Object term143807 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term143772, term143772.getClass(), "id", 4259147536426697041L);
        setLongField(term143774, term143774.getClass(), "id", -775673225877885921L);
        setLongField(term143776, term143776.getClass(), "id", -1158666311846705636L);
        setField(term143776, term143776.getClass(), "extId", term143778);
        setField(term143776, term143776.getClass(), "luid", "ItRdcNlydv");
        setIntField(term143793, term143793.getClass(), "year", 2026);
        setShortField(term143793, term143793.getClass(), "month", (short) 4);
        setShortField(term143793, term143793.getClass(), "day", (short) 10);
        setField(term143792, term143792.getClass(), "date", term143793);
        setByteField(term143797, term143797.getClass(), "hour", (byte) 3);
        setByteField(term143797, term143797.getClass(), "minute", (byte) 39);
        setByteField(term143797, term143797.getClass(), "second", (byte) 42);
        setIntField(term143797, term143797.getClass(), "nano", 840728841);
        setField(term143792, term143792.getClass(), "time", term143797);
        setField(term143776, term143776.getClass(), "registerTime", term143792);
        setIntField(term143803, term143803.getClass(), "year", 2029);
        setShortField(term143803, term143803.getClass(), "month", (short) 3);
        setShortField(term143803, term143803.getClass(), "day", (short) 7);
        setField(term143802, term143802.getClass(), "date", term143803);
        setByteField(term143807, term143807.getClass(), "hour", (byte) 11);
        setByteField(term143807, term143807.getClass(), "minute", (byte) 6);
        setByteField(term143807, term143807.getClass(), "second", (byte) 29);
        setIntField(term143807, term143807.getClass(), "nano", 899404417);
        setField(term143802, term143802.getClass(), "time", term143807);
        setField(term143776, term143776.getClass(), "accessTime", term143802);
        setField(term143774, term143774.getClass(), "card", term143776);
        setField(term143774, term143774.getClass(), "userName", "SUQszaJTZI");
        setIntField(term143774, term143774.getClass(), "isNetMember", -1573775399);
        setIntField(term143774, term143774.getClass(), "iconId", -301649033);
        setIntField(term143774, term143774.getClass(), "plateId", 1335266802);
        setIntField(term143774, term143774.getClass(), "titleId", -1732408059);
        setIntField(term143774, term143774.getClass(), "partnerId", 1433024397);
        setIntField(term143774, term143774.getClass(), "frameId", 1216072735);
        setIntField(term143774, term143774.getClass(), "selectMapId", 1880806607);
        setIntField(term143774, term143774.getClass(), "totalAwake", 265152714);
        setIntField(term143774, term143774.getClass(), "gradeRating", 1291985298);
        setIntField(term143774, term143774.getClass(), "musicRating", -1615684635);
        setIntField(term143774, term143774.getClass(), "playerRating", -725181754);
        setIntField(term143774, term143774.getClass(), "highestRating", -2117106210);
        setIntField(term143774, term143774.getClass(), "gradeRank", -767668699);
        setIntField(term143774, term143774.getClass(), "classRank", 1274445811);
        setIntField(term143774, term143774.getClass(), "courseRank", 1903103775);
        setField(term143774, term143774.getClass(), "charaSlot", term143839);
        setField(term143774, term143774.getClass(), "charaLockSlot", term143845);
        setLongField(term143774, term143774.getClass(), "contentBit", -1394796225658991697L);
        setIntField(term143774, term143774.getClass(), "playCount", -5489488);
        setField(term143774, term143774.getClass(), "eventWatchedDate", "ecUXveHGcV");
        setField(term143774, term143774.getClass(), "lastGameId", "jSBkabnQzS");
        setField(term143774, term143774.getClass(), "lastRomVersion", "bOiHZqOEzP");
        setField(term143774, term143774.getClass(), "lastDataVersion", "qZMBOEMrvQ");
        setField(term143774, term143774.getClass(), "lastLoginDate", "GGqdxvNUQz");
        setField(term143774, term143774.getClass(), "lastPlayDate", "HVZRnOxaVb");
        setIntField(term143774, term143774.getClass(), "lastPlayCredit", -1846449623);
        setIntField(term143774, term143774.getClass(), "lastPlayMode", -1053745732);
        setIntField(term143774, term143774.getClass(), "lastPlaceId", 1084454865);
        setField(term143774, term143774.getClass(), "lastPlaceName", "OGdPqQpijy");
        setIntField(term143774, term143774.getClass(), "lastAllNetId", -1444485060);
        setIntField(term143774, term143774.getClass(), "lastRegionId", -1355001013);
        setField(term143774, term143774.getClass(), "lastRegionName", "KeJHaUwtNs");
        setField(term143774, term143774.getClass(), "lastClientId", "fTVsHSQKPY");
        setField(term143774, term143774.getClass(), "lastCountryCode", "PmiKCfPhji");
        setIntField(term143774, term143774.getClass(), "lastSelectEMoney", -1335912879);
        setIntField(term143774, term143774.getClass(), "lastSelectTicket", 1371866185);
        setIntField(term143774, term143774.getClass(), "lastSelectCourse", 1556888444);
        setIntField(term143774, term143774.getClass(), "lastCountCourse", 1393504869);
        setField(term143774, term143774.getClass(), "firstGameId", "lAeBISqCrk");
        setField(term143774, term143774.getClass(), "firstRomVersion", "HnnPhDNDyi");
        setField(term143774, term143774.getClass(), "firstDataVersion", "krnrkIPbzN");
        setField(term143774, term143774.getClass(), "firstPlayDate", "mplyyLrKQK");
        setField(term143774, term143774.getClass(), "compatibleCmVersion", "oLdidoDNLS");
        setField(term143774, term143774.getClass(), "dailyBonusDate", "EbcXzUOlTx");
        setField(term143774, term143774.getClass(), "dailyCourseBonusDate", "cskZnajTgh");
        setField(term143774, term143774.getClass(), "lastPairLoginDate", "WZVuzItKLn");
        setField(term143774, term143774.getClass(), "lastTrialPlayDate", "GlWTGuZeKv");
        setIntField(term143774, term143774.getClass(), "playVsCount", 728799986);
        setIntField(term143774, term143774.getClass(), "playSyncCount", -444430231);
        setIntField(term143774, term143774.getClass(), "winCount", -623445473);
        setIntField(term143774, term143774.getClass(), "helpCount", 565663783);
        setIntField(term143774, term143774.getClass(), "comboCount", -971589912);
        setLongField(term143774, term143774.getClass(), "totalDeluxscore", 5755793287906211230L);
        setLongField(term143774, term143774.getClass(), "totalBasicDeluxscore", 2305575913253105150L);
        setLongField(term143774, term143774.getClass(), "totalAdvancedDeluxscore", -5487631964804068250L);
        setLongField(term143774, term143774.getClass(), "totalExpertDeluxscore", -6503681682105040265L);
        setLongField(term143774, term143774.getClass(), "totalMasterDeluxscore", 3378400540021500468L);
        setLongField(term143774, term143774.getClass(), "totalReMasterDeluxscore", 371307308166678989L);
        setIntField(term143774, term143774.getClass(), "totalSync", 1025926099);
        setIntField(term143774, term143774.getClass(), "totalBasicSync", 961710200);
        setIntField(term143774, term143774.getClass(), "totalAdvancedSync", -698630156);
        setIntField(term143774, term143774.getClass(), "totalExpertSync", 160752273);
        setIntField(term143774, term143774.getClass(), "totalMasterSync", -1555752602);
        setIntField(term143774, term143774.getClass(), "totalReMasterSync", -1803417927);
        setLongField(term143774, term143774.getClass(), "totalAchievement", 1849809279069072572L);
        setLongField(term143774, term143774.getClass(), "totalBasicAchievement", -5031718258279253914L);
        setLongField(term143774, term143774.getClass(), "totalAdvancedAchievement", 6190088843493110441L);
        setLongField(term143774, term143774.getClass(), "totalExpertAchievement", -1838351096671692042L);
        setLongField(term143774, term143774.getClass(), "totalMasterAchievement", 8050421694732798692L);
        setLongField(term143774, term143774.getClass(), "totalReMasterAchievement", -3349491132061900439L);
        setLongField(term143774, term143774.getClass(), "playerOldRating", 7854997525393036309L);
        setLongField(term143774, term143774.getClass(), "playerNewRating", 5527519479747605509L);
        setIntField(term143774, term143774.getClass(), "banState", 1174691081);
        setLongField(term143774, term143774.getClass(), "dateTime", -2099702742253776791L);
        setField(term143772, term143772.getClass(), "user", term143774);
        setIntField(term143772, term143772.getClass(), "selectMusicId", -1554467908);
        setIntField(term143772, term143772.getClass(), "selectDifficultyId", 809458440);
        setIntField(term143772, term143772.getClass(), "categoryIndex", 1648454496);
        setIntField(term143772, term143772.getClass(), "musicIndex", 1189516772);
        setIntField(term143772, term143772.getClass(), "extraFlag", 261537591);
        setIntField(term143772, term143772.getClass(), "selectScoreType", 988974502);
        setLongField(term143772, term143772.getClass(), "extendContentBit", 4455503613197760207L);
        setBooleanField(term143772, term143772.getClass(), "isPhotoAgree", false);
        setBooleanField(term143772, term143772.getClass(), "isGotoCodeRead", false);
        setBooleanField(term143772, term143772.getClass(), "selectResultDetails", false);
        setIntField(term143772, term143772.getClass(), "sortCategorySetting", 796479728);
        setIntField(term143772, term143772.getClass(), "sortMusicSetting", 527667682);
        setField(term143772, term143772.getClass(), "selectedCardList", term144137);
        setField(term143772, term143772.getClass(), "encountMapNpcList", term144141);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserExtend");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSelectDifficultyId", argTypes, term143772, args);
    }

};


