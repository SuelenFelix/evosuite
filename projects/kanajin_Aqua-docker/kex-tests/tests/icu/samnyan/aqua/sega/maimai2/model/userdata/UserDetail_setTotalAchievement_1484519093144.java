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

public class UserDetail_setTotalAchievement_1484519093144 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term277580;
     Object term277939;

    public UserDetail_setTotalAchievement_1484519093144() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term277584 = new Long(8918129626022907229L);
        Integer term277647 = new Integer(1603677150);
        Integer term277649 = new Integer(-926340720);
        Integer term277651 = new Integer(-1134329349);
        ArrayList term277645 = new ArrayList();
        ((ArrayList) term277645).add(term277647);
        ((ArrayList) term277645).add(term277649);
        ((ArrayList) term277645).add(term277651);
        Integer term277657 = new Integer(-1590495256);
        Integer term277659 = new Integer(1804035317);
        Integer term277661 = new Integer(-1627336108);
        Integer term277663 = new Integer(-70819831);
        Integer term277665 = new Integer(1601014438);
        Integer term277667 = new Integer(-1549492777);
        Integer term277669 = new Integer(-1166523434);
        ArrayList term277655 = new ArrayList();
        ((ArrayList) term277655).add(term277657);
        ((ArrayList) term277655).add(term277659);
        ((ArrayList) term277655).add(term277661);
        ((ArrayList) term277655).add(term277663);
        ((ArrayList) term277655).add(term277665);
        ((ArrayList) term277655).add(term277667);
        ((ArrayList) term277655).add(term277669);
        term277580 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term277582 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term277598 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term277599 = newInstance(Class.forName("java.time.LocalDate"));
        Object term277603 = newInstance(Class.forName("java.time.LocalTime"));
        Object term277608 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term277609 = newInstance(Class.forName("java.time.LocalDate"));
        Object term277613 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term277580, term277580.getClass(), "id", -1100708545491237980L);
        setLongField(term277582, term277582.getClass(), "id", -5796854229815550042L);
        setField(term277582, term277582.getClass(), "extId", term277584);
        setField(term277582, term277582.getClass(), "luid", "DCUNPyCrFE");
        setIntField(term277599, term277599.getClass(), "year", 2014);
        setShortField(term277599, term277599.getClass(), "month", (short) 3);
        setShortField(term277599, term277599.getClass(), "day", (short) 8);
        setField(term277598, term277598.getClass(), "date", term277599);
        setByteField(term277603, term277603.getClass(), "hour", (byte) 7);
        setByteField(term277603, term277603.getClass(), "minute", (byte) 51);
        setByteField(term277603, term277603.getClass(), "second", (byte) 58);
        setIntField(term277603, term277603.getClass(), "nano", 266448887);
        setField(term277598, term277598.getClass(), "time", term277603);
        setField(term277582, term277582.getClass(), "registerTime", term277598);
        setIntField(term277609, term277609.getClass(), "year", 2019);
        setShortField(term277609, term277609.getClass(), "month", (short) 5);
        setShortField(term277609, term277609.getClass(), "day", (short) 15);
        setField(term277608, term277608.getClass(), "date", term277609);
        setByteField(term277613, term277613.getClass(), "hour", (byte) 15);
        setByteField(term277613, term277613.getClass(), "minute", (byte) 31);
        setByteField(term277613, term277613.getClass(), "second", (byte) 13);
        setIntField(term277613, term277613.getClass(), "nano", 99604460);
        setField(term277608, term277608.getClass(), "time", term277613);
        setField(term277582, term277582.getClass(), "accessTime", term277608);
        setField(term277580, term277580.getClass(), "card", term277582);
        setField(term277580, term277580.getClass(), "userName", "BxbGKzqjgJ");
        setIntField(term277580, term277580.getClass(), "isNetMember", 872536270);
        setIntField(term277580, term277580.getClass(), "iconId", 1426868992);
        setIntField(term277580, term277580.getClass(), "plateId", -1911436409);
        setIntField(term277580, term277580.getClass(), "titleId", -1246915365);
        setIntField(term277580, term277580.getClass(), "partnerId", -797491695);
        setIntField(term277580, term277580.getClass(), "frameId", -2030749607);
        setIntField(term277580, term277580.getClass(), "selectMapId", -1872053985);
        setIntField(term277580, term277580.getClass(), "totalAwake", -422300479);
        setIntField(term277580, term277580.getClass(), "gradeRating", -1821425052);
        setIntField(term277580, term277580.getClass(), "musicRating", 1258372185);
        setIntField(term277580, term277580.getClass(), "playerRating", -1942969820);
        setIntField(term277580, term277580.getClass(), "highestRating", 1799543885);
        setIntField(term277580, term277580.getClass(), "gradeRank", 1388414809);
        setIntField(term277580, term277580.getClass(), "classRank", -1198202437);
        setIntField(term277580, term277580.getClass(), "courseRank", -2093092193);
        setField(term277580, term277580.getClass(), "charaSlot", term277645);
        setField(term277580, term277580.getClass(), "charaLockSlot", term277655);
        setLongField(term277580, term277580.getClass(), "contentBit", 4926554705495381679L);
        setIntField(term277580, term277580.getClass(), "playCount", 477971691);
        setField(term277580, term277580.getClass(), "eventWatchedDate", "xcpoffFZBm");
        setField(term277580, term277580.getClass(), "lastGameId", "FNxQNaLXgf");
        setField(term277580, term277580.getClass(), "lastRomVersion", "FuNTofkcKF");
        setField(term277580, term277580.getClass(), "lastDataVersion", "JcGIJVAGEN");
        setField(term277580, term277580.getClass(), "lastLoginDate", "KqIlQkMfyL");
        setField(term277580, term277580.getClass(), "lastPlayDate", "wrLXJeWMsL");
        setIntField(term277580, term277580.getClass(), "lastPlayCredit", 1118974024);
        setIntField(term277580, term277580.getClass(), "lastPlayMode", 603774719);
        setIntField(term277580, term277580.getClass(), "lastPlaceId", -417848261);
        setField(term277580, term277580.getClass(), "lastPlaceName", "VhckgJdJBP");
        setIntField(term277580, term277580.getClass(), "lastAllNetId", -1825653861);
        setIntField(term277580, term277580.getClass(), "lastRegionId", 1158565526);
        setField(term277580, term277580.getClass(), "lastRegionName", "hYCtzoYTvH");
        setField(term277580, term277580.getClass(), "lastClientId", "kfRcItQbtN");
        setField(term277580, term277580.getClass(), "lastCountryCode", "fYaxUKcsVQ");
        setIntField(term277580, term277580.getClass(), "lastSelectEMoney", 494749529);
        setIntField(term277580, term277580.getClass(), "lastSelectTicket", -1856844247);
        setIntField(term277580, term277580.getClass(), "lastSelectCourse", 1204731141);
        setIntField(term277580, term277580.getClass(), "lastCountCourse", -303280582);
        setField(term277580, term277580.getClass(), "firstGameId", "eWZDcRfvlB");
        setField(term277580, term277580.getClass(), "firstRomVersion", "FcOqUdaewM");
        setField(term277580, term277580.getClass(), "firstDataVersion", "nCMWfNNKRI");
        setField(term277580, term277580.getClass(), "firstPlayDate", "RNOGCUJUXh");
        setField(term277580, term277580.getClass(), "compatibleCmVersion", "XmTFjIFbur");
        setField(term277580, term277580.getClass(), "dailyBonusDate", "dTboFubXEV");
        setField(term277580, term277580.getClass(), "dailyCourseBonusDate", "zWYdDhOIUq");
        setField(term277580, term277580.getClass(), "lastPairLoginDate", "kHZZLOQmnm");
        setField(term277580, term277580.getClass(), "lastTrialPlayDate", "oshqKCgvpB");
        setIntField(term277580, term277580.getClass(), "playVsCount", -630302996);
        setIntField(term277580, term277580.getClass(), "playSyncCount", -1137094845);
        setIntField(term277580, term277580.getClass(), "winCount", -219496753);
        setIntField(term277580, term277580.getClass(), "helpCount", 1063790205);
        setIntField(term277580, term277580.getClass(), "comboCount", 618483255);
        setLongField(term277580, term277580.getClass(), "totalDeluxscore", 8961294713333301772L);
        setLongField(term277580, term277580.getClass(), "totalBasicDeluxscore", -4132062030988489475L);
        setLongField(term277580, term277580.getClass(), "totalAdvancedDeluxscore", -5069322431711651879L);
        setLongField(term277580, term277580.getClass(), "totalExpertDeluxscore", -4583697686009431560L);
        setLongField(term277580, term277580.getClass(), "totalMasterDeluxscore", 8593326811264035526L);
        setLongField(term277580, term277580.getClass(), "totalReMasterDeluxscore", 1317540450335888553L);
        setIntField(term277580, term277580.getClass(), "totalSync", 1986426483);
        setIntField(term277580, term277580.getClass(), "totalBasicSync", -97338829);
        setIntField(term277580, term277580.getClass(), "totalAdvancedSync", 1961579264);
        setIntField(term277580, term277580.getClass(), "totalExpertSync", -1701113649);
        setIntField(term277580, term277580.getClass(), "totalMasterSync", 75746646);
        setIntField(term277580, term277580.getClass(), "totalReMasterSync", -215266357);
        setLongField(term277580, term277580.getClass(), "totalAchievement", 2930658351355459737L);
        setLongField(term277580, term277580.getClass(), "totalBasicAchievement", 7761366848640837538L);
        setLongField(term277580, term277580.getClass(), "totalAdvancedAchievement", 6652236389886836648L);
        setLongField(term277580, term277580.getClass(), "totalExpertAchievement", 965446130266626846L);
        setLongField(term277580, term277580.getClass(), "totalMasterAchievement", -1648406244982796389L);
        setLongField(term277580, term277580.getClass(), "totalReMasterAchievement", -6522452746686415514L);
        setLongField(term277580, term277580.getClass(), "playerOldRating", 7733757909983273588L);
        setLongField(term277580, term277580.getClass(), "playerNewRating", -6006034545470263947L);
        setIntField(term277580, term277580.getClass(), "banState", -519251709);
        setLongField(term277580, term277580.getClass(), "dateTime", 238657803570299348L);
        term277939 = new Long(-967011152107451426L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term277939;
        callMethod(klass, "setTotalAchievement", argTypes, term277580, args);
    }

};


