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

public class UserItem_getStock_12442380105 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35790;

    public UserItem_getStock_12442380105() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term35796 = new Long(-2850532706972744550L);
        Integer term35859 = new Integer(-763166094);
        Integer term35861 = new Integer(-222941705);
        Integer term35863 = new Integer(291864719);
        Integer term35865 = new Integer(-1549607466);
        Integer term35867 = new Integer(853609788);
        ArrayList term35857 = new ArrayList();
        ((ArrayList) term35857).add(term35859);
        ((ArrayList) term35857).add(term35861);
        ((ArrayList) term35857).add(term35863);
        ((ArrayList) term35857).add(term35865);
        ((ArrayList) term35857).add(term35867);
        Integer term35873 = new Integer(-197820800);
        Integer term35875 = new Integer(723812297);
        ArrayList term35871 = new ArrayList();
        ((ArrayList) term35871).add(term35873);
        ((ArrayList) term35871).add(term35875);
        term35790 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserItem"));
        Object term35792 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term35794 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term35810 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term35811 = newInstance(Class.forName("java.time.LocalDate"));
        Object term35815 = newInstance(Class.forName("java.time.LocalTime"));
        Object term35820 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term35821 = newInstance(Class.forName("java.time.LocalDate"));
        Object term35825 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term35790, term35790.getClass(), "id", 3410627884495049043L);
        setLongField(term35792, term35792.getClass(), "id", -1884609063652624817L);
        setLongField(term35794, term35794.getClass(), "id", 4110677574531044171L);
        setField(term35794, term35794.getClass(), "extId", term35796);
        setField(term35794, term35794.getClass(), "luid", "DoSWbCtsBg");
        setIntField(term35811, term35811.getClass(), "year", 2021);
        setShortField(term35811, term35811.getClass(), "month", (short) 8);
        setShortField(term35811, term35811.getClass(), "day", (short) 27);
        setField(term35810, term35810.getClass(), "date", term35811);
        setByteField(term35815, term35815.getClass(), "hour", (byte) 20);
        setByteField(term35815, term35815.getClass(), "minute", (byte) 11);
        setByteField(term35815, term35815.getClass(), "second", (byte) 47);
        setIntField(term35815, term35815.getClass(), "nano", 116303493);
        setField(term35810, term35810.getClass(), "time", term35815);
        setField(term35794, term35794.getClass(), "registerTime", term35810);
        setIntField(term35821, term35821.getClass(), "year", 2012);
        setShortField(term35821, term35821.getClass(), "month", (short) 5);
        setShortField(term35821, term35821.getClass(), "day", (short) 17);
        setField(term35820, term35820.getClass(), "date", term35821);
        setByteField(term35825, term35825.getClass(), "hour", (byte) 19);
        setByteField(term35825, term35825.getClass(), "minute", (byte) 36);
        setByteField(term35825, term35825.getClass(), "second", (byte) 33);
        setIntField(term35825, term35825.getClass(), "nano", 46625011);
        setField(term35820, term35820.getClass(), "time", term35825);
        setField(term35794, term35794.getClass(), "accessTime", term35820);
        setField(term35792, term35792.getClass(), "card", term35794);
        setField(term35792, term35792.getClass(), "userName", "NrXtkbXwDc");
        setIntField(term35792, term35792.getClass(), "isNetMember", 285368240);
        setIntField(term35792, term35792.getClass(), "iconId", 1526503433);
        setIntField(term35792, term35792.getClass(), "plateId", 1765728316);
        setIntField(term35792, term35792.getClass(), "titleId", -1459041031);
        setIntField(term35792, term35792.getClass(), "partnerId", 846881911);
        setIntField(term35792, term35792.getClass(), "frameId", 780077059);
        setIntField(term35792, term35792.getClass(), "selectMapId", -924663332);
        setIntField(term35792, term35792.getClass(), "totalAwake", 579787883);
        setIntField(term35792, term35792.getClass(), "gradeRating", -1104816537);
        setIntField(term35792, term35792.getClass(), "musicRating", 1997406081);
        setIntField(term35792, term35792.getClass(), "playerRating", -160995016);
        setIntField(term35792, term35792.getClass(), "highestRating", -849730731);
        setIntField(term35792, term35792.getClass(), "gradeRank", -1965240023);
        setIntField(term35792, term35792.getClass(), "classRank", -86860026);
        setIntField(term35792, term35792.getClass(), "courseRank", -444451515);
        setField(term35792, term35792.getClass(), "charaSlot", term35857);
        setField(term35792, term35792.getClass(), "charaLockSlot", term35871);
        setLongField(term35792, term35792.getClass(), "contentBit", -7231877484121205165L);
        setIntField(term35792, term35792.getClass(), "playCount", -545419660);
        setField(term35792, term35792.getClass(), "eventWatchedDate", "EUapSrAmOe");
        setField(term35792, term35792.getClass(), "lastGameId", "dUHylIprea");
        setField(term35792, term35792.getClass(), "lastRomVersion", "FKDqHRpMcc");
        setField(term35792, term35792.getClass(), "lastDataVersion", "mIRMQIxHUD");
        setField(term35792, term35792.getClass(), "lastLoginDate", "FbBMtntDbw");
        setField(term35792, term35792.getClass(), "lastPlayDate", "zRnpRGaHlI");
        setIntField(term35792, term35792.getClass(), "lastPlayCredit", -1917689550);
        setIntField(term35792, term35792.getClass(), "lastPlayMode", 1829428325);
        setIntField(term35792, term35792.getClass(), "lastPlaceId", -1881843694);
        setField(term35792, term35792.getClass(), "lastPlaceName", "dVHfxjbMRK");
        setIntField(term35792, term35792.getClass(), "lastAllNetId", -1134250665);
        setIntField(term35792, term35792.getClass(), "lastRegionId", -1607263638);
        setField(term35792, term35792.getClass(), "lastRegionName", "LzwyLxKJpw");
        setField(term35792, term35792.getClass(), "lastClientId", "ZhWJlplAVK");
        setField(term35792, term35792.getClass(), "lastCountryCode", "pnmjTuTojv");
        setIntField(term35792, term35792.getClass(), "lastSelectEMoney", 691469974);
        setIntField(term35792, term35792.getClass(), "lastSelectTicket", -2080503799);
        setIntField(term35792, term35792.getClass(), "lastSelectCourse", 13757525);
        setIntField(term35792, term35792.getClass(), "lastCountCourse", 77853966);
        setField(term35792, term35792.getClass(), "firstGameId", "eMtshhmGEm");
        setField(term35792, term35792.getClass(), "firstRomVersion", "VJUbzHGOvg");
        setField(term35792, term35792.getClass(), "firstDataVersion", "SiwcigIrfD");
        setField(term35792, term35792.getClass(), "firstPlayDate", "MFIdGVLoDo");
        setField(term35792, term35792.getClass(), "compatibleCmVersion", "kbxgTcnXyU");
        setField(term35792, term35792.getClass(), "dailyBonusDate", "lnJvDbbuwo");
        setField(term35792, term35792.getClass(), "dailyCourseBonusDate", "KExnWkKGvF");
        setField(term35792, term35792.getClass(), "lastPairLoginDate", "luGUNfvmKk");
        setField(term35792, term35792.getClass(), "lastTrialPlayDate", "oOUHomyJff");
        setIntField(term35792, term35792.getClass(), "playVsCount", 1451393741);
        setIntField(term35792, term35792.getClass(), "playSyncCount", -1115815564);
        setIntField(term35792, term35792.getClass(), "winCount", 425132480);
        setIntField(term35792, term35792.getClass(), "helpCount", 1968674006);
        setIntField(term35792, term35792.getClass(), "comboCount", -634536248);
        setLongField(term35792, term35792.getClass(), "totalDeluxscore", 3571859690258686344L);
        setLongField(term35792, term35792.getClass(), "totalBasicDeluxscore", -3259323558419605103L);
        setLongField(term35792, term35792.getClass(), "totalAdvancedDeluxscore", 7299361469288644847L);
        setLongField(term35792, term35792.getClass(), "totalExpertDeluxscore", -5822755741902532021L);
        setLongField(term35792, term35792.getClass(), "totalMasterDeluxscore", 3092709067387780151L);
        setLongField(term35792, term35792.getClass(), "totalReMasterDeluxscore", -5996777564331234572L);
        setIntField(term35792, term35792.getClass(), "totalSync", 1090329667);
        setIntField(term35792, term35792.getClass(), "totalBasicSync", -1082123686);
        setIntField(term35792, term35792.getClass(), "totalAdvancedSync", -991011239);
        setIntField(term35792, term35792.getClass(), "totalExpertSync", -1774267288);
        setIntField(term35792, term35792.getClass(), "totalMasterSync", -1394083316);
        setIntField(term35792, term35792.getClass(), "totalReMasterSync", 23814407);
        setLongField(term35792, term35792.getClass(), "totalAchievement", -218745825074249415L);
        setLongField(term35792, term35792.getClass(), "totalBasicAchievement", -4912367223635767530L);
        setLongField(term35792, term35792.getClass(), "totalAdvancedAchievement", 5307759455220911721L);
        setLongField(term35792, term35792.getClass(), "totalExpertAchievement", 8447690702287486582L);
        setLongField(term35792, term35792.getClass(), "totalMasterAchievement", 6553325891603936420L);
        setLongField(term35792, term35792.getClass(), "totalReMasterAchievement", -2813353909483819403L);
        setLongField(term35792, term35792.getClass(), "playerOldRating", -1960938531726773973L);
        setLongField(term35792, term35792.getClass(), "playerNewRating", -4845114630136242760L);
        setIntField(term35792, term35792.getClass(), "banState", 1941438128);
        setLongField(term35792, term35792.getClass(), "dateTime", -1224346442914356241L);
        setField(term35790, term35790.getClass(), "user", term35792);
        setIntField(term35790, term35790.getClass(), "itemKind", -418002301);
        setIntField(term35790, term35790.getClass(), "itemId", 2067599442);
        setIntField(term35790, term35790.getClass(), "stock", -335577660);
        setBooleanField(term35790, term35790.getClass(), "isValid", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserItem");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStock", argTypes, term35790, args);
    }

};


