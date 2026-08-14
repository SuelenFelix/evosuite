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

public class UserDetail_setTitleId_17576279983 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term242571;
     Object term242918;

    public UserDetail_setTitleId_17576279983() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term242575 = new Long(3931473624300151730L);
        ArrayList term242636 = new ArrayList();
        Integer term242642 = new Integer(665116636);
        Integer term242644 = new Integer(1255353874);
        Integer term242646 = new Integer(550111365);
        Integer term242648 = new Integer(1756090789);
        ArrayList term242640 = new ArrayList();
        ((ArrayList) term242640).add(term242642);
        ((ArrayList) term242640).add(term242644);
        ((ArrayList) term242640).add(term242646);
        ((ArrayList) term242640).add(term242648);
        term242571 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term242573 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term242589 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term242590 = newInstance(Class.forName("java.time.LocalDate"));
        Object term242594 = newInstance(Class.forName("java.time.LocalTime"));
        Object term242599 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term242600 = newInstance(Class.forName("java.time.LocalDate"));
        Object term242604 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term242571, term242571.getClass(), "id", 6943656114908900832L);
        setLongField(term242573, term242573.getClass(), "id", -8922445701127665100L);
        setField(term242573, term242573.getClass(), "extId", term242575);
        setField(term242573, term242573.getClass(), "luid", "TICBysdfuB");
        setIntField(term242590, term242590.getClass(), "year", 2010);
        setShortField(term242590, term242590.getClass(), "month", (short) 4);
        setShortField(term242590, term242590.getClass(), "day", (short) 22);
        setField(term242589, term242589.getClass(), "date", term242590);
        setByteField(term242594, term242594.getClass(), "hour", (byte) 16);
        setByteField(term242594, term242594.getClass(), "minute", (byte) 6);
        setByteField(term242594, term242594.getClass(), "second", (byte) 12);
        setIntField(term242594, term242594.getClass(), "nano", 46820039);
        setField(term242589, term242589.getClass(), "time", term242594);
        setField(term242573, term242573.getClass(), "registerTime", term242589);
        setIntField(term242600, term242600.getClass(), "year", 2025);
        setShortField(term242600, term242600.getClass(), "month", (short) 10);
        setShortField(term242600, term242600.getClass(), "day", (short) 24);
        setField(term242599, term242599.getClass(), "date", term242600);
        setByteField(term242604, term242604.getClass(), "hour", (byte) 16);
        setByteField(term242604, term242604.getClass(), "minute", (byte) 37);
        setByteField(term242604, term242604.getClass(), "second", (byte) 14);
        setIntField(term242604, term242604.getClass(), "nano", 973421967);
        setField(term242599, term242599.getClass(), "time", term242604);
        setField(term242573, term242573.getClass(), "accessTime", term242599);
        setField(term242571, term242571.getClass(), "card", term242573);
        setField(term242571, term242571.getClass(), "userName", "nCZmfjNayQ");
        setIntField(term242571, term242571.getClass(), "isNetMember", 993806285);
        setIntField(term242571, term242571.getClass(), "iconId", 1845685402);
        setIntField(term242571, term242571.getClass(), "plateId", -1246524805);
        setIntField(term242571, term242571.getClass(), "titleId", -947153148);
        setIntField(term242571, term242571.getClass(), "partnerId", -798375153);
        setIntField(term242571, term242571.getClass(), "frameId", 602245063);
        setIntField(term242571, term242571.getClass(), "selectMapId", -649896338);
        setIntField(term242571, term242571.getClass(), "totalAwake", -1501372469);
        setIntField(term242571, term242571.getClass(), "gradeRating", -2144578406);
        setIntField(term242571, term242571.getClass(), "musicRating", -1984046630);
        setIntField(term242571, term242571.getClass(), "playerRating", -1548385276);
        setIntField(term242571, term242571.getClass(), "highestRating", 565549934);
        setIntField(term242571, term242571.getClass(), "gradeRank", 1177281465);
        setIntField(term242571, term242571.getClass(), "classRank", -1236004824);
        setIntField(term242571, term242571.getClass(), "courseRank", -311539591);
        setField(term242571, term242571.getClass(), "charaSlot", term242636);
        setField(term242571, term242571.getClass(), "charaLockSlot", term242640);
        setLongField(term242571, term242571.getClass(), "contentBit", 5978459948492781490L);
        setIntField(term242571, term242571.getClass(), "playCount", -1770831459);
        setField(term242571, term242571.getClass(), "eventWatchedDate", "rhQpxOnBRb");
        setField(term242571, term242571.getClass(), "lastGameId", "jMaSLvIsta");
        setField(term242571, term242571.getClass(), "lastRomVersion", "sSyiKfZXEJ");
        setField(term242571, term242571.getClass(), "lastDataVersion", "ioALTdlErP");
        setField(term242571, term242571.getClass(), "lastLoginDate", "STfCNGDtwG");
        setField(term242571, term242571.getClass(), "lastPlayDate", "NobNtKSnxv");
        setIntField(term242571, term242571.getClass(), "lastPlayCredit", -502669627);
        setIntField(term242571, term242571.getClass(), "lastPlayMode", 2108204698);
        setIntField(term242571, term242571.getClass(), "lastPlaceId", 1506339933);
        setField(term242571, term242571.getClass(), "lastPlaceName", "oTXsJGhPMO");
        setIntField(term242571, term242571.getClass(), "lastAllNetId", -928174053);
        setIntField(term242571, term242571.getClass(), "lastRegionId", 1179317706);
        setField(term242571, term242571.getClass(), "lastRegionName", "VKSQjeEwka");
        setField(term242571, term242571.getClass(), "lastClientId", "rvyeTnWWlf");
        setField(term242571, term242571.getClass(), "lastCountryCode", "qwmljKSBGF");
        setIntField(term242571, term242571.getClass(), "lastSelectEMoney", -279431300);
        setIntField(term242571, term242571.getClass(), "lastSelectTicket", 1136629984);
        setIntField(term242571, term242571.getClass(), "lastSelectCourse", -1618661197);
        setIntField(term242571, term242571.getClass(), "lastCountCourse", 38755177);
        setField(term242571, term242571.getClass(), "firstGameId", "ehfwuHuJCM");
        setField(term242571, term242571.getClass(), "firstRomVersion", "ohwhPbAzfO");
        setField(term242571, term242571.getClass(), "firstDataVersion", "oaMSqXLhMk");
        setField(term242571, term242571.getClass(), "firstPlayDate", "JOvcnvkLRz");
        setField(term242571, term242571.getClass(), "compatibleCmVersion", "pxPcAihzBr");
        setField(term242571, term242571.getClass(), "dailyBonusDate", "GzKodkVNkA");
        setField(term242571, term242571.getClass(), "dailyCourseBonusDate", "mEXwOlYBEo");
        setField(term242571, term242571.getClass(), "lastPairLoginDate", "MHYIXqSlwf");
        setField(term242571, term242571.getClass(), "lastTrialPlayDate", "sJpbENqPxH");
        setIntField(term242571, term242571.getClass(), "playVsCount", 164361364);
        setIntField(term242571, term242571.getClass(), "playSyncCount", -1933122225);
        setIntField(term242571, term242571.getClass(), "winCount", 6941292);
        setIntField(term242571, term242571.getClass(), "helpCount", -1894535169);
        setIntField(term242571, term242571.getClass(), "comboCount", -1194320522);
        setLongField(term242571, term242571.getClass(), "totalDeluxscore", -3099183149504131586L);
        setLongField(term242571, term242571.getClass(), "totalBasicDeluxscore", 3506491950007144609L);
        setLongField(term242571, term242571.getClass(), "totalAdvancedDeluxscore", -6108629369113018871L);
        setLongField(term242571, term242571.getClass(), "totalExpertDeluxscore", -4460437252070378844L);
        setLongField(term242571, term242571.getClass(), "totalMasterDeluxscore", 1749809971338757172L);
        setLongField(term242571, term242571.getClass(), "totalReMasterDeluxscore", -6833601665724941863L);
        setIntField(term242571, term242571.getClass(), "totalSync", 513650910);
        setIntField(term242571, term242571.getClass(), "totalBasicSync", -1964199429);
        setIntField(term242571, term242571.getClass(), "totalAdvancedSync", 628292358);
        setIntField(term242571, term242571.getClass(), "totalExpertSync", -169146602);
        setIntField(term242571, term242571.getClass(), "totalMasterSync", 899306663);
        setIntField(term242571, term242571.getClass(), "totalReMasterSync", 708799864);
        setLongField(term242571, term242571.getClass(), "totalAchievement", 3765817398611910495L);
        setLongField(term242571, term242571.getClass(), "totalBasicAchievement", -6505639373138331956L);
        setLongField(term242571, term242571.getClass(), "totalAdvancedAchievement", 8156872775342639440L);
        setLongField(term242571, term242571.getClass(), "totalExpertAchievement", -6155494487745765127L);
        setLongField(term242571, term242571.getClass(), "totalMasterAchievement", 3814012186126194394L);
        setLongField(term242571, term242571.getClass(), "totalReMasterAchievement", -8596312154774393457L);
        setLongField(term242571, term242571.getClass(), "playerOldRating", 7344258640412472891L);
        setLongField(term242571, term242571.getClass(), "playerNewRating", 7657900670819798646L);
        setIntField(term242571, term242571.getClass(), "banState", -851159365);
        setLongField(term242571, term242571.getClass(), "dateTime", -7721763194853232698L);
        term242918 = new Integer(1399097502);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term242918;
        callMethod(klass, "setTitleId", argTypes, term242571, args);
    }

};


