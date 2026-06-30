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

public class UserDetail_setTitleId_17576279984 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term242626;
     Object term242973;

    public UserDetail_setTitleId_17576279984() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term242630 = new Long(3931473624300151730L);
        ArrayList term242691 = new ArrayList();
        Integer term242697 = new Integer(665116636);
        Integer term242699 = new Integer(1255353874);
        Integer term242701 = new Integer(550111365);
        Integer term242703 = new Integer(1756090789);
        ArrayList term242695 = new ArrayList();
        ((ArrayList) term242695).add(term242697);
        ((ArrayList) term242695).add(term242699);
        ((ArrayList) term242695).add(term242701);
        ((ArrayList) term242695).add(term242703);
        term242626 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term242628 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term242644 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term242645 = newInstance(Class.forName("java.time.LocalDate"));
        Object term242649 = newInstance(Class.forName("java.time.LocalTime"));
        Object term242654 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term242655 = newInstance(Class.forName("java.time.LocalDate"));
        Object term242659 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term242626, term242626.getClass(), "id", 6943656114908900832L);
        setLongField(term242628, term242628.getClass(), "id", -8922445701127665100L);
        setField(term242628, term242628.getClass(), "extId", term242630);
        setField(term242628, term242628.getClass(), "luid", "TICBysdfuB");
        setIntField(term242645, term242645.getClass(), "year", 2010);
        setShortField(term242645, term242645.getClass(), "month", (short) 4);
        setShortField(term242645, term242645.getClass(), "day", (short) 22);
        setField(term242644, term242644.getClass(), "date", term242645);
        setByteField(term242649, term242649.getClass(), "hour", (byte) 16);
        setByteField(term242649, term242649.getClass(), "minute", (byte) 6);
        setByteField(term242649, term242649.getClass(), "second", (byte) 12);
        setIntField(term242649, term242649.getClass(), "nano", 46820039);
        setField(term242644, term242644.getClass(), "time", term242649);
        setField(term242628, term242628.getClass(), "registerTime", term242644);
        setIntField(term242655, term242655.getClass(), "year", 2025);
        setShortField(term242655, term242655.getClass(), "month", (short) 10);
        setShortField(term242655, term242655.getClass(), "day", (short) 24);
        setField(term242654, term242654.getClass(), "date", term242655);
        setByteField(term242659, term242659.getClass(), "hour", (byte) 16);
        setByteField(term242659, term242659.getClass(), "minute", (byte) 37);
        setByteField(term242659, term242659.getClass(), "second", (byte) 14);
        setIntField(term242659, term242659.getClass(), "nano", 973421967);
        setField(term242654, term242654.getClass(), "time", term242659);
        setField(term242628, term242628.getClass(), "accessTime", term242654);
        setField(term242626, term242626.getClass(), "card", term242628);
        setField(term242626, term242626.getClass(), "userName", "nCZmfjNayQ");
        setIntField(term242626, term242626.getClass(), "isNetMember", 993806285);
        setIntField(term242626, term242626.getClass(), "iconId", 1845685402);
        setIntField(term242626, term242626.getClass(), "plateId", -1246524805);
        setIntField(term242626, term242626.getClass(), "titleId", -947153148);
        setIntField(term242626, term242626.getClass(), "partnerId", -798375153);
        setIntField(term242626, term242626.getClass(), "frameId", 602245063);
        setIntField(term242626, term242626.getClass(), "selectMapId", -649896338);
        setIntField(term242626, term242626.getClass(), "totalAwake", -1501372469);
        setIntField(term242626, term242626.getClass(), "gradeRating", -2144578406);
        setIntField(term242626, term242626.getClass(), "musicRating", -1984046630);
        setIntField(term242626, term242626.getClass(), "playerRating", -1548385276);
        setIntField(term242626, term242626.getClass(), "highestRating", 565549934);
        setIntField(term242626, term242626.getClass(), "gradeRank", 1177281465);
        setIntField(term242626, term242626.getClass(), "classRank", -1236004824);
        setIntField(term242626, term242626.getClass(), "courseRank", -311539591);
        setField(term242626, term242626.getClass(), "charaSlot", term242691);
        setField(term242626, term242626.getClass(), "charaLockSlot", term242695);
        setLongField(term242626, term242626.getClass(), "contentBit", 5978459948492781490L);
        setIntField(term242626, term242626.getClass(), "playCount", -1770831459);
        setField(term242626, term242626.getClass(), "eventWatchedDate", "rhQpxOnBRb");
        setField(term242626, term242626.getClass(), "lastGameId", "jMaSLvIsta");
        setField(term242626, term242626.getClass(), "lastRomVersion", "sSyiKfZXEJ");
        setField(term242626, term242626.getClass(), "lastDataVersion", "ioALTdlErP");
        setField(term242626, term242626.getClass(), "lastLoginDate", "STfCNGDtwG");
        setField(term242626, term242626.getClass(), "lastPlayDate", "NobNtKSnxv");
        setIntField(term242626, term242626.getClass(), "lastPlayCredit", -502669627);
        setIntField(term242626, term242626.getClass(), "lastPlayMode", 2108204698);
        setIntField(term242626, term242626.getClass(), "lastPlaceId", 1506339933);
        setField(term242626, term242626.getClass(), "lastPlaceName", "oTXsJGhPMO");
        setIntField(term242626, term242626.getClass(), "lastAllNetId", -928174053);
        setIntField(term242626, term242626.getClass(), "lastRegionId", 1179317706);
        setField(term242626, term242626.getClass(), "lastRegionName", "VKSQjeEwka");
        setField(term242626, term242626.getClass(), "lastClientId", "rvyeTnWWlf");
        setField(term242626, term242626.getClass(), "lastCountryCode", "qwmljKSBGF");
        setIntField(term242626, term242626.getClass(), "lastSelectEMoney", -279431300);
        setIntField(term242626, term242626.getClass(), "lastSelectTicket", 1136629984);
        setIntField(term242626, term242626.getClass(), "lastSelectCourse", -1618661197);
        setIntField(term242626, term242626.getClass(), "lastCountCourse", 38755177);
        setField(term242626, term242626.getClass(), "firstGameId", "ehfwuHuJCM");
        setField(term242626, term242626.getClass(), "firstRomVersion", "ohwhPbAzfO");
        setField(term242626, term242626.getClass(), "firstDataVersion", "oaMSqXLhMk");
        setField(term242626, term242626.getClass(), "firstPlayDate", "JOvcnvkLRz");
        setField(term242626, term242626.getClass(), "compatibleCmVersion", "pxPcAihzBr");
        setField(term242626, term242626.getClass(), "dailyBonusDate", "GzKodkVNkA");
        setField(term242626, term242626.getClass(), "dailyCourseBonusDate", "mEXwOlYBEo");
        setField(term242626, term242626.getClass(), "lastPairLoginDate", "MHYIXqSlwf");
        setField(term242626, term242626.getClass(), "lastTrialPlayDate", "sJpbENqPxH");
        setIntField(term242626, term242626.getClass(), "playVsCount", 164361364);
        setIntField(term242626, term242626.getClass(), "playSyncCount", -1933122225);
        setIntField(term242626, term242626.getClass(), "winCount", 6941292);
        setIntField(term242626, term242626.getClass(), "helpCount", -1894535169);
        setIntField(term242626, term242626.getClass(), "comboCount", -1194320522);
        setLongField(term242626, term242626.getClass(), "totalDeluxscore", -3099183149504131586L);
        setLongField(term242626, term242626.getClass(), "totalBasicDeluxscore", 3506491950007144609L);
        setLongField(term242626, term242626.getClass(), "totalAdvancedDeluxscore", -6108629369113018871L);
        setLongField(term242626, term242626.getClass(), "totalExpertDeluxscore", -4460437252070378844L);
        setLongField(term242626, term242626.getClass(), "totalMasterDeluxscore", 1749809971338757172L);
        setLongField(term242626, term242626.getClass(), "totalReMasterDeluxscore", -6833601665724941863L);
        setIntField(term242626, term242626.getClass(), "totalSync", 513650910);
        setIntField(term242626, term242626.getClass(), "totalBasicSync", -1964199429);
        setIntField(term242626, term242626.getClass(), "totalAdvancedSync", 628292358);
        setIntField(term242626, term242626.getClass(), "totalExpertSync", -169146602);
        setIntField(term242626, term242626.getClass(), "totalMasterSync", 899306663);
        setIntField(term242626, term242626.getClass(), "totalReMasterSync", 708799864);
        setLongField(term242626, term242626.getClass(), "totalAchievement", 3765817398611910495L);
        setLongField(term242626, term242626.getClass(), "totalBasicAchievement", -6505639373138331956L);
        setLongField(term242626, term242626.getClass(), "totalAdvancedAchievement", 8156872775342639440L);
        setLongField(term242626, term242626.getClass(), "totalExpertAchievement", -6155494487745765127L);
        setLongField(term242626, term242626.getClass(), "totalMasterAchievement", 3814012186126194394L);
        setLongField(term242626, term242626.getClass(), "totalReMasterAchievement", -8596312154774393457L);
        setLongField(term242626, term242626.getClass(), "playerOldRating", 7344258640412472891L);
        setLongField(term242626, term242626.getClass(), "playerNewRating", 7657900670819798646L);
        setIntField(term242626, term242626.getClass(), "banState", -851159365);
        setLongField(term242626, term242626.getClass(), "dateTime", -7721763194853232698L);
        term242973 = new Integer(1399097502);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term242973;
        callMethod(klass, "setTitleId", argTypes, term242626, args);
    }

};


