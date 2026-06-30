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

public class UserDetail_setTotalAchievement_1484519093145 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term277635;
     Object term277994;

    public UserDetail_setTotalAchievement_1484519093145() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term277639 = new Long(8918129626022907229L);
        Integer term277702 = new Integer(1603677150);
        Integer term277704 = new Integer(-926340720);
        Integer term277706 = new Integer(-1134329349);
        ArrayList term277700 = new ArrayList();
        ((ArrayList) term277700).add(term277702);
        ((ArrayList) term277700).add(term277704);
        ((ArrayList) term277700).add(term277706);
        Integer term277712 = new Integer(-1590495256);
        Integer term277714 = new Integer(1804035317);
        Integer term277716 = new Integer(-1627336108);
        Integer term277718 = new Integer(-70819831);
        Integer term277720 = new Integer(1601014438);
        Integer term277722 = new Integer(-1549492777);
        Integer term277724 = new Integer(-1166523434);
        ArrayList term277710 = new ArrayList();
        ((ArrayList) term277710).add(term277712);
        ((ArrayList) term277710).add(term277714);
        ((ArrayList) term277710).add(term277716);
        ((ArrayList) term277710).add(term277718);
        ((ArrayList) term277710).add(term277720);
        ((ArrayList) term277710).add(term277722);
        ((ArrayList) term277710).add(term277724);
        term277635 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term277637 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term277653 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term277654 = newInstance(Class.forName("java.time.LocalDate"));
        Object term277658 = newInstance(Class.forName("java.time.LocalTime"));
        Object term277663 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term277664 = newInstance(Class.forName("java.time.LocalDate"));
        Object term277668 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term277635, term277635.getClass(), "id", -1100708545491237980L);
        setLongField(term277637, term277637.getClass(), "id", -5796854229815550042L);
        setField(term277637, term277637.getClass(), "extId", term277639);
        setField(term277637, term277637.getClass(), "luid", "DCUNPyCrFE");
        setIntField(term277654, term277654.getClass(), "year", 2014);
        setShortField(term277654, term277654.getClass(), "month", (short) 3);
        setShortField(term277654, term277654.getClass(), "day", (short) 8);
        setField(term277653, term277653.getClass(), "date", term277654);
        setByteField(term277658, term277658.getClass(), "hour", (byte) 7);
        setByteField(term277658, term277658.getClass(), "minute", (byte) 51);
        setByteField(term277658, term277658.getClass(), "second", (byte) 58);
        setIntField(term277658, term277658.getClass(), "nano", 266448887);
        setField(term277653, term277653.getClass(), "time", term277658);
        setField(term277637, term277637.getClass(), "registerTime", term277653);
        setIntField(term277664, term277664.getClass(), "year", 2019);
        setShortField(term277664, term277664.getClass(), "month", (short) 5);
        setShortField(term277664, term277664.getClass(), "day", (short) 15);
        setField(term277663, term277663.getClass(), "date", term277664);
        setByteField(term277668, term277668.getClass(), "hour", (byte) 15);
        setByteField(term277668, term277668.getClass(), "minute", (byte) 31);
        setByteField(term277668, term277668.getClass(), "second", (byte) 13);
        setIntField(term277668, term277668.getClass(), "nano", 99604460);
        setField(term277663, term277663.getClass(), "time", term277668);
        setField(term277637, term277637.getClass(), "accessTime", term277663);
        setField(term277635, term277635.getClass(), "card", term277637);
        setField(term277635, term277635.getClass(), "userName", "BxbGKzqjgJ");
        setIntField(term277635, term277635.getClass(), "isNetMember", 872536270);
        setIntField(term277635, term277635.getClass(), "iconId", 1426868992);
        setIntField(term277635, term277635.getClass(), "plateId", -1911436409);
        setIntField(term277635, term277635.getClass(), "titleId", -1246915365);
        setIntField(term277635, term277635.getClass(), "partnerId", -797491695);
        setIntField(term277635, term277635.getClass(), "frameId", -2030749607);
        setIntField(term277635, term277635.getClass(), "selectMapId", -1872053985);
        setIntField(term277635, term277635.getClass(), "totalAwake", -422300479);
        setIntField(term277635, term277635.getClass(), "gradeRating", -1821425052);
        setIntField(term277635, term277635.getClass(), "musicRating", 1258372185);
        setIntField(term277635, term277635.getClass(), "playerRating", -1942969820);
        setIntField(term277635, term277635.getClass(), "highestRating", 1799543885);
        setIntField(term277635, term277635.getClass(), "gradeRank", 1388414809);
        setIntField(term277635, term277635.getClass(), "classRank", -1198202437);
        setIntField(term277635, term277635.getClass(), "courseRank", -2093092193);
        setField(term277635, term277635.getClass(), "charaSlot", term277700);
        setField(term277635, term277635.getClass(), "charaLockSlot", term277710);
        setLongField(term277635, term277635.getClass(), "contentBit", 4926554705495381679L);
        setIntField(term277635, term277635.getClass(), "playCount", 477971691);
        setField(term277635, term277635.getClass(), "eventWatchedDate", "xcpoffFZBm");
        setField(term277635, term277635.getClass(), "lastGameId", "FNxQNaLXgf");
        setField(term277635, term277635.getClass(), "lastRomVersion", "FuNTofkcKF");
        setField(term277635, term277635.getClass(), "lastDataVersion", "JcGIJVAGEN");
        setField(term277635, term277635.getClass(), "lastLoginDate", "KqIlQkMfyL");
        setField(term277635, term277635.getClass(), "lastPlayDate", "wrLXJeWMsL");
        setIntField(term277635, term277635.getClass(), "lastPlayCredit", 1118974024);
        setIntField(term277635, term277635.getClass(), "lastPlayMode", 603774719);
        setIntField(term277635, term277635.getClass(), "lastPlaceId", -417848261);
        setField(term277635, term277635.getClass(), "lastPlaceName", "VhckgJdJBP");
        setIntField(term277635, term277635.getClass(), "lastAllNetId", -1825653861);
        setIntField(term277635, term277635.getClass(), "lastRegionId", 1158565526);
        setField(term277635, term277635.getClass(), "lastRegionName", "hYCtzoYTvH");
        setField(term277635, term277635.getClass(), "lastClientId", "kfRcItQbtN");
        setField(term277635, term277635.getClass(), "lastCountryCode", "fYaxUKcsVQ");
        setIntField(term277635, term277635.getClass(), "lastSelectEMoney", 494749529);
        setIntField(term277635, term277635.getClass(), "lastSelectTicket", -1856844247);
        setIntField(term277635, term277635.getClass(), "lastSelectCourse", 1204731141);
        setIntField(term277635, term277635.getClass(), "lastCountCourse", -303280582);
        setField(term277635, term277635.getClass(), "firstGameId", "eWZDcRfvlB");
        setField(term277635, term277635.getClass(), "firstRomVersion", "FcOqUdaewM");
        setField(term277635, term277635.getClass(), "firstDataVersion", "nCMWfNNKRI");
        setField(term277635, term277635.getClass(), "firstPlayDate", "RNOGCUJUXh");
        setField(term277635, term277635.getClass(), "compatibleCmVersion", "XmTFjIFbur");
        setField(term277635, term277635.getClass(), "dailyBonusDate", "dTboFubXEV");
        setField(term277635, term277635.getClass(), "dailyCourseBonusDate", "zWYdDhOIUq");
        setField(term277635, term277635.getClass(), "lastPairLoginDate", "kHZZLOQmnm");
        setField(term277635, term277635.getClass(), "lastTrialPlayDate", "oshqKCgvpB");
        setIntField(term277635, term277635.getClass(), "playVsCount", -630302996);
        setIntField(term277635, term277635.getClass(), "playSyncCount", -1137094845);
        setIntField(term277635, term277635.getClass(), "winCount", -219496753);
        setIntField(term277635, term277635.getClass(), "helpCount", 1063790205);
        setIntField(term277635, term277635.getClass(), "comboCount", 618483255);
        setLongField(term277635, term277635.getClass(), "totalDeluxscore", 8961294713333301772L);
        setLongField(term277635, term277635.getClass(), "totalBasicDeluxscore", -4132062030988489475L);
        setLongField(term277635, term277635.getClass(), "totalAdvancedDeluxscore", -5069322431711651879L);
        setLongField(term277635, term277635.getClass(), "totalExpertDeluxscore", -4583697686009431560L);
        setLongField(term277635, term277635.getClass(), "totalMasterDeluxscore", 8593326811264035526L);
        setLongField(term277635, term277635.getClass(), "totalReMasterDeluxscore", 1317540450335888553L);
        setIntField(term277635, term277635.getClass(), "totalSync", 1986426483);
        setIntField(term277635, term277635.getClass(), "totalBasicSync", -97338829);
        setIntField(term277635, term277635.getClass(), "totalAdvancedSync", 1961579264);
        setIntField(term277635, term277635.getClass(), "totalExpertSync", -1701113649);
        setIntField(term277635, term277635.getClass(), "totalMasterSync", 75746646);
        setIntField(term277635, term277635.getClass(), "totalReMasterSync", -215266357);
        setLongField(term277635, term277635.getClass(), "totalAchievement", 2930658351355459737L);
        setLongField(term277635, term277635.getClass(), "totalBasicAchievement", 7761366848640837538L);
        setLongField(term277635, term277635.getClass(), "totalAdvancedAchievement", 6652236389886836648L);
        setLongField(term277635, term277635.getClass(), "totalExpertAchievement", 965446130266626846L);
        setLongField(term277635, term277635.getClass(), "totalMasterAchievement", -1648406244982796389L);
        setLongField(term277635, term277635.getClass(), "totalReMasterAchievement", -6522452746686415514L);
        setLongField(term277635, term277635.getClass(), "playerOldRating", 7733757909983273588L);
        setLongField(term277635, term277635.getClass(), "playerNewRating", -6006034545470263947L);
        setIntField(term277635, term277635.getClass(), "banState", -519251709);
        setLongField(term277635, term277635.getClass(), "dateTime", 238657803570299348L);
        term277994 = new Long(-967011152107451426L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term277994;
        callMethod(klass, "setTotalAchievement", argTypes, term277635, args);
    }

};


