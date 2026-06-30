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

public class UserCourse_setClearDate_12902370423 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term86570;

    public UserCourse_setClearDate_12902370423() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term86576 = new Long(7495904023107549024L);
        Integer term86639 = new Integer(-1671982964);
        Integer term86641 = new Integer(776218451);
        Integer term86643 = new Integer(-1362132929);
        Integer term86645 = new Integer(1267740164);
        ArrayList term86637 = new ArrayList();
        ((ArrayList) term86637).add(term86639);
        ((ArrayList) term86637).add(term86641);
        ((ArrayList) term86637).add(term86643);
        ((ArrayList) term86637).add(term86645);
        Integer term86651 = new Integer(1363887997);
        Integer term86653 = new Integer(-1744763945);
        ArrayList term86649 = new ArrayList();
        ((ArrayList) term86649).add(term86651);
        ((ArrayList) term86649).add(term86653);
        term86570 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserCourse"));
        Object term86572 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term86574 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term86590 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term86591 = newInstance(Class.forName("java.time.LocalDate"));
        Object term86595 = newInstance(Class.forName("java.time.LocalTime"));
        Object term86600 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term86601 = newInstance(Class.forName("java.time.LocalDate"));
        Object term86605 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term86570, term86570.getClass(), "id", 3804733307680394319L);
        setLongField(term86572, term86572.getClass(), "id", -5476696661208638394L);
        setLongField(term86574, term86574.getClass(), "id", -2060623851955948674L);
        setField(term86574, term86574.getClass(), "extId", term86576);
        setField(term86574, term86574.getClass(), "luid", "EMhKuKuvTr");
        setIntField(term86591, term86591.getClass(), "year", 2020);
        setShortField(term86591, term86591.getClass(), "month", (short) 5);
        setShortField(term86591, term86591.getClass(), "day", (short) 31);
        setField(term86590, term86590.getClass(), "date", term86591);
        setByteField(term86595, term86595.getClass(), "hour", (byte) 17);
        setByteField(term86595, term86595.getClass(), "minute", (byte) 5);
        setByteField(term86595, term86595.getClass(), "second", (byte) 38);
        setIntField(term86595, term86595.getClass(), "nano", 709012300);
        setField(term86590, term86590.getClass(), "time", term86595);
        setField(term86574, term86574.getClass(), "registerTime", term86590);
        setIntField(term86601, term86601.getClass(), "year", 2021);
        setShortField(term86601, term86601.getClass(), "month", (short) 7);
        setShortField(term86601, term86601.getClass(), "day", (short) 6);
        setField(term86600, term86600.getClass(), "date", term86601);
        setByteField(term86605, term86605.getClass(), "hour", (byte) 12);
        setByteField(term86605, term86605.getClass(), "minute", (byte) 46);
        setByteField(term86605, term86605.getClass(), "second", (byte) 42);
        setIntField(term86605, term86605.getClass(), "nano", 512890850);
        setField(term86600, term86600.getClass(), "time", term86605);
        setField(term86574, term86574.getClass(), "accessTime", term86600);
        setField(term86572, term86572.getClass(), "card", term86574);
        setField(term86572, term86572.getClass(), "userName", "hjuOnNVIUc");
        setIntField(term86572, term86572.getClass(), "isNetMember", 1762652682);
        setIntField(term86572, term86572.getClass(), "iconId", 1760408647);
        setIntField(term86572, term86572.getClass(), "plateId", -1334125536);
        setIntField(term86572, term86572.getClass(), "titleId", -385542140);
        setIntField(term86572, term86572.getClass(), "partnerId", -1652323059);
        setIntField(term86572, term86572.getClass(), "frameId", -1928764789);
        setIntField(term86572, term86572.getClass(), "selectMapId", -673697686);
        setIntField(term86572, term86572.getClass(), "totalAwake", -757914190);
        setIntField(term86572, term86572.getClass(), "gradeRating", 991323397);
        setIntField(term86572, term86572.getClass(), "musicRating", -791114332);
        setIntField(term86572, term86572.getClass(), "playerRating", 350325506);
        setIntField(term86572, term86572.getClass(), "highestRating", -283849179);
        setIntField(term86572, term86572.getClass(), "gradeRank", -966646503);
        setIntField(term86572, term86572.getClass(), "classRank", 529842485);
        setIntField(term86572, term86572.getClass(), "courseRank", -713215300);
        setField(term86572, term86572.getClass(), "charaSlot", term86637);
        setField(term86572, term86572.getClass(), "charaLockSlot", term86649);
        setLongField(term86572, term86572.getClass(), "contentBit", -330187935331339969L);
        setIntField(term86572, term86572.getClass(), "playCount", -82690767);
        setField(term86572, term86572.getClass(), "eventWatchedDate", "MTxeYrMCEJ");
        setField(term86572, term86572.getClass(), "lastGameId", "SbPIlRKXLL");
        setField(term86572, term86572.getClass(), "lastRomVersion", "TGjqGBrVob");
        setField(term86572, term86572.getClass(), "lastDataVersion", "oOHlrJrFIp");
        setField(term86572, term86572.getClass(), "lastLoginDate", "vqZvnioIVM");
        setField(term86572, term86572.getClass(), "lastPlayDate", "CXNFlzEpBC");
        setIntField(term86572, term86572.getClass(), "lastPlayCredit", 1511625253);
        setIntField(term86572, term86572.getClass(), "lastPlayMode", 2133047515);
        setIntField(term86572, term86572.getClass(), "lastPlaceId", 1448469662);
        setField(term86572, term86572.getClass(), "lastPlaceName", "qnsCYAsHRu");
        setIntField(term86572, term86572.getClass(), "lastAllNetId", -391447045);
        setIntField(term86572, term86572.getClass(), "lastRegionId", -396759931);
        setField(term86572, term86572.getClass(), "lastRegionName", "qMoCYznUOe");
        setField(term86572, term86572.getClass(), "lastClientId", "fjOTVskUVh");
        setField(term86572, term86572.getClass(), "lastCountryCode", "OhiftESVwX");
        setIntField(term86572, term86572.getClass(), "lastSelectEMoney", 85098350);
        setIntField(term86572, term86572.getClass(), "lastSelectTicket", 1519270868);
        setIntField(term86572, term86572.getClass(), "lastSelectCourse", -1307675168);
        setIntField(term86572, term86572.getClass(), "lastCountCourse", 550509363);
        setField(term86572, term86572.getClass(), "firstGameId", "UkppLrLyZM");
        setField(term86572, term86572.getClass(), "firstRomVersion", "MxFKwAHuar");
        setField(term86572, term86572.getClass(), "firstDataVersion", "DhSWasYJlP");
        setField(term86572, term86572.getClass(), "firstPlayDate", "JOSsHVpnAd");
        setField(term86572, term86572.getClass(), "compatibleCmVersion", "PbEsDEkNLx");
        setField(term86572, term86572.getClass(), "dailyBonusDate", "pWmmwQMysX");
        setField(term86572, term86572.getClass(), "dailyCourseBonusDate", "BuJzsOARZG");
        setField(term86572, term86572.getClass(), "lastPairLoginDate", "lIqJQDMmVL");
        setField(term86572, term86572.getClass(), "lastTrialPlayDate", "cXTrsrxYFN");
        setIntField(term86572, term86572.getClass(), "playVsCount", 1200406150);
        setIntField(term86572, term86572.getClass(), "playSyncCount", 1009657063);
        setIntField(term86572, term86572.getClass(), "winCount", -104420972);
        setIntField(term86572, term86572.getClass(), "helpCount", 933032980);
        setIntField(term86572, term86572.getClass(), "comboCount", -1426390464);
        setLongField(term86572, term86572.getClass(), "totalDeluxscore", 7423170877012730750L);
        setLongField(term86572, term86572.getClass(), "totalBasicDeluxscore", 7803973570843908106L);
        setLongField(term86572, term86572.getClass(), "totalAdvancedDeluxscore", -8551144578264531851L);
        setLongField(term86572, term86572.getClass(), "totalExpertDeluxscore", -6175399542762744541L);
        setLongField(term86572, term86572.getClass(), "totalMasterDeluxscore", 29485421867077167L);
        setLongField(term86572, term86572.getClass(), "totalReMasterDeluxscore", -7381251249931678452L);
        setIntField(term86572, term86572.getClass(), "totalSync", -1709715410);
        setIntField(term86572, term86572.getClass(), "totalBasicSync", 1221046414);
        setIntField(term86572, term86572.getClass(), "totalAdvancedSync", 1271215502);
        setIntField(term86572, term86572.getClass(), "totalExpertSync", 106624322);
        setIntField(term86572, term86572.getClass(), "totalMasterSync", 1664407428);
        setIntField(term86572, term86572.getClass(), "totalReMasterSync", 980974243);
        setLongField(term86572, term86572.getClass(), "totalAchievement", 775304117546862589L);
        setLongField(term86572, term86572.getClass(), "totalBasicAchievement", -4520444483838062371L);
        setLongField(term86572, term86572.getClass(), "totalAdvancedAchievement", -8893605933191232807L);
        setLongField(term86572, term86572.getClass(), "totalExpertAchievement", -3893597296102674689L);
        setLongField(term86572, term86572.getClass(), "totalMasterAchievement", 1968564047271987662L);
        setLongField(term86572, term86572.getClass(), "totalReMasterAchievement", 3358595188795083828L);
        setLongField(term86572, term86572.getClass(), "playerOldRating", -2657370804250344298L);
        setLongField(term86572, term86572.getClass(), "playerNewRating", 7829010818183645401L);
        setIntField(term86572, term86572.getClass(), "banState", 1940850013);
        setLongField(term86572, term86572.getClass(), "dateTime", 1440127173650606212L);
        setField(term86570, term86570.getClass(), "user", term86572);
        setIntField(term86570, term86570.getClass(), "courseId", 2014370043);
        setBooleanField(term86570, term86570.getClass(), "isLastClear", false);
        setIntField(term86570, term86570.getClass(), "totalRestlife", 2086898490);
        setIntField(term86570, term86570.getClass(), "totalAchievement", -556807183);
        setIntField(term86570, term86570.getClass(), "totalDeluxscore", 2079852711);
        setIntField(term86570, term86570.getClass(), "playCount", -1960722897);
        setField(term86570, term86570.getClass(), "clearDate", "pEUndHGBiE");
        setField(term86570, term86570.getClass(), "lastPlayDate", "PCzKLiLqoO");
        setIntField(term86570, term86570.getClass(), "bestAchievement", 2058852943);
        setField(term86570, term86570.getClass(), "bestAchievementDate", "JuYhKUgElF");
        setIntField(term86570, term86570.getClass(), "bestDeluxscore", 1189778174);
        setField(term86570, term86570.getClass(), "bestDeluxscoreDate", "NInWPlYtwe");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserCourse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "qVYRtrgZJt";
        callMethod(klass, "setClearDate", argTypes, term86570, args);
    }

};


