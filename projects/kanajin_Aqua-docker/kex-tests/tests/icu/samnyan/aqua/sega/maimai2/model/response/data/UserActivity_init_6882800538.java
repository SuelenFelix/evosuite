package icu.samnyan.aqua.sega.maimai2.model.response.data;

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
import static icu.samnyan.aqua.sega.maimai2.model.response.data.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.LinkedList;
import java.lang.Object;
import java.lang.Long;
import java.util.ArrayList;

public class UserActivity_init_6882800538 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10147;
     Object term10150;

    public UserActivity_init_6882800538() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10147 = new LinkedList();
        Long term10159 = new Long(3133860696238261492L);
        ArrayList term10177 = new ArrayList();
        ((ArrayList) term10177).add((Object)null);
        ((ArrayList) term10177).add((Object)null);
        ArrayList term10180 = new ArrayList();
        ((ArrayList) term10180).add((Object)null);
        ((ArrayList) term10180).add((Object)null);
        ((ArrayList) term10180).add((Object)null);
        Object term10153 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserAct"));
        Object term10155 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term10157 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        setLongField(term10153, term10153.getClass(), "id", -4876190539375195221L);
        setLongField(term10155, term10155.getClass(), "id", -5262639910779325902L);
        setLongField(term10157, term10157.getClass(), "id", 6267421205498097015L);
        setField(term10157, term10157.getClass(), "extId", term10159);
        setField(term10157, term10157.getClass(), "luid", null);
        setField(term10157, term10157.getClass(), "registerTime", null);
        setField(term10157, term10157.getClass(), "accessTime", null);
        setField(term10155, term10155.getClass(), "card", term10157);
        setField(term10155, term10155.getClass(), "userName", "");
        setIntField(term10155, term10155.getClass(), "isNetMember", 612230460);
        setIntField(term10155, term10155.getClass(), "iconId", -87837417);
        setIntField(term10155, term10155.getClass(), "plateId", -1864680068);
        setIntField(term10155, term10155.getClass(), "titleId", 1979269463);
        setIntField(term10155, term10155.getClass(), "partnerId", -1690818607);
        setIntField(term10155, term10155.getClass(), "frameId", 252440319);
        setIntField(term10155, term10155.getClass(), "selectMapId", -1798089143);
        setIntField(term10155, term10155.getClass(), "totalAwake", -2056399026);
        setIntField(term10155, term10155.getClass(), "gradeRating", -150070327);
        setIntField(term10155, term10155.getClass(), "musicRating", -731659931);
        setIntField(term10155, term10155.getClass(), "playerRating", 645238162);
        setIntField(term10155, term10155.getClass(), "highestRating", -987757870);
        setIntField(term10155, term10155.getClass(), "gradeRank", 2132585005);
        setIntField(term10155, term10155.getClass(), "classRank", 451557051);
        setIntField(term10155, term10155.getClass(), "courseRank", 71783796);
        setField(term10155, term10155.getClass(), "charaSlot", term10177);
        setField(term10155, term10155.getClass(), "charaLockSlot", term10180);
        setLongField(term10155, term10155.getClass(), "contentBit", 2972970902155476483L);
        setIntField(term10155, term10155.getClass(), "playCount", 2085417929);
        setField(term10155, term10155.getClass(), "eventWatchedDate", "");
        setField(term10155, term10155.getClass(), "lastGameId", "");
        setField(term10155, term10155.getClass(), "lastRomVersion", "");
        setField(term10155, term10155.getClass(), "lastDataVersion", "");
        setField(term10155, term10155.getClass(), "lastLoginDate", "");
        setField(term10155, term10155.getClass(), "lastPlayDate", "");
        setIntField(term10155, term10155.getClass(), "lastPlayCredit", 644887242);
        setIntField(term10155, term10155.getClass(), "lastPlayMode", 1544325432);
        setIntField(term10155, term10155.getClass(), "lastPlaceId", 908157389);
        setField(term10155, term10155.getClass(), "lastPlaceName", "");
        setIntField(term10155, term10155.getClass(), "lastAllNetId", 691619263);
        setIntField(term10155, term10155.getClass(), "lastRegionId", 637841150);
        setField(term10155, term10155.getClass(), "lastRegionName", "");
        setField(term10155, term10155.getClass(), "lastClientId", "");
        setField(term10155, term10155.getClass(), "lastCountryCode", "");
        setIntField(term10155, term10155.getClass(), "lastSelectEMoney", 1599041316);
        setIntField(term10155, term10155.getClass(), "lastSelectTicket", 1478113587);
        setIntField(term10155, term10155.getClass(), "lastSelectCourse", 1580986308);
        setIntField(term10155, term10155.getClass(), "lastCountCourse", -870011438);
        setField(term10155, term10155.getClass(), "firstGameId", "");
        setField(term10155, term10155.getClass(), "firstRomVersion", "");
        setField(term10155, term10155.getClass(), "firstDataVersion", "");
        setField(term10155, term10155.getClass(), "firstPlayDate", "");
        setField(term10155, term10155.getClass(), "compatibleCmVersion", "");
        setField(term10155, term10155.getClass(), "dailyBonusDate", "");
        setField(term10155, term10155.getClass(), "dailyCourseBonusDate", "");
        setField(term10155, term10155.getClass(), "lastPairLoginDate", "");
        setField(term10155, term10155.getClass(), "lastTrialPlayDate", "");
        setIntField(term10155, term10155.getClass(), "playVsCount", -1767217325);
        setIntField(term10155, term10155.getClass(), "playSyncCount", -170630873);
        setIntField(term10155, term10155.getClass(), "winCount", -1246900588);
        setIntField(term10155, term10155.getClass(), "helpCount", 548633933);
        setIntField(term10155, term10155.getClass(), "comboCount", -1532179986);
        setLongField(term10155, term10155.getClass(), "totalDeluxscore", -6060448108932211661L);
        setLongField(term10155, term10155.getClass(), "totalBasicDeluxscore", -4280668709580845965L);
        setLongField(term10155, term10155.getClass(), "totalAdvancedDeluxscore", -8669140240741599474L);
        setLongField(term10155, term10155.getClass(), "totalExpertDeluxscore", -1131029419147589872L);
        setLongField(term10155, term10155.getClass(), "totalMasterDeluxscore", -5753794060274661933L);
        setLongField(term10155, term10155.getClass(), "totalReMasterDeluxscore", -631692052300282581L);
        setIntField(term10155, term10155.getClass(), "totalSync", 1644599689);
        setIntField(term10155, term10155.getClass(), "totalBasicSync", 1665477880);
        setIntField(term10155, term10155.getClass(), "totalAdvancedSync", 2044728583);
        setIntField(term10155, term10155.getClass(), "totalExpertSync", 64790905);
        setIntField(term10155, term10155.getClass(), "totalMasterSync", -1199056049);
        setIntField(term10155, term10155.getClass(), "totalReMasterSync", -1074336148);
        setLongField(term10155, term10155.getClass(), "totalAchievement", -2145666439433256886L);
        setLongField(term10155, term10155.getClass(), "totalBasicAchievement", 4364197754861747163L);
        setLongField(term10155, term10155.getClass(), "totalAdvancedAchievement", -2350743764086921250L);
        setLongField(term10155, term10155.getClass(), "totalExpertAchievement", 6024204865305504328L);
        setLongField(term10155, term10155.getClass(), "totalMasterAchievement", 2554027544370354047L);
        setLongField(term10155, term10155.getClass(), "totalReMasterAchievement", 365411533450462757L);
        setLongField(term10155, term10155.getClass(), "playerOldRating", -5876369379613954614L);
        setLongField(term10155, term10155.getClass(), "playerNewRating", 9069442033463962750L);
        setIntField(term10155, term10155.getClass(), "banState", -561801733);
        setLongField(term10155, term10155.getClass(), "dateTime", 3575561499505653094L);
        setField(term10153, term10153.getClass(), "user", term10155);
        setIntField(term10153, term10153.getClass(), "kind", 2134609936);
        setIntField(term10153, term10153.getClass(), "activityId", -409989519);
        setLongField(term10153, term10153.getClass(), "sortNumber", -4244720445894600013L);
        setIntField(term10153, term10153.getClass(), "param1", -1293074430);
        setIntField(term10153, term10153.getClass(), "param2", 608662433);
        setIntField(term10153, term10153.getClass(), "param3", -2015476493);
        setIntField(term10153, term10153.getClass(), "param4", 41528103);
        term10150 = new LinkedList();
        ((LinkedList) term10150).add(term10153);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.data.UserActivity");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.List");
        argTypes[1] = Class.forName("java.util.List");
        Object[] args = new Object[2];
        args[0] = term10147;
        args[1] = term10150;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


